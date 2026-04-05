package ek;

import android.content.Context;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class p0 implements hk.b {

    /* renamed from: a, reason: collision with root package name */
    public final ru.a f54607a;

    /* renamed from: b, reason: collision with root package name */
    public final ru.a f54608b;

    public p0(ru.a aVar, ru.a aVar2) {
        this.f54607a = aVar;
        this.f54608b = aVar2;
    }

    public static p0 create(ru.a aVar, ru.a aVar2) {
        return new p0(aVar, aVar2);
    }

    public static o0 newInstance(Context context, b2 b2Var) {
        return new o0(context, b2Var);
    }

    @Override // hk.b, hk.e, ru.a
    public o0 get() {
        return newInstance((Context) this.f54607a.get(), (b2) this.f54608b.get());
    }
}
