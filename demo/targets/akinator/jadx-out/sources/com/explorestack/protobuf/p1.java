package com.explorestack.protobuf;

import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class p1 extends d {
    @Override // com.explorestack.protobuf.d, com.explorestack.protobuf.fa
    public r1 parsePartialFrom(y yVar, m5 m5Var) throws InvalidProtocolBufferException {
        r1 r1Var = new r1();
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
                            r1Var.f22533b = 1 | r1Var.f22533b;
                            r1Var.f22534c = bytes;
                        } else if (tag == 16) {
                            r1Var.f22533b |= 2;
                            r1Var.f22535e = yVar.readInt32();
                        } else if (tag == 26) {
                            u1 builder = (r1Var.f22533b & 4) != 0 ? r1Var.f22536f.toBuilder() : null;
                            v1 v1Var = (v1) yVar.readMessage(v1.f22751i, m5Var);
                            r1Var.f22536f = v1Var;
                            if (builder != null) {
                                builder.mergeFrom(v1Var);
                                r1Var.f22536f = builder.buildPartial();
                            }
                            r1Var.f22533b |= 4;
                        } else if (!r1Var.parseUnknownField(yVar, ccVarNewBuilder, m5Var, tag)) {
                        }
                    }
                    z10 = true;
                } catch (InvalidProtocolBufferException e10) {
                    throw e10.setUnfinishedMessage(r1Var);
                } catch (IOException e11) {
                    throw new InvalidProtocolBufferException(e11).setUnfinishedMessage(r1Var);
                }
            } catch (Throwable th2) {
                r1Var.unknownFields = ccVarNewBuilder.build();
                r1Var.makeExtensionsImmutable();
                throw th2;
            }
        }
        r1Var.unknownFields = ccVarNewBuilder.build();
        r1Var.makeExtensionsImmutable();
        return r1Var;
    }
}
