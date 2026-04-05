package com.moloco.sdk;

import com.google.protobuf.Internal;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class b4 implements Internal.ListAdapter.Converter {
    @Override // com.google.protobuf.Internal.ListAdapter.Converter
    public u3 convert(Integer num) {
        u3 u3VarForNumber = u3.forNumber(num.intValue());
        return u3VarForNumber == null ? u3.VAST_1_0 : u3VarForNumber;
    }
}
