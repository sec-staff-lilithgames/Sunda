package cu;

import java.util.concurrent.atomic.AtomicLongArray;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class q implements tw.d {

    /* renamed from: b, reason: collision with root package name */
    public final int f51047b;

    /* renamed from: c, reason: collision with root package name */
    public final int f51048c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r f51049e;

    public q(r rVar, int i10, int i11) {
        this.f51049e = rVar;
        this.f51047b = i10;
        this.f51048c = i11;
    }

    @Override // tw.d
    public void cancel() {
        if (this.f51049e.f51054c.compareAndSet(this.f51047b + this.f51048c, 0L, 1L)) {
            r rVar = this.f51049e;
            int i10 = this.f51048c;
            if (rVar.f51054c.decrementAndGet(i10 + i10) == 0) {
                rVar.f51063m = true;
                rVar.f51058h.cancel();
                if (rVar.getAndIncrement() == 0) {
                    rVar.f51059i.clear();
                }
            }
        }
    }

    @Override // tw.d
    public void request(long j10) {
        long j11;
        if (hu.g.validate(j10)) {
            r rVar = this.f51049e;
            AtomicLongArray atomicLongArray = rVar.f51054c;
            do {
                j11 = atomicLongArray.get(this.f51047b);
                if (j11 == Long.MAX_VALUE) {
                    return;
                }
            } while (!atomicLongArray.compareAndSet(this.f51047b, j11, iu.e.addCap(j11, j10)));
            if (rVar.f51064n.get() == this.f51048c) {
                rVar.a();
            }
        }
    }
}
