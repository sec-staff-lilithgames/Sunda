package m8;

import android.graphics.Bitmap;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public interface b {
    void advance();

    void clear();

    int getByteSize();

    int getCurrentFrameIndex();

    ByteBuffer getData();

    int getDelay(int i10);

    int getFrameCount();

    int getHeight();

    @Deprecated
    int getLoopCount();

    int getNetscapeLoopCount();

    int getNextDelay();

    Bitmap getNextFrame();

    int getStatus();

    int getTotalIterationCount();

    int getWidth();

    int read(InputStream inputStream, int i10);

    int read(byte[] bArr);

    void resetFrameIndex();

    void setData(d dVar, ByteBuffer byteBuffer);

    void setData(d dVar, ByteBuffer byteBuffer, int i10);

    void setData(d dVar, byte[] bArr);

    void setDefaultBitmapConfig(Bitmap.Config config);
}
