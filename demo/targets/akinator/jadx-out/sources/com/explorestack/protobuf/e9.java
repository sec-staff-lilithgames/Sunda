package com.explorestack.protobuf;

import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class e9 implements d9 {
    @Override // com.explorestack.protobuf.d9
    public Map<?, ?> forMapData(Object obj) {
        return ((b9) obj).getMap();
    }

    @Override // com.explorestack.protobuf.d9
    public t8 forMapMetadata(Object obj) {
        return ((s8) obj).f22628e;
    }

    @Override // com.explorestack.protobuf.d9
    public Map<?, ?> forMutableMapData(Object obj) {
        return ((b9) obj).getMutableMap();
    }

    @Override // com.explorestack.protobuf.d9
    public int getSerializedSize(int i10, Object obj, Object obj2) {
        int iC = 0;
        if (obj != null) {
            Map<Object, Object> map = ((b9) obj).getMap();
            s8 s8Var = (s8) obj2;
            if (!map.isEmpty()) {
                for (Map.Entry<Object, Object> entry : map.entrySet()) {
                    int iComputeTagSize = h0.computeTagSize(i10);
                    int iA = u8.a(s8Var.f22628e, entry.getKey(), entry.getValue());
                    iC = com.bytedance.sdk.component.adexpress.dynamic.dynamicview.a.c(iA, iA, iComputeTagSize, iC);
                }
                return iC;
            }
        }
        return 0;
    }

    @Override // com.explorestack.protobuf.d9
    public boolean isImmutable(Object obj) {
        return !((b9) obj).isMutable();
    }

    @Override // com.explorestack.protobuf.d9
    public Object mergeFrom(Object obj, Object obj2) {
        b9 b9Var = (b9) obj;
        b9 b9Var2 = (b9) obj2;
        if (!b9Var.isMutable()) {
            b9Var.copy();
        }
        b9Var.mergeFrom(b9Var2);
        return b9Var;
    }

    @Override // com.explorestack.protobuf.d9
    public Object newMapField(Object obj) {
        return b9.newMapField((s8) obj);
    }

    @Override // com.explorestack.protobuf.d9
    public Object toImmutable(Object obj) {
        ((b9) obj).makeImmutable();
        return obj;
    }
}
