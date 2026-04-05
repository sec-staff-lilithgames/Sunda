package oc;

import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class f extends s0 implements mc.k {

    /* renamed from: f, reason: collision with root package name */
    public final Boolean f78849f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f78850g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f78851h;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public yc.f[] f78852a;

        /* renamed from: b, reason: collision with root package name */
        public int f78853b;

        /* renamed from: c, reason: collision with root package name */
        public int f78854c;

        public yc.f popOrNull() {
            int i10 = this.f78853b;
            if (i10 == 0) {
                return null;
            }
            yc.f[] fVarArr = this.f78852a;
            int i11 = i10 - 1;
            this.f78853b = i11;
            return fVarArr[i11];
        }

        public void push(yc.f fVar) {
            int i10 = this.f78853b;
            int i11 = this.f78854c;
            if (i10 < i11) {
                yc.f[] fVarArr = this.f78852a;
                this.f78853b = i10 + 1;
                fVarArr[i10] = fVar;
                return;
            }
            if (this.f78852a == null) {
                this.f78854c = 10;
                this.f78852a = new yc.f[10];
            } else {
                int iMin = Math.min(4000, Math.max(20, i11 >> 1)) + i11;
                this.f78854c = iMin;
                this.f78852a = (yc.f[]) Arrays.copyOf(this.f78852a, iMin);
            }
            yc.f[] fVarArr2 = this.f78852a;
            int i12 = this.f78853b;
            this.f78853b = i12 + 1;
            fVarArr2[i12] = fVar;
        }

        public int size() {
            return this.f78853b;
        }
    }

    public f(Class<jc.t> cls, Boolean bool) {
        super(cls);
        this.f78849f = bool;
        this.f78850g = true;
        this.f78851h = true;
    }

    public static yc.a0 a0(jc.k kVar, yc.o oVar, BigDecimal bigDecimal) {
        lc.q datatypeFeatures = kVar.getDatatypeFeatures();
        lc.w wVar = lc.w.STRIP_TRAILING_BIGDECIMAL_ZEROES;
        if (datatypeFeatures.isExplicitlySet(wVar) ? datatypeFeatures.isEnabled(wVar) : oVar.willStripTrailingBigDecimalZeroes()) {
            try {
                bigDecimal = bigDecimal.signum() == 0 ? new BigDecimal(BigInteger.ZERO, 0) : bigDecimal.stripTrailingZeros();
            } catch (ArithmeticException unused) {
            }
        }
        return oVar.numberNode(bigDecimal);
    }

    public static jc.t b0(ub.u uVar, jc.k kVar) throws IOException {
        yc.o nodeFactory = kVar.getNodeFactory();
        Object embeddedObject = uVar.getEmbeddedObject();
        return embeddedObject == null ? nodeFactory.nullNode() : embeddedObject.getClass() == byte[].class ? nodeFactory.binaryNode((byte[]) embeddedObject) : embeddedObject instanceof dd.g0 ? nodeFactory.rawValueNode((dd.g0) embeddedObject) : embeddedObject instanceof jc.t ? (jc.t) embeddedObject : nodeFactory.pojoNode(embeddedObject);
    }

    public static yc.a0 d0(ub.u uVar, int i10, yc.o oVar) throws IOException {
        if (i10 != 0) {
            return jc.l.USE_BIG_INTEGER_FOR_INTS.enabledIn(i10) ? oVar.numberNode(uVar.getBigIntegerValue()) : oVar.numberNode(uVar.getLongValue());
        }
        ub.s numberType = uVar.getNumberType();
        return numberType == ub.s.f88349b ? oVar.numberNode(uVar.getIntValue()) : numberType == ub.s.f88350c ? oVar.numberNode(uVar.getLongValue()) : oVar.numberNode(uVar.getBigIntegerValue());
    }

    public static yc.a0 e0(ub.u uVar, jc.k kVar, yc.o oVar) {
        int deserializationFeatures = kVar.getDeserializationFeatures();
        int i10 = s0.f78944e & deserializationFeatures;
        ub.s sVar = ub.s.f88350c;
        ub.s numberType = i10 != 0 ? jc.l.USE_BIG_INTEGER_FOR_INTS.enabledIn(deserializationFeatures) ? ub.s.f88351e : jc.l.USE_LONG_FOR_INTS.enabledIn(deserializationFeatures) ? sVar : uVar.getNumberType() : uVar.getNumberType();
        return numberType == ub.s.f88349b ? oVar.numberNode(uVar.getIntValue()) : numberType == sVar ? oVar.numberNode(uVar.getLongValue()) : oVar.numberNode(uVar.getBigIntegerValue());
    }

    public static void f0(jc.k kVar, yc.o oVar, String str, yc.v vVar, jc.t tVar, jc.t tVar2) throws jc.r {
        if (kVar.isEnabled(jc.l.FAIL_ON_READING_DUP_TREE_KEY)) {
            kVar.reportInputMismatch(jc.t.class, "Duplicate field '%s' for `ObjectNode`: not allowed when `DeserializationFeature.FAIL_ON_READING_DUP_TREE_KEY` enabled", str);
        }
        if (kVar.isEnabled(ub.d0.DUPLICATE_PROPERTIES)) {
            if (tVar.isArray()) {
                ((yc.a) tVar).add(tVar2);
                vVar.replace(str, tVar);
            } else {
                yc.a aVarArrayNode = oVar.arrayNode();
                aVarArrayNode.add(tVar);
                aVarArrayNode.add(tVar2);
                vVar.replace(str, aVarArrayNode);
            }
        }
    }

    public abstract jc.q V(boolean z10, boolean z11);

    public final jc.t W(ub.u uVar, jc.k kVar) {
        yc.o nodeFactory = kVar.getNodeFactory();
        int iCurrentTokenId = uVar.currentTokenId();
        if (iCurrentTokenId == 2) {
            return nodeFactory.objectNode();
        }
        switch (iCurrentTokenId) {
            case 6:
                return nodeFactory.textNode(uVar.getText());
            case 7:
                return e0(uVar, kVar, nodeFactory);
            case 8:
                return c0(uVar, kVar, nodeFactory);
            case 9:
                return nodeFactory.booleanNode(true);
            case 10:
                return nodeFactory.booleanNode(false);
            case 11:
                return nodeFactory.nullNode();
            case 12:
                return b0(uVar, kVar);
            default:
                return (jc.t) kVar.handleUnexpectedToken(handledType(), uVar);
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:14:0x0029. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:44:0x00b0. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0065  */
    /* JADX WARN: Type inference failed for: r7v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void X(ub.u r11, jc.k r12, yc.o r13, oc.f.a r14, yc.f r15) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 318
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: oc.f.X(ub.u, jc.k, yc.o, oc.f$a, yc.f):void");
    }

    public final yc.v Y(ub.u uVar, jc.k kVar, yc.o oVar, a aVar) throws IOException {
        jc.t tVarW;
        yc.v vVarObjectNode = oVar.objectNode();
        String strCurrentName = uVar.currentName();
        while (strCurrentName != null) {
            ub.z zVarNextToken = uVar.nextToken();
            if (zVarNextToken == null) {
                zVarNextToken = ub.z.NOT_AVAILABLE;
            }
            int iId = zVarNextToken.id();
            if (iId == 1) {
                yc.v vVarObjectNode2 = oVar.objectNode();
                X(uVar, kVar, oVar, aVar, vVarObjectNode2);
                tVarW = vVarObjectNode2;
            } else if (iId != 3) {
                tVarW = W(uVar, kVar);
            } else {
                yc.a aVarArrayNode = oVar.arrayNode();
                X(uVar, kVar, oVar, aVar, aVarArrayNode);
                tVarW = aVarArrayNode;
            }
            jc.t tVarReplace = vVarObjectNode.replace(strCurrentName, tVarW);
            if (tVarReplace != null) {
                f0(kVar, oVar, strCurrentName, vVarObjectNode, tVarReplace, tVarW);
            }
            strCurrentName = uVar.nextFieldName();
        }
        return vVarObjectNode;
    }

    public final jc.t Z(ub.u uVar, jc.k kVar) {
        int iCurrentTokenId = uVar.currentTokenId();
        return iCurrentTokenId != 2 ? iCurrentTokenId != 8 ? iCurrentTokenId != 12 ? (jc.t) kVar.handleUnexpectedToken(handledType(), uVar) : b0(uVar, kVar) : c0(uVar, kVar, kVar.getNodeFactory()) : kVar.getNodeFactory().objectNode();
    }

    public final jc.t c0(ub.u uVar, jc.k kVar, yc.o oVar) throws IOException {
        ub.t numberTypeFP = uVar.getNumberTypeFP();
        if (numberTypeFP == ub.t.f88358e) {
            return a0(kVar, oVar, uVar.getDecimalValue());
        }
        Boolean explicitState = kVar.getDatatypeFeatures().getExplicitState(lc.w.USE_BIG_DECIMAL_FOR_FLOATS);
        return explicitState == null ? kVar.isEnabled(jc.l.USE_BIG_DECIMAL_FOR_FLOATS) : explicitState.booleanValue() ? uVar.isNaN() ? kVar.isEnabled(lc.w.FAIL_ON_NAN_TO_BIG_DECIMAL_COERCION) ? (jc.t) kVar.handleWeirdNumberValue(handledType(), Double.valueOf(uVar.getDoubleValue()), "Cannot convert NaN into BigDecimal", new Object[0]) : oVar.numberNode(uVar.getDoubleValue()) : a0(kVar, oVar, uVar.getDecimalValue()) : numberTypeFP == ub.t.f88356b ? oVar.numberNode(uVar.getFloatValue()) : oVar.numberNode(uVar.getDoubleValue());
    }

    @Override // mc.k
    public jc.q createContextual(jc.k kVar, jc.g gVar) throws jc.r {
        jc.j config = kVar.getConfig();
        Boolean defaultMergeable = config.getDefaultMergeable(yc.a.class);
        Boolean defaultMergeable2 = config.getDefaultMergeable(yc.v.class);
        Boolean defaultMergeable3 = config.getDefaultMergeable(jc.t.class);
        boolean zBooleanValue = true;
        boolean zBooleanValue2 = defaultMergeable != null ? defaultMergeable.booleanValue() : defaultMergeable3 != null ? defaultMergeable3.booleanValue() : true;
        if (defaultMergeable2 != null) {
            zBooleanValue = defaultMergeable2.booleanValue();
        } else if (defaultMergeable3 != null) {
            zBooleanValue = defaultMergeable3.booleanValue();
        }
        return (zBooleanValue2 == this.f78850g && zBooleanValue == this.f78851h) ? this : V(zBooleanValue2, zBooleanValue);
    }

    @Override // oc.s0, jc.q
    public Object deserializeWithType(ub.u uVar, jc.k kVar, wc.g gVar) throws IOException {
        return gVar.deserializeTypedFromAny(uVar, kVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x004b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final jc.t g0(ub.u r8, jc.k r9, yc.v r10, oc.f.a r11) throws java.io.IOException {
        /*
            r7 = this;
            boolean r0 = r8.isExpectedStartObjectToken()
            if (r0 == 0) goto Lb
            java.lang.String r0 = r8.nextFieldName()
            goto L1e
        Lb:
            ub.z r0 = ub.z.FIELD_NAME
            boolean r0 = r8.hasToken(r0)
            if (r0 != 0) goto L1a
            java.lang.Object r8 = r7.deserialize(r8, r9)
            jc.t r8 = (jc.t) r8
            return r8
        L1a:
            java.lang.String r0 = r8.currentName()
        L1e:
            yc.o r4 = r9.getNodeFactory()
        L22:
            if (r0 == 0) goto Lc8
            ub.z r1 = r8.nextToken()
            jc.t r2 = r10.get(r0)
            if (r2 == 0) goto L4b
            boolean r3 = r2 instanceof yc.v
            if (r3 == 0) goto L4f
            ub.z r3 = ub.z.START_OBJECT
            if (r1 != r3) goto L4b
            boolean r3 = r7.f78851h
            if (r3 == 0) goto L4b
            r1 = r2
            yc.v r1 = (yc.v) r1
            jc.t r1 = r7.g0(r8, r9, r1, r11)
            if (r1 == r2) goto L46
            r10.set(r0, r1)
        L46:
            r2 = r8
            r3 = r9
            r5 = r11
            goto Lbf
        L4b:
            r2 = r8
            r3 = r9
            r5 = r11
            goto L66
        L4f:
            boolean r3 = r2 instanceof yc.a
            if (r3 == 0) goto L4b
            ub.z r3 = ub.z.START_ARRAY
            if (r1 != r3) goto L4b
            boolean r3 = r7.f78850g
            if (r3 == 0) goto L4b
            r6 = r2
            yc.a r6 = (yc.a) r6
            r1 = r7
            r2 = r8
            r3 = r9
            r5 = r11
            r1.X(r2, r3, r4, r5, r6)
            goto Lbf
        L66:
            if (r1 != 0) goto L6a
            ub.z r1 = ub.z.NOT_AVAILABLE
        L6a:
            int r8 = r1.id()
            r9 = 1
            if (r8 == r9) goto Lb3
            r11 = 3
            if (r8 == r11) goto La9
            r11 = 6
            if (r8 == r11) goto La0
            r11 = 7
            if (r8 == r11) goto L9b
            switch(r8) {
                case 9: goto L96;
                case 10: goto L90;
                case 11: goto L82;
                default: goto L7d;
            }
        L7d:
            jc.t r8 = r7.Z(r2, r3)
            goto Lbc
        L82:
            lc.w r8 = lc.w.READ_NULL_PROPERTIES
            boolean r8 = r3.isEnabled(r8)
            if (r8 != 0) goto L8b
            goto Lbf
        L8b:
            yc.t r8 = r4.nullNode()
            goto Lbc
        L90:
            r8 = 0
            yc.e r8 = r4.booleanNode(r8)
            goto Lbc
        L96:
            yc.e r8 = r4.booleanNode(r9)
            goto Lbc
        L9b:
            yc.a0 r8 = e0(r2, r3, r4)
            goto Lbc
        La0:
            java.lang.String r8 = r2.getText()
            yc.y r8 = r4.textNode(r8)
            goto Lbc
        La9:
            yc.a r6 = r4.arrayNode()
            r1 = r7
            r1.X(r2, r3, r4, r5, r6)
        Lb1:
            r8 = r6
            goto Lbc
        Lb3:
            yc.v r6 = r4.objectNode()
            r1 = r7
            r1.X(r2, r3, r4, r5, r6)
            goto Lb1
        Lbc:
            r10.set(r0, r8)
        Lbf:
            java.lang.String r0 = r2.nextFieldName()
            r8 = r2
            r9 = r3
            r11 = r5
            goto L22
        Lc8:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: oc.f.g0(ub.u, jc.k, yc.v, oc.f$a):jc.t");
    }

    @Override // jc.q
    public boolean isCachable() {
        return true;
    }

    @Override // jc.q
    public cd.h logicalType() {
        return cd.h.f12143g;
    }

    @Override // jc.q
    public Boolean supportsUpdate(jc.j jVar) {
        return this.f78849f;
    }

    public f(f fVar, boolean z10, boolean z11) {
        super(fVar);
        this.f78849f = fVar.f78849f;
        this.f78850g = z10;
        this.f78851h = z11;
    }
}
