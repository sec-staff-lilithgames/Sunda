package f;

import androidx.lifecycle.b1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class h0 {
    public static final x addCallback(d0 d0Var, b1 b1Var, boolean z10, kv.l onBackPressed) {
        kotlin.jvm.internal.e0.checkNotNullParameter(d0Var, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(onBackPressed, "onBackPressed");
        g0 g0Var = new g0(z10, onBackPressed);
        if (b1Var != null) {
            d0Var.addCallback(b1Var, g0Var);
            return g0Var;
        }
        d0Var.addCallback(g0Var);
        return g0Var;
    }

    public static /* synthetic */ x addCallback$default(d0 d0Var, b1 b1Var, boolean z10, kv.l lVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            b1Var = null;
        }
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        return addCallback(d0Var, b1Var, z10, lVar);
    }
}
