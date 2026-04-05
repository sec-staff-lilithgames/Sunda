package ki;

import j1.o2;
import java.util.List;
import ki.f2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class d0 extends f2.a.b {

    /* renamed from: a, reason: collision with root package name */
    public int f71197a;

    /* renamed from: b, reason: collision with root package name */
    public String f71198b;

    /* renamed from: c, reason: collision with root package name */
    public int f71199c;

    /* renamed from: d, reason: collision with root package name */
    public int f71200d;

    /* renamed from: e, reason: collision with root package name */
    public long f71201e;

    /* renamed from: f, reason: collision with root package name */
    public long f71202f;

    /* renamed from: g, reason: collision with root package name */
    public long f71203g;

    /* renamed from: h, reason: collision with root package name */
    public String f71204h;

    /* renamed from: i, reason: collision with root package name */
    public List f71205i;

    /* renamed from: j, reason: collision with root package name */
    public byte f71206j;

    @Override // ki.f2.a.b
    public f2.a build() {
        String str;
        if (this.f71206j == 63 && (str = this.f71198b) != null) {
            return new e0(this.f71197a, str, this.f71199c, this.f71200d, this.f71201e, this.f71202f, this.f71203g, this.f71204h, this.f71205i);
        }
        StringBuilder sb2 = new StringBuilder();
        if ((this.f71206j & 1) == 0) {
            sb2.append(" pid");
        }
        if (this.f71198b == null) {
            sb2.append(" processName");
        }
        if ((this.f71206j & 2) == 0) {
            sb2.append(" reasonCode");
        }
        if ((this.f71206j & 4) == 0) {
            sb2.append(" importance");
        }
        if ((this.f71206j & 8) == 0) {
            sb2.append(" pss");
        }
        if ((this.f71206j & 16) == 0) {
            sb2.append(" rss");
        }
        if ((this.f71206j & 32) == 0) {
            sb2.append(" timestamp");
        }
        throw new IllegalStateException(o2.m("Missing required properties:", sb2));
    }

    @Override // ki.f2.a.b
    public f2.a.b setBuildIdMappingForArch(List<f2.a.AbstractC0714a> list) {
        this.f71205i = list;
        return this;
    }

    @Override // ki.f2.a.b
    public f2.a.b setImportance(int i10) {
        this.f71200d = i10;
        this.f71206j = (byte) (this.f71206j | 4);
        return this;
    }

    @Override // ki.f2.a.b
    public f2.a.b setPid(int i10) {
        this.f71197a = i10;
        this.f71206j = (byte) (this.f71206j | 1);
        return this;
    }

    @Override // ki.f2.a.b
    public f2.a.b setProcessName(String str) {
        if (str == null) {
            throw new NullPointerException("Null processName");
        }
        this.f71198b = str;
        return this;
    }

    @Override // ki.f2.a.b
    public f2.a.b setPss(long j10) {
        this.f71201e = j10;
        this.f71206j = (byte) (this.f71206j | 8);
        return this;
    }

    @Override // ki.f2.a.b
    public f2.a.b setReasonCode(int i10) {
        this.f71199c = i10;
        this.f71206j = (byte) (this.f71206j | 2);
        return this;
    }

    @Override // ki.f2.a.b
    public f2.a.b setRss(long j10) {
        this.f71202f = j10;
        this.f71206j = (byte) (this.f71206j | 16);
        return this;
    }

    @Override // ki.f2.a.b
    public f2.a.b setTimestamp(long j10) {
        this.f71203g = j10;
        this.f71206j = (byte) (this.f71206j | 32);
        return this;
    }

    @Override // ki.f2.a.b
    public f2.a.b setTraceFile(String str) {
        this.f71204h = str;
        return this;
    }
}
