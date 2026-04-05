package kj;

import android.util.DisplayMetrics;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class i implements gj.c {

    /* renamed from: a, reason: collision with root package name */
    public final h f71552a;

    /* renamed from: b, reason: collision with root package name */
    public final ru.a f71553b;

    public i(h hVar, ru.a aVar) {
        this.f71552a = hVar;
        this.f71553b = aVar;
    }

    public static i create(h hVar, ru.a aVar) {
        return new i(hVar, aVar);
    }

    public static hj.s providesBannerLandscapeLayoutConfig(h hVar, DisplayMetrics displayMetrics) {
        return (hj.s) gj.e.checkNotNullFromProvides(hVar.providesBannerLandscapeLayoutConfig(displayMetrics));
    }

    @Override // gj.c, gj.f, ru.a
    public hj.s get() {
        return providesBannerLandscapeLayoutConfig(this.f71552a, (DisplayMetrics) this.f71553b.get());
    }
}
