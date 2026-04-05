package yt;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class ff extends AtomicInteger implements tw.d {

    /* renamed from: b, reason: collision with root package name */
    public final tw.c f95496b;

    /* renamed from: c, reason: collision with root package name */
    public final gf[] f95497c;

    /* renamed from: e, reason: collision with root package name */
    public final st.o f95498e;

    /* renamed from: f, reason: collision with root package name */
    public final AtomicLong f95499f;

    /* renamed from: g, reason: collision with root package name */
    public final iu.d f95500g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f95501h;

    /* renamed from: i, reason: collision with root package name */
    public volatile boolean f95502i;

    /* renamed from: j, reason: collision with root package name */
    public final Object[] f95503j;

    public ff(tw.c cVar, st.o oVar, boolean z10, int i10, int i11) {
        this.f95496b = cVar;
        this.f95498e = oVar;
        this.f95501h = z10;
        gf[] gfVarArr = new gf[i10];
        for (int i12 = 0; i12 < i10; i12++) {
            gfVarArr[i12] = new gf(this, i11);
        }
        this.f95503j = new Object[i10];
        this.f95497c = gfVarArr;
        this.f95499f = new AtomicLong();
        this.f95500g = new iu.d();
    }

    public final void a() {
        for (gf gfVar : this.f95497c) {
            gfVar.cancel();
        }
    }

    public final void b() {
        long j10;
        boolean z10;
        Object objPoll;
        boolean z11;
        if (getAndIncrement() != 0) {
            return;
        }
        tw.c cVar = this.f95496b;
        gf[] gfVarArr = this.f95497c;
        int length = gfVarArr.length;
        Object[] objArr = this.f95503j;
        int iAddAndGet = 1;
        do {
            long j11 = this.f95499f.get();
            long j12 = 0;
            while (true) {
                if (j11 == j12) {
                    j10 = 0;
                    break;
                }
                if (this.f95502i) {
                    return;
                }
                if (!this.f95501h && this.f95500g.get() != null) {
                    a();
                    cVar.onError(this.f95500g.terminate());
                    return;
                }
                boolean z12 = false;
                for (int i10 = 0; i10 < length; i10++) {
                    gf gfVar = gfVarArr[i10];
                    if (objArr[i10] == null) {
                        try {
                            z10 = gfVar.f95562h;
                            vt.o oVar = gfVar.f95560f;
                            objPoll = oVar != null ? oVar.poll() : null;
                            z11 = objPoll == null;
                        } catch (Throwable th2) {
                            qt.d.throwIfFatal(th2);
                            this.f95500g.addThrowable(th2);
                            if (!this.f95501h) {
                                a();
                                cVar.onError(this.f95500g.terminate());
                                return;
                            }
                        }
                        if (z10 && z11) {
                            a();
                            if (((Throwable) this.f95500g.get()) != null) {
                                cVar.onError(this.f95500g.terminate());
                                return;
                            } else {
                                cVar.onComplete();
                                return;
                            }
                        }
                        if (z11) {
                            z12 = true;
                        } else {
                            objArr[i10] = objPoll;
                        }
                    }
                }
                j10 = 0;
                if (z12) {
                    break;
                }
                try {
                    cVar.onNext(ut.o0.requireNonNull(this.f95498e.apply(objArr.clone()), "The zipper returned a null value"));
                    j12++;
                    Arrays.fill(objArr, (Object) null);
                } catch (Throwable th3) {
                    qt.d.throwIfFatal(th3);
                    a();
                    this.f95500g.addThrowable(th3);
                    cVar.onError(this.f95500g.terminate());
                    return;
                }
            }
            if (j11 == j12) {
                if (this.f95502i) {
                    return;
                }
                if (!this.f95501h && this.f95500g.get() != null) {
                    a();
                    cVar.onError(this.f95500g.terminate());
                    return;
                }
                for (int i11 = 0; i11 < length; i11++) {
                    gf gfVar2 = gfVarArr[i11];
                    if (objArr[i11] == null) {
                        try {
                            boolean z13 = gfVar2.f95562h;
                            vt.o oVar2 = gfVar2.f95560f;
                            Object objPoll2 = oVar2 != null ? oVar2.poll() : null;
                            boolean z14 = objPoll2 == null;
                            if (z13 && z14) {
                                a();
                                if (((Throwable) this.f95500g.get()) != null) {
                                    cVar.onError(this.f95500g.terminate());
                                    return;
                                } else {
                                    cVar.onComplete();
                                    return;
                                }
                            }
                            if (!z14) {
                                objArr[i11] = objPoll2;
                            }
                        } catch (Throwable th4) {
                            qt.d.throwIfFatal(th4);
                            this.f95500g.addThrowable(th4);
                            if (!this.f95501h) {
                                a();
                                cVar.onError(this.f95500g.terminate());
                                return;
                            }
                        }
                    }
                }
            }
            if (j12 != j10) {
                for (gf gfVar3 : gfVarArr) {
                    gfVar3.request(j12);
                }
                if (j11 != Long.MAX_VALUE) {
                    this.f95499f.addAndGet(-j12);
                }
            }
            iAddAndGet = addAndGet(-iAddAndGet);
        } while (iAddAndGet != 0);
    }

    @Override // tw.d
    public void cancel() {
        if (this.f95502i) {
            return;
        }
        this.f95502i = true;
        a();
    }

    @Override // tw.d
    public void request(long j10) {
        if (hu.g.validate(j10)) {
            iu.e.add(this.f95499f, j10);
            b();
        }
    }
}
