package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer;

import android.content.Context;
import android.view.MotionEvent;
import android.webkit.WebSettings;
import av.e;
import bv.n;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.internal.scheduling.c;
import com.moloco.sdk.internal.services.c0;
import com.moloco.sdk.internal.w;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.h;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.o;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.v;
import com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.TimeoutKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.StateFlow;
import kv.p;
import kv.q;
import tu.a0;
import tu.e0;
import tu.x0;
import uu.k0;
import zu.d;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class a extends v implements o {

    /* renamed from: c, reason: collision with root package name */
    public final CoroutineScope f48272c;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f48273e;

    /* renamed from: f, reason: collision with root package name */
    public final b f48274f;

    /* renamed from: g, reason: collision with root package name */
    public final StateFlow f48275g;

    /* renamed from: h, reason: collision with root package name */
    public final SharedFlow f48276h;

    /* renamed from: i, reason: collision with root package name */
    public final StateFlow f48277i;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.a$a, reason: collision with other inner class name */
    public static final class C0424a extends n implements p {

        /* renamed from: i, reason: collision with root package name */
        public int f48278i;

        /* renamed from: k, reason: collision with root package name */
        public final /* synthetic */ String f48280k;

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ long f48281l;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.a$a$a, reason: collision with other inner class name */
        public static final class C0425a extends n implements p {

            /* renamed from: i, reason: collision with root package name */
            public int f48282i;

            /* renamed from: j, reason: collision with root package name */
            public final /* synthetic */ a f48283j;

            /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
            /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.a$a$a$a, reason: collision with other inner class name */
            public static final class C0426a extends n implements q {

                /* renamed from: i, reason: collision with root package name */
                public /* synthetic */ boolean f48284i;

                /* renamed from: j, reason: collision with root package name */
                public /* synthetic */ h f48285j;

                public C0426a(d<? super C0426a> dVar) {
                    super(3, dVar);
                }

                public final Object a(boolean z10, h hVar, d<? super tu.v> dVar) {
                    C0426a c0426a = new C0426a(dVar);
                    c0426a.f48284i = z10;
                    c0426a.f48285j = hVar;
                    return c0426a.invokeSuspend(x0.f87415a);
                }

                @Override // kv.q
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                    return a(((Boolean) obj).booleanValue(), (h) obj2, (d) obj3);
                }

                @Override // bv.a
                public final Object invokeSuspend(Object obj) {
                    e.getCOROUTINE_SUSPENDED();
                    a0.throwOnFailure(obj);
                    boolean z10 = this.f48284i;
                    return e0.to(bv.b.boxBoolean(z10), this.f48285j);
                }
            }

            /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
            /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.a$a$a$b */
            public static final class b extends n implements p {

                /* renamed from: i, reason: collision with root package name */
                public /* synthetic */ Object f48286i;

                public b(d<? super b> dVar) {
                    super(2, dVar);
                }

                @Override // kv.p
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object invoke(tu.v vVar, d<? super Boolean> dVar) {
                    return ((b) create(vVar, dVar)).invokeSuspend(x0.f87415a);
                }

                @Override // bv.a
                public final d<x0> create(Object obj, d<?> dVar) {
                    b bVar = new b(dVar);
                    bVar.f48286i = obj;
                    return bVar;
                }

                @Override // bv.a
                public final Object invokeSuspend(Object obj) {
                    e.getCOROUTINE_SUSPENDED();
                    a0.throwOnFailure(obj);
                    tu.v vVar = (tu.v) this.f48286i;
                    return bv.b.boxBoolean(((Boolean) vVar.component1()).booleanValue() || ((h) vVar.component2()) != null);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0425a(a aVar, d<? super C0425a> dVar) {
                super(2, dVar);
                this.f48283j = aVar;
            }

            @Override // kv.p
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(CoroutineScope coroutineScope, d<? super tu.v> dVar) {
                return ((C0425a) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
            }

            @Override // bv.a
            public final d<x0> create(Object obj, d<?> dVar) {
                return new C0425a(this.f48283j, dVar);
            }

            @Override // bv.a
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = e.getCOROUTINE_SUSPENDED();
                int i10 = this.f48282i;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    a0.throwOnFailure(obj);
                    return obj;
                }
                a0.throwOnFailure(obj);
                a aVar = this.f48283j;
                Flow flowFlowCombine = FlowKt.flowCombine(aVar.f48274f.n(), aVar.f48274f.m(), new C0426a(null));
                b bVar = new b(null);
                this.f48282i = 1;
                Object objFirst = FlowKt.first(flowFlowCombine, bVar, this);
                return objFirst == coroutine_suspended ? coroutine_suspended : objFirst;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0424a(String str, long j10, d<? super C0424a> dVar) {
            super(2, dVar);
            this.f48280k = str;
            this.f48281l = j10;
        }

        @Override // kv.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, d<? super w> dVar) {
            return ((C0424a) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
        }

        @Override // bv.a
        public final d<x0> create(Object obj, d<?> dVar) {
            return a.this.new C0424a(this.f48280k, this.f48281l, dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = e.getCOROUTINE_SUSPENDED();
            int i10 = this.f48278i;
            a aVar = a.this;
            if (i10 == 0) {
                a0.throwOnFailure(obj);
                try {
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.w.a(aVar, aVar.getHtmlCssFixer().a(this.f48280k));
                    C0425a c0425a = new C0425a(aVar, null);
                    this.f48278i = 1;
                    obj = TimeoutKt.m5138withTimeoutOrNullKLykuaI(this.f48281l, c0425a, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } catch (Exception e10) {
                    MolocoLogger.error$default(MolocoLogger.INSTANCE, "StaticWebView", "loadHtml", e10, false, 8, null);
                    return new w.a(h.f47696c);
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                a0.throwOnFailure(obj);
            }
            if (obj == null) {
                aVar.f48274f.c();
            }
            boolean zBooleanValue = aVar.f48274f.n().getValue().booleanValue();
            h value = aVar.f48274f.m().getValue();
            return value != null ? new w.a(value) : zBooleanValue ? new w.b(x0.f87415a) : new w.a(h.f47695b);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ a(Context context, CoroutineScope coroutineScope, c0 c0Var, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.p pVar, boolean z10, b bVar, int i10, u uVar) {
        CoroutineScope coroutineScopeO = (i10 & 2) != 0 ? com.google.android.gms.internal.play_billing.a.o() : coroutineScope;
        this(context, coroutineScopeO, c0Var, pVar, (i10 & 16) != 0 ? false : z10, (i10 & 32) != 0 ? new b(coroutineScopeO, c0Var, pVar) : bVar);
    }

    public final StateFlow<Boolean> c() {
        return this.f48277i;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.v, android.webkit.WebView
    public void destroy() {
        super.destroy();
        CoroutineScopeKt.cancel$default(this.f48272c, null, 1, null);
    }

    public final SharedFlow<x0> getClickthroughEvent() {
        return this.f48276h;
    }

    public final StateFlow<h> getUnrecoverableError() {
        return this.f48275g;
    }

    @Override // android.webkit.WebView, android.view.View
    public boolean onTouchEvent(MotionEvent event) {
        kotlin.jvm.internal.e0.checkNotNullParameter(event, "event");
        if (this.f48273e) {
            return false;
        }
        if (event.getAction() == 0) {
            int[] iArr = new int[2];
            getLocationOnScreen(iArr);
            this.f48274f.a(new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.model.a(k0.first(iArr), k0.last(iArr), getHeight(), getWidth(), (int) (event.getX() + k0.first(iArr)), (int) (event.getY() + k0.last(iArr))));
        }
        return super.onTouchEvent(event);
    }

    public final Object a(String str, long j10, d<? super w> dVar) {
        return BuildersKt.withContext(c.a().getMain(), new C0424a(str, j10, null), dVar);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.o
    public void a(a.c button) {
        kotlin.jvm.internal.e0.checkNotNullParameter(button, "button");
        this.f48274f.a(button);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.o
    public void a(a.c.EnumC0490a buttonType) {
        kotlin.jvm.internal.e0.checkNotNullParameter(buttonType, "buttonType");
        this.f48274f.a(buttonType);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Context context, CoroutineScope scope, c0 clickthroughService, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.p buttonTracker, boolean z10, b webViewClientImpl) {
        super(context);
        kotlin.jvm.internal.e0.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.e0.checkNotNullParameter(scope, "scope");
        kotlin.jvm.internal.e0.checkNotNullParameter(clickthroughService, "clickthroughService");
        kotlin.jvm.internal.e0.checkNotNullParameter(buttonTracker, "buttonTracker");
        kotlin.jvm.internal.e0.checkNotNullParameter(webViewClientImpl, "webViewClientImpl");
        this.f48272c = scope;
        this.f48273e = z10;
        this.f48274f = webViewClientImpl;
        setWebViewClient(webViewClientImpl);
        setScrollBarStyle(0);
        setHorizontalScrollBarEnabled(false);
        setVerticalScrollBarEnabled(false);
        WebSettings settings = getSettings();
        settings.setSupportZoom(false);
        settings.setJavaScriptEnabled(true);
        settings.setDomStorageEnabled(true);
        settings.setAllowFileAccess(false);
        settings.setAllowContentAccess(false);
        setBackgroundColor(0);
        setVisibility(8);
        this.f48275g = webViewClientImpl.m();
        this.f48276h = webViewClientImpl.f();
        this.f48277i = webViewClientImpl.p();
    }
}
