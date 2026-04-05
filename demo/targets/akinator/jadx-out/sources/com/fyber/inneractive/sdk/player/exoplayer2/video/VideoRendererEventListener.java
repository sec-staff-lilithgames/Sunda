package com.fyber.inneractive.sdk.player.exoplayer2.video;

import android.os.Handler;
import android.view.Surface;
import com.fyber.inneractive.sdk.player.exoplayer2.decoder.DecoderCounters;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public interface VideoRendererEventListener {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class EventDispatcher {
        private final Handler handler;
        private final VideoRendererEventListener listener;

        public EventDispatcher(Handler handler, VideoRendererEventListener videoRendererEventListener) {
            if (videoRendererEventListener != null) {
                handler.getClass();
            } else {
                handler = null;
            }
            this.handler = handler;
            this.listener = videoRendererEventListener;
        }

        public void decoderInitialized(String str, long j10, long j11) {
            if (this.listener != null) {
                this.handler.post(new j(this, str, j10, j11));
            }
        }

        public void disabled(DecoderCounters decoderCounters) {
            if (this.listener != null) {
                this.handler.post(new o(this, decoderCounters));
            }
        }

        public void droppedFrames(int i10, long j10) {
            if (this.listener != null) {
                this.handler.post(new l(this, i10, j10));
            }
        }

        public void enabled(DecoderCounters decoderCounters) {
            if (this.listener != null) {
                this.handler.post(new i(this, decoderCounters));
            }
        }

        public void inputFormatChanged(com.fyber.inneractive.sdk.player.exoplayer2.o oVar) {
            if (this.listener != null) {
                this.handler.post(new k(this, oVar));
            }
        }

        public void renderedFirstFrame(Surface surface) {
            if (this.listener != null) {
                this.handler.post(new n(this, surface));
            }
        }

        public void videoSizeChanged(int i10, int i11, int i12, float f10) {
            if (this.listener != null) {
                this.handler.post(new m(this, i10, i11, i12, f10));
            }
        }
    }

    void onDroppedFrames(int i10, long j10);

    void onRenderedFirstFrame(Surface surface);

    void onVideoDecoderInitialized(String str, long j10, long j11);

    void onVideoDisabled(DecoderCounters decoderCounters);

    void onVideoEnabled(DecoderCounters decoderCounters);

    void onVideoInputFormatChanged(com.fyber.inneractive.sdk.player.exoplayer2.o oVar);

    void onVideoSizeChanged(int i10, int i11, int i12, float f10);
}
