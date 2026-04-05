package x8;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.ParcelFileDescriptor;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import java.io.IOException;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class j0 implements k0 {

    /* renamed from: a, reason: collision with root package name */
    public final q8.b f91843a;

    /* renamed from: b, reason: collision with root package name */
    public final List f91844b;

    /* renamed from: c, reason: collision with root package name */
    public final ParcelFileDescriptorRewinder f91845c;

    public j0(ParcelFileDescriptor parcelFileDescriptor, List list, q8.b bVar) {
        this.f91843a = (q8.b) j9.q.checkNotNull(bVar);
        this.f91844b = (List) j9.q.checkNotNull(list);
        this.f91845c = new ParcelFileDescriptorRewinder(parcelFileDescriptor);
    }

    @Override // x8.k0
    public Bitmap decodeBitmap(BitmapFactory.Options options) throws IOException {
        return BitmapFactory.decodeFileDescriptor(this.f91845c.rewindAndGet().getFileDescriptor(), null, options);
    }

    @Override // x8.k0
    public int getImageOrientation() throws IOException {
        return n8.p.getOrientation((List<n8.g>) this.f91844b, this.f91845c, this.f91843a);
    }

    @Override // x8.k0
    public ImageHeaderParser$ImageType getImageType() throws IOException {
        return n8.p.getType((List<n8.g>) this.f91844b, this.f91845c, this.f91843a);
    }

    @Override // x8.k0
    public void stopGrowingBuffers() {
    }
}
