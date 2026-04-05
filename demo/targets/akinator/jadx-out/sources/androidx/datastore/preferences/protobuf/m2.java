package androidx.datastore.preferences.protobuf;

import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class m2 implements l2 {
    @Override // androidx.datastore.preferences.protobuf.l2
    public Map<?, ?> forMapData(Object obj) {
        return (k2) obj;
    }

    @Override // androidx.datastore.preferences.protobuf.l2
    public i2 forMapMetadata(Object obj) {
        return ((j2) obj).f5917a;
    }

    @Override // androidx.datastore.preferences.protobuf.l2
    public Map<?, ?> forMutableMapData(Object obj) {
        return (k2) obj;
    }

    @Override // androidx.datastore.preferences.protobuf.l2
    public int getSerializedSize(int i10, Object obj, Object obj2) {
        k2 k2Var = (k2) obj;
        j2 j2Var = (j2) obj2;
        int iComputeMessageSize = 0;
        if (k2Var.isEmpty()) {
            return 0;
        }
        for (Map.Entry<Object, Object> entry : k2Var.entrySet()) {
            iComputeMessageSize += j2Var.computeMessageSize(i10, entry.getKey(), entry.getValue());
        }
        return iComputeMessageSize;
    }

    @Override // androidx.datastore.preferences.protobuf.l2
    public boolean isImmutable(Object obj) {
        return !((k2) obj).isMutable();
    }

    @Override // androidx.datastore.preferences.protobuf.l2
    public Object mergeFrom(Object obj, Object obj2) {
        k2 k2VarMutableCopy = (k2) obj;
        k2 k2Var = (k2) obj2;
        if (!k2Var.isEmpty()) {
            if (!k2VarMutableCopy.isMutable()) {
                k2VarMutableCopy = k2VarMutableCopy.mutableCopy();
            }
            k2VarMutableCopy.mergeFrom(k2Var);
        }
        return k2VarMutableCopy;
    }

    @Override // androidx.datastore.preferences.protobuf.l2
    public Object newMapField(Object obj) {
        return k2.emptyMapField().mutableCopy();
    }

    @Override // androidx.datastore.preferences.protobuf.l2
    public Object toImmutable(Object obj) {
        ((k2) obj).makeImmutable();
        return obj;
    }
}
