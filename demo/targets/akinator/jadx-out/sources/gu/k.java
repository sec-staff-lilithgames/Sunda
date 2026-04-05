package gu;

import iu.z;
import java.util.concurrent.atomic.AtomicReference;
import yt.k1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class k extends AtomicReference implements mt.q, tw.d {

    /* renamed from: b, reason: collision with root package name */
    public final l f58441b;

    /* renamed from: c, reason: collision with root package name */
    public final int f58442c;

    /* renamed from: e, reason: collision with root package name */
    public final int f58443e;

    /* renamed from: f, reason: collision with root package name */
    public volatile vt.o f58444f;

    /* renamed from: g, reason: collision with root package name */
    public volatile boolean f58445g;

    /* renamed from: h, reason: collision with root package name */
    public long f58446h;

    /* renamed from: i, reason: collision with root package name */
    public int f58447i;

    public k(l lVar, int i10) {
        this.f58441b = lVar;
        this.f58442c = i10;
        this.f58443e = i10 - (i10 >> 2);
    }

    @Override // tw.d
    public void cancel() {
        hu.g.cancel(this);
    }

    public boolean isDone() {
        return this.f58445g;
    }

    @Override // mt.q, tw.c, mt.f
    public void onComplete() {
        ((k1) this.f58441b).innerComplete(this);
    }

    @Override // mt.q, tw.c, mt.f
    public void onError(Throwable th2) {
        ((k1) this.f58441b).innerError(this, th2);
    }

    @Override // mt.q, tw.c
    public void onNext(Object obj) {
        int i10 = this.f58447i;
        l lVar = this.f58441b;
        if (i10 == 0) {
            ((k1) lVar).innerNext(this, obj);
        } else {
            ((k1) lVar).drain();
        }
    }

    @Override // mt.q, tw.c
    public void onSubscribe(tw.d dVar) {
        if (hu.g.setOnce(this, dVar)) {
            if (dVar instanceof vt.l) {
                vt.l lVar = (vt.l) dVar;
                int iRequestFusion = lVar.requestFusion(3);
                if (iRequestFusion == 1) {
                    this.f58447i = iRequestFusion;
                    this.f58444f = lVar;
                    this.f58445g = true;
                    ((k1) this.f58441b).innerComplete(this);
                    return;
                }
                if (iRequestFusion == 2) {
                    this.f58447i = iRequestFusion;
                    this.f58444f = lVar;
                    z.request(dVar, this.f58442c);
                    return;
                }
            }
            this.f58444f = z.createQueue(this.f58442c);
            z.request(dVar, this.f58442c);
        }
    }

    public vt.o queue() {
        return this.f58444f;
    }

    @Override // tw.d
    public void request(long j10) {
        if (this.f58447i != 1) {
            long j11 = this.f58446h + j10;
            if (j11 < this.f58443e) {
                this.f58446h = j11;
            } else {
                this.f58446h = 0L;
                ((tw.d) get()).request(j11);
            }
        }
    }

    public void requestOne() {
        if (this.f58447i != 1) {
            long j10 = this.f58446h + 1;
            if (j10 != this.f58443e) {
                this.f58446h = j10;
            } else {
                this.f58446h = 0L;
                ((tw.d) get()).request(j10);
            }
        }
    }

    public void setDone() {
        this.f58445g = true;
    }
}
