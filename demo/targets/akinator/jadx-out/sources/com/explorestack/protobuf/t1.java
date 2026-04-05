package com.explorestack.protobuf;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class t1 extends d {
    @Override // com.explorestack.protobuf.d, com.explorestack.protobuf.fa
    public v1 parsePartialFrom(y yVar, m5 m5Var) throws InvalidProtocolBufferException {
        v1 v1Var = new v1();
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
                            v1Var.f22752c |= 1;
                            v1Var.f22753e = yVar.readBool();
                        } else if (tag == 7994) {
                            if ((c10 & 2) == 0) {
                                v1Var.f22754f = new ArrayList();
                                c10 = 2;
                            }
                            v1Var.f22754f.add(yVar.readMessage(v4.f22757m, m5Var));
                        } else if (!v1Var.parseUnknownField(yVar, ccVarNewBuilder, m5Var, tag)) {
                        }
                    }
                    z10 = true;
                } catch (InvalidProtocolBufferException e10) {
                    throw e10.setUnfinishedMessage(v1Var);
                } catch (IOException e11) {
                    throw new InvalidProtocolBufferException(e11).setUnfinishedMessage(v1Var);
                }
            } catch (Throwable th2) {
                if ((c10 & 2) != 0) {
                    v1Var.f22754f = Collections.unmodifiableList(v1Var.f22754f);
                }
                v1Var.unknownFields = ccVarNewBuilder.build();
                v1Var.makeExtensionsImmutable();
                throw th2;
            }
        }
        if ((c10 & 2) != 0) {
            v1Var.f22754f = Collections.unmodifiableList(v1Var.f22754f);
        }
        v1Var.unknownFields = ccVarNewBuilder.build();
        v1Var.makeExtensionsImmutable();
        return v1Var;
    }
}
