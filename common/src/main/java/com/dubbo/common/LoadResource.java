package com.dubbo.common;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.annotation.AliasFor;

import java.lang.annotation.*;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@SpringBootApplication
@ImportResource
@PropertySource("")
public @interface LoadResource {
    @AliasFor(
            annotation = SpringBootApplication.class,
            attribute = "scanBasePackages"
    )
    String[] scanBasePackages() default {};

    @AliasFor(
            annotation = ImportResource.class,
            attribute = "locations"
    )
    String[] resourceLocations() default {};

    @AliasFor(
            annotation = PropertySource.class,
            attribute = "value"
    )
    String[] propertyValue() default {"none"};

    @AliasFor(
            annotation = PropertySource.class,
            attribute = "ignoreResourceNotFound"
    )
    boolean ignoreResourceNotFound() default true;
}
