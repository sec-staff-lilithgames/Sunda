package sf;

import com.google.android.exoplayer2.z0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public interface w {
    @Deprecated
    default void onVideoInputFormatChanged(z0 z0Var) {
    }

    default void onVideoInputFormatChanged(z0 z0Var, ce.k kVar) {
    }

    default void onVideoCodecError(Exception exc) {
    }

    default void onVideoDecoderReleased(String str) {
    }

    default void onVideoDisabled(ce.f fVar) {
    }

    default void onVideoEnabled(ce.f fVar) {
    }

    default void onVideoSizeChanged(x xVar) {
    }

    default void onDroppedFrames(int i10, long j10) {
    }

    default void onRenderedFirstFrame(Object obj, long j10) {
    }

    default void onVideoFrameProcessingOffset(long j10, int i10) {
    }

    default void onVideoDecoderInitialized(String str, long j10, long j11) {
    }
}
