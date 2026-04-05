package com.explorestack.protobuf;

import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class a5 extends d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c5 f21847a;

    public a5(c5 c5Var) {
        this.f21847a = c5Var;
    }

    @Override // com.explorestack.protobuf.d, com.explorestack.protobuf.fa
    public c5 parsePartialFrom(y yVar, m5 m5Var) throws InvalidProtocolBufferException {
        b5 b5VarNewBuilder = c5.newBuilder(this.f21847a.f21982b);
        try {
            b5VarNewBuilder.mergeFrom(yVar, m5Var);
            return b5VarNewBuilder.buildPartial();
        } catch (InvalidProtocolBufferException e10) {
            throw e10.setUnfinishedMessage(b5VarNewBuilder.buildPartial());
        } catch (IOException e11) {
            throw new InvalidProtocolBufferException(e11).setUnfinishedMessage(b5VarNewBuilder.buildPartial());
        }
    }
}
