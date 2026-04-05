package com.explorestack.protobuf;

import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class fc extends d {
    @Override // com.explorestack.protobuf.d, com.explorestack.protobuf.fa
    public gc parsePartialFrom(y yVar, m5 m5Var) throws InvalidProtocolBufferException {
        cc ccVarNewBuilder = gc.newBuilder();
        try {
            ccVarNewBuilder.mergeFrom(yVar);
            return ccVarNewBuilder.buildPartial();
        } catch (InvalidProtocolBufferException e10) {
            throw e10.setUnfinishedMessage(ccVarNewBuilder.buildPartial());
        } catch (IOException e11) {
            throw new InvalidProtocolBufferException(e11).setUnfinishedMessage(ccVarNewBuilder.buildPartial());
        }
    }
}
