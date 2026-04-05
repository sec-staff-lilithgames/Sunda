package com.explorestack.protobuf;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class m3 extends d {
    @Override // com.explorestack.protobuf.d, com.explorestack.protobuf.fa
    public p3 parsePartialFrom(y yVar, m5 m5Var) throws InvalidProtocolBufferException {
        p3 p3Var = new p3();
        m5Var.getClass();
        cc ccVarNewBuilder = gc.newBuilder();
        boolean z10 = false;
        char c10 = 0;
        while (!z10) {
            try {
                try {
                    int tag = yVar.readTag();
                    if (tag != 0) {
                        if (tag == 264) {
                            p3Var.f22483c |= 1;
                            p3Var.f22484e = yVar.readBool();
                        } else if (tag == 272) {
                            int i10 = yVar.readEnum();
                            if (DescriptorProtos$MethodOptions$IdempotencyLevel.valueOf(i10) == null) {
                                ccVarNewBuilder.mergeVarintField(34, i10);
                            } else {
                                p3Var.f22483c |= 2;
                                p3Var.f22485f = i10;
                            }
                        } else if (tag == 7994) {
                            if ((c10 & 4) == 0) {
                                p3Var.f22486g = new ArrayList();
                                c10 = 4;
                            }
                            p3Var.f22486g.add(yVar.readMessage(v4.f22757m, m5Var));
                        } else if (!p3Var.parseUnknownField(yVar, ccVarNewBuilder, m5Var, tag)) {
                        }
                    }
                    z10 = true;
                } catch (InvalidProtocolBufferException e10) {
                    throw e10.setUnfinishedMessage(p3Var);
                } catch (IOException e11) {
                    throw new InvalidProtocolBufferException(e11).setUnfinishedMessage(p3Var);
                }
            } catch (Throwable th2) {
                if ((c10 & 4) != 0) {
                    p3Var.f22486g = Collections.unmodifiableList(p3Var.f22486g);
                }
                p3Var.unknownFields = ccVarNewBuilder.build();
                p3Var.makeExtensionsImmutable();
                throw th2;
            }
        }
        if ((c10 & 4) != 0) {
            p3Var.f22486g = Collections.unmodifiableList(p3Var.f22486g);
        }
        p3Var.unknownFields = ccVarNewBuilder.build();
        p3Var.makeExtensionsImmutable();
        return p3Var;
    }
}
