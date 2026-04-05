package com.moloco.sdk;

import com.google.protobuf.Internal;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class w0 implements Internal.ListAdapter.Converter {
    @Override // com.google.protobuf.Internal.ListAdapter.Converter
    public e1 convert(Integer num) {
        e1 e1VarForNumber = e1.forNumber(num.intValue());
        return e1VarForNumber == null ? e1.LEFT : e1VarForNumber;
    }
}
