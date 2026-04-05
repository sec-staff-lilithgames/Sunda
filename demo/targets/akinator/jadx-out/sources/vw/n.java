package vw;

import java.lang.annotation.Annotation;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public class n implements xw.f {

    /* renamed from: a, reason: collision with root package name */
    public final Class f89996a;

    public n(Class cls) {
        this.f89996a = cls;
    }

    @Override // xw.f
    public <T extends Annotation> T getAnnotation(Class<T> cls) {
        return null;
    }

    @Override // xw.f
    public Class getType() {
        return this.f89996a;
    }

    @Override // xw.f
    public String toString() {
        return this.f89996a.toString();
    }
}
