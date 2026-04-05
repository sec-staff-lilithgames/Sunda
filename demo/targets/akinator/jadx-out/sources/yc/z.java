package yc;

import ic.m0;
import java.io.IOException;
import java.io.OutputStream;
import java.math.BigDecimal;
import java.math.BigInteger;
import lc.d0;
import ub.f0;
import ub.p0;
import yc.s;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class z extends wb.c {

    /* renamed from: t, reason: collision with root package name */
    public ub.a0 f94359t;

    /* renamed from: u, reason: collision with root package name */
    public s f94360u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f94361v;

    public z(jc.t tVar) {
        this(tVar, null);
    }

    public final jc.t A() {
        s sVar;
        if (this.f94361v || (sVar = this.f94360u) == null) {
            return null;
        }
        return sVar.currentNode();
    }

    public final jc.t B() throws ub.q {
        jc.t tVarA = A();
        if (tVarA != null && tVarA.isNumber()) {
            return tVarA;
        }
        throw e("Current token (" + (tVarA == null ? null : tVarA.asToken()) + ") not numeric, cannot use numeric value accessors");
    }

    @Override // wb.c, ub.u, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.f94361v) {
            return;
        }
        this.f94361v = true;
        this.f94360u = null;
        this.f90528g = null;
    }

    @Override // ub.u
    public ub.p currentLocation() {
        return ub.p.f88312i;
    }

    @Override // ub.u
    public String currentName() {
        s parent = this.f94360u;
        ub.z zVar = this.f90528g;
        if (zVar == ub.z.START_OBJECT || zVar == ub.z.START_ARRAY) {
            parent = parent.getParent();
        }
        if (parent == null) {
            return null;
        }
        return parent.getCurrentName();
    }

    @Override // ub.u
    public ub.p currentTokenLocation() {
        return ub.p.f88312i;
    }

    @Override // ub.u
    public BigInteger getBigIntegerValue() throws IOException {
        return B().bigIntegerValue();
    }

    @Override // wb.c, ub.u
    public byte[] getBinaryValue(ub.b bVar) throws IOException {
        jc.t tVarA = A();
        if (tVarA != null) {
            return tVarA instanceof y ? ((y) tVarA).getBinaryValue(bVar) : tVarA.binaryValue();
        }
        return null;
    }

    @Override // ub.u
    public ub.a0 getCodec() {
        return this.f94359t;
    }

    @Override // ub.u
    @Deprecated
    public ub.p getCurrentLocation() {
        return currentLocation();
    }

    @Override // wb.c, ub.u
    @Deprecated
    public String getCurrentName() {
        return currentName();
    }

    @Override // ub.u
    public BigDecimal getDecimalValue() throws IOException {
        return B().decimalValue();
    }

    @Override // ub.u
    public double getDoubleValue() throws IOException {
        return B().doubleValue();
    }

    @Override // ub.u
    public Object getEmbeddedObject() {
        jc.t tVarA;
        if (this.f94361v || (tVarA = A()) == null) {
            return null;
        }
        if (tVarA.isPojo()) {
            return ((w) tVarA).getPojo();
        }
        if (tVarA.isBinary()) {
            return ((d) tVarA).binaryValue();
        }
        return null;
    }

    @Override // ub.u
    public float getFloatValue() throws IOException {
        return (float) B().doubleValue();
    }

    @Override // ub.u
    public int getIntValue() throws IOException {
        u uVar = (u) B();
        if (uVar.canConvertToInt()) {
            return uVar.intValue();
        }
        x();
        throw null;
    }

    @Override // ub.u
    public long getLongValue() throws IOException {
        u uVar = (u) B();
        if (uVar.canConvertToLong()) {
            return uVar.longValue();
        }
        y();
        throw null;
    }

    @Override // ub.u
    public ub.s getNumberType() throws IOException {
        return B().numberType();
    }

    @Override // ub.u
    public ub.t getNumberTypeFP() throws IOException {
        ub.s numberType = getNumberType();
        return numberType == ub.s.f88354h ? ub.t.f88358e : numberType == ub.s.f88353g ? ub.t.f88357c : numberType == ub.s.f88352f ? ub.t.f88356b : ub.t.f88359f;
    }

    @Override // ub.u
    public Number getNumberValue() throws IOException {
        return B().numberValue();
    }

    @Override // wb.c, ub.u
    public ub.y getParsingContext() {
        return this.f94360u;
    }

    @Override // ub.u
    public ic.l getReadCapabilities() {
        return ub.u.f88361e;
    }

    @Override // wb.c, ub.u
    public String getText() {
        ub.z zVar = this.f90528g;
        if (zVar == null) {
            return null;
        }
        switch (zVar.ordinal()) {
            case 5:
                return this.f94360u.getCurrentName();
            case 6:
                jc.t tVarA = A();
                if (tVarA != null && tVarA.isBinary()) {
                    return tVarA.asText();
                }
                break;
            case 7:
                return A().textValue();
            case 8:
            case 9:
                return String.valueOf(A().numberValue());
        }
        return this.f90528g.asString();
    }

    @Override // wb.c, ub.u
    public char[] getTextCharacters() throws IOException {
        return getText().toCharArray();
    }

    @Override // wb.c, ub.u
    public int getTextLength() throws IOException {
        return getText().length();
    }

    @Override // wb.c, ub.u
    public int getTextOffset() throws IOException {
        return 0;
    }

    @Override // ub.u
    @Deprecated
    public ub.p getTokenLocation() {
        return currentTokenLocation();
    }

    @Override // wb.c, ub.u
    public boolean hasTextCharacters() {
        return false;
    }

    @Override // wb.c, ub.u
    public boolean isClosed() {
        return this.f94361v;
    }

    @Override // ub.u
    public boolean isNaN() {
        if (this.f94361v) {
            return false;
        }
        jc.t tVarA = A();
        if (tVarA instanceof u) {
            return ((u) tVarA).isNaN();
        }
        return false;
    }

    @Override // wb.c
    public final void k() {
        m0.throwInternal();
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x003c  */
    @Override // wb.c, ub.u
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ub.z nextToken() throws java.io.IOException {
        /*
            r4 = this;
            yc.s r0 = r4.f94360u
            ub.z r0 = r0.nextToken()
            r4.f90528g = r0
            boolean r1 = r4.f90530i
            if (r1 == 0) goto L1a
            if (r0 == 0) goto L1a
            long r0 = r4.f90529h
            r2 = 1
            long r0 = r0 + r2
            r4.f90529h = r0
            ub.f0 r2 = r4.f90527f
            r2.validateTokenCount(r0)
        L1a:
            ub.z r0 = r4.f90528g
            r1 = 1
            if (r0 != 0) goto L23
            r4.f94361v = r1
            r0 = 0
            return r0
        L23:
            int r0 = r0.ordinal()
            if (r0 == r1) goto L45
            r1 = 2
            if (r0 == r1) goto L3c
            r1 = 3
            if (r0 == r1) goto L33
            r1 = 4
            if (r0 == r1) goto L3c
            goto L4d
        L33:
            yc.s r0 = r4.f94360u
            yc.s r0 = r0.startArray()
            r4.f94360u = r0
            goto L4d
        L3c:
            yc.s r0 = r4.f94360u
            yc.s r0 = r0.getParent()
            r4.f94360u = r0
            goto L4d
        L45:
            yc.s r0 = r4.f94360u
            yc.s r0 = r0.startObject()
            r4.f94360u = r0
        L4d:
            ub.z r0 = r4.f90528g
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: yc.z.nextToken():ub.z");
    }

    @Override // wb.c, ub.u
    public void overrideCurrentName(String str) {
        s parent = this.f94360u;
        ub.z zVar = this.f90528g;
        if (zVar == ub.z.START_OBJECT || zVar == ub.z.START_ARRAY) {
            parent = parent.getParent();
        }
        if (parent != null) {
            parent.overrideCurrentName(str);
        }
    }

    @Override // ub.u
    public int readBinaryValue(ub.b bVar, OutputStream outputStream) throws IOException {
        byte[] binaryValue = getBinaryValue(bVar);
        if (binaryValue == null) {
            return 0;
        }
        outputStream.write(binaryValue, 0, binaryValue.length);
        return binaryValue.length;
    }

    @Override // ub.u
    public void setCodec(ub.a0 a0Var) {
        this.f94359t = a0Var;
    }

    @Override // wb.c, ub.u
    public ub.u skipChildren() throws IOException {
        ub.z zVar = this.f90528g;
        if (zVar == ub.z.START_OBJECT) {
            this.f94360u = this.f94360u.getParent();
            u(ub.z.END_OBJECT);
            return this;
        }
        if (zVar == ub.z.START_ARRAY) {
            this.f94360u = this.f94360u.getParent();
            u(ub.z.END_ARRAY);
        }
        return this;
    }

    @Override // ub.u, ub.q0
    public p0 version() {
        return d0.f73093b;
    }

    public z(jc.t tVar, ub.a0 a0Var) {
        super(f0.defaults());
        this.f94359t = a0Var;
        this.f94360u = new s.c(tVar, null);
    }
}
