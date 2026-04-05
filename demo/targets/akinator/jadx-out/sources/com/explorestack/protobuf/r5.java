package com.explorestack.protobuf;

import com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class r5 extends d {
    @Override // com.explorestack.protobuf.d, com.explorestack.protobuf.fa
    public v5 parsePartialFrom(y yVar, m5 m5Var) throws InvalidProtocolBufferException {
        v5 v5Var = new v5();
        m5Var.getClass();
        cc ccVarNewBuilder = gc.newBuilder();
        boolean z10 = false;
        boolean z11 = false;
        while (!z10) {
            try {
                try {
                    try {
                        int tag = yVar.readTag();
                        switch (tag) {
                            case 0:
                                z10 = true;
                            case 8:
                                v5Var.f22769b = yVar.readEnum();
                            case 16:
                                v5Var.f22770c = yVar.readEnum();
                            case 24:
                                v5Var.f22771e = yVar.readInt32();
                            case 34:
                                v5Var.f22772f = yVar.readStringRequireUtf8();
                            case 50:
                                v5Var.f22773g = yVar.readStringRequireUtf8();
                            case 56:
                                v5Var.f22774h = yVar.readInt32();
                            case 64:
                                v5Var.f22775i = yVar.readBool();
                            case TokenParametersOuterClass$TokenParameters.ENCRYPTEDTOPICS_FIELD_NUMBER /* 74 */:
                                if (!z11) {
                                    v5Var.f22776j = new ArrayList();
                                    z11 = true;
                                }
                                v5Var.f22776j.add(yVar.readMessage(da.parser(), m5Var));
                            case 82:
                                v5Var.f22777k = yVar.readStringRequireUtf8();
                            case 90:
                                v5Var.f22778l = yVar.readStringRequireUtf8();
                            default:
                                if (!v5Var.parseUnknownField(yVar, ccVarNewBuilder, m5Var, tag)) {
                                    z10 = true;
                                }
                        }
                    } catch (InvalidProtocolBufferException e10) {
                        throw e10.setUnfinishedMessage(v5Var);
                    }
                } catch (IOException e11) {
                    throw new InvalidProtocolBufferException(e11).setUnfinishedMessage(v5Var);
                }
            } catch (Throwable th2) {
                if (z11) {
                    v5Var.f22776j = Collections.unmodifiableList(v5Var.f22776j);
                }
                v5Var.unknownFields = ccVarNewBuilder.build();
                v5Var.makeExtensionsImmutable();
                throw th2;
            }
        }
        if (z11) {
            v5Var.f22776j = Collections.unmodifiableList(v5Var.f22776j);
        }
        v5Var.unknownFields = ccVarNewBuilder.build();
        v5Var.makeExtensionsImmutable();
        return v5Var;
    }
}
