package n4;

import androidx.datastore.preferences.protobuf.a3;
import androidx.datastore.preferences.protobuf.c0;
import androidx.datastore.preferences.protobuf.e1;
import androidx.datastore.preferences.protobuf.f1;
import androidx.datastore.preferences.protobuf.f3;
import androidx.datastore.preferences.protobuf.k2;
import androidx.datastore.preferences.protobuf.s0;
import androidx.datastore.preferences.protobuf.u1;
import androidx.datastore.preferences.protobuf.x;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class i extends f1 implements j {
    private static final i DEFAULT_INSTANCE;
    private static volatile a3 PARSER = null;
    public static final int PREFERENCES_FIELD_NUMBER = 1;
    private k2 preferences_ = k2.emptyMapField();

    static {
        i iVar = new i();
        DEFAULT_INSTANCE = iVar;
        f1.q(i.class, iVar);
    }

    public static i getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static g newBuilder() {
        return (g) ((e1) DEFAULT_INSTANCE.f(5));
    }

    public static i parseDelimitedFrom(InputStream inputStream) throws IOException {
        f1 f1VarN = f1.n(DEFAULT_INSTANCE, inputStream, s0.getEmptyRegistry());
        f1.e(f1VarN);
        return (i) f1VarN;
    }

    public static i parseFrom(ByteBuffer byteBuffer) throws u1 {
        f1 f1VarO = f1.o(DEFAULT_INSTANCE, c0.newInstance(byteBuffer), s0.getEmptyRegistry());
        f1.e(f1VarO);
        f1.e(f1VarO);
        return (i) f1VarO;
    }

    public static a3 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static k2 s(i iVar) {
        if (!iVar.preferences_.isMutable()) {
            iVar.preferences_ = iVar.preferences_.mutableCopy();
        }
        return iVar.preferences_;
    }

    @Override // n4.j
    public boolean containsPreferences(String str) {
        str.getClass();
        return this.preferences_.containsKey(str);
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
                return new f3(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"preferences_", h.f75617a});
            case 3:
                return new i();
            case 4:
                return new g(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                a3 a3Var = PARSER;
                if (a3Var != null) {
                    return a3Var;
                }
                synchronized (i.class) {
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

    @Override // n4.j
    @Deprecated
    public Map<String, p> getPreferences() {
        return getPreferencesMap();
    }

    @Override // n4.j
    public int getPreferencesCount() {
        return this.preferences_.size();
    }

    @Override // n4.j
    public Map<String, p> getPreferencesMap() {
        return Collections.unmodifiableMap(this.preferences_);
    }

    @Override // n4.j
    public p getPreferencesOrDefault(String str, p pVar) {
        str.getClass();
        k2 k2Var = this.preferences_;
        return k2Var.containsKey(str) ? (p) k2Var.get(str) : pVar;
    }

    @Override // n4.j
    public p getPreferencesOrThrow(String str) {
        str.getClass();
        k2 k2Var = this.preferences_;
        if (k2Var.containsKey(str)) {
            return (p) k2Var.get(str);
        }
        throw new IllegalArgumentException();
    }

    public static g newBuilder(i iVar) {
        return (g) ((e1) DEFAULT_INSTANCE.f(5)).mergeFrom((f1) iVar);
    }

    public static i parseDelimitedFrom(InputStream inputStream, s0 s0Var) throws IOException {
        f1 f1VarN = f1.n(DEFAULT_INSTANCE, inputStream, s0Var);
        f1.e(f1VarN);
        return (i) f1VarN;
    }

    public static i parseFrom(ByteBuffer byteBuffer, s0 s0Var) throws u1 {
        f1 f1VarO = f1.o(DEFAULT_INSTANCE, c0.newInstance(byteBuffer), s0Var);
        f1.e(f1VarO);
        f1.e(f1VarO);
        return (i) f1VarO;
    }

    public static i parseFrom(x xVar) throws u1 {
        f1 f1VarM = f1.m(DEFAULT_INSTANCE, xVar, s0.getEmptyRegistry());
        f1.e(f1VarM);
        return (i) f1VarM;
    }

    public static i parseFrom(x xVar, s0 s0Var) throws u1 {
        return (i) f1.m(DEFAULT_INSTANCE, xVar, s0Var);
    }

    public static i parseFrom(byte[] bArr) throws u1 {
        f1 f1VarP = f1.p(DEFAULT_INSTANCE, bArr, 0, bArr.length, s0.getEmptyRegistry());
        f1.e(f1VarP);
        return (i) f1VarP;
    }

    public static i parseFrom(byte[] bArr, s0 s0Var) throws u1 {
        f1 f1VarP = f1.p(DEFAULT_INSTANCE, bArr, 0, bArr.length, s0Var);
        f1.e(f1VarP);
        return (i) f1VarP;
    }

    public static i parseFrom(InputStream inputStream) throws IOException {
        f1 f1VarO = f1.o(DEFAULT_INSTANCE, c0.newInstance(inputStream), s0.getEmptyRegistry());
        f1.e(f1VarO);
        return (i) f1VarO;
    }

    public static i parseFrom(InputStream inputStream, s0 s0Var) throws IOException {
        f1 f1VarO = f1.o(DEFAULT_INSTANCE, c0.newInstance(inputStream), s0Var);
        f1.e(f1VarO);
        return (i) f1VarO;
    }

    public static i parseFrom(c0 c0Var) throws IOException {
        f1 f1VarO = f1.o(DEFAULT_INSTANCE, c0Var, s0.getEmptyRegistry());
        f1.e(f1VarO);
        return (i) f1VarO;
    }

    public static i parseFrom(c0 c0Var, s0 s0Var) throws IOException {
        f1 f1VarO = f1.o(DEFAULT_INSTANCE, c0Var, s0Var);
        f1.e(f1VarO);
        return (i) f1VarO;
    }
}
