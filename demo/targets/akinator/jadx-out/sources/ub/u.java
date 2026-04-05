package ub;

import java.io.Closeable;
import java.io.IOException;
import java.io.OutputStream;
import java.io.Writer;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class u implements Closeable, q0 {

    /* renamed from: e, reason: collision with root package name */
    public static final ic.l f88361e = ic.l.fromDefaults(d0.values());

    /* renamed from: b, reason: collision with root package name */
    public int f88362b = k.f88251u;

    /* renamed from: c, reason: collision with root package name */
    public transient ic.g0 f88363c;

    public void assignCurrentValue(Object obj) {
        y parsingContext = getParsingContext();
        if (parsingContext != null) {
            parsingContext.setCurrentValue(obj);
        }
    }

    public boolean canParseAsync() {
        return false;
    }

    public boolean canReadObjectId() {
        return false;
    }

    public boolean canReadTypeId() {
        return false;
    }

    public boolean canUseSchema(g gVar) {
        return false;
    }

    public abstract void clearCurrentToken();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public abstract void close() throws IOException;

    public u configure(r rVar, boolean z10) {
        if (z10) {
            enable(rVar);
            return this;
        }
        disable(rVar);
        return this;
    }

    public p currentLocation() {
        return getCurrentLocation();
    }

    public String currentName() throws IOException {
        return getCurrentName();
    }

    public z currentToken() {
        return getCurrentToken();
    }

    public long currentTokenCount() {
        return -1L;
    }

    public int currentTokenId() {
        return getCurrentTokenId();
    }

    public p currentTokenLocation() {
        return getTokenLocation();
    }

    public Object currentValue() {
        y parsingContext = getParsingContext();
        if (parsingContext == null) {
            return null;
        }
        return parsingContext.getCurrentValue();
    }

    public final a0 d() {
        a0 codec = getCodec();
        if (codec != null) {
            return codec;
        }
        throw new IllegalStateException("No ObjectCodec defined for parser, needed for deserialization");
    }

    public u disable(r rVar) {
        this.f88362b = (~rVar.getMask()) & this.f88362b;
        return this;
    }

    public final q e(String str) {
        return new q(this, str).withRequestPayload(this.f88363c);
    }

    public u enable(r rVar) {
        this.f88362b = rVar.getMask() | this.f88362b;
        return this;
    }

    public final q f(String str, p pVar) {
        q qVar = new q(this, str, pVar);
        ic.g0 g0Var = this.f88363c;
        return g0Var != null ? qVar.withRequestPayload(g0Var) : qVar;
    }

    public abstract BigInteger getBigIntegerValue() throws IOException;

    public byte[] getBinaryValue() throws IOException {
        return getBinaryValue(c.getDefaultVariant());
    }

    public abstract byte[] getBinaryValue(b bVar) throws IOException;

    public boolean getBooleanValue() throws IOException {
        z zVarCurrentToken = currentToken();
        if (zVarCurrentToken == z.VALUE_TRUE) {
            return true;
        }
        if (zVarCurrentToken == z.VALUE_FALSE) {
            return false;
        }
        throw new q(this, "Current token (" + zVarCurrentToken + ") not of boolean type").withRequestPayload(this.f88363c);
    }

    public byte getByteValue() throws IOException {
        int intValue = getIntValue();
        if (intValue < -128 || intValue > 255) {
            throw new xb.a(this, a.b.l("Numeric value (", getText(), ") out of range of Java byte"), z.VALUE_NUMBER_INT, Byte.TYPE);
        }
        return (byte) intValue;
    }

    public abstract a0 getCodec();

    @Deprecated
    public abstract p getCurrentLocation();

    @Deprecated
    public abstract String getCurrentName() throws IOException;

    public abstract z getCurrentToken();

    @Deprecated
    public abstract int getCurrentTokenId();

    @Deprecated
    public Object getCurrentValue() {
        return currentValue();
    }

    public abstract BigDecimal getDecimalValue() throws IOException;

    public abstract double getDoubleValue() throws IOException;

    public Object getEmbeddedObject() throws IOException {
        return null;
    }

    public int getFeatureMask() {
        return this.f88362b;
    }

    public abstract float getFloatValue() throws IOException;

    public int getFormatFeatures() {
        return 0;
    }

    public Object getInputSource() {
        return null;
    }

    public abstract int getIntValue() throws IOException;

    public abstract z getLastClearedToken();

    public abstract long getLongValue() throws IOException;

    public vb.c getNonBlockingInputFeeder() {
        return null;
    }

    public abstract s getNumberType() throws IOException;

    public t getNumberTypeFP() throws IOException {
        s numberType = getNumberType();
        return numberType == s.f88354h ? t.f88358e : numberType == s.f88353g ? t.f88357c : numberType == s.f88352f ? t.f88356b : t.f88359f;
    }

    public abstract Number getNumberValue() throws IOException;

    public Object getNumberValueDeferred() throws IOException {
        return getNumberValue();
    }

    public Number getNumberValueExact() throws IOException {
        return getNumberValue();
    }

    public Object getObjectId() throws IOException {
        return null;
    }

    public abstract y getParsingContext();

    public ic.l getReadCapabilities() {
        return f88361e;
    }

    public g getSchema() {
        return null;
    }

    public short getShortValue() throws IOException {
        int intValue = getIntValue();
        if (intValue < -32768 || intValue > 32767) {
            throw new xb.a(this, a.b.l("Numeric value (", getText(), ") out of range of Java short"), z.VALUE_NUMBER_INT, Short.TYPE);
        }
        return (short) intValue;
    }

    public int getText(Writer writer) throws UnsupportedOperationException, IOException {
        String text = getText();
        if (text == null) {
            return 0;
        }
        writer.write(text);
        return text.length();
    }

    public abstract String getText() throws IOException;

    public abstract char[] getTextCharacters() throws IOException;

    public abstract int getTextLength() throws IOException;

    public abstract int getTextOffset() throws IOException;

    @Deprecated
    public abstract p getTokenLocation();

    public Object getTypeId() throws IOException {
        return null;
    }

    public boolean getValueAsBoolean() throws IOException {
        return getValueAsBoolean(false);
    }

    public double getValueAsDouble() throws IOException {
        return getValueAsDouble(0.0d);
    }

    public int getValueAsInt() throws IOException {
        return getValueAsInt(0);
    }

    public long getValueAsLong() throws IOException {
        return getValueAsLong(0L);
    }

    public String getValueAsString() throws IOException {
        return getValueAsString(null);
    }

    public abstract String getValueAsString(String str) throws IOException;

    public p h() {
        return currentLocation();
    }

    public abstract boolean hasCurrentToken();

    public abstract boolean hasTextCharacters();

    public abstract boolean hasToken(z zVar);

    public abstract boolean hasTokenId(int i10);

    public abstract boolean isClosed();

    public boolean isEnabled(r rVar) {
        return rVar.enabledIn(this.f88362b);
    }

    public boolean isExpectedNumberIntToken() {
        return currentToken() == z.VALUE_NUMBER_INT;
    }

    public boolean isExpectedStartArrayToken() {
        return currentToken() == z.START_ARRAY;
    }

    public boolean isExpectedStartObjectToken() {
        return currentToken() == z.START_OBJECT;
    }

    public boolean isNaN() throws IOException {
        return false;
    }

    public Boolean nextBooleanValue() throws IOException {
        z zVarNextToken = nextToken();
        if (zVarNextToken == z.VALUE_TRUE) {
            return Boolean.TRUE;
        }
        if (zVarNextToken == z.VALUE_FALSE) {
            return Boolean.FALSE;
        }
        return null;
    }

    public boolean nextFieldName(c0 c0Var) throws IOException {
        return nextToken() == z.FIELD_NAME && c0Var.getValue().equals(currentName());
    }

    public int nextIntValue(int i10) throws IOException {
        return nextToken() == z.VALUE_NUMBER_INT ? getIntValue() : i10;
    }

    public long nextLongValue(long j10) throws IOException {
        return nextToken() == z.VALUE_NUMBER_INT ? getLongValue() : j10;
    }

    public String nextTextValue() throws IOException {
        if (nextToken() == z.VALUE_STRING) {
            return getText();
        }
        return null;
    }

    public abstract z nextToken() throws IOException;

    public abstract z nextValue() throws IOException;

    public abstract void overrideCurrentName(String str);

    public u overrideStdFeatures(int i10, int i11) {
        return setFeatureMask((i10 & i11) | (this.f88362b & (~i11)));
    }

    public int readBinaryValue(OutputStream outputStream) throws IOException {
        return readBinaryValue(c.getDefaultVariant(), outputStream);
    }

    public <T> T readValueAs(Class<T> cls) throws IOException {
        return (T) d().readValue(this, cls);
    }

    public <T extends o0> T readValueAsTree() throws IOException {
        return (T) d().readTree(this);
    }

    public <T> Iterator<T> readValuesAs(Class<T> cls) throws IOException {
        return d().readValues(this, cls);
    }

    public int releaseBuffered(OutputStream outputStream) throws IOException {
        return -1;
    }

    public boolean requiresCustomCodec() {
        return false;
    }

    public abstract void setCodec(a0 a0Var);

    @Deprecated
    public void setCurrentValue(Object obj) {
        assignCurrentValue(obj);
    }

    @Deprecated
    public u setFeatureMask(int i10) {
        this.f88362b = i10;
        return this;
    }

    public void setRequestPayloadOnError(ic.g0 g0Var) {
        this.f88363c = g0Var;
    }

    public void setSchema(g gVar) {
        throw new UnsupportedOperationException("Parser of type " + getClass().getName() + " does not support schema of type '" + gVar.a() + "'");
    }

    public abstract u skipChildren() throws IOException;

    public f0 streamReadConstraints() {
        return f0.defaults();
    }

    public abstract p0 version();

    public boolean getValueAsBoolean(boolean z10) throws IOException {
        return z10;
    }

    public double getValueAsDouble(double d10) throws IOException {
        return d10;
    }

    public int getValueAsInt(int i10) throws IOException {
        return i10;
    }

    public long getValueAsLong(long j10) throws IOException {
        return j10;
    }

    public boolean isEnabled(g0 g0Var) {
        return g0Var.mappedFeature().enabledIn(this.f88362b);
    }

    public String nextFieldName() throws IOException {
        if (nextToken() == z.FIELD_NAME) {
            return currentName();
        }
        return null;
    }

    public int readBinaryValue(b bVar, OutputStream outputStream) throws IOException {
        throw new UnsupportedOperationException("Operation not supported by parser of type ".concat(getClass().getName()));
    }

    public <T> T readValueAs(hc.b bVar) throws IOException {
        return (T) d().readValue(this, bVar);
    }

    public <T> Iterator<T> readValuesAs(hc.b bVar) throws IOException {
        return d().readValues(this, bVar);
    }

    public int releaseBuffered(Writer writer) throws IOException {
        return -1;
    }

    public void setRequestPayloadOnError(byte[] bArr, String str) {
        this.f88363c = bArr == null ? null : new ic.g0(bArr, str);
    }

    public void setRequestPayloadOnError(String str) {
        this.f88363c = str == null ? null : new ic.g0(str);
    }

    public void finishToken() throws IOException {
    }

    public u overrideFormatFeatures(int i10, int i11) {
        return this;
    }
}
