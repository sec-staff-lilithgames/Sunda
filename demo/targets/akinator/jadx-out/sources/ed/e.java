package ed;

import java.util.concurrent.atomic.AtomicLong;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class e implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final o f54096b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ v f54097c;

    public e(v vVar, o oVar) {
        this.f54097c = vVar;
        this.f54096b = oVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        v vVar = this.f54097c;
        AtomicLong atomicLong = vVar.f54135f;
        atomicLong.lazySet(atomicLong.get() + 1);
        o oVar = this.f54096b;
        if (((t) oVar.get()).a()) {
            vVar.f54134e.add((a) oVar);
            vVar.d();
        }
    }
}
