package com.moloco.sdk;

import com.google.protobuf.Internal;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class f4 implements Internal.ListAdapter.Converter {
    @Override // com.google.protobuf.Internal.ListAdapter.Converter
    public d0 convert(Integer num) {
        d0 d0VarForNumber = d0.forNumber(num.intValue());
        return d0VarForNumber == null ? d0.VPAID_1 : d0VarForNumber;
    }
}
