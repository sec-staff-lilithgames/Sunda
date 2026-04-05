package wb;

import cc.j;
import cc.m;
import ic.d;
import ic.g0;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import p0.o2;
import ub.f0;
import ub.q;
import ub.u;
import ub.y;
import ub.z;
import w0.i;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class c extends u {

    /* renamed from: k, reason: collision with root package name */
    public static final byte[] f90518k = new byte[0];

    /* renamed from: l, reason: collision with root package name */
    public static final BigInteger f90519l;

    /* renamed from: m, reason: collision with root package name */
    public static final BigInteger f90520m;

    /* renamed from: n, reason: collision with root package name */
    public static final BigInteger f90521n;

    /* renamed from: o, reason: collision with root package name */
    public static final BigInteger f90522o;

    /* renamed from: p, reason: collision with root package name */
    public static final BigDecimal f90523p;

    /* renamed from: q, reason: collision with root package name */
    public static final BigDecimal f90524q;

    /* renamed from: r, reason: collision with root package name */
    public static final BigDecimal f90525r;

    /* renamed from: s, reason: collision with root package name */
    public static final BigDecimal f90526s;

    /* renamed from: f, reason: collision with root package name */
    public final f0 f90527f;

    /* renamed from: g, reason: collision with root package name */
    public z f90528g;

    /* renamed from: h, reason: collision with root package name */
    public long f90529h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f90530i;

    /* renamed from: j, reason: collision with root package name */
    public z f90531j;

    static {
        BigInteger bigIntegerValueOf = BigInteger.valueOf(-2147483648L);
        f90519l = bigIntegerValueOf;
        BigInteger bigIntegerValueOf2 = BigInteger.valueOf(2147483647L);
        f90520m = bigIntegerValueOf2;
        BigInteger bigIntegerValueOf3 = BigInteger.valueOf(Long.MIN_VALUE);
        f90521n = bigIntegerValueOf3;
        BigInteger bigIntegerValueOf4 = BigInteger.valueOf(Long.MAX_VALUE);
        f90522o = bigIntegerValueOf4;
        f90523p = new BigDecimal(bigIntegerValueOf3);
        f90524q = new BigDecimal(bigIntegerValueOf4);
        f90525r = new BigDecimal(bigIntegerValueOf);
        f90526s = new BigDecimal(bigIntegerValueOf2);
    }

    public c(f0 f0Var) {
        f0Var = f0Var == null ? f0.defaults() : f0Var;
        this.f90527f = f0Var;
        this.f90530i = f0Var.hasMaxTokenCount();
    }

    public static final String j(int i10) {
        char c10 = (char) i10;
        if (Character.isISOControl(c10)) {
            return o2.k(i10, "(CTRL-CHAR, code ", ")");
        }
        if (i10 <= 255) {
            return "'" + c10 + "' (code " + i10 + ")";
        }
        return "'" + c10 + "' (code " + i10 + " / 0x" + Integer.toHexString(i10) + ")";
    }

    public static String l(String str) {
        int length = str.length();
        if (length < 1000) {
            return str;
        }
        if (str.startsWith("-")) {
            length--;
        }
        return String.format("[Integer with %d digits]", Integer.valueOf(length));
    }

    public static String m(String str) {
        int length = str.length();
        if (length < 1000) {
            return str;
        }
        if (str.startsWith("-")) {
            length--;
        }
        return String.format("[number with %d characters]", Integer.valueOf(length));
    }

    @Override // ub.u
    public void clearCurrentToken() {
        z zVar = this.f90528g;
        if (zVar != null) {
            this.f90531j = zVar;
            this.f90528g = null;
        }
    }

    @Override // ub.u, java.io.Closeable, java.lang.AutoCloseable
    public abstract void close() throws IOException;

    @Override // ub.u
    public z currentToken() {
        return this.f90528g;
    }

    @Override // ub.u
    public long currentTokenCount() {
        return this.f90529h;
    }

    @Override // ub.u
    public int currentTokenId() {
        z zVar = this.f90528g;
        if (zVar == null) {
            return 0;
        }
        return zVar.id();
    }

    @Override // ub.u
    public abstract byte[] getBinaryValue(ub.b bVar) throws IOException;

    @Override // ub.u
    @Deprecated
    public abstract String getCurrentName() throws IOException;

    @Override // ub.u
    public z getCurrentToken() {
        return this.f90528g;
    }

    @Override // ub.u
    @Deprecated
    public int getCurrentTokenId() {
        z zVar = this.f90528g;
        if (zVar == null) {
            return 0;
        }
        return zVar.id();
    }

    @Override // ub.u
    public z getLastClearedToken() {
        return this.f90531j;
    }

    @Override // ub.u
    public abstract y getParsingContext();

    @Override // ub.u
    public abstract String getText() throws IOException;

    @Override // ub.u
    public abstract char[] getTextCharacters() throws IOException;

    @Override // ub.u
    public abstract int getTextLength() throws IOException;

    @Override // ub.u
    public abstract int getTextOffset() throws IOException;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // ub.u
    public boolean getValueAsBoolean(boolean z10) throws IOException {
        z zVar = this.f90528g;
        if (zVar != null) {
            switch (zVar.id()) {
                case 6:
                    String strTrim = getText().trim();
                    if ("true".equals(strTrim)) {
                        return true;
                    }
                    if ("false".equals(strTrim) || AbstractJsonLexerKt.NULL.equals(strTrim)) {
                        return false;
                    }
                    break;
                case 7:
                    return getIntValue() != 0;
                case 9:
                    return true;
                case 10:
                case 11:
                    return false;
                case 12:
                    Object embeddedObject = getEmbeddedObject();
                    if (embeddedObject instanceof Boolean) {
                        return ((Boolean) embeddedObject).booleanValue();
                    }
                    break;
            }
        }
        return z10;
    }

    @Override // ub.u
    public double getValueAsDouble(double d10) throws IOException {
        z zVar = this.f90528g;
        if (zVar == null) {
            return d10;
        }
        switch (zVar.id()) {
            case 6:
                String text = getText();
                if (AbstractJsonLexerKt.NULL.equals(text)) {
                    return 0.0d;
                }
                this.f90527f.validateFPLength(text.length());
                return m.parseAsDouble(text, d10);
            case 7:
            case 8:
                return getDoubleValue();
            case 9:
                return 1.0d;
            case 10:
            case 11:
                return 0.0d;
            case 12:
                Object embeddedObject = getEmbeddedObject();
                return embeddedObject instanceof Number ? ((Number) embeddedObject).doubleValue() : d10;
            default:
                return d10;
        }
    }

    @Override // ub.u
    public int getValueAsInt() throws IOException {
        z zVar = this.f90528g;
        return (zVar == z.VALUE_NUMBER_INT || zVar == z.VALUE_NUMBER_FLOAT) ? getIntValue() : getValueAsInt(0);
    }

    @Override // ub.u
    public long getValueAsLong() throws IOException {
        z zVar = this.f90528g;
        return (zVar == z.VALUE_NUMBER_INT || zVar == z.VALUE_NUMBER_FLOAT) ? getLongValue() : getValueAsLong(0L);
    }

    @Override // ub.u
    public String getValueAsString() throws IOException {
        return getValueAsString(null);
    }

    @Override // ub.u
    public boolean hasCurrentToken() {
        return this.f90528g != null;
    }

    @Override // ub.u
    public abstract boolean hasTextCharacters();

    @Override // ub.u
    public boolean hasToken(z zVar) {
        return this.f90528g == zVar;
    }

    @Override // ub.u
    public boolean hasTokenId(int i10) {
        z zVar = this.f90528g;
        return zVar == null ? i10 == 0 : zVar.id() == i10;
    }

    public final void i(String str, d dVar, ub.b bVar) {
        try {
            bVar.decode(str, dVar);
        } catch (IllegalArgumentException e10) {
            throw e(e10.getMessage());
        }
    }

    @Override // ub.u
    public abstract boolean isClosed();

    @Override // ub.u
    public boolean isExpectedNumberIntToken() {
        return this.f90528g == z.VALUE_NUMBER_INT;
    }

    @Override // ub.u
    public boolean isExpectedStartArrayToken() {
        return this.f90528g == z.START_ARRAY;
    }

    @Override // ub.u
    public boolean isExpectedStartObjectToken() {
        return this.f90528g == z.START_OBJECT;
    }

    public abstract void k();

    public final void n(Object obj, String str) {
        throw e(String.format(str, obj));
    }

    @Override // ub.u
    public abstract z nextToken() throws IOException;

    @Override // ub.u
    public z nextValue() throws IOException {
        z zVarNextToken = nextToken();
        return zVarNextToken == z.FIELD_NAME ? nextToken() : zVarNextToken;
    }

    public final void o() {
        p(" in " + this.f90528g, this.f90528g);
        throw null;
    }

    @Override // ub.u
    public abstract void overrideCurrentName(String str);

    public final void p(String str, z zVar) {
        throw new j(this, zVar, a.b.k("Unexpected end-of-input", str));
    }

    public final void q(z zVar) {
        p(zVar != z.VALUE_STRING ? (zVar == z.VALUE_NUMBER_INT || zVar == z.VALUE_NUMBER_FLOAT) ? " in a Number value" : " in a value" : " in a String value", zVar);
        throw null;
    }

    public final void r(int i10, String str) {
        if (i10 < 0) {
            o();
            throw null;
        }
        String strL = a.b.l("Unexpected character (", j(i10), ")");
        if (str != null) {
            strL = i.d(strL, ": ", str);
        }
        throw f(strL, h());
    }

    public final void s(int i10, String str) {
        throw f(i.d(a.b.l("Unexpected character (", j(i10), ") in numeric value"), ": ", str), h());
    }

    @Override // ub.u
    public u skipChildren() throws IOException {
        z zVar = this.f90528g;
        if (zVar == z.START_OBJECT || zVar == z.START_ARRAY) {
            int i10 = 1;
            while (true) {
                z zVarNextToken = nextToken();
                if (zVarNextToken == null) {
                    k();
                    return this;
                }
                if (zVarNextToken.isStructStart()) {
                    i10++;
                } else if (zVarNextToken.isStructEnd()) {
                    i10--;
                    if (i10 == 0) {
                        break;
                    }
                } else if (zVarNextToken == z.NOT_AVAILABLE) {
                    n(getClass().getName(), "Not enough content available for `skipChildren()`: non-blocking parser? (%s)");
                    throw null;
                }
            }
        }
        return this;
    }

    @Override // ub.u
    public f0 streamReadConstraints() {
        return this.f90527f;
    }

    public final void t(int i10) {
        String strL = "Illegal character (" + j((char) i10) + "): only regular white space (\\r, \\n, \\t) is allowed between tokens";
        if (i10 == 30) {
            strL = j1.o2.l(strL, " (consider enabling `JsonReadFeature.ALLOW_RS_CONTROL_CHAR` to allow use of Record Separators (\\u001E))");
        }
        throw e(strL);
    }

    public final void u(z zVar) {
        this.f90528g = zVar;
        if (this.f90530i) {
            long j10 = this.f90529h + 1;
            this.f90529h = j10;
            this.f90527f.validateTokenCount(j10);
        }
    }

    public final void v(String str, NumberFormatException numberFormatException) throws q {
        q qVar = new q(this, str, numberFormatException);
        g0 g0Var = this.f88363c;
        if (g0Var == null) {
            throw qVar;
        }
        throw qVar.withRequestPayload(g0Var);
    }

    public final void w() {
        throw e("Invalid numeric value: Leading zeroes not allowed");
    }

    public final void x() {
        String text = getText();
        throw new xb.a(this, String.format("Numeric value (%s) out of range of int (%d - %s)", l(text), Integer.MIN_VALUE, Integer.MAX_VALUE), currentToken(), Integer.TYPE);
    }

    public final void y() {
        z(getText());
        throw null;
    }

    public final void z(String str) throws xb.a {
        throw new xb.a(this, String.format("Numeric value (%s) out of range of long (%d - %s)", l(str), Long.MIN_VALUE, Long.MAX_VALUE), currentToken(), Long.TYPE);
    }

    @Override // ub.u
    public String getValueAsString(String str) throws IOException {
        z zVar = this.f90528g;
        return zVar == z.VALUE_STRING ? getText() : zVar == z.FIELD_NAME ? currentName() : (zVar == null || zVar == z.VALUE_NULL || !zVar.isScalarValue()) ? str : getText();
    }

    public c(int i10, f0 f0Var) {
        this.f88362b = i10;
        f0Var = f0Var == null ? f0.defaults() : f0Var;
        this.f90527f = f0Var;
        this.f90530i = f0Var.hasMaxTokenCount();
    }

    @Override // ub.u
    public int getValueAsInt(int i10) throws IOException {
        z zVar = this.f90528g;
        if (zVar == z.VALUE_NUMBER_INT || zVar == z.VALUE_NUMBER_FLOAT) {
            return getIntValue();
        }
        if (zVar == null) {
            return i10;
        }
        int iId = zVar.id();
        if (iId != 6) {
            switch (iId) {
                case 9:
                    return 1;
                case 10:
                case 11:
                    return 0;
                case 12:
                    Object embeddedObject = getEmbeddedObject();
                    return embeddedObject instanceof Number ? ((Number) embeddedObject).intValue() : i10;
                default:
                    return i10;
            }
        }
        String text = getText();
        if (AbstractJsonLexerKt.NULL.equals(text)) {
            return 0;
        }
        return m.parseAsInt(text, i10);
    }

    @Override // ub.u
    public long getValueAsLong(long j10) throws IOException {
        z zVar = this.f90528g;
        if (zVar == z.VALUE_NUMBER_INT || zVar == z.VALUE_NUMBER_FLOAT) {
            return getLongValue();
        }
        if (zVar == null) {
            return j10;
        }
        int iId = zVar.id();
        if (iId != 6) {
            switch (iId) {
                case 9:
                    return 1L;
                case 10:
                case 11:
                    return 0L;
                case 12:
                    Object embeddedObject = getEmbeddedObject();
                    return embeddedObject instanceof Number ? ((Number) embeddedObject).longValue() : j10;
                default:
                    return j10;
            }
        }
        String text = getText();
        if (AbstractJsonLexerKt.NULL.equals(text)) {
            return 0L;
        }
        return m.parseAsLong(text, j10);
    }
}
