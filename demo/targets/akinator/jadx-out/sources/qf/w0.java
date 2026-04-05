package qf;

import android.net.Uri;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class w0 implements p {

    /* renamed from: a, reason: collision with root package name */
    public final p f83026a;

    /* renamed from: b, reason: collision with root package name */
    public final com.google.android.exoplayer2.util.x0 f83027b;

    /* renamed from: c, reason: collision with root package name */
    public final int f83028c;

    public w0(p pVar, com.google.android.exoplayer2.util.x0 x0Var, int i10) {
        this.f83026a = (p) com.google.android.exoplayer2.util.a.checkNotNull(pVar);
        this.f83027b = (com.google.android.exoplayer2.util.x0) com.google.android.exoplayer2.util.a.checkNotNull(x0Var);
        this.f83028c = i10;
    }

    @Override // qf.p
    public void addTransferListener(c1 c1Var) {
        com.google.android.exoplayer2.util.a.checkNotNull(c1Var);
        this.f83026a.addTransferListener(c1Var);
    }

    @Override // qf.p
    public void close() throws IOException {
        this.f83026a.close();
    }

    @Override // qf.p
    public Map<String, List<String>> getResponseHeaders() {
        return this.f83026a.getResponseHeaders();
    }

    @Override // qf.p
    public Uri getUri() {
        return this.f83026a.getUri();
    }

    @Override // qf.p
    public long open(t tVar) throws IOException {
        this.f83027b.proceedOrThrow(this.f83028c);
        return this.f83026a.open(tVar);
    }

    @Override // qf.p, qf.k
    public int read(byte[] bArr, int i10, int i11) throws IOException {
        this.f83027b.proceedOrThrow(this.f83028c);
        return this.f83026a.read(bArr, i10, i11);
    }
}
