package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

import com.moloco.sdk.internal.w;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class q0 implements com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.i {

    /* renamed from: b, reason: collision with root package name */
    public final String f48191b;

    /* renamed from: c, reason: collision with root package name */
    public final CoroutineScope f48192c;

    /* renamed from: e, reason: collision with root package name */
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.a f48193e;

    /* renamed from: f, reason: collision with root package name */
    public final MutableStateFlow f48194f;

    /* renamed from: g, reason: collision with root package name */
    public final MutableStateFlow f48195g;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a extends bv.n implements kv.p {

        /* renamed from: i, reason: collision with root package name */
        public int f48196i;

        /* renamed from: k, reason: collision with root package name */
        public final /* synthetic */ long f48198k;

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.h f48199l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(long j10, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.h hVar, zu.d<? super a> dVar) {
            super(2, dVar);
            this.f48198k = j10;
            this.f48199l = hVar;
        }

        @Override // kv.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, zu.d<? super x0> dVar) {
            return ((a) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
        }

        @Override // bv.a
        public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
            return q0.this.new a(this.f48198k, this.f48199l, dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
            int i10 = this.f48196i;
            q0 q0Var = q0.this;
            if (i10 == 0) {
                tu.a0.throwOnFailure(obj);
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.a aVar = q0Var.f48193e;
                String str = q0Var.f48191b;
                this.f48196i = 1;
                obj = aVar.a(str, this.f48198k, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                tu.a0.throwOnFailure(obj);
            }
            com.moloco.sdk.internal.w wVar = (com.moloco.sdk.internal.w) obj;
            boolean z10 = wVar instanceof w.b;
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.h hVar = this.f48199l;
            if (z10) {
                q0Var.f48194f.setValue(bv.b.boxBoolean(true));
                if (hVar != null) {
                    hVar.a();
                }
            } else {
                if (!(wVar instanceof w.a)) {
                    throw new tu.t();
                }
                if (hVar != null) {
                    hVar.a((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c) ((w.a) wVar).a());
                }
            }
            return x0.f87415a;
        }
    }

    public q0(String adm, CoroutineScope scope, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.a staticWebView) {
        kotlin.jvm.internal.e0.checkNotNullParameter(adm, "adm");
        kotlin.jvm.internal.e0.checkNotNullParameter(scope, "scope");
        kotlin.jvm.internal.e0.checkNotNullParameter(staticWebView, "staticWebView");
        this.f48191b = adm;
        this.f48192c = scope;
        this.f48193e = staticWebView;
        MutableStateFlow MutableStateFlow = StateFlowKt.MutableStateFlow(Boolean.FALSE);
        this.f48194f = MutableStateFlow;
        this.f48195g = MutableStateFlow;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.i
    public StateFlow<Boolean> isLoaded() {
        return this.f48195g;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.i
    public void a(long j10, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.h hVar) {
        BuildersKt__Builders_commonKt.launch$default(this.f48192c, null, null, new a(j10, hVar, null), 3, null);
    }
}
