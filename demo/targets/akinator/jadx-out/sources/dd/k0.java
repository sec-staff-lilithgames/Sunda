package dd;

import io.odeeo.internal.h.vfsA.QCmNMSGd;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.TreeMap;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import p0.o2;
import rw.hIT.uQjDr;
import ub.o0;
import ub.p0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class k0 extends ub.o {

    /* renamed from: u, reason: collision with root package name */
    public static final int f52049u = ub.n.collectDefaults();

    /* renamed from: f, reason: collision with root package name */
    public ub.a0 f52050f;

    /* renamed from: g, reason: collision with root package name */
    public ub.y f52051g;

    /* renamed from: h, reason: collision with root package name */
    public int f52052h;

    /* renamed from: i, reason: collision with root package name */
    public final ub.f0 f52053i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f52054j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f52055k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f52056l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f52057m;

    /* renamed from: n, reason: collision with root package name */
    public final b f52058n;

    /* renamed from: o, reason: collision with root package name */
    public b f52059o;

    /* renamed from: p, reason: collision with root package name */
    public int f52060p;

    /* renamed from: q, reason: collision with root package name */
    public Object f52061q;

    /* renamed from: r, reason: collision with root package name */
    public Object f52062r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f52063s;

    /* renamed from: t, reason: collision with root package name */
    public ec.g f52064t;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a extends wb.c {
        public transient ic.d A;
        public ub.p B;

        /* renamed from: t, reason: collision with root package name */
        public ub.a0 f52065t;

        /* renamed from: u, reason: collision with root package name */
        public final boolean f52066u;

        /* renamed from: v, reason: collision with root package name */
        public final boolean f52067v;

        /* renamed from: w, reason: collision with root package name */
        public b f52068w;

        /* renamed from: x, reason: collision with root package name */
        public int f52069x;

        /* renamed from: y, reason: collision with root package name */
        public l0 f52070y;

        /* renamed from: z, reason: collision with root package name */
        public boolean f52071z;

        @Deprecated
        public a(b bVar, ub.a0 a0Var, boolean z10, boolean z11) {
            this(bVar, a0Var, z10, z11, null);
        }

        public final void A() throws ub.q {
            ub.z zVar = this.f90528g;
            if (zVar == null || !zVar.isNumeric()) {
                throw e("Current token (" + this.f90528g + ") not numeric, cannot use numeric value accessors");
            }
        }

        public final Object B() {
            return this.f52068w.get(this.f52069x);
        }

        public final Number C(boolean z10) throws ub.q, NumberFormatException {
            A();
            Object objB = B();
            if (objB instanceof Number) {
                return (Number) objB;
            }
            if (!(objB instanceof String)) {
                throw new IllegalStateException("Internal error: entry should be a Number, but is of type " + i.classNameOf(objB));
            }
            String str = (String) objB;
            int length = str.length();
            if (this.f90528g == ub.z.VALUE_NUMBER_INT) {
                return (z10 || length >= 19) ? cc.m.parseBigInteger(str, isEnabled(ub.g0.USE_FAST_BIG_NUMBER_PARSER)) : length >= 10 ? Long.valueOf(cc.m.parseLong(str)) : Integer.valueOf(cc.m.parseInt(str));
            }
            if (!z10) {
                return Double.valueOf(cc.m.parseDouble(str, isEnabled(ub.g0.USE_FAST_DOUBLE_PARSER)));
            }
            BigDecimal bigDecimal = cc.m.parseBigDecimal(str, isEnabled(ub.g0.USE_FAST_BIG_NUMBER_PARSER));
            if (bigDecimal != null) {
                return bigDecimal;
            }
            throw new IllegalStateException(a.b.l("Internal error: failed to parse number '", str, "'"));
        }

        @Override // ub.u
        public boolean canReadObjectId() {
            return this.f52067v;
        }

        @Override // ub.u
        public boolean canReadTypeId() {
            return this.f52066u;
        }

        @Override // wb.c, ub.u, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.f52071z) {
                return;
            }
            this.f52071z = true;
        }

        @Override // ub.u
        public ub.p currentLocation() {
            ub.p pVar = this.B;
            return pVar == null ? ub.p.f88312i : pVar;
        }

        @Override // ub.u
        public String currentName() {
            ub.z zVar = this.f90528g;
            return (zVar == ub.z.START_OBJECT || zVar == ub.z.START_ARRAY) ? this.f52070y.getParent().getCurrentName() : this.f52070y.getCurrentName();
        }

        @Override // ub.u
        public ub.p currentTokenLocation() {
            return currentLocation();
        }

        @Override // ub.u
        public BigInteger getBigIntegerValue() throws NumberFormatException, IOException {
            Number numberC = C(true);
            if (numberC instanceof BigInteger) {
                return (BigInteger) numberC;
            }
            if (!(numberC instanceof BigDecimal)) {
                return BigInteger.valueOf(numberC.longValue());
            }
            BigDecimal bigDecimal = (BigDecimal) numberC;
            streamReadConstraints().validateBigIntegerScale(bigDecimal.scale());
            return bigDecimal.toBigInteger();
        }

        @Override // ub.u
        public ub.a0 getCodec() {
            return this.f52065t;
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
        public BigDecimal getDecimalValue() throws NumberFormatException, IOException {
            Number numberC = C(true);
            return numberC instanceof BigDecimal ? (BigDecimal) numberC : numberC instanceof Integer ? BigDecimal.valueOf(numberC.intValue()) : numberC instanceof Long ? BigDecimal.valueOf(numberC.longValue()) : numberC instanceof BigInteger ? new BigDecimal((BigInteger) numberC) : BigDecimal.valueOf(numberC.doubleValue());
        }

        @Override // ub.u
        public double getDoubleValue() throws IOException {
            return getNumberValue().doubleValue();
        }

        @Override // ub.u
        public Object getEmbeddedObject() {
            if (this.f90528g == ub.z.VALUE_EMBEDDED_OBJECT) {
                return B();
            }
            return null;
        }

        @Override // ub.u
        public float getFloatValue() throws IOException {
            return getNumberValue().floatValue();
        }

        @Override // ub.u
        public int getIntValue() throws NumberFormatException, IOException {
            Number numberC = C(false);
            if ((numberC instanceof Integer) || (numberC instanceof Short) || (numberC instanceof Byte)) {
                return numberC.intValue();
            }
            if (numberC instanceof Long) {
                long jLongValue = numberC.longValue();
                int i10 = (int) jLongValue;
                if (i10 == jLongValue) {
                    return i10;
                }
                x();
                throw null;
            }
            if (numberC instanceof BigInteger) {
                BigInteger bigInteger = (BigInteger) numberC;
                if (wb.c.f90519l.compareTo(bigInteger) > 0 || wb.c.f90520m.compareTo(bigInteger) < 0) {
                    x();
                    throw null;
                }
            } else {
                if ((numberC instanceof Double) || (numberC instanceof Float)) {
                    double dDoubleValue = numberC.doubleValue();
                    if (dDoubleValue >= -2.147483648E9d && dDoubleValue <= 2.147483647E9d) {
                        return (int) dDoubleValue;
                    }
                    x();
                    throw null;
                }
                if (numberC instanceof BigDecimal) {
                    BigDecimal bigDecimal = (BigDecimal) numberC;
                    if (wb.c.f90525r.compareTo(bigDecimal) > 0 || wb.c.f90526s.compareTo(bigDecimal) < 0) {
                        x();
                        throw null;
                    }
                } else {
                    ic.m0.throwInternal();
                }
            }
            return numberC.intValue();
        }

        @Override // ub.u
        public long getLongValue() throws NumberFormatException, IOException {
            Number numberC = C(false);
            if ((numberC instanceof Long) || (numberC instanceof Integer) || (numberC instanceof Short) || (numberC instanceof Byte)) {
                return numberC.longValue();
            }
            if (numberC instanceof BigInteger) {
                BigInteger bigInteger = (BigInteger) numberC;
                if (wb.c.f90521n.compareTo(bigInteger) > 0 || wb.c.f90522o.compareTo(bigInteger) < 0) {
                    y();
                    throw null;
                }
            } else {
                if ((numberC instanceof Double) || (numberC instanceof Float)) {
                    double dDoubleValue = numberC.doubleValue();
                    if (dDoubleValue >= -9.223372036854776E18d && dDoubleValue <= 9.223372036854776E18d) {
                        return (long) dDoubleValue;
                    }
                    y();
                    throw null;
                }
                if (numberC instanceof BigDecimal) {
                    BigDecimal bigDecimal = (BigDecimal) numberC;
                    if (wb.c.f90523p.compareTo(bigDecimal) > 0 || wb.c.f90524q.compareTo(bigDecimal) < 0) {
                        y();
                        throw null;
                    }
                } else {
                    ic.m0.throwInternal();
                }
            }
            return numberC.longValue();
        }

        @Override // ub.u
        public ub.s getNumberType() throws IOException {
            Object numberValueDeferred = getNumberValueDeferred();
            boolean z10 = numberValueDeferred instanceof Integer;
            ub.s sVar = ub.s.f88349b;
            if (z10) {
                return sVar;
            }
            if (numberValueDeferred instanceof Long) {
                return ub.s.f88350c;
            }
            if (numberValueDeferred instanceof Double) {
                return ub.s.f88353g;
            }
            boolean z11 = numberValueDeferred instanceof BigDecimal;
            ub.s sVar2 = ub.s.f88354h;
            if (z11) {
                return sVar2;
            }
            boolean z12 = numberValueDeferred instanceof BigInteger;
            ub.s sVar3 = ub.s.f88351e;
            if (z12) {
                return sVar3;
            }
            if (numberValueDeferred instanceof Float) {
                return ub.s.f88352f;
            }
            if (numberValueDeferred instanceof Short) {
                return sVar;
            }
            if (numberValueDeferred instanceof String) {
                return this.f90528g == ub.z.VALUE_NUMBER_FLOAT ? sVar2 : sVar3;
            }
            return null;
        }

        @Override // ub.u
        public ub.t getNumberTypeFP() throws IOException {
            if (this.f90528g == ub.z.VALUE_NUMBER_FLOAT) {
                Object objB = B();
                if (objB instanceof Double) {
                    return ub.t.f88357c;
                }
                if (objB instanceof BigDecimal) {
                    return ub.t.f88358e;
                }
                if (objB instanceof Float) {
                    return ub.t.f88356b;
                }
            }
            return ub.t.f88359f;
        }

        @Override // ub.u
        public final Number getNumberValue() throws IOException {
            return C(false);
        }

        @Override // ub.u
        public Object getNumberValueDeferred() throws IOException {
            A();
            return B();
        }

        @Override // ub.u
        public Object getObjectId() {
            return this.f52068w.b(this.f52069x);
        }

        @Override // wb.c, ub.u
        public ub.y getParsingContext() {
            return this.f52070y;
        }

        @Override // ub.u
        public ic.l getReadCapabilities() {
            return ub.u.f88361e;
        }

        @Override // wb.c, ub.u
        public String getText() {
            ub.z zVar = this.f90528g;
            if (zVar == ub.z.VALUE_STRING || zVar == ub.z.FIELD_NAME) {
                Object objB = B();
                return objB instanceof String ? (String) objB : i.nullOrToString(objB);
            }
            if (zVar == null) {
                return null;
            }
            int iOrdinal = zVar.ordinal();
            return (iOrdinal == 8 || iOrdinal == 9) ? i.nullOrToString(B()) : this.f90528g.asString();
        }

        @Override // wb.c, ub.u
        public char[] getTextCharacters() {
            String text = getText();
            if (text == null) {
                return null;
            }
            return text.toCharArray();
        }

        @Override // wb.c, ub.u
        public int getTextLength() {
            String text = getText();
            if (text == null) {
                return 0;
            }
            return text.length();
        }

        @Override // wb.c, ub.u
        public int getTextOffset() {
            return 0;
        }

        @Override // ub.u
        @Deprecated
        public ub.p getTokenLocation() {
            return currentTokenLocation();
        }

        @Override // ub.u
        public Object getTypeId() {
            b bVar = this.f52068w;
            int i10 = this.f52069x;
            TreeMap treeMap = bVar.f52076d;
            if (treeMap == null) {
                return null;
            }
            return treeMap.get(Integer.valueOf(i10 + i10));
        }

        @Override // wb.c, ub.u
        public boolean hasTextCharacters() {
            return false;
        }

        @Override // wb.c, ub.u
        public boolean isClosed() {
            return this.f52071z;
        }

        @Override // ub.u
        public boolean isNaN() {
            boolean zIsFinite;
            if (this.f90528g != ub.z.VALUE_NUMBER_FLOAT) {
                return false;
            }
            Object objB = B();
            if (objB instanceof Double) {
                zIsFinite = Double.isFinite(((Double) objB).doubleValue());
            } else {
                if (!(objB instanceof Float)) {
                    return false;
                }
                zIsFinite = Double.isFinite(((Float) objB).floatValue());
            }
            return !zIsFinite;
        }

        @Override // wb.c
        public final void k() {
            ic.m0.throwInternal();
        }

        @Override // ub.u
        public String nextFieldName() throws IOException {
            b bVar;
            if (this.f52071z || (bVar = this.f52068w) == null) {
                return null;
            }
            int i10 = this.f52069x + 1;
            if (i10 < 16) {
                ub.z zVarType = bVar.type(i10);
                ub.z zVar = ub.z.FIELD_NAME;
                if (zVarType == zVar) {
                    this.f52069x = i10;
                    u(zVar);
                    Object obj = this.f52068w.get(i10);
                    String string = obj instanceof String ? (String) obj : obj.toString();
                    this.f52070y.setCurrentName(string);
                    return string;
                }
            }
            if (nextToken() == ub.z.FIELD_NAME) {
                return currentName();
            }
            return null;
        }

        @Override // wb.c, ub.u
        public ub.z nextToken() throws IOException {
            b bVar;
            if (this.f52071z || (bVar = this.f52068w) == null) {
                return null;
            }
            int i10 = this.f52069x + 1;
            this.f52069x = i10;
            if (i10 >= 16) {
                this.f52069x = 0;
                b next = bVar.next();
                this.f52068w = next;
                if (next == null) {
                    return null;
                }
            }
            u(this.f52068w.type(this.f52069x));
            ub.z zVar = this.f90528g;
            if (zVar == ub.z.FIELD_NAME) {
                Object objB = B();
                this.f52070y.setCurrentName(objB instanceof String ? (String) objB : objB.toString());
            } else if (zVar == ub.z.START_OBJECT) {
                this.f52070y = this.f52070y.createChildObjectContext();
            } else if (zVar == ub.z.START_ARRAY) {
                this.f52070y = this.f52070y.createChildArrayContext();
            } else if (zVar == ub.z.END_OBJECT || zVar == ub.z.END_ARRAY) {
                this.f52070y = this.f52070y.parentOrCopy();
            } else {
                this.f52070y.updateForValue();
            }
            return this.f90528g;
        }

        @Override // wb.c, ub.u
        public void overrideCurrentName(String str) {
            ub.y parent = this.f52070y;
            ub.z zVar = this.f90528g;
            if (zVar == ub.z.START_OBJECT || zVar == ub.z.START_ARRAY) {
                parent = parent.getParent();
            }
            if (parent instanceof l0) {
                try {
                    ((l0) parent).setCurrentName(str);
                } catch (IOException e10) {
                    throw new RuntimeException(e10);
                }
            }
        }

        public ub.z peekNextToken() throws IOException {
            if (!this.f52071z) {
                b next = this.f52068w;
                int i10 = this.f52069x + 1;
                if (i10 >= 16) {
                    next = next == null ? null : next.next();
                    i10 = 0;
                }
                if (next != null) {
                    return next.type(i10);
                }
            }
            return null;
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
            this.f52065t = a0Var;
        }

        public void setLocation(ub.p pVar) {
            this.B = pVar;
        }

        @Override // wb.c, ub.u
        public ub.f0 streamReadConstraints() {
            return this.f90527f;
        }

        @Override // ub.u, ub.q0
        public p0 version() {
            return lc.d0.f73093b;
        }

        @Deprecated
        public a(b bVar, ub.a0 a0Var, boolean z10, boolean z11, ub.y yVar) {
            this(bVar, a0Var, z10, z11, yVar, ub.f0.defaults());
        }

        @Override // wb.c, ub.u
        public byte[] getBinaryValue(ub.b bVar) throws IOException {
            if (this.f90528g == ub.z.VALUE_EMBEDDED_OBJECT) {
                Object objB = B();
                if (objB instanceof byte[]) {
                    return (byte[]) objB;
                }
            }
            if (this.f90528g != ub.z.VALUE_STRING) {
                throw e(uQjDr.rzukZB + this.f90528g + ") not VALUE_STRING (or VALUE_EMBEDDED_OBJECT with byte[]), cannot access as binary");
            }
            String text = getText();
            if (text == null) {
                return null;
            }
            ic.d dVar = this.A;
            if (dVar == null) {
                dVar = new ic.d(100);
                this.A = dVar;
            } else {
                dVar.reset();
            }
            i(text, dVar, bVar);
            return dVar.toByteArray();
        }

        public a(b bVar, ub.a0 a0Var, boolean z10, boolean z11, ub.y yVar, ub.f0 f0Var) {
            super(f0Var);
            this.B = null;
            this.f52068w = bVar;
            this.f52069x = -1;
            this.f52065t = a0Var;
            this.f52070y = l0.createRootContext(yVar);
            this.f52066u = z10;
            this.f52067v = z11;
        }
    }

    public k0(ub.u uVar) {
        this(uVar, (jc.k) null);
    }

    @Deprecated
    public static k0 asCopyOfValue(ub.u uVar) throws IOException {
        k0 k0Var = new k0(uVar);
        k0Var.copyCurrentStructure(uVar);
        return k0Var;
    }

    public k0 append(k0 k0Var) throws IOException {
        if (!this.f52055k) {
            this.f52055k = k0Var.canWriteTypeId();
        }
        if (!this.f52056l) {
            this.f52056l = k0Var.canWriteObjectId();
        }
        this.f52057m = this.f52055k || this.f52056l;
        ub.u uVarAsParser = k0Var.asParser();
        while (uVarAsParser.nextToken() != null) {
            copyCurrentStructure(uVarAsParser);
        }
        return this;
    }

    public ub.u asParser() {
        return asParser(this.f52050f);
    }

    public ub.u asParserOnFirstToken() throws IOException {
        ub.u uVarAsParser = asParser(this.f52050f);
        uVarAsParser.nextToken();
        return uVarAsParser;
    }

    @Override // ub.o
    public boolean canWriteBinaryNatively() {
        return true;
    }

    @Override // ub.o
    public boolean canWriteObjectId() {
        return this.f52056l;
    }

    @Override // ub.o
    public boolean canWriteTypeId() {
        return this.f52055k;
    }

    @Override // ub.o, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f52054j = true;
    }

    @Override // ub.o
    public void copyCurrentStructure(ub.u uVar) throws IOException {
        ub.z zVarCurrentToken = uVar.currentToken();
        if (zVarCurrentToken == ub.z.FIELD_NAME) {
            if (this.f52057m) {
                o(uVar);
            }
            writeFieldName(uVar.currentName());
            zVarCurrentToken = uVar.nextToken();
        } else if (zVarCurrentToken == null) {
            throw new cc.j(uVar, null, "Unexpected end-of-input");
        }
        int iOrdinal = zVarCurrentToken.ordinal();
        if (iOrdinal == 1) {
            if (this.f52057m) {
                o(uVar);
            }
            writeStartObject();
            p(uVar);
            return;
        }
        if (iOrdinal == 2) {
            writeEndObject();
            return;
        }
        if (iOrdinal != 3) {
            if (iOrdinal != 4) {
                q(uVar, zVarCurrentToken);
                return;
            } else {
                writeEndArray();
                return;
            }
        }
        if (this.f52057m) {
            o(uVar);
        }
        writeStartArray();
        p(uVar);
    }

    public k0 deserialize(ub.u uVar, jc.k kVar) throws IOException {
        ub.z zVarNextToken;
        if (!uVar.hasToken(ub.z.FIELD_NAME)) {
            copyCurrentStructure(uVar);
            return this;
        }
        writeStartObject();
        do {
            copyCurrentStructure(uVar);
            zVarNextToken = uVar.nextToken();
        } while (zVarNextToken == ub.z.FIELD_NAME);
        ub.z zVar = ub.z.END_OBJECT;
        if (zVarNextToken != zVar) {
            kVar.reportWrongTokenException(k0.class, zVar, "Expected END_OBJECT after copying contents of a JsonParser into TokenBuffer, got " + zVarNextToken, new Object[0]);
        }
        writeEndObject();
        return this;
    }

    @Override // ub.o
    public ub.o disable(ub.n nVar) {
        this.f52052h = (~nVar.getMask()) & this.f52052h;
        return this;
    }

    @Override // ub.o
    public ub.o enable(ub.n nVar) {
        this.f52052h = nVar.getMask() | this.f52052h;
        return this;
    }

    public ub.z firstToken() {
        return this.f52058n.type(0);
    }

    @Override // ub.o, java.io.Flushable
    public void flush() throws IOException {
    }

    public k0 forceUseOfBigDecimal(boolean z10) {
        return this;
    }

    @Override // ub.o
    public ub.a0 getCodec() {
        return this.f52050f;
    }

    @Override // ub.o
    public int getFeatureMask() {
        return this.f52052h;
    }

    @Override // ub.o
    public ic.l getWriteCapabilities() {
        return ub.o.f88309c;
    }

    @Override // ub.o
    public final void h() {
        throw new UnsupportedOperationException("Called operation not supported for TokenBuffer");
    }

    @Override // ub.o
    public boolean isClosed() {
        return this.f52054j;
    }

    public boolean isEmpty() {
        return this.f52060p == 0 && this.f52058n == this.f52059o;
    }

    @Override // ub.o
    public boolean isEnabled(ub.n nVar) {
        return (nVar.getMask() & this.f52052h) != 0;
    }

    public final void j(Object obj) {
        b bVarAppend = this.f52063s ? this.f52059o.append(this.f52060p, ub.z.FIELD_NAME, obj, this.f52062r, this.f52061q) : this.f52059o.append(this.f52060p, ub.z.FIELD_NAME, obj);
        if (bVarAppend == null) {
            this.f52060p++;
        } else {
            this.f52059o = bVarAppend;
            this.f52060p = 1;
        }
    }

    public final void k(StringBuilder sb2) {
        Object objB = this.f52059o.b(this.f52060p - 1);
        if (objB != null) {
            sb2.append("[objectId=");
            sb2.append(String.valueOf(objB));
            sb2.append(AbstractJsonLexerKt.END_LIST);
        }
        b bVar = this.f52059o;
        int i10 = this.f52060p - 1;
        TreeMap treeMap = bVar.f52076d;
        Object obj = treeMap == null ? null : treeMap.get(Integer.valueOf(i10 + i10));
        if (obj != null) {
            sb2.append("[typeId=");
            sb2.append(String.valueOf(obj));
            sb2.append(AbstractJsonLexerKt.END_LIST);
        }
    }

    public final void l(ub.z zVar) {
        b bVarAppend = this.f52063s ? this.f52059o.append(this.f52060p, zVar, this.f52062r, this.f52061q) : this.f52059o.append(this.f52060p, zVar);
        if (bVarAppend == null) {
            this.f52060p++;
        } else {
            this.f52059o = bVarAppend;
            this.f52060p = 1;
        }
    }

    public final void m(Object obj, ub.z zVar) {
        this.f52064t.writeValue();
        b bVarAppend = this.f52063s ? this.f52059o.append(this.f52060p, zVar, obj, this.f52062r, this.f52061q) : this.f52059o.append(this.f52060p, zVar, obj);
        if (bVarAppend == null) {
            this.f52060p++;
        } else {
            this.f52059o = bVarAppend;
            this.f52060p = 1;
        }
    }

    public final void n(ub.z zVar) {
        this.f52064t.writeValue();
        b bVarAppend = this.f52063s ? this.f52059o.append(this.f52060p, zVar, this.f52062r, this.f52061q) : this.f52059o.append(this.f52060p, zVar);
        if (bVarAppend == null) {
            this.f52060p++;
        } else {
            this.f52059o = bVarAppend;
            this.f52060p = 1;
        }
    }

    public final void o(ub.u uVar) throws IOException {
        Object typeId = uVar.getTypeId();
        this.f52061q = typeId;
        if (typeId != null) {
            this.f52063s = true;
        }
        Object objectId = uVar.getObjectId();
        this.f52062r = objectId;
        if (objectId != null) {
            this.f52063s = true;
        }
    }

    public k0 overrideParentContext(ub.y yVar) {
        this.f52051g = yVar;
        return this;
    }

    @Override // ub.o
    public ub.o overrideStdFeatures(int i10, int i11) {
        this.f52052h = (i10 & i11) | (getFeatureMask() & (~i11));
        return this;
    }

    public final void p(ub.u uVar) throws IOException {
        int i10 = 1;
        while (true) {
            ub.z zVarNextToken = uVar.nextToken();
            if (zVarNextToken == null) {
                return;
            }
            int iOrdinal = zVarNextToken.ordinal();
            if (iOrdinal == 1) {
                if (this.f52057m) {
                    o(uVar);
                }
                writeStartObject();
            } else if (iOrdinal == 2) {
                writeEndObject();
                i10--;
                if (i10 == 0) {
                    return;
                }
            } else if (iOrdinal == 3) {
                if (this.f52057m) {
                    o(uVar);
                }
                writeStartArray();
            } else if (iOrdinal == 4) {
                writeEndArray();
                i10--;
                if (i10 == 0) {
                    return;
                }
            } else if (iOrdinal != 5) {
                q(uVar, zVarNextToken);
            } else {
                if (this.f52057m) {
                    o(uVar);
                }
                writeFieldName(uVar.currentName());
            }
            i10++;
        }
    }

    public final void q(ub.u uVar, ub.z zVar) throws IOException {
        if (this.f52057m) {
            o(uVar);
        }
        switch (zVar.ordinal()) {
            case 6:
                writeObject(uVar.getEmbeddedObject());
                return;
            case 7:
                if (uVar.hasTextCharacters()) {
                    writeString(uVar.getTextCharacters(), uVar.getTextOffset(), uVar.getTextLength());
                    return;
                } else {
                    writeString(uVar.getText());
                    return;
                }
            case 8:
                int iOrdinal = uVar.getNumberType().ordinal();
                if (iOrdinal == 0) {
                    writeNumber(uVar.getIntValue());
                    return;
                } else if (iOrdinal != 2) {
                    writeNumber(uVar.getLongValue());
                    return;
                } else {
                    m(uVar.getNumberValueDeferred(), ub.z.VALUE_NUMBER_INT);
                    return;
                }
            case 9:
                m(uVar.getNumberValueDeferred(), ub.z.VALUE_NUMBER_FLOAT);
                return;
            case 10:
                writeBoolean(true);
                return;
            case 11:
                writeBoolean(false);
                return;
            case 12:
                writeNull();
                return;
            default:
                throw new RuntimeException("Internal error: unexpected token: " + zVar);
        }
    }

    public void serialize(ub.o oVar) throws IOException {
        boolean z10 = this.f52057m;
        b next = this.f52058n;
        boolean z11 = z10 && next.hasIds();
        int i10 = -1;
        while (true) {
            i10++;
            if (i10 >= 16) {
                next = next.next();
                if (next == null) {
                    return;
                }
                z11 = z10 && next.hasIds();
                i10 = 0;
            }
            ub.z zVarType = next.type(i10);
            if (zVarType == null) {
                return;
            }
            if (z11) {
                Object objB = next.b(i10);
                if (objB != null) {
                    oVar.writeObjectId(objB);
                }
                TreeMap treeMap = next.f52076d;
                Object obj = treeMap == null ? null : treeMap.get(Integer.valueOf(i10 + i10));
                if (obj != null) {
                    oVar.writeTypeId(obj);
                }
            }
            switch (zVarType.ordinal()) {
                case 1:
                    oVar.writeStartObject();
                    break;
                case 2:
                    oVar.writeEndObject();
                    break;
                case 3:
                    oVar.writeStartArray();
                    break;
                case 4:
                    oVar.writeEndArray();
                    break;
                case 5:
                    Object obj2 = next.get(i10);
                    if (!(obj2 instanceof ub.c0)) {
                        oVar.writeFieldName((String) obj2);
                        break;
                    } else {
                        oVar.writeFieldName((ub.c0) obj2);
                        break;
                    }
                case 6:
                    Object obj3 = next.get(i10);
                    if (!(obj3 instanceof g0)) {
                        if (!(obj3 instanceof jc.v)) {
                            oVar.writeEmbeddedObject(obj3);
                            break;
                        } else {
                            oVar.writeObject(obj3);
                            break;
                        }
                    } else {
                        ((g0) obj3).serialize(oVar);
                        break;
                    }
                case 7:
                    Object obj4 = next.get(i10);
                    if (!(obj4 instanceof ub.c0)) {
                        oVar.writeString((String) obj4);
                        break;
                    } else {
                        oVar.writeString((ub.c0) obj4);
                        break;
                    }
                case 8:
                    Object obj5 = next.get(i10);
                    if (!(obj5 instanceof Integer)) {
                        if (!(obj5 instanceof BigInteger)) {
                            if (!(obj5 instanceof Long)) {
                                if (!(obj5 instanceof Short)) {
                                    oVar.writeNumber(((Number) obj5).intValue());
                                    break;
                                } else {
                                    oVar.writeNumber(((Short) obj5).shortValue());
                                    break;
                                }
                            } else {
                                oVar.writeNumber(((Long) obj5).longValue());
                                break;
                            }
                        } else {
                            oVar.writeNumber((BigInteger) obj5);
                            break;
                        }
                    } else {
                        oVar.writeNumber(((Integer) obj5).intValue());
                        break;
                    }
                case 9:
                    Object obj6 = next.get(i10);
                    if (obj6 instanceof Double) {
                        oVar.writeNumber(((Double) obj6).doubleValue());
                        break;
                    } else if (obj6 instanceof BigDecimal) {
                        oVar.writeNumber((BigDecimal) obj6);
                        break;
                    } else if (obj6 instanceof Float) {
                        oVar.writeNumber(((Float) obj6).floatValue());
                        break;
                    } else if (obj6 == null) {
                        oVar.writeNull();
                        break;
                    } else {
                        if (!(obj6 instanceof String)) {
                            e("Unrecognized value type for VALUE_NUMBER_FLOAT: " + obj6.getClass().getName() + ", cannot serialize");
                            throw null;
                        }
                        oVar.writeNumber((String) obj6);
                        break;
                    }
                case 10:
                    oVar.writeBoolean(true);
                    break;
                case 11:
                    oVar.writeBoolean(false);
                    break;
                case 12:
                    oVar.writeNull();
                    break;
                default:
                    throw new RuntimeException("Internal error: should never end up through this code path");
            }
        }
    }

    @Override // ub.o
    public ub.o setCodec(ub.a0 a0Var) {
        this.f52050f = a0Var;
        return this;
    }

    @Override // ub.o
    @Deprecated
    public ub.o setFeatureMask(int i10) {
        this.f52052h = i10;
        return this;
    }

    public String toString() {
        StringBuilder sbU = o2.u("[TokenBuffer: ");
        ub.u uVarAsParser = asParser();
        int i10 = 0;
        boolean z10 = this.f52055k || this.f52056l;
        while (true) {
            try {
                ub.z zVarNextToken = uVarAsParser.nextToken();
                if (zVarNextToken == null) {
                    break;
                }
                if (z10) {
                    k(sbU);
                }
                if (i10 < 100) {
                    if (i10 > 0) {
                        sbU.append(", ");
                    }
                    sbU.append(zVarNextToken.toString());
                    if (zVarNextToken == ub.z.FIELD_NAME) {
                        sbU.append('(');
                        sbU.append(uVarAsParser.currentName());
                        sbU.append(')');
                    }
                }
                i10++;
            } catch (IOException e10) {
                throw new IllegalStateException(e10);
            }
        }
        if (i10 >= 100) {
            sbU.append(" ... (truncated ");
            sbU.append(i10 - 100);
            sbU.append(" entries)");
        }
        sbU.append(AbstractJsonLexerKt.END_LIST);
        return sbU.toString();
    }

    @Override // ub.o
    public ub.o useDefaultPrettyPrinter() {
        return this;
    }

    @Override // ub.o, ub.q0
    public p0 version() {
        return lc.d0.f73093b;
    }

    @Override // ub.o
    public void writeBinary(ub.b bVar, byte[] bArr, int i10, int i11) throws IOException {
        byte[] bArr2 = new byte[i11];
        System.arraycopy(bArr, i10, bArr2, 0, i11);
        writeObject(bArr2);
    }

    @Override // ub.o
    public void writeBoolean(boolean z10) throws IOException {
        n(z10 ? ub.z.VALUE_TRUE : ub.z.VALUE_FALSE);
    }

    @Override // ub.o
    public void writeEmbeddedObject(Object obj) throws IOException {
        m(obj, ub.z.VALUE_EMBEDDED_OBJECT);
    }

    @Override // ub.o
    public final void writeEndArray() throws IOException {
        b bVarAppend = this.f52059o.append(this.f52060p, ub.z.END_ARRAY);
        if (bVarAppend == null) {
            this.f52060p++;
        } else {
            this.f52059o = bVarAppend;
            this.f52060p = 1;
        }
        ec.g parent = this.f52064t.getParent();
        if (parent != null) {
            this.f52064t = parent;
        }
    }

    @Override // ub.o
    public final void writeEndObject() throws IOException {
        b bVarAppend = this.f52059o.append(this.f52060p, ub.z.END_OBJECT);
        if (bVarAppend == null) {
            this.f52060p++;
        } else {
            this.f52059o = bVarAppend;
            this.f52060p = 1;
        }
        ec.g parent = this.f52064t.getParent();
        if (parent != null) {
            this.f52064t = parent;
        }
    }

    @Override // ub.o
    public final void writeFieldName(String str) throws IOException {
        this.f52064t.writeFieldName(str);
        j(str);
    }

    @Override // ub.o
    public void writeNull() throws IOException {
        n(ub.z.VALUE_NULL);
    }

    @Override // ub.o
    public void writeNumber(short s10) throws IOException {
        m(Short.valueOf(s10), ub.z.VALUE_NUMBER_INT);
    }

    @Override // ub.o
    public void writeObject(Object obj) throws IOException {
        if (obj == null) {
            writeNull();
            return;
        }
        if (obj.getClass() == byte[].class || (obj instanceof g0)) {
            m(obj, ub.z.VALUE_EMBEDDED_OBJECT);
            return;
        }
        ub.a0 a0Var = this.f52050f;
        if (a0Var == null) {
            m(obj, ub.z.VALUE_EMBEDDED_OBJECT);
        } else {
            a0Var.writeValue(this, obj);
        }
    }

    @Override // ub.o
    public void writeObjectId(Object obj) {
        this.f52062r = obj;
        this.f52063s = true;
    }

    @Override // ub.o
    public void writeRaw(String str) throws IOException {
        h();
        throw null;
    }

    @Override // ub.o
    public void writeRawUTF8String(byte[] bArr, int i10, int i11) throws IOException {
        h();
        throw null;
    }

    @Override // ub.o
    public void writeRawValue(String str) throws IOException {
        m(new g0(str), ub.z.VALUE_EMBEDDED_OBJECT);
    }

    @Override // ub.o
    public final void writeStartArray() throws IOException {
        this.f52064t.writeValue();
        l(ub.z.START_ARRAY);
        this.f52064t = this.f52064t.createChildArrayContext();
    }

    @Override // ub.o
    public final void writeStartObject() throws IOException {
        this.f52064t.writeValue();
        l(ub.z.START_OBJECT);
        this.f52064t = this.f52064t.createChildObjectContext();
    }

    @Override // ub.o
    public void writeString(String str) throws IOException {
        if (str == null) {
            writeNull();
        } else {
            m(str, ub.z.VALUE_STRING);
        }
    }

    @Override // ub.o
    public void writeTree(o0 o0Var) throws IOException {
        if (o0Var == null) {
            writeNull();
            return;
        }
        ub.a0 a0Var = this.f52050f;
        if (a0Var == null) {
            m(o0Var, ub.z.VALUE_EMBEDDED_OBJECT);
        } else {
            a0Var.writeTree(this, o0Var);
        }
    }

    @Override // ub.o
    public void writeTypeId(Object obj) {
        this.f52061q = obj;
        this.f52063s = true;
    }

    @Override // ub.o
    public void writeUTF8String(byte[] bArr, int i10, int i11) throws IOException {
        h();
        throw null;
    }

    public k0(ub.u uVar, jc.k kVar) {
        this.f52053i = ub.f0.defaults();
        this.f52063s = false;
        this.f52050f = uVar.getCodec();
        this.f52053i = uVar.streamReadConstraints();
        this.f52051g = uVar.getParsingContext();
        this.f52052h = f52049u;
        this.f52064t = ec.g.createRootContext(null);
        b bVar = new b();
        this.f52059o = bVar;
        this.f52058n = bVar;
        this.f52060p = 0;
        this.f52055k = uVar.canReadTypeId();
        boolean zCanReadObjectId = uVar.canReadObjectId();
        this.f52056l = zCanReadObjectId;
        this.f52057m = this.f52055k || zCanReadObjectId;
        if (kVar == null) {
            return;
        }
        kVar.isEnabled(jc.l.USE_BIG_DECIMAL_FOR_FLOATS);
    }

    public ub.u asParser(ub.a0 a0Var) {
        return new a(this.f52058n, a0Var, this.f52055k, this.f52056l, this.f52051g, this.f52053i);
    }

    @Override // ub.o
    public void copyCurrentEvent(ub.u uVar) throws IOException {
        if (this.f52057m) {
            o(uVar);
        }
        switch (uVar.currentToken().ordinal()) {
            case 1:
                writeStartObject();
                return;
            case 2:
                writeEndObject();
                return;
            case 3:
                writeStartArray();
                return;
            case 4:
                writeEndArray();
                return;
            case 5:
                writeFieldName(uVar.currentName());
                return;
            case 6:
                writeObject(uVar.getEmbeddedObject());
                return;
            case 7:
                if (uVar.hasTextCharacters()) {
                    writeString(uVar.getTextCharacters(), uVar.getTextOffset(), uVar.getTextLength());
                    return;
                } else {
                    writeString(uVar.getText());
                    return;
                }
            case 8:
                int iOrdinal = uVar.getNumberType().ordinal();
                if (iOrdinal == 0) {
                    writeNumber(uVar.getIntValue());
                    return;
                } else if (iOrdinal != 2) {
                    writeNumber(uVar.getLongValue());
                    return;
                } else {
                    m(uVar.getNumberValueDeferred(), ub.z.VALUE_NUMBER_INT);
                    return;
                }
            case 9:
                m(uVar.getNumberValueDeferred(), ub.z.VALUE_NUMBER_FLOAT);
                return;
            case 10:
                writeBoolean(true);
                return;
            case 11:
                writeBoolean(false);
                return;
            case 12:
                writeNull();
                return;
            default:
                throw new RuntimeException(QCmNMSGd.DQDu + uVar.currentToken());
        }
    }

    @Override // ub.o
    public final ec.g getOutputContext() {
        return this.f52064t;
    }

    @Override // ub.o
    public void writeNumber(int i10) throws IOException {
        m(Integer.valueOf(i10), ub.z.VALUE_NUMBER_INT);
    }

    @Override // ub.o
    public void writeRaw(String str, int i10, int i11) throws IOException {
        h();
        throw null;
    }

    @Override // ub.o
    public void writeRawValue(String str, int i10, int i11) throws IOException {
        if (i10 > 0 || i11 != str.length()) {
            str = str.substring(i10, i11 + i10);
        }
        m(new g0(str), ub.z.VALUE_EMBEDDED_OBJECT);
    }

    public ub.u asParser(ub.f0 f0Var) {
        return new a(this.f52058n, this.f52050f, this.f52055k, this.f52056l, this.f52051g, f0Var);
    }

    @Override // ub.o
    public void writeFieldName(ub.c0 c0Var) throws IOException {
        this.f52064t.writeFieldName(c0Var.getValue());
        j(c0Var);
    }

    @Override // ub.o
    public void writeNumber(long j10) throws IOException {
        m(Long.valueOf(j10), ub.z.VALUE_NUMBER_INT);
    }

    @Override // ub.o
    public void writeRaw(ub.c0 c0Var) throws IOException {
        h();
        throw null;
    }

    @Override // ub.o
    public void writeString(char[] cArr, int i10, int i11) throws IOException {
        writeString(new String(cArr, i10, i11));
    }

    public ub.u asParser(ub.u uVar) {
        a aVar = new a(this.f52058n, uVar.getCodec(), this.f52055k, this.f52056l, this.f52051g, uVar.streamReadConstraints());
        aVar.setLocation(uVar.currentTokenLocation());
        return aVar;
    }

    @Override // ub.o
    public int writeBinary(ub.b bVar, InputStream inputStream, int i10) {
        throw new UnsupportedOperationException();
    }

    @Override // ub.o
    public void writeNumber(double d10) throws IOException {
        m(Double.valueOf(d10), ub.z.VALUE_NUMBER_FLOAT);
    }

    @Override // ub.o
    public void writeRaw(char[] cArr, int i10, int i11) throws IOException {
        h();
        throw null;
    }

    @Override // ub.o
    public void writeStartArray(Object obj) throws IOException {
        this.f52064t.writeValue();
        l(ub.z.START_ARRAY);
        this.f52064t = this.f52064t.createChildArrayContext(obj);
    }

    @Override // ub.o
    public void writeStartObject(Object obj) throws IOException {
        this.f52064t.writeValue();
        l(ub.z.START_OBJECT);
        this.f52064t = this.f52064t.createChildObjectContext(obj);
    }

    @Override // ub.o
    public void writeString(ub.c0 c0Var) throws IOException {
        if (c0Var == null) {
            writeNull();
        } else {
            m(c0Var, ub.z.VALUE_STRING);
        }
    }

    @Override // ub.o
    public void writeNumber(float f10) throws IOException {
        m(Float.valueOf(f10), ub.z.VALUE_NUMBER_FLOAT);
    }

    @Override // ub.o
    public void writeRaw(char c10) throws IOException {
        h();
        throw null;
    }

    @Override // ub.o
    public void writeRawValue(char[] cArr, int i10, int i11) throws IOException {
        m(new String(cArr, i10, i11), ub.z.VALUE_EMBEDDED_OBJECT);
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b {

        /* renamed from: e, reason: collision with root package name */
        public static final ub.z[] f52072e;

        /* renamed from: a, reason: collision with root package name */
        public b f52073a;

        /* renamed from: b, reason: collision with root package name */
        public long f52074b;

        /* renamed from: c, reason: collision with root package name */
        public final Object[] f52075c = new Object[16];

        /* renamed from: d, reason: collision with root package name */
        public TreeMap f52076d;

        static {
            ub.z[] zVarArr = new ub.z[16];
            f52072e = zVarArr;
            ub.z[] zVarArrValues = ub.z.values();
            System.arraycopy(zVarArrValues, 1, zVarArr, 1, Math.min(15, zVarArrValues.length - 1));
        }

        public final void a(int i10, Object obj, Object obj2) {
            if (this.f52076d == null) {
                this.f52076d = new TreeMap();
            }
            if (obj != null) {
                this.f52076d.put(Integer.valueOf(i10 + i10 + 1), obj);
            }
            if (obj2 != null) {
                this.f52076d.put(Integer.valueOf(i10 + i10), obj2);
            }
        }

        public b append(int i10, ub.z zVar) {
            if (i10 >= 16) {
                b bVar = new b();
                this.f52073a = bVar;
                bVar.f52074b = zVar.ordinal() | bVar.f52074b;
                return this.f52073a;
            }
            long jOrdinal = zVar.ordinal();
            if (i10 > 0) {
                jOrdinal <<= i10 << 2;
            }
            this.f52074b |= jOrdinal;
            return null;
        }

        public final Object b(int i10) {
            TreeMap treeMap = this.f52076d;
            if (treeMap == null) {
                return null;
            }
            return treeMap.get(Integer.valueOf(i10 + i10 + 1));
        }

        public Object get(int i10) {
            return this.f52075c[i10];
        }

        public boolean hasIds() {
            return this.f52076d != null;
        }

        public b next() {
            return this.f52073a;
        }

        public int rawType(int i10) {
            long j10 = this.f52074b;
            if (i10 > 0) {
                j10 >>= i10 << 2;
            }
            return ((int) j10) & 15;
        }

        public ub.z type(int i10) {
            long j10 = this.f52074b;
            if (i10 > 0) {
                j10 >>= i10 << 2;
            }
            return f52072e[((int) j10) & 15];
        }

        public b append(int i10, ub.z zVar, Object obj, Object obj2) {
            if (i10 < 16) {
                long jOrdinal = zVar.ordinal();
                if (i10 > 0) {
                    jOrdinal <<= i10 << 2;
                }
                this.f52074b = jOrdinal | this.f52074b;
                a(i10, obj, obj2);
                return null;
            }
            b bVar = new b();
            this.f52073a = bVar;
            bVar.f52074b = zVar.ordinal() | bVar.f52074b;
            bVar.a(0, obj, obj2);
            return this.f52073a;
        }

        public b append(int i10, ub.z zVar, Object obj) {
            if (i10 < 16) {
                this.f52075c[i10] = obj;
                long jOrdinal = zVar.ordinal();
                if (i10 > 0) {
                    jOrdinal <<= i10 << 2;
                }
                this.f52074b |= jOrdinal;
                return null;
            }
            b bVar = new b();
            this.f52073a = bVar;
            bVar.f52075c[0] = obj;
            bVar.f52074b = zVar.ordinal() | bVar.f52074b;
            return this.f52073a;
        }

        public b append(int i10, ub.z zVar, Object obj, Object obj2, Object obj3) {
            if (i10 < 16) {
                this.f52075c[i10] = obj;
                long jOrdinal = zVar.ordinal();
                if (i10 > 0) {
                    jOrdinal <<= i10 << 2;
                }
                this.f52074b = jOrdinal | this.f52074b;
                a(i10, obj2, obj3);
                return null;
            }
            b bVar = new b();
            this.f52073a = bVar;
            bVar.f52075c[0] = obj;
            bVar.f52074b = zVar.ordinal() | bVar.f52074b;
            bVar.a(0, obj2, obj3);
            return this.f52073a;
        }
    }

    @Override // ub.o
    public void writeNumber(BigDecimal bigDecimal) throws IOException {
        if (bigDecimal == null) {
            writeNull();
        } else {
            m(bigDecimal, ub.z.VALUE_NUMBER_FLOAT);
        }
    }

    @Override // ub.o
    public void writeString(Reader reader, int i10) throws IOException {
        if (reader != null) {
            int i11 = i10 >= 0 ? i10 : Integer.MAX_VALUE;
            char[] cArr = new char[1000];
            StringBuilder sb2 = new StringBuilder(1000);
            while (i11 > 0) {
                int i12 = reader.read(cArr, 0, Math.min(i11, 1000));
                if (i12 <= 0) {
                    break;
                }
                sb2.append(cArr, 0, i12);
                i11 -= i12;
            }
            if (i11 > 0 && i10 >= 0) {
                e("Was not able to read enough from reader");
                throw null;
            }
            m(sb2.toString(), ub.z.VALUE_STRING);
            return;
        }
        e("null reader");
        throw null;
    }

    @Override // ub.o
    public void writeStartArray(Object obj, int i10) throws IOException {
        this.f52064t.writeValue();
        l(ub.z.START_ARRAY);
        this.f52064t = this.f52064t.createChildArrayContext(obj);
    }

    @Override // ub.o
    public void writeStartObject(Object obj, int i10) throws IOException {
        this.f52064t.writeValue();
        l(ub.z.START_OBJECT);
        this.f52064t = this.f52064t.createChildObjectContext(obj);
    }

    @Override // ub.o
    public void writeNumber(BigInteger bigInteger) throws IOException {
        if (bigInteger == null) {
            writeNull();
        } else {
            m(bigInteger, ub.z.VALUE_NUMBER_INT);
        }
    }

    @Override // ub.o
    public void writeNumber(String str) throws IOException {
        m(str, ub.z.VALUE_NUMBER_FLOAT);
    }

    public void writeNumber(String str, boolean z10) throws IOException {
        m(str, z10 ? ub.z.VALUE_NUMBER_INT : ub.z.VALUE_NUMBER_FLOAT);
    }

    public k0(ub.a0 a0Var, boolean z10) {
        this.f52053i = ub.f0.defaults();
        this.f52063s = false;
        this.f52050f = a0Var;
        this.f52052h = f52049u;
        this.f52064t = ec.g.createRootContext(null);
        b bVar = new b();
        this.f52059o = bVar;
        this.f52058n = bVar;
        this.f52060p = 0;
        this.f52055k = z10;
        this.f52056l = z10;
        this.f52057m = z10 || z10;
    }
}
