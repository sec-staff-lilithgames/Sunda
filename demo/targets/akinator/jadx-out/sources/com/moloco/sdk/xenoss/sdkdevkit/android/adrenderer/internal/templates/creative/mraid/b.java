package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.creative.mraid;

import android.content.Context;
import android.webkit.WebView;
import androidx.core.app.NotificationCompat;
import bv.n;
import com.amazon.device.ads.DtbConstants;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.p;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.r;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.u;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.w;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.x;
import kotlin.jvm.internal.e0;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import kv.p;
import org.json.JSONException;
import org.json.JSONObject;
import sv.k0;
import tu.a0;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class b implements com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.creative.mraid.a {

    /* renamed from: a, reason: collision with root package name */
    public final Context f48343a;

    /* renamed from: b, reason: collision with root package name */
    public final WebView f48344b;

    /* renamed from: c, reason: collision with root package name */
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.b f48345c;

    /* renamed from: d, reason: collision with root package name */
    public final CoroutineScope f48346d;

    /* renamed from: e, reason: collision with root package name */
    public final e f48347e;

    /* renamed from: f, reason: collision with root package name */
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.creative.mraid.c f48348f;

    /* renamed from: g, reason: collision with root package name */
    public w f48349g;

    /* renamed from: h, reason: collision with root package name */
    public final x f48350h;

    /* renamed from: i, reason: collision with root package name */
    public final MutableStateFlow f48351i;

    /* renamed from: j, reason: collision with root package name */
    public final MutableStateFlow f48352j;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a extends n implements p {

        /* renamed from: i, reason: collision with root package name */
        public int f48353i;

        /* renamed from: k, reason: collision with root package name */
        public final /* synthetic */ boolean f48355k;

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ r f48356l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(boolean z10, r rVar, zu.d<? super a> dVar) {
            super(2, dVar);
            this.f48355k = z10;
            this.f48356l = rVar;
        }

        @Override // kv.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, zu.d<? super x0> dVar) {
            return ((a) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
        }

        @Override // bv.a
        public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
            return b.this.new a(this.f48355k, this.f48356l, dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
            int i10 = this.f48353i;
            if (i10 == 0) {
                a0.throwOnFailure(obj);
                MutableStateFlow mutableStateFlow = b.this.f48351i;
                p.f fVar = new p.f(this.f48355k, this.f48356l);
                this.f48353i = 1;
                if (mutableStateFlow.emit(fVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                a0.throwOnFailure(obj);
            }
            return x0.f87415a;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.creative.mraid.b$b, reason: collision with other inner class name */
    public static final class C0432b extends n implements kv.p {

        /* renamed from: i, reason: collision with root package name */
        public /* synthetic */ boolean f48357i;

        public C0432b(zu.d<? super C0432b> dVar) {
            super(2, dVar);
        }

        public final Object a(boolean z10, zu.d<? super x0> dVar) {
            return ((C0432b) create(Boolean.valueOf(z10), dVar)).invokeSuspend(x0.f87415a);
        }

        @Override // bv.a
        public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
            C0432b c0432b = b.this.new C0432b(dVar);
            c0432b.f48357i = ((Boolean) obj).booleanValue();
            return c0432b;
        }

        @Override // kv.p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return a(((Boolean) obj).booleanValue(), (zu.d) obj2);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            av.e.getCOROUTINE_SUSPENDED();
            a0.throwOnFailure(obj);
            b.this.f48347e.a(this.f48357i);
            return x0.f87415a;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class c extends n implements kv.p {

        /* renamed from: i, reason: collision with root package name */
        public /* synthetic */ Object f48359i;

        public c(zu.d<? super c> dVar) {
            super(2, dVar);
        }

        @Override // kv.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(x.a aVar, zu.d<? super x0> dVar) {
            return ((c) create(aVar, dVar)).invokeSuspend(x0.f87415a);
        }

        @Override // bv.a
        public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
            c cVar = b.this.new c(dVar);
            cVar.f48359i = obj;
            return cVar;
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            av.e.getCOROUTINE_SUSPENDED();
            a0.throwOnFailure(obj);
            b.this.f48347e.a(((x.a) this.f48359i).a());
            return x0.f87415a;
        }
    }

    public b(Context context, WebView webView, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.b clickthroughEventHandler) {
        e0.checkNotNullParameter(context, "context");
        e0.checkNotNullParameter(webView, "webView");
        e0.checkNotNullParameter(clickthroughEventHandler, "clickthroughEventHandler");
        this.f48343a = context;
        this.f48344b = webView;
        this.f48345c = clickthroughEventHandler;
        CoroutineScope coroutineScopeO = com.google.android.gms.internal.play_billing.a.o();
        this.f48346d = coroutineScopeO;
        this.f48347e = new e(webView);
        this.f48348f = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.creative.mraid.c(context, this);
        this.f48349g = w.f48133e;
        this.f48350h = new x(webView, context, coroutineScopeO);
        MutableStateFlow MutableStateFlow = StateFlowKt.MutableStateFlow(new p.f(true, r.f48114f));
        this.f48351i = MutableStateFlow;
        this.f48352j = MutableStateFlow;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.creative.mraid.a
    public void c() {
        this.f48349g = w.f48135g;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.creative.mraid.a
    public void d() {
        this.f48349g = w.f48133e;
        this.f48347e.a(false, false, false, false, true);
        w wVar = this.f48349g;
        e eVar = this.f48347e;
        eVar.a(wVar);
        eVar.a(u.f48119e);
        eVar.a(this.f48350h.k().getValue().a());
        f();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.creative.mraid.a
    public StateFlow<p.f> e() {
        return this.f48352j;
    }

    public final void f() {
        x xVar = this.f48350h;
        Flow flowOnEach = FlowKt.onEach(xVar.m(), new C0432b(null));
        CoroutineScope coroutineScope = this.f48346d;
        FlowKt.launchIn(flowOnEach, coroutineScope);
        FlowKt.launchIn(FlowKt.onEach(xVar.k(), new c(null)), coroutineScope);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.creative.mraid.a
    public void remove() {
        this.f48344b.removeJavascriptInterface("AndroidMraid");
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.creative.mraid.a
    public void a(String url) throws JSONException {
        e eVar = this.f48347e;
        e0.checkNotNullParameter(url, "url");
        JSONObject jSONObject = new JSONObject();
        String strB = b(url);
        jSONObject.put(NotificationCompat.CATEGORY_EVENT, "clickthrough");
        jSONObject.put("contentType", CampaignEx.JSON_KEY_MRAID);
        jSONObject.put("url", strB);
        try {
            this.f48345c.a(jSONObject);
            eVar.a("open");
            MolocoLogger.debug$default(MolocoLogger.INSTANCE, "TAG", "Ad clicked: " + strB, false, 4, null);
        } catch (Exception unused) {
            eVar.a("open", "Can't open links when mraid container is not visible to the user");
        }
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.creative.mraid.a
    public void b() {
        this.f48344b.addJavascriptInterface(this.f48348f, "AndroidMraid");
    }

    public final String b(String str) {
        return k0.startsWith$default(str, "itms-apps://", false, 2, null) ? k0.replace$default(str, "itms-apps://", DtbConstants.HTTPS, false, 4, (Object) null) : str;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.creative.mraid.a
    public void a() {
        if (this.f48349g == w.f48135g) {
            this.f48349g = w.f48133e;
        }
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.creative.mraid.a
    public void a(boolean z10, r forceOrientation) {
        e0.checkNotNullParameter(forceOrientation, "forceOrientation");
        BuildersKt__Builders_commonKt.launch$default(this.f48346d, null, null, new a(z10, forceOrientation, null), 3, null);
    }
}
