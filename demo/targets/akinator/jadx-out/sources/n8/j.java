package n8;

import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import java.io.FileInputStream;
import x8.o0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class j implements o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ParcelFileDescriptorRewinder f75841a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q8.b f75842b;

    public j(ParcelFileDescriptorRewinder parcelFileDescriptorRewinder, q8.b bVar) {
        this.f75841a = parcelFileDescriptorRewinder;
        this.f75842b = bVar;
    }

    @Override // n8.o
    public ImageHeaderParser$ImageType getTypeAndRewind(g gVar) throws Throwable {
        ParcelFileDescriptorRewinder parcelFileDescriptorRewinder = this.f75841a;
        o0 o0Var = null;
        try {
            o0 o0Var2 = new o0(new FileInputStream(parcelFileDescriptorRewinder.rewindAndGet().getFileDescriptor()), this.f75842b);
            try {
                ImageHeaderParser$ImageType type = gVar.getType(o0Var2);
                o0Var2.release();
                parcelFileDescriptorRewinder.rewindAndGet();
                return type;
            } catch (Throwable th2) {
                th = th2;
                o0Var = o0Var2;
                if (o0Var != null) {
                    o0Var.release();
                }
                parcelFileDescriptorRewinder.rewindAndGet();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }
}
