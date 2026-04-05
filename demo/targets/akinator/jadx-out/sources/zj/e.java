package zj;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class e {

    /* renamed from: p, reason: collision with root package name */
    public static final e f98027p = new a().build();

    /* renamed from: a, reason: collision with root package name */
    public final long f98028a;

    /* renamed from: b, reason: collision with root package name */
    public final String f98029b;

    /* renamed from: c, reason: collision with root package name */
    public final String f98030c;

    /* renamed from: d, reason: collision with root package name */
    public final c f98031d;

    /* renamed from: e, reason: collision with root package name */
    public final d f98032e;

    /* renamed from: f, reason: collision with root package name */
    public final String f98033f;

    /* renamed from: g, reason: collision with root package name */
    public final String f98034g;

    /* renamed from: h, reason: collision with root package name */
    public final int f98035h;

    /* renamed from: i, reason: collision with root package name */
    public final int f98036i;

    /* renamed from: j, reason: collision with root package name */
    public final String f98037j;

    /* renamed from: k, reason: collision with root package name */
    public final long f98038k;

    /* renamed from: l, reason: collision with root package name */
    public final b f98039l;

    /* renamed from: m, reason: collision with root package name */
    public final String f98040m;

    /* renamed from: n, reason: collision with root package name */
    public final long f98041n;

    /* renamed from: o, reason: collision with root package name */
    public final String f98042o;

    public e(long j10, String str, String str2, c cVar, d dVar, String str3, String str4, int i10, int i11, String str5, long j11, b bVar, String str6, long j12, String str7) {
        this.f98028a = j10;
        this.f98029b = str;
        this.f98030c = str2;
        this.f98031d = cVar;
        this.f98032e = dVar;
        this.f98033f = str3;
        this.f98034g = str4;
        this.f98035h = i10;
        this.f98036i = i11;
        this.f98037j = str5;
        this.f98038k = j11;
        this.f98039l = bVar;
        this.f98040m = str6;
        this.f98041n = j12;
        this.f98042o = str7;
    }

    public static e getDefaultInstance() {
        return f98027p;
    }

    public static a newBuilder() {
        return new a();
    }

    public String getAnalyticsLabel() {
        return this.f98040m;
    }

    public long getBulkId() {
        return this.f98038k;
    }

    public long getCampaignId() {
        return this.f98041n;
    }

    public String getCollapseKey() {
        return this.f98034g;
    }

    public String getComposerLabel() {
        return this.f98042o;
    }

    public b getEvent() {
        return this.f98039l;
    }

    public String getInstanceId() {
        return this.f98030c;
    }

    public String getMessageId() {
        return this.f98029b;
    }

    public c getMessageType() {
        return this.f98031d;
    }

    public String getPackageName() {
        return this.f98033f;
    }

    public int getPriority() {
        return this.f98035h;
    }

    public long getProjectNumber() {
        return this.f98028a;
    }

    public d getSdkPlatform() {
        return this.f98032e;
    }

    public String getTopic() {
        return this.f98037j;
    }

    public int getTtl() {
        return this.f98036i;
    }
}
