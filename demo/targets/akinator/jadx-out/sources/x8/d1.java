package x8;

import android.media.MediaExtractor;
import android.media.MediaMetadataRetriever;
import java.io.IOException;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class d1 implements e1 {
    @Override // x8.e1
    public void initializeExtractor(MediaExtractor mediaExtractor, ByteBuffer byteBuffer) throws IOException {
        mediaExtractor.setDataSource(new c1(byteBuffer));
    }

    @Override // x8.e1
    public void initializeRetriever(MediaMetadataRetriever mediaMetadataRetriever, ByteBuffer byteBuffer) throws IllegalArgumentException {
        mediaMetadataRetriever.setDataSource(new c1(byteBuffer));
    }
}
