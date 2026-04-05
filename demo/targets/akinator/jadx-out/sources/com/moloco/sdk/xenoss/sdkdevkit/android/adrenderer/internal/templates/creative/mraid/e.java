package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.creative.mraid;

import android.graphics.Rect;
import android.webkit.WebView;
import bv.n;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.u;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.v;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.w;
import kotlin.jvm.internal.e0;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import kv.p;
import org.json.JSONObject;
import tu.a0;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class e implements d {

    /* renamed from: a, reason: collision with root package name */
    public final WebView f48363a;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a extends n implements p {

        /* renamed from: j, reason: collision with root package name */
        public final /* synthetic */ String f48365j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, zu.d<? super a> dVar) {
            super(2, dVar);
            this.f48365j = str;
        }

        @Override // kv.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, zu.d<? super x0> dVar) {
            return ((a) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
        }

        @Override // bv.a
        public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
            return e.this.new a(this.f48365j, dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            av.e.getCOROUTINE_SUSPENDED();
            a0.throwOnFailure(obj);
            e.this.f48363a.loadUrl("javascript:" + this.f48365j);
            return x0.f87415a;
        }
    }

    public e(WebView webView) {
        e0.checkNotNullParameter(webView, "webView");
        this.f48363a = webView;
    }

    public final void b(String str) {
        BuildersKt__Builders_commonKt.launch$default(com.google.android.gms.internal.play_billing.a.o(), null, null, new a(str, null), 3, null);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.creative.mraid.d
    public void a(String commandString) {
        e0.checkNotNullParameter(commandString, "commandString");
        b("mraidbridge.nativeCallComplete(" + JSONObject.quote(commandString) + ')');
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.creative.mraid.d
    public void a(String commandString, String msg) {
        e0.checkNotNullParameter(commandString, "commandString");
        e0.checkNotNullParameter(msg, "msg");
        b("mraidbridge.notifyErrorEvent(" + JSONObject.quote(commandString) + ", " + JSONObject.quote(msg) + ')');
    }

    public final String b(Rect rect) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(rect.width());
        sb2.append(AbstractJsonLexerKt.COMMA);
        sb2.append(rect.height());
        return sb2.toString();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.creative.mraid.d
    public void a(boolean z10) {
        b("mraidbridge.setIsViewable(" + z10 + ')');
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.creative.mraid.d
    public void a(u placementType) {
        e0.checkNotNullParameter(placementType, "placementType");
        b("mraidbridge.setPlacementType(" + JSONObject.quote(placementType.c()) + ')');
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.creative.mraid.d
    public void a(w state) {
        e0.checkNotNullParameter(state, "state");
        b("mraidbridge.setState(" + JSONObject.quote(state.c()) + ')');
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.creative.mraid.d
    public void a(boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        b("mraidbridge.setSupports(" + z10 + AbstractJsonLexerKt.COMMA + z11 + AbstractJsonLexerKt.COMMA + z12 + AbstractJsonLexerKt.COMMA + z13 + AbstractJsonLexerKt.COMMA + z14 + ')');
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.creative.mraid.d
    public void a(v screenMetrics) {
        e0.checkNotNullParameter(screenMetrics, "screenMetrics");
        b("\n                mraidbridge.setScreenSize(" + b(screenMetrics.g()) + ");\n                mraidbridge.setMaxSize(" + b(screenMetrics.f()) + ");\n                mraidbridge.setCurrentPosition(" + a(screenMetrics.b()) + ");\n                mraidbridge.setDefaultPosition(" + a(screenMetrics.d()) + ");\n                mraidbridge.notifySizeChangeEvent(" + b(screenMetrics.b()) + ");\n            ");
    }

    public final String a(Rect rect) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(rect.left);
        sb2.append(AbstractJsonLexerKt.COMMA);
        sb2.append(rect.top);
        sb2.append(AbstractJsonLexerKt.COMMA);
        sb2.append(rect.width());
        sb2.append(AbstractJsonLexerKt.COMMA);
        sb2.append(rect.height());
        return sb2.toString();
    }
}
