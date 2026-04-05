package com.explorestack.protobuf;

import androidx.core.app.NotificationCompat;
import com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class r0 extends d {
    @Override // com.explorestack.protobuf.d, com.explorestack.protobuf.fa
    public b1 parsePartialFrom(y yVar, m5 m5Var) throws InvalidProtocolBufferException {
        b1 b1Var = new b1();
        m5Var.getClass();
        cc ccVarNewBuilder = gc.newBuilder();
        boolean z10 = false;
        int i10 = 0;
        while (!z10) {
            try {
                try {
                    try {
                        int tag = yVar.readTag();
                        switch (tag) {
                            case 0:
                                z10 = true;
                            case 10:
                                ByteString bytes = yVar.readBytes();
                                b1Var.f21916b = 1 | b1Var.f21916b;
                                b1Var.f21917c = bytes;
                            case 18:
                                if ((i10 & 2) == 0) {
                                    b1Var.f21918e = new ArrayList();
                                    i10 |= 2;
                                }
                                b1Var.f21918e.add(yVar.readMessage(f2.f22105q, m5Var));
                            case 26:
                                if ((i10 & 8) == 0) {
                                    b1Var.f21920g = new ArrayList();
                                    i10 |= 8;
                                }
                                b1Var.f21920g.add(yVar.readMessage(b1.f21915p, m5Var));
                            case 34:
                                if ((i10 & 16) == 0) {
                                    b1Var.f21921h = new ArrayList();
                                    i10 |= 16;
                                }
                                b1Var.f21921h.add(yVar.readMessage(j1.f22255k, m5Var));
                            case 42:
                                if ((i10 & 32) == 0) {
                                    b1Var.f21922i = new ArrayList();
                                    i10 |= 32;
                                }
                                b1Var.f21922i.add(yVar.readMessage(v0.f22744i, m5Var));
                            case 50:
                                if ((i10 & 4) == 0) {
                                    b1Var.f21919f = new ArrayList();
                                    i10 |= 4;
                                }
                                b1Var.f21919f.add(yVar.readMessage(f2.f22105q, m5Var));
                            case 58:
                                f3 builder = (b1Var.f21916b & 2) != 0 ? b1Var.f21924k.toBuilder() : null;
                                g3 g3Var = (g3) yVar.readMessage(g3.f22152l, m5Var);
                                b1Var.f21924k = g3Var;
                                if (builder != null) {
                                    builder.mergeFrom(g3Var);
                                    b1Var.f21924k = builder.buildPartial();
                                }
                                b1Var.f21916b |= 2;
                            case TokenParametersOuterClass$TokenParameters.LGPDCONSENT_FIELD_NUMBER /* 66 */:
                                if ((i10 & 64) == 0) {
                                    b1Var.f21923j = new ArrayList();
                                    i10 |= 64;
                                }
                                b1Var.f21923j.add(yVar.readMessage(t3.f22650h, m5Var));
                            case TokenParametersOuterClass$TokenParameters.ENCRYPTEDTOPICS_FIELD_NUMBER /* 74 */:
                                if ((i10 & NotificationCompat.FLAG_LOCAL_ONLY) == 0) {
                                    b1Var.f21925l = new ArrayList();
                                    i10 |= NotificationCompat.FLAG_LOCAL_ONLY;
                                }
                                b1Var.f21925l.add(yVar.readMessage(z0.f22930h, m5Var));
                            case 82:
                                ByteString bytes2 = yVar.readBytes();
                                if ((i10 & 512) == 0) {
                                    b1Var.f21926m = new f8();
                                    i10 |= 512;
                                }
                                b1Var.f21926m.add(bytes2);
                            default:
                                if (!b1Var.parseUnknownField(yVar, ccVarNewBuilder, m5Var, tag)) {
                                    z10 = true;
                                }
                        }
                    } catch (InvalidProtocolBufferException e10) {
                        throw e10.setUnfinishedMessage(b1Var);
                    }
                } catch (IOException e11) {
                    throw new InvalidProtocolBufferException(e11).setUnfinishedMessage(b1Var);
                }
            } catch (Throwable th2) {
                if ((i10 & 2) != 0) {
                    b1Var.f21918e = Collections.unmodifiableList(b1Var.f21918e);
                }
                if ((i10 & 8) != 0) {
                    b1Var.f21920g = Collections.unmodifiableList(b1Var.f21920g);
                }
                if ((i10 & 16) != 0) {
                    b1Var.f21921h = Collections.unmodifiableList(b1Var.f21921h);
                }
                if ((i10 & 32) != 0) {
                    b1Var.f21922i = Collections.unmodifiableList(b1Var.f21922i);
                }
                if ((i10 & 4) != 0) {
                    b1Var.f21919f = Collections.unmodifiableList(b1Var.f21919f);
                }
                if ((i10 & 64) != 0) {
                    b1Var.f21923j = Collections.unmodifiableList(b1Var.f21923j);
                }
                if ((i10 & NotificationCompat.FLAG_LOCAL_ONLY) != 0) {
                    b1Var.f21925l = Collections.unmodifiableList(b1Var.f21925l);
                }
                if ((i10 & 512) != 0) {
                    b1Var.f21926m = b1Var.f21926m.getUnmodifiableView();
                }
                b1Var.unknownFields = ccVarNewBuilder.build();
                b1Var.makeExtensionsImmutable();
                throw th2;
            }
        }
        if ((i10 & 2) != 0) {
            b1Var.f21918e = Collections.unmodifiableList(b1Var.f21918e);
        }
        if ((i10 & 8) != 0) {
            b1Var.f21920g = Collections.unmodifiableList(b1Var.f21920g);
        }
        if ((i10 & 16) != 0) {
            b1Var.f21921h = Collections.unmodifiableList(b1Var.f21921h);
        }
        if ((i10 & 32) != 0) {
            b1Var.f21922i = Collections.unmodifiableList(b1Var.f21922i);
        }
        if ((i10 & 4) != 0) {
            b1Var.f21919f = Collections.unmodifiableList(b1Var.f21919f);
        }
        if ((i10 & 64) != 0) {
            b1Var.f21923j = Collections.unmodifiableList(b1Var.f21923j);
        }
        if ((i10 & NotificationCompat.FLAG_LOCAL_ONLY) != 0) {
            b1Var.f21925l = Collections.unmodifiableList(b1Var.f21925l);
        }
        if ((i10 & 512) != 0) {
            b1Var.f21926m = b1Var.f21926m.getUnmodifiableView();
        }
        b1Var.unknownFields = ccVarNewBuilder.build();
        b1Var.makeExtensionsImmutable();
        return b1Var;
    }
}
