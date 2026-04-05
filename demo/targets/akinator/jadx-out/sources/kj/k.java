package kj;

import android.util.DisplayMetrics;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class k implements gj.c {

    /* renamed from: a, reason: collision with root package name */
    public final h f71556a;

    /* renamed from: b, reason: collision with root package name */
    public final ru.a f71557b;

    public k(h hVar, ru.a aVar) {
        this.f71556a = hVar;
        this.f71557b = aVar;
    }

    public static k create(h hVar, ru.a aVar) {
        return new k(hVar, aVar);
    }

    public static hj.s providesCardLandscapeConfig(h hVar, DisplayMetrics displayMetrics) {
        return (hj.s) gj.e.checkNotNullFromProvides(hVar.providesCardLandscapeConfig(displayMetrics));
    }

    @Override // gj.c, gj.f, ru.a
    public hj.s get() {
        return providesCardLandscapeConfig(this.f71556a, (DisplayMetrics) this.f71557b.get());
    }
}
