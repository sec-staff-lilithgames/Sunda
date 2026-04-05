package com.explorestack.protobuf;

import androidx.core.app.NotificationCompat;
import com.applovin.shadow.okio.Segment;
import com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class r2 extends d {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2, types: [boolean] */
    @Override // com.explorestack.protobuf.d, com.explorestack.protobuf.fa
    public u2 parsePartialFrom(y yVar, m5 m5Var) throws InvalidProtocolBufferException {
        u2 u2Var = new u2();
        m5Var.getClass();
        cc ccVarNewBuilder = gc.newBuilder();
        boolean z10 = false;
        char c10 = 0;
        while (true) {
            ?? unknownField = 1048576;
            if (z10) {
                if ((c10 & AbstractJsonLexerKt.INVALID) != 0) {
                    u2Var.f22716y = Collections.unmodifiableList(u2Var.f22716y);
                }
                u2Var.unknownFields = ccVarNewBuilder.build();
                u2Var.makeExtensionsImmutable();
                return u2Var;
            }
            try {
                try {
                    int tag = yVar.readTag();
                    switch (tag) {
                        case 0:
                            z10 = true;
                        case 10:
                            ByteString bytes = yVar.readBytes();
                            u2Var.f22695c = 1 | u2Var.f22695c;
                            u2Var.f22696e = bytes;
                        case TokenParametersOuterClass$TokenParameters.LGPDCONSENT_FIELD_NUMBER /* 66 */:
                            ByteString bytes2 = yVar.readBytes();
                            u2Var.f22695c |= 2;
                            u2Var.f22697f = bytes2;
                        case TokenParametersOuterClass$TokenParameters.MEDIAMUTED_FIELD_NUMBER /* 72 */:
                            int i10 = yVar.readEnum();
                            if (DescriptorProtos$FileOptions$OptimizeMode.valueOf(i10) == null) {
                                ccVarNewBuilder.mergeVarintField(9, i10);
                            } else {
                                u2Var.f22695c |= 32;
                                u2Var.f22701j = i10;
                            }
                        case 80:
                            u2Var.f22695c |= 4;
                            u2Var.f22698g = yVar.readBool();
                        case 90:
                            ByteString bytes3 = yVar.readBytes();
                            u2Var.f22695c |= 64;
                            u2Var.f22702k = bytes3;
                        case 128:
                            u2Var.f22695c |= 128;
                            u2Var.f22703l = yVar.readBool();
                        case PRIVACY_URL_ERROR_VALUE:
                            u2Var.f22695c |= NotificationCompat.FLAG_LOCAL_ONLY;
                            u2Var.f22704m = yVar.readBool();
                        case 144:
                            u2Var.f22695c |= 512;
                            u2Var.f22705n = yVar.readBool();
                        case 160:
                            u2Var.f22695c |= 8;
                            u2Var.f22699h = yVar.readBool();
                        case 184:
                            u2Var.f22695c |= 2048;
                            u2Var.f22707p = yVar.readBool();
                        case AD_RESPONSE_INVALID_TEMPLATE_TYPE_VALUE:
                            u2Var.f22695c |= 16;
                            u2Var.f22700i = yVar.readBool();
                        case 248:
                            u2Var.f22695c |= 4096;
                            u2Var.f22708q = yVar.readBool();
                        case 290:
                            ByteString bytes4 = yVar.readBytes();
                            u2Var.f22695c |= Segment.SIZE;
                            u2Var.f22709r = bytes4;
                        case 298:
                            ByteString bytes5 = yVar.readBytes();
                            u2Var.f22695c |= 16384;
                            u2Var.f22710s = bytes5;
                        case LINK_COMMAND_OPEN_FAILED_VALUE:
                            ByteString bytes6 = yVar.readBytes();
                            u2Var.f22695c |= 32768;
                            u2Var.f22711t = bytes6;
                        case 322:
                            ByteString bytes7 = yVar.readBytes();
                            u2Var.f22695c |= C.DEFAULT_BUFFER_SEGMENT_SIZE;
                            u2Var.f22712u = bytes7;
                        case 330:
                            ByteString bytes8 = yVar.readBytes();
                            u2Var.f22695c |= 131072;
                            u2Var.f22713v = bytes8;
                        case 336:
                            u2Var.f22695c |= 1024;
                            u2Var.f22706o = yVar.readBool();
                        case 354:
                            ByteString bytes9 = yVar.readBytes();
                            u2Var.f22695c |= 262144;
                            u2Var.f22714w = bytes9;
                        case 362:
                            ByteString bytes10 = yVar.readBytes();
                            u2Var.f22695c |= 524288;
                            u2Var.f22715x = bytes10;
                        case 7994:
                            if ((c10 & AbstractJsonLexerKt.INVALID) == 0) {
                                u2Var.f22716y = new ArrayList();
                                c10 = 0;
                            }
                            u2Var.f22716y.add(yVar.readMessage(v4.f22757m, m5Var));
                        default:
                            unknownField = u2Var.parseUnknownField(yVar, ccVarNewBuilder, m5Var, tag);
                            if (unknownField == 0) {
                                z10 = true;
                            }
                    }
                } catch (InvalidProtocolBufferException e10) {
                    throw e10.setUnfinishedMessage(u2Var);
                } catch (IOException e11) {
                    throw new InvalidProtocolBufferException(e11).setUnfinishedMessage(u2Var);
                }
            } catch (Throwable th2) {
                if ((c10 & unknownField) != 0) {
                    u2Var.f22716y = Collections.unmodifiableList(u2Var.f22716y);
                }
                u2Var.unknownFields = ccVarNewBuilder.build();
                u2Var.makeExtensionsImmutable();
                throw th2;
            }
        }
    }
}
