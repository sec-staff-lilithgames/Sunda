package com.moloco.sdk;

import com.google.protobuf.Internal;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class t2 implements Internal.ListAdapter.Converter {
    @Override // com.google.protobuf.Internal.ListAdapter.Converter
    public x2 convert(Integer num) {
        x2 x2VarForNumber = x2.forNumber(num.intValue());
        return x2VarForNumber == null ? x2.IMG : x2VarForNumber;
    }
}
