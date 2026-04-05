package kj;

import android.util.DisplayMetrics;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class q implements gj.c {

    /* renamed from: a, reason: collision with root package name */
    public final h f71568a;

    /* renamed from: b, reason: collision with root package name */
    public final ru.a f71569b;

    public q(h hVar, ru.a aVar) {
        this.f71568a = hVar;
        this.f71569b = aVar;
    }

    public static q create(h hVar, ru.a aVar) {
        return new q(hVar, aVar);
    }

    public static hj.s providesPortraitImageLayoutConfig(h hVar, DisplayMetrics displayMetrics) {
        return (hj.s) gj.e.checkNotNullFromProvides(hVar.providesPortraitImageLayoutConfig(displayMetrics));
    }

    @Override // gj.c, gj.f, ru.a
    public hj.s get() {
        return providesPortraitImageLayoutConfig(this.f71568a, (DisplayMetrics) this.f71569b.get());
    }
}
