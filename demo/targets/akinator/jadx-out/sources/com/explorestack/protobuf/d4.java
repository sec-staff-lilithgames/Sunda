package com.explorestack.protobuf;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class d4 extends d {
    @Override // com.explorestack.protobuf.d, com.explorestack.protobuf.fa
    public f4 parsePartialFrom(y yVar, m5 m5Var) throws InvalidProtocolBufferException {
        f4 f4Var = new f4();
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
                            f4Var.f22128c |= 1;
                            f4Var.f22129e = yVar.readBool();
                        } else if (tag == 7994) {
                            if ((c10 & 2) == 0) {
                                f4Var.f22130f = new ArrayList();
                                c10 = 2;
                            }
                            f4Var.f22130f.add(yVar.readMessage(v4.f22757m, m5Var));
                        } else if (!f4Var.parseUnknownField(yVar, ccVarNewBuilder, m5Var, tag)) {
                        }
                    }
                    z10 = true;
                } catch (InvalidProtocolBufferException e10) {
                    throw e10.setUnfinishedMessage(f4Var);
                } catch (IOException e11) {
                    throw new InvalidProtocolBufferException(e11).setUnfinishedMessage(f4Var);
                }
            } catch (Throwable th2) {
                if ((c10 & 2) != 0) {
                    f4Var.f22130f = Collections.unmodifiableList(f4Var.f22130f);
                }
                f4Var.unknownFields = ccVarNewBuilder.build();
                f4Var.makeExtensionsImmutable();
                throw th2;
            }
        }
        if ((c10 & 2) != 0) {
            f4Var.f22130f = Collections.unmodifiableList(f4Var.f22130f);
        }
        f4Var.unknownFields = ccVarNewBuilder.build();
        f4Var.makeExtensionsImmutable();
        return f4Var;
    }
}
