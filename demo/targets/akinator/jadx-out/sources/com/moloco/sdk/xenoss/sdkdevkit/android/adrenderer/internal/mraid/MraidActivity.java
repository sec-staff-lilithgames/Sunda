package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.WebView;
import androidx.activity.ComponentActivity;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.service_locator.a;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.j0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.p;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.b;
import com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a;
import kotlin.reflect.KFunction;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlow;
import p0.d0;
import tu.a0;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class MraidActivity extends ComponentActivity {

    /* renamed from: i, reason: collision with root package name */
    public static final a f48006i = new a(null);

    /* renamed from: j, reason: collision with root package name */
    public static final MutableSharedFlow f48007j = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);

    /* renamed from: c, reason: collision with root package name */
    public final CoroutineScope f48008c = com.google.android.gms.internal.play_billing.a.o();

    /* renamed from: e, reason: collision with root package name */
    public final tu.o f48009e = tu.q.lazy(new com.moloco.sdk.service_locator.b(5));

    /* renamed from: f, reason: collision with root package name */
    public com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.a f48010f;

    /* renamed from: g, reason: collision with root package name */
    public l f48011g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f48012h;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.u uVar) {
            this();
        }

        public a() {
        }

        public final boolean b(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.b bVar) {
            return bVar instanceof b.f;
        }

        public final boolean a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.d adData, l controller, Context context, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.l options, e0 e0Var, kv.a aVar, kv.a aVar2) {
            kotlin.jvm.internal.e0.checkNotNullParameter(adData, "adData");
            kotlin.jvm.internal.e0.checkNotNullParameter(controller, "controller");
            kotlin.jvm.internal.e0.checkNotNullParameter(context, "context");
            kotlin.jvm.internal.e0.checkNotNullParameter(options, "options");
            if (!a(controller)) {
                return false;
            }
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.c cVar = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.c.f48023a;
            cVar.a(adData);
            cVar.a(e0Var);
            cVar.a(options.a());
            cVar.a(options.c());
            cVar.a(aVar);
            cVar.a(controller);
            cVar.b(aVar2);
            Intent intent = new Intent(context, (Class<?>) MraidActivity.class);
            j0.a(intent, options.b());
            j0.b(intent, options.d());
            intent.setFlags(268435456);
            context.startActivity(intent);
            return true;
        }

        public final boolean a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.b bVar) {
            return kotlin.jvm.internal.e0.areEqual(bVar, b.e.f49467a);
        }

        public final boolean a(l lVar) {
            WebView webViewC;
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.c cVar = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.c.f48023a;
            l lVarH = cVar.h();
            if (lVarH != null && !kotlin.jvm.internal.e0.areEqual(lVarH, lVar)) {
                return false;
            }
            cVar.a((l) null);
            ViewParent parent = (lVarH == null || (webViewC = lVarH.c()) == null) ? null : webViewC.getParent();
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup != null) {
                viewGroup.removeView(lVarH.c());
            }
            cVar.a((kv.w) null);
            cVar.a((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.d) null);
            cVar.a((e0) null);
            Activity activityG = cVar.g();
            if (activityG != null) {
                activityG.finish();
            }
            cVar.a((Activity) null);
            return true;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b extends bv.n implements kv.p {

        /* renamed from: i, reason: collision with root package name */
        public int f48013i;

        /* renamed from: j, reason: collision with root package name */
        public /* synthetic */ Object f48014j;

        public b(zu.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // kv.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.b bVar, zu.d<? super x0> dVar) {
            return ((b) create(bVar, dVar)).invokeSuspend(x0.f87415a);
        }

        @Override // bv.a
        public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
            b bVar = MraidActivity.this.new b(dVar);
            bVar.f48014j = obj;
            return bVar;
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.b bVar;
            Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
            int i10 = this.f48013i;
            if (i10 == 0) {
                a0.throwOnFailure(obj);
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.b bVar2 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.b) this.f48014j;
                MutableSharedFlow mutableSharedFlow = MraidActivity.f48007j;
                this.f48014j = bVar2;
                this.f48013i = 1;
                if (mutableSharedFlow.emit(bVar2, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                bVar = bVar2;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.b) this.f48014j;
                a0.throwOnFailure(obj);
            }
            a aVar = MraidActivity.f48006i;
            boolean zB = aVar.b(bVar);
            MraidActivity mraidActivity = MraidActivity.this;
            if (zB) {
                mraidActivity.finish();
            } else if (aVar.a(bVar)) {
                mraidActivity.f48012h = true;
                mraidActivity.finish();
            }
            return x0.f87415a;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public /* synthetic */ class d extends kotlin.jvm.internal.a implements kv.p {
        public d(Object obj) {
            super(2, obj, MraidActivity.class, "setOrientation", "setOrientation(Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/mraid/MraidJsCommand$SetOrientationProperties;)V", 4);
        }

        @Override // kv.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(p.f fVar, zu.d<? super x0> dVar) {
            return MraidActivity.b((MraidActivity) this.receiver, fVar, dVar);
        }
    }

    public static final com.moloco.sdk.xenoss.sdkdevkit.android.core.services.b b() {
        return a.k.f47476a.b();
    }

    public final com.moloco.sdk.xenoss.sdkdevkit.android.core.services.b c() {
        return (com.moloco.sdk.xenoss.sdkdevkit.android.core.services.b) this.f48009e.getValue();
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.a aVar;
        MraidActivity mraidActivity = this;
        super.onCreate(bundle);
        com.moloco.sdk.internal.android_context.b.a(mraidActivity.getApplicationContext());
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.c cVar = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.c.f48023a;
        cVar.a(mraidActivity);
        kv.p pVarB = cVar.b();
        kv.w wVarC = cVar.c();
        if (wVarC == null) {
            MolocoLogger.error$default(MolocoLogger.INSTANCE, "MraidActivity", "can't display ad: MraidRenderer is missing", null, false, 12, null);
            mraidActivity.finish();
            return;
        }
        l lVarH = cVar.h();
        if (lVarH == null) {
            MolocoLogger.error$default(MolocoLogger.INSTANCE, "MraidActivity", "can't display ad: mraid controller is missing", null, false, 12, null);
            mraidActivity.finish();
            return;
        }
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.d dVarA = cVar.a();
        if (dVarA != null) {
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.e0 e0VarF = a.h.f47463a.f();
            Intent intent = mraidActivity.getIntent();
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(intent, "getIntent(...)");
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.a aVarA = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i.a(dVarA, e0VarF, mraidActivity, lVarH, j0.d(intent), mraidActivity.c());
            mraidActivity = mraidActivity;
            aVar = aVarA;
        } else {
            aVar = null;
        }
        if (aVar == null) {
            MolocoLogger.error$default(MolocoLogger.INSTANCE, "MraidActivity", "can't display ad: mraid ad data is missing", null, false, 12, null);
            mraidActivity.finish();
            return;
        }
        mraidActivity.a(lVarH.e());
        FlowKt.launchIn(FlowKt.onEach(aVar.a(), mraidActivity.new b(null)), mraidActivity.f48008c);
        g.d.setContent$default(mraidActivity, null, z0.u.composableLambdaInstance(-1048815572, true, mraidActivity.new c(aVar, lVarH, wVarC, pVarB)), 1, null);
        aVar.d();
        mraidActivity.f48010f = aVar;
        mraidActivity.f48011g = lVarH;
    }

    @Override // android.app.Activity
    public void onDestroy() {
        kv.a aVarE;
        super.onDestroy();
        if (!this.f48012h && (aVarE = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.c.f48023a.e()) != null) {
            aVarE.invoke();
        }
        kv.a aVarD = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.c.f48023a.d();
        if (aVarD != null) {
            aVarD.invoke();
        }
        f48006i.a(this.f48011g);
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.a aVar = this.f48010f;
        if (aVar != null) {
            aVar.destroy();
        }
        this.f48010f = null;
        CoroutineScopeKt.cancel$default(this.f48008c, null, 1, null);
    }

    public static final /* synthetic */ Object b(MraidActivity mraidActivity, p.f fVar, zu.d dVar) {
        mraidActivity.a(fVar);
        return x0.f87415a;
    }

    public final void a(StateFlow<p.f> stateFlow) {
        a(stateFlow.getValue());
        FlowKt.launchIn(FlowKt.onEach(stateFlow, new d(this)), this.f48008c);
    }

    public final void a(p.f fVar) {
        r rVarC;
        Integer numA;
        if (fVar == null || (rVarC = fVar.c()) == null || (numA = a(rVarC)) == null) {
            return;
        }
        setRequestedOrientation(numA.intValue());
    }

    public final Integer a(r rVar) {
        int i10 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.a.f48021a[rVar.ordinal()];
        if (i10 == 1) {
            return 1;
        }
        if (i10 == 2) {
            return 0;
        }
        if (i10 == 3) {
            return null;
        }
        throw new tu.t();
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class c implements kv.p {

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.a f48017c;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ l f48018e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ kv.w f48019f;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ kv.p f48020g;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public /* synthetic */ class a extends kotlin.jvm.internal.a0 implements kv.a {
            public a(Object obj) {
                super(0, obj, l.class, "onSkipOrClose", "onSkipOrClose()V", 0);
            }

            public final void a() {
                ((l) this.receiver).D();
            }

            @Override // kv.a
            public /* bridge */ /* synthetic */ Object invoke() {
                a();
                return x0.f87415a;
            }
        }

        public c(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.a aVar, l lVar, kv.w wVar, kv.p pVar) {
            this.f48017c = aVar;
            this.f48018e = lVar;
            this.f48019f = wVar;
            this.f48020g = pVar;
        }

        public final void a(p0.w wVar, int i10) {
            if ((i10 & 3) == 2 && wVar.getSkipping()) {
                wVar.skipToGroupEnd();
                return;
            }
            if (d0.isTraceInProgress()) {
                d0.traceEventStart(-1048815572, i10, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.MraidActivity.onCreate.<anonymous> (MraidActivity.kt:126)");
            }
            l lVar = this.f48018e;
            WebView webViewC = lVar.c();
            Intent intent = MraidActivity.this.getIntent();
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(intent, "getIntent(...)");
            int iC = j0.c(intent);
            wVar.startReplaceableGroup(-674125612);
            Object objRememberedValue = wVar.rememberedValue();
            p0.v vVar = p0.v.f80515a;
            if (objRememberedValue == vVar.getEmpty()) {
                objRememberedValue = new a1.o(13);
                wVar.updateRememberedValue(objRememberedValue);
            }
            kv.l lVar2 = (kv.l) objRememberedValue;
            wVar.endReplaceableGroup();
            wVar.startReplaceableGroup(-674123563);
            boolean zChanged = wVar.changed(lVar);
            Object objRememberedValue2 = wVar.rememberedValue();
            if (zChanged || objRememberedValue2 == vVar.getEmpty()) {
                objRememberedValue2 = new a(lVar);
                wVar.updateRememberedValue(objRememberedValue2);
            }
            wVar.endReplaceableGroup();
            e0 e0VarF = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.c.f48023a.f();
            kv.b bVar = (kv.b) this.f48020g.invoke(wVar, 0);
            kv.b bVarA = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.i.a(null, null, 0L, 0L, 0L, null, null, null, wVar, 0, 255);
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview.i.a(MraidActivity.this, this.f48017c, webViewC, iC, lVar2, (kv.a) ((KFunction) objRememberedValue2), this.f48019f, e0VarF, bVar, bVarA, wVar, 24576);
            if (d0.isTraceInProgress()) {
                d0.traceEventEnd();
            }
        }

        @Override // kv.p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((p0.w) obj, ((Number) obj2).intValue());
            return x0.f87415a;
        }

        public static final x0 a(a.c it) {
            kotlin.jvm.internal.e0.checkNotNullParameter(it, "it");
            return x0.f87415a;
        }
    }
}
