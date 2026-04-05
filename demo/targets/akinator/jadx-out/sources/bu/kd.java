package bu;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class kd extends AtomicReference implements mt.i0 {

    /* renamed from: b, reason: collision with root package name */
    public final jd f10551b;

    /* renamed from: c, reason: collision with root package name */
    public final int f10552c;

    /* renamed from: e, reason: collision with root package name */
    public boolean f10553e;

    public kd(jd jdVar, int i10) {
        this.f10551b = jdVar;
        this.f10552c = i10;
    }

    public void dispose() {
        tt.d.dispose(this);
    }

    @Override // mt.i0, mt.f
    public void onComplete() {
        jd jdVar = this.f10551b;
        int i10 = this.f10552c;
        if (this.f10553e) {
            jdVar.getClass();
            return;
        }
        jdVar.f10487i = true;
        jdVar.a(i10);
        iu.n.onComplete(jdVar.f10481b, jdVar, jdVar.f10486h);
    }

    @Override // mt.i0, mt.f
    public void onError(Throwable th2) {
        jd jdVar = this.f10551b;
        int i10 = this.f10552c;
        jdVar.f10487i = true;
        tt.d.dispose(jdVar.f10485g);
        jdVar.a(i10);
        iu.n.onError(jdVar.f10481b, th2, jdVar, jdVar.f10486h);
    }

    @Override // mt.i0
    public void onNext(Object obj) {
        if (!this.f10553e) {
            this.f10553e = true;
        }
        this.f10551b.f10484f.set(this.f10552c, obj);
    }

    @Override // mt.i0, mt.f
    public void onSubscribe(pt.c cVar) {
        tt.d.setOnce(this, cVar);
    }
}
