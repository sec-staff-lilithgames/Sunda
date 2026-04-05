package com.facebook.ads.redexgen.core;

import com.applovin.shadow.okio.Utf8;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Arrays;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* renamed from: com.facebook.ads.redexgen.X.nT, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C2531nT implements InterfaceC1157Dn {
    public static byte[] A01;
    public final /* synthetic */ C2530nS A00;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 18);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{118, 67, 67, 82, 90, 71, 67, 82, 83, 23, 67, 88, 23, 84, 69, 82, 86, 67, 82, 23, 83, 82, 84, 88, 83, 82, 69, 23, 81, 88, 69, 23, 66, 89, 68, 66, 71, 71, 88, 69, 67, 82, 83, 23, 81, 88, 69, 90, 86, 67, 28, 13, 13, 17, 20, 30, 28, 9, 20, 18, 19, 82, 30, 24, 28, 80, 75, 77, 69, 121, 104, 104, 116, 113, 123, 121, 108, 113, 119, 118, 55, 123, 125, 121, 53, 47, 40, 32, 107, 122, 122, 102, 99, 105, 107, 126, 99, 101, 100, 37, 110, 124, 104, 121, AbstractJsonLexerKt.TC_INVALID, 104, 121, 69, 84, 84, 72, 77, 71, 69, 80, 77, 75, 74, 11, 84, 67, 87, 5, 20, 20, 8, 13, 7, 5, 16, 13, 11, 10, 75, 16, 16, 9, 8, 79, 28, 9, 8, 0, 17, 17, 13, 8, 2, 0, 21, 8, 14, 15, 78, 25, 76, 12, 17, 85, 76, 2, 4, 0, 76, 87, 81, 89, 53, 36, 36, 56, 61, 55, 53, 32, 61, 59, 58, 123, 44, 121, 57, 36, 96, 121, 34, 32, 32, 50, 35, 35, Utf8.REPLACEMENT_BYTE, 58, 48, 50, 39, 58, 60, 61, 124, 43, 126, 34, 38, 58, 48, 56, 39, 58, 62, 54, 126, 39, 43, 96, 52, 12, 29, 29, 1, 4, 14, 12, 25, 4, 2, 3, 66, 21, 64, 30, 24, 15, 31, 4, 29, 68, 85, 72, 68, 31, 70, 68, 68, 83, 66, 95, 83, 8, 95, 10, 84, 84, 70};
    }

    public C2531nT(C2530nS c2530nS) {
        this.A00 = c2530nS;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:4:0x0009  */
    @Override // com.facebook.ads.redexgen.core.InterfaceC1157Dn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.facebook.ads.redexgen.core.InterfaceC2353kN A5C(com.facebook.ads.redexgen.core.C2614or r6) {
        /*
            Method dump skipped, instructions count: 384
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.C2531nT.A5C(com.facebook.ads.redexgen.X.or):com.facebook.ads.redexgen.X.kN");
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1157Dn
    public final boolean AJc(C2614or c2614or) {
        String str = c2614or.A0W;
        String mimeType = A00(236, 8, 34);
        if (!mimeType.equals(str)) {
            String mimeType2 = A00(244, 10, 53);
            if (!mimeType2.equals(str)) {
                String mimeType3 = A00(Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE, 20, Sdk.SDKError.Reason.PROTOBUF_SERIALIZATION_ERROR_VALUE);
                if (!mimeType3.equals(str)) {
                    String mimeType4 = A00(167, 21, 70);
                    if (!mimeType4.equals(str)) {
                        String mimeType5 = A00(Sdk.SDKError.Reason.AD_RESPONSE_INVALID_TEMPLATE_TYPE_VALUE, 20, 127);
                        if (!mimeType5.equals(str)) {
                            String mimeType6 = A00(188, 28, 65);
                            if (!mimeType6.equals(str)) {
                                String mimeType7 = A00(50, 19, 111);
                                if (!mimeType7.equals(str)) {
                                    String mimeType8 = A00(142, 25, 115);
                                    if (!mimeType8.equals(str)) {
                                        String mimeType9 = A00(69, 19, 10);
                                        if (!mimeType9.equals(str)) {
                                            String mimeType10 = A00(88, 19, 24);
                                            if (!mimeType10.equals(str)) {
                                                String mimeType11 = A00(107, 15, 54);
                                                if (!mimeType11.equals(str)) {
                                                    return false;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return true;
    }
}
