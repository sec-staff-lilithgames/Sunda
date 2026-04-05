package jc;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public enum y implements lc.g {
    USE_ANNOTATIONS(true),
    USE_GETTERS_AS_SETTERS(true),
    PROPAGATE_TRANSIENT_MARKER(false),
    AUTO_DETECT_CREATORS(true),
    AUTO_DETECT_FIELDS(true),
    AUTO_DETECT_GETTERS(true),
    AUTO_DETECT_IS_GETTERS(true),
    AUTO_DETECT_SETTERS(true),
    REQUIRE_SETTERS_FOR_GETTERS(false),
    ALLOW_FINAL_FIELDS_AS_MUTATORS(true),
    INFER_PROPERTY_MUTATORS(true),
    INFER_CREATOR_FROM_CONSTRUCTOR_PROPERTIES(true),
    ALLOW_VOID_VALUED_PROPERTIES(false),
    CAN_OVERRIDE_ACCESS_MODIFIERS(true),
    OVERRIDE_PUBLIC_ACCESS_MODIFIERS(true),
    INVERSE_READ_WRITE_ACCESS(false),
    USE_STATIC_TYPING(false),
    USE_BASE_TYPE_AS_DEFAULT_IMPL(false),
    INFER_BUILDER_TYPE_BINDINGS(true),
    REQUIRE_TYPE_ID_FOR_SUBTYPES(true),
    DEFAULT_VIEW_INCLUSION(true),
    SORT_PROPERTIES_ALPHABETICALLY(false),
    SORT_CREATOR_PROPERTIES_FIRST(true),
    SORT_CREATOR_PROPERTIES_BY_DECLARATION_ORDER(false),
    ACCEPT_CASE_INSENSITIVE_PROPERTIES(false),
    ACCEPT_CASE_INSENSITIVE_ENUMS(false),
    ACCEPT_CASE_INSENSITIVE_VALUES(false),
    USE_WRAPPER_NAME_AS_PROPERTY_NAME(false),
    USE_STD_BEAN_NAMING(false),
    ALLOW_EXPLICIT_PROPERTY_RENAMING(false),
    ALLOW_IS_GETTERS_FOR_NON_BOOLEAN(false),
    ALLOW_COERCION_OF_SCALARS(true),
    IGNORE_DUPLICATE_MODULE_REGISTRATIONS(true),
    IGNORE_MERGE_FOR_UNMERGEABLE(true),
    BLOCK_UNSAFE_POLYMORPHIC_BASE_TYPES(false),
    /* JADX INFO: Fake field, exist only in values array */
    APPLY_DEFAULT_VALUES(true),
    REQUIRE_HANDLERS_FOR_JAVA8_OPTIONALS(true),
    REQUIRE_HANDLERS_FOR_JAVA8_TIMES(true);


    /* renamed from: b, reason: collision with root package name */
    public final boolean f69479b;

    /* renamed from: c, reason: collision with root package name */
    public final long f69480c = 1 << ordinal();

    y(boolean z10) {
        this.f69479b = z10;
    }

    public static long collectLongDefaults() {
        long longMask = 0;
        for (y yVar : values()) {
            if (yVar.enabledByDefault()) {
                longMask |= yVar.getLongMask();
            }
        }
        return longMask;
    }

    @Override // lc.g
    public boolean enabledByDefault() {
        return this.f69479b;
    }

    @Override // lc.g
    @Deprecated
    public boolean enabledIn(int i10) {
        return (((long) i10) & this.f69480c) != 0;
    }

    public long getLongMask() {
        return this.f69480c;
    }

    @Override // lc.g
    @Deprecated
    public int getMask() {
        return (int) this.f69480c;
    }

    public boolean enabledIn(long j10) {
        return (j10 & this.f69480c) != 0;
    }
}
