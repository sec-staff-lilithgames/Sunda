package md;

import j1.o2;
import java.util.HashMap;
import java.util.Map;
import md.u;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class i extends u.a {

    /* renamed from: a, reason: collision with root package name */
    public String f74284a;

    /* renamed from: b, reason: collision with root package name */
    public Integer f74285b;

    /* renamed from: c, reason: collision with root package name */
    public t f74286c;

    /* renamed from: d, reason: collision with root package name */
    public Long f74287d;

    /* renamed from: e, reason: collision with root package name */
    public Long f74288e;

    /* renamed from: f, reason: collision with root package name */
    public HashMap f74289f;

    /* renamed from: g, reason: collision with root package name */
    public Integer f74290g;

    /* renamed from: h, reason: collision with root package name */
    public String f74291h;

    /* renamed from: i, reason: collision with root package name */
    public byte[] f74292i;

    /* renamed from: j, reason: collision with root package name */
    public byte[] f74293j;

    @Override // md.u.a
    public final Map a() {
        HashMap map = this.f74289f;
        if (map != null) {
            return map;
        }
        throw new IllegalStateException("Property \"autoMetadata\" has not been set");
    }

    @Override // md.u.a
    public final i b(HashMap map) {
        this.f74289f = map;
        return this;
    }

    @Override // md.u.a
    public u build() {
        String strL = this.f74284a == null ? " transportName" : "";
        if (this.f74286c == null) {
            strL = strL.concat(" encodedPayload");
        }
        if (this.f74287d == null) {
            strL = o2.l(strL, " eventMillis");
        }
        if (this.f74288e == null) {
            strL = o2.l(strL, " uptimeMillis");
        }
        if (this.f74289f == null) {
            strL = o2.l(strL, " autoMetadata");
        }
        if (strL.isEmpty()) {
            return new j(this.f74284a, this.f74285b, this.f74286c, this.f74287d.longValue(), this.f74288e.longValue(), this.f74289f, this.f74290g, this.f74291h, this.f74292i, this.f74293j);
        }
        throw new IllegalStateException("Missing required properties:".concat(strL));
    }

    @Override // md.u.a
    public u.a setCode(Integer num) {
        this.f74285b = num;
        return this;
    }

    @Override // md.u.a
    public u.a setEncodedPayload(t tVar) {
        if (tVar == null) {
            throw new NullPointerException("Null encodedPayload");
        }
        this.f74286c = tVar;
        return this;
    }

    @Override // md.u.a
    public u.a setEventMillis(long j10) {
        this.f74287d = Long.valueOf(j10);
        return this;
    }

    @Override // md.u.a
    public u.a setExperimentIdsClear(byte[] bArr) {
        this.f74292i = bArr;
        return this;
    }

    @Override // md.u.a
    public u.a setExperimentIdsEncrypted(byte[] bArr) {
        this.f74293j = bArr;
        return this;
    }

    @Override // md.u.a
    public u.a setProductId(Integer num) {
        this.f74290g = num;
        return this;
    }

    @Override // md.u.a
    public u.a setPseudonymousId(String str) {
        this.f74291h = str;
        return this;
    }

    @Override // md.u.a
    public u.a setTransportName(String str) {
        if (str == null) {
            throw new NullPointerException("Null transportName");
        }
        this.f74284a = str;
        return this;
    }

    @Override // md.u.a
    public u.a setUptimeMillis(long j10) {
        this.f74288e = Long.valueOf(j10);
        return this;
    }
}
