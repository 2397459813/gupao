package com.liu.factory.abstractfactory;

public class PythonCourseFactory implements ICourseFactory{

	@Override
	public IVideo createVideo() {
		
		return new PythonVideo();
	}

	@Override
	public INote createNote() {
		
		return new PythonNote();
	}

}
