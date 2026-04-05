package oc;

import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.HashSet;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class d0 {

    /* renamed from: a, reason: collision with root package name */
    public static final HashSet f78801a = new HashSet();

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class a extends c1 {

        /* renamed from: f, reason: collision with root package name */
        public static final a f78802f = new a();

        public a() {
            super(BigDecimal.class);
        }

        @Override // jc.q
        public Object getEmptyValue(jc.k kVar) {
            return BigDecimal.ZERO;
        }

        @Override // oc.c1, jc.q
        public final cd.h logicalType() {
            return cd.h.f12145i;
        }

        @Override // jc.q
        public BigDecimal deserialize(ub.u uVar, jc.k kVar) throws IOException {
            String strExtractScalarFromObject;
            int iCurrentTokenId = uVar.currentTokenId();
            lc.c cVar = lc.c.f73088f;
            lc.c cVar2 = lc.c.f73087e;
            Class<?> cls = this.f78945b;
            if (iCurrentTokenId == 1) {
                strExtractScalarFromObject = kVar.extractScalarFromObject(uVar, this, cls);
            } else {
                if (iCurrentTokenId == 3) {
                    return (BigDecimal) n(uVar, kVar);
                }
                if (iCurrentTokenId != 6) {
                    if (iCurrentTokenId == 7) {
                        lc.c cVarH = h(uVar, kVar, cls);
                        if (cVarH == cVar2) {
                            return (BigDecimal) getNullValue(kVar);
                        }
                        if (cVarH == cVar) {
                            return (BigDecimal) getEmptyValue(kVar);
                        }
                    } else if (iCurrentTokenId != 8) {
                        return (BigDecimal) kVar.handleUnexpectedToken(getValueType(kVar), uVar);
                    }
                    return uVar.getDecimalValue();
                }
                strExtractScalarFromObject = uVar.getText();
            }
            lc.c cVarF = f(strExtractScalarFromObject, kVar);
            if (cVarF == cVar2) {
                return (BigDecimal) getNullValue(kVar);
            }
            if (cVarF == cVar) {
                return (BigDecimal) getEmptyValue(kVar);
            }
            String strTrim = strExtractScalarFromObject.trim();
            if (AbstractJsonLexerKt.NULL.equals(strTrim)) {
                return (BigDecimal) getNullValue(kVar);
            }
            if (cc.m.looksLikeValidNumber(strTrim)) {
                uVar.streamReadConstraints().validateFPLength(strTrim.length());
                try {
                    return cc.m.parseBigDecimal(strTrim, uVar.isEnabled(ub.g0.USE_FAST_BIG_NUMBER_PARSER));
                } catch (IllegalArgumentException unused) {
                }
            }
            return (BigDecimal) kVar.handleWeirdStringValue(cls, strTrim, "not a valid representation", new Object[0]);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class b extends c1 {

        /* renamed from: f, reason: collision with root package name */
        public static final b f78803f = new b();

        public b() {
            super(BigInteger.class);
        }

        @Override // jc.q
        public Object getEmptyValue(jc.k kVar) {
            return BigInteger.ZERO;
        }

        @Override // oc.c1, jc.q
        public final cd.h logicalType() {
            return cd.h.f12144h;
        }

        @Override // jc.q
        public BigInteger deserialize(ub.u uVar, jc.k kVar) throws IOException {
            String strExtractScalarFromObject;
            if (uVar.isExpectedNumberIntToken()) {
                return uVar.getBigIntegerValue();
            }
            int iCurrentTokenId = uVar.currentTokenId();
            lc.c cVar = lc.c.f73088f;
            lc.c cVar2 = lc.c.f73087e;
            Class<?> cls = this.f78945b;
            if (iCurrentTokenId == 1) {
                strExtractScalarFromObject = kVar.extractScalarFromObject(uVar, this, cls);
            } else {
                if (iCurrentTokenId == 3) {
                    return (BigInteger) n(uVar, kVar);
                }
                if (iCurrentTokenId != 6) {
                    if (iCurrentTokenId != 8) {
                        return (BigInteger) kVar.handleUnexpectedToken(getValueType(kVar), uVar);
                    }
                    lc.c cVarE = e(uVar, kVar, cls);
                    if (cVarE == cVar2) {
                        return (BigInteger) getNullValue(kVar);
                    }
                    if (cVarE == cVar) {
                        return (BigInteger) getEmptyValue(kVar);
                    }
                    BigDecimal decimalValue = uVar.getDecimalValue();
                    uVar.streamReadConstraints().validateBigIntegerScale(decimalValue.scale());
                    return decimalValue.toBigInteger();
                }
                strExtractScalarFromObject = uVar.getText();
            }
            lc.c cVarF = f(strExtractScalarFromObject, kVar);
            if (cVarF == cVar2) {
                return (BigInteger) getNullValue(kVar);
            }
            if (cVarF == cVar) {
                return (BigInteger) getEmptyValue(kVar);
            }
            String strTrim = strExtractScalarFromObject.trim();
            if (AbstractJsonLexerKt.NULL.equals(strTrim)) {
                return (BigInteger) getNullValue(kVar);
            }
            if (s0.t(strTrim)) {
                uVar.streamReadConstraints().validateIntegerLength(strTrim.length());
                try {
                    return cc.m.parseBigInteger(strTrim, uVar.isEnabled(ub.g0.USE_FAST_BIG_NUMBER_PARSER));
                } catch (IllegalArgumentException unused) {
                }
            }
            return (BigInteger) kVar.handleWeirdStringValue(cls, strTrim, "not a valid representation", new Object[0]);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class c extends e0 {

        /* renamed from: j, reason: collision with root package name */
        public static final c f78804j = new c(Boolean.TYPE, Boolean.FALSE);

        /* renamed from: k, reason: collision with root package name */
        public static final c f78805k = new c(Boolean.class, null);

        public c(Class<Boolean> cls, Boolean bool) {
            super(cls, cd.h.f12146j, bool, Boolean.FALSE);
        }

        @Override // oc.e0, jc.q
        public /* bridge */ /* synthetic */ Object getEmptyValue(jc.k kVar) throws jc.r {
            return super.getEmptyValue(kVar);
        }

        @Override // oc.e0, oc.c1, jc.q, mc.v
        public /* bridge */ /* synthetic */ dd.a getNullAccessPattern() {
            return super.getNullAccessPattern();
        }

        @Override // jc.q
        public Boolean deserialize(ub.u uVar, jc.k kVar) throws IOException {
            ub.z zVarCurrentToken = uVar.currentToken();
            return zVarCurrentToken == ub.z.VALUE_TRUE ? Boolean.TRUE : zVarCurrentToken == ub.z.VALUE_FALSE ? Boolean.FALSE : this.f78842i ? Boolean.valueOf(y(uVar, kVar)) : x(uVar, kVar, this.f78945b);
        }

        @Override // oc.c1, oc.s0, jc.q
        public Boolean deserializeWithType(ub.u uVar, jc.k kVar, wc.g gVar) throws IOException {
            ub.z zVarCurrentToken = uVar.currentToken();
            return zVarCurrentToken == ub.z.VALUE_TRUE ? Boolean.TRUE : zVarCurrentToken == ub.z.VALUE_FALSE ? Boolean.FALSE : this.f78842i ? Boolean.valueOf(y(uVar, kVar)) : x(uVar, kVar, this.f78945b);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class d extends e0 {

        /* renamed from: j, reason: collision with root package name */
        public static final d f78806j = new d(Byte.TYPE, (byte) 0);

        /* renamed from: k, reason: collision with root package name */
        public static final d f78807k = new d(Byte.class, null);

        public d(Class<Byte> cls, Byte b10) {
            super(cls, cd.h.f12144h, b10, (byte) 0);
        }

        @Override // oc.e0, jc.q
        public /* bridge */ /* synthetic */ Object getEmptyValue(jc.k kVar) throws jc.r {
            return super.getEmptyValue(kVar);
        }

        @Override // oc.e0, oc.c1, jc.q, mc.v
        public /* bridge */ /* synthetic */ dd.a getNullAccessPattern() {
            return super.getNullAccessPattern();
        }

        @Override // jc.q
        public Byte deserialize(ub.u uVar, jc.k kVar) throws IOException {
            String strExtractScalarFromObject;
            if (uVar.isExpectedNumberIntToken()) {
                return Byte.valueOf(uVar.getByteValue());
            }
            if (this.f78842i) {
                return Byte.valueOf(z(uVar, kVar));
            }
            int iCurrentTokenId = uVar.currentTokenId();
            lc.c cVar = lc.c.f73088f;
            lc.c cVar2 = lc.c.f73087e;
            Class<?> cls = this.f78945b;
            if (iCurrentTokenId == 1) {
                strExtractScalarFromObject = kVar.extractScalarFromObject(uVar, this, cls);
            } else {
                if (iCurrentTokenId == 3) {
                    return (Byte) n(uVar, kVar);
                }
                if (iCurrentTokenId == 11) {
                    return (Byte) getNullValue(kVar);
                }
                if (iCurrentTokenId != 6) {
                    if (iCurrentTokenId == 7) {
                        return Byte.valueOf(uVar.getByteValue());
                    }
                    if (iCurrentTokenId != 8) {
                        return (Byte) kVar.handleUnexpectedToken(getValueType(kVar), uVar);
                    }
                    lc.c cVarE = e(uVar, kVar, cls);
                    return cVarE == cVar2 ? (Byte) getNullValue(kVar) : cVarE == cVar ? (Byte) getEmptyValue(kVar) : Byte.valueOf(uVar.getByteValue());
                }
                strExtractScalarFromObject = uVar.getText();
            }
            lc.c cVarF = f(strExtractScalarFromObject, kVar);
            if (cVarF == cVar2) {
                return (Byte) getNullValue(kVar);
            }
            if (cVarF == cVar) {
                return (Byte) getEmptyValue(kVar);
            }
            String strTrim = strExtractScalarFromObject.trim();
            if (i(strTrim, kVar)) {
                return (Byte) getNullValue(kVar);
            }
            try {
                int i10 = cc.m.parseInt(strTrim);
                return (i10 < -128 || i10 > 255) ? (Byte) kVar.handleWeirdStringValue(cls, strTrim, "overflow, value cannot be represented as 8-bit value", new Object[0]) : Byte.valueOf((byte) i10);
            } catch (IllegalArgumentException unused) {
                return (Byte) kVar.handleWeirdStringValue(cls, strTrim, "not a valid Byte value", new Object[0]);
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class e extends e0 {

        /* renamed from: j, reason: collision with root package name */
        public static final e f78808j = new e(Character.TYPE, 0);

        /* renamed from: k, reason: collision with root package name */
        public static final e f78809k = new e(Character.class, null);

        public e(Class<Character> cls, Character ch2) {
            super(cls, cd.h.f12144h, ch2, (char) 0);
        }

        @Override // oc.e0, jc.q
        public /* bridge */ /* synthetic */ Object getEmptyValue(jc.k kVar) throws jc.r {
            return super.getEmptyValue(kVar);
        }

        @Override // oc.e0, oc.c1, jc.q, mc.v
        public /* bridge */ /* synthetic */ dd.a getNullAccessPattern() {
            return super.getNullAccessPattern();
        }

        @Override // jc.q
        public Character deserialize(ub.u uVar, jc.k kVar) throws IOException {
            jc.k kVar2;
            String strExtractScalarFromObject;
            jc.k kVar3;
            int iCurrentTokenId = uVar.currentTokenId();
            Class<?> cls = this.f78945b;
            if (iCurrentTokenId == 1) {
                kVar2 = kVar;
                strExtractScalarFromObject = kVar2.extractScalarFromObject(uVar, this, cls);
            } else {
                if (iCurrentTokenId == 3) {
                    return (Character) n(uVar, kVar);
                }
                if (iCurrentTokenId == 11) {
                    if (this.f78842i) {
                        N(kVar);
                    }
                    return (Character) getNullValue(kVar);
                }
                if (iCurrentTokenId != 6) {
                    if (iCurrentTokenId != 7) {
                        return (Character) kVar.handleUnexpectedToken(getValueType(kVar), uVar);
                    }
                    lc.c cVarFindCoercionAction = kVar.findCoercionAction(logicalType(), cls, lc.f.f73104b);
                    int iOrdinal = cVarFindCoercionAction.ordinal();
                    if (iOrdinal == 0) {
                        kVar3 = kVar;
                        b(kVar3, cVarFindCoercionAction, this.f78945b, uVar.getNumberValue(), "Integer value (" + uVar.getText() + ")");
                    } else {
                        if (iOrdinal != 2) {
                            if (iOrdinal == 3) {
                                return (Character) getEmptyValue(kVar);
                            }
                            int intValue = uVar.getIntValue();
                            return (intValue < 0 || intValue > 65535) ? (Character) kVar.handleWeirdNumberValue(handledType(), Integer.valueOf(intValue), "value outside valid Character range (0x0000 - 0xFFFF)", new Object[0]) : Character.valueOf((char) intValue);
                        }
                        kVar3 = kVar;
                    }
                    return (Character) getNullValue(kVar3);
                }
                kVar2 = kVar;
                strExtractScalarFromObject = uVar.getText();
            }
            if (strExtractScalarFromObject.length() == 1) {
                return Character.valueOf(strExtractScalarFromObject.charAt(0));
            }
            lc.c cVarF = f(strExtractScalarFromObject, kVar2);
            if (cVarF == lc.c.f73087e) {
                return (Character) getNullValue(kVar2);
            }
            if (cVarF == lc.c.f73088f) {
                return (Character) getEmptyValue(kVar2);
            }
            String strTrim = strExtractScalarFromObject.trim();
            return i(strTrim, kVar2) ? (Character) getNullValue(kVar2) : (Character) kVar2.handleWeirdStringValue(handledType(), strTrim, "Expected either Integer value code or 1-character String", new Object[0]);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class f extends e0 {

        /* renamed from: j, reason: collision with root package name */
        public static final f f78810j = new f(Double.TYPE, Double.valueOf(0.0d));

        /* renamed from: k, reason: collision with root package name */
        public static final f f78811k = new f(Double.class, null);

        public f(Class<Double> cls, Double d10) {
            super(cls, cd.h.f12145i, d10, Double.valueOf(0.0d));
        }

        public final Double V(ub.u uVar, jc.k kVar) throws IOException {
            String strExtractScalarFromObject;
            int iCurrentTokenId = uVar.currentTokenId();
            lc.c cVar = lc.c.f73088f;
            lc.c cVar2 = lc.c.f73087e;
            Class<?> cls = this.f78945b;
            if (iCurrentTokenId == 1) {
                strExtractScalarFromObject = kVar.extractScalarFromObject(uVar, this, cls);
            } else {
                if (iCurrentTokenId == 3) {
                    return (Double) n(uVar, kVar);
                }
                if (iCurrentTokenId == 11) {
                    return (Double) getNullValue(kVar);
                }
                if (iCurrentTokenId != 6) {
                    if (iCurrentTokenId == 7) {
                        lc.c cVarH = h(uVar, kVar, cls);
                        if (cVarH == cVar2) {
                            return (Double) getNullValue(kVar);
                        }
                        if (cVarH == cVar) {
                            return (Double) getEmptyValue(kVar);
                        }
                    } else if (iCurrentTokenId != 8) {
                        return (Double) kVar.handleUnexpectedToken(getValueType(kVar), uVar);
                    }
                    return Double.valueOf(uVar.getDoubleValue());
                }
                strExtractScalarFromObject = uVar.getText();
            }
            Double dC = s0.c(strExtractScalarFromObject);
            if (dC != null) {
                return dC;
            }
            lc.c cVarF = f(strExtractScalarFromObject, kVar);
            if (cVarF == cVar2) {
                return (Double) getNullValue(kVar);
            }
            if (cVarF == cVar) {
                return (Double) getEmptyValue(kVar);
            }
            String strTrim = strExtractScalarFromObject.trim();
            if (i(strTrim, kVar)) {
                return (Double) getNullValue(kVar);
            }
            if (cc.m.looksLikeValidNumber(strTrim)) {
                uVar.streamReadConstraints().validateFPLength(strTrim.length());
                try {
                    return Double.valueOf(cc.m.parseDouble(strTrim, uVar.isEnabled(ub.g0.USE_FAST_DOUBLE_PARSER)));
                } catch (IllegalArgumentException unused) {
                }
            }
            return (Double) kVar.handleWeirdStringValue(cls, strTrim, "not a valid `Double` value", new Object[0]);
        }

        @Override // oc.e0, jc.q
        public /* bridge */ /* synthetic */ Object getEmptyValue(jc.k kVar) throws jc.r {
            return super.getEmptyValue(kVar);
        }

        @Override // oc.e0, oc.c1, jc.q, mc.v
        public /* bridge */ /* synthetic */ dd.a getNullAccessPattern() {
            return super.getNullAccessPattern();
        }

        @Override // jc.q
        public Double deserialize(ub.u uVar, jc.k kVar) throws IOException {
            return uVar.hasToken(ub.z.VALUE_NUMBER_FLOAT) ? Double.valueOf(uVar.getDoubleValue()) : this.f78842i ? Double.valueOf(B(uVar, kVar)) : V(uVar, kVar);
        }

        @Override // oc.c1, oc.s0, jc.q
        public Double deserializeWithType(ub.u uVar, jc.k kVar, wc.g gVar) throws IOException {
            return uVar.hasToken(ub.z.VALUE_NUMBER_FLOAT) ? Double.valueOf(uVar.getDoubleValue()) : this.f78842i ? Double.valueOf(B(uVar, kVar)) : V(uVar, kVar);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class g extends e0 {

        /* renamed from: j, reason: collision with root package name */
        public static final g f78812j = new g(Float.TYPE, Float.valueOf(0.0f));

        /* renamed from: k, reason: collision with root package name */
        public static final g f78813k = new g(Float.class, null);

        public g(Class<Float> cls, Float f10) {
            super(cls, cd.h.f12145i, f10, Float.valueOf(0.0f));
        }

        @Override // oc.e0, jc.q
        public /* bridge */ /* synthetic */ Object getEmptyValue(jc.k kVar) throws jc.r {
            return super.getEmptyValue(kVar);
        }

        @Override // oc.e0, oc.c1, jc.q, mc.v
        public /* bridge */ /* synthetic */ dd.a getNullAccessPattern() {
            return super.getNullAccessPattern();
        }

        @Override // jc.q
        public Float deserialize(ub.u uVar, jc.k kVar) throws IOException {
            String strExtractScalarFromObject;
            if (uVar.hasToken(ub.z.VALUE_NUMBER_FLOAT)) {
                return Float.valueOf(uVar.getFloatValue());
            }
            if (this.f78842i) {
                return Float.valueOf(C(uVar, kVar));
            }
            int iCurrentTokenId = uVar.currentTokenId();
            lc.c cVar = lc.c.f73088f;
            lc.c cVar2 = lc.c.f73087e;
            Class<?> cls = this.f78945b;
            if (iCurrentTokenId == 1) {
                strExtractScalarFromObject = kVar.extractScalarFromObject(uVar, this, cls);
            } else {
                if (iCurrentTokenId == 3) {
                    return (Float) n(uVar, kVar);
                }
                if (iCurrentTokenId == 11) {
                    return (Float) getNullValue(kVar);
                }
                if (iCurrentTokenId != 6) {
                    if (iCurrentTokenId == 7) {
                        lc.c cVarH = h(uVar, kVar, cls);
                        if (cVarH == cVar2) {
                            return (Float) getNullValue(kVar);
                        }
                        if (cVarH == cVar) {
                            return (Float) getEmptyValue(kVar);
                        }
                    } else if (iCurrentTokenId != 8) {
                        return (Float) kVar.handleUnexpectedToken(getValueType(kVar), uVar);
                    }
                    return Float.valueOf(uVar.getFloatValue());
                }
                strExtractScalarFromObject = uVar.getText();
            }
            Float fD = s0.d(strExtractScalarFromObject);
            if (fD != null) {
                return fD;
            }
            lc.c cVarF = f(strExtractScalarFromObject, kVar);
            if (cVarF == cVar2) {
                return (Float) getNullValue(kVar);
            }
            if (cVarF == cVar) {
                return (Float) getEmptyValue(kVar);
            }
            String strTrim = strExtractScalarFromObject.trim();
            if (i(strTrim, kVar)) {
                return (Float) getNullValue(kVar);
            }
            if (cc.m.looksLikeValidNumber(strTrim)) {
                uVar.streamReadConstraints().validateFPLength(strTrim.length());
                try {
                    return Float.valueOf(cc.m.parseFloat(strTrim, uVar.isEnabled(ub.g0.USE_FAST_DOUBLE_PARSER)));
                } catch (IllegalArgumentException unused) {
                }
            }
            return (Float) kVar.handleWeirdStringValue(cls, strTrim, "not a valid `Float` value", new Object[0]);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class h extends e0 {

        /* renamed from: j, reason: collision with root package name */
        public static final h f78814j = new h(Integer.TYPE, 0);

        /* renamed from: k, reason: collision with root package name */
        public static final h f78815k = new h(Integer.class, null);

        public h(Class<Integer> cls, Integer num) {
            super(cls, cd.h.f12144h, num, 0);
        }

        @Override // oc.e0, jc.q
        public /* bridge */ /* synthetic */ Object getEmptyValue(jc.k kVar) throws jc.r {
            return super.getEmptyValue(kVar);
        }

        @Override // oc.e0, oc.c1, jc.q, mc.v
        public /* bridge */ /* synthetic */ dd.a getNullAccessPattern() {
            return super.getNullAccessPattern();
        }

        @Override // jc.q
        public boolean isCachable() {
            return true;
        }

        @Override // jc.q
        public Integer deserialize(ub.u uVar, jc.k kVar) throws IOException {
            return uVar.isExpectedNumberIntToken() ? Integer.valueOf(uVar.getIntValue()) : this.f78842i ? Integer.valueOf(E(uVar, kVar)) : F(uVar, kVar, Integer.class);
        }

        @Override // oc.c1, oc.s0, jc.q
        public Integer deserializeWithType(ub.u uVar, jc.k kVar, wc.g gVar) throws IOException {
            return uVar.isExpectedNumberIntToken() ? Integer.valueOf(uVar.getIntValue()) : this.f78842i ? Integer.valueOf(E(uVar, kVar)) : F(uVar, kVar, Integer.class);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class i extends e0 {

        /* renamed from: j, reason: collision with root package name */
        public static final i f78816j = new i(Long.TYPE, 0L);

        /* renamed from: k, reason: collision with root package name */
        public static final i f78817k = new i(Long.class, null);

        public i(Class<Long> cls, Long l9) {
            super(cls, cd.h.f12144h, l9, 0L);
        }

        @Override // oc.e0, jc.q
        public /* bridge */ /* synthetic */ Object getEmptyValue(jc.k kVar) throws jc.r {
            return super.getEmptyValue(kVar);
        }

        @Override // oc.e0, oc.c1, jc.q, mc.v
        public /* bridge */ /* synthetic */ dd.a getNullAccessPattern() {
            return super.getNullAccessPattern();
        }

        @Override // jc.q
        public boolean isCachable() {
            return true;
        }

        @Override // jc.q
        public Long deserialize(ub.u uVar, jc.k kVar) throws IOException {
            return uVar.isExpectedNumberIntToken() ? Long.valueOf(uVar.getLongValue()) : this.f78842i ? Long.valueOf(I(uVar, kVar)) : G(uVar, kVar, Long.class);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class j extends c1 {

        /* renamed from: f, reason: collision with root package name */
        public static final j f78818f = new j();

        public j() {
            super(Number.class);
        }

        @Override // jc.q
        public Object deserialize(ub.u uVar, jc.k kVar) throws IOException {
            String strExtractScalarFromObject;
            int iCurrentTokenId = uVar.currentTokenId();
            Class<?> cls = this.f78945b;
            if (iCurrentTokenId == 1) {
                strExtractScalarFromObject = kVar.extractScalarFromObject(uVar, this, cls);
            } else {
                if (iCurrentTokenId == 3) {
                    return n(uVar, kVar);
                }
                if (iCurrentTokenId != 6) {
                    return iCurrentTokenId != 7 ? iCurrentTokenId != 8 ? kVar.handleUnexpectedToken(getValueType(kVar), uVar) : (!kVar.isEnabled(jc.l.USE_BIG_DECIMAL_FOR_FLOATS) || uVar.isNaN()) ? uVar.getNumberValue() : uVar.getDecimalValue() : kVar.hasSomeOfFeatures(s0.f78944e) ? s0.l(uVar, kVar) : uVar.getNumberValue();
                }
                strExtractScalarFromObject = uVar.getText();
            }
            lc.c cVarF = f(strExtractScalarFromObject, kVar);
            if (cVarF == lc.c.f73087e) {
                return getNullValue(kVar);
            }
            if (cVarF == lc.c.f73088f) {
                return getEmptyValue(kVar);
            }
            String strTrim = strExtractScalarFromObject.trim();
            if (AbstractJsonLexerKt.NULL.equals(strTrim)) {
                return getNullValue(kVar);
            }
            if (s0.v(strTrim)) {
                return Double.valueOf(Double.POSITIVE_INFINITY);
            }
            if (s0.u(strTrim)) {
                return Double.valueOf(Double.NEGATIVE_INFINITY);
            }
            if ("NaN".equals(strTrim)) {
                return Double.valueOf(Double.NaN);
            }
            if (!s0.t(strTrim)) {
                if (cc.m.looksLikeValidNumber(strTrim)) {
                    uVar.streamReadConstraints().validateFPLength(strTrim.length());
                    return kVar.isEnabled(jc.l.USE_BIG_DECIMAL_FOR_FLOATS) ? cc.m.parseBigDecimal(strTrim, uVar.isEnabled(ub.g0.USE_FAST_BIG_NUMBER_PARSER)) : Double.valueOf(cc.m.parseDouble(strTrim, uVar.isEnabled(ub.g0.USE_FAST_DOUBLE_PARSER)));
                }
                return kVar.handleWeirdStringValue(cls, strTrim, "not a valid number", new Object[0]);
            }
            uVar.streamReadConstraints().validateIntegerLength(strTrim.length());
            if (kVar.isEnabled(jc.l.USE_BIG_INTEGER_FOR_INTS)) {
                return cc.m.parseBigInteger(strTrim, uVar.isEnabled(ub.g0.USE_FAST_BIG_NUMBER_PARSER));
            }
            long j10 = cc.m.parseLong(strTrim);
            return (kVar.isEnabled(jc.l.USE_LONG_FOR_INTS) || j10 > 2147483647L || j10 < -2147483648L) ? Long.valueOf(j10) : Integer.valueOf((int) j10);
        }

        @Override // oc.c1, oc.s0, jc.q
        public Object deserializeWithType(ub.u uVar, jc.k kVar, wc.g gVar) throws IOException {
            int iCurrentTokenId = uVar.currentTokenId();
            return (iCurrentTokenId == 6 || iCurrentTokenId == 7 || iCurrentTokenId == 8) ? deserialize(uVar, kVar) : gVar.deserializeTypedFromScalar(uVar, kVar);
        }

        @Override // oc.c1, jc.q
        public final cd.h logicalType() {
            return cd.h.f12144h;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class k extends e0 {

        /* renamed from: j, reason: collision with root package name */
        public static final k f78819j = new k(Short.TYPE, 0);

        /* renamed from: k, reason: collision with root package name */
        public static final k f78820k = new k(Short.class, null);

        public k(Class<Short> cls, Short sh2) {
            super(cls, cd.h.f12144h, sh2, (short) 0);
        }

        @Override // oc.e0, jc.q
        public /* bridge */ /* synthetic */ Object getEmptyValue(jc.k kVar) throws jc.r {
            return super.getEmptyValue(kVar);
        }

        @Override // oc.e0, oc.c1, jc.q, mc.v
        public /* bridge */ /* synthetic */ dd.a getNullAccessPattern() {
            return super.getNullAccessPattern();
        }

        @Override // jc.q
        public Short deserialize(ub.u uVar, jc.k kVar) throws IOException {
            String strExtractScalarFromObject;
            if (uVar.isExpectedNumberIntToken()) {
                return Short.valueOf(uVar.getShortValue());
            }
            if (this.f78842i) {
                return Short.valueOf(J(uVar, kVar));
            }
            int iCurrentTokenId = uVar.currentTokenId();
            lc.c cVar = lc.c.f73088f;
            lc.c cVar2 = lc.c.f73087e;
            Class<?> cls = this.f78945b;
            if (iCurrentTokenId == 1) {
                strExtractScalarFromObject = kVar.extractScalarFromObject(uVar, this, cls);
            } else {
                if (iCurrentTokenId == 3) {
                    return (Short) n(uVar, kVar);
                }
                if (iCurrentTokenId == 11) {
                    return (Short) getNullValue(kVar);
                }
                if (iCurrentTokenId != 6) {
                    if (iCurrentTokenId == 7) {
                        return Short.valueOf(uVar.getShortValue());
                    }
                    if (iCurrentTokenId != 8) {
                        return (Short) kVar.handleUnexpectedToken(getValueType(kVar), uVar);
                    }
                    lc.c cVarE = e(uVar, kVar, cls);
                    return cVarE == cVar2 ? (Short) getNullValue(kVar) : cVarE == cVar ? (Short) getEmptyValue(kVar) : Short.valueOf(uVar.getShortValue());
                }
                strExtractScalarFromObject = uVar.getText();
            }
            lc.c cVarF = f(strExtractScalarFromObject, kVar);
            if (cVarF == cVar2) {
                return (Short) getNullValue(kVar);
            }
            if (cVarF == cVar) {
                return (Short) getEmptyValue(kVar);
            }
            String strTrim = strExtractScalarFromObject.trim();
            if (i(strTrim, kVar)) {
                return (Short) getNullValue(kVar);
            }
            try {
                int i10 = cc.m.parseInt(strTrim);
                return (i10 < -32768 || i10 > 32767) ? (Short) kVar.handleWeirdStringValue(cls, strTrim, "overflow, value cannot be represented as 16-bit value", new Object[0]) : Short.valueOf((short) i10);
            } catch (IllegalArgumentException unused) {
                return (Short) kVar.handleWeirdStringValue(cls, strTrim, "not a valid Short value", new Object[0]);
            }
        }
    }

    static {
        Class[] clsArr = {Boolean.class, Byte.class, Short.class, Character.class, Integer.class, Long.class, Float.class, Double.class, Number.class, BigDecimal.class, BigInteger.class};
        for (int i10 = 0; i10 < 11; i10++) {
            f78801a.add(clsArr[i10].getName());
        }
    }

    public static jc.q find(Class<?> cls, String str) {
        if (cls.isPrimitive()) {
            if (cls == Integer.TYPE) {
                return h.f78814j;
            }
            if (cls == Boolean.TYPE) {
                return c.f78804j;
            }
            if (cls == Long.TYPE) {
                return i.f78816j;
            }
            if (cls == Double.TYPE) {
                return f.f78810j;
            }
            if (cls == Character.TYPE) {
                return e.f78808j;
            }
            if (cls == Byte.TYPE) {
                return d.f78806j;
            }
            if (cls == Short.TYPE) {
                return k.f78819j;
            }
            if (cls == Float.TYPE) {
                return g.f78812j;
            }
            if (cls == Void.TYPE) {
                return c0.f78800f;
            }
        } else {
            if (!f78801a.contains(str)) {
                return null;
            }
            if (cls == Integer.class) {
                return h.f78815k;
            }
            if (cls == Boolean.class) {
                return c.f78805k;
            }
            if (cls == Long.class) {
                return i.f78817k;
            }
            if (cls == Double.class) {
                return f.f78811k;
            }
            if (cls == Character.class) {
                return e.f78809k;
            }
            if (cls == Byte.class) {
                return d.f78807k;
            }
            if (cls == Short.class) {
                return k.f78820k;
            }
            if (cls == Float.class) {
                return g.f78813k;
            }
            if (cls == Number.class) {
                return j.f78818f;
            }
            if (cls == BigDecimal.class) {
                return a.f78802f;
            }
            if (cls == BigInteger.class) {
                return b.f78803f;
            }
        }
        throw new IllegalArgumentException("Internal error: can't find deserializer for ".concat(cls.getName()));
    }
}
