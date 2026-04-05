package com.explorestack.protobuf;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class h2 extends d {
    @Override // com.explorestack.protobuf.d, com.explorestack.protobuf.fa
    public l2 parsePartialFrom(y yVar, m5 m5Var) throws InvalidProtocolBufferException {
        l2 l2Var = new l2();
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
                            int i10 = yVar.readEnum();
                            if (DescriptorProtos$FieldOptions$CType.valueOf(i10) == null) {
                                ccVarNewBuilder.mergeVarintField(1, i10);
                            } else {
                                l2Var.f22326c = 1 | l2Var.f22326c;
                                l2Var.f22327e = i10;
                            }
                        } else if (tag == 16) {
                            l2Var.f22326c |= 2;
                            l2Var.f22328f = yVar.readBool();
                        } else if (tag == 24) {
                            l2Var.f22326c |= 16;
                            l2Var.f22331i = yVar.readBool();
                        } else if (tag == 40) {
                            l2Var.f22326c |= 8;
                            l2Var.f22330h = yVar.readBool();
                        } else if (tag == 48) {
                            int i11 = yVar.readEnum();
                            if (DescriptorProtos$FieldOptions$JSType.valueOf(i11) == null) {
                                ccVarNewBuilder.mergeVarintField(6, i11);
                            } else {
                                l2Var.f22326c |= 4;
                                l2Var.f22329g = i11;
                            }
                        } else if (tag == 80) {
                            l2Var.f22326c |= 32;
                            l2Var.f22332j = yVar.readBool();
                        } else if (tag == 7994) {
                            if ((c10 & '@') == 0) {
                                l2Var.f22333k = new ArrayList();
                                c10 = '@';
                            }
                            l2Var.f22333k.add(yVar.readMessage(v4.f22757m, m5Var));
                        } else if (!l2Var.parseUnknownField(yVar, ccVarNewBuilder, m5Var, tag)) {
                        }
                    }
                    z10 = true;
                } catch (InvalidProtocolBufferException e10) {
                    throw e10.setUnfinishedMessage(l2Var);
                } catch (IOException e11) {
                    throw new InvalidProtocolBufferException(e11).setUnfinishedMessage(l2Var);
                }
            } catch (Throwable th2) {
                if ((c10 & '@') != 0) {
                    l2Var.f22333k = Collections.unmodifiableList(l2Var.f22333k);
                }
                l2Var.unknownFields = ccVarNewBuilder.build();
                l2Var.makeExtensionsImmutable();
                throw th2;
            }
        }
        if ((c10 & '@') != 0) {
            l2Var.f22333k = Collections.unmodifiableList(l2Var.f22333k);
        }
        l2Var.unknownFields = ccVarNewBuilder.build();
        l2Var.makeExtensionsImmutable();
        return l2Var;
    }
}
