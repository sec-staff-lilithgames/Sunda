package jc;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public enum l implements lc.g {
    USE_BIG_DECIMAL_FOR_FLOATS(false),
    USE_BIG_INTEGER_FOR_INTS(false),
    USE_LONG_FOR_INTS(false),
    USE_JAVA_ARRAY_FOR_JSON_ARRAY(false),
    FAIL_ON_UNKNOWN_PROPERTIES(true),
    FAIL_ON_NULL_FOR_PRIMITIVES(false),
    f69351k(false),
    FAIL_ON_INVALID_SUBTYPE(true),
    FAIL_ON_READING_DUP_TREE_KEY(false),
    FAIL_ON_IGNORED_PROPERTIES(false),
    FAIL_ON_UNRESOLVED_OBJECT_IDS(true),
    FAIL_ON_MISSING_CREATOR_PROPERTIES(false),
    FAIL_ON_NULL_CREATOR_PROPERTIES(false),
    FAIL_ON_MISSING_EXTERNAL_TYPE_ID_PROPERTY(true),
    FAIL_ON_TRAILING_TOKENS(false),
    FAIL_ON_SUBTYPE_CLASS_NOT_REGISTERED(false),
    WRAP_EXCEPTIONS(true),
    FAIL_ON_UNEXPECTED_VIEW_PROPERTIES(false),
    ACCEPT_SINGLE_VALUE_AS_ARRAY(false),
    UNWRAP_SINGLE_VALUE_ARRAYS(false),
    UNWRAP_ROOT_VALUE(false),
    ACCEPT_EMPTY_STRING_AS_NULL_OBJECT(false),
    ACCEPT_EMPTY_ARRAY_AS_NULL_OBJECT(false),
    ACCEPT_FLOAT_AS_INT(true),
    READ_ENUMS_USING_TO_STRING(false),
    READ_UNKNOWN_ENUM_VALUES_AS_NULL(false),
    READ_UNKNOWN_ENUM_VALUES_USING_DEFAULT_VALUE(false),
    /* JADX INFO: Fake field, exist only in values array */
    READ_DATE_TIMESTAMPS_AS_NANOSECONDS(true),
    /* JADX INFO: Fake field, exist only in values array */
    ADJUST_DATES_TO_CONTEXT_TIME_ZONE(true),
    EAGER_DESERIALIZER_FETCH(true);


    /* renamed from: b, reason: collision with root package name */
    public final boolean f69367b;

    /* renamed from: c, reason: collision with root package name */
    public final int f69368c = 1 << ordinal();

    l(boolean z10) {
        this.f69367b = z10;
    }

    @Override // lc.g
    public boolean enabledByDefault() {
        return this.f69367b;
    }

    @Override // lc.g
    public boolean enabledIn(int i10) {
        return (i10 & this.f69368c) != 0;
    }

    @Override // lc.g
    public int getMask() {
        return this.f69368c;
    }
}
