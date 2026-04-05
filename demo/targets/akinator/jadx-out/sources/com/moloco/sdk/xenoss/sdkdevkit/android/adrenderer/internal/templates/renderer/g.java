package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer;

import android.graphics.Bitmap;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.ValueCallback;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import androidx.webkit.WebViewClientCompat;
import bv.n;
import com.bytedance.sdk.openadsdk.multipro.xsB.LJjmO;
import com.ironsource.C3191e4;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.h;
import j1.o2;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import kv.p;
import tu.a0;
import tu.k;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class g extends WebViewClientCompat {

    /* renamed from: b, reason: collision with root package name */
    public final h f48470b;

    /* renamed from: c, reason: collision with root package name */
    public final com.moloco.sdk.acm.recorder.c f48471c;

    /* renamed from: e, reason: collision with root package name */
    public final CoroutineScope f48472e;

    /* renamed from: f, reason: collision with root package name */
    public final MutableStateFlow f48473f;

    /* renamed from: g, reason: collision with root package name */
    public final MutableStateFlow f48474g;

    /* renamed from: h, reason: collision with root package name */
    public final MutableStateFlow f48475h;

    /* renamed from: i, reason: collision with root package name */
    public final StateFlow f48476i;

    /* renamed from: j, reason: collision with root package name */
    public final MutableStateFlow f48477j;

    /* renamed from: k, reason: collision with root package name */
    public final StateFlow f48478k;

    /* renamed from: l, reason: collision with root package name */
    public Job f48479l;

    /* renamed from: m, reason: collision with root package name */
    public final MutableStateFlow f48480m;

    /* renamed from: n, reason: collision with root package name */
    public int f48481n;

    /* renamed from: o, reason: collision with root package name */
    public final int f48482o;

    /* renamed from: p, reason: collision with root package name */
    public Job f48483p;

    /* renamed from: q, reason: collision with root package name */
    public com.moloco.sdk.acm.g f48484q;

    /* renamed from: r, reason: collision with root package name */
    public com.moloco.sdk.acm.g f48485r;

    /* renamed from: s, reason: collision with root package name */
    public String f48486s;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public /* synthetic */ a(u uVar) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b extends n implements p {

        /* renamed from: i, reason: collision with root package name */
        public int f48487i;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class a implements FlowCollector {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f48489b;

            public a(g gVar) {
                this.f48489b = gVar;
            }

            public final Object a(boolean z10, zu.d<? super x0> dVar) {
                MolocoLogger.info$default(MolocoLogger.INSTANCE, "TemplateWebViewClientImpl", o2.n("Webview page pending error resolution: ", z10), null, false, 12, null);
                if (!z10) {
                    this.f48489b.d();
                }
                return x0.f87415a;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ Object emit(Object obj, zu.d dVar) {
                return a(((Boolean) obj).booleanValue(), dVar);
            }
        }

        public b(zu.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // kv.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, zu.d<? super x0> dVar) {
            return ((b) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
        }

        @Override // bv.a
        public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
            return g.this.new b(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
            int i10 = this.f48487i;
            if (i10 == 0) {
                a0.throwOnFailure(obj);
                g gVar = g.this;
                MutableStateFlow mutableStateFlow = gVar.f48480m;
                a aVar = new a(gVar);
                this.f48487i = 1;
                if (mutableStateFlow.collect(aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                a0.throwOnFailure(obj);
            }
            throw new k();
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class c extends n implements p {

        /* renamed from: i, reason: collision with root package name */
        public int f48490i;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class a implements FlowCollector {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ g f48492b;

            public a(g gVar) {
                this.f48492b = gVar;
            }

            public final Object a(boolean z10, zu.d<? super x0> dVar) {
                MolocoLogger.info$default(MolocoLogger.INSTANCE, "TemplateWebViewClientImpl", o2.n("Content loaded event received, isSuccess: ", z10), null, false, 12, null);
                g gVar = this.f48492b;
                gVar.f48473f.setValue(bv.b.boxBoolean(z10));
                Job job = gVar.f48483p;
                if (job != null) {
                    Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
                }
                com.moloco.sdk.acm.recorder.c cVar = gVar.f48471c;
                com.moloco.sdk.acm.d dVar2 = new com.moloco.sdk.acm.d(com.moloco.sdk.internal.client_metrics_data.a.O.c());
                com.moloco.sdk.internal.client_metrics_data.b bVar = com.moloco.sdk.internal.client_metrics_data.b.f45865f;
                cVar.recordCountEvent(dVar2.withTag(bVar.c(), z10 ? "success" : "failure"));
                com.moloco.sdk.acm.g gVar2 = gVar.f48485r;
                if (gVar2 != null) {
                    gVar.f48471c.recordTimerEvent(gVar2.withTag(bVar.c(), z10 ? "success" : "failure"));
                }
                return x0.f87415a;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ Object emit(Object obj, zu.d dVar) {
                return a(((Boolean) obj).booleanValue(), dVar);
            }
        }

        public c(zu.d<? super c> dVar) {
            super(2, dVar);
        }

        @Override // kv.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, zu.d<? super x0> dVar) {
            return ((c) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
        }

        @Override // bv.a
        public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
            return g.this.new c(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
            int i10 = this.f48490i;
            if (i10 == 0) {
                a0.throwOnFailure(obj);
                g gVar = g.this;
                SharedFlow<Boolean> sharedFlowC = gVar.f48470b.c();
                a aVar = new a(gVar);
                this.f48490i = 1;
                if (sharedFlowC.collect(aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                a0.throwOnFailure(obj);
            }
            throw new k();
        }
    }

    static {
        new a(null);
    }

    public g(h contentLoadedEventHandler, com.moloco.sdk.acm.recorder.c metricsRecorder) {
        e0.checkNotNullParameter(contentLoadedEventHandler, "contentLoadedEventHandler");
        e0.checkNotNullParameter(metricsRecorder, "metricsRecorder");
        this.f48470b = contentLoadedEventHandler;
        this.f48471c = metricsRecorder;
        this.f48472e = com.google.android.gms.internal.play_billing.a.o();
        Boolean bool = Boolean.FALSE;
        MutableStateFlow MutableStateFlow = StateFlowKt.MutableStateFlow(bool);
        this.f48473f = MutableStateFlow;
        this.f48474g = MutableStateFlow;
        MutableStateFlow MutableStateFlow2 = StateFlowKt.MutableStateFlow(bool);
        this.f48475h = MutableStateFlow2;
        this.f48476i = FlowKt.asStateFlow(MutableStateFlow2);
        MutableStateFlow MutableStateFlow3 = StateFlowKt.MutableStateFlow(null);
        this.f48477j = MutableStateFlow3;
        this.f48478k = FlowKt.asStateFlow(MutableStateFlow3);
        this.f48480m = StateFlowKt.MutableStateFlow(bool);
        this.f48482o = 3;
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
        StringBuilder sb2 = new StringBuilder("Webview page finished loading has pending error: ");
        MutableStateFlow mutableStateFlow = this.f48480m;
        sb2.append(((Boolean) mutableStateFlow.getValue()).booleanValue());
        MolocoLogger.info$default(molocoLogger, "TemplateWebViewClientImpl", sb2.toString(), null, false, 12, null);
        this.f48471c.recordCountEvent(new com.moloco.sdk.acm.d(com.moloco.sdk.internal.client_metrics_data.a.N.c()).withTag("pending_error", String.valueOf(((Boolean) mutableStateFlow.getValue()).booleanValue())));
        if (!((Boolean) mutableStateFlow.getValue()).booleanValue()) {
            d();
        } else {
            this.f48479l = BuildersKt__Builders_commonKt.launch$default(this.f48472e, null, null, new b(null), 3, null);
        }
    }

    @Override // android.webkit.WebViewClient
    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        MolocoLogger.info$default(MolocoLogger.INSTANCE, "TemplateWebViewClientImpl", "HTML Page started loading", null, false, 12, null);
        com.moloco.sdk.acm.d dVar = new com.moloco.sdk.acm.d(com.moloco.sdk.internal.client_metrics_data.a.L.c());
        com.moloco.sdk.acm.recorder.c cVar = this.f48471c;
        cVar.recordCountEvent(dVar);
        this.f48484q = cVar.startTimerEvent(com.moloco.sdk.internal.client_metrics_data.c.f45891w.c());
        this.f48485r = cVar.startTimerEvent(com.moloco.sdk.internal.client_metrics_data.c.f45892x.c());
    }

    @Override // android.webkit.WebViewClient
    @tu.f
    public void onReceivedError(final WebView view, final int i10, final String description, String failingUrl) {
        e0.checkNotNullParameter(view, "view");
        e0.checkNotNullParameter(description, "description");
        e0.checkNotNullParameter(failingUrl, "failingUrl");
        this.f48480m.setValue(Boolean.TRUE);
        MolocoLogger.info$default(MolocoLogger.INSTANCE, "TemplateWebViewClientImpl", "Received error: " + i10 + ", with description: " + description + " for url: " + failingUrl, null, false, 12, null);
        view.evaluateJavascript(a.b.l("ContentChecker.isRequiredContent('", failingUrl, "');"), new ValueCallback() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.e
            @Override // android.webkit.ValueCallback
            public final void onReceiveValue(Object obj) {
                g.a(this.f48400a, description, i10, view, (String) obj);
            }
        });
        super.onReceivedError(view, i10, description, failingUrl);
    }

    @Override // androidx.webkit.WebViewClientCompat, android.webkit.WebViewClient, org.chromium.support_lib_boundary.WebViewClientBoundaryInterface
    public void onReceivedHttpError(WebView view, WebResourceRequest request, final WebResourceResponse errorResponse) {
        e0.checkNotNullParameter(view, "view");
        e0.checkNotNullParameter(request, "request");
        e0.checkNotNullParameter(errorResponse, "errorResponse");
        this.f48480m.setValue(Boolean.TRUE);
        MolocoLogger.info$default(MolocoLogger.INSTANCE, "TemplateWebViewClientImpl", C3191e4.i.f36529d + Thread.currentThread().getName() + "] Received HTTP error: " + Integer.valueOf(errorResponse.getStatusCode()) + ", with description: " + errorResponse.getReasonPhrase() + " for url: " + request.getUrl(), null, false, 12, null);
        String string = request.getUrl().toString();
        e0.checkNotNullExpressionValue(string, "toString(...)");
        view.evaluateJavascript(a.b.l("ContentChecker.isRequiredContent('", string, "');"), new ValueCallback() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.f
            @Override // android.webkit.ValueCallback
            public final void onReceiveValue(Object obj) {
                g.a(this.f48458a, errorResponse, (String) obj);
            }
        });
        super.onReceivedHttpError(view, request, errorResponse);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.webkit.WebViewClient
    public boolean onRenderProcessGone(WebView view, RenderProcessGoneDetail renderProcessGoneDetail) {
        e0.checkNotNullParameter(view, "view");
        this.f48471c.recordCountEvent(new com.moloco.sdk.acm.d(com.moloco.sdk.internal.client_metrics_data.a.I.c()).withTag(com.moloco.sdk.internal.client_metrics_data.b.f45865f.c(), "failure").withTag(com.moloco.sdk.internal.client_metrics_data.b.f45863c.c(), "render_process_gone_error").withTag("is_loaded", String.valueOf(((Boolean) this.f48474g.getValue()).booleanValue())));
        this.f48477j.setValue(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.errors.a.f48408g);
        MolocoLogger.error$default(MolocoLogger.INSTANCE, "TemplateWebViewClientImpl", "onRenderProcessGone", null, false, 12, null);
        this.f48480m.setValue(Boolean.FALSE);
        return true;
    }

    public final StateFlow<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.errors.a> a() {
        return this.f48478k;
    }

    public final StateFlow<Boolean> b() {
        return this.f48474g;
    }

    public final StateFlow<Boolean> c() {
        return this.f48476i;
    }

    public final void d() {
        MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
        StringBuilder sb2 = new StringBuilder("HTML Page finished loading is success: ");
        StateFlow stateFlow = this.f48478k;
        sb2.append(stateFlow.getValue() == null);
        MolocoLogger.info$default(molocoLogger, "TemplateWebViewClientImpl", sb2.toString(), null, false, 12, null);
        this.f48475h.setValue(Boolean.TRUE);
        Object value = stateFlow.getValue();
        com.moloco.sdk.acm.recorder.c cVar = this.f48471c;
        if (value == null) {
            MolocoLogger.info$default(molocoLogger, "TemplateWebViewClientImpl", "Waiting for content HTML assets to load or error out", null, false, 12, null);
            com.moloco.sdk.acm.d dVar = new com.moloco.sdk.acm.d(com.moloco.sdk.internal.client_metrics_data.a.M.c());
            com.moloco.sdk.internal.client_metrics_data.b bVar = com.moloco.sdk.internal.client_metrics_data.b.f45865f;
            cVar.recordCountEvent(dVar.withTag(bVar.c(), "success"));
            com.moloco.sdk.acm.g gVar = this.f48484q;
            if (gVar != null) {
                cVar.recordTimerEvent(gVar.withTag(bVar.c(), "success"));
            }
            this.f48483p = BuildersKt__Builders_commonKt.launch$default(this.f48472e, null, null, new c(null), 3, null);
            return;
        }
        MolocoLogger.info$default(molocoLogger, "TemplateWebViewClientImpl", LJjmO.ygXlMdh, null, false, 12, null);
        this.f48473f.setValue(Boolean.FALSE);
        Job job = this.f48483p;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        com.moloco.sdk.acm.d dVar2 = new com.moloco.sdk.acm.d(com.moloco.sdk.internal.client_metrics_data.a.M.c());
        com.moloco.sdk.internal.client_metrics_data.b bVar2 = com.moloco.sdk.internal.client_metrics_data.b.f45865f;
        com.moloco.sdk.acm.d dVarWithTag = dVar2.withTag(bVar2.c(), "failure");
        com.moloco.sdk.internal.client_metrics_data.b bVar3 = com.moloco.sdk.internal.client_metrics_data.b.f45863c;
        String strC = bVar3.c();
        String str = this.f48486s;
        if (str == null) {
            str = "unknown";
        }
        cVar.recordCountEvent(dVarWithTag.withTag(strC, str));
        com.moloco.sdk.acm.g gVar2 = this.f48484q;
        if (gVar2 != null) {
            com.moloco.sdk.acm.g gVarWithTag = gVar2.withTag(bVar2.c(), "failure");
            String strC2 = bVar3.c();
            String str2 = this.f48486s;
            cVar.recordTimerEvent(gVarWithTag.withTag(strC2, str2 != null ? str2 : "unknown"));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(g gVar, String str, int i10, WebView webView, String str2) {
        boolean z10 = Boolean.parseBoolean(str2);
        MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
        MolocoLogger.info$default(molocoLogger, "TemplateWebViewClientImpl", C3191e4.i.f36529d + Thread.currentThread().getName() + "] Content type with webview error is required: " + z10, null, false, 12, null);
        if (z10) {
            com.moloco.sdk.acm.recorder.c cVar = gVar.f48471c;
            MutableStateFlow mutableStateFlow = gVar.f48474g;
            cVar.recordCountEvent(new com.moloco.sdk.acm.d(com.moloco.sdk.internal.client_metrics_data.a.I.c()).withTag(com.moloco.sdk.internal.client_metrics_data.b.f45865f.c(), "failure").withTag("required", "true").withTag(com.moloco.sdk.internal.client_metrics_data.b.f45863c.c(), String.valueOf(str)).withTag("status_code", String.valueOf(i10)).withTag(com.moloco.sdk.internal.client_metrics_data.b.f45867h.c(), String.valueOf(gVar.f48481n)).withTag("is_loaded", String.valueOf(((Boolean) mutableStateFlow.getValue()).booleanValue())));
            if (((Boolean) mutableStateFlow.getValue()).booleanValue() && i10 == -1 && str.equals("net::ERR_FAILED")) {
                MolocoLogger.info$default(molocoLogger, "TemplateWebViewClientImpl", "Webview is already loaded, not setting unrecoverable error for unknown error", null, false, 12, null);
            } else if (gVar.a(i10)) {
                gVar.f48481n++;
                MolocoLogger.info$default(molocoLogger, "TemplateWebViewClientImpl", "Retrying... Attempt: " + gVar.f48481n, null, false, 12, null);
                Job job = gVar.f48483p;
                if (job != null) {
                    Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
                }
                webView.reload();
            } else {
                MolocoLogger.warn$default(molocoLogger, "TemplateWebViewClientImpl", "Retrying attempts complete. Setting unrecoverable error.", null, false, 12, null);
                gVar.f48486s = str;
                gVar.f48477j.setValue(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.errors.a.f48406e);
            }
        } else {
            MolocoLogger.info$default(molocoLogger, "TemplateWebViewClientImpl", "Content is not required, not setting unrecoverable error", null, false, 12, null);
            gVar.f48471c.recordCountEvent(new com.moloco.sdk.acm.d(com.moloco.sdk.internal.client_metrics_data.a.I.c()).withTag(com.moloco.sdk.internal.client_metrics_data.b.f45865f.c(), "failure").withTag("required", "false").withTag(com.moloco.sdk.internal.client_metrics_data.b.f45863c.c(), str).withTag("status_code", String.valueOf(i10)).withTag("is_loaded", String.valueOf(((Boolean) gVar.f48474g.getValue()).booleanValue())));
        }
        gVar.f48480m.setValue(Boolean.FALSE);
    }

    @Override // androidx.webkit.WebViewClientCompat
    public void onReceivedError(final WebView view, WebResourceRequest request, final k6.n error) {
        e0.checkNotNullParameter(view, "view");
        e0.checkNotNullParameter(request, "request");
        e0.checkNotNullParameter(error, "error");
        this.f48480m.setValue(Boolean.TRUE);
        MolocoLogger.info$default(MolocoLogger.INSTANCE, "TemplateWebViewClientImpl", "Received error: " + error.getErrorCode() + ", with description: " + ((Object) error.getDescription()) + " for url: " + request.getUrl(), null, false, 12, null);
        String string = request.getUrl().toString();
        e0.checkNotNullExpressionValue(string, "toString(...)");
        view.evaluateJavascript(a.b.l("ContentChecker.isRequiredContent('", string, "');"), new ValueCallback() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.d
            @Override // android.webkit.ValueCallback
            public final void onReceiveValue(Object obj) {
                g.a(this.f48397a, error, view, (String) obj);
            }
        });
        super.onReceivedError(view, request, error);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(g gVar, k6.n nVar, WebView webView, String str) {
        boolean z10 = Boolean.parseBoolean(str);
        MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
        MolocoLogger.info$default(molocoLogger, "TemplateWebViewClientImpl", C3191e4.i.f36529d + Thread.currentThread().getName() + "] Content type with webview error is required: " + z10, null, false, 12, null);
        if (z10) {
            com.moloco.sdk.acm.recorder.c cVar = gVar.f48471c;
            MutableStateFlow mutableStateFlow = gVar.f48474g;
            cVar.recordCountEvent(new com.moloco.sdk.acm.d(com.moloco.sdk.internal.client_metrics_data.a.I.c()).withTag(com.moloco.sdk.internal.client_metrics_data.b.f45865f.c(), "failure").withTag("required", "true").withTag(com.moloco.sdk.internal.client_metrics_data.b.f45863c.c(), String.valueOf(nVar.getDescription())).withTag("status_code", String.valueOf(nVar.getErrorCode())).withTag(com.moloco.sdk.internal.client_metrics_data.b.f45867h.c(), String.valueOf(gVar.f48481n)).withTag("is_loaded", String.valueOf(((Boolean) mutableStateFlow.getValue()).booleanValue())));
            if (((Boolean) mutableStateFlow.getValue()).booleanValue() && nVar.getErrorCode() == -1 && nVar.getDescription().equals("net::ERR_FAILED")) {
                MolocoLogger.info$default(molocoLogger, "TemplateWebViewClientImpl", "Webview is already loaded, not setting unrecoverable error for unknown error", null, false, 12, null);
            } else if (gVar.a(nVar.getErrorCode())) {
                gVar.f48481n++;
                MolocoLogger.info$default(molocoLogger, "TemplateWebViewClientImpl", "Retrying... Attempt: " + gVar.f48481n, null, false, 12, null);
                Job job = gVar.f48483p;
                if (job != null) {
                    Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
                }
                Job job2 = gVar.f48479l;
                if (job2 != null) {
                    Job.DefaultImpls.cancel$default(job2, (CancellationException) null, 1, (Object) null);
                }
                webView.reload();
            } else {
                MolocoLogger.warn$default(molocoLogger, "TemplateWebViewClientImpl", "Retrying attempts complete. Setting unrecoverable error.", null, false, 12, null);
                gVar.f48486s = nVar.getDescription().toString();
                gVar.f48477j.setValue(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.errors.a.f48406e);
            }
        } else {
            MolocoLogger.info$default(molocoLogger, "TemplateWebViewClientImpl", "Content is not required, not setting unrecoverable error", null, false, 12, null);
            gVar.f48471c.recordCountEvent(new com.moloco.sdk.acm.d(com.moloco.sdk.internal.client_metrics_data.a.I.c()).withTag(com.moloco.sdk.internal.client_metrics_data.b.f45865f.c(), "failure").withTag("required", "false").withTag(com.moloco.sdk.internal.client_metrics_data.b.f45863c.c(), String.valueOf(nVar.getDescription())).withTag("status_code", String.valueOf(nVar.getErrorCode())).withTag("is_loaded", String.valueOf(((Boolean) gVar.f48474g.getValue()).booleanValue())));
        }
        gVar.f48480m.setValue(Boolean.FALSE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(g gVar, WebResourceResponse webResourceResponse, String str) {
        boolean z10 = Boolean.parseBoolean(str);
        MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
        MolocoLogger.info$default(molocoLogger, "TemplateWebViewClientImpl", C3191e4.i.f36529d + Thread.currentThread().getName() + "] Content isRequired with http error: " + z10, null, false, 12, null);
        if (z10) {
            gVar.f48477j.setValue(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.errors.a.f48407f);
            gVar.f48486s = String.valueOf(webResourceResponse.getStatusCode());
            gVar.f48471c.recordCountEvent(new com.moloco.sdk.acm.d(com.moloco.sdk.internal.client_metrics_data.a.I.c()).withTag(com.moloco.sdk.internal.client_metrics_data.b.f45865f.c(), "failure").withTag("required", "true").withTag(com.moloco.sdk.internal.client_metrics_data.b.f45863c.c(), String.valueOf(webResourceResponse.getStatusCode())).withTag("is_loaded", String.valueOf(((Boolean) gVar.f48474g.getValue()).booleanValue())));
            MolocoLogger.warn$default(molocoLogger, "TemplateWebViewClientImpl", "Setting unrecoverable error: " + gVar.f48478k.getValue(), null, false, 12, null);
        } else {
            MolocoLogger.info$default(molocoLogger, "TemplateWebViewClientImpl", "Content is not required, not setting unrecoverable error", null, false, 12, null);
            gVar.f48471c.recordCountEvent(new com.moloco.sdk.acm.d(com.moloco.sdk.internal.client_metrics_data.a.I.c()).withTag(com.moloco.sdk.internal.client_metrics_data.b.f45865f.c(), "failure").withTag("required", "false").withTag(com.moloco.sdk.internal.client_metrics_data.b.f45863c.c(), String.valueOf(webResourceResponse.getStatusCode())).withTag("is_loaded", String.valueOf(((Boolean) gVar.f48474g.getValue()).booleanValue())));
        }
        gVar.f48480m.setValue(Boolean.FALSE);
    }

    public final boolean a(int i10) {
        MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
        StringBuilder sbT = p0.o2.t(i10, "errorCode: ", ", (errorCode == UNKNOWN_ERROR || errorCode == NETWORK_ERROR): ");
        sbT.append(i10 == -1 || i10 == -2);
        MolocoLogger.debug$default(molocoLogger, "TemplateWebViewClientImpl", sbT.toString(), false, 4, null);
        StringBuilder sb2 = new StringBuilder("retryCount: ");
        int i11 = this.f48481n;
        int i12 = this.f48482o;
        a.b.x(i11, i12, ", MAX_RETRY_LIMIT: ", ", retryCount < MAX_RETRY_LIMIT: ", sb2);
        sb2.append(this.f48481n < i12);
        MolocoLogger.debug$default(molocoLogger, "TemplateWebViewClientImpl", sb2.toString(), false, 4, null);
        return (i10 == -1 || i10 == -2) && this.f48481n < i12;
    }
}
