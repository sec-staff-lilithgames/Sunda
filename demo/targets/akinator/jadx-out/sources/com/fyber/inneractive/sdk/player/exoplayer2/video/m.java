package com.fyber.inneractive.sdk.player.exoplayer2.video;

import com.fyber.inneractive.sdk.player.exoplayer2.video.VideoRendererEventListener;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class m implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26143a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f26144b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f26145c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ float f26146d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ VideoRendererEventListener.EventDispatcher f26147e;

    public m(VideoRendererEventListener.EventDispatcher eventDispatcher, int i10, int i11, int i12, float f10) {
        this.f26147e = eventDispatcher;
        this.f26143a = i10;
        this.f26144b = i11;
        this.f26145c = i12;
        this.f26146d = f10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f26147e.listener.onVideoSizeChanged(this.f26143a, this.f26144b, this.f26145c, this.f26146d);
    }
}
