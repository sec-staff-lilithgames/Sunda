package w2;

import sh.n1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class f implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final s f90341b;

    /* renamed from: c, reason: collision with root package name */
    public final n1 f90342c;

    public f(s sVar, n1 n1Var) {
        this.f90341b = sVar;
        this.f90342c = n1Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f90341b.f90350b != this) {
            return;
        }
        if (i.f90348h.g(this.f90341b, this, i.f(this.f90342c))) {
            i.c(this.f90341b);
        }
    }
}
