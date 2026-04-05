package com.explorestack.protobuf;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class e3 extends d {
    @Override // com.explorestack.protobuf.d, com.explorestack.protobuf.fa
    public g3 parsePartialFrom(y yVar, m5 m5Var) throws InvalidProtocolBufferException {
        g3 g3Var = new g3();
        m5Var.getClass();
        cc ccVarNewBuilder = gc.newBuilder();
        boolean z10 = false;
        char c10 = 0;
        while (!z10) {
            try {
                try {
                    int tag = yVar.readTag();
                    if (tag != 0) {
                        if (tag == 8) {
                            g3Var.f22153c |= 1;
                            g3Var.f22154e = yVar.readBool();
                        } else if (tag == 16) {
                            g3Var.f22153c |= 2;
                            g3Var.f22155f = yVar.readBool();
                        } else if (tag == 24) {
                            g3Var.f22153c |= 4;
                            g3Var.f22156g = yVar.readBool();
                        } else if (tag == 56) {
                            g3Var.f22153c |= 8;
                            g3Var.f22157h = yVar.readBool();
                        } else if (tag == 7994) {
                            if ((c10 & 16) == 0) {
                                g3Var.f22158i = new ArrayList();
                                c10 = 16;
                            }
                            g3Var.f22158i.add(yVar.readMessage(v4.f22757m, m5Var));
                        } else if (!g3Var.parseUnknownField(yVar, ccVarNewBuilder, m5Var, tag)) {
                        }
                    }
                    z10 = true;
                } catch (InvalidProtocolBufferException e10) {
                    throw e10.setUnfinishedMessage(g3Var);
                } catch (IOException e11) {
                    throw new InvalidProtocolBufferException(e11).setUnfinishedMessage(g3Var);
                }
            } catch (Throwable th2) {
                if ((c10 & 16) != 0) {
                    g3Var.f22158i = Collections.unmodifiableList(g3Var.f22158i);
                }
                g3Var.unknownFields = ccVarNewBuilder.build();
                g3Var.makeExtensionsImmutable();
                throw th2;
            }
        }
        if ((c10 & 16) != 0) {
            g3Var.f22158i = Collections.unmodifiableList(g3Var.f22158i);
        }
        g3Var.unknownFields = ccVarNewBuilder.build();
        g3Var.makeExtensionsImmutable();
        return g3Var;
    }
}
