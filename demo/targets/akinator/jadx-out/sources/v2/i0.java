package v2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class i0 {
    public static final boolean shouldApplySecureFlag(g0 g0Var, boolean z10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(g0Var, "<this>");
        int i10 = h0.$EnumSwitchMapping$0[g0Var.ordinal()];
        if (i10 == 1) {
            return false;
        }
        if (i10 == 2) {
            return true;
        }
        if (i10 == 3) {
            return z10;
        }
        throw new tu.t();
    }
}
