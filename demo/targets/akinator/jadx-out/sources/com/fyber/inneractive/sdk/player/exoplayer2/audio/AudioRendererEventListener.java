package com.fyber.inneractive.sdk.player.exoplayer2.audio;

import android.os.Handler;
import com.fyber.inneractive.sdk.player.exoplayer2.decoder.DecoderCounters;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public interface AudioRendererEventListener {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class EventDispatcher {
        private final Handler handler;
        private final AudioRendererEventListener listener;

        public EventDispatcher(Handler handler, AudioRendererEventListener audioRendererEventListener) {
            if (audioRendererEventListener != null) {
                handler.getClass();
            } else {
                handler = null;
            }
            this.handler = handler;
            this.listener = audioRendererEventListener;
        }

        public void audioSessionId(int i10) {
            if (this.listener != null) {
                this.handler.post(new i(this, i10));
            }
        }

        public void audioTrackUnderrun(int i10, long j10, long j11) {
            if (this.listener != null) {
                this.handler.post(new g(this, i10, j10, j11));
            }
        }

        public void decoderInitialized(String str, long j10, long j11) {
            if (this.listener != null) {
                this.handler.post(new e(this, str, j10, j11));
            }
        }

        public void disabled(DecoderCounters decoderCounters) {
            if (this.listener != null) {
                this.handler.post(new h(this, decoderCounters));
            }
        }

        public void enabled(DecoderCounters decoderCounters) {
            if (this.listener != null) {
                this.handler.post(new d(this, decoderCounters));
            }
        }

        public void inputFormatChanged(com.fyber.inneractive.sdk.player.exoplayer2.o oVar) {
            if (this.listener != null) {
                this.handler.post(new f(this, oVar));
            }
        }
    }

    void onAudioDecoderInitialized(String str, long j10, long j11);

    void onAudioDisabled(DecoderCounters decoderCounters);

    void onAudioEnabled(DecoderCounters decoderCounters);

    void onAudioInputFormatChanged(com.fyber.inneractive.sdk.player.exoplayer2.o oVar);

    void onAudioSessionId(int i10);

    void onAudioTrackUnderrun(int i10, long j10, long j11);
}
