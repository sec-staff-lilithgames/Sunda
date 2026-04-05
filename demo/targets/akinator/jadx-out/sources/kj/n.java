package kj;

import android.util.DisplayMetrics;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class n implements gj.c {

    /* renamed from: a, reason: collision with root package name */
    public final h f71562a;

    /* renamed from: b, reason: collision with root package name */
    public final ru.a f71563b;

    public n(h hVar, ru.a aVar) {
        this.f71562a = hVar;
        this.f71563b = aVar;
    }

    public static n create(h hVar, ru.a aVar) {
        return new n(hVar, aVar);
    }

    public static hj.s providesLandscapeImageLayoutConfig(h hVar, DisplayMetrics displayMetrics) {
        return (hj.s) gj.e.checkNotNullFromProvides(hVar.providesLandscapeImageLayoutConfig(displayMetrics));
    }

    @Override // gj.c, gj.f, ru.a
    public hj.s get() {
        return providesLandscapeImageLayoutConfig(this.f71562a, (DisplayMetrics) this.f71563b.get());
    }
}
