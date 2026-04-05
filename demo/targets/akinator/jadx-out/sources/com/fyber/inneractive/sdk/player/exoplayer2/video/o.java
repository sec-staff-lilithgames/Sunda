package com.fyber.inneractive.sdk.player.exoplayer2.video;

import com.fyber.inneractive.sdk.player.exoplayer2.decoder.DecoderCounters;
import com.fyber.inneractive.sdk.player.exoplayer2.video.VideoRendererEventListener;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class o implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ DecoderCounters f26150a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ VideoRendererEventListener.EventDispatcher f26151b;

    public o(VideoRendererEventListener.EventDispatcher eventDispatcher, DecoderCounters decoderCounters) {
        this.f26151b = eventDispatcher;
        this.f26150a = decoderCounters;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f26150a.ensureUpdated();
        this.f26151b.listener.onVideoDisabled(this.f26150a);
    }
}
