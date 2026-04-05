package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad;

import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.n;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.d;
import kotlin.jvm.internal.e0;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import kv.p;
import tu.a0;
import tu.t;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class d implements c {

    /* renamed from: b, reason: collision with root package name */
    public final StateFlow f49472b;

    /* renamed from: c, reason: collision with root package name */
    public final MutableStateFlow f49473c;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a extends bv.n implements p {

        /* renamed from: i, reason: collision with root package name */
        public /* synthetic */ Object f49474i;

        public a(zu.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // kv.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(n nVar, zu.d<? super x0> dVar) {
            return ((a) create(nVar, dVar)).invokeSuspend(x0.f87415a);
        }

        @Override // bv.a
        public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
            a aVar = new a(dVar);
            aVar.f49474i = obj;
            return aVar;
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            av.e.getCOROUTINE_SUSPENDED();
            a0.throwOnFailure(obj);
            n nVar = (n) this.f49474i;
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.d dVarA = nVar instanceof n.a ? ((n.a) nVar).a() : nVar instanceof n.b ? ((n.b) nVar).a() : null;
            x0 x0Var = x0.f87415a;
            if (dVarA == null) {
                return x0Var;
            }
            dVarA.reset();
            return x0Var;
        }
    }

    public d(StateFlow<? extends n> currentPlaylistItem, CoroutineScope scope) {
        e0.checkNotNullParameter(currentPlaylistItem, "currentPlaylistItem");
        e0.checkNotNullParameter(scope, "scope");
        this.f49472b = currentPlaylistItem;
        FlowKt.stateIn(FlowKt.onEach(currentPlaylistItem, new a(null)), scope, SharingStarted.Companion.getEagerly(), null);
        this.f49473c = StateFlowKt.MutableStateFlow(d.c.f49900a);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.c, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.e
    public StateFlow<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.d> m() {
        n nVar = (n) this.f49472b.getValue();
        if (nVar instanceof n.a) {
            return ((n.a) nVar).a().m();
        }
        if (nVar instanceof n.b) {
            return ((n.b) nVar).a().m();
        }
        if (nVar instanceof n.c) {
            return ((n.c) nVar).a().m();
        }
        if (nVar instanceof n.d) {
            return ((n.d) nVar).a().m();
        }
        if (nVar == null) {
            return this.f49473c;
        }
        throw new t();
    }

    @tu.f
    public static /* synthetic */ void f() {
    }
}
