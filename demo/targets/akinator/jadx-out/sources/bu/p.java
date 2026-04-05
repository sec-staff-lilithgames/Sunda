package bu;

import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class p implements pt.c {

    /* renamed from: b, reason: collision with root package name */
    public final mt.i0 f10780b;

    /* renamed from: c, reason: collision with root package name */
    public final q[] f10781c;

    /* renamed from: e, reason: collision with root package name */
    public final AtomicInteger f10782e = new AtomicInteger();

    public p(mt.i0 i0Var, int i10) {
        this.f10780b = i0Var;
        this.f10781c = new q[i10];
    }

    @Override // pt.c
    public void dispose() {
        AtomicInteger atomicInteger = this.f10782e;
        if (atomicInteger.get() != -1) {
            atomicInteger.lazySet(-1);
            for (q qVar : this.f10781c) {
                qVar.dispose();
            }
        }
    }

    @Override // pt.c
    public boolean isDisposed() {
        return this.f10782e.get() == -1;
    }

    public void subscribe(mt.g0[] g0VarArr) {
        mt.i0 i0Var;
        q[] qVarArr = this.f10781c;
        int length = qVarArr.length;
        int i10 = 0;
        while (true) {
            i0Var = this.f10780b;
            if (i10 >= length) {
                break;
            }
            int i11 = i10 + 1;
            qVarArr[i10] = new q(this, i11, i0Var);
            i10 = i11;
        }
        AtomicInteger atomicInteger = this.f10782e;
        atomicInteger.lazySet(0);
        i0Var.onSubscribe(this);
        for (int i12 = 0; i12 < length && atomicInteger.get() == 0; i12++) {
            g0VarArr[i12].subscribe(qVarArr[i12]);
        }
    }

    public boolean win(int i10) {
        AtomicInteger atomicInteger = this.f10782e;
        int i11 = atomicInteger.get();
        int i12 = 0;
        if (i11 != 0) {
            return i11 == i10;
        }
        if (!atomicInteger.compareAndSet(0, i10)) {
            return false;
        }
        q[] qVarArr = this.f10781c;
        int length = qVarArr.length;
        while (i12 < length) {
            int i13 = i12 + 1;
            if (i13 != i10) {
                qVarArr[i12].dispose();
            }
            i12 = i13;
        }
        return true;
    }
}
