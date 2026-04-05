package com.moloco.sdk.internal.publisher.nativead.ui;

import a2.h2;
import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.j;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.m;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.o;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.x;
import e1.v;
import j1.m0;
import kotlin.jvm.internal.u;
import kv.p;
import kv.q;
import p0.d0;
import p0.w;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class e extends FrameLayout {

    /* renamed from: b, reason: collision with root package name */
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.a f46628b;

    /* renamed from: c, reason: collision with root package name */
    public final com.moloco.sdk.internal.a f46629c;

    /* renamed from: e, reason: collision with root package name */
    public h2 f46630e;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public /* synthetic */ a(u uVar) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b implements q {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ e0 f46631b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e f46632c;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ kv.a f46633e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ j f46634f;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class a implements p {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e f46635b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ kv.a f46636c;

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ v f46637e;

            /* renamed from: f, reason: collision with root package name */
            public final /* synthetic */ j f46638f;

            public a(e eVar, kv.a aVar, v vVar, j jVar) {
                this.f46635b = eVar;
                this.f46636c = aVar;
                this.f46637e = vVar;
                this.f46638f = jVar;
            }

            public final void a(w wVar, int i10) {
                if ((i10 & 3) == 2 && wVar.getSkipping()) {
                    wVar.skipToGroupEnd();
                    return;
                }
                if (d0.isTraceInProgress()) {
                    d0.traceEventStart(1035844210, i10, -1, "com.moloco.sdk.internal.publisher.nativead.ui.NativeAdVideoContainer.videoView.<anonymous>.<anonymous> (NativeAdVideoContainer.kt:57)");
                }
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.a aVar = this.f46635b.f46628b;
                long jM4825getBlack0d7_KjU = m0.f68918b.m4825getBlack0d7_KjU();
                kv.a aVar2 = this.f46636c;
                m mVar = new m(aVar2, aVar2, aVar2);
                x.a(aVar, this.f46637e, jM4825getBlack0d7_KjU, f.a(wVar, 0), null, null, null, mVar, null, null, o.a(g.a(), wVar, 6, 0), this.f46638f, wVar, 102457728, 0, 512);
                if (d0.isTraceInProgress()) {
                    d0.traceEventEnd();
                }
            }

            @Override // kv.p
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                a((w) obj, ((Number) obj2).intValue());
                return x0.f87415a;
            }
        }

        public b(e0 e0Var, e eVar, kv.a aVar, j jVar) {
            this.f46631b = e0Var;
            this.f46632c = eVar;
            this.f46633e = aVar;
            this.f46634f = jVar;
        }

        public final void a(v modifier, w wVar, int i10) {
            kotlin.jvm.internal.e0.checkNotNullParameter(modifier, "modifier");
            if ((i10 & 6) == 0) {
                i10 |= wVar.changed(modifier) ? 4 : 2;
            }
            if ((i10 & 19) == 18 && wVar.getSkipping()) {
                wVar.skipToGroupEnd();
                return;
            }
            if (d0.isTraceInProgress()) {
                d0.traceEventStart(1867022133, i10, -1, "com.moloco.sdk.internal.publisher.nativead.ui.NativeAdVideoContainer.videoView.<anonymous> (NativeAdVideoContainer.kt:56)");
            }
            this.f46631b.a(z0.u.composableLambda(wVar, 1035844210, true, new a(this.f46632c, this.f46633e, modifier, this.f46634f)), wVar, 6);
            if (d0.isTraceInProgress()) {
                d0.traceEventEnd();
            }
        }

        @Override // kv.q
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            a((v) obj, (w) obj2, ((Number) obj3).intValue());
            return x0.f87415a;
        }
    }

    static {
        new a(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(Context context, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.a vastAdController, j viewVisibilityTracker, com.moloco.sdk.internal.a viewLifecycleOwner, e0 watermark, kv.a aVar) {
        super(context);
        kotlin.jvm.internal.e0.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.e0.checkNotNullParameter(vastAdController, "vastAdController");
        kotlin.jvm.internal.e0.checkNotNullParameter(viewVisibilityTracker, "viewVisibilityTracker");
        kotlin.jvm.internal.e0.checkNotNullParameter(viewLifecycleOwner, "viewLifecycleOwner");
        kotlin.jvm.internal.e0.checkNotNullParameter(watermark, "watermark");
        this.f46628b = vastAdController;
        this.f46629c = viewLifecycleOwner;
        h2 h2VarA = com.moloco.sdk.internal.publisher.nativead.ui.b.a(context, z0.u.composableLambdaInstance(1867022133, true, new b(watermark, this, aVar, viewVisibilityTracker)));
        addView(h2VarA, new ViewGroup.LayoutParams(-1, -1));
        this.f46630e = h2VarA;
    }

    public final void b() {
        removeAllViews();
        h2 h2Var = this.f46630e;
        if (h2Var != null) {
            h2Var.disposeComposition();
        }
        this.f46630e = null;
    }

    public final h2 getVideoView() {
        return this.f46630e;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        MolocoLogger.info$default(MolocoLogger.INSTANCE, "VideoContainer", "onAttachedToWindow", null, false, 12, null);
        this.f46629c.a(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        MolocoLogger.info$default(MolocoLogger.INSTANCE, "VideoContainer", "onDetachedFromWindow", null, false, 12, null);
        this.f46629c.b(this);
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        com.moloco.sdk.internal.a aVar = this.f46629c;
        if (z10) {
            aVar.d(this);
        } else {
            aVar.c(this);
        }
    }

    public final void setVideoView(h2 h2Var) {
        this.f46630e = h2Var;
    }

    public final void a() {
        this.f46628b.destroy();
        b();
    }

    public static /* synthetic */ void getVideoView$annotations() {
    }
}
