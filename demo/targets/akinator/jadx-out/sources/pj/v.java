package pj;

import android.app.Application;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class v implements dj.b {

    /* renamed from: a, reason: collision with root package name */
    public final u f81475a;

    /* renamed from: b, reason: collision with root package name */
    public final ru.a f81476b;

    public v(u uVar, ru.a aVar) {
        this.f81475a = uVar;
        this.f81476b = aVar;
    }

    public static v create(u uVar, ru.a aVar) {
        return new v(uVar, aVar);
    }

    public static rt.a providesAppForegroundEventStream(u uVar, Application application) {
        return (rt.a) dj.d.checkNotNullFromProvides(uVar.providesAppForegroundEventStream(application));
    }

    @Override // dj.b, dj.e, ru.a
    public rt.a get() {
        return providesAppForegroundEventStream(this.f81475a, (Application) this.f81476b.get());
    }
}
