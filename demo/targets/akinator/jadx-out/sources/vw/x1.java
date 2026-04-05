package vw;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public class x1 implements s2 {

    /* renamed from: a, reason: collision with root package name */
    public final ax.b f90215a = new ax.b();

    /* renamed from: b, reason: collision with root package name */
    public final Annotation[] f90216b;

    /* renamed from: c, reason: collision with root package name */
    public final Annotation f90217c;

    /* renamed from: d, reason: collision with root package name */
    public final w2 f90218d;

    /* renamed from: e, reason: collision with root package name */
    public final Method f90219e;

    /* renamed from: f, reason: collision with root package name */
    public final String f90220f;

    public x1(r2 r2Var, Annotation annotation, Annotation[] annotationArr) {
        this.f90219e = r2Var.getMethod();
        this.f90220f = r2Var.getName();
        this.f90218d = r2Var.getType();
        this.f90217c = annotation;
        this.f90216b = annotationArr;
    }

    @Override // vw.s2
    public Annotation getAnnotation() {
        return this.f90217c;
    }

    @Override // vw.s2
    public Class getDeclaringClass() {
        return this.f90219e.getDeclaringClass();
    }

    @Override // vw.s2
    public Class getDependent() {
        return b4.getReturnDependent(this.f90219e);
    }

    @Override // vw.s2
    public Class[] getDependents() {
        return b4.getReturnDependents(this.f90219e);
    }

    @Override // vw.s2
    public Method getMethod() throws SecurityException {
        Method method = this.f90219e;
        if (!method.isAccessible()) {
            method.setAccessible(true);
        }
        return method;
    }

    @Override // vw.s2
    public w2 getMethodType() {
        return this.f90218d;
    }

    @Override // vw.s2
    public String getName() {
        return this.f90220f;
    }

    @Override // vw.s2
    public Class getType() {
        return this.f90219e.getReturnType();
    }

    @Override // vw.s2
    public String toString() {
        return this.f90219e.toGenericString();
    }

    @Override // vw.s2
    public <T extends Annotation> T getAnnotation(Class<T> cls) {
        ax.b bVar = this.f90215a;
        if (bVar.isEmpty()) {
            for (Annotation annotation : this.f90216b) {
                bVar.cache(annotation.annotationType(), annotation);
            }
        }
        return (T) bVar.fetch(cls);
    }
}
