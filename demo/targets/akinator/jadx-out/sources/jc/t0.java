package jc;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public enum t0 implements lc.g {
    WRAP_ROOT_VALUE(false),
    INDENT_OUTPUT(false),
    FAIL_ON_EMPTY_BEANS(true),
    FAIL_ON_SELF_REFERENCES(true),
    WRAP_EXCEPTIONS(true),
    FAIL_ON_UNWRAPPED_TYPE_IDENTIFIERS(true),
    WRITE_SELF_REFERENCES_AS_NULL(false),
    CLOSE_CLOSEABLE(false),
    FLUSH_AFTER_WRITE_VALUE(true),
    WRITE_DATES_AS_TIMESTAMPS(true),
    WRITE_DATE_KEYS_AS_TIMESTAMPS(false),
    /* JADX INFO: Fake field, exist only in values array */
    WRITE_DATES_WITH_ZONE_ID(false),
    /* JADX INFO: Fake field, exist only in values array */
    WRITE_DATES_WITH_CONTEXT_TIME_ZONE(true),
    /* JADX INFO: Fake field, exist only in values array */
    WRITE_DURATIONS_AS_TIMESTAMPS(true),
    WRITE_CHAR_ARRAYS_AS_JSON_ARRAYS(false),
    WRITE_ENUMS_USING_TO_STRING(false),
    WRITE_ENUMS_USING_INDEX(false),
    WRITE_ENUM_KEYS_USING_INDEX(false),
    WRITE_NULL_MAP_VALUES(true),
    WRITE_EMPTY_JSON_ARRAYS(true),
    WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED(false),
    WRITE_BIGDECIMAL_AS_PLAIN(false),
    /* JADX INFO: Fake field, exist only in values array */
    WRITE_DATE_TIMESTAMPS_AS_NANOSECONDS(true),
    ORDER_MAP_ENTRIES_BY_KEYS(false),
    FAIL_ON_ORDER_MAP_BY_INCOMPARABLE_KEY(true),
    EAGER_SERIALIZER_FETCH(true),
    USE_EQUALITY_FOR_OBJECT_ID(false);


    /* renamed from: b, reason: collision with root package name */
    public final boolean f69441b;

    /* renamed from: c, reason: collision with root package name */
    public final int f69442c = 1 << ordinal();

    t0(boolean z10) {
        this.f69441b = z10;
    }

    @Override // lc.g
    public boolean enabledByDefault() {
        return this.f69441b;
    }

    @Override // lc.g
    public boolean enabledIn(int i10) {
        return (i10 & this.f69442c) != 0;
    }

    @Override // lc.g
    public int getMask() {
        return this.f69442c;
    }
}
