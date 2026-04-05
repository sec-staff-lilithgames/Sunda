package com.explorestack.protobuf;

import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class i3 extends d {
    @Override // com.explorestack.protobuf.d, com.explorestack.protobuf.fa
    public k3 parsePartialFrom(y yVar, m5 m5Var) throws InvalidProtocolBufferException {
        k3 k3Var = new k3();
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
                            k3Var.f22293b = 1 | k3Var.f22293b;
                            k3Var.f22294c = bytes;
                        } else if (tag == 18) {
                            ByteString bytes2 = yVar.readBytes();
                            k3Var.f22293b |= 2;
                            k3Var.f22295e = bytes2;
                        } else if (tag == 26) {
                            ByteString bytes3 = yVar.readBytes();
                            k3Var.f22293b |= 4;
                            k3Var.f22296f = bytes3;
                        } else if (tag == 34) {
                            n3 builder = (k3Var.f22293b & 8) != 0 ? k3Var.f22297g.toBuilder() : null;
                            p3 p3Var = (p3) yVar.readMessage(p3.f22482j, m5Var);
                            k3Var.f22297g = p3Var;
                            if (builder != null) {
                                builder.mergeFrom(p3Var);
                                k3Var.f22297g = builder.buildPartial();
                            }
                            k3Var.f22293b |= 8;
                        } else if (tag == 40) {
                            k3Var.f22293b |= 16;
                            k3Var.f22298h = yVar.readBool();
                        } else if (tag == 48) {
                            k3Var.f22293b |= 32;
                            k3Var.f22299i = yVar.readBool();
                        } else if (!k3Var.parseUnknownField(yVar, ccVarNewBuilder, m5Var, tag)) {
                        }
                    }
                    z10 = true;
                } catch (InvalidProtocolBufferException e10) {
                    throw e10.setUnfinishedMessage(k3Var);
                } catch (IOException e11) {
                    throw new InvalidProtocolBufferException(e11).setUnfinishedMessage(k3Var);
                }
            } catch (Throwable th2) {
                k3Var.unknownFields = ccVarNewBuilder.build();
                k3Var.makeExtensionsImmutable();
                throw th2;
            }
        }
        k3Var.unknownFields = ccVarNewBuilder.build();
        k3Var.makeExtensionsImmutable();
        return k3Var;
    }
}
