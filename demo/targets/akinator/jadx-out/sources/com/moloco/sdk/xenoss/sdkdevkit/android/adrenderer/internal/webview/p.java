package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview;

import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import sv.d0;
import sv.k0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class p implements o {

    /* renamed from: a, reason: collision with root package name */
    public final q f50211a;

    /* renamed from: b, reason: collision with root package name */
    public final m f50212b;

    /* renamed from: c, reason: collision with root package name */
    public final n f50213c;

    public p(q localAssetLoader, m contentEncoder, n cssMarginHandler) {
        e0.checkNotNullParameter(localAssetLoader, "localAssetLoader");
        e0.checkNotNullParameter(contentEncoder, "contentEncoder");
        e0.checkNotNullParameter(cssMarginHandler, "cssMarginHandler");
        this.f50211a = localAssetLoader;
        this.f50212b = contentEncoder;
        this.f50213c = cssMarginHandler;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview.o
    public String a(String html) {
        e0.checkNotNullParameter(html, "html");
        q qVar = this.f50211a;
        String strA = qVar.a("mraid.js");
        return d0.trimIndent("\n            <script>" + qVar.a("mraid-bridge.js") + "</script>\n            <iframe id=\"adFrame\"\n                style=\"width:100vw; height:100vh; border:none;\"\n                src=\"data:text/html;base64," + this.f50212b.a(k0.replace$default(this.f50213c.a(html), "<script src=\"mraid.js\"></script>", a.b.l("<script>", strA, "</script>"), false, 4, (Object) null)) + "\"\n                sandbox=\"allow-scripts allow-same-origin\"\n            >\n            </iframe>\n        ");
    }

    public /* synthetic */ p(q qVar, m mVar, n nVar, int i10, u uVar) {
        this(qVar, mVar, (i10 & 4) != 0 ? new n() : nVar);
    }
}
