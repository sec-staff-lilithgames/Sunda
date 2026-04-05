package com.fyber.inneractive.sdk.player.exoplayer2.video;

import com.fyber.inneractive.sdk.player.exoplayer2.video.VideoRendererEventListener;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class l implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26140a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f26141b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ VideoRendererEventListener.EventDispatcher f26142c;

    public l(VideoRendererEventListener.EventDispatcher eventDispatcher, int i10, long j10) {
        this.f26142c = eventDispatcher;
        this.f26140a = i10;
        this.f26141b = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f26142c.listener.onDroppedFrames(this.f26140a, this.f26141b);
    }
}
