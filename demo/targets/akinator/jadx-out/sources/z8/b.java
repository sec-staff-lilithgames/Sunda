package z8;

import android.graphics.ImageDecoder;
import android.os.Build;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.io.IOException;
import java.nio.ByteBuffer;
import n8.p;
import n8.v;
import n8.x;
import p8.v0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class b implements x {

    /* renamed from: a, reason: collision with root package name */
    public final d f97691a;

    public b(d dVar) {
        this.f97691a = dVar;
    }

    @Override // n8.x
    public v0 decode(ByteBuffer byteBuffer, int i10, int i11, v vVar) throws IOException {
        return d.a(ImageDecoder.createSource(byteBuffer), i10, i11, vVar);
    }

    @Override // n8.x
    public boolean handles(ByteBuffer byteBuffer, v vVar) throws IOException {
        ImageHeaderParser$ImageType type = p.getType(this.f97691a.f97693a, byteBuffer);
        if (type != ImageHeaderParser$ImageType.ANIMATED_WEBP) {
            return Build.VERSION.SDK_INT >= 31 && type == ImageHeaderParser$ImageType.ANIMATED_AVIF;
        }
        return true;
    }
}
