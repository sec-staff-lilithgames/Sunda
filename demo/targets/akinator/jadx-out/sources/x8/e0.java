package x8;

import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class e0 implements n8.g {
    @Override // n8.g
    public int getOrientation(InputStream inputStream, q8.b bVar) throws IOException {
        int attributeInt = new v4.c(inputStream).getAttributeInt("Orientation", 1);
        if (attributeInt == 0) {
            return -1;
        }
        return attributeInt;
    }

    @Override // n8.g
    public ImageHeaderParser$ImageType getType(InputStream inputStream) {
        return ImageHeaderParser$ImageType.UNKNOWN;
    }

    @Override // n8.g
    public ImageHeaderParser$ImageType getType(ByteBuffer byteBuffer) {
        return ImageHeaderParser$ImageType.UNKNOWN;
    }

    @Override // n8.g
    public int getOrientation(ByteBuffer byteBuffer, q8.b bVar) throws IOException {
        return getOrientation(j9.b.toStream(byteBuffer), bVar);
    }
}
