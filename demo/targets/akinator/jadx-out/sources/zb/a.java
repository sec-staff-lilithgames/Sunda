package zb;

import cc.l;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import ub.k;
import ub.u;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final InputStream f97736a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f97737b;

    /* renamed from: c, reason: collision with root package name */
    public final int f97738c;

    /* renamed from: d, reason: collision with root package name */
    public final int f97739d;

    /* renamed from: e, reason: collision with root package name */
    public final k f97740e;

    /* renamed from: f, reason: collision with root package name */
    public final d f97741f;

    public a(InputStream inputStream, byte[] bArr, int i10, int i11, k kVar, d dVar) {
        this.f97736a = inputStream;
        this.f97737b = bArr;
        this.f97738c = i10;
        this.f97739d = i11;
        this.f97740e = kVar;
        this.f97741f = dVar;
        if ((i10 | i11) < 0 || i10 + i11 > bArr.length) {
            throw new IllegalArgumentException(String.format("Illegal start/length (%d/%d) wrt input array of %d bytes", Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(bArr.length)));
        }
    }

    public u createParserWithMatch() throws IOException {
        k kVar = this.f97740e;
        if (kVar == null) {
            return null;
        }
        if (this.f97736a != null) {
            return kVar.createParser(getDataStream());
        }
        return kVar.createParser(this.f97737b, this.f97738c, this.f97739d);
    }

    public InputStream getDataStream() {
        if (this.f97736a == null) {
            return new ByteArrayInputStream(this.f97737b, this.f97738c, this.f97739d);
        }
        return new l(null, this.f97736a, this.f97737b, this.f97738c, this.f97739d);
    }

    public k getMatch() {
        return this.f97740e;
    }

    public d getMatchStrength() {
        d dVar = this.f97741f;
        return dVar == null ? d.f97748c : dVar;
    }

    public String getMatchedFormatName() {
        if (hasMatch()) {
            return getMatch().getFormatName();
        }
        return null;
    }

    public boolean hasMatch() {
        return this.f97740e != null;
    }
}
