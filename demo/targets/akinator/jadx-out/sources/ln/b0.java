package ln;

import android.net.Uri;
import java.io.IOException;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class b0 implements i {

    /* renamed from: a, reason: collision with root package name */
    public static final b0 f73423a = new b0();

    @Override // ln.i
    public /* bridge */ /* synthetic */ Map getResponseHeaders() {
        return super.getResponseHeaders();
    }

    @Override // ln.i
    public Uri getUri() {
        return null;
    }

    @Override // ln.i
    public long open(m mVar) throws IOException {
        throw new IOException("PlaceholderDataSource cannot be opened");
    }

    @Override // ln.i, gn.o
    public int read(byte[] bArr, int i10, int i11) {
        throw new UnsupportedOperationException();
    }

    @Override // ln.i
    public void close() {
    }

    @Override // ln.i
    public void addTransferListener(g0 g0Var) {
    }
}
