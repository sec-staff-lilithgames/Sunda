package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad;

import android.content.Context;
import av.e;
import bv.n;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.g;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.h;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.y;
import java.util.Set;
import kotlin.jvm.internal.c1;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.q0;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import kv.p;
import kv.q;
import tu.a0;
import tu.o;
import tu.x0;
import zu.d;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class a implements y {

    /* renamed from: b, reason: collision with root package name */
    public final CoroutineScope f48310b;

    /* renamed from: c, reason: collision with root package name */
    public com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.creative.mraid.a f48311c;

    /* renamed from: e, reason: collision with root package name */
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.b f48312e;

    /* renamed from: f, reason: collision with root package name */
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.bridge.b f48313f;

    /* renamed from: g, reason: collision with root package name */
    public final o f48314g;

    /* renamed from: h, reason: collision with root package name */
    public final MutableStateFlow f48315h;

    /* renamed from: i, reason: collision with root package name */
    public final o f48316i;

    /* renamed from: j, reason: collision with root package name */
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.loader.a f48317j;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.a$a, reason: collision with other inner class name */
    public static final class C0428a extends n implements q {

        /* renamed from: i, reason: collision with root package name */
        public /* synthetic */ boolean f48318i;

        /* renamed from: j, reason: collision with root package name */
        public /* synthetic */ boolean f48319j;

        public C0428a(d<? super C0428a> dVar) {
            super(3, dVar);
        }

        public final Object a(boolean z10, boolean z11, d<? super Boolean> dVar) {
            C0428a c0428a = new C0428a(dVar);
            c0428a.f48318i = z10;
            c0428a.f48319j = z11;
            return c0428a.invokeSuspend(x0.f87415a);
        }

        @Override // kv.q
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return a(((Boolean) obj).booleanValue(), ((Boolean) obj2).booleanValue(), (d) obj3);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            e.getCOROUTINE_SUSPENDED();
            a0.throwOnFailure(obj);
            return bv.b.boxBoolean(this.f48318i && this.f48319j);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class c extends n implements p {

        /* renamed from: i, reason: collision with root package name */
        public int f48322i;

        /* renamed from: k, reason: collision with root package name */
        public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.a0 f48324k;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.a$c$a, reason: collision with other inner class name */
        public static final class C0429a extends n implements p {

            /* renamed from: i, reason: collision with root package name */
            public /* synthetic */ Object f48325i;

            public C0429a(d<? super C0429a> dVar) {
                super(2, dVar);
            }

            @Override // kv.p
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.errors.a aVar, d<? super Boolean> dVar) {
                return ((C0429a) create(aVar, dVar)).invokeSuspend(x0.f87415a);
            }

            @Override // bv.a
            public final d<x0> create(Object obj, d<?> dVar) {
                C0429a c0429a = new C0429a(dVar);
                c0429a.f48325i = obj;
                return c0429a;
            }

            @Override // bv.a
            public final Object invokeSuspend(Object obj) {
                e.getCOROUTINE_SUSPENDED();
                a0.throwOnFailure(obj);
                return bv.b.boxBoolean(((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.errors.a) this.f48325i) != null);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.a0 a0Var, d<? super c> dVar) {
            super(2, dVar);
            this.f48324k = a0Var;
        }

        @Override // kv.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, d<? super x0> dVar) {
            return ((c) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
        }

        @Override // bv.a
        public final d<x0> create(Object obj, d<?> dVar) {
            return a.this.new c(this.f48324k, dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = e.getCOROUTINE_SUSPENDED();
            int i10 = this.f48322i;
            if (i10 == 0) {
                a0.throwOnFailure(obj);
                a aVar = a.this;
                aVar.f48315h.setValue(bv.b.boxBoolean(true));
                StateFlow<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.errors.a> unrecoverableError = aVar.q().getUnrecoverableError();
                C0429a c0429a = new C0429a(null);
                this.f48322i = 1;
                obj = FlowKt.first(unrecoverableError, c0429a, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                a0.throwOnFailure(obj);
            }
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.errors.a aVar2 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.errors.a) obj;
            if (aVar2 != null) {
                this.f48324k.a(aVar2);
            }
            return x0.f87415a;
        }
    }

    public a(Context context, String adm, Set<? extends com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.a> eventHandlers, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.b clickthroughEventHandler, h contentLoadedHandler, g playListItemDisplayingEventHandler, com.moloco.sdk.acm.recorder.c metricsRecorder) {
        e0.checkNotNullParameter(context, "context");
        e0.checkNotNullParameter(adm, "adm");
        e0.checkNotNullParameter(eventHandlers, "eventHandlers");
        e0.checkNotNullParameter(clickthroughEventHandler, "clickthroughEventHandler");
        e0.checkNotNullParameter(contentLoadedHandler, "contentLoadedHandler");
        e0.checkNotNullParameter(playListItemDisplayingEventHandler, "playListItemDisplayingEventHandler");
        e0.checkNotNullParameter(metricsRecorder, "metricsRecorder");
        this.f48310b = com.google.android.gms.internal.play_billing.a.o();
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.d dVar = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.d(eventHandlers, metricsRecorder);
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.b bVar = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.b(context, contentLoadedHandler, playListItemDisplayingEventHandler, metricsRecorder, null, 16, null);
        bVar.addJavascriptInterface(new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.a(dVar), "AndroidTemplateBridge");
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.creative.mraid.b bVar2 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.creative.mraid.b(context, bVar, clickthroughEventHandler);
        this.f48311c = bVar2;
        bVar2.b();
        this.f48312e = bVar;
        this.f48313f = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.bridge.b(bVar);
        this.f48314g = tu.q.lazy(new androidx.lifecycle.x0(5, adm, this));
        this.f48315h = StateFlowKt.MutableStateFlow(Boolean.FALSE);
        this.f48316i = tu.q.lazy(new a1.e(this, 15));
        this.f48317j = k();
    }

    public static final StateFlow b(a aVar) {
        return FlowKt.stateIn(FlowKt.flowCombine(aVar.f48315h, aVar.f48312e.a(), new C0428a(null)), aVar.f48310b, SharingStarted.Companion.getEagerly(), Boolean.FALSE);
    }

    public static Object c(a aVar) {
        return c1.property0(new q0(aVar.f48317j, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.loader.a.class, "isLoaded", "isLoaded()Lkotlinx/coroutines/flow/StateFlow;", 0));
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.y, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.q
    public void destroy() {
        this.f48315h.setValue(Boolean.FALSE);
        this.f48311c.remove();
        this.f48312e.destroy();
        CoroutineScopeKt.cancel$default(this.f48310b, null, 1, null);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.y, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.i
    public StateFlow<Boolean> isLoaded() {
        return this.f48317j.isLoaded();
    }

    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.loader.a k() {
        return (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.loader.a) this.f48314g.getValue();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.y, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.g
    public StateFlow<Boolean> m() {
        return (StateFlow) this.f48316i.getValue();
    }

    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.creative.mraid.a o() {
        return this.f48311c;
    }

    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.b q() {
        return this.f48312e;
    }

    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.bridge.a t() {
        return this.f48313f;
    }

    public final StateFlow<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.orientation.b> y() {
        return this.f48312e.getOrientation$moloco_sdk_release();
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b implements com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.h {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.h f48321b;

        public b(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.h hVar) {
            this.f48321b = hVar;
        }

        @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.h
        public void a() {
            a aVar = a.this;
            aVar.q().a(aVar.o());
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.h hVar = this.f48321b;
            if (hVar != null) {
                hVar.a();
            }
        }

        @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.h
        public void a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.a timeoutError) {
            e0.checkNotNullParameter(timeoutError, "timeoutError");
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.h hVar = this.f48321b;
            if (hVar != null) {
                hVar.a(timeoutError);
            }
        }

        @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.h
        public void a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c internalError) {
            e0.checkNotNullParameter(internalError, "internalError");
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.h hVar = this.f48321b;
            if (hVar != null) {
                hVar.a(internalError);
            }
        }
    }

    public final void a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.creative.mraid.a aVar) {
        e0.checkNotNullParameter(aVar, "<set-?>");
        this.f48311c = aVar;
    }

    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.loader.a a(String str, a aVar) {
        return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.loader.a(str, aVar.f48310b, aVar.f48312e);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.y
    public void a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.a0 listener) {
        e0.checkNotNullParameter(listener, "listener");
        BuildersKt__Builders_commonKt.launch$default(this.f48310b, null, null, new c(listener, null), 3, null);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.y, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.i
    public void a(long j10, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.h hVar) {
        k().a(j10, new b(hVar));
    }
}
