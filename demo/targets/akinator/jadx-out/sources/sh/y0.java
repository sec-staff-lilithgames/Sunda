package sh;

import com.ironsource.C3191e4;
import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class y0 extends k {

    /* renamed from: j, reason: collision with root package name */
    public z0 f85883j;

    @Override // sh.k, java.util.concurrent.Future
    public boolean cancel(boolean z10) {
        z0 z0Var = this.f85883j;
        if (!super.cancel(z10)) {
            return false;
        }
        Objects.requireNonNull(z0Var);
        z0Var.f85890a = true;
        if (!z10) {
            z0Var.f85891b = false;
        }
        z0Var.a();
        return true;
    }

    @Override // sh.k
    public final void d() {
        this.f85883j = null;
    }

    @Override // sh.k
    public final String l() {
        z0 z0Var = this.f85883j;
        if (z0Var == null) {
            return null;
        }
        return "inputCount=[" + z0Var.f85893d.length + "], remaining=[" + z0Var.f85892c.get() + C3191e4.i.f36531e;
    }
}
