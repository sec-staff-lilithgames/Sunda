package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.loader;

import av.e;
import bv.n;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.internal.w;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.h;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.i;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import kv.p;
import tu.a0;
import tu.t;
import tu.x0;
import zu.d;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class a implements i {

    /* renamed from: b, reason: collision with root package name */
    public final String f48326b;

    /* renamed from: c, reason: collision with root package name */
    public final CoroutineScope f48327c;

    /* renamed from: e, reason: collision with root package name */
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.b f48328e;

    /* renamed from: f, reason: collision with root package name */
    public final MutableStateFlow f48329f;

    /* renamed from: g, reason: collision with root package name */
    public final MutableStateFlow f48330g;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.loader.a$a, reason: collision with other inner class name */
    public static final class C0430a {
        public /* synthetic */ C0430a(u uVar) {
            this();
        }

        public C0430a() {
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b extends n implements p {

        /* renamed from: i, reason: collision with root package name */
        public int f48331i;

        /* renamed from: k, reason: collision with root package name */
        public final /* synthetic */ long f48333k;

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ h f48334l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(long j10, h hVar, d<? super b> dVar) {
            super(2, dVar);
            this.f48333k = j10;
            this.f48334l = hVar;
        }

        @Override // kv.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, d<? super x0> dVar) {
            return ((b) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
        }

        @Override // bv.a
        public final d<x0> create(Object obj, d<?> dVar) {
            return a.this.new b(this.f48333k, this.f48334l, dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = e.getCOROUTINE_SUSPENDED();
            int i10 = this.f48331i;
            a aVar = a.this;
            if (i10 == 0) {
                a0.throwOnFailure(obj);
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.b bVarA = aVar.a();
                String str = aVar.f48326b;
                this.f48331i = 1;
                obj = bVarA.a(str, this.f48333k, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                a0.throwOnFailure(obj);
            }
            w wVar = (w) obj;
            boolean z10 = wVar instanceof w.b;
            h hVar = this.f48334l;
            if (z10) {
                MolocoLogger.info$default(MolocoLogger.INSTANCE, "WebViewAdLoad", "WebViewAdLoad: load success", null, false, 12, null);
                aVar.f48329f.setValue(bv.b.boxBoolean(true));
                if (hVar != null) {
                    hVar.a();
                }
            } else {
                if (!(wVar instanceof w.a)) {
                    throw new t();
                }
                MolocoLogger.info$default(MolocoLogger.INSTANCE, "WebViewAdLoad", "WebViewAdLoad: load failure", null, false, 12, null);
                aVar.f48329f.setValue(bv.b.boxBoolean(false));
                if (hVar != null) {
                    hVar.a((c) ((w.a) wVar).a());
                }
            }
            return x0.f87415a;
        }
    }

    static {
        new C0430a(null);
    }

    public a(String adm, CoroutineScope scope, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.b webView) {
        e0.checkNotNullParameter(adm, "adm");
        e0.checkNotNullParameter(scope, "scope");
        e0.checkNotNullParameter(webView, "webView");
        this.f48326b = adm;
        this.f48327c = scope;
        this.f48328e = webView;
        MutableStateFlow MutableStateFlow = StateFlowKt.MutableStateFlow(Boolean.FALSE);
        this.f48329f = MutableStateFlow;
        this.f48330g = MutableStateFlow;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.i
    public StateFlow<Boolean> isLoaded() {
        return this.f48330g;
    }

    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.b a() {
        return this.f48328e;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.i
    public void a(long j10, h hVar) {
        BuildersKt__Builders_commonKt.launch$default(this.f48327c, null, null, new b(j10, hVar, null), 3, null);
    }
}
