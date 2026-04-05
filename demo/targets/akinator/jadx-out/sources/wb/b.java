package wb;

import cc.f;
import cc.h;
import cc.m;
import ec.e;
import ic.d;
import ic.j0;
import ic.l;
import ic.m0;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;
import ub.f0;
import ub.g0;
import ub.p;
import ub.p0;
import ub.q;
import ub.r;
import ub.s;
import ub.u;
import ub.z;
import w0.i;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class b extends c {
    public static final l X = u.f88361e;
    public long A;
    public int B;
    public int C;
    public e D;
    public z E;
    public final j0 F;
    public char[] G;
    public boolean H;
    public d I;
    public byte[] J;
    public int K;
    public int L;
    public long M;
    public float N;
    public double O;
    public BigInteger P;
    public BigDecimal Q;
    public String R;
    public boolean S;
    public boolean T;
    public int U;
    public int V;
    public int W;

    /* renamed from: t, reason: collision with root package name */
    public final h f90511t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f90512u;

    /* renamed from: v, reason: collision with root package name */
    public int f90513v;

    /* renamed from: w, reason: collision with root package name */
    public int f90514w;

    /* renamed from: x, reason: collision with root package name */
    public long f90515x;

    /* renamed from: y, reason: collision with root package name */
    public int f90516y;

    /* renamed from: z, reason: collision with root package name */
    public int f90517z;

    public b(h hVar, int i10) {
        super(i10, hVar.streamReadConstraints());
        this.f90516y = 1;
        this.B = 1;
        this.K = 0;
        this.f90511t = hVar;
        this.F = hVar.constructReadConstrainedTextBuffer();
        this.D = e.createRootContext(r.STRICT_DUPLICATE_DETECTION.enabledIn(i10) ? ec.b.rootDetector(this) : null);
    }

    public static int[] V(int i10, int[] iArr) {
        if (iArr == null) {
            return new int[i10];
        }
        int length = iArr.length + i10;
        if (length >= 0) {
            return Arrays.copyOf(iArr, length);
        }
        throw new IllegalArgumentException("Unable to grow array to longer than `Integer.MAX_VALUE`");
    }

    public static IllegalArgumentException W(ub.b bVar, int i10, int i11, String str) {
        String strD;
        if (i10 <= 32) {
            strD = String.format("Illegal white space character (code 0x%s) as character #%d of 4-char base64 unit: can only used between units", Integer.toHexString(i10), Integer.valueOf(i11 + 1));
        } else if (bVar.usesPaddingChar(i10)) {
            strD = "Unexpected padding character ('" + bVar.getPaddingChar() + "') as character #" + (i11 + 1) + " of 4-char base64 unit: padding only legal as 3rd or 4th character";
        } else if (!Character.isDefined(i10) || Character.isISOControl(i10)) {
            strD = "Illegal character (code 0x" + Integer.toHexString(i10) + ") in base64 content";
        } else {
            strD = "Illegal character '" + ((char) i10) + "' (code 0x" + Integer.toHexString(i10) + ") in base64 content";
        }
        if (str != null) {
            strD = i.d(strD, ": ", str);
        }
        return new IllegalArgumentException(strD);
    }

    public final void A(int i10, int i11) {
        int mask = r.STRICT_DUPLICATE_DETECTION.getMask();
        if ((i11 & mask) == 0 || (i10 & mask) == 0) {
            return;
        }
        if (this.D.getDupDetector() == null) {
            this.D = this.D.withDupDetector(ec.b.rootDetector(this));
        } else {
            this.D = this.D.withDupDetector(null);
        }
    }

    public abstract void B();

    public final f C() {
        return r.INCLUDE_SOURCE_IN_LOCATION.enabledIn(this.f88362b) ? this.f90511t.contentReference() : f.redacted();
    }

    public final int D(ub.b bVar, char c10, int i10) {
        if (c10 != '\\') {
            throw W(bVar, c10, i10, null);
        }
        char cF = F();
        if (cF <= ' ' && i10 == 0) {
            return -1;
        }
        int iDecodeBase64Char = bVar.decodeBase64Char(cF);
        if (iDecodeBase64Char >= 0 || (iDecodeBase64Char == -2 && i10 >= 2)) {
            return iDecodeBase64Char;
        }
        throw W(bVar, cF, i10, null);
    }

    public final int E(ub.b bVar, int i10, int i11) {
        if (i10 != 92) {
            throw W(bVar, i10, i11, null);
        }
        char cF = F();
        if (cF <= ' ' && i11 == 0) {
            return -1;
        }
        int iDecodeBase64Char = bVar.decodeBase64Char((int) cF);
        if (iDecodeBase64Char >= 0 || iDecodeBase64Char == -2) {
            return iDecodeBase64Char;
        }
        throw W(bVar, cF, i11, null);
    }

    public char F() {
        throw new UnsupportedOperationException();
    }

    public final BigDecimal G() throws q {
        BigDecimal bigDecimal = this.Q;
        if (bigDecimal != null) {
            return bigDecimal;
        }
        String str = this.R;
        if (str == null) {
            throw new IllegalStateException("cannot get BigDecimal from current parser state");
        }
        try {
            BigDecimal bigDecimal2 = m.parseBigDecimal(str, isEnabled(g0.USE_FAST_BIG_NUMBER_PARSER));
            this.Q = bigDecimal2;
            this.R = null;
            return bigDecimal2;
        } catch (NumberFormatException e10) {
            v("Malformed numeric value (" + c.m(this.R) + ")", e10);
            throw null;
        }
    }

    public final BigInteger H() throws q {
        BigInteger bigInteger = this.P;
        if (bigInteger != null) {
            return bigInteger;
        }
        String str = this.R;
        if (str == null) {
            throw new IllegalStateException("cannot get BigInteger from current parser state");
        }
        try {
            BigInteger bigInteger2 = m.parseBigInteger(str, isEnabled(g0.USE_FAST_BIG_NUMBER_PARSER));
            this.P = bigInteger2;
            this.R = null;
            return bigInteger2;
        } catch (NumberFormatException e10) {
            v("Malformed numeric value (" + c.m(this.R) + ")", e10);
            throw null;
        }
    }

    public final double I() throws q {
        String str = this.R;
        if (str != null) {
            try {
                this.O = m.parseDouble(str, isEnabled(g0.USE_FAST_DOUBLE_PARSER));
                this.R = null;
            } catch (NumberFormatException e10) {
                v("Malformed numeric value (" + c.m(this.R) + ")", e10);
                throw null;
            }
        }
        return this.O;
    }

    public final float J() throws q {
        String str = this.R;
        if (str != null) {
            try {
                this.N = m.parseFloat(str, isEnabled(g0.USE_FAST_DOUBLE_PARSER));
                this.R = null;
            } catch (NumberFormatException e10) {
                v("Malformed numeric value (" + c.m(this.R) + ")", e10);
                throw null;
            }
        }
        return this.N;
    }

    public final int[] K(int i10, int[] iArr) throws xb.b {
        this.f90527f.validateNameLength(iArr.length << 2);
        return V(i10, iArr);
    }

    public final void L(char c10) {
        if (isEnabled(r.ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER)) {
            return;
        }
        if (c10 == '\'' && isEnabled(r.ALLOW_SINGLE_QUOTES)) {
            return;
        }
        throw f("Unrecognized character escape " + c.j(c10), h());
    }

    public final int M() throws IOException {
        if (this.f90512u) {
            throw e("Internal error: _parseNumericValue called when parser instance closed");
        }
        if (this.f90528g != z.VALUE_NUMBER_INT || this.U > 9) {
            N(1);
            if ((this.K & 1) == 0) {
                S();
            }
            return this.L;
        }
        int iContentsAsInt = this.F.contentsAsInt(this.T);
        this.L = iContentsAsInt;
        this.K = 1;
        return iContentsAsInt;
    }

    public final void N(int i10) throws IOException {
        if (this.f90512u) {
            throw e("Internal error: _parseNumericValue called when parser instance closed");
        }
        z zVar = this.f90528g;
        z zVar2 = z.VALUE_NUMBER_INT;
        j0 j0Var = this.F;
        if (zVar != zVar2) {
            if (zVar != z.VALUE_NUMBER_FLOAT) {
                n(zVar, "Current token (%s) not numeric, can not use numeric value accessors");
                throw null;
            }
            if (i10 == 16) {
                this.Q = j0Var.contentsAsDecimal(isEnabled(g0.USE_FAST_BIG_NUMBER_PARSER));
                this.K = 16;
                return;
            }
            if (i10 == 8) {
                this.O = j0Var.contentsAsDouble(isEnabled(g0.USE_FAST_DOUBLE_PARSER));
                this.K = 8;
                return;
            } else if (i10 == 32) {
                this.N = j0Var.contentsAsFloat(isEnabled(g0.USE_FAST_DOUBLE_PARSER));
                this.K = 32;
                return;
            } else {
                this.O = 0.0d;
                this.R = j0Var.contentsAsString();
                this.K = 8;
                return;
            }
        }
        int i11 = this.U;
        if (i11 <= 9) {
            this.L = j0Var.contentsAsInt(this.T);
            this.K = 1;
            return;
        }
        if (i11 <= 18) {
            long jContentsAsLong = j0Var.contentsAsLong(this.T);
            if (i11 == 10) {
                if (this.T) {
                    if (jContentsAsLong >= -2147483648L) {
                        this.L = (int) jContentsAsLong;
                        this.K = 1;
                        return;
                    }
                } else if (jContentsAsLong <= 2147483647L) {
                    this.L = (int) jContentsAsLong;
                    this.K = 1;
                    return;
                }
            }
            this.M = jContentsAsLong;
            this.K = 2;
            return;
        }
        if (i11 == 19) {
            char[] textBuffer = j0Var.getTextBuffer();
            int textOffset = j0Var.getTextOffset();
            boolean z10 = this.T;
            if (z10) {
                textOffset++;
            }
            if (m.inLongRange(textBuffer, textOffset, i11, z10)) {
                this.M = m.parseLong19(textBuffer, textOffset, this.T);
                this.K = 2;
                return;
            }
        }
        String strContentsAsString = j0Var.contentsAsString();
        if (i10 == 1 || i10 == 2) {
            if (i10 == 1) {
                throw new xb.a(this, String.format("Numeric value (%s) out of range of int (%d - %s)", c.l(strContentsAsString), Integer.MIN_VALUE, Integer.MAX_VALUE), currentToken(), Integer.TYPE);
            }
            z(strContentsAsString);
            throw null;
        }
        if (i10 == 8 || i10 == 32) {
            this.R = strContentsAsString;
            this.K = 8;
        } else {
            this.P = null;
            this.R = strContentsAsString;
            this.K = 4;
        }
    }

    public void O() {
        this.F.releaseBuffers();
        char[] cArr = this.G;
        if (cArr != null) {
            this.G = null;
            this.f90511t.releaseNameCopyBuffer(cArr);
        }
    }

    public final void P(char c10, int i10) {
        e parsingContext = getParsingContext();
        if (!parsingContext.inRoot()) {
            throw f(String.format("Unexpected close marker '%s': expected '%c' (for %s starting at %s)", Character.valueOf((char) i10), Character.valueOf(c10), parsingContext.typeDesc(), parsingContext.startLocation(C())), h());
        }
        throw f("Unexpected close marker '" + ((char) i10) + "': no open " + (i10 == 125 ? "Object" : "Array") + " to close", h());
    }

    public final void Q(int i10, String str) {
        if (!isEnabled(r.ALLOW_UNQUOTED_CONTROL_CHARS) || i10 > 32) {
            throw f("Illegal unquoted character (" + c.j((char) i10) + "): has to be escaped using backslash to be included in " + str, h());
        }
    }

    public final String R() {
        return isEnabled(r.ALLOW_NON_NUMERIC_NUMBERS) ? "(JSON String, Number (or 'NaN'/'+INF'/'-INF'), Array, Object or token 'null', 'true' or 'false')" : "(JSON String, Number, Array, Object or token 'null', 'true' or 'false')";
    }

    public final void S() {
        int i10 = this.K;
        if ((i10 & 2) != 0) {
            long j10 = this.M;
            int i11 = (int) j10;
            if (i11 != j10) {
                throw new xb.a(this, String.format("Numeric value (%s) out of range of int (%d - %s)", c.l(getText()), Integer.MIN_VALUE, Integer.MAX_VALUE), currentToken(), Integer.TYPE);
            }
            this.L = i11;
        } else if ((i10 & 4) != 0) {
            BigInteger bigIntegerH = H();
            if (c.f90519l.compareTo(bigIntegerH) > 0 || c.f90520m.compareTo(bigIntegerH) < 0) {
                x();
                throw null;
            }
            this.L = bigIntegerH.intValue();
        } else if ((i10 & 8) != 0) {
            double dI = I();
            if (dI < -2.147483648E9d || dI > 2.147483647E9d) {
                x();
                throw null;
            }
            this.L = (int) dI;
        } else if ((i10 & 16) != 0) {
            BigDecimal bigDecimalG = G();
            if (c.f90525r.compareTo(bigDecimalG) > 0 || c.f90526s.compareTo(bigDecimalG) < 0) {
                x();
                throw null;
            }
            this.L = bigDecimalG.intValue();
        } else {
            m0.throwInternal();
        }
        this.K |= 1;
    }

    public final void T(int i10, int i11) {
        e eVarCreateChildArrayContext = this.D.createChildArrayContext(i10, i11);
        this.D = eVarCreateChildArrayContext;
        this.f90527f.validateNestingDepth(eVarCreateChildArrayContext.getNestingDepth());
    }

    public final void U(int i10, int i11) {
        e eVarCreateChildObjectContext = this.D.createChildObjectContext(i10, i11);
        this.D = eVarCreateChildObjectContext;
        this.f90527f.validateNestingDepth(eVarCreateChildObjectContext.getNestingDepth());
    }

    public final z X(String str, double d10) throws IOException {
        this.F.resetWithString(str);
        this.O = d10;
        this.K = 8;
        this.S = true;
        this.R = null;
        return z.VALUE_NUMBER_FLOAT;
    }

    public final z Y(int i10, int i11, int i12, boolean z10) throws xb.b {
        this.f90527f.validateFPLength(i10 + i11 + i12);
        this.T = z10;
        this.S = false;
        this.U = i10;
        this.V = i11;
        this.W = i12;
        this.K = 0;
        this.R = null;
        return z.VALUE_NUMBER_FLOAT;
    }

    public final z Z(int i10, boolean z10) throws xb.b {
        this.f90527f.validateIntegerLength(i10);
        this.T = z10;
        this.S = false;
        this.U = i10;
        this.V = 0;
        this.W = 0;
        this.K = 0;
        this.R = null;
        return z.VALUE_NUMBER_INT;
    }

    public d _getByteArrayBuilder() {
        d dVar = this.I;
        if (dVar == null) {
            this.I = new d();
        } else {
            dVar.reset();
        }
        return this.I;
    }

    @Override // ub.u
    public void assignCurrentValue(Object obj) {
        this.D.setCurrentValue(obj);
    }

    @Override // wb.c, ub.u, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        h hVar = this.f90511t;
        if (this.f90512u) {
            return;
        }
        this.f90513v = Math.max(this.f90513v, this.f90514w);
        this.f90512u = true;
        try {
            B();
        } finally {
            O();
            hVar.close();
        }
    }

    @Override // ub.u
    public Object currentValue() {
        return this.D.getCurrentValue();
    }

    @Override // ub.u
    public u disable(r rVar) {
        this.f88362b &= ~rVar.getMask();
        if (rVar == r.STRICT_DUPLICATE_DETECTION) {
            this.D = this.D.withDupDetector(null);
        }
        return this;
    }

    @Override // ub.u
    public u enable(r rVar) {
        this.f88362b |= rVar.getMask();
        if (rVar == r.STRICT_DUPLICATE_DETECTION && this.D.getDupDetector() == null) {
            this.D = this.D.withDupDetector(ec.b.rootDetector(this));
        }
        return this;
    }

    @Override // ub.u
    public BigInteger getBigIntegerValue() throws IOException {
        int i10 = this.K;
        if ((i10 & 4) == 0) {
            if (i10 == 0) {
                N(4);
            }
            int i11 = this.K;
            if ((i11 & 4) == 0) {
                int i12 = i11 & 16;
                f0 f0Var = this.f90527f;
                if (i12 != 0) {
                    BigDecimal bigDecimalG = G();
                    f0Var.validateBigIntegerScale(bigDecimalG.scale());
                    this.P = bigDecimalG.toBigInteger();
                } else if ((i11 & 2) != 0) {
                    this.P = BigInteger.valueOf(this.M);
                } else if ((i11 & 1) != 0) {
                    this.P = BigInteger.valueOf(this.L);
                } else if ((i11 & 8) == 0) {
                    m0.throwInternal();
                } else if (this.R != null) {
                    BigDecimal bigDecimalG2 = G();
                    f0Var.validateBigIntegerScale(bigDecimalG2.scale());
                    this.P = bigDecimalG2.toBigInteger();
                } else {
                    BigDecimal bigDecimalValueOf = BigDecimal.valueOf(I());
                    f0Var.validateBigIntegerScale(bigDecimalValueOf.scale());
                    this.P = bigDecimalValueOf.toBigInteger();
                }
                this.K |= 4;
                return this.P;
            }
        }
        return H();
    }

    @Override // wb.c, ub.u
    public byte[] getBinaryValue(ub.b bVar) throws IOException {
        if (this.J == null) {
            if (this.f90528g != z.VALUE_STRING) {
                throw e("Current token (" + this.f90528g + ") not VALUE_STRING, can not access as binary");
            }
            d dVar_getByteArrayBuilder = _getByteArrayBuilder();
            i(getText(), dVar_getByteArrayBuilder, bVar);
            this.J = dVar_getByteArrayBuilder.toByteArray();
        }
        return this.J;
    }

    @Override // ub.u
    @Deprecated
    public p getCurrentLocation() {
        return new p(C(), -1L, this.f90513v + this.f90515x, this.f90516y, (this.f90513v - this.f90517z) + 1);
    }

    @Override // wb.c, ub.u
    @Deprecated
    public String getCurrentName() throws IOException {
        e parent;
        z zVar = this.f90528g;
        return ((zVar == z.START_OBJECT || zVar == z.START_ARRAY) && (parent = this.D.getParent()) != null) ? parent.getCurrentName() : this.D.getCurrentName();
    }

    @Override // ub.u
    public BigDecimal getDecimalValue() throws IOException {
        int i10 = this.K;
        if ((i10 & 16) == 0) {
            if (i10 == 0) {
                N(16);
            }
            int i11 = this.K;
            if ((i11 & 16) == 0) {
                if ((i11 & 8) != 0) {
                    String text = this.R;
                    if (text == null) {
                        text = getText();
                    }
                    this.Q = m.parseBigDecimal(text, isEnabled(g0.USE_FAST_BIG_NUMBER_PARSER));
                } else if ((i11 & 4) != 0) {
                    this.Q = new BigDecimal(H());
                } else if ((i11 & 2) != 0) {
                    this.Q = BigDecimal.valueOf(this.M);
                } else if ((i11 & 1) != 0) {
                    this.Q = BigDecimal.valueOf(this.L);
                } else {
                    m0.throwInternal();
                }
                this.K |= 16;
                return this.Q;
            }
        }
        return G();
    }

    @Override // ub.u
    public double getDoubleValue() throws IOException {
        int i10 = this.K;
        if ((i10 & 8) == 0) {
            if (i10 == 0) {
                N(8);
            }
            int i11 = this.K;
            if ((i11 & 8) == 0) {
                if ((i11 & 16) != 0) {
                    if (this.R != null) {
                        this.O = I();
                    } else {
                        this.O = G().doubleValue();
                    }
                } else if ((i11 & 4) != 0) {
                    if (this.R != null) {
                        this.O = I();
                    } else {
                        this.O = H().doubleValue();
                    }
                } else if ((i11 & 2) != 0) {
                    this.O = this.M;
                } else if ((i11 & 1) != 0) {
                    this.O = this.L;
                } else if ((i11 & 32) == 0) {
                    m0.throwInternal();
                } else if (this.R != null) {
                    this.O = I();
                } else {
                    this.O = J();
                }
                this.K |= 8;
                return this.O;
            }
        }
        return I();
    }

    @Override // ub.u
    public float getFloatValue() throws IOException {
        int i10 = this.K;
        if ((i10 & 32) == 0) {
            if (i10 == 0) {
                N(32);
            }
            int i11 = this.K;
            if ((i11 & 32) == 0) {
                if ((i11 & 16) != 0) {
                    if (this.R != null) {
                        this.N = J();
                    } else {
                        this.N = G().floatValue();
                    }
                } else if ((i11 & 4) != 0) {
                    if (this.R != null) {
                        this.N = J();
                    } else {
                        this.N = H().floatValue();
                    }
                } else if ((i11 & 2) != 0) {
                    this.N = this.M;
                } else if ((i11 & 1) != 0) {
                    this.N = this.L;
                } else if ((i11 & 8) == 0) {
                    m0.throwInternal();
                } else if (this.R != null) {
                    this.N = J();
                } else {
                    this.N = (float) I();
                }
                this.K |= 32;
                return this.N;
            }
        }
        return J();
    }

    @Override // ub.u
    public int getIntValue() throws IOException {
        int i10 = this.K;
        if ((i10 & 1) == 0) {
            if (i10 == 0) {
                return M();
            }
            if ((i10 & 1) == 0) {
                S();
            }
        }
        return this.L;
    }

    @Override // ub.u
    public long getLongValue() throws IOException {
        int i10 = this.K;
        if ((i10 & 2) == 0) {
            if (i10 == 0) {
                N(2);
            }
            int i11 = this.K;
            if ((i11 & 2) == 0) {
                if ((i11 & 1) != 0) {
                    this.M = this.L;
                } else if ((i11 & 4) != 0) {
                    BigInteger bigIntegerH = H();
                    if (c.f90521n.compareTo(bigIntegerH) > 0 || c.f90522o.compareTo(bigIntegerH) < 0) {
                        y();
                        throw null;
                    }
                    this.M = bigIntegerH.longValue();
                } else if ((i11 & 8) != 0) {
                    double dI = I();
                    if (dI < -9.223372036854776E18d || dI > 9.223372036854776E18d) {
                        y();
                        throw null;
                    }
                    this.M = (long) dI;
                } else if ((i11 & 16) != 0) {
                    BigDecimal bigDecimalG = G();
                    if (c.f90523p.compareTo(bigDecimalG) > 0 || c.f90524q.compareTo(bigDecimalG) < 0) {
                        y();
                        throw null;
                    }
                    this.M = bigDecimalG.longValue();
                } else {
                    m0.throwInternal();
                }
                this.K |= 2;
            }
        }
        return this.M;
    }

    @Override // ub.u
    public s getNumberType() throws IOException {
        if (this.K == 0) {
            N(0);
        }
        if (this.f90528g == z.VALUE_NUMBER_INT) {
            int i10 = this.K;
            return (i10 & 1) != 0 ? s.f88349b : (i10 & 2) != 0 ? s.f88350c : s.f88351e;
        }
        int i11 = this.K;
        return (i11 & 16) != 0 ? s.f88354h : (i11 & 32) != 0 ? s.f88352f : s.f88353g;
    }

    @Override // ub.u
    public Number getNumberValue() throws IOException {
        if (this.K == 0) {
            N(0);
        }
        if (this.f90528g == z.VALUE_NUMBER_INT) {
            int i10 = this.K;
            if ((i10 & 1) != 0) {
                return Integer.valueOf(this.L);
            }
            if ((i10 & 2) != 0) {
                return Long.valueOf(this.M);
            }
            if ((i10 & 4) != 0) {
                return H();
            }
            m0.throwInternal();
        }
        int i11 = this.K;
        if ((i11 & 16) != 0) {
            return G();
        }
        if ((i11 & 32) != 0) {
            return Float.valueOf(J());
        }
        if ((i11 & 8) == 0) {
            m0.throwInternal();
        }
        return Double.valueOf(I());
    }

    @Override // ub.u
    public Object getNumberValueDeferred() throws IOException {
        if (this.f90528g == z.VALUE_NUMBER_INT) {
            if (this.K == 0) {
                N(0);
            }
            int i10 = this.K;
            if ((i10 & 1) != 0) {
                return Integer.valueOf(this.L);
            }
            if ((i10 & 2) != 0) {
                return Long.valueOf(this.M);
            }
            if ((i10 & 4) != 0) {
                BigInteger bigInteger = this.P;
                if (bigInteger != null) {
                    return bigInteger;
                }
                String str = this.R;
                return str != null ? str : H();
            }
            m0.throwInternal();
        }
        if (this.f90528g != z.VALUE_NUMBER_FLOAT) {
            return getNumberValue();
        }
        int i11 = this.K;
        return (i11 & 16) != 0 ? G() : (i11 & 8) != 0 ? Double.valueOf(I()) : (i11 & 32) != 0 ? Float.valueOf(J()) : this.F.contentsAsString();
    }

    @Override // ub.u
    public Number getNumberValueExact() throws IOException {
        if (this.f90528g == z.VALUE_NUMBER_INT) {
            if (this.K == 0) {
                N(0);
            }
            int i10 = this.K;
            if ((i10 & 1) != 0) {
                return Integer.valueOf(this.L);
            }
            if ((i10 & 2) != 0) {
                return Long.valueOf(this.M);
            }
            if ((i10 & 4) != 0) {
                return H();
            }
            m0.throwInternal();
        }
        if (this.K == 0) {
            N(16);
        }
        int i11 = this.K;
        if ((i11 & 16) != 0) {
            return G();
        }
        if ((i11 & 32) != 0) {
            return Float.valueOf(J());
        }
        if ((i11 & 8) == 0) {
            m0.throwInternal();
        }
        return Double.valueOf(I());
    }

    public long getTokenCharacterOffset() {
        return this.A;
    }

    public int getTokenColumnNr() {
        int i10 = this.C;
        return i10 < 0 ? i10 : i10 + 1;
    }

    public int getTokenLineNr() {
        return this.B;
    }

    @Override // ub.u
    @Deprecated
    public p getTokenLocation() {
        return new p(C(), -1L, getTokenCharacterOffset(), getTokenLineNr(), getTokenColumnNr());
    }

    @Override // wb.c, ub.u
    public boolean hasTextCharacters() {
        z zVar = this.f90528g;
        if (zVar == z.VALUE_STRING) {
            return true;
        }
        if (zVar == z.FIELD_NAME) {
            return this.H;
        }
        return false;
    }

    @Override // wb.c, ub.u
    public boolean isClosed() {
        return this.f90512u;
    }

    @Override // ub.u
    public boolean isNaN() throws IOException {
        return this.f90528g == z.VALUE_NUMBER_FLOAT && this.S;
    }

    @Override // wb.c
    public final void k() {
        if (this.D.inRoot()) {
            return;
        }
        p(String.format(": expected close marker for %s (start marker at %s)", this.D.inArray() ? "Array" : "Object", this.D.startLocation(C())), null);
        throw null;
    }

    @Override // wb.c, ub.u
    public void overrideCurrentName(String str) {
        e parent = this.D;
        z zVar = this.f90528g;
        if (zVar == z.START_OBJECT || zVar == z.START_ARRAY) {
            parent = parent.getParent();
        }
        try {
            parent.setCurrentName(str);
        } catch (IOException e10) {
            throw new IllegalStateException(e10);
        }
    }

    @Override // ub.u
    public u overrideStdFeatures(int i10, int i11) {
        int i12 = this.f88362b;
        int i13 = (i10 & i11) | ((~i11) & i12);
        int i14 = i12 ^ i13;
        if (i14 != 0) {
            this.f88362b = i13;
            A(i13, i14);
        }
        return this;
    }

    @Override // ub.u
    @Deprecated
    public u setFeatureMask(int i10) {
        int i11 = this.f88362b ^ i10;
        if (i11 != 0) {
            this.f88362b = i10;
            A(i10, i11);
        }
        return this;
    }

    @Override // ub.u, ub.q0
    public p0 version() {
        return ec.i.f54057b;
    }

    @Override // wb.c, ub.u
    public e getParsingContext() {
        return this.D;
    }
}
