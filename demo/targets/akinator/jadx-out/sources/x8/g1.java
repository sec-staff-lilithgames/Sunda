package x8;

import android.media.MediaExtractor;
import android.media.MediaMetadataRetriever;
import android.os.ParcelFileDescriptor;
import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class g1 implements e1 {
    @Override // x8.e1
    public void initializeExtractor(MediaExtractor mediaExtractor, ParcelFileDescriptor parcelFileDescriptor) throws IOException {
        mediaExtractor.setDataSource(parcelFileDescriptor.getFileDescriptor());
    }

    @Override // x8.e1
    public void initializeRetriever(MediaMetadataRetriever mediaMetadataRetriever, ParcelFileDescriptor parcelFileDescriptor) throws IllegalArgumentException {
        mediaMetadataRetriever.setDataSource(parcelFileDescriptor.getFileDescriptor());
    }
}
