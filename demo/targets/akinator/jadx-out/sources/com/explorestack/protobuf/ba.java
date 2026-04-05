package com.explorestack.protobuf;

import com.explorestack.protobuf.Any;
import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class ba extends d {
    @Override // com.explorestack.protobuf.d, com.explorestack.protobuf.fa
    public da parsePartialFrom(y yVar, m5 m5Var) throws InvalidProtocolBufferException {
        da daVar = new da();
        m5Var.getClass();
        cc ccVarNewBuilder = gc.newBuilder();
        boolean z10 = false;
        while (!z10) {
            try {
                try {
                    int tag = yVar.readTag();
                    if (tag != 0) {
                        if (tag == 10) {
                            daVar.f22058b = yVar.readStringRequireUtf8();
                        } else if (tag == 18) {
                            Any any = daVar.f22059c;
                            Any.Builder builder = any != null ? any.toBuilder() : null;
                            Any any2 = (Any) yVar.readMessage(Any.parser(), m5Var);
                            daVar.f22059c = any2;
                            if (builder != null) {
                                builder.mergeFrom(any2);
                                daVar.f22059c = builder.buildPartial();
                            }
                        } else if (!daVar.parseUnknownField(yVar, ccVarNewBuilder, m5Var, tag)) {
                        }
                    }
                    z10 = true;
                } catch (InvalidProtocolBufferException e10) {
                    throw e10.setUnfinishedMessage(daVar);
                } catch (IOException e11) {
                    throw new InvalidProtocolBufferException(e11).setUnfinishedMessage(daVar);
                }
            } catch (Throwable th2) {
                daVar.unknownFields = ccVarNewBuilder.build();
                daVar.makeExtensionsImmutable();
                throw th2;
            }
        }
        daVar.unknownFields = ccVarNewBuilder.build();
        daVar.makeExtensionsImmutable();
        return daVar;
    }
}
