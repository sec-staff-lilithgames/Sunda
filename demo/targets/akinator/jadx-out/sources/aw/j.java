package aw;

import java.io.IOException;
import kotlin.jvm.internal.e0;
import pw.n0;
import pw.s;
import pw.z0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class j extends s {
    @Override // pw.s, pw.r
    public z0 sink(n0 file, boolean z10) throws IOException {
        e0.checkNotNullParameter(file, "file");
        n0 n0VarParent = file.parent();
        if (n0VarParent != null) {
            createDirectories(n0VarParent);
        }
        return super.sink(file, z10);
    }
}
