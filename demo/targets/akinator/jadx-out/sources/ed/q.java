package ed;

import java.util.concurrent.atomic.AtomicLong;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class q implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final int f54120b;

    /* renamed from: c, reason: collision with root package name */
    public final o f54121c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ v f54122e;

    public q(v vVar, o oVar, int i10) {
        this.f54122e = vVar;
        this.f54120b = i10;
        this.f54121c = oVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        v vVar = this.f54122e;
        AtomicLong atomicLong = vVar.f54135f;
        atomicLong.lazySet(atomicLong.get() + this.f54120b);
        d dVar = vVar.f54134e;
        o oVar = this.f54121c;
        if (dVar.a(oVar)) {
            dVar.moveToBack(oVar);
        }
        vVar.d();
    }
}
