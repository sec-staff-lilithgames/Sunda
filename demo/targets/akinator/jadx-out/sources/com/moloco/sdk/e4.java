package com.moloco.sdk;

import com.google.protobuf.Internal;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class e4 implements Internal.ListAdapter.Converter {
    @Override // com.google.protobuf.Internal.ListAdapter.Converter
    public o1 convert(Integer num) {
        o1 o1VarForNumber = o1.forNumber(num.intValue());
        return o1VarForNumber == null ? o1.STREAMING : o1VarForNumber;
    }
}
