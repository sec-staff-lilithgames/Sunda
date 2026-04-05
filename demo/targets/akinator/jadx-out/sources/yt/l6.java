package yt;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class l6 extends AtomicLong implements tw.d, Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final tw.c f95854b;

    /* renamed from: c, reason: collision with root package name */
    public long f95855c;

    /* renamed from: e, reason: collision with root package name */
    public final AtomicReference f95856e = new AtomicReference();

    public l6(tw.c cVar) {
        this.f95854b = cVar;
    }

    @Override // tw.d
    public void cancel() {
        tt.d.dispose(this.f95856e);
    }

    @Override // tw.d
    public void request(long j10) {
        if (hu.g.validate(j10)) {
            iu.e.add(this, j10);
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        AtomicReference atomicReference = this.f95856e;
        if (atomicReference.get() != tt.d.f87352b) {
            long j10 = get();
            tw.c cVar = this.f95854b;
            if (j10 == 0) {
                cVar.onError(new qt.e(a.b.g(this.f95855c, " due to lack of requests", new StringBuilder("Can't deliver value "))));
                tt.d.dispose(atomicReference);
            } else {
                long j11 = this.f95855c;
                this.f95855c = j11 + 1;
                cVar.onNext(Long.valueOf(j11));
                iu.e.produced(this, 1L);
            }
        }
    }

    public void setResource(pt.c cVar) {
        tt.d.setOnce(this.f95856e, cVar);
    }
}
