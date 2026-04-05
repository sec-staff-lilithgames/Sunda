package d7;

import java.io.IOException;
import pw.n0;
import pw.s;
import pw.z0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class f extends s {
    @Override // pw.s, pw.r
    public z0 sink(n0 n0Var, boolean z10) throws IOException {
        n0 n0VarParent = n0Var.parent();
        if (n0VarParent != null) {
            createDirectories(n0VarParent);
        }
        return super.sink(n0Var, z10);
    }
}
