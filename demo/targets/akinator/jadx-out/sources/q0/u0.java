package q0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class u0 {
    public static /* synthetic */ String toDebugString$default(u0 u0Var, String str, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: toDebugString");
        }
        if ((i10 & 1) != 0) {
            str = "  ";
        }
        return u0Var.toDebugString(str);
    }

    public abstract String toDebugString(String str);
}
