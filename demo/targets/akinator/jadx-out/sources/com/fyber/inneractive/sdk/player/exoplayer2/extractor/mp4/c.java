package com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4;

import com.fyber.inneractive.sdk.player.exoplayer2.util.z;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class c {
    public static final int A0;
    public static final int B0;
    public static final int C0;
    public static final int D0;
    public static final int E0;
    public static final int F0;
    public static final int G0;
    public static final int H0;
    public static final int I0;
    public static final int J0;
    public static final int K0;
    public static final int L0;
    public static final int M0;
    public static final int N0;
    public static final int O0;

    /* renamed from: l0, reason: collision with root package name */
    public static final int f25022l0;

    /* renamed from: m0, reason: collision with root package name */
    public static final int f25024m0;

    /* renamed from: n0, reason: collision with root package name */
    public static final int f25026n0;

    /* renamed from: o0, reason: collision with root package name */
    public static final int f25028o0;

    /* renamed from: p0, reason: collision with root package name */
    public static final int f25030p0;

    /* renamed from: q0, reason: collision with root package name */
    public static final int f25032q0;

    /* renamed from: r0, reason: collision with root package name */
    public static final int f25034r0;

    /* renamed from: s0, reason: collision with root package name */
    public static final int f25036s0;

    /* renamed from: t0, reason: collision with root package name */
    public static final int f25038t0;

    /* renamed from: u0, reason: collision with root package name */
    public static final int f25040u0;

    /* renamed from: v0, reason: collision with root package name */
    public static final int f25042v0;

    /* renamed from: w0, reason: collision with root package name */
    public static final int f25044w0;

    /* renamed from: x0, reason: collision with root package name */
    public static final int f25046x0;

    /* renamed from: y0, reason: collision with root package name */
    public static final int f25048y0;

    /* renamed from: z0, reason: collision with root package name */
    public static final int f25050z0;

    /* renamed from: a, reason: collision with root package name */
    public final int f25051a;

    /* renamed from: b, reason: collision with root package name */
    public static final int f25001b = z.a("ftyp");

    /* renamed from: c, reason: collision with root package name */
    public static final int f25003c = z.a("avc1");

    /* renamed from: d, reason: collision with root package name */
    public static final int f25005d = z.a("avc3");

    /* renamed from: e, reason: collision with root package name */
    public static final int f25007e = z.a("hvc1");

    /* renamed from: f, reason: collision with root package name */
    public static final int f25009f = z.a("hev1");

    /* renamed from: g, reason: collision with root package name */
    public static final int f25011g = z.a("s263");

    /* renamed from: h, reason: collision with root package name */
    public static final int f25013h = z.a("d263");

    /* renamed from: i, reason: collision with root package name */
    public static final int f25015i = z.a("mdat");

    /* renamed from: j, reason: collision with root package name */
    public static final int f25017j = z.a("mp4a");

    /* renamed from: k, reason: collision with root package name */
    public static final int f25019k = z.a(".mp3");

    /* renamed from: l, reason: collision with root package name */
    public static final int f25021l = z.a("wave");

    /* renamed from: m, reason: collision with root package name */
    public static final int f25023m = z.a("lpcm");

    /* renamed from: n, reason: collision with root package name */
    public static final int f25025n = z.a("sowt");

    /* renamed from: o, reason: collision with root package name */
    public static final int f25027o = z.a("ac-3");

    /* renamed from: p, reason: collision with root package name */
    public static final int f25029p = z.a("dac3");

    /* renamed from: q, reason: collision with root package name */
    public static final int f25031q = z.a("ec-3");

    /* renamed from: r, reason: collision with root package name */
    public static final int f25033r = z.a("dec3");

    /* renamed from: s, reason: collision with root package name */
    public static final int f25035s = z.a("dtsc");

    /* renamed from: t, reason: collision with root package name */
    public static final int f25037t = z.a("dtsh");

    /* renamed from: u, reason: collision with root package name */
    public static final int f25039u = z.a("dtsl");

    /* renamed from: v, reason: collision with root package name */
    public static final int f25041v = z.a("dtse");

    /* renamed from: w, reason: collision with root package name */
    public static final int f25043w = z.a("ddts");

    /* renamed from: x, reason: collision with root package name */
    public static final int f25045x = z.a("tfdt");

    /* renamed from: y, reason: collision with root package name */
    public static final int f25047y = z.a("tfhd");

    /* renamed from: z, reason: collision with root package name */
    public static final int f25049z = z.a("trex");
    public static final int A = z.a("trun");
    public static final int B = z.a("sidx");
    public static final int C = z.a("moov");
    public static final int D = z.a("mvhd");
    public static final int E = z.a("trak");
    public static final int F = z.a("mdia");
    public static final int G = z.a("minf");
    public static final int H = z.a("stbl");
    public static final int I = z.a("avcC");
    public static final int J = z.a("hvcC");
    public static final int K = z.a("esds");
    public static final int L = z.a("moof");
    public static final int M = z.a("traf");
    public static final int N = z.a("mvex");
    public static final int O = z.a("mehd");
    public static final int P = z.a("tkhd");
    public static final int Q = z.a("edts");
    public static final int R = z.a("elst");
    public static final int S = z.a("mdhd");
    public static final int T = z.a("hdlr");
    public static final int U = z.a("stsd");
    public static final int V = z.a("pssh");
    public static final int W = z.a("sinf");
    public static final int X = z.a("schm");
    public static final int Y = z.a("schi");
    public static final int Z = z.a("tenc");

    /* renamed from: a0, reason: collision with root package name */
    public static final int f25000a0 = z.a("encv");

    /* renamed from: b0, reason: collision with root package name */
    public static final int f25002b0 = z.a("enca");

    /* renamed from: c0, reason: collision with root package name */
    public static final int f25004c0 = z.a("frma");

    /* renamed from: d0, reason: collision with root package name */
    public static final int f25006d0 = z.a("saiz");

    /* renamed from: e0, reason: collision with root package name */
    public static final int f25008e0 = z.a("saio");

    /* renamed from: f0, reason: collision with root package name */
    public static final int f25010f0 = z.a("sbgp");

    /* renamed from: g0, reason: collision with root package name */
    public static final int f25012g0 = z.a("sgpd");

    /* renamed from: h0, reason: collision with root package name */
    public static final int f25014h0 = z.a("uuid");

    /* renamed from: i0, reason: collision with root package name */
    public static final int f25016i0 = z.a("senc");

    /* renamed from: j0, reason: collision with root package name */
    public static final int f25018j0 = z.a("pasp");

    /* renamed from: k0, reason: collision with root package name */
    public static final int f25020k0 = z.a("TTML");

    static {
        z.a("vmhd");
        f25022l0 = z.a("mp4v");
        f25024m0 = z.a("stts");
        f25026n0 = z.a("stss");
        f25028o0 = z.a("ctts");
        f25030p0 = z.a("stsc");
        f25032q0 = z.a("stsz");
        f25034r0 = z.a("stz2");
        f25036s0 = z.a("stco");
        f25038t0 = z.a("co64");
        f25040u0 = z.a("tx3g");
        f25042v0 = z.a("wvtt");
        f25044w0 = z.a("stpp");
        f25046x0 = z.a("c608");
        f25048y0 = z.a("samr");
        f25050z0 = z.a("sawb");
        A0 = z.a("udta");
        B0 = z.a("meta");
        C0 = z.a("ilst");
        D0 = z.a("mean");
        E0 = z.a("name");
        F0 = z.a("data");
        G0 = z.a("emsg");
        H0 = z.a("st3d");
        I0 = z.a("sv3d");
        J0 = z.a("proj");
        K0 = z.a("vp08");
        L0 = z.a("vp09");
        M0 = z.a("vpcC");
        N0 = z.a("camm");
        O0 = z.a("alac");
    }

    public c(int i10) {
        this.f25051a = i10;
    }

    public static String a(int i10) {
        return "" + ((char) ((i10 >> 24) & 255)) + ((char) ((i10 >> 16) & 255)) + ((char) ((i10 >> 8) & 255)) + ((char) (i10 & 255));
    }

    public String toString() {
        return a(this.f25051a);
    }
}
