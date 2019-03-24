package com.liu.factory.abstractfactory;

public class JavaCourseFactory implements ICourseFactory{

	@Override
	public IVideo createVideo() {
		
		return new JavaVideo();
	}

	@Override
	public INote createNote() {
		
		return new JavaNote();
	}

}
