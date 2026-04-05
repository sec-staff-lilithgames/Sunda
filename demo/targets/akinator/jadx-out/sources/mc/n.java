package mc;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import jc.h0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final InputStream f74208a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f74209b;

    /* renamed from: c, reason: collision with root package name */
    public final int f74210c;

    /* renamed from: d, reason: collision with root package name */
    public final int f74211d;

    /* renamed from: e, reason: collision with root package name */
    public final h0 f74212e;

    /* renamed from: f, reason: collision with root package name */
    public final zb.d f74213f;

    public n(InputStream inputStream, byte[] bArr, int i10, int i11, h0 h0Var, zb.d dVar) {
        this.f74208a = inputStream;
        this.f74209b = bArr;
        this.f74210c = i10;
        this.f74211d = i11;
        this.f74212e = h0Var;
        this.f74213f = dVar;
    }

    public ub.u createParserWithMatch() throws IOException {
        h0 h0Var = this.f74212e;
        if (h0Var == null) {
            return null;
        }
        ub.k factory = h0Var.getFactory();
        if (this.f74208a != null) {
            return factory.createParser(getDataStream());
        }
        return factory.createParser(this.f74209b, this.f74210c, this.f74211d);
    }

    public InputStream getDataStream() {
        if (this.f74208a == null) {
            return new ByteArrayInputStream(this.f74209b, this.f74210c, this.f74211d);
        }
        return new cc.l(null, this.f74208a, this.f74209b, this.f74210c, this.f74211d);
    }

    public zb.d getMatchStrength() {
        zb.d dVar = this.f74213f;
        return dVar == null ? zb.d.f97748c : dVar;
    }

    public String getMatchedFormatName() {
        return this.f74212e.getFactory().getFormatName();
    }

    public h0 getReader() {
        return this.f74212e;
    }

    public boolean hasMatch() {
        return this.f74212e != null;
    }
}
