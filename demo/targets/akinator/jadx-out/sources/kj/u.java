package kj;

import android.view.LayoutInflater;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class u implements gj.c {

    /* renamed from: a, reason: collision with root package name */
    public final r f71575a;

    public u(r rVar) {
        this.f71575a = rVar;
    }

    public static u create(r rVar) {
        return new u(rVar);
    }

    public static LayoutInflater providesInflaterservice(r rVar) {
        return (LayoutInflater) gj.e.checkNotNullFromProvides(rVar.providesInflaterservice());
    }

    @Override // gj.c, gj.f, ru.a
    public LayoutInflater get() {
        return providesInflaterservice(this.f71575a);
    }
}
