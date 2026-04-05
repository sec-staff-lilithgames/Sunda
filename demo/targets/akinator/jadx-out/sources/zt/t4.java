package zt;

import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class t4 extends AtomicInteger implements pt.c {

    /* renamed from: b, reason: collision with root package name */
    public final mt.v f98780b;

    /* renamed from: c, reason: collision with root package name */
    public final st.o f98781c;

    /* renamed from: e, reason: collision with root package name */
    public final u4[] f98782e;

    /* renamed from: f, reason: collision with root package name */
    public final Object[] f98783f;

    public t4(mt.v vVar, int i10, st.o oVar) {
        super(i10);
        this.f98780b = vVar;
        this.f98781c = oVar;
        u4[] u4VarArr = new u4[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            u4VarArr[i11] = new u4(this, i11);
        }
        this.f98782e = u4VarArr;
        this.f98783f = new Object[i10];
    }

    public final void a(int i10) {
        u4[] u4VarArr = this.f98782e;
        int length = u4VarArr.length;
        for (int i11 = 0; i11 < i10; i11++) {
            u4VarArr[i11].dispose();
        }
        while (true) {
            i10++;
            if (i10 >= length) {
                return;
            } else {
                u4VarArr[i10].dispose();
            }
        }
    }

    @Override // pt.c
    public void dispose() {
        if (getAndSet(0) > 0) {
            for (u4 u4Var : this.f98782e) {
                u4Var.dispose();
            }
        }
    }

    @Override // pt.c
    public boolean isDisposed() {
        return get() <= 0;
    }
}
