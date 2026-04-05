package com.explorestack.protobuf;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class x1 extends d {
    @Override // com.explorestack.protobuf.d, com.explorestack.protobuf.fa
    public z1 parsePartialFrom(y yVar, m5 m5Var) throws InvalidProtocolBufferException {
        z1 z1Var = new z1();
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
                                z1Var.f22937c = new ArrayList();
                                z11 = true;
                            }
                            z1Var.f22937c.add(yVar.readMessage(v4.f22757m, m5Var));
                        } else if (!z1Var.parseUnknownField(yVar, ccVarNewBuilder, m5Var, tag)) {
                        }
                    }
                    z10 = true;
                } catch (InvalidProtocolBufferException e10) {
                    throw e10.setUnfinishedMessage(z1Var);
                } catch (IOException e11) {
                    throw new InvalidProtocolBufferException(e11).setUnfinishedMessage(z1Var);
                }
            } catch (Throwable th2) {
                if (z11) {
                    z1Var.f22937c = Collections.unmodifiableList(z1Var.f22937c);
                }
                z1Var.unknownFields = ccVarNewBuilder.build();
                z1Var.makeExtensionsImmutable();
                throw th2;
            }
        }
        if (z11) {
            z1Var.f22937c = Collections.unmodifiableList(z1Var.f22937c);
        }
        z1Var.unknownFields = ccVarNewBuilder.build();
        z1Var.makeExtensionsImmutable();
        return z1Var;
    }
}
