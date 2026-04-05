package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class l implements j {

    /* renamed from: a, reason: collision with root package name */
    public final int f50225a;

    /* renamed from: b, reason: collision with root package name */
    public final kv.w f50226b;

    /* renamed from: c, reason: collision with root package name */
    public final int f50227c;

    /* renamed from: d, reason: collision with root package name */
    public final kv.p f50228d;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a implements kv.p {

        /* renamed from: b, reason: collision with root package name */
        public static final a f50229b = new a();

        public final kv.b a(p0.w wVar, int i10) {
            wVar.startReplaceableGroup(1952438088);
            if (p0.d0.isTraceInProgress()) {
                p0.d0.traceEventStart(1952438088, i10, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.AdWebViewOptions.<init>.<anonymous> (AdRenderingOptions.kt:25)");
            }
            kv.b bVarA = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.a0.a(null, null, 0L, 0L, 0L, null, null, null, wVar, 0, 255);
            if (p0.d0.isTraceInProgress()) {
                p0.d0.traceEventEnd();
            }
            wVar.endReplaceableGroup();
            return bVarA;
        }

        @Override // kv.p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return a((p0.w) obj, ((Number) obj2).intValue());
        }
    }

    public l() {
        this(0, null, 0, null, 15, null);
    }

    public final kv.w a() {
        return this.f50226b;
    }

    public final int b() {
        return this.f50225a;
    }

    public final kv.p c() {
        return this.f50228d;
    }

    public final int d() {
        return this.f50227c;
    }

    public l(int i10, kv.w adWebViewRenderer, int i11, kv.p decClose) {
        kotlin.jvm.internal.e0.checkNotNullParameter(adWebViewRenderer, "adWebViewRenderer");
        kotlin.jvm.internal.e0.checkNotNullParameter(decClose, "decClose");
        this.f50225a = i10;
        this.f50226b = adWebViewRenderer;
        this.f50227c = i11;
        this.f50228d = decClose;
    }

    public /* synthetic */ l(int i10, kv.w wVar, int i11, kv.p pVar, int i12, kotlin.jvm.internal.u uVar) {
        this((i12 & 1) != 0 ? 5 : i10, (i12 & 2) != 0 ? com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview.i.a(0L, null, 3, null) : wVar, (i12 & 4) != 0 ? 5 : i11, (i12 & 8) != 0 ? a.f50229b : pVar);
    }
}
