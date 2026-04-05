package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer;

import android.view.View;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.n;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.j;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.q;
import kotlinx.coroutines.flow.StateFlow;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public interface g extends q {
    boolean E();

    View N();

    Object a(zu.d<? super x0> dVar);

    void a(String str);

    void b(boolean z10);

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.q
    /* synthetic */ void destroy();

    StateFlow<n> f();

    StateFlow<a> isPlaying();

    String n();

    StateFlow<j> p();

    void pause();

    void play();

    void seekTo(long j10);
}
