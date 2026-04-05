package bu;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class qa extends AtomicReference implements mt.i0 {

    /* renamed from: b, reason: collision with root package name */
    public final ra f10864b;

    /* renamed from: c, reason: collision with root package name */
    public final long f10865c;

    /* renamed from: e, reason: collision with root package name */
    public final int f10866e;

    /* renamed from: f, reason: collision with root package name */
    public volatile vt.o f10867f;

    /* renamed from: g, reason: collision with root package name */
    public volatile boolean f10868g;

    public qa(ra raVar, long j10, int i10) {
        this.f10864b = raVar;
        this.f10865c = j10;
        this.f10866e = i10;
    }

    public void cancel() {
        tt.d.dispose(this);
    }

    @Override // mt.i0, mt.f
    public void onComplete() {
        if (this.f10865c == this.f10864b.f10933l) {
            this.f10868g = true;
            this.f10864b.b();
        }
    }

    @Override // mt.i0, mt.f
    public void onError(Throwable th2) {
        ra raVar = this.f10864b;
        raVar.getClass();
        if (this.f10865c != raVar.f10933l || !raVar.f10928g.addThrowable(th2)) {
            mu.a.onError(th2);
            return;
        }
        if (!raVar.f10927f) {
            raVar.f10931j.dispose();
            raVar.f10929h = true;
        }
        this.f10868g = true;
        raVar.b();
    }

    @Override // mt.i0
    public void onNext(Object obj) {
        if (this.f10865c == this.f10864b.f10933l) {
            if (obj != null) {
                this.f10867f.offer(obj);
            }
            this.f10864b.b();
        }
    }

    @Override // mt.i0, mt.f
    public void onSubscribe(pt.c cVar) {
        if (tt.d.setOnce(this, cVar)) {
            if (cVar instanceof vt.j) {
                vt.j jVar = (vt.j) cVar;
                int iRequestFusion = jVar.requestFusion(7);
                if (iRequestFusion == 1) {
                    this.f10867f = jVar;
                    this.f10868g = true;
                    this.f10864b.b();
                    return;
                } else if (iRequestFusion == 2) {
                    this.f10867f = jVar;
                    return;
                }
            }
            this.f10867f = new eu.d(this.f10866e);
        }
    }
}
