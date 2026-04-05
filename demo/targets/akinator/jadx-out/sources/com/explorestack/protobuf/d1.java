package com.explorestack.protobuf;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class d1 extends d {
    @Override // com.explorestack.protobuf.d, com.explorestack.protobuf.fa
    public j1 parsePartialFrom(y yVar, m5 m5Var) throws InvalidProtocolBufferException {
        j1 j1Var = new j1();
        m5Var.getClass();
        cc ccVarNewBuilder = gc.newBuilder();
        boolean z10 = false;
        int i10 = 0;
        while (!z10) {
            try {
                try {
                    try {
                        int tag = yVar.readTag();
                        if (tag != 0) {
                            if (tag == 10) {
                                ByteString bytes = yVar.readBytes();
                                j1Var.f22256b = 1 | j1Var.f22256b;
                                j1Var.f22257c = bytes;
                            } else if (tag == 18) {
                                if ((i10 & 2) == 0) {
                                    j1Var.f22258e = new ArrayList();
                                    i10 |= 2;
                                }
                                j1Var.f22258e.add(yVar.readMessage(r1.f22532i, m5Var));
                            } else if (tag == 26) {
                                m1 builder = (j1Var.f22256b & 2) != 0 ? j1Var.f22259f.toBuilder() : null;
                                n1 n1Var = (n1) yVar.readMessage(n1.f22388j, m5Var);
                                j1Var.f22259f = n1Var;
                                if (builder != null) {
                                    builder.mergeFrom(n1Var);
                                    j1Var.f22259f = builder.buildPartial();
                                }
                                j1Var.f22256b |= 2;
                            } else if (tag == 34) {
                                if ((i10 & 8) == 0) {
                                    j1Var.f22260g = new ArrayList();
                                    i10 |= 8;
                                }
                                j1Var.f22260g.add(yVar.readMessage(h1.f22189h, m5Var));
                            } else if (tag == 42) {
                                ByteString bytes2 = yVar.readBytes();
                                if ((i10 & 16) == 0) {
                                    j1Var.f22261h = new f8();
                                    i10 |= 16;
                                }
                                j1Var.f22261h.add(bytes2);
                            } else if (!j1Var.parseUnknownField(yVar, ccVarNewBuilder, m5Var, tag)) {
                            }
                        }
                        z10 = true;
                    } catch (IOException e10) {
                        throw new InvalidProtocolBufferException(e10).setUnfinishedMessage(j1Var);
                    }
                } catch (InvalidProtocolBufferException e11) {
                    throw e11.setUnfinishedMessage(j1Var);
                }
            } catch (Throwable th2) {
                if ((i10 & 2) != 0) {
                    j1Var.f22258e = Collections.unmodifiableList(j1Var.f22258e);
                }
                if ((i10 & 8) != 0) {
                    j1Var.f22260g = Collections.unmodifiableList(j1Var.f22260g);
                }
                if ((i10 & 16) != 0) {
                    j1Var.f22261h = j1Var.f22261h.getUnmodifiableView();
                }
                j1Var.unknownFields = ccVarNewBuilder.build();
                j1Var.makeExtensionsImmutable();
                throw th2;
            }
        }
        if ((i10 & 2) != 0) {
            j1Var.f22258e = Collections.unmodifiableList(j1Var.f22258e);
        }
        if ((i10 & 8) != 0) {
            j1Var.f22260g = Collections.unmodifiableList(j1Var.f22260g);
        }
        if ((i10 & 16) != 0) {
            j1Var.f22261h = j1Var.f22261h.getUnmodifiableView();
        }
        j1Var.unknownFields = ccVarNewBuilder.build();
        j1Var.makeExtensionsImmutable();
        return j1Var;
    }
}
