package n4;

import androidx.datastore.preferences.protobuf.a3;
import androidx.datastore.preferences.protobuf.c0;
import androidx.datastore.preferences.protobuf.e1;
import androidx.datastore.preferences.protobuf.f1;
import androidx.datastore.preferences.protobuf.f3;
import androidx.datastore.preferences.protobuf.s0;
import androidx.datastore.preferences.protobuf.u1;
import androidx.datastore.preferences.protobuf.x;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class p extends f1 implements q {
    public static final int BOOLEAN_FIELD_NUMBER = 1;
    public static final int BYTES_FIELD_NUMBER = 8;
    private static final p DEFAULT_INSTANCE;
    public static final int DOUBLE_FIELD_NUMBER = 7;
    public static final int FLOAT_FIELD_NUMBER = 2;
    public static final int INTEGER_FIELD_NUMBER = 3;
    public static final int LONG_FIELD_NUMBER = 4;
    private static volatile a3 PARSER = null;
    public static final int STRING_FIELD_NUMBER = 5;
    public static final int STRING_SET_FIELD_NUMBER = 6;
    private int valueCase_ = 0;
    private Object value_;

    static {
        p pVar = new p();
        DEFAULT_INSTANCE = pVar;
        f1.q(p.class, pVar);
    }

    public static void A(p pVar, double d10) {
        pVar.valueCase_ = 7;
        pVar.value_ = Double.valueOf(d10);
    }

    public static void B(p pVar) {
        if (pVar.valueCase_ == 7) {
            pVar.valueCase_ = 0;
            pVar.value_ = null;
        }
    }

    public static void C(p pVar, x xVar) {
        pVar.getClass();
        xVar.getClass();
        pVar.valueCase_ = 8;
        pVar.value_ = xVar;
    }

    public static void D(p pVar) {
        if (pVar.valueCase_ == 8) {
            pVar.valueCase_ = 0;
            pVar.value_ = null;
        }
    }

    public static void F(p pVar) {
        pVar.valueCase_ = 0;
        pVar.value_ = null;
    }

    public static void G(p pVar, boolean z10) {
        pVar.valueCase_ = 1;
        pVar.value_ = Boolean.valueOf(z10);
    }

    public static void H(p pVar) {
        if (pVar.valueCase_ == 1) {
            pVar.valueCase_ = 0;
            pVar.value_ = null;
        }
    }

    public static void I(p pVar, float f10) {
        pVar.valueCase_ = 2;
        pVar.value_ = Float.valueOf(f10);
    }

    public static void J(p pVar) {
        if (pVar.valueCase_ == 2) {
            pVar.valueCase_ = 0;
            pVar.value_ = null;
        }
    }

    public static void K(p pVar, int i10) {
        pVar.valueCase_ = 3;
        pVar.value_ = Integer.valueOf(i10);
    }

    public static p getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static n newBuilder() {
        return (n) ((e1) DEFAULT_INSTANCE.f(5));
    }

    public static p parseDelimitedFrom(InputStream inputStream) throws IOException {
        f1 f1VarN = f1.n(DEFAULT_INSTANCE, inputStream, s0.getEmptyRegistry());
        f1.e(f1VarN);
        return (p) f1VarN;
    }

    public static p parseFrom(ByteBuffer byteBuffer) throws u1 {
        f1 f1VarO = f1.o(DEFAULT_INSTANCE, c0.newInstance(byteBuffer), s0.getEmptyRegistry());
        f1.e(f1VarO);
        f1.e(f1VarO);
        return (p) f1VarO;
    }

    public static a3 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static void r(p pVar) {
        if (pVar.valueCase_ == 3) {
            pVar.valueCase_ = 0;
            pVar.value_ = null;
        }
    }

    public static void s(p pVar, long j10) {
        pVar.valueCase_ = 4;
        pVar.value_ = Long.valueOf(j10);
    }

    public static void t(p pVar) {
        if (pVar.valueCase_ == 4) {
            pVar.valueCase_ = 0;
            pVar.value_ = null;
        }
    }

    public static void u(String str, p pVar) {
        pVar.getClass();
        str.getClass();
        pVar.valueCase_ = 5;
        pVar.value_ = str;
    }

    public static void v(p pVar) {
        if (pVar.valueCase_ == 5) {
            pVar.valueCase_ = 0;
            pVar.value_ = null;
        }
    }

    public static void w(p pVar, x xVar) {
        pVar.getClass();
        pVar.value_ = xVar.toStringUtf8();
        pVar.valueCase_ = 5;
    }

    public static void x(p pVar, l lVar) {
        pVar.getClass();
        lVar.getClass();
        pVar.value_ = lVar;
        pVar.valueCase_ = 6;
    }

    public static void y(p pVar, l lVar) {
        pVar.getClass();
        lVar.getClass();
        if (pVar.valueCase_ != 6 || pVar.value_ == l.getDefaultInstance()) {
            pVar.value_ = lVar;
        } else {
            pVar.value_ = ((k) l.newBuilder((l) pVar.value_).mergeFrom((f1) lVar)).buildPartial();
        }
        pVar.valueCase_ = 6;
    }

    public static void z(p pVar) {
        if (pVar.valueCase_ == 6) {
            pVar.valueCase_ = 0;
            pVar.value_ = null;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.f1
    public final Object f(int i10) {
        a3 aVar;
        switch (b3.h.c(i10)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new f3(DEFAULT_INSTANCE, "\u0001\b\u0001\u0000\u0001\b\b\u0000\u0000\u0000\u0001:\u0000\u00024\u0000\u00037\u0000\u00045\u0000\u0005;\u0000\u0006<\u0000\u00073\u0000\b=\u0000", new Object[]{"value_", "valueCase_", l.class});
            case 3:
                return new p();
            case 4:
                return new n(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                a3 a3Var = PARSER;
                if (a3Var != null) {
                    return a3Var;
                }
                synchronized (p.class) {
                    try {
                        aVar = PARSER;
                        if (aVar == null) {
                            aVar = new f1.a(DEFAULT_INSTANCE);
                            PARSER = aVar;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return aVar;
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // n4.q
    public boolean getBoolean() {
        if (this.valueCase_ == 1) {
            return ((Boolean) this.value_).booleanValue();
        }
        return false;
    }

    @Override // n4.q
    public x getBytes() {
        return this.valueCase_ == 8 ? (x) this.value_ : x.f6099c;
    }

    @Override // n4.q
    public double getDouble() {
        if (this.valueCase_ == 7) {
            return ((Double) this.value_).doubleValue();
        }
        return 0.0d;
    }

    @Override // n4.q
    public float getFloat() {
        if (this.valueCase_ == 2) {
            return ((Float) this.value_).floatValue();
        }
        return 0.0f;
    }

    @Override // n4.q
    public int getInteger() {
        if (this.valueCase_ == 3) {
            return ((Integer) this.value_).intValue();
        }
        return 0;
    }

    @Override // n4.q
    public long getLong() {
        if (this.valueCase_ == 4) {
            return ((Long) this.value_).longValue();
        }
        return 0L;
    }

    @Override // n4.q
    public String getString() {
        return this.valueCase_ == 5 ? (String) this.value_ : "";
    }

    @Override // n4.q
    public x getStringBytes() {
        return x.copyFromUtf8(this.valueCase_ == 5 ? (String) this.value_ : "");
    }

    @Override // n4.q
    public l getStringSet() {
        return this.valueCase_ == 6 ? (l) this.value_ : l.getDefaultInstance();
    }

    @Override // n4.q
    public o getValueCase() {
        return o.forNumber(this.valueCase_);
    }

    @Override // n4.q
    public boolean hasBoolean() {
        return this.valueCase_ == 1;
    }

    @Override // n4.q
    public boolean hasBytes() {
        return this.valueCase_ == 8;
    }

    @Override // n4.q
    public boolean hasDouble() {
        return this.valueCase_ == 7;
    }

    @Override // n4.q
    public boolean hasFloat() {
        return this.valueCase_ == 2;
    }

    @Override // n4.q
    public boolean hasInteger() {
        return this.valueCase_ == 3;
    }

    @Override // n4.q
    public boolean hasLong() {
        return this.valueCase_ == 4;
    }

    @Override // n4.q
    public boolean hasString() {
        return this.valueCase_ == 5;
    }

    @Override // n4.q
    public boolean hasStringSet() {
        return this.valueCase_ == 6;
    }

    public static n newBuilder(p pVar) {
        return (n) ((e1) DEFAULT_INSTANCE.f(5)).mergeFrom((f1) pVar);
    }

    public static p parseDelimitedFrom(InputStream inputStream, s0 s0Var) throws IOException {
        f1 f1VarN = f1.n(DEFAULT_INSTANCE, inputStream, s0Var);
        f1.e(f1VarN);
        return (p) f1VarN;
    }

    public static p parseFrom(ByteBuffer byteBuffer, s0 s0Var) throws u1 {
        f1 f1VarO = f1.o(DEFAULT_INSTANCE, c0.newInstance(byteBuffer), s0Var);
        f1.e(f1VarO);
        f1.e(f1VarO);
        return (p) f1VarO;
    }

    public static p parseFrom(x xVar) throws u1 {
        f1 f1VarM = f1.m(DEFAULT_INSTANCE, xVar, s0.getEmptyRegistry());
        f1.e(f1VarM);
        return (p) f1VarM;
    }

    public static p parseFrom(x xVar, s0 s0Var) throws u1 {
        return (p) f1.m(DEFAULT_INSTANCE, xVar, s0Var);
    }

    public static p parseFrom(byte[] bArr) throws u1 {
        f1 f1VarP = f1.p(DEFAULT_INSTANCE, bArr, 0, bArr.length, s0.getEmptyRegistry());
        f1.e(f1VarP);
        return (p) f1VarP;
    }

    public static p parseFrom(byte[] bArr, s0 s0Var) throws u1 {
        f1 f1VarP = f1.p(DEFAULT_INSTANCE, bArr, 0, bArr.length, s0Var);
        f1.e(f1VarP);
        return (p) f1VarP;
    }

    public static p parseFrom(InputStream inputStream) throws IOException {
        f1 f1VarO = f1.o(DEFAULT_INSTANCE, c0.newInstance(inputStream), s0.getEmptyRegistry());
        f1.e(f1VarO);
        return (p) f1VarO;
    }

    public static p parseFrom(InputStream inputStream, s0 s0Var) throws IOException {
        f1 f1VarO = f1.o(DEFAULT_INSTANCE, c0.newInstance(inputStream), s0Var);
        f1.e(f1VarO);
        return (p) f1VarO;
    }

    public static p parseFrom(c0 c0Var) throws IOException {
        f1 f1VarO = f1.o(DEFAULT_INSTANCE, c0Var, s0.getEmptyRegistry());
        f1.e(f1VarO);
        return (p) f1VarO;
    }

    public static p parseFrom(c0 c0Var, s0 s0Var) throws IOException {
        f1 f1VarO = f1.o(DEFAULT_INSTANCE, c0Var, s0Var);
        f1.e(f1VarO);
        return (p) f1VarO;
    }
}
