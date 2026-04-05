package xv;

import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class m0 {
    public m0(kotlin.jvm.internal.u uVar) {
    }

    public final n0 get(String protocol) throws IOException {
        kotlin.jvm.internal.e0.checkNotNullParameter(protocol, "protocol");
        n0 n0Var = n0.f93759e;
        if (kotlin.jvm.internal.e0.areEqual(protocol, n0Var.f93768b)) {
            return n0Var;
        }
        n0 n0Var2 = n0.f93760f;
        if (kotlin.jvm.internal.e0.areEqual(protocol, n0Var2.f93768b)) {
            return n0Var2;
        }
        n0 n0Var3 = n0.f93763i;
        if (kotlin.jvm.internal.e0.areEqual(protocol, n0Var3.f93768b)) {
            return n0Var3;
        }
        n0 n0Var4 = n0.f93762h;
        if (kotlin.jvm.internal.e0.areEqual(protocol, n0Var4.f93768b)) {
            return n0Var4;
        }
        n0 n0Var5 = n0.f93761g;
        if (kotlin.jvm.internal.e0.areEqual(protocol, n0Var5.f93768b)) {
            return n0Var5;
        }
        n0 n0Var6 = n0.f93764j;
        if (kotlin.jvm.internal.e0.areEqual(protocol, n0Var6.f93768b)) {
            return n0Var6;
        }
        n0 n0Var7 = n0.f93765k;
        if (sv.k0.startsWith$default(protocol, n0Var7.f93768b, false, 2, null)) {
            return n0Var7;
        }
        throw new IOException(a.b.k("Unexpected protocol: ", protocol));
    }
}
