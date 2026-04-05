package s1;

import androidx.core.app.NotificationCompat;
import com.explorestack.protobuf.openrtb.LossReason;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.inmobi.commons.core.configs.AdConfig;
import com.mbridge.msdk.out.MBSupportMuteAdType;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.vungle.ads.internal.protos.Sdk;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final long f85304a;

    /* renamed from: b, reason: collision with root package name */
    public static final a f85154b = new a(null);

    /* renamed from: c, reason: collision with root package name */
    public static final long f85160c = j.Key(0);

    /* renamed from: d, reason: collision with root package name */
    public static final long f85166d = j.Key(1);

    /* renamed from: e, reason: collision with root package name */
    public static final long f85172e = j.Key(2);

    /* renamed from: f, reason: collision with root package name */
    public static final long f85178f = j.Key(3);

    /* renamed from: g, reason: collision with root package name */
    public static final long f85184g = j.Key(4);

    /* renamed from: h, reason: collision with root package name */
    public static final long f85190h = j.Key(259);

    /* renamed from: i, reason: collision with root package name */
    public static final long f85196i = j.Key(260);

    /* renamed from: j, reason: collision with root package name */
    public static final long f85202j = j.Key(261);

    /* renamed from: k, reason: collision with root package name */
    public static final long f85208k = j.Key(262);

    /* renamed from: l, reason: collision with root package name */
    public static final long f85214l = j.Key(263);

    /* renamed from: m, reason: collision with root package name */
    public static final long f85220m = j.Key(280);

    /* renamed from: n, reason: collision with root package name */
    public static final long f85226n = j.Key(281);

    /* renamed from: o, reason: collision with root package name */
    public static final long f85232o = j.Key(282);

    /* renamed from: p, reason: collision with root package name */
    public static final long f85238p = j.Key(283);

    /* renamed from: q, reason: collision with root package name */
    public static final long f85244q = j.Key(5);

    /* renamed from: r, reason: collision with root package name */
    public static final long f85250r = j.Key(6);

    /* renamed from: s, reason: collision with root package name */
    public static final long f85256s = j.Key(19);

    /* renamed from: t, reason: collision with root package name */
    public static final long f85262t = j.Key(20);

    /* renamed from: u, reason: collision with root package name */
    public static final long f85268u = j.Key(21);

    /* renamed from: v, reason: collision with root package name */
    public static final long f85274v = j.Key(22);

    /* renamed from: w, reason: collision with root package name */
    public static final long f85280w = j.Key(23);

    /* renamed from: x, reason: collision with root package name */
    public static final long f85286x = j.Key(268);

    /* renamed from: y, reason: collision with root package name */
    public static final long f85292y = j.Key(269);

    /* renamed from: z, reason: collision with root package name */
    public static final long f85298z = j.Key(270);
    public static final long A = j.Key(271);
    public static final long B = j.Key(24);
    public static final long C = j.Key(25);
    public static final long D = j.Key(26);
    public static final long E = j.Key(27);
    public static final long F = j.Key(28);
    public static final long G = j.Key(7);
    public static final long H = j.Key(8);
    public static final long I = j.Key(9);
    public static final long J = j.Key(10);
    public static final long K = j.Key(11);
    public static final long L = j.Key(12);
    public static final long M = j.Key(13);
    public static final long N = j.Key(14);
    public static final long O = j.Key(15);
    public static final long P = j.Key(16);
    public static final long Q = j.Key(81);
    public static final long R = j.Key(69);
    public static final long S = j.Key(17);
    public static final long T = j.Key(70);
    public static final long U = j.Key(18);
    public static final long V = j.Key(29);
    public static final long W = j.Key(30);
    public static final long X = j.Key(31);
    public static final long Y = j.Key(32);
    public static final long Z = j.Key(33);

    /* renamed from: a0, reason: collision with root package name */
    public static final long f85149a0 = j.Key(34);

    /* renamed from: b0, reason: collision with root package name */
    public static final long f85155b0 = j.Key(35);

    /* renamed from: c0, reason: collision with root package name */
    public static final long f85161c0 = j.Key(36);

    /* renamed from: d0, reason: collision with root package name */
    public static final long f85167d0 = j.Key(37);

    /* renamed from: e0, reason: collision with root package name */
    public static final long f85173e0 = j.Key(38);

    /* renamed from: f0, reason: collision with root package name */
    public static final long f85179f0 = j.Key(39);

    /* renamed from: g0, reason: collision with root package name */
    public static final long f85185g0 = j.Key(40);

    /* renamed from: h0, reason: collision with root package name */
    public static final long f85191h0 = j.Key(41);

    /* renamed from: i0, reason: collision with root package name */
    public static final long f85197i0 = j.Key(42);

    /* renamed from: j0, reason: collision with root package name */
    public static final long f85203j0 = j.Key(43);

    /* renamed from: k0, reason: collision with root package name */
    public static final long f85209k0 = j.Key(44);

    /* renamed from: l0, reason: collision with root package name */
    public static final long f85215l0 = j.Key(45);

    /* renamed from: m0, reason: collision with root package name */
    public static final long f85221m0 = j.Key(46);

    /* renamed from: n0, reason: collision with root package name */
    public static final long f85227n0 = j.Key(47);

    /* renamed from: o0, reason: collision with root package name */
    public static final long f85233o0 = j.Key(48);

    /* renamed from: p0, reason: collision with root package name */
    public static final long f85239p0 = j.Key(49);

    /* renamed from: q0, reason: collision with root package name */
    public static final long f85245q0 = j.Key(50);

    /* renamed from: r0, reason: collision with root package name */
    public static final long f85251r0 = j.Key(51);

    /* renamed from: s0, reason: collision with root package name */
    public static final long f85257s0 = j.Key(52);

    /* renamed from: t0, reason: collision with root package name */
    public static final long f85263t0 = j.Key(53);

    /* renamed from: u0, reason: collision with root package name */
    public static final long f85269u0 = j.Key(54);

    /* renamed from: v0, reason: collision with root package name */
    public static final long f85275v0 = j.Key(55);

    /* renamed from: w0, reason: collision with root package name */
    public static final long f85281w0 = j.Key(56);

    /* renamed from: x0, reason: collision with root package name */
    public static final long f85287x0 = j.Key(57);

    /* renamed from: y0, reason: collision with root package name */
    public static final long f85293y0 = j.Key(58);

    /* renamed from: z0, reason: collision with root package name */
    public static final long f85299z0 = j.Key(59);
    public static final long A0 = j.Key(60);
    public static final long B0 = j.Key(61);
    public static final long C0 = j.Key(62);
    public static final long D0 = j.Key(63);
    public static final long E0 = j.Key(64);
    public static final long F0 = j.Key(65);
    public static final long G0 = j.Key(66);
    public static final long H0 = j.Key(67);
    public static final long I0 = j.Key(112);
    public static final long J0 = j.Key(111);
    public static final long K0 = j.Key(113);
    public static final long L0 = j.Key(114);
    public static final long M0 = j.Key(115);
    public static final long N0 = j.Key(116);
    public static final long O0 = j.Key(Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE);
    public static final long P0 = j.Key(Sdk.SDKError.Reason.PROTOBUF_SERIALIZATION_ERROR_VALUE);
    public static final long Q0 = j.Key(Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE);
    public static final long R0 = j.Key(AdConfig.DEFAULT_PING_V2_INTERVAL_NORMAL);
    public static final long S0 = j.Key(Sdk.SDKError.Reason.TPAT_ERROR_VALUE);
    public static final long T0 = j.Key(Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE);
    public static final long U0 = j.Key(Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE);
    public static final long V0 = j.Key(Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
    public static final long W0 = j.Key(277);
    public static final long X0 = j.Key(278);
    public static final long Y0 = j.Key(279);
    public static final long Z0 = j.Key(68);

    /* renamed from: a1, reason: collision with root package name */
    public static final long f85150a1 = j.Key(71);

    /* renamed from: b1, reason: collision with root package name */
    public static final long f85156b1 = j.Key(72);

    /* renamed from: c1, reason: collision with root package name */
    public static final long f85162c1 = j.Key(76);

    /* renamed from: d1, reason: collision with root package name */
    public static final long f85168d1 = j.Key(73);

    /* renamed from: e1, reason: collision with root package name */
    public static final long f85174e1 = j.Key(74);

    /* renamed from: f1, reason: collision with root package name */
    public static final long f85180f1 = j.Key(75);

    /* renamed from: g1, reason: collision with root package name */
    public static final long f85186g1 = j.Key(77);

    /* renamed from: h1, reason: collision with root package name */
    public static final long f85192h1 = j.Key(78);

    /* renamed from: i1, reason: collision with root package name */
    public static final long f85198i1 = j.Key(79);

    /* renamed from: j1, reason: collision with root package name */
    public static final long f85204j1 = j.Key(80);

    /* renamed from: k1, reason: collision with root package name */
    public static final long f85210k1 = j.Key(82);

    /* renamed from: l1, reason: collision with root package name */
    public static final long f85216l1 = j.Key(83);

    /* renamed from: m1, reason: collision with root package name */
    public static final long f85222m1 = j.Key(84);

    /* renamed from: n1, reason: collision with root package name */
    public static final long f85228n1 = j.Key(92);

    /* renamed from: o1, reason: collision with root package name */
    public static final long f85234o1 = j.Key(93);

    /* renamed from: p1, reason: collision with root package name */
    public static final long f85240p1 = j.Key(94);

    /* renamed from: q1, reason: collision with root package name */
    public static final long f85246q1 = j.Key(95);

    /* renamed from: r1, reason: collision with root package name */
    public static final long f85252r1 = j.Key(96);

    /* renamed from: s1, reason: collision with root package name */
    public static final long f85258s1 = j.Key(97);

    /* renamed from: t1, reason: collision with root package name */
    public static final long f85264t1 = j.Key(98);

    /* renamed from: u1, reason: collision with root package name */
    public static final long f85270u1 = j.Key(99);

    /* renamed from: v1, reason: collision with root package name */
    public static final long f85276v1 = j.Key(100);

    /* renamed from: w1, reason: collision with root package name */
    public static final long f85282w1 = j.Key(101);

    /* renamed from: x1, reason: collision with root package name */
    public static final long f85288x1 = j.Key(102);

    /* renamed from: y1, reason: collision with root package name */
    public static final long f85294y1 = j.Key(103);

    /* renamed from: z1, reason: collision with root package name */
    public static final long f85300z1 = j.Key(104);
    public static final long A1 = j.Key(105);
    public static final long B1 = j.Key(106);
    public static final long C1 = j.Key(107);
    public static final long D1 = j.Key(108);
    public static final long E1 = j.Key(109);
    public static final long F1 = j.Key(110);
    public static final long G1 = j.Key(188);
    public static final long H1 = j.Key(PsExtractor.PRIVATE_STREAM_1);
    public static final long I1 = j.Key(190);
    public static final long J1 = j.Key(191);
    public static final long K1 = j.Key(PsExtractor.AUDIO_STREAM);
    public static final long L1 = j.Key(193);
    public static final long M1 = j.Key(194);
    public static final long N1 = j.Key(195);
    public static final long O1 = j.Key(196);
    public static final long P1 = j.Key(197);
    public static final long Q1 = j.Key(198);
    public static final long R1 = j.Key(199);
    public static final long S1 = j.Key(200);
    public static final long T1 = j.Key(201);
    public static final long U1 = j.Key(202);
    public static final long V1 = j.Key(203);
    public static final long W1 = j.Key(Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE);
    public static final long X1 = j.Key(Sdk.SDKError.Reason.MRAID_JS_WRITE_FAILED_VALUE);
    public static final long Y1 = j.Key(Sdk.SDKError.Reason.OMSDK_DOWNLOAD_JS_ERROR_VALUE);
    public static final long Z1 = j.Key(Sdk.SDKError.Reason.OMSDK_JS_WRITE_FAILED_VALUE);

    /* renamed from: a2, reason: collision with root package name */
    public static final long f85151a2 = j.Key(134);

    /* renamed from: b2, reason: collision with root package name */
    public static final long f85157b2 = j.Key(135);

    /* renamed from: c2, reason: collision with root package name */
    public static final long f85163c2 = j.Key(Sdk.SDKError.Reason.PRIVACY_URL_ERROR_VALUE);

    /* renamed from: d2, reason: collision with root package name */
    public static final long f85169d2 = j.Key(Sdk.SDKError.Reason.TPAT_RETRY_FAILED_VALUE);

    /* renamed from: e2, reason: collision with root package name */
    public static final long f85175e2 = j.Key(138);

    /* renamed from: f2, reason: collision with root package name */
    public static final long f85181f2 = j.Key(139);

    /* renamed from: g2, reason: collision with root package name */
    public static final long f85187g2 = j.Key(140);

    /* renamed from: h2, reason: collision with root package name */
    public static final long f85193h2 = j.Key(141);

    /* renamed from: i2, reason: collision with root package name */
    public static final long f85199i2 = j.Key(142);

    /* renamed from: j2, reason: collision with root package name */
    public static final long f85205j2 = j.Key(143);

    /* renamed from: k2, reason: collision with root package name */
    public static final long f85211k2 = j.Key(144);

    /* renamed from: l2, reason: collision with root package name */
    public static final long f85217l2 = j.Key(145);

    /* renamed from: m2, reason: collision with root package name */
    public static final long f85223m2 = j.Key(146);

    /* renamed from: n2, reason: collision with root package name */
    public static final long f85229n2 = j.Key(147);

    /* renamed from: o2, reason: collision with root package name */
    public static final long f85235o2 = j.Key(148);

    /* renamed from: p2, reason: collision with root package name */
    public static final long f85241p2 = j.Key(149);

    /* renamed from: q2, reason: collision with root package name */
    public static final long f85247q2 = j.Key(150);

    /* renamed from: r2, reason: collision with root package name */
    public static final long f85253r2 = j.Key(151);

    /* renamed from: s2, reason: collision with root package name */
    public static final long f85259s2 = j.Key(152);

    /* renamed from: t2, reason: collision with root package name */
    public static final long f85265t2 = j.Key(153);

    /* renamed from: u2, reason: collision with root package name */
    public static final long f85271u2 = j.Key(154);

    /* renamed from: v2, reason: collision with root package name */
    public static final long f85277v2 = j.Key(ModuleDescriptor.MODULE_VERSION);

    /* renamed from: w2, reason: collision with root package name */
    public static final long f85283w2 = j.Key(156);

    /* renamed from: x2, reason: collision with root package name */
    public static final long f85289x2 = j.Key(157);

    /* renamed from: y2, reason: collision with root package name */
    public static final long f85295y2 = j.Key(158);

    /* renamed from: z2, reason: collision with root package name */
    public static final long f85301z2 = j.Key(159);
    public static final long A2 = j.Key(160);
    public static final long B2 = j.Key(161);
    public static final long C2 = j.Key(162);
    public static final long D2 = j.Key(163);
    public static final long E2 = j.Key(126);
    public static final long F2 = j.Key(127);
    public static final long G2 = j.Key(85);
    public static final long H2 = j.Key(86);
    public static final long I2 = j.Key(130);
    public static final long J2 = j.Key(87);
    public static final long K2 = j.Key(88);
    public static final long L2 = j.Key(89);
    public static final long M2 = j.Key(90);
    public static final long N2 = j.Key(128);
    public static final long O2 = j.Key(Sdk.SDKError.Reason.INVALID_WATERFALL_PLACEMENT_ID_VALUE);
    public static final long P2 = j.Key(129);
    public static final long Q2 = j.Key(Sdk.SDKError.Reason.PRIVACY_ICON_FALLBACK_ERROR_VALUE);
    public static final long R2 = j.Key(272);
    public static final long S2 = j.Key(273);
    public static final long T2 = j.Key(274);
    public static final long U2 = j.Key(275);
    public static final long V2 = j.Key(91);
    public static final long W2 = j.Key(164);
    public static final long X2 = j.Key(165);
    public static final long Y2 = j.Key(166);
    public static final long Z2 = j.Key(167);

    /* renamed from: a3, reason: collision with root package name */
    public static final long f85152a3 = j.Key(168);

    /* renamed from: b3, reason: collision with root package name */
    public static final long f85158b3 = j.Key(169);

    /* renamed from: c3, reason: collision with root package name */
    public static final long f85164c3 = j.Key(170);

    /* renamed from: d3, reason: collision with root package name */
    public static final long f85170d3 = j.Key(171);

    /* renamed from: e3, reason: collision with root package name */
    public static final long f85176e3 = j.Key(172);

    /* renamed from: f3, reason: collision with root package name */
    public static final long f85182f3 = j.Key(173);

    /* renamed from: g3, reason: collision with root package name */
    public static final long f85188g3 = j.Key(174);

    /* renamed from: h3, reason: collision with root package name */
    public static final long f85194h3 = j.Key(175);

    /* renamed from: i3, reason: collision with root package name */
    public static final long f85200i3 = j.Key(176);

    /* renamed from: j3, reason: collision with root package name */
    public static final long f85206j3 = j.Key(177);

    /* renamed from: k3, reason: collision with root package name */
    public static final long f85212k3 = j.Key(178);

    /* renamed from: l3, reason: collision with root package name */
    public static final long f85218l3 = j.Key(179);

    /* renamed from: m3, reason: collision with root package name */
    public static final long f85224m3 = j.Key(180);

    /* renamed from: n3, reason: collision with root package name */
    public static final long f85230n3 = j.Key(181);

    /* renamed from: o3, reason: collision with root package name */
    public static final long f85236o3 = j.Key(182);

    /* renamed from: p3, reason: collision with root package name */
    public static final long f85242p3 = j.Key(183);

    /* renamed from: q3, reason: collision with root package name */
    public static final long f85248q3 = j.Key(184);

    /* renamed from: r3, reason: collision with root package name */
    public static final long f85254r3 = j.Key(185);

    /* renamed from: s3, reason: collision with root package name */
    public static final long f85260s3 = j.Key(186);

    /* renamed from: t3, reason: collision with root package name */
    public static final long f85266t3 = j.Key(187);

    /* renamed from: u3, reason: collision with root package name */
    public static final long f85272u3 = j.Key(204);

    /* renamed from: v3, reason: collision with root package name */
    public static final long f85278v3 = j.Key(205);

    /* renamed from: w3, reason: collision with root package name */
    public static final long f85284w3 = j.Key(206);

    /* renamed from: x3, reason: collision with root package name */
    public static final long f85290x3 = j.Key(207);

    /* renamed from: y3, reason: collision with root package name */
    public static final long f85296y3 = j.Key(208);

    /* renamed from: z3, reason: collision with root package name */
    public static final long f85302z3 = j.Key(209);
    public static final long A3 = j.Key(210);
    public static final long B3 = j.Key(LossReason.LOSS_REASON_CREATIVE_FILTERED_ANIMATION_TOO_LONG_VALUE);
    public static final long C3 = j.Key(212);
    public static final long D3 = j.Key(Sdk.SDKError.Reason.INVALID_ADUNIT_BID_PAYLOAD_VALUE);
    public static final long E3 = j.Key(Sdk.SDKError.Reason.INVALID_GZIP_BID_PAYLOAD_VALUE);
    public static final long F3 = j.Key(Sdk.SDKError.Reason.AD_RESPONSE_EMPTY_VALUE);
    public static final long G3 = j.Key(Sdk.SDKError.Reason.AD_RESPONSE_INVALID_TEMPLATE_TYPE_VALUE);
    public static final long H3 = j.Key(Sdk.SDKError.Reason.AD_RESPONSE_TIMED_OUT_VALUE);
    public static final long I3 = j.Key(Sdk.SDKError.Reason.MRAID_JS_DOES_NOT_EXIST_VALUE);
    public static final long J3 = j.Key(Sdk.SDKError.Reason.MRAID_JS_COPY_FAILED_VALUE);
    public static final long K3 = j.Key(Sdk.SDKError.Reason.AD_RESPONSE_RETRY_AFTER_VALUE);
    public static final long L3 = j.Key(Sdk.SDKError.Reason.AD_LOAD_FAIL_RETRY_AFTER_VALUE);
    public static final long M3 = j.Key(Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE);
    public static final long N3 = j.Key(224);
    public static final long O3 = j.Key(276);
    public static final long P3 = j.Key(Sdk.SDKError.Reason.AD_LOAD_FAIL_PLACEMENT_ID_MISMATCH_VALUE);
    public static final long Q3 = j.Key(229);
    public static final long R3 = j.Key(230);
    public static final long S3 = j.Key(231);
    public static final long T3 = j.Key(232);
    public static final long U3 = j.Key(233);
    public static final long V3 = j.Key(234);
    public static final long W3 = j.Key(235);
    public static final long X3 = j.Key(236);
    public static final long Y3 = j.Key(237);
    public static final long Z3 = j.Key(238);

    /* renamed from: a4, reason: collision with root package name */
    public static final long f85153a4 = j.Key(239);

    /* renamed from: b4, reason: collision with root package name */
    public static final long f85159b4 = j.Key(PsExtractor.VIDEO_STREAM_MASK);

    /* renamed from: c4, reason: collision with root package name */
    public static final long f85165c4 = j.Key(241);

    /* renamed from: d4, reason: collision with root package name */
    public static final long f85171d4 = j.Key(242);

    /* renamed from: e4, reason: collision with root package name */
    public static final long f85177e4 = j.Key(243);

    /* renamed from: f4, reason: collision with root package name */
    public static final long f85183f4 = j.Key(244);

    /* renamed from: g4, reason: collision with root package name */
    public static final long f85189g4 = j.Key(245);

    /* renamed from: h4, reason: collision with root package name */
    public static final long f85195h4 = j.Key(246);

    /* renamed from: i4, reason: collision with root package name */
    public static final long f85201i4 = j.Key(247);

    /* renamed from: j4, reason: collision with root package name */
    public static final long f85207j4 = j.Key(248);

    /* renamed from: k4, reason: collision with root package name */
    public static final long f85213k4 = j.Key(249);

    /* renamed from: l4, reason: collision with root package name */
    public static final long f85219l4 = j.Key(250);

    /* renamed from: m4, reason: collision with root package name */
    public static final long f85225m4 = j.Key(251);

    /* renamed from: n4, reason: collision with root package name */
    public static final long f85231n4 = j.Key(252);

    /* renamed from: o4, reason: collision with root package name */
    public static final long f85237o4 = j.Key(253);

    /* renamed from: p4, reason: collision with root package name */
    public static final long f85243p4 = j.Key(254);

    /* renamed from: q4, reason: collision with root package name */
    public static final long f85249q4 = j.Key(255);

    /* renamed from: r4, reason: collision with root package name */
    public static final long f85255r4 = j.Key(NotificationCompat.FLAG_LOCAL_ONLY);

    /* renamed from: s4, reason: collision with root package name */
    public static final long f85261s4 = j.Key(257);

    /* renamed from: t4, reason: collision with root package name */
    public static final long f85267t4 = j.Key(258);

    /* renamed from: u4, reason: collision with root package name */
    public static final long f85273u4 = j.Key(264);

    /* renamed from: v4, reason: collision with root package name */
    public static final long f85279v4 = j.Key(265);

    /* renamed from: w4, reason: collision with root package name */
    public static final long f85285w4 = j.Key(266);

    /* renamed from: x4, reason: collision with root package name */
    public static final long f85291x4 = j.Key(267);

    /* renamed from: y4, reason: collision with root package name */
    public static final long f85297y4 = j.Key(284);

    /* renamed from: z4, reason: collision with root package name */
    public static final long f85303z4 = j.Key(285);
    public static final long A4 = j.Key(286);
    public static final long B4 = j.Key(MBSupportMuteAdType.INTERSTITIAL_VIDEO);
    public static final long C4 = j.Key(288);

    public /* synthetic */ b(long j10) {
        this.f85304a = j10;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ b m6689boximpl(long j10) {
        return new b(j10);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m6691equalsimpl(long j10, Object obj) {
        return (obj instanceof b) && j10 == ((b) obj).m6695unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m6692equalsimpl0(long j10, long j11) {
        return j10 == j11;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m6693hashCodeimpl(long j10) {
        return Long.hashCode(j10);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m6694toStringimpl(long j10) {
        return o2.m(j10, "Key code: ");
    }

    public boolean equals(Object obj) {
        return m6691equalsimpl(this.f85304a, obj);
    }

    public final long getKeyCode() {
        return this.f85304a;
    }

    public int hashCode() {
        return m6693hashCodeimpl(this.f85304a);
    }

    public String toString() {
        return m6694toStringimpl(this.f85304a);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m6695unboximpl() {
        return this.f85304a;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m6690constructorimpl(long j10) {
        return j10;
    }
}
