package io.odeeo.internal.a0;

import android.net.Uri;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class m implements io.odeeo.internal.p0.i {

    /* renamed from: a, reason: collision with root package name */
    public final io.odeeo.internal.p0.i f62404a;

    /* renamed from: b, reason: collision with root package name */
    public final int f62405b;

    /* renamed from: c, reason: collision with root package name */
    public final a f62406c;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f62407d;

    /* renamed from: e, reason: collision with root package name */
    public int f62408e;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface a {
        void onIcyMetadata(io.odeeo.internal.q0.x xVar);
    }

    public m(io.odeeo.internal.p0.i iVar, int i10, a aVar) {
        io.odeeo.internal.q0.a.checkArgument(i10 > 0);
        this.f62404a = iVar;
        this.f62405b = i10;
        this.f62406c = aVar;
        this.f62407d = new byte[1];
        this.f62408e = i10;
    }

    public final boolean a() throws IOException {
        if (this.f62404a.read(this.f62407d, 0, 1) == -1) {
            return false;
        }
        int i10 = (this.f62407d[0] & 255) << 4;
        if (i10 == 0) {
            return true;
        }
        byte[] bArr = new byte[i10];
        int i11 = i10;
        int i12 = 0;
        while (i11 > 0) {
            int i13 = this.f62404a.read(bArr, i12, i11);
            if (i13 == -1) {
                return false;
            }
            i12 += i13;
            i11 -= i13;
        }
        while (i10 > 0 && bArr[i10 - 1] == 0) {
            i10--;
        }
        if (i10 > 0) {
            this.f62406c.onIcyMetadata(new io.odeeo.internal.q0.x(bArr, i10));
        }
        return true;
    }

    @Override // io.odeeo.internal.p0.i
    public void addTransferListener(io.odeeo.internal.p0.b0 b0Var) {
        io.odeeo.internal.q0.a.checkNotNull(b0Var);
        this.f62404a.addTransferListener(b0Var);
    }

    @Override // io.odeeo.internal.p0.i
    public void close() {
        throw new UnsupportedOperationException();
    }

    @Override // io.odeeo.internal.p0.i
    public Map<String, List<String>> getResponseHeaders() {
        return this.f62404a.getResponseHeaders();
    }

    @Override // io.odeeo.internal.p0.i
    public Uri getUri() {
        return this.f62404a.getUri();
    }

    @Override // io.odeeo.internal.p0.i
    public long open(io.odeeo.internal.p0.m mVar) {
        throw new UnsupportedOperationException();
    }

    @Override // io.odeeo.internal.p0.i, io.odeeo.internal.p0.g
    public int read(byte[] bArr, int i10, int i11) throws IOException {
        if (this.f62408e == 0) {
            if (!a()) {
                return -1;
            }
            this.f62408e = this.f62405b;
        }
        int i12 = this.f62404a.read(bArr, i10, Math.min(this.f62408e, i11));
        if (i12 != -1) {
            this.f62408e -= i12;
        }
        return i12;
    }
}
