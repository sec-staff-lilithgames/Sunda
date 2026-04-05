package vw;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public class u1 {

    /* renamed from: a, reason: collision with root package name */
    public final Annotation[] f90128a;

    /* renamed from: b, reason: collision with root package name */
    public final Field f90129b;

    /* renamed from: c, reason: collision with root package name */
    public final String f90130c;

    public u1(Field field) {
        this.f90128a = field.getDeclaredAnnotations();
        this.f90130c = field.getName();
        this.f90129b = field;
    }

    public Annotation[] getAnnotations() {
        return this.f90128a;
    }

    public Field getField() {
        return this.f90129b;
    }

    public String getName() {
        return this.f90130c;
    }
}
