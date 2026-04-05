package ln;

import android.net.Uri;
import android.util.Base64;
import gn.z0;
import io.bidmachine.media3.common.util.a1;
import java.io.IOException;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class e extends b {

    /* renamed from: e, reason: collision with root package name */
    public m f73439e;

    /* renamed from: f, reason: collision with root package name */
    public byte[] f73440f;

    /* renamed from: g, reason: collision with root package name */
    public int f73441g;

    /* renamed from: h, reason: collision with root package name */
    public int f73442h;

    public e() {
        super(false);
    }

    @Override // ln.b, ln.i
    public void close() {
        if (this.f73440f != null) {
            this.f73440f = null;
            b();
        }
        this.f73439e = null;
    }

    @Override // ln.b, ln.i
    public /* bridge */ /* synthetic */ Map getResponseHeaders() {
        return super.getResponseHeaders();
    }

    @Override // ln.b, ln.i
    public Uri getUri() {
        m mVar = this.f73439e;
        if (mVar != null) {
            return mVar.f73467a;
        }
        return null;
    }

    @Override // ln.b, ln.i
    public long open(m mVar) throws IOException {
        c(mVar);
        this.f73439e = mVar;
        Uri uri = mVar.f73467a;
        long j10 = mVar.f73473g;
        Uri uriNormalizeScheme = uri.normalizeScheme();
        String scheme = uriNormalizeScheme.getScheme();
        io.bidmachine.media3.common.util.a.checkArgument("data".equals(scheme), "Unsupported scheme: " + scheme);
        String[] strArrSplit = a1.split(uriNormalizeScheme.getSchemeSpecificPart(), ",");
        if (strArrSplit.length != 2) {
            throw z0.createForMalformedDataOfUnknownType("Unexpected URI format: " + uriNormalizeScheme, null);
        }
        String str = strArrSplit[1];
        if (strArrSplit[0].contains(";base64")) {
            try {
                this.f73440f = Base64.decode(str, 0);
            } catch (IllegalArgumentException e10) {
                throw z0.createForMalformedDataOfUnknownType("Error while parsing Base64 encoded string: " + str, e10);
            }
        } else {
            this.f73440f = a1.getUtf8Bytes(URLDecoder.decode(str, StandardCharsets.US_ASCII.name()));
        }
        long j11 = mVar.f73472f;
        byte[] bArr = this.f73440f;
        if (j11 > bArr.length) {
            this.f73440f = null;
            throw new j(2008);
        }
        int i10 = (int) j11;
        this.f73441g = i10;
        int length = bArr.length - i10;
        this.f73442h = length;
        if (j10 != -1) {
            this.f73442h = (int) Math.min(length, j10);
        }
        d(mVar);
        return j10 != -1 ? j10 : this.f73442h;
    }

    @Override // ln.b, ln.i, gn.o
    public int read(byte[] bArr, int i10, int i11) {
        if (i11 == 0) {
            return 0;
        }
        int i12 = this.f73442h;
        if (i12 == 0) {
            return -1;
        }
        int iMin = Math.min(i11, i12);
        System.arraycopy(a1.castNonNull(this.f73440f), this.f73441g, bArr, i10, iMin);
        this.f73441g += iMin;
        this.f73442h -= iMin;
        a(iMin);
        return iMin;
    }
}
