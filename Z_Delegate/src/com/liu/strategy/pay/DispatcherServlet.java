package com.liu.strategy.pay;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.liu.delegate.mvc.MemberController;

/**
 * �൱������Ŀ����Ľ�ɫ
 */
public class DispatcherServlet extends HttpServlet {
	private List<Handler> handlerMapping = new ArrayList<Handler>();

	public void init() throws ServletException { 
		try {
			Class<?> memberControllerClass = MemberController.class;
			handlerMapping.add(new Handler().setController(memberControllerClass.newInstance())
					.setMethod(memberControllerClass.getMethod("getMemberById", new Class[] { String.class }))
					.setUrl("/web/getMemberById.json"));
		} catch (Exception e) {
		}
	}

	private void doDispatch(HttpServletRequest request, HttpServletResponse response) {
//1����ȡ�û������ url
// ������� J2EE �ı�׼��ÿ�� url �Զ�Ӧһ�� Serlvet��url �����������
		String uri = request.getRequestURI();
//2��Servlet �õ� url �Ժ�Ҫ��Ȩ�⣨Ҫ���жϣ�Ҫ��ѡ��
// �����û������ URL��ȥ�ҵ���� url ��Ӧ��ĳһ�� java ��ķ���
//3��ͨ���õ��� URL ȥ handlerMapping�����ǰ�����Ϊ�ǲ��Գ�����
		Handler handle = null;
		for (Handler h : handlerMapping) {
			if (uri.equals(h.getUrl())) {
				handle = h;
				break;
			}
		}
//4�������������ַ��� Method��ͨ������ȥ�������Ӧ�ķ�����
		Object object = null;
		try {
			object = handle.getMethod().invoke(handle.getController(), request.getParameter("mid"));
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
//5����ȡ�� Method ִ�еĽ����ͨ�� Response ���س�ȥ
// response.getWriter().write();
	}

	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			doDispatch(req, resp);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	class Handler {
		private Object controller;
		private Method method;
		private String url;

		public Object getController() {
			return controller;
		}

		public Handler setController(Object controller) {
			this.controller = controller;
			return this;
		}

		public Method getMethod() {
			return method;
		}

		public Handler setMethod(Method method) {
			this.method = method;
			return this;
		}

		public String getUrl() {
			return url;
		}

		public Handler setUrl(String url) {
			this.url = url;
			return this;
		}
	}
}