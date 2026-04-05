package qf;

import android.net.Uri;
import android.util.Base64;
import com.google.android.exoplayer2.h2;
import com.google.android.exoplayer2.util.n1;
import java.io.IOException;
import java.net.URLDecoder;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class l extends h {

    /* renamed from: e, reason: collision with root package name */
    public t f82957e;

    /* renamed from: f, reason: collision with root package name */
    public byte[] f82958f;

    /* renamed from: g, reason: collision with root package name */
    public int f82959g;

    /* renamed from: h, reason: collision with root package name */
    public int f82960h;

    public l() {
        super(false);
    }

    @Override // qf.h, qf.p
    public void close() {
        if (this.f82958f != null) {
            this.f82958f = null;
            b();
        }
        this.f82957e = null;
    }

    @Override // qf.h, qf.p
    public /* bridge */ /* synthetic */ Map getResponseHeaders() {
        return super.getResponseHeaders();
    }

    @Override // qf.h, qf.p
    public Uri getUri() {
        t tVar = this.f82957e;
        if (tVar != null) {
            return tVar.f82992a;
        }
        return null;
    }

    @Override // qf.h, qf.p
    public long open(t tVar) throws IOException {
        c(tVar);
        this.f82957e = tVar;
        Uri uri = tVar.f82992a;
        long j10 = tVar.f82998g;
        Uri uriNormalizeScheme = uri.normalizeScheme();
        String scheme = uriNormalizeScheme.getScheme();
        com.google.android.exoplayer2.util.a.checkArgument("data".equals(scheme), "Unsupported scheme: " + scheme);
        String[] strArrSplit = n1.split(uriNormalizeScheme.getSchemeSpecificPart(), ",");
        if (strArrSplit.length != 2) {
            throw h2.createForMalformedDataOfUnknownType("Unexpected URI format: " + uriNormalizeScheme, null);
        }
        String str = strArrSplit[1];
        if (strArrSplit[0].contains(";base64")) {
            try {
                this.f82958f = Base64.decode(str, 0);
            } catch (IllegalArgumentException e10) {
                throw h2.createForMalformedDataOfUnknownType("Error while parsing Base64 encoded string: " + str, e10);
            }
        } else {
            this.f82958f = n1.getUtf8Bytes(URLDecoder.decode(str, mh.h0.f74626a.name()));
        }
        long j11 = tVar.f82997f;
        byte[] bArr = this.f82958f;
        if (j11 > bArr.length) {
            this.f82958f = null;
            throw new q(2008);
        }
        int i10 = (int) j11;
        this.f82959g = i10;
        int length = bArr.length - i10;
        this.f82960h = length;
        if (j10 != -1) {
            this.f82960h = (int) Math.min(length, j10);
        }
        d(tVar);
        return j10 != -1 ? j10 : this.f82960h;
    }

    @Override // qf.h, qf.p, qf.k
    public int read(byte[] bArr, int i10, int i11) {
        if (i11 == 0) {
            return 0;
        }
        int i12 = this.f82960h;
        if (i12 == 0) {
            return -1;
        }
        int iMin = Math.min(i11, i12);
        System.arraycopy(n1.castNonNull(this.f82958f), this.f82959g, bArr, i10, iMin);
        this.f82959g += iMin;
        this.f82960h -= iMin;
        a(iMin);
        return iMin;
    }
}
