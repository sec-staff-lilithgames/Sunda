package com.moloco.sdk;

import com.google.protobuf.Internal;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class d4 implements Internal.ListAdapter.Converter {
    @Override // com.google.protobuf.Internal.ListAdapter.Converter
    public n4 convert(Integer num) {
        n4 n4VarForNumber = n4.forNumber(num.intValue());
        return n4VarForNumber == null ? n4.f47308c : n4VarForNumber;
    }
}
