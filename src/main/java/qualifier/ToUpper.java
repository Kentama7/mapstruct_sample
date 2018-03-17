package qualifier;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.CLASS;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import org.mapstruct.Qualifier;

@Qualifier
@Retention(CLASS)
@Target(METHOD)
public @interface ToUpper {
}
