package j$.time.temporal;

/* loaded from: classes3.dex */
public enum j implements p {
    JULIAN_DAY("JulianDay", 2440588),
    MODIFIED_JULIAN_DAY("ModifiedJulianDay", 40587),
    RATA_DIE("RataDie", 719163);

    private static final long serialVersionUID = -7501623920830201812L;

    /* renamed from: a, reason: collision with root package name */
    public final transient String f68650a;

    /* renamed from: b, reason: collision with root package name */
    public final transient t f68651b;

    /* renamed from: c, reason: collision with root package name */
    public final transient long f68652c;

    @Override // j$.time.temporal.p
    public final boolean isDateBased() {
        return true;
    }

    static {
        ChronoUnit chronoUnit = ChronoUnit.NANOS;
    }

    j(String str, long j10) {
        this.f68650a = str;
        this.f68651b = t.e((-365243219162L) + j10, 365241780471L + j10);
        this.f68652c = j10;
    }

    @Override // j$.time.temporal.p
    public final l G(l lVar, long j10) {
        if (!this.f68651b.d(j10)) {
            throw new j$.time.c("Invalid value: " + this.f68650a + " " + j10);
        }
        return lVar.g(Math.subtractExact(j10, this.f68652c), a.EPOCH_DAY);
    }

    @Override // j$.time.temporal.p
    public final t range() {
        return this.f68651b;
    }

    @Override // j$.time.temporal.p
    public final boolean r(m mVar) {
        return mVar.e(a.EPOCH_DAY);
    }

    @Override // j$.time.temporal.p
    public final t t(m mVar) {
        if (mVar.e(a.EPOCH_DAY)) {
            return this.f68651b;
        }
        throw new j$.time.c("Unsupported field: " + this);
    }

    @Override // j$.time.temporal.p
    public final long D(m mVar) {
        return mVar.f(a.EPOCH_DAY) + this.f68652c;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f68650a;
    }
}
