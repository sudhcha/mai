package org.mai.parser;

import java.lang.annotation.Annotation;

import org.mai.type.FixedWidthEntity;

public class FixedWidthParser<T> {

	public T parse(Class<T> clazz, String lineToParse) {
		if (isValidClassType(clazz)) {
			T returnInstance;
			try {
				returnInstance = clazz.newInstance();
			} catch (Exception e) {
				throw new RuntimeException(e);
			}
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
