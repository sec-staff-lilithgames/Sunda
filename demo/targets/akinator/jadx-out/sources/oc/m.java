package oc;

import java.io.IOException;
import java.util.Objects;
import java.util.Optional;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class m extends c1 implements mc.k {

    /* renamed from: f, reason: collision with root package name */
    public final Object[] f78893f;

    /* renamed from: g, reason: collision with root package name */
    public final Enum f78894g;

    /* renamed from: h, reason: collision with root package name */
    public final dd.k f78895h;

    /* renamed from: i, reason: collision with root package name */
    public volatile dd.k f78896i;

    /* renamed from: j, reason: collision with root package name */
    public final Boolean f78897j;

    /* renamed from: k, reason: collision with root package name */
    public final Boolean f78898k;

    /* renamed from: l, reason: collision with root package name */
    public final Boolean f78899l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f78900m;

    /* renamed from: n, reason: collision with root package name */
    public final dd.k f78901n;

    public m(m mVar, Boolean bool, Boolean bool2, Boolean bool3) {
        super(mVar);
        this.f78895h = mVar.f78895h;
        this.f78893f = mVar.f78893f;
        this.f78894g = mVar.f78894g;
        this.f78897j = Boolean.valueOf(Boolean.TRUE.equals(bool));
        this.f78900m = mVar.f78900m;
        this.f78898k = bool2;
        this.f78899l = bool3;
        this.f78901n = mVar.f78901n;
        this.f78896i = mVar.f78896i;
    }

    @Deprecated
    public static jc.q deserializerForCreator(jc.j jVar, Class<?> cls, rc.m mVar, mc.c0 c0Var, mc.z[] zVarArr) {
        return deserializerForCreator(jVar, cls, mVar, c0Var, zVarArr, null);
    }

    public static jc.q deserializerForNoArgsCreator(jc.j jVar, Class<?> cls, rc.m mVar) {
        if (jVar.canOverrideAccessModifiers()) {
            dd.i.checkAndFixAccess(mVar.getMember(), jVar.isEnabled(jc.y.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
        }
        return new p(cls, mVar);
    }

    public final Object V(String str, jc.k kVar) throws NumberFormatException, jc.r {
        char cCharAt;
        Object objFindCaseInsensitive;
        jc.k kVar2;
        lc.c cVarFindCoercionFromBlankString;
        Object objFind;
        dd.k kVarConstructLookup = this.f78901n;
        if (kVarConstructLookup == null) {
            if (kVar.isEnabled(jc.l.READ_ENUMS_USING_TO_STRING)) {
                kVarConstructLookup = this.f78896i;
                if (kVarConstructLookup == null) {
                    synchronized (this) {
                        try {
                            kVarConstructLookup = this.f78896i;
                            if (kVarConstructLookup == null) {
                                kVarConstructLookup = dd.n.constructUsingToString(kVar.getConfig(), handledType()).constructLookup();
                                this.f78896i = kVarConstructLookup;
                            }
                        } finally {
                        }
                    }
                }
            } else {
                kVarConstructLookup = this.f78895h;
            }
        }
        Object objFind2 = kVarConstructLookup.find(str);
        if (objFind2 != null) {
            return objFind2;
        }
        String strTrim = str.trim();
        if (strTrim != str && (objFind = kVarConstructLookup.find(strTrim)) != null) {
            return objFind;
        }
        Enum r11 = this.f78894g;
        String strTrim2 = strTrim.trim();
        if (strTrim2.isEmpty()) {
            if (W(kVar)) {
                return r11;
            }
            Boolean bool = this.f78899l;
            if (!(bool != null ? bool.booleanValue() : kVar.isEnabled(jc.l.READ_UNKNOWN_ENUM_VALUES_AS_NULL))) {
                if (strTrim.isEmpty()) {
                    cVarFindCoercionFromBlankString = kVar.findCoercionAction(logicalType(), handledType(), lc.f.f73109h);
                    kVar2 = kVar;
                    b(kVar2, cVarFindCoercionFromBlankString, handledType(), strTrim, "empty String (\"\")");
                } else {
                    kVar2 = kVar;
                    cVarFindCoercionFromBlankString = kVar2.findCoercionFromBlankString(logicalType(), handledType(), lc.c.f73085b);
                    b(kVar2, cVarFindCoercionFromBlankString, handledType(), strTrim, "blank String (all whitespace)");
                }
                int iOrdinal = cVarFindCoercionFromBlankString.ordinal();
                if (iOrdinal == 1 || iOrdinal == 3) {
                    return getEmptyValue(kVar2);
                }
            }
            return null;
        }
        if (Boolean.TRUE.equals(this.f78897j) && (objFindCaseInsensitive = kVarConstructLookup.findCaseInsensitive(strTrim2)) != null) {
            return objFindCaseInsensitive;
        }
        if (!kVar.isEnabled(jc.l.f69351k) && !this.f78900m && (cCharAt = strTrim2.charAt(0)) >= '0' && cCharAt <= '9' && (cCharAt != '0' || strTrim2.length() <= 1)) {
            try {
                int i10 = Integer.parseInt(strTrim2);
                if (!kVar.isEnabled(jc.y.ALLOW_COERCION_OF_SCALARS)) {
                    return kVar.handleWeirdStringValue(handledType(), strTrim2, "value looks like quoted Enum index, but `MapperFeature.ALLOW_COERCION_OF_SCALARS` prevents use", new Object[0]);
                }
                if (i10 >= 0) {
                    Object[] objArr = this.f78893f;
                    if (i10 < objArr.length) {
                        return objArr[i10];
                    }
                }
            } catch (NumberFormatException unused) {
            }
        }
        if (W(kVar)) {
            return r11;
        }
        Boolean bool2 = this.f78899l;
        if (bool2 != null ? bool2.booleanValue() : kVar.isEnabled(jc.l.READ_UNKNOWN_ENUM_VALUES_AS_NULL)) {
            return null;
        }
        return kVar.handleWeirdStringValue(handledType(), strTrim2, "not one of the values accepted for Enum class: %s", kVarConstructLookup.keys());
    }

    public final boolean W(jc.k kVar) {
        if (this.f78894g == null) {
            return false;
        }
        Boolean bool = this.f78898k;
        return bool != null ? bool.booleanValue() : kVar.isEnabled(jc.l.READ_UNKNOWN_ENUM_VALUES_USING_DEFAULT_VALUE);
    }

    @Override // mc.k
    public jc.q createContextual(jc.k kVar, jc.g gVar) throws jc.r {
        Boolean bool = (Boolean) Optional.ofNullable(s0.R(kVar, gVar, handledType(), tb.q.f86755c)).orElse(this.f78897j);
        tb.t tVarS = s0.S(kVar, gVar, handledType());
        Boolean bool2 = (Boolean) Optional.ofNullable(tVarS != null ? tVarS.getFeature(tb.q.f86757f) : null).orElse(this.f78898k);
        tb.t tVarS2 = s0.S(kVar, gVar, handledType());
        return withResolved(bool, bool2, (Boolean) Optional.ofNullable(tVarS2 != null ? tVarS2.getFeature(tb.q.f86756e) : null).orElse(this.f78899l));
    }

    @Override // jc.q
    public Object deserialize(ub.u uVar, jc.k kVar) throws IOException {
        m mVar;
        jc.k kVar2;
        if (uVar.hasToken(ub.z.VALUE_STRING)) {
            return V(uVar.getText(), kVar);
        }
        if (!uVar.hasToken(ub.z.VALUE_NUMBER_INT)) {
            return uVar.isExpectedStartObjectToken() ? V(kVar.extractScalarFromObject(uVar, this, this.f78945b), kVar) : uVar.hasToken(ub.z.START_ARRAY) ? n(uVar, kVar) : kVar.handleUnexpectedToken(handledType(), uVar);
        }
        if (this.f78900m) {
            return V(uVar.getText(), kVar);
        }
        int intValue = uVar.getIntValue();
        lc.c cVarFindCoercionAction = kVar.findCoercionAction(logicalType(), handledType(), lc.f.f73104b);
        if (cVarFindCoercionAction != lc.c.f73085b) {
            mVar = this;
            kVar2 = kVar;
        } else {
            if (kVar.isEnabled(jc.l.f69351k)) {
                return kVar.handleWeirdNumberValue(handledType(), Integer.valueOf(intValue), "not allowed to deserialize Enum value out of number: disable DeserializationConfig.DeserializationFeature.FAIL_ON_NUMBERS_FOR_ENUMS to allow", new Object[0]);
            }
            mVar = this;
            kVar2 = kVar;
            mVar.b(kVar2, cVarFindCoercionAction, handledType(), Integer.valueOf(intValue), o2.k(intValue, "Integer value (", ")"));
        }
        int iOrdinal = cVarFindCoercionAction.ordinal();
        if (iOrdinal == 2) {
            return null;
        }
        if (iOrdinal == 3) {
            return getEmptyValue(kVar2);
        }
        Object[] objArr = mVar.f78893f;
        if (intValue >= 0 && intValue < objArr.length) {
            return objArr[intValue];
        }
        if (W(kVar2)) {
            return mVar.f78894g;
        }
        Boolean bool = mVar.f78899l;
        if (bool != null ? bool.booleanValue() : kVar2.isEnabled(jc.l.READ_UNKNOWN_ENUM_VALUES_AS_NULL)) {
            return null;
        }
        return kVar2.handleWeirdNumberValue(handledType(), Integer.valueOf(intValue), "index value outside legal index range [0..%s]", Integer.valueOf(objArr.length - 1));
    }

    @Override // jc.q
    public Object getEmptyValue(jc.k kVar) throws jc.r {
        return this.f78894g;
    }

    @Override // jc.q
    public boolean isCachable() {
        return true;
    }

    @Override // oc.c1, jc.q
    public cd.h logicalType() {
        return cd.h.f12147k;
    }

    public m withResolved(Boolean bool, Boolean bool2, Boolean bool3) {
        return (Objects.equals(this.f78897j, bool) && Objects.equals(this.f78898k, bool2) && Objects.equals(this.f78899l, bool3)) ? this : new m(this, bool, bool2, bool3);
    }

    public static jc.q deserializerForCreator(jc.j jVar, Class<?> cls, rc.m mVar, mc.c0 c0Var, mc.z[] zVarArr, dd.n nVar) {
        if (jVar.canOverrideAccessModifiers()) {
            dd.i.checkAndFixAccess(mVar.getMember(), jVar.isEnabled(jc.y.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
        }
        return new p(cls, mVar, mVar.getParameterType(0), c0Var, zVarArr, nVar);
    }

    @Deprecated
    public m withResolved(Boolean bool) {
        return withResolved(bool, this.f78898k, this.f78899l);
    }

    @Deprecated
    public m(dd.n nVar, Boolean bool) {
        this(nVar, Boolean.TRUE.equals(bool), null);
    }

    @Deprecated
    public m(dd.n nVar, boolean z10, dd.n nVar2) {
        super(nVar.getEnumClass());
        this.f78895h = nVar.constructLookup();
        this.f78893f = nVar.getRawEnums();
        this.f78894g = nVar.getDefaultValue();
        this.f78897j = Boolean.valueOf(z10);
        this.f78900m = nVar.isFromIntValue();
        this.f78901n = nVar2 == null ? null : nVar2.constructLookup();
        this.f78896i = null;
    }

    public m(dd.n nVar, boolean z10, dd.n nVar2, dd.n nVar3) {
        super(nVar.getEnumClass());
        this.f78895h = nVar.constructLookup();
        this.f78893f = nVar.getRawEnums();
        this.f78894g = nVar.getDefaultValue();
        this.f78897j = Boolean.valueOf(z10);
        this.f78900m = nVar.isFromIntValue();
        this.f78901n = nVar2 == null ? null : nVar2.constructLookup();
        this.f78896i = nVar3 != null ? nVar3.constructLookup() : null;
    }
}
