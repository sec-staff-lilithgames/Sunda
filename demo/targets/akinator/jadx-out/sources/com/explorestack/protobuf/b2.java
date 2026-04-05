package com.explorestack.protobuf;

import androidx.core.app.NotificationCompat;
import com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters;
import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class b2 extends d {
    @Override // com.explorestack.protobuf.d, com.explorestack.protobuf.fa
    public f2 parsePartialFrom(y yVar, m5 m5Var) throws InvalidProtocolBufferException {
        f2 f2Var = new f2();
        m5Var.getClass();
        cc ccVarNewBuilder = gc.newBuilder();
        boolean z10 = false;
        while (!z10) {
            try {
                try {
                    int tag = yVar.readTag();
                    switch (tag) {
                        case 0:
                            z10 = true;
                        case 10:
                            ByteString bytes = yVar.readBytes();
                            f2Var.f22106b = 1 | f2Var.f22106b;
                            f2Var.f22107c = bytes;
                        case 18:
                            ByteString bytes2 = yVar.readBytes();
                            f2Var.f22106b |= 32;
                            f2Var.f22112i = bytes2;
                        case 24:
                            f2Var.f22106b |= 2;
                            f2Var.f22108e = yVar.readInt32();
                        case 32:
                            int i10 = yVar.readEnum();
                            if (DescriptorProtos$FieldDescriptorProto$Label.valueOf(i10) == null) {
                                ccVarNewBuilder.mergeVarintField(4, i10);
                            } else {
                                f2Var.f22106b |= 4;
                                f2Var.f22109f = i10;
                            }
                        case 40:
                            int i11 = yVar.readEnum();
                            if (DescriptorProtos$FieldDescriptorProto$Type.valueOf(i11) == null) {
                                ccVarNewBuilder.mergeVarintField(5, i11);
                            } else {
                                f2Var.f22106b |= 8;
                                f2Var.f22110g = i11;
                            }
                        case 50:
                            ByteString bytes3 = yVar.readBytes();
                            f2Var.f22106b |= 16;
                            f2Var.f22111h = bytes3;
                        case 58:
                            ByteString bytes4 = yVar.readBytes();
                            f2Var.f22106b |= 64;
                            f2Var.f22113j = bytes4;
                        case TokenParametersOuterClass$TokenParameters.LGPDCONSENT_FIELD_NUMBER /* 66 */:
                            i2 builder = (f2Var.f22106b & 512) != 0 ? f2Var.f22116m.toBuilder() : null;
                            l2 l2Var = (l2) yVar.readMessage(l2.f22325n, m5Var);
                            f2Var.f22116m = l2Var;
                            if (builder != null) {
                                builder.mergeFrom(l2Var);
                                f2Var.f22116m = builder.buildPartial();
                            }
                            f2Var.f22106b |= 512;
                        case TokenParametersOuterClass$TokenParameters.MEDIAMUTED_FIELD_NUMBER /* 72 */:
                            f2Var.f22106b |= 128;
                            f2Var.f22114k = yVar.readInt32();
                        case 82:
                            ByteString bytes5 = yVar.readBytes();
                            f2Var.f22106b |= NotificationCompat.FLAG_LOCAL_ONLY;
                            f2Var.f22115l = bytes5;
                        case PRIVACY_URL_ERROR_VALUE:
                            f2Var.f22106b |= 1024;
                            f2Var.f22117n = yVar.readBool();
                        default:
                            if (!f2Var.parseUnknownField(yVar, ccVarNewBuilder, m5Var, tag)) {
                                z10 = true;
                            }
                    }
                } catch (InvalidProtocolBufferException e10) {
                    throw e10.setUnfinishedMessage(f2Var);
                } catch (IOException e11) {
                    throw new InvalidProtocolBufferException(e11).setUnfinishedMessage(f2Var);
                }
            } catch (Throwable th2) {
                f2Var.unknownFields = ccVarNewBuilder.build();
                f2Var.makeExtensionsImmutable();
                throw th2;
            }
        }
        f2Var.unknownFields = ccVarNewBuilder.build();
        f2Var.makeExtensionsImmutable();
        return f2Var;
    }
}
