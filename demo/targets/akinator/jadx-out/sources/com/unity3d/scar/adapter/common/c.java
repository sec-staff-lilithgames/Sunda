package com.unity3d.scar.adapter.common;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class c {
    public static final c A;
    public static final c B;
    public static final c C;
    public static final c D;
    public static final c E;
    public static final c F;
    public static final c G;
    public static final c H;
    public static final c I;
    public static final /* synthetic */ c[] J;

    /* renamed from: b, reason: collision with root package name */
    public static final c f50705b;

    /* renamed from: c, reason: collision with root package name */
    public static final c f50706c;

    /* renamed from: e, reason: collision with root package name */
    public static final c f50707e;

    /* renamed from: f, reason: collision with root package name */
    public static final c f50708f;

    /* renamed from: g, reason: collision with root package name */
    public static final c f50709g;

    /* renamed from: h, reason: collision with root package name */
    public static final c f50710h;

    /* renamed from: i, reason: collision with root package name */
    public static final c f50711i;

    /* renamed from: j, reason: collision with root package name */
    public static final c f50712j;

    /* renamed from: k, reason: collision with root package name */
    public static final c f50713k;

    /* renamed from: l, reason: collision with root package name */
    public static final c f50714l;

    /* renamed from: m, reason: collision with root package name */
    public static final c f50715m;

    /* renamed from: n, reason: collision with root package name */
    public static final c f50716n;

    /* renamed from: o, reason: collision with root package name */
    public static final c f50717o;

    /* renamed from: p, reason: collision with root package name */
    public static final c f50718p;

    /* renamed from: q, reason: collision with root package name */
    public static final c f50719q;

    /* renamed from: r, reason: collision with root package name */
    public static final c f50720r;

    /* renamed from: s, reason: collision with root package name */
    public static final c f50721s;

    /* renamed from: t, reason: collision with root package name */
    public static final c f50722t;

    /* renamed from: u, reason: collision with root package name */
    public static final c f50723u;

    /* renamed from: v, reason: collision with root package name */
    public static final c f50724v;

    /* renamed from: w, reason: collision with root package name */
    public static final c f50725w;

    /* renamed from: x, reason: collision with root package name */
    public static final c f50726x;

    /* renamed from: y, reason: collision with root package name */
    public static final c f50727y;

    /* renamed from: z, reason: collision with root package name */
    public static final c f50728z;

    static {
        c cVar = new c("SCAR_PRESENT", 0);
        f50705b = cVar;
        c cVar2 = new c("SCAR_NOT_PRESENT", 1);
        f50706c = cVar2;
        c cVar3 = new c("ALREADY_INITIALIZED", 2);
        f50707e = cVar3;
        c cVar4 = new c("INIT_SUCCESS", 3);
        f50708f = cVar4;
        c cVar5 = new c("INIT_ERROR", 4);
        f50709g = cVar5;
        c cVar6 = new c("VERSION", 5);
        f50710h = cVar6;
        c cVar7 = new c("SCAR_UNSUPPORTED", 6);
        f50711i = cVar7;
        c cVar8 = new c("SIGNALS", 7);
        f50712j = cVar8;
        c cVar9 = new c("SIGNALS_ERROR", 8);
        f50713k = cVar9;
        c cVar10 = new c("INTERNAL_SIGNALS_ERROR", 9);
        f50714l = cVar10;
        c cVar11 = new c("AD_LOADED", 10);
        f50715m = cVar11;
        c cVar12 = new c("INTERSTITIAL_IMPRESSION_RECORDED", 11);
        f50716n = cVar12;
        c cVar13 = new c("REWARDED_IMPRESSION_RECORDED", 12);
        f50717o = cVar13;
        c cVar14 = new c("INTERNAL_LOAD_ERROR", 13);
        f50718p = cVar14;
        c cVar15 = new c("QUERY_NOT_FOUND_ERROR", 14);
        f50719q = cVar15;
        c cVar16 = new c("LOAD_ERROR", 15);
        f50720r = cVar16;
        c cVar17 = new c("NO_AD_ERROR", 16);
        f50721s = cVar17;
        c cVar18 = new c("AD_STARTED", 17);
        f50722t = cVar18;
        c cVar19 = new c("INTERNAL_SHOW_ERROR", 18);
        f50723u = cVar19;
        c cVar20 = new c("AD_NOT_LOADED_ERROR", 19);
        f50724v = cVar20;
        c cVar21 = new c("REWARDED_SHOW_ERROR", 20);
        f50725w = cVar21;
        c cVar22 = new c("INTERSTITIAL_SHOW_ERROR", 21);
        f50726x = cVar22;
        c cVar23 = new c("FIRST_QUARTILE", 22);
        f50727y = cVar23;
        c cVar24 = new c("MIDPOINT", 23);
        f50728z = cVar24;
        c cVar25 = new c("THIRD_QUARTILE", 24);
        A = cVar25;
        c cVar26 = new c("LAST_QUARTILE", 25);
        B = cVar26;
        c cVar27 = new c("AD_EARNED_REWARD", 26);
        C = cVar27;
        c cVar28 = new c("AD_CLICKED", 27);
        D = cVar28;
        c cVar29 = new c("AD_SKIPPED", 28);
        E = cVar29;
        c cVar30 = new c("AD_LEFT_APPLICATION", 29);
        F = cVar30;
        c cVar31 = new c("AD_CLOSED", 30);
        G = cVar31;
        c cVar32 = new c("METHOD_ERROR", 31);
        H = cVar32;
        c cVar33 = new c(com.ironsource.mediationsdk.l.f37554a, 32);
        I = cVar33;
        J = new c[]{cVar, cVar2, cVar3, cVar4, cVar5, cVar6, cVar7, cVar8, cVar9, cVar10, cVar11, cVar12, cVar13, cVar14, cVar15, cVar16, cVar17, cVar18, cVar19, cVar20, cVar21, cVar22, cVar23, cVar24, cVar25, cVar26, cVar27, cVar28, cVar29, cVar30, cVar31, cVar32, cVar33};
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) J.clone();
    }
}
