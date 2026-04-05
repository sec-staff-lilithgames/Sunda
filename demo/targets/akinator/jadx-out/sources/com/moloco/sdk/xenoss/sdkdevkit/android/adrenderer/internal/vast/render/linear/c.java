package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear;

import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.n;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.q;
import com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.StateFlow;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public interface c extends l, q {
    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.l
    /* synthetic */ void F();

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.l
    /* synthetic */ void G();

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.l
    /* synthetic */ String H();

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.l, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.b
    /* synthetic */ boolean K();

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.l
    /* synthetic */ boolean M();

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.l, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.o
    /* synthetic */ StateFlow O();

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.l
    /* synthetic */ StateFlow Q();

    int R();

    Flow<d> a();

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.l
    /* synthetic */ void a(n nVar);

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.l
    /* synthetic */ void a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.j jVar);

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.l, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.o
    /* synthetic */ void a(a.c.EnumC0490a enumC0490a);

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.l, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.o
    /* synthetic */ void a(a.c cVar);

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.l
    /* synthetic */ void b();

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.l, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.b
    /* synthetic */ void b(a.f fVar);

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.l
    /* synthetic */ void c(boolean z10);

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.l
    /* synthetic */ void d(boolean z10);

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.l, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.o, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.q
    /* synthetic */ void destroy();

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.l
    /* synthetic */ void h();

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.l, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.o
    /* synthetic */ void i();

    StateFlow<Boolean> isPlaying();

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.l, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.e
    /* synthetic */ StateFlow m();

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.l
    /* synthetic */ StateFlow r();

    void s();

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.l, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.o
    /* synthetic */ void v();
}
