package kj;

import android.util.DisplayMetrics;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class j implements gj.c {

    /* renamed from: a, reason: collision with root package name */
    public final h f71554a;

    /* renamed from: b, reason: collision with root package name */
    public final ru.a f71555b;

    public j(h hVar, ru.a aVar) {
        this.f71554a = hVar;
        this.f71555b = aVar;
    }

    public static j create(h hVar, ru.a aVar) {
        return new j(hVar, aVar);
    }

    public static hj.s providesBannerPortraitLayoutConfig(h hVar, DisplayMetrics displayMetrics) {
        return (hj.s) gj.e.checkNotNullFromProvides(hVar.providesBannerPortraitLayoutConfig(displayMetrics));
    }

    @Override // gj.c, gj.f, ru.a
    public hj.s get() {
        return providesBannerPortraitLayoutConfig(this.f71554a, (DisplayMetrics) this.f71555b.get());
    }
}
