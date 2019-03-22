package com.liu.delegate.simple;

import java.util.HashMap;
import java.util.Map;

public class Leader implements IEmployee {
	private Map<String, IEmployee> targets = new HashMap<String, IEmployee>();

	public Leader() {
		targets.put("����", new EmployeeA());
		targets.put("��¼", new EmployeeB());
	}

//��Ŀ�����Լ����ɻ�
	public void doing(String command) {
		targets.get(command).doing(command);
	}
}
