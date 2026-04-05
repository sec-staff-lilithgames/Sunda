package com.explorestack.protobuf;

import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class m extends d {
    @Override // com.explorestack.protobuf.d, com.explorestack.protobuf.fa
    public o parsePartialFrom(y yVar, m5 m5Var) throws InvalidProtocolBufferException {
        o oVar = new o();
        m5Var.getClass();
        cc ccVarNewBuilder = gc.newBuilder();
        boolean z10 = false;
        while (!z10) {
            try {
                try {
                    int tag = yVar.readTag();
                    if (tag != 0) {
                        if (tag == 8) {
                            oVar.f22409b = yVar.readBool();
                        } else if (!oVar.parseUnknownField(yVar, ccVarNewBuilder, m5Var, tag)) {
                        }
                    }
                    z10 = true;
                } catch (InvalidProtocolBufferException e10) {
                    throw e10.setUnfinishedMessage(oVar);
                } catch (IOException e11) {
                    throw new InvalidProtocolBufferException(e11).setUnfinishedMessage(oVar);
                }
            } catch (Throwable th2) {
                oVar.unknownFields = ccVarNewBuilder.build();
                oVar.makeExtensionsImmutable();
                throw th2;
            }
        }
        oVar.unknownFields = ccVarNewBuilder.build();
        oVar.makeExtensionsImmutable();
        return oVar;
    }
}
