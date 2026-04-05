package androidx.datastore.preferences.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class f1 extends androidx.datastore.preferences.protobuf.b {
    private static final int MEMOIZED_SERIALIZED_SIZE_MASK = Integer.MAX_VALUE;
    private static final int MUTABLE_FLAG_MASK = Integer.MIN_VALUE;
    static final int UNINITIALIZED_HASH_CODE = 0;
    static final int UNINITIALIZED_SERIALIZED_SIZE = Integer.MAX_VALUE;
    private static Map<Object, f1> defaultInstanceMap = new ConcurrentHashMap();
    private int memoizedSerializedSize = -1;
    protected c4 unknownFields = c4.getDefaultInstance();

    public static void e(f1 f1Var) throws u1 {
        if (f1Var != null && !f1Var.isInitialized()) {
            throw new a4(f1Var).asInvalidProtocolBufferException().setUnfinishedMessage(f1Var);
        }
    }

    public static f1 g(Class cls) throws ClassNotFoundException {
        f1 f1Var = defaultInstanceMap.get(cls);
        if (f1Var == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                f1Var = defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e10) {
                throw new IllegalStateException("Class initialization cannot fail.", e10);
            }
        }
        if (f1Var != null) {
            return f1Var;
        }
        f1 defaultInstanceForType = ((f1) j4.c(cls)).getDefaultInstanceForType();
        if (defaultInstanceForType == null) {
            throw new IllegalStateException();
        }
        defaultInstanceMap.put(cls, defaultInstanceForType);
        return defaultInstanceForType;
    }

    public static Object h(Method method, f1 f1Var, Object... objArr) {
        try {
            return method.invoke(f1Var, objArr);
        } catch (IllegalAccessException e10) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e10);
        } catch (InvocationTargetException e11) {
            Throwable cause = e11.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    public static final boolean i(f1 f1Var, boolean z10) {
        byte bByteValue = ((Byte) f1Var.f(1)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        boolean zIsInitialized = d3.getInstance().schemaFor((d3) f1Var).isInitialized(f1Var);
        if (z10) {
            f1Var.f(2);
        }
        return zIsInitialized;
    }

    public static f1 m(f1 f1Var, x xVar, s0 s0Var) throws u1 {
        c0 c0VarNewCodedInput = xVar.newCodedInput();
        f1 f1VarO = o(f1Var, c0VarNewCodedInput, s0Var);
        try {
            c0VarNewCodedInput.checkLastTagWas(0);
            e(f1VarO);
            return f1VarO;
        } catch (u1 e10) {
            throw e10.setUnfinishedMessage(f1VarO);
        }
    }

    public static f1 n(f1 f1Var, InputStream inputStream, s0 s0Var) throws IOException {
        try {
            int i10 = inputStream.read();
            if (i10 == -1) {
                return null;
            }
            c0 c0VarNewInstance = c0.newInstance(new androidx.datastore.preferences.protobuf.a(inputStream, c0.readRawVarint32(i10, inputStream)));
            f1 f1VarO = o(f1Var, c0VarNewInstance, s0Var);
            try {
                c0VarNewInstance.checkLastTagWas(0);
                return f1VarO;
            } catch (u1 e10) {
                throw e10.setUnfinishedMessage(f1VarO);
            }
        } catch (u1 e11) {
            if (e11.f6017c) {
                throw new u1((IOException) e11);
            }
            throw e11;
        } catch (IOException e12) {
            throw new u1(e12);
        }
    }

    public static <ContainingType extends r2, Type> i1 newRepeatedGeneratedExtension(ContainingType containingtype, r2 r2Var, n1 n1Var, int i10, r4 r4Var, boolean z10, Class cls) {
        return new i1(containingtype, Collections.EMPTY_LIST, r2Var, new h1(i10, r4Var, true, z10));
    }

    public static <ContainingType extends r2, Type> i1 newSingularGeneratedExtension(ContainingType containingtype, Type type, r2 r2Var, n1 n1Var, int i10, r4 r4Var, Class cls) {
        return new i1(containingtype, type, r2Var, new h1(i10, r4Var, false, false));
    }

    public static f1 o(f1 f1Var, c0 c0Var, s0 s0Var) throws u1 {
        f1 f1VarL = f1Var.l();
        try {
            m3 m3VarSchemaFor = d3.getInstance().schemaFor((d3) f1VarL);
            m3VarSchemaFor.mergeFrom(f1VarL, d0.forCodedInput(c0Var), s0Var);
            m3VarSchemaFor.makeImmutable(f1VarL);
            return f1VarL;
        } catch (a4 e10) {
            throw e10.asInvalidProtocolBufferException().setUnfinishedMessage(f1VarL);
        } catch (u1 e11) {
            e = e11;
            if (e.f6017c) {
                e = new u1((IOException) e);
            }
            throw e.setUnfinishedMessage(f1VarL);
        } catch (IOException e12) {
            if (e12.getCause() instanceof u1) {
                throw ((u1) e12.getCause());
            }
            throw new u1(e12).setUnfinishedMessage(f1VarL);
        } catch (RuntimeException e13) {
            if (e13.getCause() instanceof u1) {
                throw ((u1) e13.getCause());
            }
            throw e13;
        }
    }

    public static f1 p(f1 f1Var, byte[] bArr, int i10, int i11, s0 s0Var) throws u1 {
        if (i11 == 0) {
            return f1Var;
        }
        f1 f1VarL = f1Var.l();
        try {
            m3 m3VarSchemaFor = d3.getInstance().schemaFor((d3) f1VarL);
            m3VarSchemaFor.mergeFrom(f1VarL, bArr, i10, i10 + i11, new f(s0Var));
            m3VarSchemaFor.makeImmutable(f1VarL);
            return f1VarL;
        } catch (a4 e10) {
            throw e10.asInvalidProtocolBufferException().setUnfinishedMessage(f1VarL);
        } catch (u1 e11) {
            u1 u1Var = e11;
            if (u1Var.f6017c) {
                u1Var = new u1((IOException) u1Var);
            }
            throw u1Var.setUnfinishedMessage(f1VarL);
        } catch (IOException e12) {
            if (e12.getCause() instanceof u1) {
                throw ((u1) e12.getCause());
            }
            throw new u1(e12).setUnfinishedMessage(f1VarL);
        } catch (IndexOutOfBoundsException unused) {
            throw u1.h().setUnfinishedMessage(f1VarL);
        }
    }

    public static void q(Class cls, f1 f1Var) {
        f1Var.k();
        defaultInstanceMap.put(cls, f1Var);
    }

    @Override // androidx.datastore.preferences.protobuf.b
    public final int a() {
        return this.memoizedSerializedSize & Integer.MAX_VALUE;
    }

    @Override // androidx.datastore.preferences.protobuf.b
    public final int b(m3 m3Var) {
        if (j()) {
            int serializedSize = m3Var == null ? d3.getInstance().schemaFor((d3) this).getSerializedSize(this) : m3Var.getSerializedSize(this);
            if (serializedSize >= 0) {
                return serializedSize;
            }
            throw new IllegalStateException(a.b.e(serializedSize, "serialized size must be non-negative, was "));
        }
        if (a() != Integer.MAX_VALUE) {
            return a();
        }
        int serializedSize2 = m3Var == null ? d3.getInstance().schemaFor((d3) this).getSerializedSize(this) : m3Var.getSerializedSize(this);
        d(serializedSize2);
        return serializedSize2;
    }

    @Override // androidx.datastore.preferences.protobuf.b
    public final void d(int i10) {
        if (i10 < 0) {
            throw new IllegalStateException(a.b.e(i10, "serialized size must be non-negative, was "));
        }
        this.memoizedSerializedSize = (i10 & Integer.MAX_VALUE) | (this.memoizedSerializedSize & Integer.MIN_VALUE);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return d3.getInstance().schemaFor((d3) this).equals(this, (f1) obj);
        }
        return false;
    }

    public abstract Object f(int i10);

    @Override // androidx.datastore.preferences.protobuf.b, androidx.datastore.preferences.protobuf.r2
    public final a3 getParserForType() {
        return (a3) f(7);
    }

    @Override // androidx.datastore.preferences.protobuf.b, androidx.datastore.preferences.protobuf.r2
    public int getSerializedSize() {
        return b(null);
    }

    public int hashCode() {
        if (j()) {
            return d3.getInstance().schemaFor((d3) this).hashCode(this);
        }
        if (this.memoizedHashCode == 0) {
            this.memoizedHashCode = d3.getInstance().schemaFor((d3) this).hashCode(this);
        }
        return this.memoizedHashCode;
    }

    @Override // androidx.datastore.preferences.protobuf.b, androidx.datastore.preferences.protobuf.r2, androidx.datastore.preferences.protobuf.s2
    public final boolean isInitialized() {
        return i(this, true);
    }

    public final boolean j() {
        return (this.memoizedSerializedSize & Integer.MIN_VALUE) != 0;
    }

    public final void k() {
        this.memoizedSerializedSize &= Integer.MAX_VALUE;
    }

    public final f1 l() {
        return (f1) f(4);
    }

    public String toString() {
        String string = super.toString();
        char[] cArr = t2.f6010a;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("# ");
        sb2.append(string);
        t2.c(this, sb2, 0);
        return sb2.toString();
    }

    @Override // androidx.datastore.preferences.protobuf.b, androidx.datastore.preferences.protobuf.r2
    public void writeTo(l0 l0Var) throws IOException {
        d3.getInstance().schemaFor((d3) this).writeTo(this, m0.forCodedOutput(l0Var));
    }

    @Override // androidx.datastore.preferences.protobuf.b, androidx.datastore.preferences.protobuf.r2, androidx.datastore.preferences.protobuf.s2
    public final f1 getDefaultInstanceForType() {
        return (f1) f(6);
    }

    @Override // androidx.datastore.preferences.protobuf.b, androidx.datastore.preferences.protobuf.r2
    public final e1 newBuilderForType() {
        return (e1) f(5);
    }

    @Override // androidx.datastore.preferences.protobuf.b, androidx.datastore.preferences.protobuf.r2
    public final e1 toBuilder() {
        return ((e1) f(5)).mergeFrom(this);
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class a extends c {

        /* renamed from: b, reason: collision with root package name */
        public final f1 f5877b;

        public a(f1 f1Var) {
            this.f5877b = f1Var;
        }

        @Override // androidx.datastore.preferences.protobuf.c, androidx.datastore.preferences.protobuf.a3
        public f1 parsePartialFrom(c0 c0Var, s0 s0Var) throws u1 {
            return f1.o(this.f5877b, c0Var, s0Var);
        }

        @Override // androidx.datastore.preferences.protobuf.c, androidx.datastore.preferences.protobuf.a3
        public f1 parsePartialFrom(byte[] bArr, int i10, int i11, s0 s0Var) throws u1 {
            return f1.p(this.f5877b, bArr, i10, i11, s0Var);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static abstract class b extends f1 implements g1 {
        protected a1 extensions = a1.emptySet();

        @Override // androidx.datastore.preferences.protobuf.f1, androidx.datastore.preferences.protobuf.b, androidx.datastore.preferences.protobuf.r2, androidx.datastore.preferences.protobuf.s2
        public /* bridge */ /* synthetic */ r2 getDefaultInstanceForType() {
            return getDefaultInstanceForType();
        }

        /* JADX WARN: Type inference failed for: r1v2, types: [Type, java.util.ArrayList] */
        @Override // androidx.datastore.preferences.protobuf.g1
        public final <Type> Type getExtension(o0 o0Var) {
            o0Var.getClass();
            i1 i1Var = (i1) o0Var;
            s(i1Var);
            a1 a1Var = this.extensions;
            h1 h1Var = i1Var.f5901d;
            Type type = (Type) a1Var.getField(h1Var);
            if (type == null) {
                return (Type) i1Var.f5899b;
            }
            if (!h1Var.isRepeated()) {
                i1Var.a(type);
                return type;
            }
            if (h1Var.getLiteJavaType() != s4.ENUM) {
                return type;
            }
            ?? r12 = (Type) new ArrayList();
            for (Object obj : (List) type) {
                i1Var.a(obj);
                r12.add(obj);
            }
            return r12;
        }

        @Override // androidx.datastore.preferences.protobuf.g1
        public final <Type> int getExtensionCount(o0 o0Var) {
            o0Var.getClass();
            i1 i1Var = (i1) o0Var;
            s(i1Var);
            return this.extensions.getRepeatedFieldCount(i1Var.f5901d);
        }

        @Override // androidx.datastore.preferences.protobuf.g1
        public final <Type> boolean hasExtension(o0 o0Var) {
            o0Var.getClass();
            i1 i1Var = (i1) o0Var;
            s(i1Var);
            return this.extensions.hasField(i1Var.f5901d);
        }

        @Override // androidx.datastore.preferences.protobuf.f1, androidx.datastore.preferences.protobuf.b, androidx.datastore.preferences.protobuf.r2
        public /* bridge */ /* synthetic */ q2 newBuilderForType() {
            return newBuilderForType();
        }

        public final a1 r() {
            if (this.extensions.isImmutable()) {
                this.extensions = this.extensions.m69clone();
            }
            return this.extensions;
        }

        public final void s(i1 i1Var) {
            if (i1Var.getContainingTypeDefaultInstance() != getDefaultInstanceForType()) {
                throw new IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
            }
        }

        @Override // androidx.datastore.preferences.protobuf.f1, androidx.datastore.preferences.protobuf.b, androidx.datastore.preferences.protobuf.r2
        public /* bridge */ /* synthetic */ q2 toBuilder() {
            return toBuilder();
        }

        @Override // androidx.datastore.preferences.protobuf.g1
        public final <Type> Type getExtension(o0 o0Var, int i10) {
            o0Var.getClass();
            i1 i1Var = (i1) o0Var;
            s(i1Var);
            Type type = (Type) this.extensions.getRepeatedField(i1Var.f5901d, i10);
            i1Var.a(type);
            return type;
        }
    }
}
