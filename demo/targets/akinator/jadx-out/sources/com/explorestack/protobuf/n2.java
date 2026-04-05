package com.explorestack.protobuf;

import androidx.core.app.NotificationCompat;
import com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class n2 extends d {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v9 */
    @Override // com.explorestack.protobuf.d, com.explorestack.protobuf.fa
    public p2 parsePartialFrom(y yVar, m5 m5Var) throws InvalidProtocolBufferException {
        p2 p2Var = new p2();
        m5Var.getClass();
        cc ccVarNewBuilder = gc.newBuilder();
        boolean z10 = false;
        char c10 = 0;
        while (!z10) {
            try {
                try {
                    int tag = yVar.readTag();
                    switch (tag) {
                        case 0:
                            z10 = true;
                        case 10:
                            ByteString bytes = yVar.readBytes();
                            p2Var.f22467b |= 1;
                            p2Var.f22468c = bytes;
                        case 18:
                            ByteString bytes2 = yVar.readBytes();
                            p2Var.f22467b |= 2;
                            p2Var.f22469e = bytes2;
                        case 26:
                            ByteString bytes3 = yVar.readBytes();
                            int i10 = (c10 == true ? 1 : 0) & 4;
                            c10 = c10;
                            if (i10 == 0) {
                                p2Var.f22470f = new f8();
                                c10 = (c10 == true ? 1 : 0) | 4;
                            }
                            p2Var.f22470f.add(bytes3);
                        case 34:
                            int i11 = (c10 == true ? 1 : 0) & 32;
                            c10 = c10;
                            if (i11 == 0) {
                                p2Var.f22473i = new ArrayList();
                                c10 = (c10 == true ? 1 : 0) | ' ';
                            }
                            p2Var.f22473i.add(yVar.readMessage(b1.f21915p, m5Var));
                        case 42:
                            int i12 = (c10 == true ? 1 : 0) & 64;
                            c10 = c10;
                            if (i12 == 0) {
                                p2Var.f22474j = new ArrayList();
                                c10 = (c10 == true ? 1 : 0) | '@';
                            }
                            p2Var.f22474j.add(yVar.readMessage(j1.f22255k, m5Var));
                        case 50:
                            int i13 = (c10 == true ? 1 : 0) & 128;
                            c10 = c10;
                            if (i13 == 0) {
                                p2Var.f22475k = new ArrayList();
                                c10 = (c10 == true ? 1 : 0) | 128;
                            }
                            p2Var.f22475k.add(yVar.readMessage(b4.f21932i, m5Var));
                        case 58:
                            int i14 = (c10 == true ? 1 : 0) & NotificationCompat.FLAG_LOCAL_ONLY;
                            c10 = c10;
                            if (i14 == 0) {
                                p2Var.f22476l = new ArrayList();
                                c10 = (c10 == true ? 1 : 0) | 256;
                            }
                            p2Var.f22476l.add(yVar.readMessage(f2.f22105q, m5Var));
                        case TokenParametersOuterClass$TokenParameters.LGPDCONSENT_FIELD_NUMBER /* 66 */:
                            s2 builder = (p2Var.f22467b & 4) != 0 ? p2Var.f22477m.toBuilder() : null;
                            u2 u2Var = (u2) yVar.readMessage(u2.B, m5Var);
                            p2Var.f22477m = u2Var;
                            if (builder != null) {
                                builder.mergeFrom(u2Var);
                                p2Var.f22477m = builder.buildPartial();
                            }
                            p2Var.f22467b |= 4;
                        case TokenParametersOuterClass$TokenParameters.ENCRYPTEDTOPICS_FIELD_NUMBER /* 74 */:
                            i4 builder2 = (p2Var.f22467b & 8) != 0 ? p2Var.f22478n.toBuilder() : null;
                            n4 n4Var = (n4) yVar.readMessage(n4.f22400f, m5Var);
                            p2Var.f22478n = n4Var;
                            if (builder2 != null) {
                                builder2.mergeFrom(n4Var);
                                p2Var.f22478n = builder2.buildPartial();
                            }
                            p2Var.f22467b |= 8;
                        case 80:
                            int i15 = (c10 == true ? 1 : 0) & 8;
                            c10 = c10;
                            if (i15 == 0) {
                                p2Var.f22471g = k7.newIntList();
                                c10 = (c10 == true ? 1 : 0) | '\b';
                            }
                            ((l7) p2Var.f22471g).addInt(yVar.readInt32());
                        case 82:
                            int iPushLimit = yVar.pushLimit(yVar.readRawVarint32());
                            int i16 = (c10 == true ? 1 : 0) & 8;
                            c10 = c10;
                            if (i16 == 0) {
                                c10 = c10;
                                if (yVar.getBytesUntilLimit() > 0) {
                                    p2Var.f22471g = k7.newIntList();
                                    c10 = (c10 == true ? 1 : 0) | '\b';
                                }
                            }
                            while (yVar.getBytesUntilLimit() > 0) {
                                ((l7) p2Var.f22471g).addInt(yVar.readInt32());
                            }
                            yVar.popLimit(iPushLimit);
                        case 88:
                            int i17 = (c10 == true ? 1 : 0) & 16;
                            c10 = c10;
                            if (i17 == 0) {
                                p2Var.f22472h = k7.newIntList();
                                c10 = (c10 == true ? 1 : 0) | 16;
                            }
                            ((l7) p2Var.f22472h).addInt(yVar.readInt32());
                        case 90:
                            int iPushLimit2 = yVar.pushLimit(yVar.readRawVarint32());
                            int i18 = (c10 == true ? 1 : 0) & 16;
                            c10 = c10;
                            if (i18 == 0) {
                                c10 = c10;
                                if (yVar.getBytesUntilLimit() > 0) {
                                    p2Var.f22472h = k7.newIntList();
                                    c10 = (c10 == true ? 1 : 0) | 16;
                                }
                            }
                            while (yVar.getBytesUntilLimit() > 0) {
                                ((l7) p2Var.f22472h).addInt(yVar.readInt32());
                            }
                            yVar.popLimit(iPushLimit2);
                        case 98:
                            ByteString bytes4 = yVar.readBytes();
                            p2Var.f22467b |= 16;
                            p2Var.f22479o = bytes4;
                        default:
                            if (!p2Var.parseUnknownField(yVar, ccVarNewBuilder, m5Var, tag)) {
                                z10 = true;
                            }
                    }
                } catch (InvalidProtocolBufferException e10) {
                    throw e10.setUnfinishedMessage(p2Var);
                } catch (IOException e11) {
                    throw new InvalidProtocolBufferException(e11).setUnfinishedMessage(p2Var);
                }
            } catch (Throwable th2) {
                if (((c10 == true ? 1 : 0) & 4) != 0) {
                    p2Var.f22470f = p2Var.f22470f.getUnmodifiableView();
                }
                if (((c10 == true ? 1 : 0) & 32) != 0) {
                    p2Var.f22473i = Collections.unmodifiableList(p2Var.f22473i);
                }
                if (((c10 == true ? 1 : 0) & 64) != 0) {
                    p2Var.f22474j = Collections.unmodifiableList(p2Var.f22474j);
                }
                if (((c10 == true ? 1 : 0) & 128) != 0) {
                    p2Var.f22475k = Collections.unmodifiableList(p2Var.f22475k);
                }
                if (((c10 == true ? 1 : 0) & NotificationCompat.FLAG_LOCAL_ONLY) != 0) {
                    p2Var.f22476l = Collections.unmodifiableList(p2Var.f22476l);
                }
                if (((c10 == true ? 1 : 0) & 8) != 0) {
                    ((e) p2Var.f22471g).makeImmutable();
                }
                if (((c10 == true ? 1 : 0) & 16) != 0) {
                    ((e) p2Var.f22472h).makeImmutable();
                }
                p2Var.unknownFields = ccVarNewBuilder.build();
                p2Var.makeExtensionsImmutable();
                throw th2;
            }
        }
        if (((c10 == true ? 1 : 0) & 4) != 0) {
            p2Var.f22470f = p2Var.f22470f.getUnmodifiableView();
        }
        if (((c10 == true ? 1 : 0) & 32) != 0) {
            p2Var.f22473i = Collections.unmodifiableList(p2Var.f22473i);
        }
        if (((c10 == true ? 1 : 0) & 64) != 0) {
            p2Var.f22474j = Collections.unmodifiableList(p2Var.f22474j);
        }
        if (((c10 == true ? 1 : 0) & 128) != 0) {
            p2Var.f22475k = Collections.unmodifiableList(p2Var.f22475k);
        }
        if (((c10 == true ? 1 : 0) & NotificationCompat.FLAG_LOCAL_ONLY) != 0) {
            p2Var.f22476l = Collections.unmodifiableList(p2Var.f22476l);
        }
        if (((c10 == true ? 1 : 0) & 8) != 0) {
            ((e) p2Var.f22471g).makeImmutable();
        }
        if (((c10 == true ? 1 : 0) & 16) != 0) {
            ((e) p2Var.f22472h).makeImmutable();
        }
        p2Var.unknownFields = ccVarNewBuilder.build();
        p2Var.makeExtensionsImmutable();
        return p2Var;
    }
}
