package tb;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@Retention(RetentionPolicy.RUNTIME)
/* loaded from: classes5.dex */
public @interface j {
    i creatorVisibility() default i.f86730g;

    i fieldVisibility() default i.f86730g;

    i getterVisibility() default i.f86730g;

    i isGetterVisibility() default i.f86730g;

    i scalarConstructorVisibility() default i.f86730g;

    i setterVisibility() default i.f86730g;
}
