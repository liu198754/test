
import java.lang.annotation.*;

@Target({ElementType.TYPE,ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface yyyt {

	

   public YtsType classType() default YtsType.util;
}
enum YtsType{util,entity,service,model};
