package yt;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class n6 extends AtomicLong implements tw.d, Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final tw.c f95995b;

    /* renamed from: c, reason: collision with root package name */
    public final long f95996c;

    /* renamed from: e, reason: collision with root package name */
    public long f95997e;

    /* renamed from: f, reason: collision with root package name */
    public final AtomicReference f95998f = new AtomicReference();

    public n6(tw.c cVar, long j10, long j11) {
        this.f95995b = cVar;
        this.f95997e = j10;
        this.f95996c = j11;
    }

    @Override // tw.d
    public void cancel() {
        tt.d.dispose(this.f95998f);
    }

    @Override // tw.d
    public void request(long j10) {
        if (hu.g.validate(j10)) {
            iu.e.add(this, j10);
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        AtomicReference atomicReference = this.f95998f;
        Object obj = atomicReference.get();
        tt.d dVar = tt.d.f87352b;
        if (obj != dVar) {
            long j10 = get();
            tw.c cVar = this.f95995b;
            if (j10 == 0) {
                cVar.onError(new qt.e(a.b.g(this.f95997e, " due to lack of requests", new StringBuilder("Can't deliver value "))));
                tt.d.dispose(atomicReference);
                return;
            }
            long j11 = this.f95997e;
            cVar.onNext(Long.valueOf(j11));
            if (j11 == this.f95996c) {
                if (atomicReference.get() != dVar) {
                    cVar.onComplete();
                }
                tt.d.dispose(atomicReference);
            } else {
                this.f95997e = j11 + 1;
                if (j10 != Long.MAX_VALUE) {
                    decrementAndGet();
                }
            }
        }
    }

    public void setResource(pt.c cVar) {
        tt.d.setOnce(this.f95998f, cVar);
    }
}
