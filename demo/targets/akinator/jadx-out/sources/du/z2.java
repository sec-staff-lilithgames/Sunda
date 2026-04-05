package du;

import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class z2 extends AtomicInteger implements pt.c {

    /* renamed from: b, reason: collision with root package name */
    public final mt.q0 f52898b;

    /* renamed from: c, reason: collision with root package name */
    public final st.o f52899c;

    /* renamed from: e, reason: collision with root package name */
    public final a3[] f52900e;

    /* renamed from: f, reason: collision with root package name */
    public final Object[] f52901f;

    public z2(mt.q0 q0Var, int i10, st.o oVar) {
        super(i10);
        this.f52898b = q0Var;
        this.f52899c = oVar;
        a3[] a3VarArr = new a3[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            a3VarArr[i11] = new a3(this, i11);
        }
        this.f52900e = a3VarArr;
        this.f52901f = new Object[i10];
    }

    public final void a(Throwable th2, int i10) {
        if (getAndSet(0) <= 0) {
            mu.a.onError(th2);
            return;
        }
        a3[] a3VarArr = this.f52900e;
        int length = a3VarArr.length;
        for (int i11 = 0; i11 < i10; i11++) {
            a3VarArr[i11].dispose();
        }
        while (true) {
            i10++;
            if (i10 >= length) {
                this.f52898b.onError(th2);
                return;
            }
            a3VarArr[i10].dispose();
        }
    }

    @Override // pt.c
    public void dispose() {
        if (getAndSet(0) > 0) {
            for (a3 a3Var : this.f52900e) {
                a3Var.dispose();
            }
        }
    }

    @Override // pt.c
    public boolean isDisposed() {
        return get() <= 0;
    }
}
