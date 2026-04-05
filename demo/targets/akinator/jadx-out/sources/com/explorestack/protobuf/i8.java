package com.explorestack.protobuf;

import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class i8 extends j8 {
    @Override // com.explorestack.protobuf.j8
    public final void a(Object obj, long j10) {
        ((w7) sc.f22643c.getObject(obj, j10)).makeImmutable();
    }

    @Override // com.explorestack.protobuf.j8
    public final void b(Object obj, Object obj2, long j10) {
        rc rcVar = sc.f22643c;
        w7 w7VarMutableCopyWithCapacity = (w7) rcVar.getObject(obj, j10);
        w7 w7Var = (w7) rcVar.getObject(obj2, j10);
        int size = w7VarMutableCopyWithCapacity.size();
        int size2 = w7Var.size();
        if (size > 0 && size2 > 0) {
            if (!w7VarMutableCopyWithCapacity.isModifiable()) {
                w7VarMutableCopyWithCapacity = w7VarMutableCopyWithCapacity.mutableCopyWithCapacity(size2 + size);
            }
            w7VarMutableCopyWithCapacity.addAll(w7Var);
        }
        if (size > 0) {
            w7Var = w7VarMutableCopyWithCapacity;
        }
        sc.s(obj, j10, w7Var);
    }

    @Override // com.explorestack.protobuf.j8
    public final List c(Object obj, long j10) {
        w7 w7Var = (w7) sc.f22643c.getObject(obj, j10);
        if (w7Var.isModifiable()) {
            return w7Var;
        }
        int size = w7Var.size();
        w7 w7VarMutableCopyWithCapacity = w7Var.mutableCopyWithCapacity(size == 0 ? 10 : size * 2);
        sc.s(obj, j10, w7VarMutableCopyWithCapacity);
        return w7VarMutableCopyWithCapacity;
    }
}
