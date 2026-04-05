package bi;

import java.lang.annotation.Annotation;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class b0 {

    /* renamed from: a, reason: collision with root package name */
    public final Class f9542a;

    /* renamed from: b, reason: collision with root package name */
    public final Class f9543b;

    public b0(Class<? extends Annotation> cls, Class<Object> cls2) {
        this.f9542a = cls;
        this.f9543b = cls2;
    }

    public static <T> b0 qualified(Class<? extends Annotation> cls, Class<T> cls2) {
        return new b0(cls, cls2);
    }

    public static <T> b0 unqualified(Class<T> cls) {
        return new b0(a0.class, cls);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b0.class != obj.getClass()) {
            return false;
        }
        b0 b0Var = (b0) obj;
        if (this.f9543b.equals(b0Var.f9543b)) {
            return this.f9542a.equals(b0Var.f9542a);
        }
        return false;
    }

    public int hashCode() {
        return this.f9542a.hashCode() + (this.f9543b.hashCode() * 31);
    }

    public String toString() {
        Class cls = this.f9543b;
        Class cls2 = this.f9542a;
        if (cls2 == a0.class) {
            return cls.getName();
        }
        return "@" + cls2.getName() + " " + cls.getName();
    }
}
