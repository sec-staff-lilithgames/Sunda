package oc;

import com.apm.insight.b.El.rJqlArycrfkilN;
import j1.o2;
import java.io.IOException;
import java.io.Serializable;
import java.util.Date;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class s0 extends jc.q implements Serializable, mc.d0 {

    /* renamed from: e, reason: collision with root package name */
    public static final int f78944e = jc.l.USE_BIG_INTEGER_FOR_INTS.getMask() | jc.l.USE_LONG_FOR_INTS.getMask();

    /* renamed from: b, reason: collision with root package name */
    public final Class f78945b;

    /* renamed from: c, reason: collision with root package name */
    public final jc.o f78946c;

    static {
        jc.l.UNWRAP_SINGLE_VALUE_ARRAYS.getMask();
        jc.l.ACCEPT_EMPTY_ARRAY_AS_NULL_OBJECT.getMask();
    }

    public s0(Class cls) {
        this.f78945b = cls;
        this.f78946c = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Number] */
    public static int D(String str, jc.k kVar) throws xb.b {
        Class<?> cls = Integer.TYPE;
        try {
            if (str.length() <= 9) {
                return cc.m.parseInt(str);
            }
            kVar.getParser().streamReadConstraints().validateIntegerLength(str.length());
            long j10 = cc.m.parseLong(str);
            if (!(j10 < -2147483648L || j10 > 2147483647L)) {
                return (int) j10;
            }
            Number number = (Number) kVar.handleWeirdStringValue(cls, str, "Overflow: numeric value (%s) out of range of int (%d -%d)", str, Integer.MIN_VALUE, Integer.MAX_VALUE);
            if (number == null) {
                number = num;
            }
            return number.intValue();
        } catch (IllegalArgumentException unused) {
            ?? r72 = (Number) kVar.handleWeirdStringValue(cls, str, "not a valid `int` value", new Object[0]);
            return (r72 != 0 ? r72 : 0).intValue();
        }
    }

    public static long H(String str, jc.k kVar) throws xb.b {
        kVar.getParser().streamReadConstraints().validateIntegerLength(str.length());
        try {
            return cc.m.parseLong(str);
        } catch (IllegalArgumentException unused) {
            Number number = (Number) kVar.handleWeirdStringValue(Long.TYPE, str, "not a valid `long` value", new Object[0]);
            if (number == null) {
                number = 0;
            }
            return number.longValue();
        }
    }

    public static mc.v P(jc.k kVar, jc.g gVar, jc.q qVar) {
        tb.e1 contentNulls = gVar != null ? gVar.getMetadata().getContentNulls() : kVar.getConfig().getDefaultSetterInfo().getContentNulls();
        if (contentNulls == tb.e1.f86706b) {
            return nc.u.skipper();
        }
        if (contentNulls != tb.e1.f86707c) {
            mc.v vVarQ = q(kVar, gVar, contentNulls, qVar);
            return vVarQ != null ? vVarQ : qVar;
        }
        if (gVar != null) {
            return nc.v.constructForProperty(gVar, gVar.getType().getContentType());
        }
        jc.o oVarConstructType = kVar.constructType(qVar.handledType());
        if (oVarConstructType.isContainerType()) {
            oVarConstructType = oVarConstructType.getContentType();
        }
        return nc.v.constructForRootValue(oVarConstructType);
    }

    public static jc.q Q(jc.k kVar, jc.g gVar, jc.q qVar) throws jc.r {
        rc.l member;
        Object objFindDeserializationContentConverter;
        jc.c annotationIntrospector = kVar.getAnnotationIntrospector();
        if (annotationIntrospector == null || gVar == null || (member = gVar.getMember()) == null || (objFindDeserializationContentConverter = annotationIntrospector.findDeserializationContentConverter(member)) == null) {
            return qVar;
        }
        nc.o oVar = (nc.o) kVar.converterInstance(gVar.getMember(), objFindDeserializationContentConverter);
        jc.o inputType = oVar.getInputType(kVar.getTypeFactory());
        if (qVar == null) {
            qVar = kVar.findContextualValueDeserializer(inputType, gVar);
        }
        return new r0(oVar, inputType, qVar);
    }

    public static Boolean R(jc.k kVar, jc.g gVar, Class cls, tb.q qVar) {
        tb.t tVarS = S(kVar, gVar, cls);
        if (tVarS != null) {
            return tVarS.getFeature(qVar);
        }
        return null;
    }

    public static tb.t S(jc.k kVar, jc.g gVar, Class cls) {
        return gVar != null ? gVar.findPropertyFormat(kVar.getConfig(), cls) : kVar.getDefaultPropertyFormat(cls);
    }

    public static Double c(String str) {
        if (str.isEmpty()) {
            return null;
        }
        char cCharAt = str.charAt(0);
        if (cCharAt == '-') {
            if (u(str)) {
                return Double.valueOf(Double.NEGATIVE_INFINITY);
            }
            return null;
        }
        if (cCharAt == 'I') {
            if (v(str)) {
                return Double.valueOf(Double.POSITIVE_INFINITY);
            }
            return null;
        }
        if (cCharAt == 'N' && "NaN".equals(str)) {
            return Double.valueOf(Double.NaN);
        }
        return null;
    }

    public static Float d(String str) {
        if (str.isEmpty()) {
            return null;
        }
        char cCharAt = str.charAt(0);
        if (cCharAt == '-') {
            if (u(str)) {
                return Float.valueOf(Float.NEGATIVE_INFINITY);
            }
            return null;
        }
        if (cCharAt == 'I') {
            if (v(str)) {
                return Float.valueOf(Float.POSITIVE_INFINITY);
            }
            return null;
        }
        if (cCharAt == 'N' && "NaN".equals(str)) {
            return Float.valueOf(Float.NaN);
        }
        return null;
    }

    public static Number l(ub.u uVar, jc.k kVar) {
        return kVar.isEnabled(jc.l.USE_BIG_INTEGER_FOR_INTS) ? uVar.getBigIntegerValue() : kVar.isEnabled(jc.l.USE_LONG_FOR_INTS) ? Long.valueOf(uVar.getLongValue()) : uVar.getNumberValue();
    }

    public static mc.v q(jc.k kVar, jc.g gVar, tb.e1 e1Var, jc.q qVar) {
        if (e1Var == tb.e1.f86707c) {
            if (gVar == null) {
                return nc.v.constructForRootValue(kVar.constructType(qVar == null ? Object.class : qVar.handledType()));
            }
            return nc.v.constructForProperty(gVar);
        }
        if (e1Var != tb.e1.f86708e) {
            if (e1Var == tb.e1.f86706b) {
                return nc.u.skipper();
            }
            return null;
        }
        if (qVar == null) {
            return null;
        }
        if (qVar instanceof mc.f) {
            mc.f fVar = (mc.f) qVar;
            if (!fVar.getValueInstantiator().canCreateUsingDefault()) {
                jc.o valueType = gVar == null ? fVar.getValueType() : gVar.getType();
                return (mc.v) kVar.reportBadDefinition(valueType, String.format("Cannot create empty instance of %s, no default Creator", valueType));
            }
        }
        dd.a emptyAccessPattern = qVar.getEmptyAccessPattern();
        return emptyAccessPattern == dd.a.f51981b ? nc.u.nuller() : emptyAccessPattern == dd.a.f51982c ? nc.u.forValue(qVar.getEmptyValue(kVar)) : new nc.t(qVar);
    }

    public static final boolean r(String str) {
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            if (str.charAt(i10) > ' ') {
                return false;
            }
        }
        return true;
    }

    public static boolean s(String str) {
        char cCharAt = str.charAt(0);
        return cCharAt == 'f' ? "false".equals(str) : cCharAt == 'F' && ("FALSE".equals(str) || "False".equals(str));
    }

    public static boolean t(String str) {
        int i10;
        int length = str.length();
        if (length > 0) {
            char cCharAt = str.charAt(0);
            if (cCharAt != '-' && cCharAt != '+') {
                i10 = 0;
            } else if (length != 1) {
                i10 = 1;
            }
            while (i10 < length) {
                char cCharAt2 = str.charAt(i10);
                if (cCharAt2 <= '9' && cCharAt2 >= '0') {
                    i10++;
                }
            }
            return true;
        }
        return false;
    }

    public static boolean u(String str) {
        return "-Infinity".equals(str) || "-INF".equals(str);
    }

    public static boolean v(String str) {
        return "Infinity".equals(str) || "INF".equals(str);
    }

    public static boolean w(String str) {
        char cCharAt = str.charAt(0);
        return cCharAt == 't' ? "true".equals(str) : cCharAt == 'T' && ("TRUE".equals(str) || "True".equals(str));
    }

    public Date A(ub.u uVar, jc.k kVar) throws IOException {
        jc.k kVar2;
        String strExtractScalarFromObject;
        long jLongValue;
        int iCurrentTokenId = uVar.currentTokenId();
        Class<?> cls = this.f78945b;
        if (iCurrentTokenId == 1) {
            kVar2 = kVar;
            strExtractScalarFromObject = kVar2.extractScalarFromObject(uVar, this, cls);
        } else {
            if (iCurrentTokenId == 3) {
                lc.c cVarFindCoercionAction = kVar.findCoercionAction(logicalType(), handledType(), lc.f.f73108g);
                boolean zIsEnabled = kVar.isEnabled(jc.l.UNWRAP_SINGLE_VALUE_ARRAYS);
                if (zIsEnabled || cVarFindCoercionAction != lc.c.f73085b) {
                    ub.z zVarNextToken = uVar.nextToken();
                    if (zVarNextToken == ub.z.END_ARRAY) {
                        int iOrdinal = cVarFindCoercionAction.ordinal();
                        if (iOrdinal == 1 || iOrdinal == 2) {
                            return (Date) getNullValue(kVar);
                        }
                        if (iOrdinal == 3) {
                            return (Date) getEmptyValue(kVar);
                        }
                    } else if (zIsEnabled) {
                        if (zVarNextToken == ub.z.START_ARRAY) {
                            return (Date) U(uVar, kVar);
                        }
                        Date dateA = A(uVar, kVar);
                        M(uVar, kVar);
                        return dateA;
                    }
                }
                return (Date) kVar.handleUnexpectedToken(this.f78945b, ub.z.START_ARRAY, uVar, (String) null, new Object[0]);
            }
            if (iCurrentTokenId == 11) {
                return (Date) getNullValue(kVar);
            }
            if (iCurrentTokenId != 6) {
                if (iCurrentTokenId != 7) {
                    return (Date) kVar.handleUnexpectedToken(cls, uVar);
                }
                try {
                    jLongValue = uVar.getLongValue();
                } catch (xb.c unused) {
                    jLongValue = ((Number) kVar.handleWeirdNumberValue(cls, uVar.getNumberValue(), "not a valid 64-bit `long` for creating `java.util.Date`", new Object[0])).longValue();
                }
                return new Date(jLongValue);
            }
            strExtractScalarFromObject = uVar.getText();
            kVar2 = kVar;
        }
        String strTrim = strExtractScalarFromObject.trim();
        try {
            if (strTrim.isEmpty()) {
                if (f(strTrim, kVar2).ordinal() != 3) {
                    return null;
                }
                return new Date(0L);
            }
            if (AbstractJsonLexerKt.NULL.equals(strTrim)) {
                return null;
            }
            return kVar2.parseDate(strTrim);
        } catch (IllegalArgumentException e10) {
            return (Date) kVar2.handleWeirdStringValue(cls, strTrim, "not a valid representation (error: %s)", dd.i.exceptionMessage(e10));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x001e, code lost:
    
        if (r0 != 8) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0028, code lost:
    
        if (r9 == r2) goto L45;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final double B(ub.u r8, jc.k r9) throws java.io.IOException {
        /*
            r7 = this;
            int r0 = r8.currentTokenId()
            r1 = 1
            lc.c r2 = lc.c.f73088f
            lc.c r3 = lc.c.f73087e
            java.lang.Class r4 = java.lang.Double.TYPE
            r5 = 0
            if (r0 == r1) goto L67
            r1 = 3
            if (r0 == r1) goto L39
            r1 = 11
            if (r0 == r1) goto L35
            r1 = 6
            if (r0 == r1) goto L30
            r1 = 7
            if (r0 == r1) goto L21
            r1 = 8
            if (r0 == r1) goto L2b
            goto L5c
        L21:
            lc.c r9 = r7.h(r8, r9, r4)
            if (r9 != r3) goto L28
            goto L84
        L28:
            if (r9 != r2) goto L2b
            goto L84
        L2b:
            double r8 = r8.getDoubleValue()
            return r8
        L30:
            java.lang.String r0 = r8.getText()
            goto L6b
        L35:
            r7.N(r9)
            return r5
        L39:
            jc.l r0 = jc.l.UNWRAP_SINGLE_VALUE_ARRAYS
            boolean r0 = r9.isEnabled(r0)
            if (r0 == 0) goto L5c
            ub.z r0 = r8.nextToken()
            ub.z r1 = ub.z.START_ARRAY
            if (r0 != r1) goto L54
            java.lang.Object r8 = r7.U(r8, r9)
            java.lang.Double r8 = (java.lang.Double) r8
            double r8 = r8.doubleValue()
            return r8
        L54:
            double r0 = r7.B(r8, r9)
            r7.M(r8, r9)
            return r0
        L5c:
            java.lang.Object r8 = r9.handleUnexpectedToken(r4, r8)
            java.lang.Number r8 = (java.lang.Number) r8
            double r8 = r8.doubleValue()
            return r8
        L67:
            java.lang.String r0 = r9.extractScalarFromObject(r8, r7, r4)
        L6b:
            java.lang.Double r1 = c(r0)
            if (r1 == 0) goto L76
            double r8 = r1.doubleValue()
            return r8
        L76:
            cd.h r1 = cd.h.f12144h
            lc.c r1 = r7.g(r9, r0, r1, r4)
            if (r1 != r3) goto L82
            r7.N(r9)
            return r5
        L82:
            if (r1 != r2) goto L85
        L84:
            return r5
        L85:
            java.lang.String r0 = r0.trim()
            java.lang.String r1 = "null"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L95
            r7.O(r0, r9)
            return r5
        L95:
            ub.g0 r1 = ub.g0.USE_FAST_DOUBLE_PARSER     // Catch: java.lang.IllegalArgumentException -> La0
            boolean r8 = r8.isEnabled(r1)     // Catch: java.lang.IllegalArgumentException -> La0
            double r8 = cc.m.parseDouble(r0, r8)     // Catch: java.lang.IllegalArgumentException -> La0
            return r8
        La0:
            java.lang.String r8 = "not a valid `double` value (as String to convert)"
            r1 = 0
            java.lang.Object[] r2 = new java.lang.Object[r1]
            java.lang.Object r8 = r9.handleWeirdStringValue(r4, r0, r8, r2)
            java.lang.Number r8 = (java.lang.Number) r8
            if (r8 != 0) goto Lb1
            java.lang.Integer r8 = java.lang.Integer.valueOf(r1)
        Lb1:
            double r8 = r8.doubleValue()
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: oc.s0.B(ub.u, jc.k):double");
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x001d, code lost:
    
        if (r0 != 8) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0027, code lost:
    
        if (r8 == r2) goto L45;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final float C(ub.u r7, jc.k r8) throws java.io.IOException {
        /*
            r6 = this;
            int r0 = r7.currentTokenId()
            r1 = 1
            lc.c r2 = lc.c.f73088f
            lc.c r3 = lc.c.f73087e
            java.lang.Class r4 = java.lang.Float.TYPE
            r5 = 0
            if (r0 == r1) goto L66
            r1 = 3
            if (r0 == r1) goto L38
            r1 = 11
            if (r0 == r1) goto L34
            r1 = 6
            if (r0 == r1) goto L2f
            r1 = 7
            if (r0 == r1) goto L20
            r1 = 8
            if (r0 == r1) goto L2a
            goto L5b
        L20:
            lc.c r8 = r6.h(r7, r8, r4)
            if (r8 != r3) goto L27
            goto L83
        L27:
            if (r8 != r2) goto L2a
            goto L83
        L2a:
            float r7 = r7.getFloatValue()
            return r7
        L2f:
            java.lang.String r0 = r7.getText()
            goto L6a
        L34:
            r6.N(r8)
            return r5
        L38:
            jc.l r0 = jc.l.UNWRAP_SINGLE_VALUE_ARRAYS
            boolean r0 = r8.isEnabled(r0)
            if (r0 == 0) goto L5b
            ub.z r0 = r7.nextToken()
            ub.z r1 = ub.z.START_ARRAY
            if (r0 != r1) goto L53
            java.lang.Object r7 = r6.U(r7, r8)
            java.lang.Float r7 = (java.lang.Float) r7
            float r7 = r7.floatValue()
            return r7
        L53:
            float r0 = r6.C(r7, r8)
            r6.M(r7, r8)
            return r0
        L5b:
            java.lang.Object r7 = r8.handleUnexpectedToken(r4, r7)
            java.lang.Number r7 = (java.lang.Number) r7
            float r7 = r7.floatValue()
            return r7
        L66:
            java.lang.String r0 = r8.extractScalarFromObject(r7, r6, r4)
        L6a:
            java.lang.Float r1 = d(r0)
            if (r1 == 0) goto L75
            float r7 = r1.floatValue()
            return r7
        L75:
            cd.h r1 = cd.h.f12144h
            lc.c r1 = r6.g(r8, r0, r1, r4)
            if (r1 != r3) goto L81
            r6.N(r8)
            return r5
        L81:
            if (r1 != r2) goto L84
        L83:
            return r5
        L84:
            java.lang.String r0 = r0.trim()
            java.lang.String r1 = "null"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L94
            r6.O(r0, r8)
            return r5
        L94:
            boolean r1 = cc.m.looksLikeValidNumber(r0)
            if (r1 == 0) goto Lb4
            ub.u r1 = r8.getParser()
            ub.f0 r1 = r1.streamReadConstraints()
            int r2 = r0.length()
            r1.validateFPLength(r2)
            ub.g0 r1 = ub.g0.USE_FAST_DOUBLE_PARSER     // Catch: java.lang.IllegalArgumentException -> Lb4
            boolean r7 = r7.isEnabled(r1)     // Catch: java.lang.IllegalArgumentException -> Lb4
            float r7 = cc.m.parseFloat(r0, r7)     // Catch: java.lang.IllegalArgumentException -> Lb4
            return r7
        Lb4:
            java.lang.String r7 = "not a valid `float` value"
            r1 = 0
            java.lang.Object[] r2 = new java.lang.Object[r1]
            java.lang.Object r7 = r8.handleWeirdStringValue(r4, r0, r7, r2)
            java.lang.Number r7 = (java.lang.Number) r7
            if (r7 != 0) goto Lc5
            java.lang.Integer r7 = java.lang.Integer.valueOf(r1)
        Lc5:
            float r7 = r7.floatValue()
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: oc.s0.C(ub.u, jc.k):float");
    }

    public final int E(ub.u uVar, jc.k kVar) throws IOException {
        String strExtractScalarFromObject;
        int iCurrentTokenId = uVar.currentTokenId();
        lc.c cVar = lc.c.f73088f;
        lc.c cVar2 = lc.c.f73087e;
        Class<?> cls = Integer.TYPE;
        if (iCurrentTokenId != 1) {
            if (iCurrentTokenId != 3) {
                if (iCurrentTokenId == 11) {
                    N(kVar);
                    return 0;
                }
                if (iCurrentTokenId == 6) {
                    strExtractScalarFromObject = uVar.getText();
                } else {
                    if (iCurrentTokenId == 7) {
                        return uVar.getIntValue();
                    }
                    if (iCurrentTokenId == 8) {
                        lc.c cVarE = e(uVar, kVar, cls);
                        if (cVarE != cVar2 && cVarE != cVar) {
                            return uVar.getValueAsInt();
                        }
                        return 0;
                    }
                }
            } else if (kVar.isEnabled(jc.l.UNWRAP_SINGLE_VALUE_ARRAYS)) {
                if (uVar.nextToken() == ub.z.START_ARRAY) {
                    return ((Integer) U(uVar, kVar)).intValue();
                }
                int iE = E(uVar, kVar);
                M(uVar, kVar);
                return iE;
            }
            return ((Number) kVar.handleUnexpectedToken(cls, uVar)).intValue();
        }
        strExtractScalarFromObject = kVar.extractScalarFromObject(uVar, this, cls);
        lc.c cVarG = g(kVar, strExtractScalarFromObject, cd.h.f12144h, cls);
        if (cVarG == cVar2) {
            N(kVar);
            return 0;
        }
        if (cVarG != cVar) {
            String strTrim = strExtractScalarFromObject.trim();
            if (!AbstractJsonLexerKt.NULL.equals(strTrim)) {
                return D(strTrim, kVar);
            }
            O(strTrim, kVar);
            return 0;
        }
        return 0;
    }

    public final Integer F(ub.u uVar, jc.k kVar, Class cls) throws IOException {
        String strExtractScalarFromObject;
        int iCurrentTokenId = uVar.currentTokenId();
        lc.c cVar = lc.c.f73088f;
        lc.c cVar2 = lc.c.f73087e;
        boolean z10 = true;
        if (iCurrentTokenId == 1) {
            strExtractScalarFromObject = kVar.extractScalarFromObject(uVar, this, cls);
        } else {
            if (iCurrentTokenId == 3) {
                return (Integer) n(uVar, kVar);
            }
            if (iCurrentTokenId == 11) {
                return (Integer) getNullValue(kVar);
            }
            if (iCurrentTokenId != 6) {
                if (iCurrentTokenId == 7) {
                    return Integer.valueOf(uVar.getIntValue());
                }
                if (iCurrentTokenId != 8) {
                    return (Integer) kVar.handleUnexpectedToken(getValueType(kVar), uVar);
                }
                lc.c cVarE = e(uVar, kVar, cls);
                return cVarE == cVar2 ? (Integer) getNullValue(kVar) : cVarE == cVar ? (Integer) getEmptyValue(kVar) : Integer.valueOf(uVar.getValueAsInt());
            }
            strExtractScalarFromObject = uVar.getText();
        }
        lc.c cVarF = f(strExtractScalarFromObject, kVar);
        if (cVarF == cVar2) {
            return (Integer) getNullValue(kVar);
        }
        if (cVarF == cVar) {
            return (Integer) getEmptyValue(kVar);
        }
        String strTrim = strExtractScalarFromObject.trim();
        if (i(strTrim, kVar)) {
            return (Integer) getNullValue(kVar);
        }
        try {
            if (strTrim.length() <= 9) {
                return Integer.valueOf(cc.m.parseInt(strTrim));
            }
            kVar.getParser().streamReadConstraints().validateIntegerLength(strTrim.length());
            long j10 = cc.m.parseLong(strTrim);
            if (j10 >= -2147483648L && j10 <= 2147483647L) {
                z10 = false;
            }
            return z10 ? (Integer) kVar.handleWeirdStringValue(Integer.class, strTrim, "Overflow: numeric value (%s) out of range of `java.lang.Integer` (%d -%d)", strTrim, Integer.MIN_VALUE, Integer.MAX_VALUE) : Integer.valueOf((int) j10);
        } catch (IllegalArgumentException unused) {
            return (Integer) kVar.handleWeirdStringValue(Integer.class, strTrim, "not a valid `java.lang.Integer` value", new Object[0]);
        }
    }

    public final Long G(ub.u uVar, jc.k kVar, Class cls) throws IOException {
        String strExtractScalarFromObject;
        int iCurrentTokenId = uVar.currentTokenId();
        lc.c cVar = lc.c.f73088f;
        lc.c cVar2 = lc.c.f73087e;
        if (iCurrentTokenId == 1) {
            strExtractScalarFromObject = kVar.extractScalarFromObject(uVar, this, cls);
        } else {
            if (iCurrentTokenId == 3) {
                return (Long) n(uVar, kVar);
            }
            if (iCurrentTokenId == 11) {
                return (Long) getNullValue(kVar);
            }
            if (iCurrentTokenId != 6) {
                if (iCurrentTokenId == 7) {
                    return Long.valueOf(uVar.getLongValue());
                }
                if (iCurrentTokenId != 8) {
                    return (Long) kVar.handleUnexpectedToken(getValueType(kVar), uVar);
                }
                lc.c cVarE = e(uVar, kVar, cls);
                return cVarE == cVar2 ? (Long) getNullValue(kVar) : cVarE == cVar ? (Long) getEmptyValue(kVar) : Long.valueOf(uVar.getValueAsLong());
            }
            strExtractScalarFromObject = uVar.getText();
        }
        lc.c cVarF = f(strExtractScalarFromObject, kVar);
        if (cVarF == cVar2) {
            return (Long) getNullValue(kVar);
        }
        if (cVarF == cVar) {
            return (Long) getEmptyValue(kVar);
        }
        String strTrim = strExtractScalarFromObject.trim();
        if (i(strTrim, kVar)) {
            return (Long) getNullValue(kVar);
        }
        kVar.getParser().streamReadConstraints().validateIntegerLength(strTrim.length());
        try {
            return Long.valueOf(cc.m.parseLong(strTrim));
        } catch (IllegalArgumentException unused) {
            return (Long) kVar.handleWeirdStringValue(Long.class, strTrim, "not a valid `java.lang.Long` value", new Object[0]);
        }
    }

    public final long I(ub.u uVar, jc.k kVar) throws IOException {
        String strExtractScalarFromObject;
        int iCurrentTokenId = uVar.currentTokenId();
        lc.c cVar = lc.c.f73088f;
        lc.c cVar2 = lc.c.f73087e;
        Class<?> cls = Long.TYPE;
        if (iCurrentTokenId != 1) {
            if (iCurrentTokenId != 3) {
                if (iCurrentTokenId == 11) {
                    N(kVar);
                    return 0L;
                }
                if (iCurrentTokenId == 6) {
                    strExtractScalarFromObject = uVar.getText();
                } else {
                    if (iCurrentTokenId == 7) {
                        return uVar.getLongValue();
                    }
                    if (iCurrentTokenId == 8) {
                        lc.c cVarE = e(uVar, kVar, cls);
                        if (cVarE != cVar2 && cVarE != cVar) {
                            return uVar.getValueAsLong();
                        }
                        return 0L;
                    }
                }
            } else if (kVar.isEnabled(jc.l.UNWRAP_SINGLE_VALUE_ARRAYS)) {
                if (uVar.nextToken() == ub.z.START_ARRAY) {
                    return ((Long) U(uVar, kVar)).longValue();
                }
                long jI = I(uVar, kVar);
                M(uVar, kVar);
                return jI;
            }
            return ((Number) kVar.handleUnexpectedToken(cls, uVar)).longValue();
        }
        strExtractScalarFromObject = kVar.extractScalarFromObject(uVar, this, cls);
        lc.c cVarG = g(kVar, strExtractScalarFromObject, cd.h.f12144h, cls);
        if (cVarG == cVar2) {
            N(kVar);
            return 0L;
        }
        if (cVarG != cVar) {
            String strTrim = strExtractScalarFromObject.trim();
            if (!AbstractJsonLexerKt.NULL.equals(strTrim)) {
                return H(strTrim, kVar);
            }
            O(strTrim, kVar);
            return 0L;
        }
        return 0L;
    }

    public final short J(ub.u uVar, jc.k kVar) throws IOException {
        String strExtractScalarFromObject;
        int iCurrentTokenId = uVar.currentTokenId();
        lc.c cVar = lc.c.f73088f;
        lc.c cVar2 = lc.c.f73087e;
        Class<?> cls = Short.TYPE;
        if (iCurrentTokenId != 1) {
            if (iCurrentTokenId != 3) {
                if (iCurrentTokenId == 11) {
                    N(kVar);
                    return (short) 0;
                }
                if (iCurrentTokenId == 6) {
                    strExtractScalarFromObject = uVar.getText();
                } else {
                    if (iCurrentTokenId == 7) {
                        return uVar.getShortValue();
                    }
                    if (iCurrentTokenId == 8) {
                        lc.c cVarE = e(uVar, kVar, cls);
                        if (cVarE != cVar2 && cVarE != cVar) {
                            return uVar.getShortValue();
                        }
                        return (short) 0;
                    }
                }
            } else if (kVar.isEnabled(jc.l.UNWRAP_SINGLE_VALUE_ARRAYS)) {
                if (uVar.nextToken() == ub.z.START_ARRAY) {
                    return ((Short) U(uVar, kVar)).shortValue();
                }
                short sJ = J(uVar, kVar);
                M(uVar, kVar);
                return sJ;
            }
            return ((Short) kVar.handleUnexpectedToken(kVar.constructType(cls), uVar)).shortValue();
        }
        strExtractScalarFromObject = kVar.extractScalarFromObject(uVar, this, cls);
        lc.c cVarG = g(kVar, strExtractScalarFromObject, cd.h.f12144h, cls);
        if (cVarG == cVar2) {
            N(kVar);
            return (short) 0;
        }
        if (cVarG != cVar) {
            String strTrim = strExtractScalarFromObject.trim();
            if (AbstractJsonLexerKt.NULL.equals(strTrim)) {
                O(strTrim, kVar);
                return (short) 0;
            }
            uVar.streamReadConstraints().validateIntegerLength(strTrim.length());
            try {
                int i10 = cc.m.parseInt(strTrim);
                return (i10 < -32768 || i10 > 32767) ? ((Short) kVar.handleWeirdStringValue(cls, strTrim, "overflow, value cannot be represented as 16-bit value", new Object[0])).shortValue() : (short) i10;
            } catch (IllegalArgumentException unused) {
                return ((Short) kVar.handleWeirdStringValue(cls, strTrim, "not a valid `short` value", new Object[0])).shortValue();
            }
        }
        return (short) 0;
    }

    public final String K(ub.u uVar, jc.k kVar, mc.v vVar) throws IOException {
        lc.c cVarJ;
        String valueAsString;
        int iCurrentTokenId = uVar.currentTokenId();
        if (iCurrentTokenId == 1) {
            return kVar.extractScalarFromObject(uVar, this, String.class);
        }
        if (iCurrentTokenId == 12) {
            Object embeddedObject = uVar.getEmbeddedObject();
            if (embeddedObject instanceof byte[]) {
                return kVar.getBase64Variant().encode((byte[]) embeddedObject, false);
            }
            if (embeddedObject == null) {
                return null;
            }
            return embeddedObject.toString();
        }
        switch (iCurrentTokenId) {
            case 6:
                return uVar.getText();
            case 7:
                cVarJ = j(uVar, kVar, uVar.getNumberValue(), lc.f.f73104b);
                break;
            case 8:
                cVarJ = j(uVar, kVar, uVar.getNumberValue(), lc.f.f73105c);
                break;
            case 9:
            case 10:
                cVarJ = j(uVar, kVar, Boolean.valueOf(uVar.getBooleanValue()), lc.f.f73106e);
                break;
            default:
                cVarJ = lc.c.f73086c;
                break;
        }
        return cVarJ == lc.c.f73087e ? (String) vVar.getNullValue(kVar) : cVarJ == lc.c.f73088f ? "" : (!uVar.currentToken().isScalarValue() || (valueAsString = uVar.getValueAsString()) == null) ? (String) kVar.handleUnexpectedToken(String.class, uVar) : valueAsString;
    }

    public final void L(jc.k kVar, boolean z10, Enum r52, String str) throws jc.r {
        kVar.reportInputMismatch(this, "Cannot coerce %s to Null value as %s (%s `%s.%s` to allow)", str, m(), z10 ? com.ironsource.mediationsdk.metadata.a.f37604j : "disable", r52.getDeclaringClass().getSimpleName(), r52.name());
    }

    public final void M(ub.u uVar, jc.k kVar) throws jc.r {
        if (uVar.nextToken() != ub.z.END_ARRAY) {
            T(kVar);
        }
    }

    public final void N(jc.k kVar) throws jc.r {
        if (kVar.isEnabled(jc.l.FAIL_ON_NULL_FOR_PRIMITIVES)) {
            kVar.reportInputMismatch(this, "Cannot coerce `null` to %s (disable `DeserializationFeature.FAIL_ON_NULL_FOR_PRIMITIVES` to allow)", m());
        }
    }

    public final void O(String str, jc.k kVar) throws jc.r {
        boolean z10;
        jc.y yVar;
        jc.y yVar2 = jc.y.ALLOW_COERCION_OF_SCALARS;
        if (kVar.isEnabled(yVar2)) {
            jc.l lVar = jc.l.FAIL_ON_NULL_FOR_PRIMITIVES;
            if (!kVar.isEnabled(lVar)) {
                return;
            }
            z10 = false;
            yVar = lVar;
        } else {
            z10 = true;
            yVar = yVar2;
        }
        L(kVar, z10, yVar, str.isEmpty() ? "empty String (\"\")" : a.b.l("String \"", str, "\""));
    }

    public final void T(jc.k kVar) throws jc.r {
        kVar.reportWrongTokenException(this, ub.z.END_ARRAY, "Attempted to unwrap '%s' value from an array (with `DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS`) but it contains more than one value", handledType().getName());
    }

    public final Object U(ub.u uVar, jc.k kVar) {
        return kVar.handleUnexpectedToken(getValueType(kVar), uVar.currentToken(), uVar, "Cannot deserialize instance of " + dd.i.nameOf((Class<?>) this.f78945b) + " out of " + ub.z.START_ARRAY + " token: nested Arrays not allowed with DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS", new Object[0]);
    }

    public final void b(jc.k kVar, lc.c cVar, Class cls, Object obj, String str) throws jc.r {
        if (cVar == lc.c.f73085b) {
            String classDescription = dd.i.getClassDescription(cls);
            kVar.reportBadCoercion(this, cls, obj, "Cannot coerce %s to %s (but could if coercion was enabled using `CoercionConfig`)", str, dd.i.isCollectionMapOrArray(cls) ? a.b.k("element of ", classDescription) : o2.l(classDescription, " value"));
        }
    }

    @Override // jc.q
    public Object deserializeWithType(ub.u uVar, jc.k kVar, wc.g gVar) throws IOException {
        return gVar.deserializeTypedFromAny(uVar, kVar);
    }

    public final lc.c e(ub.u uVar, jc.k kVar, Class cls) throws IOException {
        lc.c cVarFindCoercionAction = kVar.findCoercionAction(cd.h.f12144h, cls, lc.f.f73105c);
        if (cVarFindCoercionAction == lc.c.f73085b) {
            b(kVar, cVarFindCoercionAction, cls, uVar.getNumberValue(), "Floating-point value (" + uVar.getText() + ")");
        }
        return cVarFindCoercionAction;
    }

    public final lc.c f(String str, jc.k kVar) {
        return g(kVar, str, logicalType(), handledType());
    }

    @Deprecated
    public final Class<?> getValueClass() {
        return this.f78945b;
    }

    public mc.c0 getValueInstantiator() {
        return null;
    }

    public jc.o getValueType() {
        return this.f78946c;
    }

    public final lc.c h(ub.u uVar, jc.k kVar, Class cls) throws IOException {
        lc.c cVarFindCoercionAction = kVar.findCoercionAction(cd.h.f12145i, cls, lc.f.f73104b);
        if (cVarFindCoercionAction == lc.c.f73085b) {
            b(kVar, cVarFindCoercionAction, cls, uVar.getNumberValue(), "Integer value (" + uVar.getText() + ")");
        }
        return cVarFindCoercionAction;
    }

    @Override // jc.q
    public Class<?> handledType() {
        return this.f78945b;
    }

    public final boolean i(String str, jc.k kVar) throws jc.r {
        if (!AbstractJsonLexerKt.NULL.equals(str)) {
            return false;
        }
        jc.y yVar = jc.y.ALLOW_COERCION_OF_SCALARS;
        if (!kVar.isEnabled(yVar)) {
            L(kVar, true, yVar, "String \"null\"");
        }
        return true;
    }

    public final lc.c j(ub.u uVar, jc.k kVar, Serializable serializable, lc.f fVar) throws jc.r {
        lc.c cVarFindCoercionAction = kVar.findCoercionAction(cd.h.f12148l, String.class, fVar);
        if (cVarFindCoercionAction == lc.c.f73085b) {
            b(kVar, cVarFindCoercionAction, String.class, serializable, fVar.name() + " value (" + uVar.getText() + ")");
        }
        return cVarFindCoercionAction;
    }

    public final Boolean k(ub.u uVar, jc.k kVar, Class cls) throws IOException {
        lc.c cVarFindCoercionAction = kVar.findCoercionAction(cd.h.f12146j, cls, lc.f.f73104b);
        int iOrdinal = cVarFindCoercionAction.ordinal();
        if (iOrdinal == 0) {
            b(kVar, cVarFindCoercionAction, cls, uVar.getNumberValue(), "Integer value (" + uVar.getText() + ")");
            return Boolean.FALSE;
        }
        if (iOrdinal == 2) {
            return null;
        }
        if (iOrdinal == 3) {
            return Boolean.FALSE;
        }
        if (uVar.getNumberType() == ub.s.f88349b) {
            return Boolean.valueOf(uVar.getIntValue() != 0);
        }
        return Boolean.valueOf(!"0".equals(uVar.getText()));
    }

    public final String m() {
        boolean zIsCollectionMapOrArray;
        String classDescription;
        jc.o valueType = getValueType();
        if (valueType == null || valueType.isPrimitive()) {
            Class<?> clsHandledType = handledType();
            zIsCollectionMapOrArray = dd.i.isCollectionMapOrArray(clsHandledType);
            classDescription = dd.i.getClassDescription(clsHandledType);
        } else {
            zIsCollectionMapOrArray = valueType.isContainerType() || valueType.isReferenceType();
            classDescription = dd.i.getTypeDescription(valueType);
        }
        return zIsCollectionMapOrArray ? a.b.k("element of ", classDescription) : o2.l(classDescription, " value");
    }

    public Object n(ub.u uVar, jc.k kVar) throws IOException {
        lc.c cVarFindCoercionAction = kVar.findCoercionAction(logicalType(), handledType(), lc.f.f73108g);
        boolean zIsEnabled = kVar.isEnabled(jc.l.UNWRAP_SINGLE_VALUE_ARRAYS);
        if (zIsEnabled || cVarFindCoercionAction != lc.c.f73085b) {
            ub.z zVarNextToken = uVar.nextToken();
            ub.z zVar = ub.z.END_ARRAY;
            if (zVarNextToken == zVar) {
                int iOrdinal = cVarFindCoercionAction.ordinal();
                if (iOrdinal == 1 || iOrdinal == 2) {
                    return getNullValue(kVar);
                }
                if (iOrdinal == 3) {
                    return getEmptyValue(kVar);
                }
            } else if (zIsEnabled) {
                Object objU = uVar.hasToken(ub.z.START_ARRAY) ? U(uVar, kVar) : uVar.hasToken(ub.z.VALUE_NULL) ? getNullValue(kVar) : deserialize(uVar, kVar);
                if (uVar.nextToken() != zVar) {
                    T(kVar);
                }
                return objU;
            }
        }
        return kVar.handleUnexpectedToken(getValueType(kVar), ub.z.START_ARRAY, uVar, (String) null, new Object[0]);
    }

    public final Object o(jc.k kVar, lc.c cVar, Class cls) throws jc.r {
        int iOrdinal = cVar.ordinal();
        if (iOrdinal == 0) {
            b(kVar, cVar, cls, "", "empty String (\"\")");
            return null;
        }
        if (iOrdinal != 3) {
            return null;
        }
        return getEmptyValue(kVar);
    }

    public final Object p(ub.u uVar, jc.k kVar) throws IOException {
        mc.c0 valueInstantiator = getValueInstantiator();
        Class<?> clsHandledType = handledType();
        String valueAsString = uVar.getValueAsString();
        if (valueInstantiator != null && valueInstantiator.canCreateFromString()) {
            return valueInstantiator.createFromString(kVar, valueAsString);
        }
        if (valueAsString.isEmpty()) {
            return o(kVar, kVar.findCoercionAction(logicalType(), clsHandledType, lc.f.f73109h), clsHandledType);
        }
        if (r(valueAsString)) {
            return o(kVar, kVar.findCoercionFromBlankString(logicalType(), clsHandledType, lc.c.f73085b), clsHandledType);
        }
        if (valueInstantiator != null) {
            valueAsString = valueAsString.trim();
            boolean zCanCreateFromInt = valueInstantiator.canCreateFromInt();
            cd.h hVar = cd.h.f12144h;
            lc.c cVar = lc.c.f73086c;
            lc.f fVar = lc.f.f73107f;
            if (zCanCreateFromInt && kVar.findCoercionAction(hVar, Integer.class, fVar) == cVar) {
                return valueInstantiator.createFromInt(kVar, D(valueAsString, kVar));
            }
            if (valueInstantiator.canCreateFromLong() && kVar.findCoercionAction(hVar, Long.class, fVar) == cVar) {
                return valueInstantiator.createFromLong(kVar, H(valueAsString, kVar));
            }
            if (valueInstantiator.canCreateFromBoolean() && kVar.findCoercionAction(cd.h.f12146j, Boolean.class, fVar) == cVar) {
                String strTrim = valueAsString.trim();
                if ("true".equals(strTrim)) {
                    return valueInstantiator.createFromBoolean(kVar, true);
                }
                if ("false".equals(strTrim)) {
                    return valueInstantiator.createFromBoolean(kVar, false);
                }
            }
        }
        return kVar.handleMissingInstantiator(clsHandledType, valueInstantiator, kVar.getParser(), "no String-argument constructor/factory method to deserialize from String value ('%s')", valueAsString);
    }

    public final Boolean x(ub.u uVar, jc.k kVar, Class cls) throws IOException {
        String strExtractScalarFromObject;
        int iCurrentTokenId = uVar.currentTokenId();
        if (iCurrentTokenId == 1) {
            strExtractScalarFromObject = kVar.extractScalarFromObject(uVar, this, cls);
        } else {
            if (iCurrentTokenId == 3) {
                return (Boolean) n(uVar, kVar);
            }
            if (iCurrentTokenId != 6) {
                if (iCurrentTokenId == 7) {
                    return k(uVar, kVar, cls);
                }
                switch (iCurrentTokenId) {
                    case 9:
                        return Boolean.TRUE;
                    case 10:
                        return Boolean.FALSE;
                    case 11:
                        return null;
                    default:
                        return (Boolean) kVar.handleUnexpectedToken((Class<?>) cls, uVar);
                }
            }
            strExtractScalarFromObject = uVar.getText();
        }
        lc.c cVarG = g(kVar, strExtractScalarFromObject, cd.h.f12146j, cls);
        if (cVarG == lc.c.f73087e) {
            return null;
        }
        if (cVarG == lc.c.f73088f) {
            return Boolean.FALSE;
        }
        String strTrim = strExtractScalarFromObject.trim();
        int length = strTrim.length();
        if (length == 4) {
            if (w(strTrim)) {
                return Boolean.TRUE;
            }
        } else if (length == 5 && s(strTrim)) {
            return Boolean.FALSE;
        }
        if (i(strTrim, kVar)) {
            return null;
        }
        return (Boolean) kVar.handleWeirdStringValue(cls, strTrim, "only \"true\" or \"false\" recognized", new Object[0]);
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x007f, code lost:
    
        if (w(r6) != false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0089, code lost:
    
        if (s(r6) != false) goto L44;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean y(ub.u r6, jc.k r7) throws java.io.IOException {
        /*
            r5 = this;
            int r0 = r6.currentTokenId()
            java.lang.Class r1 = java.lang.Boolean.TYPE
            r2 = 0
            r3 = 1
            if (r0 == r3) goto L59
            r4 = 3
            if (r0 == r4) goto L2b
            r4 = 6
            if (r0 == r4) goto L26
            r4 = 7
            if (r0 == r4) goto L1b
            switch(r0) {
                case 9: goto L81;
                case 10: goto L8b;
                case 11: goto L17;
                default: goto L16;
            }
        L16:
            goto L4e
        L17:
            r5.N(r7)
            return r2
        L1b:
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            java.lang.Boolean r6 = r5.k(r6, r7, r1)
            boolean r6 = r0.equals(r6)
            return r6
        L26:
            java.lang.String r6 = r6.getText()
            goto L5d
        L2b:
            jc.l r0 = jc.l.UNWRAP_SINGLE_VALUE_ARRAYS
            boolean r0 = r7.isEnabled(r0)
            if (r0 == 0) goto L4e
            ub.z r0 = r6.nextToken()
            ub.z r1 = ub.z.START_ARRAY
            if (r0 != r1) goto L46
            java.lang.Object r6 = r5.U(r6, r7)
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            return r6
        L46:
            boolean r0 = r5.y(r6, r7)
            r5.M(r6, r7)
            return r0
        L4e:
            java.lang.Object r6 = r7.handleUnexpectedToken(r1, r6)
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            return r6
        L59:
            java.lang.String r6 = r7.extractScalarFromObject(r6, r5, r1)
        L5d:
            cd.h r0 = cd.h.f12146j
            lc.c r0 = r5.g(r7, r6, r0, r1)
            lc.c r4 = lc.c.f73087e
            if (r0 != r4) goto L6b
            r5.N(r7)
            return r2
        L6b:
            lc.c r4 = lc.c.f73088f
            if (r0 != r4) goto L70
            goto L8b
        L70:
            java.lang.String r6 = r6.trim()
            int r0 = r6.length()
            r4 = 4
            if (r0 != r4) goto L82
            boolean r0 = w(r6)
            if (r0 == 0) goto L8c
        L81:
            return r3
        L82:
            r3 = 5
            if (r0 != r3) goto L8c
            boolean r0 = s(r6)
            if (r0 == 0) goto L8c
        L8b:
            return r2
        L8c:
            java.lang.String r0 = "null"
            boolean r0 = r0.equals(r6)
            if (r0 == 0) goto L98
            r5.O(r6, r7)
            return r2
        L98:
            java.lang.String r0 = "only \"true\"/\"True\"/\"TRUE\" or \"false\"/\"False\"/\"FALSE\" recognized"
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.Object r6 = r7.handleWeirdStringValue(r1, r6, r0, r2)
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            java.lang.Boolean r7 = java.lang.Boolean.TRUE
            boolean r6 = r7.equals(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: oc.s0.y(ub.u, jc.k):boolean");
    }

    public final byte z(ub.u uVar, jc.k kVar) throws IOException {
        String strExtractScalarFromObject;
        Class<?> cls = this.f78945b;
        int iCurrentTokenId = uVar.currentTokenId();
        lc.c cVar = lc.c.f73088f;
        lc.c cVar2 = lc.c.f73087e;
        Class<?> cls2 = Byte.TYPE;
        if (iCurrentTokenId != 1) {
            if (iCurrentTokenId != 3) {
                if (iCurrentTokenId == 11) {
                    N(kVar);
                    return (byte) 0;
                }
                if (iCurrentTokenId == 6) {
                    strExtractScalarFromObject = uVar.getText();
                } else {
                    if (iCurrentTokenId == 7) {
                        return uVar.getByteValue();
                    }
                    if (iCurrentTokenId == 8) {
                        lc.c cVarE = e(uVar, kVar, cls2);
                        if (cVarE != cVar2 && cVarE != cVar) {
                            return uVar.getByteValue();
                        }
                        return (byte) 0;
                    }
                }
            } else if (kVar.isEnabled(jc.l.UNWRAP_SINGLE_VALUE_ARRAYS)) {
                if (uVar.nextToken() == ub.z.START_ARRAY) {
                    return ((Byte) U(uVar, kVar)).byteValue();
                }
                byte bZ = z(uVar, kVar);
                M(uVar, kVar);
                return bZ;
            }
            return ((Byte) kVar.handleUnexpectedToken(kVar.constructType(cls2), uVar)).byteValue();
        }
        strExtractScalarFromObject = kVar.extractScalarFromObject(uVar, this, cls2);
        lc.c cVarG = g(kVar, strExtractScalarFromObject, cd.h.f12144h, cls2);
        if (cVarG == cVar2) {
            N(kVar);
            return (byte) 0;
        }
        if (cVarG != cVar) {
            String strTrim = strExtractScalarFromObject.trim();
            if (AbstractJsonLexerKt.NULL.equals(strTrim)) {
                O(strTrim, kVar);
                return (byte) 0;
            }
            uVar.streamReadConstraints().validateIntegerLength(strTrim.length());
            try {
                int i10 = cc.m.parseInt(strTrim);
                return (i10 < -128 || i10 > 255) ? ((Byte) kVar.handleWeirdStringValue(cls, strTrim, "overflow, value cannot be represented as 8-bit value", new Object[0])).byteValue() : (byte) i10;
            } catch (IllegalArgumentException unused) {
                return ((Byte) kVar.handleWeirdStringValue(cls, strTrim, "not a valid `byte` value", new Object[0])).byteValue();
            }
        }
        return (byte) 0;
    }

    public jc.o getValueType(jc.k kVar) {
        jc.o oVar = this.f78946c;
        return oVar != null ? oVar : kVar.constructType(this.f78945b);
    }

    public final lc.c g(jc.k kVar, String str, cd.h hVar, Class cls) throws jc.r {
        if (str.isEmpty()) {
            lc.c cVarFindCoercionAction = kVar.findCoercionAction(hVar, cls, lc.f.f73109h);
            b(kVar, cVarFindCoercionAction, cls, str, "empty String (\"\")");
            return cVarFindCoercionAction;
        }
        boolean zR = r(str);
        lc.c cVar = lc.c.f73085b;
        if (zR) {
            lc.c cVarFindCoercionFromBlankString = kVar.findCoercionFromBlankString(hVar, cls, cVar);
            b(kVar, cVarFindCoercionFromBlankString, cls, str, "blank String (all whitespace)");
            return cVarFindCoercionFromBlankString;
        }
        if (kVar.isEnabled(ub.d0.UNTYPED_SCALARS)) {
            return lc.c.f73086c;
        }
        lc.c cVarFindCoercionAction2 = kVar.findCoercionAction(hVar, cls, lc.f.f73107f);
        if (cVarFindCoercionAction2 == cVar) {
            kVar.reportInputMismatch(this, rJqlArycrfkilN.jZwUsjhOlShs, str, m());
        }
        return cVarFindCoercionAction2;
    }

    public s0(jc.o oVar) {
        this.f78945b = oVar == null ? Object.class : oVar.getRawClass();
        this.f78946c = oVar;
    }

    public s0(s0 s0Var) {
        this.f78945b = s0Var.f78945b;
        this.f78946c = s0Var.f78946c;
    }
}
