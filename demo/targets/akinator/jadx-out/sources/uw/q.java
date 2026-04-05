package uw;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@Retention(RetentionPolicy.RUNTIME)
/* loaded from: classes10.dex */
public @interface q {
    boolean data() default false;

    String empty() default "";

    boolean required() default true;
}
