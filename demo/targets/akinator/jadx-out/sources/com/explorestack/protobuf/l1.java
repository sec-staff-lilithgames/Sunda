package com.explorestack.protobuf;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class l1 extends d {
    @Override // com.explorestack.protobuf.d, com.explorestack.protobuf.fa
    public n1 parsePartialFrom(y yVar, m5 m5Var) throws InvalidProtocolBufferException {
        n1 n1Var = new n1();
        m5Var.getClass();
        cc ccVarNewBuilder = gc.newBuilder();
        boolean z10 = false;
        char c10 = 0;
        while (!z10) {
            try {
                try {
                    int tag = yVar.readTag();
                    if (tag != 0) {
                        if (tag == 16) {
                            n1Var.f22389c |= 1;
                            n1Var.f22390e = yVar.readBool();
                        } else if (tag == 24) {
                            n1Var.f22389c |= 2;
                            n1Var.f22391f = yVar.readBool();
                        } else if (tag == 7994) {
                            if ((c10 & 4) == 0) {
                                n1Var.f22392g = new ArrayList();
                                c10 = 4;
                            }
                            n1Var.f22392g.add(yVar.readMessage(v4.f22757m, m5Var));
                        } else if (!n1Var.parseUnknownField(yVar, ccVarNewBuilder, m5Var, tag)) {
                        }
                    }
                    z10 = true;
                } catch (InvalidProtocolBufferException e10) {
                    throw e10.setUnfinishedMessage(n1Var);
                } catch (IOException e11) {
                    throw new InvalidProtocolBufferException(e11).setUnfinishedMessage(n1Var);
                }
            } catch (Throwable th2) {
                if ((c10 & 4) != 0) {
                    n1Var.f22392g = Collections.unmodifiableList(n1Var.f22392g);
                }
                n1Var.unknownFields = ccVarNewBuilder.build();
                n1Var.makeExtensionsImmutable();
                throw th2;
            }
        }
        if ((c10 & 4) != 0) {
            n1Var.f22392g = Collections.unmodifiableList(n1Var.f22392g);
        }
        n1Var.unknownFields = ccVarNewBuilder.build();
        n1Var.makeExtensionsImmutable();
        return n1Var;
    }
}
