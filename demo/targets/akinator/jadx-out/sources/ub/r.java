package ub;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public enum r {
    AUTO_CLOSE_SOURCE(true),
    ALLOW_COMMENTS(false),
    ALLOW_YAML_COMMENTS(false),
    ALLOW_UNQUOTED_FIELD_NAMES(false),
    ALLOW_SINGLE_QUOTES(false),
    ALLOW_UNQUOTED_CONTROL_CHARS(false),
    ALLOW_RS_CONTROL_CHAR(false),
    ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER(false),
    ALLOW_NUMERIC_LEADING_ZEROS(false),
    ALLOW_LEADING_PLUS_SIGN_FOR_NUMBERS(false),
    ALLOW_LEADING_DECIMAL_POINT_FOR_NUMBERS(false),
    ALLOW_TRAILING_DECIMAL_POINT_FOR_NUMBERS(false),
    ALLOW_NON_NUMERIC_NUMBERS(false),
    ALLOW_MISSING_VALUES(false),
    ALLOW_TRAILING_COMMA(false),
    STRICT_DUPLICATE_DETECTION(false),
    IGNORE_UNDEFINED(false),
    INCLUDE_SOURCE_IN_LOCATION(false),
    USE_FAST_DOUBLE_PARSER(false),
    USE_FAST_BIG_NUMBER_PARSER(false);


    /* renamed from: b, reason: collision with root package name */
    public final boolean f88347b;

    /* renamed from: c, reason: collision with root package name */
    public final int f88348c = 1 << ordinal();

    r(boolean z10) {
        this.f88347b = z10;
    }

    public static int collectDefaults() {
        int mask = 0;
        for (r rVar : values()) {
            if (rVar.enabledByDefault()) {
                mask |= rVar.getMask();
            }
        }
        return mask;
    }

    public boolean enabledByDefault() {
        return this.f88347b;
    }

    public boolean enabledIn(int i10) {
        return (i10 & this.f88348c) != 0;
    }

    public int getMask() {
        return this.f88348c;
    }
}
