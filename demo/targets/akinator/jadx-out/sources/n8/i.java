package n8;

import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.io.IOException;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class i implements o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ByteBuffer f75840a;

    public i(ByteBuffer byteBuffer) {
        this.f75840a = byteBuffer;
    }

    @Override // n8.o
    public ImageHeaderParser$ImageType getTypeAndRewind(g gVar) throws IOException {
        ByteBuffer byteBuffer = this.f75840a;
        try {
            return gVar.getType(byteBuffer);
        } finally {
            j9.b.rewind(byteBuffer);
        }
    }
}
