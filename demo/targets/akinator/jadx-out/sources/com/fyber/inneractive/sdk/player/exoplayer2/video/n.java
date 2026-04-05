package com.fyber.inneractive.sdk.player.exoplayer2.video;

import android.view.Surface;
import com.fyber.inneractive.sdk.player.exoplayer2.video.VideoRendererEventListener;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class n implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Surface f26148a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ VideoRendererEventListener.EventDispatcher f26149b;

    public n(VideoRendererEventListener.EventDispatcher eventDispatcher, Surface surface) {
        this.f26149b = eventDispatcher;
        this.f26148a = surface;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f26149b.listener.onRenderedFirstFrame(this.f26148a);
    }
}
