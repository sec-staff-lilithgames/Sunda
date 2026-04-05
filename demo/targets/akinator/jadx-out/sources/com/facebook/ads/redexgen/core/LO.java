package com.facebook.ads.redexgen.core;

import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.vungle.ads.internal.protos.Sdk;
import io.bidmachine.protobuf.EventTypeExtended;

/* loaded from: assets/audience_network.dex */
public interface LO<T> {
    public static final C10067c A00;
    public static final C10057b A01;
    public static final C10057b A02;
    public static final C10057b A03;
    public static final C10057b A04;
    public static final C10057b A05;
    public static final C10057b A06;
    public static final C10057b A07;
    public static final C10057b A08;
    public static final C10057b A09;
    public static final C10057b A0A;
    public static final C10057b A0B;
    public static final C10057b A0C;
    public static final C10057b A0D;
    public static final C10057b A0E;
    public static final C10057b A0F;
    public static final C10057b A0G;
    public static final C10057b A0H;
    public static final C10057b A0I;
    public static final C10057b A0J;
    public static final C10057b A0K;
    public static final C10057b A0L;
    public static final C10047a A0M;
    public static final C7Z A0N;
    public static final C7Z A0O;
    public static final C7Z A0P;
    public static final C7Z A0Q;
    public static final C7Z A0R;
    public static final C7Z A0S;
    public static final C7Z A0T;
    public static final C7Z A0U;
    public static final C7Z A0V;
    public static final C7Z A0W;
    public static final C7X A0X;
    public static final C7X A0Y;
    public static final C7V A0Z;
    public static final C7V A0a;
    public static final C7V A0b;
    public static final C7V A0c;
    public static final C7V A0d;
    public static final C7V A0e;
    public static final C7V A0f;
    public static final C7V A0g;
    public static final C7V A0h;
    public static final C7V A0i;
    public static final C7V A0j;
    public static final C7V A0k;
    public static final C7V A0l;
    public static final C7V A0m;
    public static final C7V A0n;
    public static final C7V A0o;

    String getName();

