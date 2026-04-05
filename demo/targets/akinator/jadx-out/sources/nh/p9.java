package nh;

import java.lang.ref.ReferenceQueue;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class p9 extends e9 {

    /* renamed from: j, reason: collision with root package name */
    public final ReferenceQueue f76556j;

    public p9(fa faVar, int i10) {
        super(faVar, i10);
        this.f76556j = new ReferenceQueue();
    }

    @Override // nh.e9
    public final void e() {
        while (this.f76556j.poll() != null) {
        }
    }

    @Override // nh.e9
    public final void f() {
        b(this.f76556j);
    }

    public ca getWeakValueReferenceForTesting(a9 a9Var) {
        return castForTesting(a9Var).getValueReference();
    }

    public ca newWeakValueReferenceForTesting(a9 a9Var, Object obj) {
        return new da(this.f76556j, obj, castForTesting(a9Var));
    }

    public void setWeakValueReferenceForTesting(a9 a9Var, ca caVar) {
        o9 o9VarCastForTesting = castForTesting(a9Var);
        ca caVar2 = o9VarCastForTesting.f76529c;
        o9VarCastForTesting.f76529c = caVar;
        caVar2.clear();
    }

    public o9 castForTesting(a9 a9Var) {
        return (o9) a9Var;
    }

    @Override // nh.e9
    public final e9 k() {
        return this;
    }
}
