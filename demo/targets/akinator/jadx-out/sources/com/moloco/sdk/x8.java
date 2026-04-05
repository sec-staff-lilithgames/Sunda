package com.moloco.sdk;

import com.google.protobuf.Internal;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class x8 implements Internal.ListAdapter.Converter {
    @Override // com.google.protobuf.Internal.ListAdapter.Converter
    public h9 convert(Integer num) {
        h9 h9VarForNumber = h9.forNumber(num.intValue());
        return h9VarForNumber == null ? h9.UNRECOGNIZED : h9VarForNumber;
    }
}
