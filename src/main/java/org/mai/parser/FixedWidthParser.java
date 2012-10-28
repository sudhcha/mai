package org.mai.parser;

import java.lang.annotation.Annotation;

import org.mai.type.FixedWidthEntity;

public class FixedWidthParser<T> {

	public T parse(Class<T> clazz, String lineToParse) throws InstantiationException, IllegalAccessException {
		if (isValidClassType(clazz)) {
			T returnInstance = clazz.newInstance();
			return returnInstance;
		}

		return null;
	}

	private boolean isValidClassType(Class<T> clazz) {
		Annotation[] classAnnotations = clazz.getAnnotations();

		for (Annotation annotation : classAnnotations) {
			if (annotation instanceof FixedWidthEntity) {
				return true;
			}
		}

		return false;
	}

}
