package kj;

import android.util.DisplayMetrics;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class o implements gj.c {

    /* renamed from: a, reason: collision with root package name */
    public final h f71564a;

    /* renamed from: b, reason: collision with root package name */
    public final ru.a f71565b;

    public o(h hVar, ru.a aVar) {
        this.f71564a = hVar;
        this.f71565b = aVar;
    }

    public static o create(h hVar, ru.a aVar) {
        return new o(hVar, aVar);
    }

    public static hj.s providesModalLandscapeConfig(h hVar, DisplayMetrics displayMetrics) {
        return (hj.s) gj.e.checkNotNullFromProvides(hVar.providesModalLandscapeConfig(displayMetrics));
    }

    @Override // gj.c, gj.f, ru.a
    public hj.s get() {
        return providesModalLandscapeConfig(this.f71564a, (DisplayMetrics) this.f71565b.get());
    }
}
