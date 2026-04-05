package aw;

import com.ironsource.C3271ic;
import kotlin.jvm.internal.e0;
import xv.g0;
import xv.o0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public abstract class c {
    public static final o0 access$requestForCache(o0 o0Var) {
        g0 g0VarCacheUrlOverride = o0Var.cacheUrlOverride();
        return g0VarCacheUrlOverride != null ? (e0.areEqual(o0Var.method(), C3271ic.f36943a) || e0.areEqual(o0Var.method(), C3271ic.f36944b)) ? o0Var.newBuilder().get().url(g0VarCacheUrlOverride).cacheUrlOverride(null).build() : o0Var : o0Var;
    }
}
