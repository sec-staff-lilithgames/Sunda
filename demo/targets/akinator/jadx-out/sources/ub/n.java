package ub;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public enum n {
    AUTO_CLOSE_TARGET(true),
    AUTO_CLOSE_JSON_CONTENT(true),
    FLUSH_PASSED_TO_STREAM(true),
    QUOTE_FIELD_NAMES(true),
    QUOTE_NON_NUMERIC_NUMBERS(true),
    ESCAPE_NON_ASCII(false),
    WRITE_NUMBERS_AS_STRINGS(false),
    WRITE_BIGDECIMAL_AS_PLAIN(false),
    STRICT_DUPLICATE_DETECTION(false),
    IGNORE_UNKNOWN(false),
    USE_FAST_DOUBLE_WRITER(false),
    WRITE_HEX_UPPER_CASE(true),
    ESCAPE_FORWARD_SLASHES(false),
    COMBINE_UNICODE_SURROGATES_IN_UTF8(false);


    /* renamed from: b, reason: collision with root package name */
    public final boolean f88307b;

    /* renamed from: c, reason: collision with root package name */
    public final int f88308c = 1 << ordinal();

    n(boolean z10) {
        this.f88307b = z10;
    }

    public static int collectDefaults() {
        int mask = 0;
        for (n nVar : values()) {
            if (nVar.enabledByDefault()) {
                mask |= nVar.getMask();
            }
        }
        return mask;
    }

    public boolean enabledByDefault() {
        return this.f88307b;
    }

    public boolean enabledIn(int i10) {
        return (i10 & this.f88308c) != 0;
    }

    public int getMask() {
        return this.f88308c;
    }
}
