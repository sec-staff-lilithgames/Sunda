package yt;

import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class pa extends ra {

    /* renamed from: h, reason: collision with root package name */
    public final AtomicInteger f96127h;

    /* renamed from: i, reason: collision with root package name */
    public volatile boolean f96128i;

    public pa(qu.d dVar, tw.b bVar) {
        super(dVar, bVar);
        this.f96127h = new AtomicInteger();
    }

    @Override // yt.ra
    public final void a() {
        this.f96128i = true;
        if (this.f96127h.getAndIncrement() == 0) {
            b();
            this.f96270b.onComplete();
        }
    }

    @Override // yt.ra
    public final void c() {
        if (this.f96127h.getAndIncrement() == 0) {
            do {
                boolean z10 = this.f96128i;
                b();
                if (z10) {
                    this.f96270b.onComplete();
                    return;
                }
            } while (this.f96127h.decrementAndGet() != 0);
        }
    }
}
