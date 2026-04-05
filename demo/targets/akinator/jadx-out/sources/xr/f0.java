package xr;

import java.util.concurrent.atomic.AtomicLong;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class f0 implements y6 {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicLong f92490a = new AtomicLong();

    @Override // xr.y6
    public void add(long j10) {
        this.f92490a.getAndAdd(j10);
    }

    @Override // xr.y6
    public long value() {
        return this.f92490a.get();
    }
}
