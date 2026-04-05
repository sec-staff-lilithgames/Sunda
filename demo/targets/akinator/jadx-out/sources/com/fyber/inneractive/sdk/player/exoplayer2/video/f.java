package com.fyber.inneractive.sdk.player.exoplayer2.video;

import android.media.MediaCodec;
import android.os.Handler;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class f implements MediaCodec.OnFrameRenderedListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MediaCodecVideoRenderer f26115a;

    public f(MediaCodecVideoRenderer mediaCodecVideoRenderer, MediaCodec mediaCodec) {
        this.f26115a = mediaCodecVideoRenderer;
        mediaCodec.setOnFrameRenderedListener(this, new Handler());
    }

    @Override // android.media.MediaCodec.OnFrameRenderedListener
    public final void onFrameRendered(MediaCodec mediaCodec, long j10, long j11) {
        MediaCodecVideoRenderer mediaCodecVideoRenderer = this.f26115a;
        if (this == mediaCodecVideoRenderer.f26099p0 && !mediaCodecVideoRenderer.Y) {
            mediaCodecVideoRenderer.Y = true;
            mediaCodecVideoRenderer.Q.renderedFirstFrame(mediaCodecVideoRenderer.W);
        }
    }
}
