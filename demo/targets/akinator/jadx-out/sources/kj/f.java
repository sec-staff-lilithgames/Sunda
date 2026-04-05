package kj;

import bj.w0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class f implements gj.c {

    /* renamed from: a, reason: collision with root package name */
    public final e f71550a;

    public f(e eVar) {
        this.f71550a = eVar;
    }

    public static f create(e eVar) {
        return new f(eVar);
    }

    public static w0 providesHeadlesssSingleton(e eVar) {
        return (w0) gj.e.checkNotNullFromProvides(eVar.f71549a);
    }

    @Override // gj.c, gj.f, ru.a
    public w0 get() {
        return providesHeadlesssSingleton(this.f71550a);
    }
}
