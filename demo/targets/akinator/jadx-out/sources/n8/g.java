package n8;

import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public interface g {
    int getOrientation(InputStream inputStream, q8.b bVar) throws IOException;

    int getOrientation(ByteBuffer byteBuffer, q8.b bVar) throws IOException;

    ImageHeaderParser$ImageType getType(InputStream inputStream) throws IOException;

    ImageHeaderParser$ImageType getType(ByteBuffer byteBuffer) throws IOException;
}
