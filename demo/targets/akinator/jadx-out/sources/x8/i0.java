package x8;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class i0 implements k0 {

    /* renamed from: a, reason: collision with root package name */
    public final com.bumptech.glide.load.data.q f91839a;

    /* renamed from: b, reason: collision with root package name */
    public final q8.b f91840b;

    /* renamed from: c, reason: collision with root package name */
    public final List f91841c;

    public i0(List list, InputStream inputStream, q8.b bVar) {
        this.f91840b = (q8.b) j9.q.checkNotNull(bVar);
        this.f91841c = (List) j9.q.checkNotNull(list);
        this.f91839a = new com.bumptech.glide.load.data.q(inputStream, bVar);
    }

    @Override // x8.k0
    public Bitmap decodeBitmap(BitmapFactory.Options options) throws IOException {
        return BitmapFactory.decodeStream(this.f91839a.rewindAndGet(), null, options);
    }

    @Override // x8.k0
    public int getImageOrientation() throws IOException {
        return n8.p.getOrientation((List<n8.g>) this.f91841c, this.f91839a.rewindAndGet(), this.f91840b);
    }

    @Override // x8.k0
    public ImageHeaderParser$ImageType getImageType() throws IOException {
        return n8.p.getType((List<n8.g>) this.f91841c, this.f91839a.rewindAndGet(), this.f91840b);
    }

    @Override // x8.k0
    public void stopGrowingBuffers() {
        this.f91839a.fixMarkLimits();
    }
}
