package cw;

import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public interface f0 {
    static /* synthetic */ boolean hasNext$default(f0 f0Var, u uVar, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: hasNext");
        }
        if ((i10 & 1) != 0) {
            uVar = null;
        }
        return f0Var.hasNext(uVar);
    }

    xv.a getAddress();

    uu.u getDeferredPlans();

    boolean hasNext(u uVar);

    boolean isCanceled();

    e0 plan() throws IOException;

    boolean sameHostAndPort(xv.g0 g0Var);
}
