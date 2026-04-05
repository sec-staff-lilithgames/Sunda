package ub;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class o implements Closeable, Flushable, q0 {

    /* renamed from: c, reason: collision with root package name */
    public static final ic.l f88309c;

    /* renamed from: e, reason: collision with root package name */
    public static final ic.l f88310e;

    /* renamed from: b, reason: collision with root package name */
    public b0 f88311b;

    static {
        ic.l lVarFromDefaults = ic.l.fromDefaults(h0.values());
        f88309c = lVarFromDefaults;
        f88310e = lVarFromDefaults.with(h0.CAN_WRITE_FORMATTED_NUMBERS);
        lVarFromDefaults.with(h0.CAN_WRITE_BINARY_NATIVELY);
    }

    public static void i(int i10, int i11, int i12) {
        if (i11 < 0 || i11 + i12 > i10) {
            throw new IllegalArgumentException(String.format("invalid argument(s) (offset=%d, length=%d) for input array of %d element", Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i10)));
        }
    }

    public final void a(u uVar) throws IOException {
        int i10 = 1;
        while (true) {
            z zVarNextToken = uVar.nextToken();
            if (zVarNextToken == null) {
                return;
            }
            switch (zVarNextToken.id()) {
                case 1:
                    writeStartObject();
                    break;
                case 2:
                    writeEndObject();
                    i10--;
                    if (i10 == 0) {
                        return;
                    } else {
                        continue;
                    }
                case 3:
                    writeStartArray();
                    break;
                case 4:
                    writeEndArray();
                    i10--;
                    if (i10 == 0) {
                        return;
                    } else {
                        continue;
                    }
                case 5:
                    writeFieldName(uVar.currentName());
                    continue;
                case 6:
                    d(uVar);
                    continue;
                case 7:
                    c(uVar);
                    continue;
                case 8:
                    b(uVar);
                    continue;
                case 9:
                    writeBoolean(true);
                    continue;
                case 10:
                    writeBoolean(false);
                    continue;
                case 11:
                    writeNull();
                    continue;
                case 12:
                    writeObject(uVar.getEmbeddedObject());
                    continue;
                default:
                    throw new IllegalStateException("Internal error: unknown current token, " + zVarNextToken);
            }
            i10++;
        }
    }

    public void assignCurrentValue(Object obj) {
        y outputContext = getOutputContext();
        if (outputContext != null) {
            outputContext.setCurrentValue(obj);
        }
    }

    public final void b(u uVar) throws IOException {
        s numberType = uVar.getNumberType();
        if (numberType == s.f88354h) {
            writeNumber(uVar.getDecimalValue());
        } else if (numberType == s.f88352f) {
            writeNumber(uVar.getFloatValue());
        } else {
            writeNumber(uVar.getDoubleValue());
        }
    }

    public final void c(u uVar) throws IOException {
        s numberType = uVar.getNumberType();
        if (numberType == s.f88349b) {
            writeNumber(uVar.getIntValue());
        } else if (numberType == s.f88350c) {
            writeNumber(uVar.getLongValue());
        } else {
            writeNumber(uVar.getBigIntegerValue());
        }
    }

    public boolean canOmitFields() {
        return true;
    }

    public boolean canUseSchema(g gVar) {
        return false;
    }

    public boolean canWriteBinaryNatively() {
        return false;
    }

    public boolean canWriteFormattedNumbers() {
        return false;
    }

    public boolean canWriteObjectId() {
        return false;
    }

    public boolean canWriteTypeId() {
        return false;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public abstract void close() throws IOException;

    public final o configure(n nVar, boolean z10) {
        if (z10) {
            enable(nVar);
            return this;
        }
        disable(nVar);
        return this;
    }

    public void copyCurrentEvent(u uVar) throws IOException {
        z zVarCurrentToken = uVar.currentToken();
        switch (zVarCurrentToken == null ? -1 : zVarCurrentToken.id()) {
            case -1:
                throw new m("No current event to copy", this);
            case 0:
            default:
                throw new IllegalStateException("Internal error: unknown current token, " + zVarCurrentToken);
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
                d(uVar);
                return;
            case 7:
                c(uVar);
                return;
            case 8:
                b(uVar);
                return;
            case 9:
                writeBoolean(true);
                return;
            case 10:
                writeBoolean(false);
                return;
            case 11:
                writeNull();
                return;
            case 12:
                writeObject(uVar.getEmbeddedObject());
                return;
        }
    }

    public void copyCurrentEventExact(u uVar) throws IOException {
        z zVarCurrentToken = uVar.currentToken();
        switch (zVarCurrentToken == null ? -1 : zVarCurrentToken.id()) {
            case -1:
                throw new m("No current event to copy", this);
            case 0:
            default:
                throw new IllegalStateException("Internal error: unknown current token, " + zVarCurrentToken);
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
                d(uVar);
                return;
            case 7:
                c(uVar);
                return;
            case 8:
                Number numberValueExact = uVar.getNumberValueExact();
                if (numberValueExact instanceof BigDecimal) {
                    writeNumber((BigDecimal) numberValueExact);
                    return;
                } else if (numberValueExact instanceof Double) {
                    writeNumber(numberValueExact.doubleValue());
                    return;
                } else {
                    writeNumber(numberValueExact.floatValue());
                    return;
                }
            case 9:
                writeBoolean(true);
                return;
            case 10:
                writeBoolean(false);
                return;
            case 11:
                writeNull();
                return;
            case 12:
                writeObject(uVar.getEmbeddedObject());
                return;
        }
    }

    public void copyCurrentStructure(u uVar) throws IOException {
        z zVarCurrentToken = uVar.currentToken();
        int iId = zVarCurrentToken == null ? -1 : zVarCurrentToken.id();
        if (iId == 5) {
            writeFieldName(uVar.currentName());
            z zVarNextToken = uVar.nextToken();
            iId = zVarNextToken != null ? zVarNextToken.id() : -1;
        }
        if (iId == 1) {
            writeStartObject();
            a(uVar);
        } else if (iId != 3) {
            copyCurrentEvent(uVar);
        } else {
            writeStartArray();
            a(uVar);
        }
    }

    public Object currentValue() {
        y outputContext = getOutputContext();
        if (outputContext == null) {
            return null;
        }
        return outputContext.getCurrentValue();
    }

    public final void d(u uVar) throws IOException {
        if (uVar.hasTextCharacters()) {
            writeString(uVar.getTextCharacters(), uVar.getTextOffset(), uVar.getTextLength());
        } else {
            writeString(uVar.getText());
        }
    }

    public abstract o disable(n nVar);

    public final void e(String str) throws m {
        throw new m(str, this);
    }

    public abstract o enable(n nVar);

    public abstract void flush() throws IOException;

    public cc.e getCharacterEscapes() {
        return null;
    }

    public abstract a0 getCodec();

    @Deprecated
    public Object getCurrentValue() {
        return currentValue();
    }

    public abstract int getFeatureMask();

    public int getFormatFeatures() {
        return 0;
    }

    public int getHighestEscapedChar() {
        return 0;
    }

    public int getOutputBuffered() {
        return -1;
    }

    public abstract y getOutputContext();

    public Object getOutputTarget() {
        return null;
    }

    public b0 getPrettyPrinter() {
        return this.f88311b;
    }

    public g getSchema() {
        return null;
    }

    public ic.l getWriteCapabilities() {
        return f88309c;
    }

    public void h() {
        throw new UnsupportedOperationException("Operation not supported by `JsonGenerator` of type ".concat(getClass().getName()));
    }

    public abstract boolean isClosed();

    public boolean isEnabled(k0 k0Var) {
        return isEnabled(k0Var.mappedFeature());
    }

    public abstract boolean isEnabled(n nVar);

    public o overrideStdFeatures(int i10, int i11) {
        return setFeatureMask((i10 & i11) | (getFeatureMask() & (~i11)));
    }

    public abstract o setCodec(a0 a0Var);

    @Deprecated
    public void setCurrentValue(Object obj) {
        assignCurrentValue(obj);
    }

    @Deprecated
    public abstract o setFeatureMask(int i10);

    public o setPrettyPrinter(b0 b0Var) {
        this.f88311b = b0Var;
        return this;
    }

    public o setRootValueSeparator(c0 c0Var) {
        throw new UnsupportedOperationException();
    }

    public void setSchema(g gVar) {
        throw new UnsupportedOperationException(e3.g.l("Generator of type ", getClass().getName(), " does not support schema of type '", gVar.a(), "'"));
    }

    public j0 streamWriteConstraints() {
        return j0.defaults();
    }

    public abstract o useDefaultPrettyPrinter();

    public abstract p0 version();

    public void writeArray(int[] iArr, int i10, int i11) throws IOException {
        if (iArr == null) {
            throw new IllegalArgumentException("null array");
        }
        i(iArr.length, i10, i11);
        writeStartArray(iArr, i11);
        int i12 = i11 + i10;
        while (i10 < i12) {
            writeNumber(iArr[i10]);
            i10++;
        }
        writeEndArray();
    }

    public void writeArrayFieldStart(String str) throws IOException {
        writeFieldName(str);
        writeStartArray();
    }

    public abstract int writeBinary(b bVar, InputStream inputStream, int i10) throws IOException;

    public abstract void writeBinary(b bVar, byte[] bArr, int i10, int i11) throws IOException;

    public void writeBinary(byte[] bArr, int i10, int i11) throws IOException {
        writeBinary(c.getDefaultVariant(), bArr, i10, i11);
    }

    public void writeBinaryField(String str, byte[] bArr) throws IOException {
        writeFieldName(str);
        writeBinary(bArr);
    }

    public abstract void writeBoolean(boolean z10) throws IOException;

    public void writeBooleanField(String str, boolean z10) throws IOException {
        writeFieldName(str);
        writeBoolean(z10);
    }

    public void writeEmbeddedObject(Object obj) throws IOException {
        if (obj == null) {
            writeNull();
        } else {
            if (!(obj instanceof byte[])) {
                throw new m("No native support for writing embedded objects of type ".concat(obj.getClass().getName()), this);
            }
            writeBinary((byte[]) obj);
        }
    }

    public abstract void writeEndArray() throws IOException;

    public abstract void writeEndObject() throws IOException;

    public void writeFieldId(long j10) throws IOException {
        writeFieldName(Long.toString(j10));
    }

    public abstract void writeFieldName(String str) throws IOException;

    public abstract void writeFieldName(c0 c0Var) throws IOException;

    public abstract void writeNull() throws IOException;

    public void writeNullField(String str) throws IOException {
        writeFieldName(str);
        writeNull();
    }

    public abstract void writeNumber(double d10) throws IOException;

    public abstract void writeNumber(float f10) throws IOException;

    public abstract void writeNumber(int i10) throws IOException;

    public abstract void writeNumber(long j10) throws IOException;

    public abstract void writeNumber(String str) throws IOException;

    public abstract void writeNumber(BigDecimal bigDecimal) throws IOException;

    public abstract void writeNumber(BigInteger bigInteger) throws IOException;

    public void writeNumber(short s10) throws IOException {
        writeNumber((int) s10);
    }

    public void writeNumberField(String str, short s10) throws IOException {
        writeFieldName(str);
        writeNumber(s10);
    }

    public abstract void writeObject(Object obj) throws IOException;

    public void writeObjectField(String str, Object obj) throws IOException {
        writeFieldName(str);
        writeObject(obj);
    }

    public void writeObjectFieldStart(String str) throws IOException {
        writeFieldName(str);
        writeStartObject();
    }

    public void writeObjectId(Object obj) throws IOException {
        throw new m("No native support for writing Object Ids", this);
    }

    public void writeObjectRef(Object obj) throws IOException {
        throw new m("No native support for writing Object Ids", this);
    }

    public void writePOJO(Object obj) throws IOException {
        writeObject(obj);
    }

    public void writePOJOField(String str, Object obj) throws IOException {
        writeObjectField(str, obj);
    }

    public abstract void writeRaw(char c10) throws IOException;

    public abstract void writeRaw(String str) throws IOException;

    public abstract void writeRaw(String str, int i10, int i11) throws IOException;

    public void writeRaw(c0 c0Var) throws IOException {
        writeRaw(c0Var.getValue());
    }

    public abstract void writeRaw(char[] cArr, int i10, int i11) throws IOException;

    public abstract void writeRawUTF8String(byte[] bArr, int i10, int i11) throws IOException;

    public abstract void writeRawValue(String str) throws IOException;

    public abstract void writeRawValue(String str, int i10, int i11) throws IOException;

    public void writeRawValue(c0 c0Var) throws IOException {
        writeRawValue(c0Var.getValue());
    }

    public abstract void writeRawValue(char[] cArr, int i10, int i11) throws IOException;

    public abstract void writeStartArray() throws IOException;

    @Deprecated
    public void writeStartArray(int i10) throws IOException {
        writeStartArray();
    }

    public abstract void writeStartObject() throws IOException;

    public void writeStartObject(Object obj) throws IOException {
        writeStartObject();
        setCurrentValue(obj);
    }

    public void writeString(Reader reader, int i10) throws IOException {
        h();
        throw null;
    }

    public abstract void writeString(String str) throws IOException;

    public abstract void writeString(c0 c0Var) throws IOException;

    public abstract void writeString(char[] cArr, int i10, int i11) throws IOException;

    public void writeStringField(String str, String str2) throws IOException {
        writeFieldName(str);
        writeString(str2);
    }

    public abstract void writeTree(o0 o0Var) throws IOException;

    public void writeTypeId(Object obj) throws IOException {
        throw new m("No native support for writing Type Ids", this);
    }

    public hc.c writeTypePrefix(hc.c cVar) throws IOException {
        boolean z10 = false;
        if (canWriteTypeId()) {
            cVar.f58733g = false;
            writeTypeId(cVar.f58729c);
        } else {
            String string = Objects.toString(cVar.f58729c, null);
            if (string != null) {
                int i10 = cVar.f58731e;
                if (cVar.f58732f != z.START_OBJECT) {
                    if (i10 == 3 || i10 == 4) {
                        cVar.f58731e = 1;
                        i10 = 1;
                    }
                }
                cVar.f58733g = true;
                int iC = b3.h.c(i10);
                if (iC == 1) {
                    writeStartObject();
                    writeFieldName(string);
                } else if (iC == 2) {
                    writeStartObject(cVar.f58727a);
                    writeStringField(cVar.f58730d, string);
                    z10 = true;
                } else if (iC != 3 && iC != 4) {
                    writeStartArray();
                    writeString(string);
                }
            }
        }
        int iOrdinal = cVar.f58732f.ordinal();
        if (iOrdinal != 1) {
            if (iOrdinal == 3) {
                writeStartArray(cVar.f58727a);
                return cVar;
            }
        } else if (!z10) {
            writeStartObject(cVar.f58727a);
        }
        return cVar;
    }

    public hc.c writeTypeSuffix(hc.c cVar) throws IOException {
        z zVar = cVar.f58732f;
        if (zVar == z.START_OBJECT) {
            writeEndObject();
        } else if (zVar == z.START_ARRAY) {
            writeEndArray();
        }
        if (cVar.f58733g) {
            int iC = b3.h.c(cVar.f58731e);
            if (iC == 0) {
                writeEndArray();
            } else if (iC != 2 && iC != 3) {
                if (iC != 4) {
                    writeEndObject();
                    return cVar;
                }
                Object obj = cVar.f58729c;
                writeStringField(cVar.f58730d, obj instanceof String ? (String) obj : String.valueOf(obj));
                return cVar;
            }
        }
        return cVar;
    }

    public abstract void writeUTF8String(byte[] bArr, int i10, int i11) throws IOException;

    public void writeBinary(byte[] bArr) throws IOException {
        writeBinary(c.getDefaultVariant(), bArr, 0, bArr.length);
    }

    public void writeNumber(char[] cArr, int i10, int i11) throws IOException {
        writeNumber(new String(cArr, i10, i11));
    }

    public void writeStartArray(Object obj) throws IOException {
        writeStartArray();
        setCurrentValue(obj);
    }

    public int writeBinary(InputStream inputStream, int i10) throws IOException {
        return writeBinary(c.getDefaultVariant(), inputStream, i10);
    }

    public void writeNumberField(String str, int i10) throws IOException {
        writeFieldName(str);
        writeNumber(i10);
    }

    public void writeStartObject(Object obj, int i10) throws IOException {
        writeStartObject(obj);
    }

    public void writeStartArray(Object obj, int i10) throws IOException {
        writeStartArray(i10);
        setCurrentValue(obj);
    }

    public void writeNumberField(String str, long j10) throws IOException {
        writeFieldName(str);
        writeNumber(j10);
    }

    public void writeArray(long[] jArr, int i10, int i11) throws IOException {
        if (jArr != null) {
            i(jArr.length, i10, i11);
            writeStartArray(jArr, i11);
            int i12 = i11 + i10;
            while (i10 < i12) {
                writeNumber(jArr[i10]);
                i10++;
            }
            writeEndArray();
            return;
        }
        throw new IllegalArgumentException("null array");
    }

    public void writeNumberField(String str, BigInteger bigInteger) throws IOException {
        writeFieldName(str);
        writeNumber(bigInteger);
    }

    public void writeNumberField(String str, float f10) throws IOException {
        writeFieldName(str);
        writeNumber(f10);
    }

    public void writeArray(double[] dArr, int i10, int i11) throws IOException {
        if (dArr != null) {
            i(dArr.length, i10, i11);
            writeStartArray(dArr, i11);
            int i12 = i11 + i10;
            while (i10 < i12) {
                writeNumber(dArr[i10]);
                i10++;
            }
            writeEndArray();
            return;
        }
        throw new IllegalArgumentException("null array");
    }

    public void writeNumberField(String str, double d10) throws IOException {
        writeFieldName(str);
        writeNumber(d10);
    }

    public void writeNumberField(String str, BigDecimal bigDecimal) throws IOException {
        writeFieldName(str);
        writeNumber(bigDecimal);
    }

    public void writeArray(String[] strArr, int i10, int i11) throws IOException {
        if (strArr != null) {
            i(strArr.length, i10, i11);
            writeStartArray(strArr, i11);
            int i12 = i11 + i10;
            while (i10 < i12) {
                writeString(strArr[i10]);
                i10++;
            }
            writeEndArray();
            return;
        }
        throw new IllegalArgumentException("null array");
    }

    public o setCharacterEscapes(cc.e eVar) {
        return this;
    }

    public o setHighestNonEscapedChar(int i10) {
        return this;
    }

    public void writeOmittedField(String str) throws IOException {
    }

    public o overrideFormatFeatures(int i10, int i11) {
        return this;
    }
}
