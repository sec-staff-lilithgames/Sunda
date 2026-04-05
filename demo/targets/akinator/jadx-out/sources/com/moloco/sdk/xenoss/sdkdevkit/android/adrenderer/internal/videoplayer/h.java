package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer;

import android.view.View;
import bv.n;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.j;
import kotlin.jvm.internal.e0;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kv.q;
import tu.a0;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class h implements g {

    /* renamed from: b, reason: collision with root package name */
    public final d f50131b;

    /* renamed from: c, reason: collision with root package name */
    public final CoroutineScope f50132c;

    /* renamed from: e, reason: collision with root package name */
    public final MutableSharedFlow f50133e;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a extends n implements q {

        /* renamed from: i, reason: collision with root package name */
        public /* synthetic */ boolean f50134i;

        /* renamed from: j, reason: collision with root package name */
        public /* synthetic */ boolean f50135j;

        public a(zu.d<? super a> dVar) {
            super(3, dVar);
        }

        public final Object a(boolean z10, boolean z11, zu.d<? super x0> dVar) {
            a aVar = h.this.new a(dVar);
            aVar.f50134i = z10;
            aVar.f50135j = z11;
            return aVar.invokeSuspend(x0.f87415a);
        }

        @Override // kv.q
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return a(((Boolean) obj).booleanValue(), ((Boolean) obj2).booleanValue(), (zu.d) obj3);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            av.e.getCOROUTINE_SUSPENDED();
            a0.throwOnFailure(obj);
            boolean z10 = this.f50134i;
            boolean z11 = this.f50135j;
            h hVar = h.this;
            if (z10 && z11) {
                hVar.f50131b.play();
            } else {
                hVar.f50131b.pause();
            }
            return x0.f87415a;
        }
    }

    public h(d basePlayer, j viewVisibilityTracker) {
        e0.checkNotNullParameter(basePlayer, "basePlayer");
        e0.checkNotNullParameter(viewVisibilityTracker, "viewVisibilityTracker");
        this.f50131b = basePlayer;
        CoroutineScope coroutineScopeMainScope = CoroutineScopeKt.MainScope();
        this.f50132c = coroutineScopeMainScope;
        MutableSharedFlow mutableSharedFlowMutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(1, 0, BufferOverflow.DROP_OLDEST, 2, null);
        this.f50133e = mutableSharedFlowMutableSharedFlow$default;
        FlowKt.launchIn(FlowKt.combine(i.b(viewVisibilityTracker, basePlayer.N()), mutableSharedFlowMutableSharedFlow$default, new a(null)), coroutineScopeMainScope);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.g
    public boolean E() {
        return this.f50131b.E();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.g
    public View N() {
        return this.f50131b.N();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.g
    public Object a(zu.d<? super x0> dVar) {
        return this.f50131b.a(dVar);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.g
    public void b(boolean z10) {
        this.f50131b.b(z10);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.g, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.q
    public void destroy() {
        CoroutineScopeKt.cancel$default(this.f50132c, null, 1, null);
        this.f50131b.destroy();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.g
    public StateFlow<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.n> f() {
        return this.f50131b.f();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.g
    public StateFlow<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.a> isPlaying() {
        return this.f50131b.isPlaying();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.g
    public String n() {
        return this.f50131b.n();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.g
    public StateFlow<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.j> p() {
        return this.f50131b.p();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.g
    public void pause() {
        this.f50133e.tryEmit(Boolean.FALSE);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.g
    public void play() {
        this.f50133e.tryEmit(Boolean.TRUE);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.g
    public void seekTo(long j10) {
        this.f50131b.seekTo(j10);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.g
    public void a(String str) {
        this.f50131b.a(str);
    }
}
