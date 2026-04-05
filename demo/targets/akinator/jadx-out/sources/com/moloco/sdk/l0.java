package com.moloco.sdk;

import com.google.protobuf.Internal;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class l0 implements Internal.ListAdapter.Converter {
    @Override // com.google.protobuf.Internal.ListAdapter.Converter
    public l1 convert(Integer num) {
        l1 l1VarForNumber = l1.forNumber(num.intValue());
        return l1VarForNumber == null ? l1.STATIC : l1VarForNumber;
    }
}
