package com.explorestack.protobuf;

import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class x0 extends d {
    @Override // com.explorestack.protobuf.d, com.explorestack.protobuf.fa
    public z0 parsePartialFrom(y yVar, m5 m5Var) throws InvalidProtocolBufferException {
        z0 z0Var = new z0();
        m5Var.getClass();
        cc ccVarNewBuilder = gc.newBuilder();
        boolean z10 = false;
        while (!z10) {
            try {
                try {
                    int tag = yVar.readTag();
                    if (tag != 0) {
                        if (tag == 8) {
                            z0Var.f22931b |= 1;
                            z0Var.f22932c = yVar.readInt32();
                        } else if (tag == 16) {
                            z0Var.f22931b |= 2;
                            z0Var.f22933e = yVar.readInt32();
                        } else if (!z0Var.parseUnknownField(yVar, ccVarNewBuilder, m5Var, tag)) {
                        }
                    }
                    z10 = true;
                } catch (InvalidProtocolBufferException e10) {
                    throw e10.setUnfinishedMessage(z0Var);
                } catch (IOException e11) {
                    throw new InvalidProtocolBufferException(e11).setUnfinishedMessage(z0Var);
                }
            } catch (Throwable th2) {
                z0Var.unknownFields = ccVarNewBuilder.build();
                z0Var.makeExtensionsImmutable();
                throw th2;
            }
        }
        z0Var.unknownFields = ccVarNewBuilder.build();
        z0Var.makeExtensionsImmutable();
        return z0Var;
    }
}
