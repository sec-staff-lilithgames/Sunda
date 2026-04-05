package kj;

import android.util.DisplayMetrics;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class l implements gj.c {

    /* renamed from: a, reason: collision with root package name */
    public final h f71558a;

    /* renamed from: b, reason: collision with root package name */
    public final ru.a f71559b;

    public l(h hVar, ru.a aVar) {
        this.f71558a = hVar;
        this.f71559b = aVar;
    }

    public static l create(h hVar, ru.a aVar) {
        return new l(hVar, aVar);
    }

    public static hj.s providesCardPortraitConfig(h hVar, DisplayMetrics displayMetrics) {
        return (hj.s) gj.e.checkNotNullFromProvides(hVar.providesCardPortraitConfig(displayMetrics));
    }

    @Override // gj.c, gj.f, ru.a
    public hj.s get() {
        return providesCardPortraitConfig(this.f71558a, (DisplayMetrics) this.f71559b.get());
    }
}
