package androidx.datastore.preferences.protobuf;

import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class c2 implements b2 {
    @Override // androidx.datastore.preferences.protobuf.b2
    public void makeImmutableListAt(Object obj, long j10) {
        ((d) ((s1) j4.f5924c.getObject(obj, j10))).makeImmutable();
    }

    @Override // androidx.datastore.preferences.protobuf.b2
    public <E> void mergeListsAt(Object obj, Object obj2, long j10) {
        i4 i4Var = j4.f5924c;
        s1 s1VarMutableCopyWithCapacity = (s1) i4Var.getObject(obj, j10);
        s1 s1Var = (s1) i4Var.getObject(obj2, j10);
        int size = s1VarMutableCopyWithCapacity.size();
        int size2 = s1Var.size();
        if (size > 0 && size2 > 0) {
            if (!((d) s1VarMutableCopyWithCapacity).isModifiable()) {
                s1VarMutableCopyWithCapacity = s1VarMutableCopyWithCapacity.mutableCopyWithCapacity(size2 + size);
            }
            s1VarMutableCopyWithCapacity.addAll(s1Var);
        }
        if (size > 0) {
            s1Var = s1VarMutableCopyWithCapacity;
        }
        j4.s(obj, j10, s1Var);
    }

    @Override // androidx.datastore.preferences.protobuf.b2
    public <L> List<L> mutableListAt(Object obj, long j10) {
        d dVar = (d) ((s1) j4.f5924c.getObject(obj, j10));
        if (dVar.isModifiable()) {
            return dVar;
        }
        int size = dVar.size();
        s1 s1VarMutableCopyWithCapacity = dVar.mutableCopyWithCapacity(size == 0 ? 10 : size * 2);
        j4.s(obj, j10, s1VarMutableCopyWithCapacity);
        return s1VarMutableCopyWithCapacity;
    }
}
