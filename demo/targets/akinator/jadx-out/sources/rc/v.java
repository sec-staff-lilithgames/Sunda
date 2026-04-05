package rc;

import java.io.Serializable;
import java.lang.annotation.Annotation;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class v implements dd.b, Serializable {

    /* renamed from: b, reason: collision with root package name */
    public final Class f84281b;

    /* renamed from: c, reason: collision with root package name */
    public final Annotation f84282c;

    public v(Class<?> cls, Annotation annotation) {
        this.f84281b = cls;
        this.f84282c = annotation;
    }

    @Override // dd.b
    public <A extends Annotation> A get(Class<A> cls) {
        if (this.f84281b == cls) {
            return (A) this.f84282c;
        }
        return null;
    }

    @Override // dd.b
    public boolean has(Class<?> cls) {
        return this.f84281b == cls;
    }

    @Override // dd.b
    public boolean hasOneOf(Class<? extends Annotation>[] clsArr) {
        for (Class<? extends Annotation> cls : clsArr) {
            if (cls == this.f84281b) {
                return true;
            }
        }
        return false;
    }

    @Override // dd.b
    public int size() {
        return 1;
    }
}
