package com.explorestack.protobuf;

import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class r3 extends d {
    @Override // com.explorestack.protobuf.d, com.explorestack.protobuf.fa
    public t3 parsePartialFrom(y yVar, m5 m5Var) throws InvalidProtocolBufferException {
        t3 t3Var = new t3();
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
                            t3Var.f22651b = 1 | t3Var.f22651b;
                            t3Var.f22652c = bytes;
                        } else if (tag == 18) {
                            w3 builder = (t3Var.f22651b & 2) != 0 ? t3Var.f22653e.toBuilder() : null;
                            x3 x3Var = (x3) yVar.readMessage(x3.f22830g, m5Var);
                            t3Var.f22653e = x3Var;
                            if (builder != null) {
                                builder.mergeFrom(x3Var);
                                t3Var.f22653e = builder.buildPartial();
                            }
                            t3Var.f22651b |= 2;
                        } else if (!t3Var.parseUnknownField(yVar, ccVarNewBuilder, m5Var, tag)) {
                        }
                    }
                    z10 = true;
                } catch (InvalidProtocolBufferException e10) {
                    throw e10.setUnfinishedMessage(t3Var);
                } catch (IOException e11) {
                    throw new InvalidProtocolBufferException(e11).setUnfinishedMessage(t3Var);
                }
            } catch (Throwable th2) {
                t3Var.unknownFields = ccVarNewBuilder.build();
                t3Var.makeExtensionsImmutable();
                throw th2;
            }
        }
        t3Var.unknownFields = ccVarNewBuilder.build();
        t3Var.makeExtensionsImmutable();
        return t3Var;
    }
}
