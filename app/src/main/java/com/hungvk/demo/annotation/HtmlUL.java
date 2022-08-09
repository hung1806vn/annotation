package com.hungvk.demo.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)

@Target(value = { ElementType.TYPE })

public @interface HtmlUL {
	public String border() default "border:1px solid blue;";
}
