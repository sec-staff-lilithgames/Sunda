package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad;

import android.content.Context;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.e0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.n;
import com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a;
import java.util.List;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import kv.p;
import tu.a0;
import tu.x0;
import uu.y0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public abstract class i {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a extends bv.n implements p {

        /* renamed from: i, reason: collision with root package name */
        public int f49515i;

        /* renamed from: j, reason: collision with root package name */
        public final /* synthetic */ Flow f49516j;

        /* renamed from: k, reason: collision with root package name */
        public final /* synthetic */ MutableStateFlow f49517k;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i$a$a, reason: collision with other inner class name */
        public static final class C0463a extends bv.n implements p {

            /* renamed from: i, reason: collision with root package name */
            public int f49518i;

            /* renamed from: j, reason: collision with root package name */
            public /* synthetic */ Object f49519j;

            /* renamed from: k, reason: collision with root package name */
            public final /* synthetic */ MutableStateFlow f49520k;

            /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
            /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.i$a$a$a, reason: collision with other inner class name */
            public static final class C0464a implements FlowCollector {

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ MutableStateFlow f49521b;

                public C0464a(MutableStateFlow<Boolean> mutableStateFlow) {
                    this.f49521b = mutableStateFlow;
                }

                public final Object a(boolean z10, zu.d<? super x0> dVar) {
                    this.f49521b.setValue(bv.b.boxBoolean(z10));
                    return x0.f87415a;
                }

                @Override // kotlinx.coroutines.flow.FlowCollector
                public /* bridge */ /* synthetic */ Object emit(Object obj, zu.d dVar) {
                    return a(((Boolean) obj).booleanValue(), dVar);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0463a(MutableStateFlow<Boolean> mutableStateFlow, zu.d<? super C0463a> dVar) {
                super(2, dVar);
                this.f49520k = mutableStateFlow;
            }

            @Override // kv.p
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(n nVar, zu.d<? super x0> dVar) {
                return ((C0463a) create(nVar, dVar)).invokeSuspend(x0.f87415a);
            }

            @Override // bv.a
            public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
                C0463a c0463a = new C0463a(this.f49520k, dVar);
                c0463a.f49519j = obj;
                return c0463a;
            }

            @Override // bv.a
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
                int i10 = this.f49518i;
                if (i10 == 0) {
                    a0.throwOnFailure(obj);
                    n nVar = (n) this.f49519j;
                    boolean z10 = nVar instanceof n.c;
                    MutableStateFlow mutableStateFlow = this.f49520k;
                    if (!z10) {
                        mutableStateFlow.setValue(null);
                        return x0.f87415a;
                    }
                    StateFlow<Boolean> stateFlowIsPlaying = ((n.c) nVar).a().isPlaying();
                    C0464a c0464a = new C0464a(mutableStateFlow);
                    this.f49518i = 1;
                    if (stateFlowIsPlaying.collect(c0464a, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    a0.throwOnFailure(obj);
                }
                throw new tu.k();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Flow<? extends n> flow, MutableStateFlow<Boolean> mutableStateFlow, zu.d<? super a> dVar) {
            super(2, dVar);
            this.f49516j = flow;
            this.f49517k = mutableStateFlow;
        }

        @Override // kv.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, zu.d<? super x0> dVar) {
            return ((a) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
        }

        @Override // bv.a
        public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
            return new a(this.f49516j, this.f49517k, dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
            int i10 = this.f49515i;
            if (i10 == 0) {
                a0.throwOnFailure(obj);
                C0463a c0463a = new C0463a(this.f49517k, null);
                this.f49515i = 1;
                if (FlowKt.collectLatest(this.f49516j, c0463a, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                a0.throwOnFailure(obj);
            }
            return x0.f87415a;
        }
    }

    public static final Flow<Boolean> b(Flow<? extends n> flow, CoroutineScope coroutineScope) {
        MutableStateFlow MutableStateFlow = StateFlowKt.MutableStateFlow(null);
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new a(flow, MutableStateFlow, null), 3, null);
        return MutableStateFlow;
    }

    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.dec.a b(List<? extends n> list, n nVar) {
        n nVar2 = (n) y0.getOrNull(list, y0.indexOf(list, nVar) + 1);
        n.b bVar = nVar2 instanceof n.b ? (n.b) nVar2 : null;
        if (bVar != null) {
            return bVar.a();
        }
        return null;
    }

    public static final a.c.EnumC0490a b(List<? extends n> list, n nVar, a.c.EnumC0490a enumC0490a) {
        return (enumC0490a != a.c.EnumC0490a.f50248e || b(list, nVar) == null) ? enumC0490a : a.c.EnumC0490a.f50249f;
    }

    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.a a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a ad2, e0 externalLinkHandler, Context context, com.moloco.sdk.xenoss.sdkdevkit.android.core.services.b customUserEventBuilderService, boolean z10, Boolean bool, int i10, int i11, int i12, boolean z11, boolean z12) {
        kotlin.jvm.internal.e0.checkNotNullParameter(ad2, "ad");
        kotlin.jvm.internal.e0.checkNotNullParameter(externalLinkHandler, "externalLinkHandler");
        kotlin.jvm.internal.e0.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.e0.checkNotNullParameter(customUserEventBuilderService, "customUserEventBuilderService");
        return new f(m.a(ad2, externalLinkHandler, context, customUserEventBuilderService, z10, bool, i10, i11, i12, z11, z12), new j(ad2.i(), ad2.j().n().b(), ad2.h(), null, 8, null));
    }

    public static final a.c b(List<? extends n> list, n nVar, a.c cVar) {
        a.c.EnumC0490a enumC0490aB = b(list, nVar, cVar.d());
        return enumC0490aB == cVar.d() ? cVar : a.c.a(cVar, enumC0490aB, null, null, 6, null);
    }

    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.a a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.d mraidAdData, e0 externalLinkHandler, Context context, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.l mraidFullscreenContentController, int i10, com.moloco.sdk.xenoss.sdkdevkit.android.core.services.b customUserEventBuilderService) {
        kotlin.jvm.internal.e0.checkNotNullParameter(mraidAdData, "mraidAdData");
        kotlin.jvm.internal.e0.checkNotNullParameter(externalLinkHandler, "externalLinkHandler");
        kotlin.jvm.internal.e0.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.e0.checkNotNullParameter(mraidFullscreenContentController, "mraidFullscreenContentController");
        kotlin.jvm.internal.e0.checkNotNullParameter(customUserEventBuilderService, "customUserEventBuilderService");
        return new f(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.e.a(mraidAdData, mraidFullscreenContentController, i10, context, externalLinkHandler, customUserEventBuilderService), null);
    }
}
