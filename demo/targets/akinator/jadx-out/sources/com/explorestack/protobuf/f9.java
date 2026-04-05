package com.explorestack.protobuf;

import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class f9 implements d9 {
    @Override // com.explorestack.protobuf.d9
    public Map<?, ?> forMapData(Object obj) {
        return (c9) obj;
    }

    @Override // com.explorestack.protobuf.d9
    public t8 forMapMetadata(Object obj) {
        return ((u8) obj).f22720a;
    }

    @Override // com.explorestack.protobuf.d9
    public Map<?, ?> forMutableMapData(Object obj) {
        return (c9) obj;
    }

    @Override // com.explorestack.protobuf.d9
    public int getSerializedSize(int i10, Object obj, Object obj2) {
        c9 c9Var = (c9) obj;
        u8 u8Var = (u8) obj2;
        int iComputeMessageSize = 0;
        if (c9Var.isEmpty()) {
            return 0;
        }
        for (Map.Entry<Object, Object> entry : c9Var.entrySet()) {
            iComputeMessageSize += u8Var.computeMessageSize(i10, entry.getKey(), entry.getValue());
        }
        return iComputeMessageSize;
    }

    @Override // com.explorestack.protobuf.d9
    public boolean isImmutable(Object obj) {
        return !((c9) obj).isMutable();
    }

    @Override // com.explorestack.protobuf.d9
    public Object mergeFrom(Object obj, Object obj2) {
        c9 c9VarMutableCopy = (c9) obj;
        c9 c9Var = (c9) obj2;
        if (!c9Var.isEmpty()) {
            if (!c9VarMutableCopy.isMutable()) {
                c9VarMutableCopy = c9VarMutableCopy.mutableCopy();
            }
            c9VarMutableCopy.mergeFrom(c9Var);
        }
        return c9VarMutableCopy;
    }

    @Override // com.explorestack.protobuf.d9
    public Object newMapField(Object obj) {
        return c9.emptyMapField().mutableCopy();
    }

    @Override // com.explorestack.protobuf.d9
    public Object toImmutable(Object obj) {
        ((c9) obj).makeImmutable();
        return obj;
    }
}
