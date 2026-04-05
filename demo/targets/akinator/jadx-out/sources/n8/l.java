package n8;

import java.io.IOException;
import java.io.InputStream;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class l implements n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InputStream f75845a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q8.b f75846b;

    public l(InputStream inputStream, q8.b bVar) {
        this.f75845a = inputStream;
        this.f75846b = bVar;
    }

    @Override // n8.n
    public int getOrientationAndRewind(g gVar) throws IOException {
        InputStream inputStream = this.f75845a;
        try {
            return gVar.getOrientation(inputStream, this.f75846b);
        } finally {
            inputStream.reset();
        }
    }
}
