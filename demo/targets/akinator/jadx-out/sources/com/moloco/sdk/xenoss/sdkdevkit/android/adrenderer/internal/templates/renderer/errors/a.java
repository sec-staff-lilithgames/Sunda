package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.errors;

import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c;
import cv.b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class a implements c {

    /* renamed from: b, reason: collision with root package name */
    public static final a f48404b = new a("UNKNOWN_ERROR", 0);

    /* renamed from: c, reason: collision with root package name */
    public static final a f48405c = new a("WEBVIEW_DATA_WITH_DEFAULT_BASE_URL_ERROR", 1);

    /* renamed from: e, reason: collision with root package name */
    public static final a f48406e = new a("WEBVIEW_RECEIVED_ERROR", 2);

    /* renamed from: f, reason: collision with root package name */
    public static final a f48407f = new a("WEBVIEW_REQUIRED_CONTENT_HTTP_ERROR", 3);

    /* renamed from: g, reason: collision with root package name */
    public static final a f48408g = new a("WEBVIEW_RENDER_PROCESS_GONE_ERROR", 4);

    /* renamed from: h, reason: collision with root package name */
    public static final a f48409h = new a("WEBVIEW_TIMEOUT_ERROR", 5);

    /* renamed from: i, reason: collision with root package name */
    public static final a f48410i = new a("WEBVIEW_NOT_AVAILABLE_ERROR", 6);

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ a[] f48411j;

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ cv.a f48412k;

    static {
        a[] aVarArrB = b();
        f48411j = aVarArrB;
        f48412k = b.enumEntries(aVarArrB);
    }

    public a(String str, int i10) {
    }

    public static final /* synthetic */ a[] b() {
        return new a[]{f48404b, f48405c, f48406e, f48407f, f48408g, f48409h, f48410i};
    }

    public static cv.a c() {
        return f48412k;
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f48411j.clone();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c
    public String a() {
        return name();
    }
}