    /* JADX WARN: Type inference failed for: r0v1, types: [com.facebook.ads.redexgen.X.7V] */
    /* JADX WARN: Type inference failed for: r0v101, types: [com.facebook.ads.redexgen.X.7Z] */
    /* JADX WARN: Type inference failed for: r0v11, types: [com.facebook.ads.redexgen.X.7b] */
    /* JADX WARN: Type inference failed for: r0v15, types: [com.facebook.ads.redexgen.X.7Z] */
    /* JADX WARN: Type inference failed for: r0v17, types: [com.facebook.ads.redexgen.X.7b] */
    /* JADX WARN: Type inference failed for: r0v19, types: [com.facebook.ads.redexgen.X.7V] */
    /* JADX WARN: Type inference failed for: r0v21, types: [com.facebook.ads.redexgen.X.7b] */
    /* JADX WARN: Type inference failed for: r0v23, types: [com.facebook.ads.redexgen.X.7b] */
    /* JADX WARN: Type inference failed for: r0v25, types: [com.facebook.ads.redexgen.X.7b] */
    /* JADX WARN: Type inference failed for: r0v27, types: [com.facebook.ads.redexgen.X.7b] */
    /* JADX WARN: Type inference failed for: r0v29, types: [com.facebook.ads.redexgen.X.7b] */
    /* JADX WARN: Type inference failed for: r0v3, types: [com.facebook.ads.redexgen.X.7Z] */
    /* JADX WARN: Type inference failed for: r0v31, types: [com.facebook.ads.redexgen.X.7V] */
    /* JADX WARN: Type inference failed for: r0v33, types: [com.facebook.ads.redexgen.X.7V] */
    /* JADX WARN: Type inference failed for: r0v37, types: [com.facebook.ads.redexgen.X.7Z] */
    /* JADX WARN: Type inference failed for: r0v39, types: [com.facebook.ads.redexgen.X.7X] */
    /* JADX WARN: Type inference failed for: r0v41, types: [com.facebook.ads.redexgen.X.7X] */
    /* JADX WARN: Type inference failed for: r0v43, types: [com.facebook.ads.redexgen.X.7V] */
    /* JADX WARN: Type inference failed for: r0v45, types: [com.facebook.ads.redexgen.X.7b] */
    /* JADX WARN: Type inference failed for: r0v47, types: [com.facebook.ads.redexgen.X.7b] */
    /* JADX WARN: Type inference failed for: r0v49, types: [com.facebook.ads.redexgen.X.7Z] */
    /* JADX WARN: Type inference failed for: r0v5, types: [com.facebook.ads.redexgen.X.7V] */
    /* JADX WARN: Type inference failed for: r0v51, types: [com.facebook.ads.redexgen.X.7V] */
    /* JADX WARN: Type inference failed for: r0v53, types: [com.facebook.ads.redexgen.X.7V] */
    /* JADX WARN: Type inference failed for: r0v55, types: [com.facebook.ads.redexgen.X.7b] */
    /* JADX WARN: Type inference failed for: r0v57, types: [com.facebook.ads.redexgen.X.7Z] */
    /* JADX WARN: Type inference failed for: r0v59, types: [com.facebook.ads.redexgen.X.7Z] */
    /* JADX WARN: Type inference failed for: r0v61, types: [com.facebook.ads.redexgen.X.7Z] */
    /* JADX WARN: Type inference failed for: r0v63, types: [com.facebook.ads.redexgen.X.7b] */
    /* JADX WARN: Type inference failed for: r0v65, types: [com.facebook.ads.redexgen.X.7b] */
    /* JADX WARN: Type inference failed for: r0v67, types: [com.facebook.ads.redexgen.X.7V] */
    /* JADX WARN: Type inference failed for: r0v69, types: [com.facebook.ads.redexgen.X.7V] */
    /* JADX WARN: Type inference failed for: r0v7, types: [com.facebook.ads.redexgen.X.7b] */
    /* JADX WARN: Type inference failed for: r0v71, types: [com.facebook.ads.redexgen.X.7V] */
    /* JADX WARN: Type inference failed for: r0v73, types: [com.facebook.ads.redexgen.X.7V] */
    /* JADX WARN: Type inference failed for: r0v75, types: [com.facebook.ads.redexgen.X.7Z] */
    /* JADX WARN: Type inference failed for: r0v77, types: [com.facebook.ads.redexgen.X.7b] */
    /* JADX WARN: Type inference failed for: r0v79, types: [com.facebook.ads.redexgen.X.7b] */
    /* JADX WARN: Type inference failed for: r0v81, types: [com.facebook.ads.redexgen.X.7b] */
    /* JADX WARN: Type inference failed for: r0v83, types: [com.facebook.ads.redexgen.X.7V] */
    /* JADX WARN: Type inference failed for: r0v85, types: [com.facebook.ads.redexgen.X.7V] */
    /* JADX WARN: Type inference failed for: r0v87, types: [com.facebook.ads.redexgen.X.7Z] */
    /* JADX WARN: Type inference failed for: r0v89, types: [com.facebook.ads.redexgen.X.7b] */
    /* JADX WARN: Type inference failed for: r0v9, types: [com.facebook.ads.redexgen.X.7b] */
    /* JADX WARN: Type inference failed for: r0v91, types: [com.facebook.ads.redexgen.X.7b] */
    /* JADX WARN: Type inference failed for: r0v93, types: [com.facebook.ads.redexgen.X.7b] */
    /* JADX WARN: Type inference failed for: r0v95, types: [com.facebook.ads.redexgen.X.7V] */
    /* JADX WARN: Type inference failed for: r0v97, types: [com.facebook.ads.redexgen.X.7b] */
    /* JADX WARN: Type inference failed for: r0v99, types: [com.facebook.ads.redexgen.X.7V] */
    static {
        final String strA00 = C0P.A00(436, 12, 127);
        A0j = new AbstractC2274j4<String>(strA00) { // from class: com.facebook.ads.redexgen.X.7V
        };
        final String strA002 = C0P.A00(Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE, 10, 52);
        A0O = new AbstractC2274j4<Integer>(strA002) { // from class: com.facebook.ads.redexgen.X.7Z
        };
        final String strA003 = C0P.A00(Sdk.SDKError.Reason.MRAID_JS_DOES_NOT_EXIST_VALUE, 2, 48);
        A0g = new AbstractC2274j4<String>(strA003) { // from class: com.facebook.ads.redexgen.X.7V
        };
        final String strA004 = C0P.A00(36, 15, 90);
        A01 = new AbstractC2274j4<Boolean>(strA004) { // from class: com.facebook.ads.redexgen.X.7b
        };
        final String strA005 = C0P.A00(380, 21, 109);
        A0I = new AbstractC2274j4<Boolean>(strA005) { // from class: com.facebook.ads.redexgen.X.7b
        };
        final String strA006 = C0P.A00(156, 7, 19);
        A03 = new AbstractC2274j4<Boolean>(strA006) { // from class: com.facebook.ads.redexgen.X.7b
        };
        A00 = new C10067c(C0P.A00(543, 1, 66));
        final String strA007 = C0P.A00(574, 10, Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE);
        A0W = new AbstractC2274j4<Integer>(strA007) { // from class: com.facebook.ads.redexgen.X.7Z
        };
        final String strA008 = C0P.A00(492, 11, 50);
        A0K = new AbstractC2274j4<Boolean>(strA008) { // from class: com.facebook.ads.redexgen.X.7b
        };
        final String strA009 = C0P.A00(134, 13, 79);
        A0e = new AbstractC2274j4<String>(strA009) { // from class: com.facebook.ads.redexgen.X.7V
        };
        final String strA0010 = C0P.A00(163, 14, 61);
        A04 = new AbstractC2274j4<Boolean>(strA0010) { // from class: com.facebook.ads.redexgen.X.7b
        };
        final String strA0011 = C0P.A00(346, 15, 42);
        A0G = new AbstractC2274j4<Boolean>(strA0011) { // from class: com.facebook.ads.redexgen.X.7b
        };
        final String strA0012 = C0P.A00(70, 12, 99);
        A02 = new AbstractC2274j4<Boolean>(strA0012) { // from class: com.facebook.ads.redexgen.X.7b
        };
        final String strA0013 = C0P.A00(177, 12, 126);
        A05 = new AbstractC2274j4<Boolean>(strA0013) { // from class: com.facebook.ads.redexgen.X.7b
        };
        final String strA0014 = C0P.A00(PsExtractor.PRIVATE_STREAM_1, 11, 64);
        A06 = new AbstractC2274j4<Boolean>(strA0014) { // from class: com.facebook.ads.redexgen.X.7b
        };
        final String strA0015 = C0P.A00(476, 10, 126);
        A0l = new AbstractC2274j4<String>(strA0015) { // from class: com.facebook.ads.redexgen.X.7V
        };
        final String strA0016 = C0P.A00(448, 14, 48);
        A0k = new AbstractC2274j4<String>(strA0016) { // from class: com.facebook.ads.redexgen.X.7V
        };
        A0M = new C10047a(C0P.A00(551, 9, 42));
        final String strA0017 = C0P.A00(503, 11, 102);
        A0U = new AbstractC2274j4<Integer>(strA0017) { // from class: com.facebook.ads.redexgen.X.7Z
        };
        final String strA0018 = C0P.A00(334, 12, 0);
        A0Y = new AbstractC2274j4<Long>(strA0018) { // from class: com.facebook.ads.redexgen.X.7X
        };
        final String strA0019 = C0P.A00(307, 27, 127);
        A0X = new AbstractC2274j4<Long>(strA0019) { // from class: com.facebook.ads.redexgen.X.7X
        };
        final String strA0020 = C0P.A00(0, 18, 82);
        A0Z = new AbstractC2274j4<String>(strA0020) { // from class: com.facebook.ads.redexgen.X.7V
        };
        final String strA0021 = C0P.A00(250, 9, 1);
        A0B = new AbstractC2274j4<Boolean>(strA0021) { // from class: com.facebook.ads.redexgen.X.7b
        };
        final String strA0022 = C0P.A00(Sdk.SDKError.Reason.AD_RESPONSE_RETRY_AFTER_VALUE, 14, 78);
        A09 = new AbstractC2274j4<Boolean>(strA0022) { // from class: com.facebook.ads.redexgen.X.7b
        };
        final String strA0023 = C0P.A00(470, 6, 3);
        A0S = new AbstractC2274j4<Integer>(strA0023) { // from class: com.facebook.ads.redexgen.X.7Z
        };
        final String strA0024 = C0P.A00(401, 7, 26);
        A0h = new AbstractC2274j4<String>(strA0024) { // from class: com.facebook.ads.redexgen.X.7V
        };
        final String strA0025 = C0P.A00(147, 9, 95);
        A0f = new AbstractC2274j4<String>(strA0025) { // from class: com.facebook.ads.redexgen.X.7V
        };
        final String strA0026 = C0P.A00(200, 18, 0);
        A07 = new AbstractC2274j4<Boolean>(strA0026) { // from class: com.facebook.ads.redexgen.X.7b
        };
        final String strA0027 = C0P.A00(89, 16, 55);
        A0N = new AbstractC2274j4<Integer>(strA0027) { // from class: com.facebook.ads.redexgen.X.7Z
        };
        final String strA0028 = C0P.A00(408, 4, 54);
        A0Q = new AbstractC2274j4<Integer>(strA0028) { // from class: com.facebook.ads.redexgen.X.7Z
        };
        final String strA0029 = C0P.A00(234, 16, 43);
        A0P = new AbstractC2274j4<Integer>(strA0029) { // from class: com.facebook.ads.redexgen.X.7Z
        };
        final String strA0030 = C0P.A00(285, 19, 13);
        A0D = new AbstractC2274j4<Boolean>(strA0030) { // from class: com.facebook.ads.redexgen.X.7b
        };
        final String strA0031 = C0P.A00(259, 26, 26);
        A0C = new AbstractC2274j4<Boolean>(strA0031) { // from class: com.facebook.ads.redexgen.X.7b
        };
        final String strA0032 = C0P.A00(584, 16, 113);
        A0o = new AbstractC2274j4<String>(strA0032) { // from class: com.facebook.ads.redexgen.X.7V
        };
        final String strA0033 = C0P.A00(105, 19, 88);
        A0d = new AbstractC2274j4<String>(strA0033) { // from class: com.facebook.ads.redexgen.X.7V
        };
        final String strA0034 = C0P.A00(462, 8, 35);
        A0i = new AbstractC2274j4<String>(strA0034) { // from class: com.facebook.ads.redexgen.X.7V
        };
        final String strA0035 = C0P.A00(18, 18, 106);
        A0a = new AbstractC2274j4<String>(strA0035) { // from class: com.facebook.ads.redexgen.X.7V
        };
        final String strA0036 = C0P.A00(539, 4, 96);
        A0V = new AbstractC2274j4<Integer>(strA0036) { // from class: com.facebook.ads.redexgen.X.7Z
        };
        final String strA0037 = C0P.A00(TTAdConstant.IMAGE_URL_CODE, 13, 35);
        A0J = new AbstractC2274j4<Boolean>(strA0037) { // from class: com.facebook.ads.redexgen.X.7b
        };
        final String strA0038 = C0P.A00(IronSourceError.ERROR_NO_INTERNET_CONNECTION, 19, 35);
        A0L = new AbstractC2274j4<Boolean>(strA0038) { // from class: com.facebook.ads.redexgen.X.7b
        };
        final String strA0039 = C0P.A00(361, 19, 14);
        A0H = new AbstractC2274j4<Boolean>(strA0039) { // from class: com.facebook.ads.redexgen.X.7b
        };
        final String strA0040 = C0P.A00(560, 14, 108);
        A0n = new AbstractC2274j4<String>(strA0040) { // from class: com.facebook.ads.redexgen.X.7V
        };
        final String strA0041 = C0P.A00(58, 12, Sdk.SDKError.Reason.TPAT_ERROR_VALUE);
        A0c = new AbstractC2274j4<String>(strA0041) { // from class: com.facebook.ads.redexgen.X.7V
        };
        final String strA0042 = C0P.A00(425, 11, 47);
        A0R = new AbstractC2274j4<Integer>(strA0042) { // from class: com.facebook.ads.redexgen.X.7Z
        };
        final String strA0043 = C0P.A00(Sdk.SDKError.Reason.AD_EXPIRED_VALUE, 3, 26);
        A0A = new AbstractC2274j4<Boolean>(strA0043) { // from class: com.facebook.ads.redexgen.X.7b
        };
        final String strA0044 = C0P.A00(544, 2, 108);
        A0E = new AbstractC2274j4<Boolean>(strA0044) { // from class: com.facebook.ads.redexgen.X.7b
        };
        final String strA0045 = C0P.A00(82, 7, 5);
        A08 = new AbstractC2274j4<Boolean>(strA0045) { // from class: com.facebook.ads.redexgen.X.7b
        };
        final String strA0046 = C0P.A00(51, 7, 99);
        A0b = new AbstractC2274j4<String>(strA0046) { // from class: com.facebook.ads.redexgen.X.7V
        };
        final String strA0047 = C0P.A00(546, 5, Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE);
        A0F = new AbstractC2274j4<Boolean>(strA0047) { // from class: com.facebook.ads.redexgen.X.7b
        };
        final String strA0048 = C0P.A00(EventTypeExtended.EVENT_TYPE_EXTENDED_IMPRESSION_OPPORTUNITY_VALUE, 6, 89);
        A0m = new AbstractC2274j4<String>(strA0048) { // from class: com.facebook.ads.redexgen.X.7V
        };
        final String strA0049 = C0P.A00(486, 6, 90);
        A0T = new AbstractC2274j4<Integer>(strA0049) { // from class: com.facebook.ads.redexgen.X.7Z
        };
    }
}
