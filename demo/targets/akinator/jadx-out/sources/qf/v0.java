package qf;

import android.net.Uri;
import java.io.IOException;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class v0 implements p {

    /* renamed from: a, reason: collision with root package name */
    public static final v0 f83020a = new v0();

    @Override // qf.p
    public /* bridge */ /* synthetic */ Map getResponseHeaders() {
        return super.getResponseHeaders();
    }

    @Override // qf.p
    public Uri getUri() {
        return null;
    }

    @Override // qf.p
    public long open(t tVar) throws IOException {
        throw new IOException("PlaceholderDataSource cannot be opened");
    }

    @Override // qf.p, qf.k
    public int read(byte[] bArr, int i10, int i11) {
        throw new UnsupportedOperationException();
    }

    @Override // qf.p
    public void close() {
    }

    @Override // qf.p
    public void addTransferListener(c1 c1Var) {
    }
}
