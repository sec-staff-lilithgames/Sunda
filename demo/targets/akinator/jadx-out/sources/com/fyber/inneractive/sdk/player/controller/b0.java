package com.fyber.inneractive.sdk.player.controller;

import android.view.Surface;
import com.fyber.inneractive.sdk.player.exoplayer2.decoder.DecoderCounters;
import com.fyber.inneractive.sdk.player.exoplayer2.video.VideoRendererEventListener;
import com.fyber.inneractive.sdk.util.IAlog;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class b0 implements VideoRendererEventListener {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f24393a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f24394b = false;

    public b0(f fVar) {
        this.f24393a = new WeakReference(fVar);
    }

    public final String a() {
        f fVar = (f) this.f24393a.get();
        return fVar == null ? b0.class.getName() : IAlog.a(fVar);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.video.VideoRendererEventListener
    public final void onVideoSizeChanged(int i10, int i11, int i12, float f10) {
        f fVar = (f) this.f24393a.get();
        if (fVar != null) {
            fVar.f24409t = i10;
            fVar.f24410u = i11;
        }
    }

    public final void a(int i10, boolean z10) {
        com.fyber.inneractive.sdk.player.exoplayer2.g gVar;
        IAlog.a("%sonPlayerStateChanged called with pwr = %s state = %d", a(), Boolean.valueOf(z10), Integer.valueOf(i10));
        f fVar = (f) this.f24393a.get();
        if (fVar == null || (gVar = fVar.f24408s) == null || fVar.f24415z) {
            return;
        }
        if (i10 != 3) {
            if (i10 == 2) {
                if (fVar.f24434e == com.fyber.inneractive.sdk.player.enums.b.Playing) {
                    fVar.a(com.fyber.inneractive.sdk.player.enums.b.Buffering);
                    return;
                }
                return;
            } else {
                if (i10 == 4) {
                    fVar.a(com.fyber.inneractive.sdk.player.enums.b.Completed);
                    return;
                }
                return;
            }
        }
        if (!z10) {
            if (fVar.f24434e == com.fyber.inneractive.sdk.player.enums.b.Preparing) {
                com.fyber.inneractive.sdk.player.exoplayer2.trackselection.h hVar = gVar.f25565o;
                if (hVar != null && hVar.f25842a > 0) {
                    com.fyber.inneractive.sdk.player.exoplayer2.trackselection.b bVar = hVar.f25843b[0];
                    com.fyber.inneractive.sdk.player.exoplayer2.o oVar = bVar == null ? null : bVar.f25836d[bVar.a()];
                    if (oVar != null) {
                        int i11 = oVar.f25705j;
                        int i12 = oVar.f25706k;
                        fVar.f24409t = i11;
                        fVar.f24410u = i12;
                    }
                }
                this.f24394b = true;
                fVar.a(com.fyber.inneractive.sdk.player.enums.b.Prepared);
                return;
            }
            return;
        }
        fVar.a(com.fyber.inneractive.sdk.player.enums.b.Playing);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.video.VideoRendererEventListener
    public final void onRenderedFirstFrame(Surface surface) {
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.video.VideoRendererEventListener
    public final void onVideoDisabled(DecoderCounters decoderCounters) {
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.video.VideoRendererEventListener
    public final void onVideoEnabled(DecoderCounters decoderCounters) {
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.video.VideoRendererEventListener
    public final void onVideoInputFormatChanged(com.fyber.inneractive.sdk.player.exoplayer2.o oVar) {
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.video.VideoRendererEventListener
    public final void onDroppedFrames(int i10, long j10) {
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.video.VideoRendererEventListener
    public final void onVideoDecoderInitialized(String str, long j10, long j11) {
    }
}
