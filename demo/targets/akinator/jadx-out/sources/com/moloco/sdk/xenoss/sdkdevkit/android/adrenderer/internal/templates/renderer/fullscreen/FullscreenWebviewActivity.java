package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.fullscreen;

import a1.o;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.b1;
import androidx.lifecycle.k0;
import androidx.lifecycle.o3;
import androidx.lifecycle.r;
import com.moloco.sdk.internal.MolocoLogger;
import f.d0;
import f.h0;
import f.x;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kv.p;
import tu.t;
import tu.x0;
import zu.d;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class FullscreenWebviewActivity extends AppCompatActivity {

    /* renamed from: e, reason: collision with root package name */
    public static final a f48460e = new a(null);

    /* renamed from: f, reason: collision with root package name */
    public static final String f48461f = "FullscreenWebviewActivity";

    /* renamed from: g, reason: collision with root package name */
    public static WeakReference f48462g = new WeakReference(null);

    /* renamed from: h, reason: collision with root package name */
    public static WeakReference f48463h = new WeakReference(null);

    /* renamed from: i, reason: collision with root package name */
    public static MutableStateFlow f48464i;

    /* renamed from: j, reason: collision with root package name */
    public static MutableStateFlow f48465j;

    /* renamed from: c, reason: collision with root package name */
    public x f48466c;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public /* synthetic */ a(u uVar) {
            this();
        }

        public final void a(Context context, MutableStateFlow<Boolean> isAdDisplayingEvent, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.a webviewAd, MutableStateFlow<Boolean> isAdForciblyClosed) {
            e0.checkNotNullParameter(context, "context");
            e0.checkNotNullParameter(isAdDisplayingEvent, "isAdDisplayingEvent");
            e0.checkNotNullParameter(webviewAd, "webviewAd");
            e0.checkNotNullParameter(isAdForciblyClosed, "isAdForciblyClosed");
            a aVar = FullscreenWebviewActivity.f48460e;
            FullscreenWebviewActivity.f48462g = new WeakReference(webviewAd);
            FullscreenWebviewActivity.f48464i = isAdDisplayingEvent;
            FullscreenWebviewActivity.f48465j = isAdForciblyClosed;
            Intent intent = new Intent(context, (Class<?>) FullscreenWebviewActivity.class);
            intent.setFlags(268435456);
            context.startActivity(intent);
        }

        public a() {
        }

        public final void a() {
            FullscreenWebviewActivity.f48462g.clear();
            MutableStateFlow mutableStateFlow = FullscreenWebviewActivity.f48464i;
            if (mutableStateFlow != null) {
                mutableStateFlow.setValue(Boolean.FALSE);
            }
            FullscreenWebviewActivity.f48464i = null;
            FullscreenWebviewActivity fullscreenWebviewActivity = (FullscreenWebviewActivity) FullscreenWebviewActivity.f48463h.get();
            if (fullscreenWebviewActivity != null && !fullscreenWebviewActivity.isFinishing() && !fullscreenWebviewActivity.isDestroyed()) {
                fullscreenWebviewActivity.finish();
            }
            FullscreenWebviewActivity.f48463h.clear();
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public /* synthetic */ class b extends kotlin.jvm.internal.a implements p {
        public b(Object obj) {
            super(2, obj, FullscreenWebviewActivity.class, "setOrientation", "setOrientation(Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/templates/ad/orientation/OrientationSettings;)V", 4);
        }

        @Override // kv.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.orientation.b bVar, d<? super x0> dVar) {
            return FullscreenWebviewActivity.b((FullscreenWebviewActivity) this.receiver, bVar, dVar);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class c implements r {

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.a f48468c;

        public c(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.a aVar) {
            this.f48468c = aVar;
        }

        @Override // androidx.lifecycle.r
        public /* bridge */ /* synthetic */ void onCreate(b1 b1Var) {
            super.onCreate(b1Var);
        }

        @Override // androidx.lifecycle.r
        public /* bridge */ /* synthetic */ void onDestroy(b1 b1Var) {
            super.onDestroy(b1Var);
        }

        @Override // androidx.lifecycle.r
        public void onPause(b1 owner) {
            e0.checkNotNullParameter(owner, "owner");
            super.onPause(owner);
            FullscreenWebviewActivity fullscreenWebviewActivity = FullscreenWebviewActivity.this;
            if (fullscreenWebviewActivity.isFinishing() || fullscreenWebviewActivity.isDestroyed()) {
                return;
            }
            this.f48468c.t().a(false);
        }

        @Override // androidx.lifecycle.r
        public void onResume(b1 owner) {
            e0.checkNotNullParameter(owner, "owner");
            super.onResume(owner);
            this.f48468c.t().a(true);
        }

        @Override // androidx.lifecycle.r
        public /* bridge */ /* synthetic */ void onStart(b1 b1Var) {
            super.onStart(b1Var);
        }

        @Override // androidx.lifecycle.r
        public /* bridge */ /* synthetic */ void onStop(b1 b1Var) {
            super.onStop(b1Var);
        }
    }

    public static /* synthetic */ void a(FullscreenWebviewActivity fullscreenWebviewActivity, StateFlow stateFlow, CoroutineScope coroutineScope, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            coroutineScope = com.google.android.gms.internal.play_billing.a.o();
        }
        fullscreenWebviewActivity.a(stateFlow, coroutineScope);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        d0 onBackPressedDispatcher = getOnBackPressedDispatcher();
        e0.checkNotNullExpressionValue(onBackPressedDispatcher, "<get-onBackPressedDispatcher>(...)");
        this.f48466c = h0.addCallback$default(onBackPressedDispatcher, this, false, new o(15), 2, null);
        f48463h = new WeakReference(this);
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.a aVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.a) f48462g.get();
        if (aVar == null) {
            MolocoLogger.error$default(MolocoLogger.INSTANCE, f48461f, "WebviewAd is null, something went wrong", null, false, 12, null);
            finish();
            return;
        }
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.b bVarQ = aVar.q();
        if (bVarQ.getParent() != null) {
            ViewParent parent = bVarQ.getParent();
            e0.checkNotNull(parent, "null cannot be cast to non-null type android.view.ViewGroup");
            ((ViewGroup) parent).removeView(bVarQ);
        }
        setContentView(bVarQ);
        MutableStateFlow mutableStateFlow = f48464i;
        if (mutableStateFlow != null) {
            mutableStateFlow.setValue(Boolean.TRUE);
        }
        a(aVar);
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.o.a(this);
        a(this, aVar.y(), null, 2, null);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        MutableStateFlow mutableStateFlow = f48465j;
        if (mutableStateFlow != null) {
            mutableStateFlow.setValue(Boolean.TRUE);
        }
        f48465j = null;
        x xVar = this.f48466c;
        if (xVar != null && xVar.isEnabled()) {
            xVar.remove();
        }
        f48460e.a();
    }

    public static final /* synthetic */ Object b(FullscreenWebviewActivity fullscreenWebviewActivity, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.orientation.b bVar, d dVar) {
        fullscreenWebviewActivity.a(bVar);
        return x0.f87415a;
    }

    public final void a(StateFlow<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.orientation.b> stateFlow, CoroutineScope coroutineScope) {
        a(stateFlow.getValue());
        FlowKt.launchIn(FlowKt.onEach(stateFlow, new b(this)), coroutineScope);
    }

    public final void a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.orientation.b bVar) {
        if (bVar.d() == com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.orientation.a.f48337e) {
            MolocoLogger.debug$default(MolocoLogger.INSTANCE, f48461f, "Orientation is none, not setting requested orientation", false, 4, null);
            return;
        }
        Integer numA = a(bVar.d());
        if (numA != null) {
            setRequestedOrientation(numA.intValue());
        }
    }

    public final Integer a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.orientation.a aVar) {
        int i10 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.fullscreen.a.f48469a[aVar.ordinal()];
        if (i10 == 1) {
            return 1;
        }
        if (i10 == 2) {
            return 0;
        }
        if (i10 == 3) {
            return null;
        }
        throw new t();
    }

    public static final x0 a(x addCallback) {
        e0.checkNotNullParameter(addCallback, "$this$addCallback");
        MolocoLogger.debug$default(MolocoLogger.INSTANCE, f48461f, "Back press detected, but disabled", false, 4, null);
        return x0.f87415a;
    }

    public final void a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.a aVar) {
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.b bVarQ = aVar.q();
        aVar.t().a();
        b1 b1Var = o3.get(bVarQ);
        k0 lifecycle = b1Var != null ? b1Var.getLifecycle() : null;
        if (lifecycle != null) {
            lifecycle.addObserver(new c(aVar));
        }
    }
}
