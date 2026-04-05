package z8;

import android.graphics.ImageDecoder;
import android.os.Build;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import n8.p;
import n8.v;
import n8.x;
import p8.v0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class c implements x {

    /* renamed from: a, reason: collision with root package name */
    public final d f97692a;

    public c(d dVar) {
        this.f97692a = dVar;
    }

    @Override // n8.x
    public boolean handles(InputStream inputStream, v vVar) throws IOException {
        d dVar = this.f97692a;
        ImageHeaderParser$ImageType type = p.getType((List<n8.g>) dVar.f97693a, inputStream, dVar.f97694b);
        if (type != ImageHeaderParser$ImageType.ANIMATED_WEBP) {
            return Build.VERSION.SDK_INT >= 31 && type == ImageHeaderParser$ImageType.ANIMATED_AVIF;
        }
        return true;
    }

    @Override // n8.x
    public v0 decode(InputStream inputStream, int i10, int i11, v vVar) throws IOException {
        return d.a(ImageDecoder.createSource(j9.b.fromStream(inputStream)), i10, i11, vVar);
    }
}
