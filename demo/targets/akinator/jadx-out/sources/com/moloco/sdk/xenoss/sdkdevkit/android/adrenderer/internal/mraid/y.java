package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid;

import android.content.Context;
import android.webkit.WebSettings;
import android.webkit.WebView;
import androidx.webkit.WebViewClientCompat;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.internal.w;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import tu.a0;
import tu.e0;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class y extends com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.v {

    /* renamed from: c, reason: collision with root package name */
    public final z f48156c;

    /* renamed from: e, reason: collision with root package name */
    public final StateFlow f48157e;

    /* renamed from: f, reason: collision with root package name */
    public final StateFlow f48158f;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.u uVar) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b extends bv.n implements kv.p {

        /* renamed from: i, reason: collision with root package name */
        public int f48159i;

        /* renamed from: j, reason: collision with root package name */
        public final /* synthetic */ boolean f48160j;

        /* renamed from: k, reason: collision with root package name */
        public final /* synthetic */ y f48161k;

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ String f48162l;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class a extends bv.n implements kv.p {

            /* renamed from: i, reason: collision with root package name */
            public int f48163i;

            /* renamed from: j, reason: collision with root package name */
            public final /* synthetic */ boolean f48164j;

            /* renamed from: k, reason: collision with root package name */
            public final /* synthetic */ y f48165k;

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ String f48166l;

            /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
            /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.y$b$a$a, reason: collision with other inner class name */
            public static final class C0414a extends bv.n implements kv.q {

                /* renamed from: i, reason: collision with root package name */
                public /* synthetic */ boolean f48167i;

                /* renamed from: j, reason: collision with root package name */
                public /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d f48168j;

                public C0414a(zu.d<? super C0414a> dVar) {
                    super(3, dVar);
                }

                public final Object a(boolean z10, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d dVar, zu.d<? super tu.v> dVar2) {
                    C0414a c0414a = new C0414a(dVar2);
                    c0414a.f48167i = z10;
                    c0414a.f48168j = dVar;
                    return c0414a.invokeSuspend(x0.f87415a);
                }

                @Override // kv.q
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                    return a(((Boolean) obj).booleanValue(), (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d) obj2, (zu.d) obj3);
                }

                @Override // bv.a
                public final Object invokeSuspend(Object obj) {
                    av.e.getCOROUTINE_SUSPENDED();
                    a0.throwOnFailure(obj);
                    boolean z10 = this.f48167i;
                    return e0.to(bv.b.boxBoolean(z10), this.f48168j);
                }
            }

            /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
            /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.y$b$a$b, reason: collision with other inner class name */
            public static final class C0415b extends bv.n implements kv.p {

                /* renamed from: i, reason: collision with root package name */
                public /* synthetic */ Object f48169i;

                public C0415b(zu.d<? super C0415b> dVar) {
                    super(2, dVar);
                }

                @Override // kv.p
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object invoke(tu.v vVar, zu.d<? super Boolean> dVar) {
                    return ((C0415b) create(vVar, dVar)).invokeSuspend(x0.f87415a);
                }

                @Override // bv.a
                public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
                    C0415b c0415b = new C0415b(dVar);
                    c0415b.f48169i = obj;
                    return c0415b;
                }

                @Override // bv.a
                public final Object invokeSuspend(Object obj) {
                    av.e.getCOROUTINE_SUSPENDED();
                    a0.throwOnFailure(obj);
                    tu.v vVar = (tu.v) this.f48169i;
                    return bv.b.boxBoolean(((Boolean) vVar.component1()).booleanValue() || ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d) vVar.component2()) != null);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(boolean z10, y yVar, String str, zu.d<? super a> dVar) {
                super(2, dVar);
                this.f48164j = z10;
                this.f48165k = yVar;
                this.f48166l = str;
            }

            @Override // kv.p
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(CoroutineScope coroutineScope, zu.d<? super com.moloco.sdk.internal.w> dVar) {
                return ((a) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
            }

            @Override // bv.a
            public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
                return new a(this.f48164j, this.f48165k, this.f48166l, dVar);
            }

            @Override // bv.a
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
                int i10 = this.f48163i;
                if (i10 == 0) {
                    a0.throwOnFailure(obj);
                    try {
                        boolean z10 = this.f48164j;
                        String str = this.f48166l;
                        y yVar = this.f48165k;
                        if (z10) {
                            Context context = yVar.getContext();
                            kotlin.jvm.internal.e0.checkNotNullExpressionValue(context, "getContext(...)");
                            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.w.a(yVar, new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview.p(new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview.j(context), new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview.l(), null, 4, null).a(str));
                        } else {
                            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.w.a(yVar, str);
                        }
                        Flow flowFlowCombine = FlowKt.flowCombine(yVar.f48156c.b(), yVar.f48156c.a(), new C0414a(null));
                        C0415b c0415b = new C0415b(null);
                        this.f48163i = 1;
                        obj = FlowKt.first(flowFlowCombine, c0415b, this);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } catch (Exception e10) {
                        MolocoLogger.error$default(MolocoLogger.INSTANCE, "MraidWebView", e10.toString(), null, false, 12, null);
                        return new w.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d.f47673e);
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    a0.throwOnFailure(obj);
                }
                tu.v vVar = (tu.v) obj;
                boolean zBooleanValue = ((Boolean) vVar.component1()).booleanValue();
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d dVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d) vVar.component2();
                return dVar != null ? new w.a(dVar) : zBooleanValue ? new w.b(new d(null, 1, null)) : new w.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d.f47674f);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(boolean z10, y yVar, String str, zu.d<? super b> dVar) {
            super(2, dVar);
            this.f48160j = z10;
            this.f48161k = yVar;
            this.f48162l = str;
        }

        @Override // kv.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, zu.d<? super com.moloco.sdk.internal.w> dVar) {
            return ((b) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
        }

        @Override // bv.a
        public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
            return new b(this.f48160j, this.f48161k, this.f48162l, dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
            int i10 = this.f48159i;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                a0.throwOnFailure(obj);
                return obj;
            }
            a0.throwOnFailure(obj);
            zu.m main = com.moloco.sdk.internal.scheduling.c.a().getMain();
            a aVar = new a(this.f48160j, this.f48161k, this.f48162l, null);
            this.f48159i = 1;
            Object objWithContext = BuildersKt.withContext(main, aVar, this);
            return objWithContext == coroutine_suspended ? coroutine_suspended : objWithContext;
        }
    }

    static {
        new a(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(Context context, q mraidJsCommandUrlSource) {
        super(context);
        kotlin.jvm.internal.e0.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.e0.checkNotNullParameter(mraidJsCommandUrlSource, "mraidJsCommandUrlSource");
        WebView.setWebContentsDebuggingEnabled(false);
        setScrollBarStyle(0);
        setHorizontalScrollBarEnabled(false);
        setVerticalScrollBarEnabled(false);
        setScrollContainer(false);
        WebSettings settings = getSettings();
        settings.setSupportZoom(false);
        settings.setJavaScriptEnabled(true);
        settings.setDomStorageEnabled(true);
        settings.setAllowFileAccess(false);
        settings.setAllowContentAccess(false);
        settings.setMediaPlaybackRequiresUserGesture(true);
        setVisibility(8);
        z zVar = new z(context, mraidJsCommandUrlSource);
        setWebViewClient(zVar);
        this.f48156c = zVar;
        this.f48157e = zVar.b();
        this.f48158f = zVar.a();
    }

    public final StateFlow<Boolean> c() {
        return this.f48157e;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.v, android.webkit.WebView
    public void destroy() {
        super.destroy();
        setWebViewClient(new WebViewClientCompat());
    }

    public final StateFlow<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d> getUnrecoverableError() {
        return this.f48158f;
    }

    public final Object a(String str, boolean z10, zu.d<? super com.moloco.sdk.internal.w> dVar) {
        return CoroutineScopeKt.coroutineScope(new b(z10, this, str, null), dVar);
    }
}
