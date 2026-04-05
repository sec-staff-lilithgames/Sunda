package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class m implements c {
    public static final /* synthetic */ m[] I;
    public static final /* synthetic */ cv.a J;

    /* renamed from: b, reason: collision with root package name */
    public static final m f47714b = new m("VAST_AD_LOAD_INCOMPLETE_ERROR", 0);

    /* renamed from: c, reason: collision with root package name */
    public static final m f47715c = new m("VAST_AD_LOAD_XML_PARSE_ERROR", 1);

    /* renamed from: e, reason: collision with root package name */
    public static final m f47716e = new m("VAST_AD_LOAD_NO_XML_TAG_ERROR", 2);

    /* renamed from: f, reason: collision with root package name */
    public static final m f47717f = new m("VAST_AD_LOAD_NO_ADS_ERROR", 3);

    /* renamed from: g, reason: collision with root package name */
    public static final m f47718g = new m("VAST_AD_LOAD_WRAPPER_LIMIT_ERROR", 4);

    /* renamed from: h, reason: collision with root package name */
    public static final m f47719h = new m("VAST_AD_LOAD_WRAPPER_TIMEOUT_ERROR", 5);

    /* renamed from: i, reason: collision with root package name */
    public static final m f47720i = new m("VAST_AD_LOAD_WRAPPER_FETCH_ERROR", 6);

    /* renamed from: j, reason: collision with root package name */
    public static final m f47721j = new m("VAST_AD_LOAD_INLINE_CREATIVES_EMPTY_ERROR", 7);

    /* renamed from: k, reason: collision with root package name */
    public static final m f47722k = new m("VAST_AD_LOAD_INLINE_CREATIVES_NO_LINEAR_ERROR", 8);

    /* renamed from: l, reason: collision with root package name */
    public static final m f47723l = new m("VAST_AD_LOAD_LINEAR_NOT_SUPPORTED_MEDIA_ERROR", 9);

    /* renamed from: m, reason: collision with root package name */
    public static final m f47724m = new m("VAST_AD_LOAD_MEDIA_FILE_CLIENT_HTTP_ERROR", 10);

    /* renamed from: n, reason: collision with root package name */
    public static final m f47725n = new m("VAST_AD_LOAD_MEDIA_FILE_SERVER_HTTP_ERROR", 11);

    /* renamed from: o, reason: collision with root package name */
    public static final m f47726o = new m("VAST_AD_LOAD_MEDIA_FILE_NO_NETWORK_HTTP_ERROR", 12);

    /* renamed from: p, reason: collision with root package name */
    public static final m f47727p = new m("VAST_AD_LOAD_MEDIA_FILE_UNKNOWN_HOST_HTTP_ERROR", 13);

    /* renamed from: q, reason: collision with root package name */
    public static final m f47728q = new m("VAST_AD_LOAD_MEDIA_FILE_SOCKET_HTTP_ERROR", 14);

    /* renamed from: r, reason: collision with root package name */
    public static final m f47729r = new m("VAST_AD_LOAD_MEDIA_FILE_HTTP_DISK_IO_ERROR", 15);

    /* renamed from: s, reason: collision with root package name */
    public static final m f47730s = new m("VAST_AD_LOAD_MEDIA_FILE_HTTP_DISK_SECURITY_ERROR", 16);

    /* renamed from: t, reason: collision with root package name */
    public static final m f47731t = new m("VAST_AD_LOAD_MEDIA_FILE_HTTP_SSL_ERROR", 17);

    /* renamed from: u, reason: collision with root package name */
    public static final m f47732u = new m("VAST_AD_LOAD_MEDIA_TMP_FILE_NOT_RENAMED_DISK_ERROR", 18);

    /* renamed from: v, reason: collision with root package name */
    public static final m f47733v = new m("VAST_AD_LOAD_MEDIA_FILE_NOT_CREATED_DISK_ERROR", 19);

    /* renamed from: w, reason: collision with root package name */
    public static final m f47734w = new m("VAST_AD_LOAD_MEDIA_FILE_NOT_CREATED_SECURITY_DISK_ERROR", 20);

    /* renamed from: x, reason: collision with root package name */
    public static final m f47735x = new m("VAST_AD_LOAD_MEDIA_FILE_NOT_CREATED_IO_DISK_ERROR", 21);

    /* renamed from: y, reason: collision with root package name */
    public static final m f47736y = new m("VAST_AD_LOAD_MEDIA_FILE_NOT_CREATED_UNKNOWN_DISK_ERROR", 22);

    /* renamed from: z, reason: collision with root package name */
    public static final m f47737z = new m("VAST_AD_LOAD_MEDIA_FILE_TIMEOUT_ERROR", 23);
    public static final m A = new m("VAST_AD_LOAD_MEDIA_FILE_TIMEOUT_NOT_ENOUGH_PLAYABLE_ERROR", 24);
    public static final m B = new m("VAST_AD_LOAD_MEDIA_FILE_UNABLE_TO_DETERMINE_TIMEOUT_ERROR", 25);
    public static final m C = new m("VAST_AD_LOAD_MEDIA_NUMBER_PARSE_ERROR", 26);
    public static final m D = new m("VAST_AD_LOAD_MEDIA_FILE_INVALID_URL_ERROR", 27);
    public static final m E = new m("VAST_AD_LOAD_MEDIA_FILE_NOT_FOUND_ERROR", 28);
    public static final m F = new m("VAST_AD_LOAD_MEDIA_FILE_UNKNOWN_MEDIA_FETCH_ERROR", 29);
    public static final m G = new m("VAST_AD_LOAD_MEDIA_FILE_UNKNOWN_ERROR", 30);
    public static final m H = new m("VAST_AD_LOAD_RENDER_AD_LOAD_ERROR", 31);

    static {
        m[] mVarArrB = b();
        I = mVarArrB;
        J = cv.b.enumEntries(mVarArrB);
    }

    public m(String str, int i10) {
    }

    public static final /* synthetic */ m[] b() {
        return new m[]{f47714b, f47715c, f47716e, f47717f, f47718g, f47719h, f47720i, f47721j, f47722k, f47723l, f47724m, f47725n, f47726o, f47727p, f47728q, f47729r, f47730s, f47731t, f47732u, f47733v, f47734w, f47735x, f47736y, f47737z, A, B, C, D, E, F, G, H};
    }

    public static cv.a c() {
        return J;
    }

    public static m valueOf(String str) {
        return (m) Enum.valueOf(m.class, str);
    }

    public static m[] values() {
        return (m[]) I.clone();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c
    public String a() {
        return name();
    }

    public final boolean d() {
        return this == f47737z || this == A || this == B;
    }
}
