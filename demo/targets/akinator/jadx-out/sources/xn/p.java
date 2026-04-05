package xn;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.PersistableBundle;
import android.view.Surface;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public interface p {
    int dequeueInputBufferIndex();

    int dequeueOutputBufferIndex(MediaCodec.BufferInfo bufferInfo);

    void detachOutputSurface();

    void flush();

    ByteBuffer getInputBuffer(int i10);

    PersistableBundle getMetrics();

    ByteBuffer getOutputBuffer(int i10);

    MediaFormat getOutputFormat();

    boolean needsReconfiguration();

    void queueInputBuffer(int i10, int i11, int i12, long j10, int i13);

    void queueSecureInputBuffer(int i10, int i11, nn.d dVar, long j10, int i12);

    default boolean registerOnBufferAvailableListener(n nVar) {
        return false;
    }

    void release();

    void releaseOutputBuffer(int i10, long j10);

    void releaseOutputBuffer(int i10, boolean z10);

    void setOnFrameRenderedListener(o oVar, Handler handler);

    void setOutputSurface(Surface surface);

    void setParameters(Bundle bundle);

    void setVideoScalingMode(int i10);
}
