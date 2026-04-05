package n4;

import androidx.datastore.preferences.protobuf.a2;
import androidx.datastore.preferences.protobuf.a3;
import androidx.datastore.preferences.protobuf.b3;
import androidx.datastore.preferences.protobuf.c0;
import androidx.datastore.preferences.protobuf.e1;
import androidx.datastore.preferences.protobuf.e3;
import androidx.datastore.preferences.protobuf.f1;
import androidx.datastore.preferences.protobuf.f3;
import androidx.datastore.preferences.protobuf.s0;
import androidx.datastore.preferences.protobuf.s1;
import androidx.datastore.preferences.protobuf.t1;
import androidx.datastore.preferences.protobuf.u1;
import androidx.datastore.preferences.protobuf.x;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class l extends f1 implements m {
    private static final l DEFAULT_INSTANCE;
    private static volatile a3 PARSER = null;
    public static final int STRINGS_FIELD_NUMBER = 1;
    private s1 strings_ = e3.emptyList();

    static {
        l lVar = new l();
        DEFAULT_INSTANCE = lVar;
        f1.q(l.class, lVar);
    }

    public static l getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static k newBuilder() {
        return (k) ((e1) DEFAULT_INSTANCE.f(5));
    }

    public static l parseDelimitedFrom(InputStream inputStream) throws IOException {
        f1 f1VarN = f1.n(DEFAULT_INSTANCE, inputStream, s0.getEmptyRegistry());
        f1.e(f1VarN);
        return (l) f1VarN;
    }

    public static l parseFrom(ByteBuffer byteBuffer) throws u1 {
        f1 f1VarO = f1.o(DEFAULT_INSTANCE, c0.newInstance(byteBuffer), s0.getEmptyRegistry());
        f1.e(f1VarO);
        f1.e(f1VarO);
        return (l) f1VarO;
    }

    public static a3 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public static void s(l lVar, int i10, String str) {
        lVar.getClass();
        str.getClass();
        lVar.x();
        lVar.strings_.set(i10, str);
    }

    public static void t(l lVar, String str) {
        lVar.getClass();
        str.getClass();
        lVar.x();
        lVar.strings_.add(str);
    }

    public static void u(l lVar, Iterable iterable) {
        lVar.x();
        List list = lVar.strings_;
        Charset charset = t1.f6006a;
        iterable.getClass();
        if (iterable instanceof a2) {
            List underlyingElements = ((a2) iterable).getUnderlyingElements();
            if (list != null) {
                throw new ClassCastException();
            }
            list.size();
            Iterator it = underlyingElements.iterator();
            if (it.hasNext()) {
                Object next = it.next();
                next.getClass();
                if (next instanceof x) {
                    throw null;
                }
                if (next instanceof byte[]) {
                    x.copyFrom((byte[]) next);
                    throw null;
                }
                throw null;
            }
            return;
        }
        if (iterable instanceof b3) {
            list.addAll((Collection) iterable);
            return;
        }
        if ((list instanceof ArrayList) && (iterable instanceof Collection)) {
            ((ArrayList) list).ensureCapacity(((Collection) iterable).size() + list.size());
        }
        int size = list.size();
        for (Object obj : iterable) {
            if (obj == null) {
                String str = "Element at index " + (list.size() - size) + " is null.";
                for (int size2 = list.size() - 1; size2 >= size; size2--) {
                    list.remove(size2);
                }
                throw new NullPointerException(str);
            }
            list.add(obj);
        }
    }

    public static void v(l lVar) {
        lVar.getClass();
        lVar.strings_ = e3.emptyList();
    }

    public static void w(l lVar, x xVar) {
        lVar.x();
        lVar.strings_.add(xVar.toStringUtf8());
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
                return new f3(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"strings_"});
            case 3:
                return new l();
            case 4:
                return new k(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                a3 a3Var = PARSER;
                if (a3Var != null) {
                    return a3Var;
                }
                synchronized (l.class) {
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

    @Override // n4.m
    public String getStrings(int i10) {
        return (String) this.strings_.get(i10);
    }

    @Override // n4.m
    public x getStringsBytes(int i10) {
        return x.copyFromUtf8((String) this.strings_.get(i10));
    }

    @Override // n4.m
    public int getStringsCount() {
        return this.strings_.size();
    }

    @Override // n4.m
    public List<String> getStringsList() {
        return this.strings_;
    }

    public final void x() {
        androidx.datastore.preferences.protobuf.d dVar = (androidx.datastore.preferences.protobuf.d) this.strings_;
        if (dVar.isModifiable()) {
            return;
        }
        int size = dVar.size();
        this.strings_ = dVar.mutableCopyWithCapacity(size == 0 ? 10 : size * 2);
    }

    public static k newBuilder(l lVar) {
        return (k) ((e1) DEFAULT_INSTANCE.f(5)).mergeFrom((f1) lVar);
    }

    public static l parseDelimitedFrom(InputStream inputStream, s0 s0Var) throws IOException {
        f1 f1VarN = f1.n(DEFAULT_INSTANCE, inputStream, s0Var);
        f1.e(f1VarN);
        return (l) f1VarN;
    }

    public static l parseFrom(ByteBuffer byteBuffer, s0 s0Var) throws u1 {
        f1 f1VarO = f1.o(DEFAULT_INSTANCE, c0.newInstance(byteBuffer), s0Var);
        f1.e(f1VarO);
        f1.e(f1VarO);
        return (l) f1VarO;
    }

    public static l parseFrom(x xVar) throws u1 {
        f1 f1VarM = f1.m(DEFAULT_INSTANCE, xVar, s0.getEmptyRegistry());
        f1.e(f1VarM);
        return (l) f1VarM;
    }

    public static l parseFrom(x xVar, s0 s0Var) throws u1 {
        return (l) f1.m(DEFAULT_INSTANCE, xVar, s0Var);
    }

    public static l parseFrom(byte[] bArr) throws u1 {
        f1 f1VarP = f1.p(DEFAULT_INSTANCE, bArr, 0, bArr.length, s0.getEmptyRegistry());
        f1.e(f1VarP);
        return (l) f1VarP;
    }

    public static l parseFrom(byte[] bArr, s0 s0Var) throws u1 {
        f1 f1VarP = f1.p(DEFAULT_INSTANCE, bArr, 0, bArr.length, s0Var);
        f1.e(f1VarP);
        return (l) f1VarP;
    }

    public static l parseFrom(InputStream inputStream) throws IOException {
        f1 f1VarO = f1.o(DEFAULT_INSTANCE, c0.newInstance(inputStream), s0.getEmptyRegistry());
        f1.e(f1VarO);
        return (l) f1VarO;
    }

    public static l parseFrom(InputStream inputStream, s0 s0Var) throws IOException {
        f1 f1VarO = f1.o(DEFAULT_INSTANCE, c0.newInstance(inputStream), s0Var);
        f1.e(f1VarO);
        return (l) f1VarO;
    }

    public static l parseFrom(c0 c0Var) throws IOException {
        f1 f1VarO = f1.o(DEFAULT_INSTANCE, c0Var, s0.getEmptyRegistry());
        f1.e(f1VarO);
        return (l) f1VarO;
    }

    public static l parseFrom(c0 c0Var, s0 s0Var) throws IOException {
        f1 f1VarO = f1.o(DEFAULT_INSTANCE, c0Var, s0Var);
        f1.e(f1VarO);
        return (l) f1VarO;
    }
}
