package kj;

import android.app.Application;
import android.util.DisplayMetrics;
import android.view.WindowManager;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class m implements gj.c {

    /* renamed from: a, reason: collision with root package name */
    public final h f71560a;

    /* renamed from: b, reason: collision with root package name */
    public final ru.a f71561b;

    public m(h hVar, ru.a aVar) {
        this.f71560a = hVar;
        this.f71561b = aVar;
    }

    public static m create(h hVar, ru.a aVar) {
        return new m(hVar, aVar);
    }

    public static DisplayMetrics providesDisplayMetrics(h hVar, Application application) {
        hVar.getClass();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((WindowManager) application.getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
        return (DisplayMetrics) gj.e.checkNotNullFromProvides(displayMetrics);
    }

    @Override // gj.c, gj.f, ru.a
    public DisplayMetrics get() {
        return providesDisplayMetrics(this.f71560a, (Application) this.f71561b.get());
    }
}
