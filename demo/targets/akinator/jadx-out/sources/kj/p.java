package kj;

import android.util.DisplayMetrics;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class p implements gj.c {

    /* renamed from: a, reason: collision with root package name */
    public final h f71566a;

    /* renamed from: b, reason: collision with root package name */
    public final ru.a f71567b;

    public p(h hVar, ru.a aVar) {
        this.f71566a = hVar;
        this.f71567b = aVar;
    }

    public static p create(h hVar, ru.a aVar) {
        return new p(hVar, aVar);
    }

    public static hj.s providesModalPortraitConfig(h hVar, DisplayMetrics displayMetrics) {
        return (hj.s) gj.e.checkNotNullFromProvides(hVar.providesModalPortraitConfig(displayMetrics));
    }

    @Override // gj.c, gj.f, ru.a
    public hj.s get() {
        return providesModalPortraitConfig(this.f71566a, (DisplayMetrics) this.f71567b.get());
    }
}
