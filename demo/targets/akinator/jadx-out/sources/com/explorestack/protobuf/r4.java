package com.explorestack.protobuf;

import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class r4 extends d {
    @Override // com.explorestack.protobuf.d, com.explorestack.protobuf.fa
    public t4 parsePartialFrom(y yVar, m5 m5Var) throws InvalidProtocolBufferException {
        t4 t4Var = new t4();
        m5Var.getClass();
        cc ccVarNewBuilder = gc.newBuilder();
        boolean z10 = false;
        while (!z10) {
            try {
                try {
                    int tag = yVar.readTag();
                    if (tag != 0) {
                        if (tag == 10) {
                            ByteString bytes = yVar.readBytes();
                            t4Var.f22657b = 1 | t4Var.f22657b;
                            t4Var.f22658c = bytes;
                        } else if (tag == 16) {
                            t4Var.f22657b |= 2;
                            t4Var.f22659e = yVar.readBool();
                        } else if (!t4Var.parseUnknownField(yVar, ccVarNewBuilder, m5Var, tag)) {
                        }
                    }
                    z10 = true;
                } catch (InvalidProtocolBufferException e10) {
                    throw e10.setUnfinishedMessage(t4Var);
                } catch (IOException e11) {
                    throw new InvalidProtocolBufferException(e11).setUnfinishedMessage(t4Var);
                }
            } catch (Throwable th2) {
                t4Var.unknownFields = ccVarNewBuilder.build();
                t4Var.makeExtensionsImmutable();
                throw th2;
            }
        }
        t4Var.unknownFields = ccVarNewBuilder.build();
        t4Var.makeExtensionsImmutable();
        return t4Var;
    }
}
