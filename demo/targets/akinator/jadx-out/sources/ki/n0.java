package ki;

import j1.o2;
import java.util.List;
import ki.f2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class n0 extends f2.e.b {

    /* renamed from: a, reason: collision with root package name */
    public String f71360a;

    /* renamed from: b, reason: collision with root package name */
    public String f71361b;

    /* renamed from: c, reason: collision with root package name */
    public String f71362c;

    /* renamed from: d, reason: collision with root package name */
    public long f71363d;

    /* renamed from: e, reason: collision with root package name */
    public Long f71364e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f71365f;

    /* renamed from: g, reason: collision with root package name */
    public f2.e.a f71366g;

    /* renamed from: h, reason: collision with root package name */
    public f2.e.f f71367h;

    /* renamed from: i, reason: collision with root package name */
    public f2.e.AbstractC0732e f71368i;

    /* renamed from: j, reason: collision with root package name */
    public f2.e.c f71369j;

    /* renamed from: k, reason: collision with root package name */
    public List f71370k;

    /* renamed from: l, reason: collision with root package name */
    public int f71371l;

    /* renamed from: m, reason: collision with root package name */
    public byte f71372m;

    @Override // ki.f2.e.b
    public f2.e build() {
        String str;
        String str2;
        f2.e.a aVar;
        if (this.f71372m == 7 && (str = this.f71360a) != null && (str2 = this.f71361b) != null && (aVar = this.f71366g) != null) {
            return new o0(str, str2, this.f71362c, this.f71363d, this.f71364e, this.f71365f, aVar, this.f71367h, this.f71368i, this.f71369j, this.f71370k, this.f71371l);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.f71360a == null) {
            sb2.append(" generator");
        }
        if (this.f71361b == null) {
            sb2.append(" identifier");
        }
        if ((this.f71372m & 1) == 0) {
            sb2.append(" startedAt");
        }
        if ((this.f71372m & 2) == 0) {
            sb2.append(" crashed");
        }
        if (this.f71366g == null) {
            sb2.append(" app");
        }
        if ((this.f71372m & 4) == 0) {
            sb2.append(" generatorType");
        }
        throw new IllegalStateException(o2.m("Missing required properties:", sb2));
    }

    @Override // ki.f2.e.b
    public f2.e.b setApp(f2.e.a aVar) {
        if (aVar == null) {
            throw new NullPointerException("Null app");
        }
        this.f71366g = aVar;
        return this;
    }

    @Override // ki.f2.e.b
    public f2.e.b setAppQualitySessionId(String str) {
        this.f71362c = str;
        return this;
    }

    @Override // ki.f2.e.b
    public f2.e.b setCrashed(boolean z10) {
        this.f71365f = z10;
        this.f71372m = (byte) (this.f71372m | 2);
        return this;
    }

    @Override // ki.f2.e.b
    public f2.e.b setDevice(f2.e.c cVar) {
        this.f71369j = cVar;
        return this;
    }

    @Override // ki.f2.e.b
    public f2.e.b setEndedAt(Long l9) {
        this.f71364e = l9;
        return this;
    }

    @Override // ki.f2.e.b
    public f2.e.b setEvents(List<f2.e.d> list) {
        this.f71370k = list;
        return this;
    }

    @Override // ki.f2.e.b
    public f2.e.b setGenerator(String str) {
        if (str == null) {
            throw new NullPointerException("Null generator");
        }
        this.f71360a = str;
        return this;
    }

    @Override // ki.f2.e.b
    public f2.e.b setGeneratorType(int i10) {
        this.f71371l = i10;
        this.f71372m = (byte) (this.f71372m | 4);
        return this;
    }

    @Override // ki.f2.e.b
    public f2.e.b setIdentifier(String str) {
        if (str == null) {
            throw new NullPointerException("Null identifier");
        }
        this.f71361b = str;
        return this;
    }

    @Override // ki.f2.e.b
    public f2.e.b setOs(f2.e.AbstractC0732e abstractC0732e) {
        this.f71368i = abstractC0732e;
        return this;
    }

    @Override // ki.f2.e.b
    public f2.e.b setStartedAt(long j10) {
        this.f71363d = j10;
        this.f71372m = (byte) (this.f71372m | 1);
        return this;
    }

    @Override // ki.f2.e.b
    public f2.e.b setUser(f2.e.f fVar) {
        this.f71367h = fVar;
        return this;
    }
}
