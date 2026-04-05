package x8;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class h0 implements k0 {

    /* renamed from: a, reason: collision with root package name */
    public final ByteBuffer f91828a;

    /* renamed from: b, reason: collision with root package name */
    public final List f91829b;

    /* renamed from: c, reason: collision with root package name */
    public final q8.b f91830c;

    public h0(List list, ByteBuffer byteBuffer, q8.b bVar) {
        this.f91828a = byteBuffer;
        this.f91829b = list;
        this.f91830c = bVar;
    }

    @Override // x8.k0
    public Bitmap decodeBitmap(BitmapFactory.Options options) {
        return BitmapFactory.decodeStream(j9.b.toStream(j9.b.rewind(this.f91828a)), null, options);
    }

    @Override // x8.k0
    public int getImageOrientation() throws IOException {
        return n8.p.getOrientation((List<n8.g>) this.f91829b, j9.b.rewind(this.f91828a), this.f91830c);
    }

    @Override // x8.k0
    public ImageHeaderParser$ImageType getImageType() throws IOException {
        return n8.p.getType(this.f91829b, j9.b.rewind(this.f91828a));
    }

    @Override // x8.k0
    public void stopGrowingBuffers() {
    }
}
