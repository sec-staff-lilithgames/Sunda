package xr;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class dd extends cd {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicIntegerFieldUpdater f92442a;

    public dd(AtomicIntegerFieldUpdater atomicIntegerFieldUpdater) {
        this.f92442a = atomicIntegerFieldUpdater;
    }

    @Override // xr.cd
    public boolean runStateCompareAndSet(fd fdVar, int i10, int i11) {
        return this.f92442a.compareAndSet(fdVar, i10, i11);
    }

    @Override // xr.cd
    public void runStateSet(fd fdVar, int i10) {
        this.f92442a.set(fdVar, i10);
    }
}
