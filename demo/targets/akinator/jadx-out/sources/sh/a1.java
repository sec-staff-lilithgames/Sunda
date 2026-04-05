package sh;

import com.ironsource.C3191e4;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class a1 extends j implements Runnable {

    /* renamed from: j, reason: collision with root package name */
    public n1 f85773j;

    @Override // sh.k
    public final void d() {
        this.f85773j = null;
    }

    @Override // sh.k
    public final String l() {
        n1 n1Var = this.f85773j;
        if (n1Var == null) {
            return null;
        }
        return "delegate=[" + n1Var + C3191e4.i.f36531e;
    }

    @Override // java.lang.Runnable
    public void run() {
        n1 n1Var = this.f85773j;
        if (n1Var != null) {
            setFuture(n1Var);
        }
    }
}
