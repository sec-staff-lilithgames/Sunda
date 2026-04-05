package com.fyber.inneractive.sdk.protobuf;

import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class s1 extends t1 {
    @Override // com.fyber.inneractive.sdk.protobuf.t1
    public final void a(Object obj, long j10) {
        ((c) ((k1) x3.e(obj, j10))).f26354a = false;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.t1
    public final List b(Object obj, long j10) {
        k1 k1Var = (k1) x3.e(obj, j10);
        if (((c) k1Var).f26354a) {
            return k1Var;
        }
        int size = k1Var.size();
        k1 k1VarB = k1Var.b(size == 0 ? 10 : size * 2);
        x3.a(j10, obj, k1VarB);
        return k1VarB;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.t1
    public final void a(long j10, Object obj, Object obj2) {
        k1 k1VarB = (k1) x3.e(obj, j10);
        k1 k1Var = (k1) x3.e(obj2, j10);
        int size = k1VarB.size();
        int size2 = k1Var.size();
        if (size > 0 && size2 > 0) {
            if (!((c) k1VarB).f26354a) {
                k1VarB = k1VarB.b(size2 + size);
            }
            k1VarB.addAll(k1Var);
        }
        if (size > 0) {
            k1Var = k1VarB;
        }
        x3.a(j10, obj, k1Var);
    }
}
