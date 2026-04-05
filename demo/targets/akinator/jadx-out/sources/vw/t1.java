package vw;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public class t1 implements i0 {

    /* renamed from: a, reason: collision with root package name */
    public final ax.b f90096a = new ax.b();

    /* renamed from: b, reason: collision with root package name */
    public final Annotation[] f90097b;

    /* renamed from: c, reason: collision with root package name */
    public final Annotation f90098c;

    /* renamed from: d, reason: collision with root package name */
    public final Field f90099d;

    /* renamed from: e, reason: collision with root package name */
    public final String f90100e;

    /* renamed from: f, reason: collision with root package name */
    public final int f90101f;

    public t1(Field field, Annotation annotation, Annotation[] annotationArr) {
        this.f90101f = field.getModifiers();
        this.f90100e = field.getName();
        this.f90098c = annotation;
        this.f90099d = field;
        this.f90097b = annotationArr;
    }

    @Override // vw.i0
    public Object get(Object obj) throws Exception {
        return this.f90099d.get(obj);
    }

    @Override // vw.i0
    public Annotation getAnnotation() {
        return this.f90098c;
    }

    @Override // vw.i0
    public Class getDeclaringClass() {
        return this.f90099d.getDeclaringClass();
    }

    @Override // vw.i0
    public Class getDependent() {
        return b4.getDependent(this.f90099d);
    }

    @Override // vw.i0
    public Class[] getDependents() {
        return b4.getDependents(this.f90099d);
    }

    @Override // vw.i0
    public String getName() {
        return this.f90100e;
    }

    @Override // vw.i0, xw.f
    public Class getType() {
        return this.f90099d.getType();
    }

    public boolean isFinal() {
        return Modifier.isFinal(this.f90101f);
    }

    @Override // vw.i0
    public boolean isReadOnly() {
        return !isStatic() && isFinal();
    }

    public boolean isStatic() {
        return Modifier.isStatic(this.f90101f);
    }

    @Override // vw.i0
    public void set(Object obj, Object obj2) throws Exception {
        if (isFinal()) {
            return;
        }
        this.f90099d.set(obj, obj2);
    }

    @Override // vw.i0, xw.f
    public String toString() {
        return a.b.m("field '", getName(), "' ", this.f90099d.toString());
    }

    @Override // vw.i0, xw.f
    public <T extends Annotation> T getAnnotation(Class<T> cls) {
        T t10 = (T) this.f90098c;
        if (cls == t10.annotationType()) {
            return t10;
        }
        ax.b bVar = this.f90096a;
        if (bVar.isEmpty()) {
            for (Annotation annotation : this.f90097b) {
                bVar.cache(annotation.annotationType(), annotation);
            }
        }
        return (T) bVar.fetch(cls);
    }
}
