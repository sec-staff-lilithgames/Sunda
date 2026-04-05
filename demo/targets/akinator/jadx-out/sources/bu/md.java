package bu;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class md extends AtomicInteger implements pt.c {

    /* renamed from: b, reason: collision with root package name */
    public final mt.i0 f10666b;

    /* renamed from: c, reason: collision with root package name */
    public final st.o f10667c;

    /* renamed from: e, reason: collision with root package name */
    public final nd[] f10668e;

    /* renamed from: f, reason: collision with root package name */
    public final Object[] f10669f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f10670g;

    /* renamed from: h, reason: collision with root package name */
    public volatile boolean f10671h;

    public md(mt.i0 i0Var, st.o oVar, int i10, boolean z10) {
        this.f10666b = i0Var;
        this.f10667c = oVar;
        this.f10668e = new nd[i10];
        this.f10669f = new Object[i10];
        this.f10670g = z10;
    }

    public final void a() {
        nd[] ndVarArr = this.f10668e;
        for (nd ndVar : ndVarArr) {
            ndVar.f10714c.clear();
        }
        for (nd ndVar2 : ndVarArr) {
            ndVar2.dispose();
        }
    }

    @Override // pt.c
    public void dispose() {
        if (this.f10671h) {
            return;
        }
        this.f10671h = true;
        for (nd ndVar : this.f10668e) {
            ndVar.dispose();
        }
        if (getAndIncrement() == 0) {
            for (nd ndVar2 : this.f10668e) {
                ndVar2.f10714c.clear();
            }
        }
    }

    public void drain() {
        Throwable th2;
        if (getAndIncrement() != 0) {
            return;
        }
        nd[] ndVarArr = this.f10668e;
        mt.i0 i0Var = this.f10666b;
        Object[] objArr = this.f10669f;
        boolean z10 = this.f10670g;
        int iAddAndGet = 1;
        while (true) {
            int i10 = 0;
            int i11 = 0;
            for (nd ndVar : ndVarArr) {
                if (objArr[i11] == null) {
                    boolean z11 = ndVar.f10715e;
                    Object objPoll = ndVar.f10714c.poll();
                    boolean z12 = objPoll == null;
                    if (this.f10671h) {
                        a();
                        return;
                    }
                    if (z11) {
                        if (!z10) {
                            Throwable th3 = ndVar.f10716f;
                            if (th3 != null) {
                                this.f10671h = true;
                                a();
                                i0Var.onError(th3);
                                return;
                            } else if (z12) {
                                this.f10671h = true;
                                a();
                                i0Var.onComplete();
                                return;
                            }
                        } else if (z12) {
                            Throwable th4 = ndVar.f10716f;
                            this.f10671h = true;
                            a();
                            if (th4 != null) {
                                i0Var.onError(th4);
                                return;
                            } else {
                                i0Var.onComplete();
                                return;
                            }
                        }
                    }
                    if (z12) {
                        i10++;
                    } else {
                        objArr[i11] = objPoll;
                    }
                } else if (ndVar.f10715e && !z10 && (th2 = ndVar.f10716f) != null) {
                    this.f10671h = true;
                    a();
                    i0Var.onError(th2);
                    return;
                }
                i11++;
            }
            if (i10 != 0) {
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            } else {
                try {
                    i0Var.onNext(ut.o0.requireNonNull(this.f10667c.apply(objArr.clone()), "The zipper returned a null value"));
                    Arrays.fill(objArr, (Object) null);
                } catch (Throwable th5) {
                    qt.d.throwIfFatal(th5);
                    a();
                    i0Var.onError(th5);
                    return;
                }
            }
        }
    }

    @Override // pt.c
    public boolean isDisposed() {
        return this.f10671h;
    }

    public void subscribe(mt.g0[] g0VarArr, int i10) {
        nd[] ndVarArr = this.f10668e;
        int length = ndVarArr.length;
        for (int i11 = 0; i11 < length; i11++) {
            ndVarArr[i11] = new nd(this, i10);
        }
        lazySet(0);
        this.f10666b.onSubscribe(this);
        for (int i12 = 0; i12 < length && !this.f10671h; i12++) {
            g0VarArr[i12].subscribe(ndVarArr[i12]);
        }
    }
}
