package vw;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public class p2 {

    /* renamed from: a, reason: collision with root package name */
    public final Annotation[] f90044a;

    /* renamed from: b, reason: collision with root package name */
    public final Method f90045b;

    /* renamed from: c, reason: collision with root package name */
    public final String f90046c;

    public p2(Method method) {
        this.f90044a = method.getDeclaredAnnotations();
        this.f90046c = method.getName();
        this.f90045b = method;
    }

    public Annotation[] getAnnotations() {
        return this.f90044a;
    }

    public Method getMethod() {
        return this.f90045b;
    }

    public String getName() {
        return this.f90046c;
    }
}
