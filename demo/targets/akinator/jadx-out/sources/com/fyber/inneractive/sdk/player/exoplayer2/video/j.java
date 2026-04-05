package com.fyber.inneractive.sdk.player.exoplayer2.video;

import com.fyber.inneractive.sdk.player.exoplayer2.video.VideoRendererEventListener;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class j implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f26134a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f26135b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f26136c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ VideoRendererEventListener.EventDispatcher f26137d;

    public j(VideoRendererEventListener.EventDispatcher eventDispatcher, String str, long j10, long j11) {
        this.f26137d = eventDispatcher;
        this.f26134a = str;
        this.f26135b = j10;
        this.f26136c = j11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f26137d.listener.onVideoDecoderInitialized(this.f26134a, this.f26135b, this.f26136c);
    }
}
