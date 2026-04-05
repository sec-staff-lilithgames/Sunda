package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer;

import android.content.Context;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.WebSettings;
import android.webkit.WebView;
import bv.n;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.internal.w;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.g;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.h;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.TimeoutKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import kv.p;
import kv.q;
import tu.a0;
import tu.e0;
import tu.k;
import tu.v;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class b extends WebView {

    /* renamed from: b, reason: collision with root package name */
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.g f48367b;

    /* renamed from: c, reason: collision with root package name */
    public final com.moloco.sdk.acm.recorder.c f48368c;

    /* renamed from: e, reason: collision with root package name */
    public final g f48369e;

    /* renamed from: f, reason: collision with root package name */
    public final CoroutineScope f48370f;

    /* renamed from: g, reason: collision with root package name */
    public final MutableStateFlow f48371g;

    /* renamed from: h, reason: collision with root package name */
    public final StateFlow f48372h;

    /* renamed from: i, reason: collision with root package name */
    public final StateFlow f48373i;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public /* synthetic */ a(u uVar) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.b$b, reason: collision with other inner class name */
    public static final class C0434b extends n implements p {

        /* renamed from: i, reason: collision with root package name */
        public com.moloco.sdk.acm.g f48374i;

        /* renamed from: j, reason: collision with root package name */
        public int f48375j;

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ String f48377l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ long f48378m;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.b$b$a */
        public static final class a extends n implements p {

            /* renamed from: i, reason: collision with root package name */
            public int f48379i;

            /* renamed from: j, reason: collision with root package name */
            public final /* synthetic */ b f48380j;

            /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
            /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.b$b$a$a, reason: collision with other inner class name */
            public static final class C0435a extends n implements q {

                /* renamed from: i, reason: collision with root package name */
                public /* synthetic */ boolean f48381i;

                /* renamed from: j, reason: collision with root package name */
                public /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.errors.a f48382j;

                public C0435a(zu.d<? super C0435a> dVar) {
                    super(3, dVar);
                }

                public final Object a(boolean z10, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.errors.a aVar, zu.d<? super v> dVar) {
                    C0435a c0435a = new C0435a(dVar);
                    c0435a.f48381i = z10;
                    c0435a.f48382j = aVar;
                    return c0435a.invokeSuspend(x0.f87415a);
                }

                @Override // kv.q
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                    return a(((Boolean) obj).booleanValue(), (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.errors.a) obj2, (zu.d) obj3);
                }

                @Override // bv.a
                public final Object invokeSuspend(Object obj) {
                    av.e.getCOROUTINE_SUSPENDED();
                    a0.throwOnFailure(obj);
                    boolean z10 = this.f48381i;
                    return e0.to(bv.b.boxBoolean(z10), this.f48382j);
                }
            }

            /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
            /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.b$b$a$b, reason: collision with other inner class name */
            public static final class C0436b extends n implements p {

                /* renamed from: i, reason: collision with root package name */
                public /* synthetic */ Object f48383i;

                public C0436b(zu.d<? super C0436b> dVar) {
                    super(2, dVar);
                }

                @Override // kv.p
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object invoke(v vVar, zu.d<? super Boolean> dVar) {
                    return ((C0436b) create(vVar, dVar)).invokeSuspend(x0.f87415a);
                }

                @Override // bv.a
                public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
                    C0436b c0436b = new C0436b(dVar);
                    c0436b.f48383i = obj;
                    return c0436b;
                }

                @Override // bv.a
                public final Object invokeSuspend(Object obj) {
                    av.e.getCOROUTINE_SUSPENDED();
                    a0.throwOnFailure(obj);
                    v vVar = (v) this.f48383i;
                    return bv.b.boxBoolean(((Boolean) vVar.component1()).booleanValue() || ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.errors.a) vVar.component2()) != null);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(b bVar, zu.d<? super a> dVar) {
                super(2, dVar);
                this.f48380j = bVar;
            }

            @Override // kv.p
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(CoroutineScope coroutineScope, zu.d<? super v> dVar) {
                return ((a) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
            }

            @Override // bv.a
            public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
                return new a(this.f48380j, dVar);
            }

            @Override // bv.a
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
                int i10 = this.f48379i;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    a0.throwOnFailure(obj);
                    return obj;
                }
                a0.throwOnFailure(obj);
                b bVar = this.f48380j;
                Flow flowFlowCombine = FlowKt.flowCombine(bVar.f48369e.b(), bVar.f48369e.a(), new C0435a(null));
                C0436b c0436b = new C0436b(null);
                this.f48379i = 1;
                Object objFirst = FlowKt.first(flowFlowCombine, c0436b, this);
                return objFirst == coroutine_suspended ? coroutine_suspended : objFirst;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0434b(String str, long j10, zu.d<? super C0434b> dVar) {
            super(2, dVar);
            this.f48377l = str;
            this.f48378m = j10;
        }

        @Override // kv.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, zu.d<? super w> dVar) {
            return ((C0434b) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
        }

        @Override // bv.a
        public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
            return b.this.new C0434b(this.f48377l, this.f48378m, dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            com.moloco.sdk.acm.g gVar;
            Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
            int i10 = this.f48375j;
            b bVar = b.this;
            if (i10 == 0) {
                a0.throwOnFailure(obj);
                com.moloco.sdk.acm.g gVarStartTimerEvent = bVar.f48368c.startTimerEvent(com.moloco.sdk.internal.client_metrics_data.c.f45888t.c());
                try {
                    b.this.loadDataWithBaseURL(null, this.f48377l, "text/html", C.UTF8_NAME, null);
                    a aVar = new a(bVar, null);
                    this.f48374i = gVarStartTimerEvent;
                    this.f48375j = 1;
                    Object objM5138withTimeoutOrNullKLykuaI = TimeoutKt.m5138withTimeoutOrNullKLykuaI(this.f48378m, aVar, this);
                    if (objM5138withTimeoutOrNullKLykuaI == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    gVar = gVarStartTimerEvent;
                    obj = objM5138withTimeoutOrNullKLykuaI;
                } catch (Exception e10) {
                    MolocoLogger.error$default(MolocoLogger.INSTANCE, "TemplateWebView", "loadHtml failed to load the provided html", e10, false, 8, null);
                    com.moloco.sdk.acm.recorder.c cVar = bVar.f48368c;
                    com.moloco.sdk.acm.d dVar = new com.moloco.sdk.acm.d(com.moloco.sdk.internal.client_metrics_data.a.H.c());
                    com.moloco.sdk.internal.client_metrics_data.b bVar2 = com.moloco.sdk.internal.client_metrics_data.b.f45865f;
                    com.moloco.sdk.acm.d dVarWithTag = dVar.withTag(bVar2.c(), "failure");
                    com.moloco.sdk.internal.client_metrics_data.b bVar3 = com.moloco.sdk.internal.client_metrics_data.b.f45863c;
                    cVar.recordCountEvent(dVarWithTag.withTag(bVar3.c(), "invalid_url"));
                    bVar.f48368c.recordTimerEvent(gVarStartTimerEvent.withTag(bVar2.c(), "failure").withTag(bVar3.c(), "invalid_url"));
                    return new w.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.errors.a.f48405c);
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gVar = this.f48374i;
                a0.throwOnFailure(obj);
            }
            if (obj == null) {
                MolocoLogger.error$default(MolocoLogger.INSTANCE, "TemplateWebView", "Ad failed to load due to timeout", null, false, 12, null);
                com.moloco.sdk.acm.recorder.c cVar2 = bVar.f48368c;
                com.moloco.sdk.acm.d dVar2 = new com.moloco.sdk.acm.d(com.moloco.sdk.internal.client_metrics_data.a.H.c());
                com.moloco.sdk.internal.client_metrics_data.b bVar4 = com.moloco.sdk.internal.client_metrics_data.b.f45865f;
                com.moloco.sdk.acm.d dVarWithTag2 = dVar2.withTag(bVar4.c(), "failure");
                com.moloco.sdk.internal.client_metrics_data.b bVar5 = com.moloco.sdk.internal.client_metrics_data.b.f45863c;
                cVar2.recordCountEvent(dVarWithTag2.withTag(bVar5.c(), "timeout_error"));
                bVar.f48368c.recordTimerEvent(gVar.withTag(bVar4.c(), "failure").withTag(bVar5.c(), "timeout_error"));
                return new w.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.errors.a.f48409h);
            }
            boolean zBooleanValue = bVar.f48369e.b().getValue().booleanValue();
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.errors.a value = bVar.f48369e.a().getValue();
            if (value != null) {
                MolocoLogger.error$default(MolocoLogger.INSTANCE, "TemplateWebView", "Ad failed to load due to unrecoverable error: " + value.name(), null, false, 12, null);
                com.moloco.sdk.acm.recorder.c cVar3 = bVar.f48368c;
                com.moloco.sdk.acm.d dVar3 = new com.moloco.sdk.acm.d(com.moloco.sdk.internal.client_metrics_data.a.H.c());
                com.moloco.sdk.internal.client_metrics_data.b bVar6 = com.moloco.sdk.internal.client_metrics_data.b.f45865f;
                com.moloco.sdk.acm.d dVarWithTag3 = dVar3.withTag(bVar6.c(), "failure");
                com.moloco.sdk.internal.client_metrics_data.b bVar7 = com.moloco.sdk.internal.client_metrics_data.b.f45863c;
                cVar3.recordCountEvent(dVarWithTag3.withTag(bVar7.c(), value.name()));
                bVar.f48368c.recordTimerEvent(gVar.withTag(bVar6.c(), "failure").withTag(bVar7.c(), value.name()));
                return new w.a(value);
            }
            if (zBooleanValue) {
                com.moloco.sdk.acm.recorder.c cVar4 = bVar.f48368c;
                com.moloco.sdk.acm.d dVar4 = new com.moloco.sdk.acm.d(com.moloco.sdk.internal.client_metrics_data.a.H.c());
                com.moloco.sdk.internal.client_metrics_data.b bVar8 = com.moloco.sdk.internal.client_metrics_data.b.f45865f;
                cVar4.recordCountEvent(dVar4.withTag(bVar8.c(), "success"));
                bVar.f48368c.recordTimerEvent(gVar.withTag(bVar8.c(), "success"));
                return new w.b(x0.f87415a);
            }
            com.moloco.sdk.acm.recorder.c cVar5 = bVar.f48368c;
            com.moloco.sdk.acm.d dVar5 = new com.moloco.sdk.acm.d(com.moloco.sdk.internal.client_metrics_data.a.H.c());
            com.moloco.sdk.internal.client_metrics_data.b bVar9 = com.moloco.sdk.internal.client_metrics_data.b.f45865f;
            com.moloco.sdk.acm.d dVarWithTag4 = dVar5.withTag(bVar9.c(), "failure");
            com.moloco.sdk.internal.client_metrics_data.b bVar10 = com.moloco.sdk.internal.client_metrics_data.b.f45863c;
            cVar5.recordCountEvent(dVarWithTag4.withTag(bVar10.c(), "unknown_error"));
            bVar.f48368c.recordTimerEvent(gVar.withTag(bVar9.c(), "failure").withTag(bVar10.c(), "unknown_error"));
            return new w.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.errors.a.f48404b);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class c extends n implements p {

        /* renamed from: i, reason: collision with root package name */
        public int f48384i;

        /* renamed from: k, reason: collision with root package name */
        public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.creative.mraid.a f48386k;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class a implements FlowCollector {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ b f48387b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.creative.mraid.a f48388c;

            /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
            /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.b$c$a$a, reason: collision with other inner class name */
            public static final class C0437a extends n implements p {

                /* renamed from: i, reason: collision with root package name */
                public final /* synthetic */ b f48389i;

                /* renamed from: j, reason: collision with root package name */
                public final /* synthetic */ g.a f48390j;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0437a(b bVar, g.a aVar, zu.d<? super C0437a> dVar) {
                    super(2, dVar);
                    this.f48389i = bVar;
                    this.f48390j = aVar;
                }

                @Override // kv.p
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object invoke(CoroutineScope coroutineScope, zu.d<? super x0> dVar) {
                    return ((C0437a) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
                }

                @Override // bv.a
                public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
                    return new C0437a(this.f48389i, this.f48390j, dVar);
                }

                @Override // bv.a
                public final Object invokeSuspend(Object obj) {
                    av.e.getCOROUTINE_SUSPENDED();
                    a0.throwOnFailure(obj);
                    b bVar = this.f48389i;
                    WebSettings settings = bVar.getSettings();
                    int i10 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.c.f48396a[this.f48390j.ordinal()];
                    settings.setMediaPlaybackRequiresUserGesture(i10 != 1 ? i10 != 2 ? bVar.getSettings().getMediaPlaybackRequiresUserGesture() : false : true);
                    return x0.f87415a;
                }
            }

            /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
            /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.b$c$a$b, reason: collision with other inner class name */
            public static final class C0438b extends bv.d {

                /* renamed from: i, reason: collision with root package name */
                public a f48391i;

                /* renamed from: j, reason: collision with root package name */
                public g.a f48392j;

                /* renamed from: k, reason: collision with root package name */
                public /* synthetic */ Object f48393k;

                /* renamed from: m, reason: collision with root package name */
                public int f48395m;

                public C0438b(zu.d<? super C0438b> dVar) {
                    super(dVar);
                }

                @Override // bv.a
                public final Object invokeSuspend(Object obj) {
                    this.f48393k = obj;
                    this.f48395m |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(b bVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.creative.mraid.a aVar) {
                this.f48387b = bVar;
                this.f48388c = aVar;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.g.a r14, zu.d<? super tu.x0> r15) {
                /*
                    Method dump skipped, instructions count: 233
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.b.c.a.emit(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.g$a, zu.d):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.creative.mraid.a aVar, zu.d<? super c> dVar) {
            super(2, dVar);
            this.f48386k = aVar;
        }

        @Override // kv.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, zu.d<? super x0> dVar) {
            return ((c) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
        }

        @Override // bv.a
        public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
            return b.this.new c(this.f48386k, dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            b bVar = b.this;
            Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
            int i10 = this.f48384i;
            try {
                if (i10 == 0) {
                    a0.throwOnFailure(obj);
                    MutableSharedFlow<g.a> mutableSharedFlowC = bVar.f48367b.c();
                    a aVar = new a(bVar, this.f48386k);
                    this.f48384i = 1;
                    if (mutableSharedFlowC.collect(aVar, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    a0.throwOnFailure(obj);
                }
                throw new k();
            } catch (Exception e10) {
                MolocoLogger.info$default(MolocoLogger.INSTANCE, "TemplateWebView", "Error collecting playlist item displaying events", e10, false, 8, null);
                return x0.f87415a;
            }
        }
    }

    static {
        new a(null);
    }

    public /* synthetic */ b(Context context, h hVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.g gVar, com.moloco.sdk.acm.recorder.c cVar, g gVar2, int i10, u uVar) {
        this(context, hVar, gVar, cVar, (i10 & 16) != 0 ? new g(hVar, cVar) : gVar2);
    }

    @Override // android.webkit.WebView
    public void destroy() {
        ViewParent parent = getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.removeView(this);
        }
        removeAllViews();
        super.destroy();
    }

    public final StateFlow<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.orientation.b> getOrientation$moloco_sdk_release() {
        return this.f48371g;
    }

    public final StateFlow<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.errors.a> getUnrecoverableError() {
        return this.f48372h;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        CoroutineScopeKt.cancel$default(this.f48370f, null, 1, null);
    }

    public final StateFlow<Boolean> a() {
        return this.f48373i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Context context, h contentLoadedEventHandler, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.g playListItemDisplayingEventHandler, com.moloco.sdk.acm.recorder.c metricsRecorder, g webViewClientImpl) {
        super(context);
        kotlin.jvm.internal.e0.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.e0.checkNotNullParameter(contentLoadedEventHandler, "contentLoadedEventHandler");
        kotlin.jvm.internal.e0.checkNotNullParameter(playListItemDisplayingEventHandler, "playListItemDisplayingEventHandler");
        kotlin.jvm.internal.e0.checkNotNullParameter(metricsRecorder, "metricsRecorder");
        kotlin.jvm.internal.e0.checkNotNullParameter(webViewClientImpl, "webViewClientImpl");
        this.f48367b = playListItemDisplayingEventHandler;
        this.f48368c = metricsRecorder;
        this.f48369e = webViewClientImpl;
        this.f48370f = CoroutineScopeKt.CoroutineScope(com.moloco.sdk.common_adapter_internal.a.f45692a.DispatcherProvider().getMain());
        this.f48371g = StateFlowKt.MutableStateFlow(new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.orientation.b(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.orientation.a.f48337e, false, 2, null));
        setWebViewClient(webViewClientImpl);
        setScrollBarStyle(0);
        setHorizontalScrollBarEnabled(false);
        setVerticalScrollBarEnabled(false);
        WebSettings settings = getSettings();
        settings.setSupportZoom(false);
        settings.setJavaScriptEnabled(true);
        setSaveEnabled(false);
        settings.setDomStorageEnabled(true);
        settings.setMediaPlaybackRequiresUserGesture(false);
        settings.setAllowFileAccess(true);
        settings.setAllowContentAccess(true);
        setBackgroundColor(0);
        this.f48372h = webViewClientImpl.a();
        this.f48373i = webViewClientImpl.c();
    }

    public final void a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.creative.mraid.a mraidCommunicationHub) {
        kotlin.jvm.internal.e0.checkNotNullParameter(mraidCommunicationHub, "mraidCommunicationHub");
        BuildersKt__Builders_commonKt.launch$default(this.f48370f, null, null, new c(mraidCommunicationHub, null), 3, null);
    }

    public final Object a(String str, long j10, zu.d<? super w> dVar) {
        return BuildersKt.withContext(Dispatchers.getMain(), new C0434b(str, j10, null), dVar);
    }
}
