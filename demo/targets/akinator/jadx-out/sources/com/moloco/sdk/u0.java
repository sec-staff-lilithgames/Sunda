package com.moloco.sdk;

import com.google.protobuf.Internal;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class u0 implements Internal.ListAdapter.Converter {
    @Override // com.google.protobuf.Internal.ListAdapter.Converter
    public a1 convert(Integer num) {
        a1 a1VarForNumber = a1.forNumber(num.intValue());
        return a1VarForNumber == null ? a1.XHTML_TEXT_AD : a1VarForNumber;
    }
}
