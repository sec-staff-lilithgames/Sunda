package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer;

import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import androidx.webkit.WebViewClientCompat;
import av.e;
import bv.n;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.internal.services.c0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.h;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.o;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.p;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.r;
import com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import tu.a0;
import tu.f;
import tu.x0;
import zu.d;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class b extends WebViewClientCompat implements o {

    /* renamed from: b, reason: collision with root package name */
    public final CoroutineScope f48287b;

    /* renamed from: c, reason: collision with root package name */
    public final c0 f48288c;

    /* renamed from: e, reason: collision with root package name */
    public final p f48289e;

    /* renamed from: f, reason: collision with root package name */
    public final MutableStateFlow f48290f;

    /* renamed from: g, reason: collision with root package name */
    public final MutableStateFlow f48291g;

    /* renamed from: h, reason: collision with root package name */
    public final MutableStateFlow f48292h;

    /* renamed from: i, reason: collision with root package name */
    public final StateFlow f48293i;

    /* renamed from: j, reason: collision with root package name */
    public final MutableStateFlow f48294j;

    /* renamed from: k, reason: collision with root package name */
    public final StateFlow f48295k;

    /* renamed from: l, reason: collision with root package name */
    public final MutableSharedFlow f48296l;

    /* renamed from: m, reason: collision with root package name */
    public final MutableSharedFlow f48297m;

    /* renamed from: n, reason: collision with root package name */
    public com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.model.a f48298n;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public /* synthetic */ a(u uVar) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.b$b, reason: collision with other inner class name */
    public static final class C0427b extends n implements kv.p {

        /* renamed from: i, reason: collision with root package name */
        public int f48299i;

        /* renamed from: k, reason: collision with root package name */
        public final /* synthetic */ String f48301k;

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.model.a f48302l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0427b(String str, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.model.a aVar, d<? super C0427b> dVar) {
            super(2, dVar);
            this.f48301k = str;
            this.f48302l = aVar;
        }

        @Override // kv.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, d<? super x0> dVar) {
            return ((C0427b) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
        }

        @Override // bv.a
        public final d<x0> create(Object obj, d<?> dVar) {
            return b.this.new C0427b(this.f48301k, this.f48302l, dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = e.getCOROUTINE_SUSPENDED();
            int i10 = this.f48299i;
            if (i10 == 0) {
                a0.throwOnFailure(obj);
                b bVar = b.this;
                c0 c0Var = bVar.f48288c;
                p pVarE = bVar.e();
                MutableSharedFlow<x0> mutableSharedFlow = bVar.f48296l;
                this.f48299i = 1;
                if (c0Var.a(this.f48301k, this.f48302l, pVarE, mutableSharedFlow, this) == coroutine_suspended) {
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

    static {
        new a(null);
    }

    public /* synthetic */ b(CoroutineScope coroutineScope, c0 c0Var, p pVar, int i10, u uVar) {
        this(coroutineScope, c0Var, (i10 & 4) != 0 ? r.a() : pVar);
    }

    public final void c() {
        this.f48290f.setValue(Boolean.TRUE);
    }

    public final p e() {
        return this.f48289e;
    }

    public final SharedFlow<x0> f() {
        return this.f48297m;
    }

    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.model.a i() {
        return this.f48298n;
    }

    public final StateFlow<h> m() {
        return this.f48295k;
    }

    public final StateFlow<Boolean> n() {
        return this.f48291g;
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        Boolean bool = Boolean.TRUE;
        this.f48290f.setValue(bool);
        this.f48292h.setValue(bool);
    }

    @Override // android.webkit.WebViewClient
    @f
    public void onReceivedError(WebView webView, int i10, String str, String str2) {
        super.onReceivedError(webView, i10, str, str2);
        this.f48294j.setValue(h.f47697e);
        MolocoLogger.error$default(MolocoLogger.INSTANCE, "WebViewClientImpl", a.b.k("onReceivedError ", str), null, false, 12, null);
    }

    @Override // android.webkit.WebViewClient
    public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        this.f48294j.setValue(h.f47698f);
        MolocoLogger.error$default(MolocoLogger.INSTANCE, "WebViewClientImpl", "onRenderProcessGone", null, false, 12, null);
        return true;
    }

    public final StateFlow<Boolean> p() {
        return this.f48293i;
    }

    @Override // android.webkit.WebViewClient
    @f
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.model.a aVar;
        if (str == null || (aVar = this.f48298n) == null) {
            return true;
        }
        BuildersKt__Builders_commonKt.launch$default(this.f48287b, null, null, new C0427b(str, aVar, null), 3, null);
        return true;
    }

    public final void a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.model.a adTouch) {
        e0.checkNotNullParameter(adTouch, "adTouch");
        this.f48298n = adTouch;
    }

    public b(CoroutineScope scope, c0 clickthroughService, p buttonTracker) {
        e0.checkNotNullParameter(scope, "scope");
        e0.checkNotNullParameter(clickthroughService, "clickthroughService");
        e0.checkNotNullParameter(buttonTracker, "buttonTracker");
        this.f48287b = scope;
        this.f48288c = clickthroughService;
        this.f48289e = buttonTracker;
        Boolean bool = Boolean.FALSE;
        MutableStateFlow MutableStateFlow = StateFlowKt.MutableStateFlow(bool);
        this.f48290f = MutableStateFlow;
        this.f48291g = MutableStateFlow;
        MutableStateFlow MutableStateFlow2 = StateFlowKt.MutableStateFlow(bool);
        this.f48292h = MutableStateFlow2;
        this.f48293i = FlowKt.asStateFlow(MutableStateFlow2);
        MutableStateFlow MutableStateFlow3 = StateFlowKt.MutableStateFlow(null);
        this.f48294j = MutableStateFlow3;
        this.f48295k = FlowKt.asStateFlow(MutableStateFlow3);
        MutableSharedFlow mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.f48296l = mutableSharedFlowMutableSharedFlow$default;
        this.f48297m = mutableSharedFlowMutableSharedFlow$default;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.o
    public void a(a.c button) {
        e0.checkNotNullParameter(button, "button");
        this.f48289e.a(button);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.o
    public void a(a.c.EnumC0490a buttonType) {
        e0.checkNotNullParameter(buttonType, "buttonType");
        this.f48289e.a(buttonType);
    }

    public static /* synthetic */ void j() {
    }
}
