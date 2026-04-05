package io.odeeo.internal.p0;

import android.net.Uri;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class a0 implements i {

    /* renamed from: a, reason: collision with root package name */
    public final i f65583a;

    /* renamed from: b, reason: collision with root package name */
    public long f65584b;

    /* renamed from: c, reason: collision with root package name */
    public Uri f65585c = Uri.EMPTY;

    /* renamed from: d, reason: collision with root package name */
    public Map<String, List<String>> f65586d = Collections.EMPTY_MAP;

    public a0(i iVar) {
        this.f65583a = (i) io.odeeo.internal.q0.a.checkNotNull(iVar);
    }

    @Override // io.odeeo.internal.p0.i
    public void addTransferListener(b0 b0Var) {
        io.odeeo.internal.q0.a.checkNotNull(b0Var);
        this.f65583a.addTransferListener(b0Var);
    }

    @Override // io.odeeo.internal.p0.i
    public void close() throws IOException {
        this.f65583a.close();
    }

    public long getBytesRead() {
        return this.f65584b;
    }

    public Uri getLastOpenedUri() {
        return this.f65585c;
    }

    public Map<String, List<String>> getLastResponseHeaders() {
        return this.f65586d;
    }

    @Override // io.odeeo.internal.p0.i
    public Map<String, List<String>> getResponseHeaders() {
        return this.f65583a.getResponseHeaders();
    }

    @Override // io.odeeo.internal.p0.i
    public Uri getUri() {
        return this.f65583a.getUri();
    }

    @Override // io.odeeo.internal.p0.i
    public long open(m mVar) throws IOException {
        this.f65585c = mVar.f65626a;
        this.f65586d = Collections.EMPTY_MAP;
        long jOpen = this.f65583a.open(mVar);
        this.f65585c = (Uri) io.odeeo.internal.q0.a.checkNotNull(getUri());
        this.f65586d = getResponseHeaders();
        return jOpen;
    }

    @Override // io.odeeo.internal.p0.i, io.odeeo.internal.p0.g
    public int read(byte[] bArr, int i10, int i11) throws IOException {
        int i12 = this.f65583a.read(bArr, i10, i11);
        if (i12 != -1) {
            this.f65584b += i12;
        }
        return i12;
    }

    public void resetBytesRead() {
        this.f65584b = 0L;
    }
}
