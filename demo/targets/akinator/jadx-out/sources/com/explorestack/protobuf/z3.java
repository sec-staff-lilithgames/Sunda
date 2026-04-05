package com.explorestack.protobuf;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class z3 extends d {
    @Override // com.explorestack.protobuf.d, com.explorestack.protobuf.fa
    public b4 parsePartialFrom(y yVar, m5 m5Var) throws InvalidProtocolBufferException {
        b4 b4Var = new b4();
        m5Var.getClass();
        cc ccVarNewBuilder = gc.newBuilder();
        boolean z10 = false;
        char c10 = 0;
        while (!z10) {
            try {
                try {
                    int tag = yVar.readTag();
                    if (tag != 0) {
                        if (tag == 10) {
                            ByteString bytes = yVar.readBytes();
                            b4Var.f21933b = 1 | b4Var.f21933b;
                            b4Var.f21934c = bytes;
                        } else if (tag == 18) {
                            if ((c10 & 2) == 0) {
                                b4Var.f21935e = new ArrayList();
                                c10 = 2;
                            }
                            b4Var.f21935e.add(yVar.readMessage(k3.f22292l, m5Var));
                        } else if (tag == 26) {
                            e4 builder = (b4Var.f21933b & 2) != 0 ? b4Var.f21936f.toBuilder() : null;
                            f4 f4Var = (f4) yVar.readMessage(f4.f22127i, m5Var);
                            b4Var.f21936f = f4Var;
                            if (builder != null) {
                                builder.mergeFrom(f4Var);
                                b4Var.f21936f = builder.buildPartial();
                            }
                            b4Var.f21933b |= 2;
                        } else if (!b4Var.parseUnknownField(yVar, ccVarNewBuilder, m5Var, tag)) {
                        }
                    }
                    z10 = true;
                } catch (InvalidProtocolBufferException e10) {
                    throw e10.setUnfinishedMessage(b4Var);
                } catch (IOException e11) {
                    throw new InvalidProtocolBufferException(e11).setUnfinishedMessage(b4Var);
                }
            } catch (Throwable th2) {
                if ((c10 & 2) != 0) {
                    b4Var.f21935e = Collections.unmodifiableList(b4Var.f21935e);
                }
                b4Var.unknownFields = ccVarNewBuilder.build();
                b4Var.makeExtensionsImmutable();
                throw th2;
            }
        }
        if ((c10 & 2) != 0) {
            b4Var.f21935e = Collections.unmodifiableList(b4Var.f21935e);
        }
        b4Var.unknownFields = ccVarNewBuilder.build();
        b4Var.makeExtensionsImmutable();
        return b4Var;
    }
}
