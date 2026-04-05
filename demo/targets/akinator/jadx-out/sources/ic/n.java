package ic;

import java.io.IOException;
import java.io.OutputStream;
import java.io.Writer;
import java.math.BigDecimal;
import java.math.BigInteger;
import ub.p0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class n extends ub.u {

    /* renamed from: f, reason: collision with root package name */
    public ub.u f59516f;

    public n(ub.u uVar) {
        this.f59516f = uVar;
    }

    @Override // ub.u
    public void assignCurrentValue(Object obj) {
        this.f59516f.assignCurrentValue(obj);
    }

    @Override // ub.u
    public boolean canParseAsync() {
        return this.f59516f.canParseAsync();
    }

    @Override // ub.u
    public boolean canReadObjectId() {
        return this.f59516f.canReadObjectId();
    }

    @Override // ub.u
    public boolean canReadTypeId() {
        return this.f59516f.canReadTypeId();
    }

    @Override // ub.u
    public boolean canUseSchema(ub.g gVar) {
        return this.f59516f.canUseSchema(gVar);
    }

    @Override // ub.u
    public void clearCurrentToken() {
        this.f59516f.clearCurrentToken();
    }

    @Override // ub.u, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f59516f.close();
    }

    @Override // ub.u
    public ub.p currentLocation() {
        return this.f59516f.currentLocation();
    }

    @Override // ub.u
    public String currentName() throws IOException {
        return this.f59516f.currentName();
    }

    @Override // ub.u
    public ub.z currentToken() {
        return this.f59516f.currentToken();
    }

    @Override // ub.u
    public long currentTokenCount() {
        return this.f59516f.currentTokenCount();
    }

    @Override // ub.u
    public int currentTokenId() {
        return this.f59516f.currentTokenId();
    }

    @Override // ub.u
    public ub.p currentTokenLocation() {
        return this.f59516f.currentTokenLocation();
    }

    @Override // ub.u
    public Object currentValue() {
        return this.f59516f.currentValue();
    }

    public ub.u delegate() {
        return this.f59516f;
    }

    @Override // ub.u
    public ub.u disable(ub.r rVar) {
        this.f59516f.disable(rVar);
        return this;
    }

    @Override // ub.u
    public ub.u enable(ub.r rVar) {
        this.f59516f.enable(rVar);
        return this;
    }

    @Override // ub.u
    public void finishToken() throws IOException {
        this.f59516f.finishToken();
    }

    @Override // ub.u
    public BigInteger getBigIntegerValue() throws IOException {
        return this.f59516f.getBigIntegerValue();
    }

    @Override // ub.u
    public byte[] getBinaryValue(ub.b bVar) throws IOException {
        return this.f59516f.getBinaryValue(bVar);
    }

    @Override // ub.u
    public boolean getBooleanValue() throws IOException {
        return this.f59516f.getBooleanValue();
    }

    @Override // ub.u
    public byte getByteValue() throws IOException {
        return this.f59516f.getByteValue();
    }

    @Override // ub.u
    public ub.a0 getCodec() {
        return this.f59516f.getCodec();
    }

    @Override // ub.u
    @Deprecated
    public ub.p getCurrentLocation() {
        return this.f59516f.getCurrentLocation();
    }

    @Override // ub.u
    @Deprecated
    public String getCurrentName() throws IOException {
        return this.f59516f.getCurrentName();
    }

    @Override // ub.u
    @Deprecated
    public ub.z getCurrentToken() {
        return this.f59516f.getCurrentToken();
    }

    @Override // ub.u
    @Deprecated
    public int getCurrentTokenId() {
        return this.f59516f.getCurrentTokenId();
    }

    @Override // ub.u
    @Deprecated
    public Object getCurrentValue() {
        return this.f59516f.getCurrentValue();
    }

    @Override // ub.u
    public BigDecimal getDecimalValue() throws IOException {
        return this.f59516f.getDecimalValue();
    }

    @Override // ub.u
    public double getDoubleValue() throws IOException {
        return this.f59516f.getDoubleValue();
    }

    @Override // ub.u
    public Object getEmbeddedObject() throws IOException {
        return this.f59516f.getEmbeddedObject();
    }

    @Override // ub.u
    public int getFeatureMask() {
        return this.f59516f.getFeatureMask();
    }

    @Override // ub.u
    public float getFloatValue() throws IOException {
        return this.f59516f.getFloatValue();
    }

    @Override // ub.u
    public Object getInputSource() {
        return this.f59516f.getInputSource();
    }

    @Override // ub.u
    public int getIntValue() throws IOException {
        return this.f59516f.getIntValue();
    }

    @Override // ub.u
    public ub.z getLastClearedToken() {
        return this.f59516f.getLastClearedToken();
    }

    @Override // ub.u
    public long getLongValue() throws IOException {
        return this.f59516f.getLongValue();
    }

    @Override // ub.u
    public vb.c getNonBlockingInputFeeder() {
        return this.f59516f.getNonBlockingInputFeeder();
    }

    @Override // ub.u
    public ub.s getNumberType() throws IOException {
        return this.f59516f.getNumberType();
    }

    @Override // ub.u
    public ub.t getNumberTypeFP() throws IOException {
        return this.f59516f.getNumberTypeFP();
    }

    @Override // ub.u
    public Number getNumberValue() throws IOException {
        return this.f59516f.getNumberValue();
    }

    @Override // ub.u
    public Object getNumberValueDeferred() throws IOException {
        return this.f59516f.getNumberValueDeferred();
    }

    @Override // ub.u
    public Number getNumberValueExact() throws IOException {
        return this.f59516f.getNumberValueExact();
    }

    @Override // ub.u
    public Object getObjectId() throws IOException {
        return this.f59516f.getObjectId();
    }

    @Override // ub.u
    public ub.y getParsingContext() {
        return this.f59516f.getParsingContext();
    }

    @Override // ub.u
    public l getReadCapabilities() {
        return this.f59516f.getReadCapabilities();
    }

    @Override // ub.u
    public ub.g getSchema() {
        this.f59516f.getSchema();
        return null;
    }

    @Override // ub.u
    public short getShortValue() throws IOException {
        return this.f59516f.getShortValue();
    }

    @Override // ub.u
    public String getText() throws IOException {
        return this.f59516f.getText();
    }

    @Override // ub.u
    public char[] getTextCharacters() throws IOException {
        return this.f59516f.getTextCharacters();
    }

    @Override // ub.u
    public int getTextLength() throws IOException {
        return this.f59516f.getTextLength();
    }

    @Override // ub.u
    public int getTextOffset() throws IOException {
        return this.f59516f.getTextOffset();
    }

    @Override // ub.u
    @Deprecated
    public ub.p getTokenLocation() {
        return this.f59516f.getTokenLocation();
    }

    @Override // ub.u
    public Object getTypeId() throws IOException {
        return this.f59516f.getTypeId();
    }

    @Override // ub.u
    public boolean getValueAsBoolean() throws IOException {
        return this.f59516f.getValueAsBoolean();
    }

    @Override // ub.u
    public double getValueAsDouble() throws IOException {
        return this.f59516f.getValueAsDouble();
    }

    @Override // ub.u
    public int getValueAsInt() throws IOException {
        return this.f59516f.getValueAsInt();
    }

    @Override // ub.u
    public long getValueAsLong() throws IOException {
        return this.f59516f.getValueAsLong();
    }

    @Override // ub.u
    public String getValueAsString() throws IOException {
        return this.f59516f.getValueAsString();
    }

    @Override // ub.u
    public boolean hasCurrentToken() {
        return this.f59516f.hasCurrentToken();
    }

    @Override // ub.u
    public boolean hasTextCharacters() {
        return this.f59516f.hasTextCharacters();
    }

    @Override // ub.u
    public boolean hasToken(ub.z zVar) {
        return this.f59516f.hasToken(zVar);
    }

    @Override // ub.u
    public boolean hasTokenId(int i10) {
        return this.f59516f.hasTokenId(i10);
    }

    @Override // ub.u
    public boolean isClosed() {
        return this.f59516f.isClosed();
    }

    @Override // ub.u
    public boolean isEnabled(ub.r rVar) {
        return this.f59516f.isEnabled(rVar);
    }

    @Override // ub.u
    public boolean isExpectedNumberIntToken() {
        return this.f59516f.isExpectedNumberIntToken();
    }

    @Override // ub.u
    public boolean isExpectedStartArrayToken() {
        return this.f59516f.isExpectedStartArrayToken();
    }

    @Override // ub.u
    public boolean isExpectedStartObjectToken() {
        return this.f59516f.isExpectedStartObjectToken();
    }

    @Override // ub.u
    public boolean isNaN() throws IOException {
        return this.f59516f.isNaN();
    }

    @Override // ub.u
    public ub.z nextToken() throws IOException {
        return this.f59516f.nextToken();
    }

    @Override // ub.u
    public ub.z nextValue() throws IOException {
        return this.f59516f.nextValue();
    }

    @Override // ub.u
    public void overrideCurrentName(String str) {
        this.f59516f.overrideCurrentName(str);
    }

    @Override // ub.u
    public ub.u overrideFormatFeatures(int i10, int i11) {
        this.f59516f.overrideFormatFeatures(i10, i11);
        return this;
    }

    @Override // ub.u
    public ub.u overrideStdFeatures(int i10, int i11) {
        this.f59516f.overrideStdFeatures(i10, i11);
        return this;
    }

    @Override // ub.u
    public int readBinaryValue(ub.b bVar, OutputStream outputStream) throws IOException {
        return this.f59516f.readBinaryValue(bVar, outputStream);
    }

    @Override // ub.u
    public boolean requiresCustomCodec() {
        return this.f59516f.requiresCustomCodec();
    }

    @Override // ub.u
    public void setCodec(ub.a0 a0Var) {
        this.f59516f.setCodec(a0Var);
    }

    @Override // ub.u
    @Deprecated
    public void setCurrentValue(Object obj) {
        this.f59516f.setCurrentValue(obj);
    }

    @Override // ub.u
    @Deprecated
    public ub.u setFeatureMask(int i10) {
        this.f59516f.setFeatureMask(i10);
        return this;
    }

    @Override // ub.u
    public void setSchema(ub.g gVar) {
        this.f59516f.setSchema(gVar);
    }

    @Override // ub.u
    public ub.u skipChildren() throws IOException {
        this.f59516f.skipChildren();
        return this;
    }

    @Override // ub.u
    public ub.f0 streamReadConstraints() {
        return this.f59516f.streamReadConstraints();
    }

    @Override // ub.u, ub.q0
    public p0 version() {
        return this.f59516f.version();
    }

    @Override // ub.u
    public int getText(Writer writer) throws UnsupportedOperationException, IOException {
        return this.f59516f.getText(writer);
    }

    @Override // ub.u
    public boolean getValueAsBoolean(boolean z10) throws IOException {
        return this.f59516f.getValueAsBoolean(z10);
    }

    @Override // ub.u
    public double getValueAsDouble(double d10) throws IOException {
        return this.f59516f.getValueAsDouble(d10);
    }

    @Override // ub.u
    public int getValueAsInt(int i10) throws IOException {
        return this.f59516f.getValueAsInt(i10);
    }

    @Override // ub.u
    public long getValueAsLong(long j10) throws IOException {
        return this.f59516f.getValueAsLong(j10);
    }

    @Override // ub.u
    public String getValueAsString(String str) throws IOException {
        return this.f59516f.getValueAsString(str);
    }
}
