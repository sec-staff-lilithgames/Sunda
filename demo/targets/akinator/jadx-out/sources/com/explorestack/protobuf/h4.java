package com.explorestack.protobuf;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class h4 extends d {
    @Override // com.explorestack.protobuf.d, com.explorestack.protobuf.fa
    public n4 parsePartialFrom(y yVar, m5 m5Var) throws InvalidProtocolBufferException {
        n4 n4Var = new n4();
        m5Var.getClass();
        cc ccVarNewBuilder = gc.newBuilder();
        boolean z10 = false;
        boolean z11 = false;
        while (!z10) {
            try {
                try {
                    int tag = yVar.readTag();
                    if (tag != 0) {
                        if (tag == 10) {
                            if (!z11) {
                                n4Var.f22401b = new ArrayList();
                                z11 = true;
                            }
                            n4Var.f22401b.add(yVar.readMessage(l4.f22336m, m5Var));
                        } else if (!n4Var.parseUnknownField(yVar, ccVarNewBuilder, m5Var, tag)) {
                        }
                    }
                    z10 = true;
                } catch (InvalidProtocolBufferException e10) {
                    throw e10.setUnfinishedMessage(n4Var);
                } catch (IOException e11) {
                    throw new InvalidProtocolBufferException(e11).setUnfinishedMessage(n4Var);
                }
            } catch (Throwable th2) {
                if (z11) {
                    n4Var.f22401b = Collections.unmodifiableList(n4Var.f22401b);
                }
                n4Var.unknownFields = ccVarNewBuilder.build();
                n4Var.makeExtensionsImmutable();
                throw th2;
            }
        }
        if (z11) {
            n4Var.f22401b = Collections.unmodifiableList(n4Var.f22401b);
        }
        n4Var.unknownFields = ccVarNewBuilder.build();
        n4Var.makeExtensionsImmutable();
        return n4Var;
    }
}
