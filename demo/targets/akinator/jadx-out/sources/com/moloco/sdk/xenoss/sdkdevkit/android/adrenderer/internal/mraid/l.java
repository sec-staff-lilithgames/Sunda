package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid;

import android.webkit.WebView;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.p;
import com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.StateFlow;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public interface l extends k, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.q {
    void D();

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.k, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.b
    /* synthetic */ boolean K();

    Flow<n> a();

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.k, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.b
    /* synthetic */ void b(a.f fVar);

    WebView c();

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.q
    /* synthetic */ void destroy();

    StateFlow<p.f> e();

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.k, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.e
    /* synthetic */ StateFlow m();
}
