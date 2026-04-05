package n8;

import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;
import x8.o0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public abstract class p {
    public static int a(List list, n nVar) throws IOException {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            int orientationAndRewind = nVar.getOrientationAndRewind((g) list.get(i10));
            if (orientationAndRewind != -1) {
                return orientationAndRewind;
            }
        }
        return -1;
    }

    public static ImageHeaderParser$ImageType b(List list, o oVar) throws IOException {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            ImageHeaderParser$ImageType typeAndRewind = oVar.getTypeAndRewind((g) list.get(i10));
            if (typeAndRewind != ImageHeaderParser$ImageType.UNKNOWN) {
                return typeAndRewind;
            }
        }
        return ImageHeaderParser$ImageType.UNKNOWN;
    }

    public static int getOrientation(List<g> list, ByteBuffer byteBuffer, q8.b bVar) throws IOException {
        if (byteBuffer == null) {
            return -1;
        }
        return a(list, new k(byteBuffer, bVar));
    }

    public static ImageHeaderParser$ImageType getType(List<g> list, InputStream inputStream, q8.b bVar) throws IOException {
        if (inputStream == null) {
            return ImageHeaderParser$ImageType.UNKNOWN;
        }
        if (!inputStream.markSupported()) {
            inputStream = new o0(inputStream, bVar);
        }
        inputStream.mark(5242880);
        return b(list, new h(inputStream));
    }

    public static int getOrientation(List<g> list, InputStream inputStream, q8.b bVar) throws IOException {
        if (inputStream == null) {
            return -1;
        }
        if (!inputStream.markSupported()) {
            inputStream = new o0(inputStream, bVar);
        }
        inputStream.mark(5242880);
        return a(list, new l(inputStream, bVar));
    }

    public static int getOrientation(List<g> list, ParcelFileDescriptorRewinder parcelFileDescriptorRewinder, q8.b bVar) throws IOException {
        return a(list, new m(parcelFileDescriptorRewinder, bVar));
    }

    public static ImageHeaderParser$ImageType getType(List<g> list, ByteBuffer byteBuffer) throws IOException {
        if (byteBuffer == null) {
            return ImageHeaderParser$ImageType.UNKNOWN;
        }
        return b(list, new i(byteBuffer));
    }

    public static ImageHeaderParser$ImageType getType(List<g> list, ParcelFileDescriptorRewinder parcelFileDescriptorRewinder, q8.b bVar) throws IOException {
        return b(list, new j(parcelFileDescriptorRewinder, bVar));
    }
}
