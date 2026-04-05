package b9;

import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;
import n8.p;
import n8.v;
import n8.x;
import p8.v0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class n implements x {

    /* renamed from: a, reason: collision with root package name */
    public final List f8972a;

    /* renamed from: b, reason: collision with root package name */
    public final x f8973b;

    /* renamed from: c, reason: collision with root package name */
    public final q8.b f8974c;

    public n(List<n8.g> list, x xVar, q8.b bVar) {
        this.f8972a = list;
        this.f8973b = xVar;
        this.f8974c = bVar;
    }

    @Override // n8.x
    public v0 decode(InputStream inputStream, int i10, int i11, v vVar) throws IOException {
        byte[] byteArray;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(16384);
        try {
            byte[] bArr = new byte[16384];
            while (true) {
                int i12 = inputStream.read(bArr);
                if (i12 == -1) {
                    break;
                }
                byteArrayOutputStream.write(bArr, 0, i12);
            }
            byteArrayOutputStream.flush();
            byteArray = byteArrayOutputStream.toByteArray();
        } catch (IOException e10) {
            if (Log.isLoggable("StreamGifDecoder", 5)) {
                Log.w("StreamGifDecoder", "Error reading data from stream", e10);
            }
            byteArray = null;
        }
        if (byteArray == null) {
            return null;
        }
        return this.f8973b.decode(ByteBuffer.wrap(byteArray), i10, i11, vVar);
    }

    @Override // n8.x
    public boolean handles(InputStream inputStream, v vVar) throws IOException {
        return !((Boolean) vVar.get(m.f8971b)).booleanValue() && p.getType((List<n8.g>) this.f8972a, inputStream, this.f8974c) == ImageHeaderParser$ImageType.GIF;
    }
}
