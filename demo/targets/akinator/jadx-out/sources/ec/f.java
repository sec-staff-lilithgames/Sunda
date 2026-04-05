package ec;

import ub.r;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public enum f implements ub.f {
    /* JADX INFO: Fake field, exist only in values array */
    ALLOW_JAVA_COMMENTS(r.ALLOW_COMMENTS),
    /* JADX INFO: Fake field, exist only in values array */
    ALLOW_YAML_COMMENTS(r.ALLOW_YAML_COMMENTS),
    /* JADX INFO: Fake field, exist only in values array */
    ALLOW_SINGLE_QUOTES(r.ALLOW_SINGLE_QUOTES),
    /* JADX INFO: Fake field, exist only in values array */
    ALLOW_UNQUOTED_FIELD_NAMES(r.ALLOW_UNQUOTED_FIELD_NAMES),
    /* JADX INFO: Fake field, exist only in values array */
    ALLOW_UNESCAPED_CONTROL_CHARS(r.ALLOW_UNQUOTED_CONTROL_CHARS),
    /* JADX INFO: Fake field, exist only in values array */
    ALLOW_RS_CONTROL_CHAR(r.ALLOW_RS_CONTROL_CHAR),
    /* JADX INFO: Fake field, exist only in values array */
    ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER(r.ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER),
    /* JADX INFO: Fake field, exist only in values array */
    ALLOW_LEADING_ZEROS_FOR_NUMBERS(r.ALLOW_NUMERIC_LEADING_ZEROS),
    ALLOW_LEADING_PLUS_SIGN_FOR_NUMBERS(r.ALLOW_LEADING_PLUS_SIGN_FOR_NUMBERS),
    ALLOW_LEADING_DECIMAL_POINT_FOR_NUMBERS(r.ALLOW_LEADING_DECIMAL_POINT_FOR_NUMBERS),
    ALLOW_TRAILING_DECIMAL_POINT_FOR_NUMBERS(r.ALLOW_TRAILING_DECIMAL_POINT_FOR_NUMBERS),
    /* JADX INFO: Fake field, exist only in values array */
    ALLOW_NON_NUMERIC_NUMBERS(r.ALLOW_NON_NUMERIC_NUMBERS),
    /* JADX INFO: Fake field, exist only in values array */
    ALLOW_MISSING_VALUES(r.ALLOW_MISSING_VALUES),
    /* JADX INFO: Fake field, exist only in values array */
    ALLOW_TRAILING_COMMA(r.ALLOW_TRAILING_COMMA);


    /* renamed from: b, reason: collision with root package name */
    public final int f54043b = 1 << ordinal();

    /* renamed from: c, reason: collision with root package name */
    public final r f54044c;

    f(r rVar) {
        this.f54044c = rVar;
    }

    public static int collectDefaults() {
        int mask = 0;
        for (f fVar : values()) {
            if (fVar.enabledByDefault()) {
                mask |= fVar.getMask();
            }
        }
        return mask;
    }

    @Override // ub.f, ic.k
    public boolean enabledByDefault() {
        return false;
    }

    @Override // ub.f, ic.k
    public boolean enabledIn(int i10) {
        return (i10 & this.f54043b) != 0;
    }

    @Override // ub.f, ic.k
    public int getMask() {
        return this.f54043b;
    }

    public r mappedFeature() {
        return this.f54044c;
    }
}
