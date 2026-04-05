package p0;

import p0.h;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class i implements kv.l {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h.a f80245b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h f80246c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.z0 f80247e;

    public i(h.a aVar, h hVar, kotlin.jvm.internal.z0 z0Var) {
        this.f80245b = aVar;
        this.f80246c = hVar;
        this.f80247e = z0Var;
    }

    @Override // kv.l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Throwable) obj);
        return tu.x0.f87415a;
    }

    public final void invoke(Throwable th2) {
        int i10;
        this.f80245b.cancel();
        z0.a aVar = this.f80246c.f80226f;
        int i11 = this.f80247e.f71866b;
        do {
            i10 = aVar.get();
        } while (!aVar.compareAndSet(i10, ((i10 >>> 27) & 15) == i11 ? i10 - 1 : i10));
    }
}
