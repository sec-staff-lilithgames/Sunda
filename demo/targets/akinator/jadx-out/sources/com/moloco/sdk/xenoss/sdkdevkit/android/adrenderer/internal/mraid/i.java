package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid;

import android.content.Context;
import android.graphics.Rect;
import android.webkit.WebView;
import com.moloco.sdk.internal.w;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.p;
import kotlin.jvm.internal.e0;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONObject;
import tu.a0;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class i implements h {

    /* renamed from: b, reason: collision with root package name */
    public final boolean f48057b;

    /* renamed from: c, reason: collision with root package name */
    public final CoroutineScope f48058c;

    /* renamed from: e, reason: collision with root package name */
    public final MutableSharedFlow f48059e;

    /* renamed from: f, reason: collision with root package name */
    public final MutableSharedFlow f48060f;

    /* renamed from: g, reason: collision with root package name */
    public final y f48061g;

    /* renamed from: h, reason: collision with root package name */
    public final y f48062h;

    /* renamed from: i, reason: collision with root package name */
    public final StateFlow f48063i;

    /* renamed from: j, reason: collision with root package name */
    public final StateFlow f48064j;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a implements q {
        public a() {
        }

        @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.q
        public boolean a(String fromUrl) {
            e0.checkNotNullParameter(fromUrl, "fromUrl");
            return i.this.b(fromUrl);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b extends bv.n implements kv.p {

        /* renamed from: i, reason: collision with root package name */
        public p f48066i;

        /* renamed from: j, reason: collision with root package name */
        public int f48067j;

        /* renamed from: k, reason: collision with root package name */
        public final /* synthetic */ com.moloco.sdk.internal.w f48068k;

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ i f48069l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(com.moloco.sdk.internal.w wVar, i iVar, zu.d<? super b> dVar) {
            super(2, dVar);
            this.f48068k = wVar;
            this.f48069l = iVar;
        }

        @Override // kv.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, zu.d<? super x0> dVar) {
            return ((b) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
        }

        @Override // bv.a
        public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
            return new b(this.f48068k, this.f48069l, dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            p pVar;
            Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
            int i10 = this.f48067j;
            i iVar = this.f48069l;
            if (i10 == 0) {
                a0.throwOnFailure(obj);
                p pVar2 = (p) ((w.b) this.f48068k).a();
                MutableSharedFlow mutableSharedFlow = iVar.f48059e;
                this.f48066i = pVar2;
                this.f48067j = 1;
                if (mutableSharedFlow.emit(pVar2, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                pVar = pVar2;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                pVar = this.f48066i;
                a0.throwOnFailure(obj);
            }
            iVar.a(pVar);
            return x0.f87415a;
        }
    }

    public i(Context context, CoroutineScope scope, boolean z10) {
        e0.checkNotNullParameter(context, "context");
        e0.checkNotNullParameter(scope, "scope");
        this.f48057b = z10;
        this.f48058c = CoroutineScopeKt.plus(scope, com.moloco.sdk.internal.scheduling.c.a().getMain());
        MutableSharedFlow mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.f48059e = mutableSharedFlowMutableSharedFlow$default;
        this.f48060f = mutableSharedFlowMutableSharedFlow$default;
        y yVar = new y(context, new a());
        this.f48061g = yVar;
        this.f48062h = yVar;
        this.f48063i = yVar.c();
        this.f48064j = yVar.getUnrecoverableError();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.h
    public StateFlow<Boolean> I() {
        return this.f48063i;
    }

    public final boolean b(String str) {
        com.moloco.sdk.internal.w wVarA = p.f48097b.a(str);
        if (wVarA instanceof w.b) {
            BuildersKt__Builders_commonKt.launch$default(this.f48058c, null, null, new b(wVarA, this, null), 3, null);
            return true;
        }
        if (wVarA instanceof w.a) {
            return ((p.b.a) ((w.a) wVarA).a()).b();
        }
        throw new tu.t();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.h
    public WebView c() {
        return this.f48062h;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.h, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.q
    public void destroy() {
        this.f48061g.destroy();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.h
    public void j() {
        c("mraidbridge.notifyReadyEvent()");
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.h
    public SharedFlow<p> w() {
        return this.f48060f;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.h
    public StateFlow<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d> x() {
        return this.f48064j;
    }

    public final void c(String str) {
        this.f48061g.loadUrl("javascript:" + str);
    }

    public final void a(p pVar) {
        c("mraidbridge.nativeCallComplete(" + JSONObject.quote(pVar.a()) + ')');
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.h
    public void a(p command, String msg) {
        e0.checkNotNullParameter(command, "command");
        e0.checkNotNullParameter(msg, "msg");
        c("mraidbridge.notifyErrorEvent(" + JSONObject.quote(command.a()) + ", " + JSONObject.quote(msg) + ')');
    }

    public final String b(Rect rect) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(rect.width());
        sb2.append(AbstractJsonLexerKt.COMMA);
        sb2.append(rect.height());
        return sb2.toString();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.h
    public void a(boolean z10) {
        c("mraidbridge.setIsViewable(" + z10 + ')');
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.h
    public void a(u placementType) {
        e0.checkNotNullParameter(placementType, "placementType");
        c("mraidbridge.setPlacementType(" + JSONObject.quote(placementType.c()) + ')');
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.h
    public void a(w state) {
        e0.checkNotNullParameter(state, "state");
        c("mraidbridge.setState(" + JSONObject.quote(state.c()) + ')');
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.h
    public void a(boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        c("mraidbridge.setSupports(" + z10 + AbstractJsonLexerKt.COMMA + z11 + AbstractJsonLexerKt.COMMA + z12 + AbstractJsonLexerKt.COMMA + z13 + AbstractJsonLexerKt.COMMA + z14 + ')');
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.h
    public void a(v screenMetrics) {
        e0.checkNotNullParameter(screenMetrics, "screenMetrics");
        c("\n                mraidbridge.setScreenSize(" + b(screenMetrics.g()) + ");\n                mraidbridge.setMaxSize(" + b(screenMetrics.f()) + ");\n                mraidbridge.setCurrentPosition(" + a(screenMetrics.b()) + ");\n                mraidbridge.setDefaultPosition(" + a(screenMetrics.d()) + ")\n            ");
        StringBuilder sb2 = new StringBuilder("mraidbridge.notifySizeChangeEvent(");
        sb2.append(b(screenMetrics.b()));
        sb2.append(')');
        c(sb2.toString());
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

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.h
    public Object a(String str, zu.d<? super com.moloco.sdk.internal.w> dVar) {
        return this.f48061g.a(str, this.f48057b, dVar);
    }
}
