package ict.example.annotation;


import com.google.auto.service.AutoService;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.CLASS)
public @interface FieldNames {

    String postfix() default "Fields";

}
