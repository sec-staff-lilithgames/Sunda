package wb;

import cc.h;
import ec.g;
import ec.i;
import ic.f;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import ub.a0;
import ub.c0;
import ub.m;
import ub.n;
import ub.o;
import ub.o0;
import ub.p0;
import ub.y;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class a extends o {

    /* renamed from: l, reason: collision with root package name */
    public static final int f90504l = (n.WRITE_NUMBERS_AS_STRINGS.getMask() | n.ESCAPE_NON_ASCII.getMask()) | n.STRICT_DUPLICATE_DETECTION.getMask();

    /* renamed from: f, reason: collision with root package name */
    public a0 f90505f;

    /* renamed from: g, reason: collision with root package name */
    public int f90506g;

    /* renamed from: h, reason: collision with root package name */
    public final h f90507h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f90508i;

    /* renamed from: j, reason: collision with root package name */
    public g f90509j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f90510k;

    public a(h hVar, int i10, a0 a0Var) {
        this.f90506g = i10;
        this.f90505f = a0Var;
        this.f90507h = hVar;
        this.f90509j = g.createRootContext(n.STRICT_DUPLICATE_DETECTION.enabledIn(i10) ? ec.b.rootDetector(this) : null);
        this.f90508i = n.WRITE_NUMBERS_AS_STRINGS.enabledIn(i10);
    }

    @Override // ub.o
    public void assignCurrentValue(Object obj) {
        g gVar = this.f90509j;
        if (gVar != null) {
            gVar.setCurrentValue(obj);
        }
    }

    @Override // ub.o, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.f90510k) {
            return;
        }
        h hVar = this.f90507h;
        if (hVar != null) {
            hVar.close();
        }
        this.f90510k = true;
    }

    @Override // ub.o
    public Object currentValue() {
        return this.f90509j.getCurrentValue();
    }

    @Override // ub.o
    public o disable(n nVar) {
        int mask = nVar.getMask();
        this.f90506g &= ~mask;
        if ((mask & f90504l) != 0) {
            if (nVar == n.WRITE_NUMBERS_AS_STRINGS) {
                this.f90508i = false;
                return this;
            }
            if (nVar == n.ESCAPE_NON_ASCII) {
                setHighestNonEscapedChar(0);
                return this;
            }
            if (nVar == n.STRICT_DUPLICATE_DETECTION) {
                this.f90509j = this.f90509j.withDupDetector(null);
            }
        }
        return this;
    }

    @Override // ub.o
    public o enable(n nVar) {
        int mask = nVar.getMask();
        this.f90506g |= mask;
        if ((mask & f90504l) != 0) {
            if (nVar == n.WRITE_NUMBERS_AS_STRINGS) {
                this.f90508i = true;
                return this;
            }
            if (nVar == n.ESCAPE_NON_ASCII) {
                setHighestNonEscapedChar(127);
                return this;
            }
            if (nVar == n.STRICT_DUPLICATE_DETECTION && this.f90509j.getDupDetector() == null) {
                this.f90509j = this.f90509j.withDupDetector(ec.b.rootDetector(this));
            }
        }
        return this;
    }

    @Override // ub.o, java.io.Flushable
    public abstract void flush() throws IOException;

    @Override // ub.o
    public a0 getCodec() {
        return this.f90505f;
    }

    @Override // ub.o
    public int getFeatureMask() {
        return this.f90506g;
    }

    @Override // ub.o
    public y getOutputContext() {
        return this.f90509j;
    }

    public h ioContext() {
        return this.f90507h;
    }

    @Override // ub.o
    public boolean isClosed() {
        return this.f90510k;
    }

    @Override // ub.o
    public final boolean isEnabled(n nVar) {
        return (nVar.getMask() & this.f90506g) != 0;
    }

    public final String j(BigDecimal bigDecimal) throws m {
        if (!n.WRITE_BIGDECIMAL_AS_PLAIN.enabledIn(this.f90506g)) {
            return bigDecimal.toString();
        }
        int iScale = bigDecimal.scale();
        if (iScale >= -9999 && iScale <= 9999) {
            return bigDecimal.toPlainString();
        }
        e(String.format("Attempt to write plain `java.math.BigDecimal` (see JsonGenerator.Feature.WRITE_BIGDECIMAL_AS_PLAIN) with illegal scale (%d): needs to be between [-%d, %d]", Integer.valueOf(iScale), 9999, 9999));
        throw null;
    }

    public final void k(int i10, int i11, byte[] bArr) {
        if (bArr == null) {
            e("Invalid `byte[]` argument: `null`");
            throw null;
        }
        int length = bArr.length;
        int i12 = i10 + i11;
        if (((length - i12) | i10 | i11 | i12) >= 0) {
            return;
        }
        e(String.format("Invalid 'offset' (%d) and/or 'len' (%d) arguments for `byte[]` of length %d", Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(length)));
        throw null;
    }

    public final void l(int i10, char[] cArr, int i11) {
        if (cArr == null) {
            e("Invalid `char[]` argument: `null`");
            throw null;
        }
        int length = cArr.length;
        int i12 = i10 + i11;
        if (((length - i12) | i10 | i11 | i12) >= 0) {
            return;
        }
        e(String.format("Invalid 'offset' (%d) and/or 'len' (%d) arguments for `char[]` of length %d", Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(length)));
        throw null;
    }

    public final void m(int i10, int i11, String str) {
        if (str == null) {
            e("Invalid `String` argument: `null`");
            throw null;
        }
        int length = str.length();
        int i12 = i10 + i11;
        if (((length - i12) | i10 | i11 | i12) >= 0) {
            return;
        }
        e(String.format("Invalid 'offset' (%d) and/or 'len' (%d) arguments for `String` of length %d", Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(length)));
        throw null;
    }

    public abstract void n(int i10, int i11);

    public abstract void o(String str);

    @Override // ub.o
    public o overrideStdFeatures(int i10, int i11) {
        int i12 = this.f90506g;
        int i13 = (i10 & i11) | ((~i11) & i12);
        int i14 = i12 ^ i13;
        if (i14 != 0) {
            this.f90506g = i13;
            n(i13, i14);
        }
        return this;
    }

    @Override // ub.o
    public o setCodec(a0 a0Var) {
        this.f90505f = a0Var;
        return this;
    }

    @Override // ub.o
    @Deprecated
    public o setFeatureMask(int i10) {
        int i11 = this.f90506g ^ i10;
        this.f90506g = i10;
        if (i11 != 0) {
            n(i10, i11);
        }
        return this;
    }

    @Override // ub.o
    public o useDefaultPrettyPrinter() {
        return getPrettyPrinter() != null ? this : setPrettyPrinter(new f());
    }

    @Override // ub.o, ub.q0
    public p0 version() {
        return i.f54057b;
    }

    @Override // ub.o
    public int writeBinary(ub.b bVar, InputStream inputStream, int i10) throws IOException {
        h();
        throw null;
    }

    @Override // ub.o
    public void writeFieldName(c0 c0Var) throws IOException {
        writeFieldName(c0Var.getValue());
    }

    @Override // ub.o
    public void writeObject(Object obj) throws IOException {
        if (obj == null) {
            writeNull();
            return;
        }
        a0 a0Var = this.f90505f;
        if (a0Var != null) {
            a0Var.writeValue(this, obj);
            return;
        }
        if (obj instanceof String) {
            writeString((String) obj);
            return;
        }
        if (obj instanceof Number) {
            Number number = (Number) obj;
            if (number instanceof Integer) {
                writeNumber(number.intValue());
                return;
            }
            if (number instanceof Long) {
                writeNumber(number.longValue());
                return;
            }
            if (number instanceof Double) {
                writeNumber(number.doubleValue());
                return;
            }
            if (number instanceof Float) {
                writeNumber(number.floatValue());
                return;
            }
            if (number instanceof Short) {
                writeNumber(number.shortValue());
                return;
            }
            if (number instanceof Byte) {
                writeNumber(number.byteValue());
                return;
            }
            if (number instanceof BigInteger) {
                writeNumber((BigInteger) number);
                return;
            }
            if (number instanceof BigDecimal) {
                writeNumber((BigDecimal) number);
                return;
            } else if (number instanceof AtomicInteger) {
                writeNumber(((AtomicInteger) number).get());
                return;
            } else if (number instanceof AtomicLong) {
                writeNumber(((AtomicLong) number).get());
                return;
            }
        } else if (obj instanceof byte[]) {
            writeBinary((byte[]) obj);
            return;
        } else if (obj instanceof Boolean) {
            writeBoolean(((Boolean) obj).booleanValue());
            return;
        } else if (obj instanceof AtomicBoolean) {
            writeBoolean(((AtomicBoolean) obj).get());
            return;
        }
        throw new IllegalStateException("No ObjectCodec defined for the generator, can only serialize simple wrapper types (type passed " + obj.getClass().getName() + ")");
    }

    @Override // ub.o
    public void writeRawValue(String str) throws IOException {
        o("write raw value");
        writeRaw(str);
    }

    @Override // ub.o
    public void writeStartObject(Object obj) throws IOException {
        writeStartObject();
        if (obj != null) {
            assignCurrentValue(obj);
        }
    }

    @Override // ub.o
    public void writeString(c0 c0Var) throws IOException {
        writeString(c0Var.getValue());
    }

    @Override // ub.o
    public void writeTree(o0 o0Var) throws IOException {
        if (o0Var == null) {
            writeNull();
            return;
        }
        a0 a0Var = this.f90505f;
        if (a0Var == null) {
            throw new IllegalStateException("No ObjectCodec defined");
        }
        a0Var.writeValue(this, o0Var);
    }

    @Override // ub.o
    public void writeRawValue(String str, int i10, int i11) throws IOException {
        o("write raw value");
        writeRaw(str, i10, i11);
    }

    @Override // ub.o
    public void writeRawValue(char[] cArr, int i10, int i11) throws IOException {
        o("write raw value");
        writeRaw(cArr, i10, i11);
    }

    @Override // ub.o
    public void writeRawValue(c0 c0Var) throws IOException {
        o("write raw value");
        writeRaw(c0Var);
    }
}
