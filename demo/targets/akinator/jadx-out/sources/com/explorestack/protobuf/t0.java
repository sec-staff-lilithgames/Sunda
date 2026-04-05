package com.explorestack.protobuf;

import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class t0 extends d {
    @Override // com.explorestack.protobuf.d, com.explorestack.protobuf.fa
    public v0 parsePartialFrom(y yVar, m5 m5Var) throws InvalidProtocolBufferException {
        v0 v0Var = new v0();
        m5Var.getClass();
        cc ccVarNewBuilder = gc.newBuilder();
        boolean z10 = false;
        while (!z10) {
            try {
                try {
                    int tag = yVar.readTag();
                    if (tag != 0) {
                        if (tag == 8) {
                            v0Var.f22745b |= 1;
                            v0Var.f22746c = yVar.readInt32();
                        } else if (tag == 16) {
                            v0Var.f22745b |= 2;
                            v0Var.f22747e = yVar.readInt32();
                        } else if (tag == 26) {
                            y1 builder = (v0Var.f22745b & 4) != 0 ? v0Var.f22748f.toBuilder() : null;
                            z1 z1Var = (z1) yVar.readMessage(z1.f22936g, m5Var);
                            v0Var.f22748f = z1Var;
                            if (builder != null) {
                                builder.mergeFrom(z1Var);
                                v0Var.f22748f = builder.buildPartial();
                            }
                            v0Var.f22745b |= 4;
                        } else if (!v0Var.parseUnknownField(yVar, ccVarNewBuilder, m5Var, tag)) {
                        }
                    }
                    z10 = true;
                } catch (InvalidProtocolBufferException e10) {
                    throw e10.setUnfinishedMessage(v0Var);
                } catch (IOException e11) {
                    throw new InvalidProtocolBufferException(e11).setUnfinishedMessage(v0Var);
                }
            } catch (Throwable th2) {
                v0Var.unknownFields = ccVarNewBuilder.build();
                v0Var.makeExtensionsImmutable();
                throw th2;
            }
        }
        v0Var.unknownFields = ccVarNewBuilder.build();
        v0Var.makeExtensionsImmutable();
        return v0Var;
    }
}
