package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render;

import android.content.Context;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.e0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.a0;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class p implements o {

    /* renamed from: b, reason: collision with root package name */
    public final a0 f50063b;

    /* renamed from: c, reason: collision with root package name */
    public final String f50064c;

    /* renamed from: e, reason: collision with root package name */
    public final com.moloco.sdk.xenoss.sdkdevkit.android.core.services.b f50065e;

    /* renamed from: f, reason: collision with root package name */
    public final e0 f50066f;

    /* renamed from: g, reason: collision with root package name */
    public final kv.a f50067g;

    /* renamed from: h, reason: collision with root package name */
    public final kv.a f50068h;

    /* renamed from: i, reason: collision with root package name */
    public final MutableStateFlow f50069i;

    /* renamed from: j, reason: collision with root package name */
    public final StateFlow f50070j;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a extends bv.n implements kv.p {

        /* renamed from: i, reason: collision with root package name */
        public int f50071i;

        /* renamed from: k, reason: collision with root package name */
        public final /* synthetic */ Context f50073k;

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Integer f50074l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ Integer f50075m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context, Integer num, Integer num2, zu.d<? super a> dVar) {
            super(2, dVar);
            this.f50073k = context;
            this.f50074l = num;
            this.f50075m = num2;
        }

        @Override // kv.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, zu.d<? super x0> dVar) {
            return ((a) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
        }

        @Override // bv.a
        public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
            return p.this.new a(this.f50073k, this.f50074l, this.f50075m, dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            Object objA;
            Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
            int i10 = this.f50071i;
            p pVar = p.this;
            l lVar = null;
            try {
            } catch (Exception unused) {
                if (lVar != null) {
                    lVar.destroy();
                }
                pVar.destroy();
            }
            if (i10 == 0) {
                tu.a0.throwOnFailure(obj);
                a0 a0Var = pVar.f50063b;
                if (a0Var != null) {
                    Context context = this.f50073k;
                    com.moloco.sdk.xenoss.sdkdevkit.android.core.services.b bVar = pVar.f50065e;
                    e0 e0Var = pVar.f50066f;
                    Integer num = this.f50074l;
                    int iIntValue = num != null ? num.intValue() : 0;
                    Integer num2 = this.f50075m;
                    int iIntValue2 = num2 != null ? num2.intValue() : 0;
                    com.moloco.sdk.service_locator.b bVar2 = new com.moloco.sdk.service_locator.b(23);
                    a1.o oVar = new a1.o(26);
                    this.f50071i = 1;
                    objA = m.a(a0Var, context, bVar, e0Var, iIntValue, iIntValue2, bVar2, oVar, (128 & 128) != 0 ? false : false, this);
                    if (objA == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                pVar.f50069i.setValue(lVar);
                return x0.f87415a;
            }
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            tu.a0.throwOnFailure(obj);
            objA = obj;
            lVar = (l) objA;
            pVar.f50069i.setValue(lVar);
            return x0.f87415a;
        }

        public static final x0 a() {
            return x0.f87415a;
        }

        public static final x0 a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c cVar) {
            return x0.f87415a;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b implements Flow {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Flow f50076b;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class a implements FlowCollector {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FlowCollector f50077b;

            /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
            /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.p$b$a$a, reason: collision with other inner class name */
            public static final class C0483a extends bv.d {

                /* renamed from: i, reason: collision with root package name */
                public /* synthetic */ Object f50078i;

                /* renamed from: j, reason: collision with root package name */
                public int f50079j;

                public C0483a(zu.d dVar) {
                    super(dVar);
                }

                @Override // bv.a
                public final Object invokeSuspend(Object obj) {
                    this.f50078i = obj;
                    this.f50079j |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(FlowCollector flowCollector) {
                this.f50077b = flowCollector;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r5, zu.d r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.p.b.a.C0483a
                    if (r0 == 0) goto L13
                    r0 = r6
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.p$b$a$a r0 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.p.b.a.C0483a) r0
                    int r1 = r0.f50079j
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f50079j = r1
                    goto L18
                L13:
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.p$b$a$a r0 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.p$b$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f50078i
                    java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
                    int r2 = r0.f50079j
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    tu.a0.throwOnFailure(r6)
                    goto L49
                L29:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L31:
                    tu.a0.throwOnFailure(r6)
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.l r5 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.l) r5
                    if (r5 == 0) goto L3d
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.k r5 = r5.k()
                    goto L3e
                L3d:
                    r5 = 0
                L3e:
                    r0.f50079j = r3
                    kotlinx.coroutines.flow.FlowCollector r6 = r4.f50077b
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L49
                    return r1
                L49:
                    tu.x0 r5 = tu.x0.f87415a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.p.b.a.emit(java.lang.Object, zu.d):java.lang.Object");
            }
        }

        public b(Flow flow) {
            this.f50076b = flow;
        }

        @Override // kotlinx.coroutines.flow.Flow
        public Object collect(FlowCollector flowCollector, zu.d dVar) {
            Object objCollect = this.f50076b.collect(new a(flowCollector), dVar);
            return objCollect == av.e.getCOROUTINE_SUSPENDED() ? objCollect : x0.f87415a;
        }
    }

    public p(a0 a0Var, Integer num, Integer num2, String str, CoroutineScope scope, Context context, com.moloco.sdk.xenoss.sdkdevkit.android.core.services.b customUserEventBuilderService, e0 externalLinkHandler, kv.a aVar, kv.a aVar2) {
        kotlin.jvm.internal.e0.checkNotNullParameter(scope, "scope");
        kotlin.jvm.internal.e0.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.e0.checkNotNullParameter(customUserEventBuilderService, "customUserEventBuilderService");
        kotlin.jvm.internal.e0.checkNotNullParameter(externalLinkHandler, "externalLinkHandler");
        this.f50063b = a0Var;
        this.f50064c = str;
        this.f50065e = customUserEventBuilderService;
        this.f50066f = externalLinkHandler;
        this.f50067g = aVar;
        this.f50068h = aVar2;
        MutableStateFlow MutableStateFlow = StateFlowKt.MutableStateFlow(null);
        this.f50069i = MutableStateFlow;
        BuildersKt__Builders_commonKt.launch$default(scope, null, null, new a(context, num, num2, null), 3, null);
        this.f50070j = FlowKt.stateIn(new b(MutableStateFlow), scope, SharingStarted.Companion.WhileSubscribed$default(SharingStarted.Companion, 0L, 0L, 3, null), null);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.o
    public StateFlow<k> O() {
        return this.f50070j;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.o, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.q
    public void destroy() {
        MutableStateFlow mutableStateFlow = this.f50069i;
        l lVar = (l) mutableStateFlow.getValue();
        if (lVar != null) {
            lVar.destroy();
        }
        mutableStateFlow.setValue(null);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.o
    public void i() {
        kv.a aVar = this.f50068h;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.o
    public void v() {
        String str = this.f50064c;
        if (str != null) {
            kv.a aVar = this.f50067g;
            if (aVar != null) {
                aVar.invoke();
            }
            this.f50066f.a(str);
        }
    }
}
