package wr;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class a2 {

    /* renamed from: a, reason: collision with root package name */
    public String f90800a;

    /* renamed from: b, reason: collision with root package name */
    public b2 f90801b;

    /* renamed from: c, reason: collision with root package name */
    public Long f90802c;

    /* renamed from: d, reason: collision with root package name */
    public v2 f90803d;

    /* renamed from: e, reason: collision with root package name */
    public v2 f90804e;

    public c2 build() {
        mh.p1.checkNotNull(this.f90800a, "description");
        mh.p1.checkNotNull(this.f90801b, "severity");
        mh.p1.checkNotNull(this.f90802c, "timestampNanos");
        mh.p1.checkState(this.f90803d == null || this.f90804e == null, "at least one of channelRef and subchannelRef must be null");
        return new c2(this.f90800a, this.f90801b, this.f90802c.longValue(), this.f90803d, this.f90804e);
    }

    public a2 setChannelRef(v2 v2Var) {
        this.f90803d = v2Var;
        return this;
    }

    public a2 setDescription(String str) {
        this.f90800a = str;
        return this;
    }

    public a2 setSeverity(b2 b2Var) {
        this.f90801b = b2Var;
        return this;
    }

    public a2 setSubchannelRef(v2 v2Var) {
        this.f90804e = v2Var;
        return this;
    }

    public a2 setTimestampNanos(long j10) {
        this.f90802c = Long.valueOf(j10);
        return this;
    }
}
