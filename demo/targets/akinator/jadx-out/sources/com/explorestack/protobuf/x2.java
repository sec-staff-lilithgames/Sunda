package com.explorestack.protobuf;

import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class x2 extends d {
    @Override // com.explorestack.protobuf.d, com.explorestack.protobuf.fa
    public z2 parsePartialFrom(y yVar, m5 m5Var) throws InvalidProtocolBufferException {
        z2 z2Var = new z2();
        m5Var.getClass();
        cc ccVarNewBuilder = gc.newBuilder();
        boolean z10 = false;
        boolean z11 = false;
        while (!z10) {
            try {
                try {
                    try {
                        int tag = yVar.readTag();
                        if (tag != 0) {
                            if (tag == 8) {
                                if (!z11) {
                                    z2Var.f22942c = k7.newIntList();
                                    z11 = true;
                                }
                                ((l7) z2Var.f22942c).addInt(yVar.readInt32());
                            } else if (tag == 10) {
                                int iPushLimit = yVar.pushLimit(yVar.readRawVarint32());
                                if (!z11 && yVar.getBytesUntilLimit() > 0) {
                                    z2Var.f22942c = k7.newIntList();
                                    z11 = true;
                                }
                                while (yVar.getBytesUntilLimit() > 0) {
                                    ((l7) z2Var.f22942c).addInt(yVar.readInt32());
                                }
                                yVar.popLimit(iPushLimit);
                            } else if (tag == 18) {
                                ByteString bytes = yVar.readBytes();
                                z2Var.f22941b = 1 | z2Var.f22941b;
                                z2Var.f22944f = bytes;
                            } else if (tag == 24) {
                                z2Var.f22941b |= 2;
                                z2Var.f22945g = yVar.readInt32();
                            } else if (tag == 32) {
                                z2Var.f22941b |= 4;
                                z2Var.f22946h = yVar.readInt32();
                            } else if (!z2Var.parseUnknownField(yVar, ccVarNewBuilder, m5Var, tag)) {
                            }
                        }
                        z10 = true;
                    } catch (IOException e10) {
                        throw new InvalidProtocolBufferException(e10).setUnfinishedMessage(z2Var);
                    }
                } catch (InvalidProtocolBufferException e11) {
                    throw e11.setUnfinishedMessage(z2Var);
                }
            } catch (Throwable th2) {
                if (z11) {
                    ((e) z2Var.f22942c).makeImmutable();
                }
                z2Var.unknownFields = ccVarNewBuilder.build();
                z2Var.makeExtensionsImmutable();
                throw th2;
            }
        }
        if (z11) {
            ((e) z2Var.f22942c).makeImmutable();
        }
        z2Var.unknownFields = ccVarNewBuilder.build();
        z2Var.makeExtensionsImmutable();
        return z2Var;
    }
}
