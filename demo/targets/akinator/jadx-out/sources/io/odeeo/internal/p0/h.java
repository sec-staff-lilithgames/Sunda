package io.odeeo.internal.p0;

import android.net.Uri;
import android.util.Base64;
import io.odeeo.internal.q0.g0;
import java.io.IOException;
import java.net.URLDecoder;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class h extends e {

    /* renamed from: e, reason: collision with root package name */
    public m f65615e;

    /* renamed from: f, reason: collision with root package name */
    public byte[] f65616f;

    /* renamed from: g, reason: collision with root package name */
    public int f65617g;

    /* renamed from: h, reason: collision with root package name */
    public int f65618h;

    public h() {
        super(false);
    }

    @Override // io.odeeo.internal.p0.e, io.odeeo.internal.p0.i
    public void close() {
        if (this.f65616f != null) {
            this.f65616f = null;
            a();
        }
        this.f65615e = null;
    }

    @Override // io.odeeo.internal.p0.e, io.odeeo.internal.p0.i
    public Uri getUri() {
        m mVar = this.f65615e;
        if (mVar != null) {
            return mVar.f65626a;
        }
        return null;
    }

    @Override // io.odeeo.internal.p0.e, io.odeeo.internal.p0.i
    public long open(m mVar) throws IOException {
        a(mVar);
        this.f65615e = mVar;
        Uri uri = mVar.f65626a;
        String scheme = uri.getScheme();
        io.odeeo.internal.q0.a.checkArgument("data".equals(scheme), "Unsupported scheme: " + scheme);
        String[] strArrSplit = g0.split(uri.getSchemeSpecificPart(), ",");
        if (strArrSplit.length != 2) {
            throw io.odeeo.internal.b.g0.createForMalformedDataOfUnknownType("Unexpected URI format: " + uri, null);
        }
        String str = strArrSplit[1];
        if (strArrSplit[0].contains(";base64")) {
            try {
                this.f65616f = Base64.decode(str, 0);
            } catch (IllegalArgumentException e10) {
                throw io.odeeo.internal.b.g0.createForMalformedDataOfUnknownType("Error while parsing Base64 encoded string: " + str, e10);
            }
        } else {
            this.f65616f = g0.getUtf8Bytes(URLDecoder.decode(str, io.odeeo.internal.t0.e.f66404a.name()));
        }
        long j10 = mVar.f65632g;
        byte[] bArr = this.f65616f;
        if (j10 > bArr.length) {
            this.f65616f = null;
            throw new j(2008);
        }
        int i10 = (int) j10;
        this.f65617g = i10;
        int length = bArr.length - i10;
        this.f65618h = length;
        long j11 = mVar.f65633h;
        if (j11 != -1) {
            this.f65618h = (int) Math.min(length, j11);
        }
        b(mVar);
        long j12 = mVar.f65633h;
        return j12 != -1 ? j12 : this.f65618h;
    }

    @Override // io.odeeo.internal.p0.i, io.odeeo.internal.p0.g
    public int read(byte[] bArr, int i10, int i11) {
        if (i11 == 0) {
            return 0;
        }
        int i12 = this.f65618h;
        if (i12 == 0) {
            return -1;
        }
        int iMin = Math.min(i11, i12);
        System.arraycopy(g0.castNonNull(this.f65616f), this.f65617g, bArr, i10, iMin);
        this.f65617g += iMin;
        this.f65618h -= iMin;
        a(iMin);
        return iMin;
    }
}
