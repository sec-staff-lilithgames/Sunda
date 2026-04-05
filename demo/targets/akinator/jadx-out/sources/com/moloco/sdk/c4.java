package com.moloco.sdk;

import com.google.protobuf.Internal;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class c4 implements Internal.ListAdapter.Converter {
    @Override // com.google.protobuf.Internal.ListAdapter.Converter
    public r1 convert(Integer num) {
        r1 r1VarForNumber = r1.forNumber(num.intValue());
        return r1VarForNumber == null ? r1.AUDIO_AUTO_PLAY : r1VarForNumber;
    }
}
