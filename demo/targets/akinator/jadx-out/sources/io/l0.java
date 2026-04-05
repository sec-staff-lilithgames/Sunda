package io;

import android.graphics.Bitmap;
import android.view.Surface;
import io.bidmachine.media3.common.util.p0;
import io.bidmachine.media3.common.util.v0;
import io.bidmachine.media3.exoplayer.r1;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public interface l0 {
    void clearOutputSurfaceInfo();

    void enableMayRenderStartOfStream();

    void flush(boolean z10);

    Surface getInputSurface();

    boolean handleInputBitmap(Bitmap bitmap, v0 v0Var);

    boolean handleInputFrame(long j10, boolean z10, j0 j0Var);

    boolean initialize(io.bidmachine.media3.common.b bVar) throws k0;

    boolean isEnded();

    boolean isInitialized();

    boolean isReady(boolean z10);

    void join(boolean z10);

    void onInputStreamChanged(int i10, io.bidmachine.media3.common.b bVar, List<Object> list);

    void onRendererDisabled();

    void onRendererEnabled(boolean z10);

    void onRendererStarted();

    void onRendererStopped();

    void release();

    void render(long j10, long j11) throws k0;

    void setChangeFrameRateStrategy(int i10);

    void setListener(i0 i0Var, Executor executor);

    void setOutputSurfaceInfo(Surface surface, p0 p0Var);

    void setPlaybackSpeed(float f10);

    void setStreamTimestampInfo(long j10, long j11);

    void setVideoEffects(List<Object> list);

    void setVideoFrameMetadataListener(v vVar);

    void setWakeupListener(r1 r1Var);

    void signalEndOfCurrentInputStream();

    void signalEndOfInput();
}
