package bu;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class jd extends AtomicInteger implements mt.i0, pt.c {

    /* renamed from: b, reason: collision with root package name */
    public final mt.i0 f10481b;

    /* renamed from: c, reason: collision with root package name */
    public final st.o f10482c;

    /* renamed from: e, reason: collision with root package name */
    public final kd[] f10483e;

    /* renamed from: f, reason: collision with root package name */
    public final AtomicReferenceArray f10484f;

    /* renamed from: g, reason: collision with root package name */
    public final AtomicReference f10485g;

    /* renamed from: h, reason: collision with root package name */
    public final iu.d f10486h;

    /* renamed from: i, reason: collision with root package name */
    public volatile boolean f10487i;

    public jd(mt.i0 i0Var, st.o oVar, int i10) {
        this.f10481b = i0Var;
        this.f10482c = oVar;
        kd[] kdVarArr = new kd[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            kdVarArr[i11] = new kd(this, i11);
        }
        this.f10483e = kdVarArr;
        this.f10484f = new AtomicReferenceArray(i10);
        this.f10485g = new AtomicReference();
        this.f10486h = new iu.d();
    }

    public final void a(int i10) {
        int i11 = 0;
        while (true) {
            kd[] kdVarArr = this.f10483e;
            if (i11 >= kdVarArr.length) {
                return;
            }
            if (i11 != i10) {
                kdVarArr[i11].dispose();
            }
            i11++;
        }
    }

    @Override // pt.c
    public void dispose() {
        tt.d.dispose(this.f10485g);
        for (kd kdVar : this.f10483e) {
            kdVar.dispose();
        }
    }

    @Override // pt.c
    public boolean isDisposed() {
        return tt.d.isDisposed((pt.c) this.f10485g.get());
    }

    @Override // mt.i0, mt.f
    public void onComplete() {
        if (this.f10487i) {
            return;
        }
        this.f10487i = true;
        a(-1);
        iu.n.onComplete(this.f10481b, this, this.f10486h);
    }

    @Override // mt.i0, mt.f
    public void onError(Throwable th2) {
        if (this.f10487i) {
            mu.a.onError(th2);
            return;
        }
        this.f10487i = true;
        a(-1);
        iu.n.onError(this.f10481b, th2, this, this.f10486h);
    }

    @Override // mt.i0
    public void onNext(Object obj) {
        if (this.f10487i) {
            return;
        }
        AtomicReferenceArray atomicReferenceArray = this.f10484f;
        int length = atomicReferenceArray.length();
        Object[] objArr = new Object[length + 1];
        int i10 = 0;
        objArr[0] = obj;
        while (i10 < length) {
            Object obj2 = atomicReferenceArray.get(i10);
            if (obj2 == null) {
                return;
            }
            i10++;
            objArr[i10] = obj2;
        }
        try {
            iu.n.onNext(this.f10481b, ut.o0.requireNonNull(this.f10482c.apply(objArr), "combiner returned a null value"), this, this.f10486h);
        } catch (Throwable th2) {
            qt.d.throwIfFatal(th2);
            dispose();
            onError(th2);
        }
    }

    @Override // mt.i0, mt.f
    public void onSubscribe(pt.c cVar) {
        tt.d.setOnce(this.f10485g, cVar);
    }
}
