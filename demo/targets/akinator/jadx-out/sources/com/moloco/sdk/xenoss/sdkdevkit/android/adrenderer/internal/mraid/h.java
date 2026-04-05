package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid;

import android.webkit.WebView;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.StateFlow;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public interface h extends com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.q {
    StateFlow<Boolean> I();

    Object a(String str, zu.d<? super com.moloco.sdk.internal.w> dVar);

    void a(p pVar, String str);

    void a(u uVar);

    void a(v vVar);

    void a(w wVar);

    void a(boolean z10);

    void a(boolean z10, boolean z11, boolean z12, boolean z13, boolean z14);

    WebView c();

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.q
    /* synthetic */ void destroy();

    void j();

    SharedFlow<p> w();

    StateFlow<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d> x();
}
