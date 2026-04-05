package zj;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public long f97999a = 0;

    /* renamed from: b, reason: collision with root package name */
    public String f98000b = "";

    /* renamed from: c, reason: collision with root package name */
    public String f98001c = "";

    /* renamed from: d, reason: collision with root package name */
    public c f98002d = c.UNKNOWN;

    /* renamed from: e, reason: collision with root package name */
    public d f98003e = d.UNKNOWN_OS;

    /* renamed from: f, reason: collision with root package name */
    public String f98004f = "";

    /* renamed from: g, reason: collision with root package name */
    public String f98005g = "";

    /* renamed from: h, reason: collision with root package name */
    public int f98006h = 0;

    /* renamed from: i, reason: collision with root package name */
    public int f98007i = 0;

    /* renamed from: j, reason: collision with root package name */
    public String f98008j = "";

    /* renamed from: k, reason: collision with root package name */
    public long f98009k = 0;

    /* renamed from: l, reason: collision with root package name */
    public b f98010l = b.UNKNOWN_EVENT;

    /* renamed from: m, reason: collision with root package name */
    public String f98011m = "";

    /* renamed from: n, reason: collision with root package name */
    public long f98012n = 0;

    /* renamed from: o, reason: collision with root package name */
    public String f98013o = "";

    public e build() {
        return new e(this.f97999a, this.f98000b, this.f98001c, this.f98002d, this.f98003e, this.f98004f, this.f98005g, this.f98006h, this.f98007i, this.f98008j, this.f98009k, this.f98010l, this.f98011m, this.f98012n, this.f98013o);
    }

    public a setAnalyticsLabel(String str) {
        this.f98011m = str;
        return this;
    }

    public a setBulkId(long j10) {
        this.f98009k = j10;
        return this;
    }

    public a setCampaignId(long j10) {
        this.f98012n = j10;
        return this;
    }

    public a setCollapseKey(String str) {
        this.f98005g = str;
        return this;
    }

    public a setComposerLabel(String str) {
        this.f98013o = str;
        return this;
    }

    public a setEvent(b bVar) {
        this.f98010l = bVar;
        return this;
    }

    public a setInstanceId(String str) {
        this.f98001c = str;
        return this;
    }

    public a setMessageId(String str) {
        this.f98000b = str;
        return this;
    }

    public a setMessageType(c cVar) {
        this.f98002d = cVar;
        return this;
    }

    public a setPackageName(String str) {
        this.f98004f = str;
        return this;
    }

    public a setPriority(int i10) {
        this.f98006h = i10;
        return this;
    }

    public a setProjectNumber(long j10) {
        this.f97999a = j10;
        return this;
    }

    public a setSdkPlatform(d dVar) {
        this.f98003e = dVar;
        return this;
    }

    public a setTopic(String str) {
        this.f98008j = str;
        return this;
    }

    public a setTtl(int i10) {
        this.f98007i = i10;
        return this;
    }
}
