package com.explorestack.protobuf;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class w2 extends d {
    @Override // com.explorestack.protobuf.d, com.explorestack.protobuf.fa
    public c3 parsePartialFrom(y yVar, m5 m5Var) throws InvalidProtocolBufferException {
        c3 c3Var = new c3();
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
                                c3Var.f21980b = new ArrayList();
                                z11 = true;
                            }
                            c3Var.f21980b.add(yVar.readMessage(z2.f22940k, m5Var));
                        } else if (!c3Var.parseUnknownField(yVar, ccVarNewBuilder, m5Var, tag)) {
                        }
                    }
                    z10 = true;
                } catch (InvalidProtocolBufferException e10) {
                    throw e10.setUnfinishedMessage(c3Var);
                } catch (IOException e11) {
                    throw new InvalidProtocolBufferException(e11).setUnfinishedMessage(c3Var);
                }
            } catch (Throwable th2) {
                if (z11) {
                    c3Var.f21980b = Collections.unmodifiableList(c3Var.f21980b);
                }
                c3Var.unknownFields = ccVarNewBuilder.build();
                c3Var.makeExtensionsImmutable();
                throw th2;
            }
        }
        if (z11) {
            c3Var.f21980b = Collections.unmodifiableList(c3Var.f21980b);
        }
        c3Var.unknownFields = ccVarNewBuilder.build();
        c3Var.makeExtensionsImmutable();
        return c3Var;
    }
}
