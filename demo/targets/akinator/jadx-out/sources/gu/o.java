package gu;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public abstract class o extends AtomicLong implements mt.q, tw.d {

    /* renamed from: b, reason: collision with root package name */
    public final tw.c f58459b;

    /* renamed from: c, reason: collision with root package name */
    public tw.d f58460c;

    /* renamed from: e, reason: collision with root package name */
    public Object f58461e;

    /* renamed from: f, reason: collision with root package name */
    public long f58462f;

    public o(tw.c cVar) {
        this.f58459b = cVar;
    }

    public final void a(Object obj) {
        long j10 = this.f58462f;
        if (j10 != 0) {
            iu.e.produced(this, j10);
        }
        while (true) {
            long j11 = get();
            if ((j11 & Long.MIN_VALUE) != 0) {
                b(obj);
                return;
            }
            if ((j11 & Long.MAX_VALUE) != 0) {
                lazySet(C.TIME_UNSET);
                tw.c cVar = this.f58459b;
                cVar.onNext(obj);
                cVar.onComplete();
                return;
            }
            this.f58461e = obj;
            if (compareAndSet(0L, Long.MIN_VALUE)) {
                return;
            } else {
                this.f58461e = null;
            }
        }
    }

    @Override // tw.d
    public void cancel() {
        this.f58460c.cancel();
    }

    @Override // mt.q, tw.c, mt.f
    public abstract /* synthetic */ void onComplete();

    @Override // mt.q, tw.c, mt.f
    public abstract /* synthetic */ void onError(Throwable th2);

    @Override // mt.q, tw.c
    public abstract /* synthetic */ void onNext(Object obj);

    @Override // mt.q, tw.c
    public void onSubscribe(tw.d dVar) {
        if (hu.g.validate(this.f58460c, dVar)) {
            this.f58460c = dVar;
            this.f58459b.onSubscribe(this);
        }
    }

    @Override // tw.d
    public final void request(long j10) {
        long j11;
        if (hu.g.validate(j10)) {
            do {
                j11 = get();
                if ((j11 & Long.MIN_VALUE) != 0) {
                    if (compareAndSet(Long.MIN_VALUE, C.TIME_UNSET)) {
                        Object obj = this.f58461e;
                        tw.c cVar = this.f58459b;
                        cVar.onNext(obj);
                        cVar.onComplete();
                        return;
                    }
                    return;
                }
            } while (!compareAndSet(j11, iu.e.addCap(j11, j10)));
            this.f58460c.request(j10);
        }
    }

    public void b(Object obj) {
    }
}
