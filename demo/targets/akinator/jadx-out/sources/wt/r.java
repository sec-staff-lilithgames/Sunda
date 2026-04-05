package wt;

import bu.g1;
import iu.z;
import java.util.concurrent.atomic.AtomicReference;
import mt.i0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class r extends AtomicReference implements i0, pt.c {

    /* renamed from: b, reason: collision with root package name */
    public final s f91275b;

    /* renamed from: c, reason: collision with root package name */
    public final int f91276c;

    /* renamed from: e, reason: collision with root package name */
    public vt.o f91277e;

    /* renamed from: f, reason: collision with root package name */
    public volatile boolean f91278f;

    /* renamed from: g, reason: collision with root package name */
    public int f91279g;

    public r(s sVar, int i10) {
        this.f91275b = sVar;
        this.f91276c = i10;
    }

    @Override // pt.c
    public void dispose() {
        tt.d.dispose(this);
    }

    public int fusionMode() {
        return this.f91279g;
    }

    @Override // pt.c
    public boolean isDisposed() {
        return tt.d.isDisposed((pt.c) get());
    }

    public boolean isDone() {
        return this.f91278f;
    }

    @Override // mt.i0, mt.f
    public void onComplete() {
        ((g1) this.f91275b).innerComplete(this);
    }

    @Override // mt.i0, mt.f
    public void onError(Throwable th2) {
        ((g1) this.f91275b).innerError(this, th2);
    }

    @Override // mt.i0
    public void onNext(Object obj) {
        int i10 = this.f91279g;
        s sVar = this.f91275b;
        if (i10 == 0) {
            ((g1) sVar).innerNext(this, obj);
        } else {
            ((g1) sVar).drain();
        }
    }

    @Override // mt.i0, mt.f
    public void onSubscribe(pt.c cVar) {
        if (tt.d.setOnce(this, cVar)) {
            if (cVar instanceof vt.j) {
                vt.j jVar = (vt.j) cVar;
                int iRequestFusion = jVar.requestFusion(3);
                if (iRequestFusion == 1) {
                    this.f91279g = iRequestFusion;
                    this.f91277e = jVar;
                    this.f91278f = true;
                    ((g1) this.f91275b).innerComplete(this);
                    return;
                }
                if (iRequestFusion == 2) {
                    this.f91279g = iRequestFusion;
                    this.f91277e = jVar;
                    return;
                }
            }
            this.f91277e = z.createQueue(-this.f91276c);
        }
    }

    public vt.o queue() {
        return this.f91277e;
    }

    public void setDone() {
        this.f91278f = true;
    }
}
