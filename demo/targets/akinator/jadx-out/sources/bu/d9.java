package bu;

import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class d9 extends f9 {

    /* renamed from: g, reason: collision with root package name */
    public final AtomicInteger f10217g;

    /* renamed from: h, reason: collision with root package name */
    public volatile boolean f10218h;

    public d9(ku.m mVar, mt.g0 g0Var) {
        super(mVar, g0Var);
        this.f10217g = new AtomicInteger();
    }

    @Override // bu.f9
    public final void a() {
        this.f10218h = true;
        if (this.f10217g.getAndIncrement() == 0) {
            Object andSet = getAndSet(null);
            if (andSet != null) {
                this.f10310b.onNext(andSet);
            }
            this.f10310b.onComplete();
        }
    }

    @Override // bu.f9
    public final void b() {
        if (this.f10217g.getAndIncrement() == 0) {
            do {
                boolean z10 = this.f10218h;
                Object andSet = getAndSet(null);
                if (andSet != null) {
                    this.f10310b.onNext(andSet);
                }
                if (z10) {
                    this.f10310b.onComplete();
                    return;
                }
            } while (this.f10217g.decrementAndGet() != 0);
        }
    }
}
