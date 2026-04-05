package vw;

import java.lang.annotation.Annotation;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public class g3 implements xw.f {

    /* renamed from: a, reason: collision with root package name */
    public final Class f89836a;

    /* renamed from: b, reason: collision with root package name */
    public final xw.f f89837b;

    public g3(xw.f fVar, Class cls) {
        this.f89836a = cls;
        this.f89837b = fVar;
    }

    @Override // xw.f
    public <T extends Annotation> T getAnnotation(Class<T> cls) {
        return (T) this.f89837b.getAnnotation(cls);
    }

    @Override // xw.f
    public Class getType() {
        return this.f89836a;
    }

    @Override // xw.f
    public String toString() {
        return this.f89837b.toString();
    }
}
