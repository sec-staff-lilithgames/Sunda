package nh;

import java.lang.ref.ReferenceQueue;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class aa extends e9 {

    /* renamed from: j, reason: collision with root package name */
    public final ReferenceQueue f76094j;

    /* renamed from: k, reason: collision with root package name */
    public final ReferenceQueue f76095k;

    public aa(fa faVar, int i10) {
        super(faVar, i10);
        this.f76094j = new ReferenceQueue();
        this.f76095k = new ReferenceQueue();
    }

    @Override // nh.e9
    public final void e() {
        while (this.f76094j.poll() != null) {
        }
    }

    @Override // nh.e9
    public final void f() {
        a(this.f76094j);
        b(this.f76095k);
    }

    public ca getWeakValueReferenceForTesting(a9 a9Var) {
        return castForTesting(a9Var).getValueReference();
    }

    public ca newWeakValueReferenceForTesting(a9 a9Var, Object obj) {
        return new da(this.f76095k, obj, castForTesting(a9Var));
    }

    public void setWeakValueReferenceForTesting(a9 a9Var, ca caVar) {
        z9 z9VarCastForTesting = castForTesting(a9Var);
        ca caVar2 = z9VarCastForTesting.f76821b;
        z9VarCastForTesting.f76821b = caVar;
        caVar2.clear();
    }

    public z9 castForTesting(a9 a9Var) {
        return (z9) a9Var;
    }

    @Override // nh.e9
    public final e9 k() {
        return this;
    }
}
