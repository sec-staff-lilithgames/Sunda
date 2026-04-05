package com.explorestack.protobuf;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class v3 extends d {
    @Override // com.explorestack.protobuf.d, com.explorestack.protobuf.fa
    public x3 parsePartialFrom(y yVar, m5 m5Var) throws InvalidProtocolBufferException {
        x3 x3Var = new x3();
        m5Var.getClass();
        cc ccVarNewBuilder = gc.newBuilder();
        boolean z10 = false;
        boolean z11 = false;
        while (!z10) {
            try {
                try {
                    int tag = yVar.readTag();
                    if (tag != 0) {
                        if (tag == 7994) {
                            if (!z11) {
                                x3Var.f22831c = new ArrayList();
                                z11 = true;
                            }
                            x3Var.f22831c.add(yVar.readMessage(v4.f22757m, m5Var));
                        } else if (!x3Var.parseUnknownField(yVar, ccVarNewBuilder, m5Var, tag)) {
                        }
                    }
                    z10 = true;
                } catch (InvalidProtocolBufferException e10) {
                    throw e10.setUnfinishedMessage(x3Var);
                } catch (IOException e11) {
                    throw new InvalidProtocolBufferException(e11).setUnfinishedMessage(x3Var);
                }
            } catch (Throwable th2) {
                if (z11) {
                    x3Var.f22831c = Collections.unmodifiableList(x3Var.f22831c);
                }
                x3Var.unknownFields = ccVarNewBuilder.build();
                x3Var.makeExtensionsImmutable();
                throw th2;
            }
        }
        if (z11) {
            x3Var.f22831c = Collections.unmodifiableList(x3Var.f22831c);
        }
        x3Var.unknownFields = ccVarNewBuilder.build();
        x3Var.makeExtensionsImmutable();
        return x3Var;
    }
}
