package com.explorestack.protobuf;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class p4 extends d {
    @Override // com.explorestack.protobuf.d, com.explorestack.protobuf.fa
    public v4 parsePartialFrom(y yVar, m5 m5Var) throws InvalidProtocolBufferException {
        v4 v4Var = new v4();
        m5Var.getClass();
        cc ccVarNewBuilder = gc.newBuilder();
        boolean z10 = false;
        boolean z11 = false;
        while (!z10) {
            try {
                try {
                    int tag = yVar.readTag();
                    if (tag != 0) {
                        if (tag == 18) {
                            if (!z11) {
                                v4Var.f22759c = new ArrayList();
                                z11 = true;
                            }
                            v4Var.f22759c.add(yVar.readMessage(t4.f22656h, m5Var));
                        } else if (tag == 26) {
                            ByteString bytes = yVar.readBytes();
                            v4Var.f22758b = 1 | v4Var.f22758b;
                            v4Var.f22760e = bytes;
                        } else if (tag == 32) {
                            v4Var.f22758b |= 2;
                            v4Var.f22761f = yVar.readUInt64();
                        } else if (tag == 40) {
                            v4Var.f22758b |= 4;
                            v4Var.f22762g = yVar.readInt64();
                        } else if (tag == 49) {
                            v4Var.f22758b |= 8;
                            v4Var.f22763h = yVar.readDouble();
                        } else if (tag == 58) {
                            v4Var.f22758b |= 16;
                            v4Var.f22764i = yVar.readBytes();
                        } else if (tag == 66) {
                            ByteString bytes2 = yVar.readBytes();
                            v4Var.f22758b |= 32;
                            v4Var.f22765j = bytes2;
                        } else if (!v4Var.parseUnknownField(yVar, ccVarNewBuilder, m5Var, tag)) {
                        }
                    }
                    z10 = true;
                } catch (InvalidProtocolBufferException e10) {
                    throw e10.setUnfinishedMessage(v4Var);
                } catch (IOException e11) {
                    throw new InvalidProtocolBufferException(e11).setUnfinishedMessage(v4Var);
                }
            } catch (Throwable th2) {
                if (z11) {
                    v4Var.f22759c = Collections.unmodifiableList(v4Var.f22759c);
                }
                v4Var.unknownFields = ccVarNewBuilder.build();
                v4Var.makeExtensionsImmutable();
                throw th2;
            }
        }
        if (z11) {
            v4Var.f22759c = Collections.unmodifiableList(v4Var.f22759c);
        }
        v4Var.unknownFields = ccVarNewBuilder.build();
        v4Var.makeExtensionsImmutable();
        return v4Var;
    }
}
