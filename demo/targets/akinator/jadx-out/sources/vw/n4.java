package vw;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public class n4 implements s2 {

    /* renamed from: a, reason: collision with root package name */
    public final ax.b f90024a = new ax.b();

    /* renamed from: b, reason: collision with root package name */
    public final Annotation[] f90025b;

    /* renamed from: c, reason: collision with root package name */
    public final Annotation f90026c;

    /* renamed from: d, reason: collision with root package name */
    public final w2 f90027d;

    /* renamed from: e, reason: collision with root package name */
    public final Method f90028e;

    /* renamed from: f, reason: collision with root package name */
    public final String f90029f;

    public n4(r2 r2Var, Annotation annotation, Annotation[] annotationArr) {
        this.f90028e = r2Var.getMethod();
        this.f90029f = r2Var.getName();
        this.f90027d = r2Var.getType();
        this.f90026c = annotation;
        this.f90025b = annotationArr;
    }

    @Override // vw.s2
    public Annotation getAnnotation() {
        return this.f90026c;
    }

    @Override // vw.s2
    public Class getDeclaringClass() {
        return this.f90028e.getDeclaringClass();
    }

    @Override // vw.s2
    public Class getDependent() {
        return b4.getParameterDependent(this.f90028e, 0);
    }

    @Override // vw.s2
    public Class[] getDependents() {
        return b4.getParameterDependents(this.f90028e, 0);
    }

    @Override // vw.s2
    public Method getMethod() throws SecurityException {
        Method method = this.f90028e;
        if (!method.isAccessible()) {
            method.setAccessible(true);
        }
        return method;
    }

    @Override // vw.s2
    public w2 getMethodType() {
        return this.f90027d;
    }

    @Override // vw.s2
    public String getName() {
        return this.f90029f;
    }

    @Override // vw.s2
    public Class getType() {
        return this.f90028e.getParameterTypes()[0];
    }

    @Override // vw.s2
    public String toString() {
        return this.f90028e.toGenericString();
    }

    @Override // vw.s2
    public <T extends Annotation> T getAnnotation(Class<T> cls) {
        ax.b bVar = this.f90024a;
        if (bVar.isEmpty()) {
            for (Annotation annotation : this.f90025b) {
                bVar.cache(annotation.annotationType(), annotation);
            }
        }
        return (T) bVar.fetch(cls);
    }
}
