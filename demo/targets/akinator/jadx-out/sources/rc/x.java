package rc;

import java.io.Serializable;
import java.lang.annotation.Annotation;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class x implements dd.b, Serializable {

    /* renamed from: b, reason: collision with root package name */
    public final Class f84287b;

    /* renamed from: c, reason: collision with root package name */
    public final Class f84288c;

    /* renamed from: e, reason: collision with root package name */
    public final Annotation f84289e;

    /* renamed from: f, reason: collision with root package name */
    public final Annotation f84290f;

    public x(Class<?> cls, Annotation annotation, Class<?> cls2, Annotation annotation2) {
        this.f84287b = cls;
        this.f84289e = annotation;
        this.f84288c = cls2;
        this.f84290f = annotation2;
    }

    @Override // dd.b
    public <A extends Annotation> A get(Class<A> cls) {
        if (this.f84287b == cls) {
            return (A) this.f84289e;
        }
        if (this.f84288c == cls) {
            return (A) this.f84290f;
        }
        return null;
    }

    @Override // dd.b
    public boolean has(Class<?> cls) {
        return this.f84287b == cls || this.f84288c == cls;
    }

    @Override // dd.b
    public boolean hasOneOf(Class<? extends Annotation>[] clsArr) {
        for (Class<? extends Annotation> cls : clsArr) {
            if (cls == this.f84287b || cls == this.f84288c) {
                return true;
            }
        }
        return false;
    }

    @Override // dd.b
    public int size() {
        return 2;
    }
}
