package n8;

import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class h implements o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InputStream f75839a;

    public h(InputStream inputStream) {
        this.f75839a = inputStream;
    }

    @Override // n8.o
    public ImageHeaderParser$ImageType getTypeAndRewind(g gVar) throws IOException {
        InputStream inputStream = this.f75839a;
        try {
            return gVar.getType(inputStream);
        } finally {
            inputStream.reset();
        }
    }
}
