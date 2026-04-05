package vw;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public abstract class j3 implements i0 {

    /* renamed from: a, reason: collision with root package name */
    public final Annotation[] f89929a;

    /* renamed from: b, reason: collision with root package name */
    public final Constructor f89930b;

    /* renamed from: c, reason: collision with root package name */
    public final Class f89931c;

    /* renamed from: d, reason: collision with root package name */
    public final int f89932d;

    /* renamed from: e, reason: collision with root package name */
    public final Annotation f89933e;

    public j3(Annotation annotation, Constructor constructor, int i10) {
        this.f89929a = constructor.getParameterAnnotations()[i10];
        this.f89931c = constructor.getDeclaringClass();
        this.f89930b = constructor;
        this.f89932d = i10;
        this.f89933e = annotation;
    }

    @Override // vw.i0
    public Object get(Object obj) {
        return null;
    }

    @Override // vw.i0
    public Annotation getAnnotation() {
        return this.f89933e;
    }

    @Override // vw.i0
    public Class getDeclaringClass() {
        return this.f89931c;
    }

    @Override // vw.i0
    public Class getDependent() {
        return b4.getParameterDependent(this.f89930b, this.f89932d);
    }

    @Override // vw.i0
    public Class[] getDependents() {
        return b4.getParameterDependents(this.f89930b, this.f89932d);
    }

    @Override // vw.i0
    public abstract String getName();

    @Override // vw.i0, xw.f
    public Class getType() {
        return this.f89930b.getParameterTypes()[this.f89932d];
    }

    @Override // vw.i0
    public boolean isReadOnly() {
        return false;
    }

    @Override // vw.i0, xw.f
    public String toString() {
        return "parameter " + this.f89932d + " of constructor " + this.f89930b;
    }

    @Override // vw.i0, xw.f
    public <A extends Annotation> A getAnnotation(Class<A> cls) {
        for (Annotation annotation : this.f89929a) {
            A a10 = (A) annotation;
            if (a10.annotationType().equals(cls)) {
                return a10;
            }
        }
        return null;
    }

    @Override // vw.i0
    public void set(Object obj, Object obj2) {
    }
}
