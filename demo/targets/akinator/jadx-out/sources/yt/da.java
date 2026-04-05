package yt;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class da extends AtomicReference implements mt.q, pt.c {

    /* renamed from: j, reason: collision with root package name */
    public static final w9[] f95362j = new w9[0];

    /* renamed from: k, reason: collision with root package name */
    public static final w9[] f95363k = new w9[0];

    /* renamed from: b, reason: collision with root package name */
    public final aa f95364b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f95365c;

    /* renamed from: h, reason: collision with root package name */
    public long f95369h;

    /* renamed from: i, reason: collision with root package name */
    public long f95370i;

    /* renamed from: g, reason: collision with root package name */
    public final AtomicInteger f95368g = new AtomicInteger();

    /* renamed from: e, reason: collision with root package name */
    public final AtomicReference f95366e = new AtomicReference(f95362j);

    /* renamed from: f, reason: collision with root package name */
    public final AtomicBoolean f95367f = new AtomicBoolean();

    public da(aa aaVar) {
        this.f95364b = aaVar;
    }

    public final void a() {
        AtomicInteger atomicInteger = this.f95368g;
        if (atomicInteger.getAndIncrement() != 0) {
            return;
        }
        int iAddAndGet = 1;
        while (!isDisposed()) {
            w9[] w9VarArr = (w9[]) this.f95366e.get();
            long j10 = this.f95369h;
            long jMax = j10;
            for (w9 w9Var : w9VarArr) {
                jMax = Math.max(jMax, w9Var.f96498f.get());
            }
            long j11 = this.f95370i;
            tw.d dVar = (tw.d) get();
            long j12 = jMax - j10;
            if (j12 != 0) {
                this.f95369h = jMax;
                if (dVar == null) {
                    long j13 = j11 + j12;
                    if (j13 < 0) {
                        j13 = Long.MAX_VALUE;
                    }
                    this.f95370i = j13;
                } else if (j11 != 0) {
                    this.f95370i = 0L;
                    dVar.request(j11 + j12);
                } else {
                    dVar.request(j12);
                }
            } else if (j11 != 0 && dVar != null) {
                this.f95370i = 0L;
                dVar.request(j11);
            }
            iAddAndGet = atomicInteger.addAndGet(-iAddAndGet);
            if (iAddAndGet == 0) {
                return;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(w9 w9Var) {
        w9[] w9VarArr;
        while (true) {
            AtomicReference atomicReference = this.f95366e;
            w9[] w9VarArr2 = (w9[]) atomicReference.get();
            int length = w9VarArr2.length;
            if (length == 0) {
                return;
            }
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    i10 = -1;
                    break;
                } else if (w9VarArr2[i10].equals(w9Var)) {
                    break;
                } else {
                    i10++;
                }
            }
            if (i10 < 0) {
                return;
            }
            if (length == 1) {
                w9VarArr = f95362j;
            } else {
                w9[] w9VarArr3 = new w9[length - 1];
                System.arraycopy(w9VarArr2, 0, w9VarArr3, 0, i10);
                System.arraycopy(w9VarArr2, i10 + 1, w9VarArr3, i10, (length - i10) - 1);
                w9VarArr = w9VarArr3;
            }
            while (!atomicReference.compareAndSet(w9VarArr2, w9VarArr)) {
                if (atomicReference.get() != w9VarArr2) {
                    break;
                }
            }
            return;
        }
    }

    @Override // pt.c
    public void dispose() {
        this.f95366e.set(f95363k);
        hu.g.cancel(this);
    }

    @Override // pt.c
    public boolean isDisposed() {
        return this.f95366e.get() == f95363k;
    }

    @Override // mt.q, tw.c, mt.f
    public void onComplete() {
        if (this.f95365c) {
            return;
        }
        this.f95365c = true;
        aa aaVar = this.f95364b;
        aaVar.complete();
        for (w9 w9Var : (w9[]) this.f95366e.getAndSet(f95363k)) {
            aaVar.replay(w9Var);
        }
    }

    @Override // mt.q, tw.c, mt.f
    public void onError(Throwable th2) {
        if (this.f95365c) {
            mu.a.onError(th2);
            return;
        }
        this.f95365c = true;
        aa aaVar = this.f95364b;
        aaVar.error(th2);
        for (w9 w9Var : (w9[]) this.f95366e.getAndSet(f95363k)) {
            aaVar.replay(w9Var);
        }
    }

    @Override // mt.q, tw.c
    public void onNext(Object obj) {
        if (this.f95365c) {
            return;
        }
        aa aaVar = this.f95364b;
        aaVar.next(obj);
        for (w9 w9Var : (w9[]) this.f95366e.get()) {
            aaVar.replay(w9Var);
        }
    }

    @Override // mt.q, tw.c
    public void onSubscribe(tw.d dVar) {
        if (hu.g.setOnce(this, dVar)) {
            a();
            for (w9 w9Var : (w9[]) this.f95366e.get()) {
                this.f95364b.replay(w9Var);
            }
        }
    }
}
