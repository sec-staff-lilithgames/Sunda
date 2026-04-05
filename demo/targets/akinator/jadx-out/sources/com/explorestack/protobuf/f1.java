package com.explorestack.protobuf;

import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class f1 extends d {
    @Override // com.explorestack.protobuf.d, com.explorestack.protobuf.fa
    public h1 parsePartialFrom(y yVar, m5 m5Var) throws InvalidProtocolBufferException {
        h1 h1Var = new h1();
        m5Var.getClass();
        cc ccVarNewBuilder = gc.newBuilder();
        boolean z10 = false;
        while (!z10) {
            try {
                try {
                    int tag = yVar.readTag();
                    if (tag != 0) {
                        if (tag == 8) {
                            h1Var.f22190b |= 1;
                            h1Var.f22191c = yVar.readInt32();
                        } else if (tag == 16) {
                            h1Var.f22190b |= 2;
                            h1Var.f22192e = yVar.readInt32();
                        } else if (!h1Var.parseUnknownField(yVar, ccVarNewBuilder, m5Var, tag)) {
                        }
                    }
                    z10 = true;
                } catch (InvalidProtocolBufferException e10) {
                    throw e10.setUnfinishedMessage(h1Var);
                } catch (IOException e11) {
                    throw new InvalidProtocolBufferException(e11).setUnfinishedMessage(h1Var);
                }
            } catch (Throwable th2) {
                h1Var.unknownFields = ccVarNewBuilder.build();
                h1Var.makeExtensionsImmutable();
                throw th2;
            }
        }
        h1Var.unknownFields = ccVarNewBuilder.build();
        h1Var.makeExtensionsImmutable();
        return h1Var;
    }
}
