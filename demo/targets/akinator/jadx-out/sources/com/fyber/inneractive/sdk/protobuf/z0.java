package com.fyber.inneractive.sdk.protobuf;

import com.bytedance.adsdk.jd.jpo.jd.zwdd.OcvDtWCQ;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class z0 extends b {
    private static Map<Object, z0> defaultInstanceMap = new ConcurrentHashMap();
    protected n3 unknownFields = n3.f26442f;
    protected int memoizedSerializedSize = -1;

    public static z0 a(z0 z0Var) throws n1 {
        if (z0Var == null || z0Var.isInitialized()) {
            return z0Var;
        }
        m3 m3VarNewUninitializedMessageException = z0Var.newUninitializedMessageException();
        m3VarNewUninitializedMessageException.getClass();
        throw new n1(m3VarNewUninitializedMessageException.getMessage());
    }

    public static x0 access$000(e0 e0Var) {
        e0Var.getClass();
        return (x0) e0Var;
    }

    public static b1 emptyBooleanList() {
        return j.f26416d;
    }

    public static c1 emptyDoubleList() {
        return d0.f26362d;
    }

    public static f1 emptyFloatList() {
        return q0.f26457d;
    }

    public static g1 emptyIntList() {
        return a1.f26341d;
    }

    public static j1 emptyLongList() {
        return u1.f26495d;
    }

    public static <E> k1 emptyProtobufList() {
        return q2.f26460d;
    }

    public static <T extends z0> T getDefaultInstance(Class<T> cls) throws ClassNotFoundException {
        T t10 = (T) defaultInstanceMap.get(cls);
        if (t10 == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                t10 = (T) defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e10) {
                throw new IllegalStateException("Class initialization cannot fail.", e10);
            }
        }
        if (t10 != null) {
            return t10;
        }
        try {
            T t11 = (T) ((z0) x3.f26535a.allocateInstance(cls)).getDefaultInstanceForType();
            if (t11 == null) {
                throw new IllegalStateException();
            }
            defaultInstanceMap.put(cls, t11);
            return t11;
        } catch (Throwable th2) {
            throw new IllegalStateException(th2);
        }
    }

    public static Method getMethodOrDie(Class cls, String str, Class... clsArr) {
        try {
            return cls.getMethod(str, clsArr);
        } catch (NoSuchMethodException e10) {
            throw new RuntimeException("Generated message class \"" + cls.getName() + "\" missing method \"" + str + "\".", e10);
        }
    }

    public static g1 mutableCopy(g1 g1Var) {
        a1 a1Var = (a1) g1Var;
        int i10 = a1Var.f26343c;
        return a1Var.b(i10 == 0 ? 10 : i10 * 2);
    }

    public static Object newMessageInfo(d2 d2Var, String str, Object[] objArr) {
        return new r2(d2Var, str, objArr);
    }

    public static <ContainingType extends d2, Type> x0 newRepeatedGeneratedExtension(ContainingType containingtype, d2 d2Var, e1 e1Var, int i10, j4 j4Var, boolean z10, Class cls) {
        return new x0(containingtype, Collections.EMPTY_LIST, d2Var, new w0(e1Var, i10, j4Var, true, z10));
    }

    public static <ContainingType extends d2, Type> x0 newSingularGeneratedExtension(ContainingType containingtype, Type type, d2 d2Var, e1 e1Var, int i10, j4 j4Var, Class cls) {
        return new x0(containingtype, type, d2Var, new w0(e1Var, i10, j4Var, false, false));
    }

    public static <T extends z0> T parseDelimitedFrom(T t10, InputStream inputStream) throws n1 {
        return (T) a(a(t10, inputStream, h0.a()));
    }

    public static <T extends z0> T parseFrom(T t10, InputStream inputStream) throws n1 {
        w uVar;
        if (inputStream == null) {
            byte[] bArr = l1.f26430b;
            int length = bArr.length;
            uVar = new t(bArr, 0, length, false);
            try {
                uVar.d(length);
            } catch (n1 e10) {
                throw new IllegalArgumentException(e10);
            }
        } else {
            uVar = new u(inputStream);
        }
        return (T) a(parsePartialFrom(t10, uVar, h0.a()));
    }

    public static <T extends z0> T parsePartialFrom(T t10, w wVar, h0 h0Var) throws n1 {
        T t11 = (T) t10.dynamicMethod(y0.NEW_MUTABLE_INSTANCE);
        try {
            p2 p2Var = p2.f26452c;
            p2Var.getClass();
            t2 t2VarA = p2Var.a(t11.getClass());
            x xVar = wVar.f26513d;
            if (xVar == null) {
                xVar = new x(wVar);
            }
            t2VarA.a(t11, xVar, h0Var);
            t2VarA.c(t11);
            return t11;
        } catch (IOException e10) {
            if (e10.getCause() instanceof n1) {
                throw ((n1) e10.getCause());
            }
            throw new n1(e10.getMessage());
        } catch (RuntimeException e11) {
            if (e11.getCause() instanceof n1) {
                throw ((n1) e11.getCause());
            }
            throw e11;
        }
    }

    public static <T extends z0> void registerDefaultInstance(Class<T> cls, T t10) {
        defaultInstanceMap.put(cls, t10);
    }

    public Object buildMessageInfo() throws Exception {
        return dynamicMethod(y0.BUILD_MESSAGE_INFO);
    }

    public final <MessageType extends z0, BuilderType extends t0> BuilderType createBuilder() {
        return (BuilderType) dynamicMethod(y0.NEW_BUILDER);
    }

    public Object dynamicMethod(y0 y0Var, Object obj) {
        return dynamicMethod(y0Var, obj, null);
    }

    public abstract Object dynamicMethod(y0 y0Var, Object obj, Object obj2);

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        p2 p2Var = p2.f26452c;
        p2Var.getClass();
        return p2Var.a(getClass()).b(this, (z0) obj);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.b
    public int getMemoizedSerializedSize() {
        return this.memoizedSerializedSize;
    }

    public final m2 getParserForType() {
        return (m2) dynamicMethod(y0.GET_PARSER);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.d2
    public int getSerializedSize() {
        if (this.memoizedSerializedSize == -1) {
            p2 p2Var = p2.f26452c;
            p2Var.getClass();
            this.memoizedSerializedSize = p2Var.a(getClass()).b(this);
        }
        return this.memoizedSerializedSize;
    }

    public int hashCode() {
        int i10 = this.memoizedHashCode;
        if (i10 != 0) {
            return i10;
        }
        p2 p2Var = p2.f26452c;
        p2Var.getClass();
        int iD = p2Var.a(getClass()).d(this);
        this.memoizedHashCode = iD;
        return iD;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.e2
    public final boolean isInitialized() {
        return isInitialized(this, true);
    }

    public void makeImmutable() {
        p2 p2Var = p2.f26452c;
        p2Var.getClass();
        p2Var.a(getClass()).c(this);
    }

    public void mergeLengthDelimitedField(int i10, s sVar) {
        if (this.unknownFields == n3.f26442f) {
            this.unknownFields = new n3();
        }
        n3 n3Var = this.unknownFields;
        if (!n3Var.f26447e) {
            throw new UnsupportedOperationException();
        }
        if (i10 == 0) {
            throw new IllegalArgumentException("Zero is not a valid field number.");
        }
        n3Var.a((i10 << 3) | 2, sVar);
    }

    public final void mergeUnknownFields(n3 n3Var) {
        this.unknownFields = n3.a(this.unknownFields, n3Var);
    }

    public void mergeVarintField(int i10, int i11) {
        if (this.unknownFields == n3.f26442f) {
            this.unknownFields = new n3();
        }
        n3 n3Var = this.unknownFields;
        if (!n3Var.f26447e) {
            throw new UnsupportedOperationException();
        }
        if (i10 == 0) {
            throw new IllegalArgumentException("Zero is not a valid field number.");
        }
        n3Var.a(i10 << 3, Long.valueOf(i11));
    }

    public boolean parseUnknownField(int i10, w wVar) throws IOException {
        if ((i10 & 7) == 4) {
            return false;
        }
        if (this.unknownFields == n3.f26442f) {
            this.unknownFields = new n3();
        }
        return this.unknownFields.a(i10, wVar);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.b
    public void setMemoizedSerializedSize(int i10) {
        this.memoizedSerializedSize = i10;
    }

    public String toString() {
        String string = super.toString();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("# ");
        sb2.append(string);
        f2.a(this, sb2, 0);
        return sb2.toString();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.d2
    public void writeTo(b0 b0Var) throws IOException {
        p2 p2Var = p2.f26452c;
        p2Var.getClass();
        t2 t2VarA = p2Var.a(getClass());
        c0 c0Var = b0Var.f26350a;
        if (c0Var == null) {
            c0Var = new c0(b0Var);
        }
        t2VarA.a((Object) this, c0Var);
    }

    public static final <T extends z0> boolean isInitialized(T t10, boolean z10) {
        byte bByteValue = ((Byte) t10.dynamicMethod(y0.GET_MEMOIZED_IS_INITIALIZED)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        p2 p2Var = p2.f26452c;
        p2Var.getClass();
        boolean zA = p2Var.a(t10.getClass()).a(t10);
        if (z10) {
            t10.dynamicMethod(y0.SET_MEMOIZED_IS_INITIALIZED, zA ? t10 : null);
        }
        return zA;
    }

    public final <MessageType extends z0, BuilderType extends t0> BuilderType createBuilder(MessageType messagetype) {
        BuilderType buildertype = (BuilderType) createBuilder();
        buildertype.c();
        t0.a(buildertype.f26483b, messagetype);
        return buildertype;
    }

    public Object dynamicMethod(y0 y0Var) {
        return dynamicMethod(y0Var, null, null);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.e2
    public final z0 getDefaultInstanceForType() {
        return (z0) dynamicMethod(y0.GET_DEFAULT_INSTANCE);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.d2
    public final t0 newBuilderForType() {
        return (t0) dynamicMethod(y0.NEW_BUILDER);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.d2
    public final t0 toBuilder() {
        t0 t0Var = (t0) dynamicMethod(y0.NEW_BUILDER);
        t0Var.c();
        t0.a(t0Var.f26483b, this);
        return t0Var;
    }

    public static Object invokeOrDie(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e10) {
            throw new RuntimeException(OcvDtWCQ.XwirE, e10);
        } catch (InvocationTargetException e11) {
            Throwable cause = e11.getCause();
            if (!(cause instanceof RuntimeException)) {
                if (cause instanceof Error) {
                    throw ((Error) cause);
                }
                throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
            }
            throw ((RuntimeException) cause);
        }
    }

    public static j1 mutableCopy(j1 j1Var) {
        u1 u1Var = (u1) j1Var;
        int i10 = u1Var.f26497c;
        return u1Var.b(i10 == 0 ? 10 : i10 * 2);
    }

    public static <T extends z0> T parseDelimitedFrom(T t10, InputStream inputStream, h0 h0Var) throws n1 {
        return (T) a(a(t10, inputStream, h0Var));
    }

    public static z0 a(z0 z0Var, InputStream inputStream, h0 h0Var) throws IOException {
        try {
            int i10 = inputStream.read();
            if (i10 == -1) {
                return null;
            }
            if ((i10 & 128) != 0) {
                i10 &= 127;
                int i11 = 7;
                while (true) {
                    if (i11 < 32) {
                        int i12 = inputStream.read();
                        if (i12 == -1) {
                            throw new n1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                        }
                        i10 |= (i12 & 127) << i11;
                        if ((i12 & 128) == 0) {
                            break;
                        }
                        i11 += 7;
                    } else {
                        while (i11 < 64) {
                            int i13 = inputStream.read();
                            if (i13 == -1) {
                                throw new n1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                            }
                            if ((i13 & 128) != 0) {
                                i11 += 7;
                            }
                        }
                        throw new n1("CodedInputStream encountered a malformed varint.");
                    }
                }
            }
            u uVar = new u(new a(inputStream, i10));
            z0 partialFrom = parsePartialFrom(z0Var, uVar, h0Var);
            uVar.a(0);
            return partialFrom;
        } catch (IOException e10) {
            throw new n1(e10.getMessage());
        }
    }

    public static f1 mutableCopy(f1 f1Var) {
        q0 q0Var = (q0) f1Var;
        int i10 = q0Var.f26459c;
        return q0Var.b(i10 == 0 ? 10 : i10 * 2);
    }

    public static c1 mutableCopy(c1 c1Var) {
        d0 d0Var = (d0) c1Var;
        int i10 = d0Var.f26364c;
        return d0Var.b(i10 == 0 ? 10 : i10 * 2);
    }

    public static <T extends z0> T parseFrom(T t10, InputStream inputStream, h0 h0Var) throws n1 {
        w uVar;
        if (inputStream == null) {
            byte[] bArr = l1.f26430b;
            int length = bArr.length;
            uVar = new t(bArr, 0, length, false);
            try {
                uVar.d(length);
            } catch (n1 e10) {
                throw new IllegalArgumentException(e10);
            }
        } else {
            uVar = new u(inputStream);
        }
        return (T) a(parsePartialFrom(t10, uVar, h0Var));
    }

    public static b1 mutableCopy(b1 b1Var) {
        j jVar = (j) b1Var;
        int i10 = jVar.f26418c;
        return jVar.b(i10 == 0 ? 10 : i10 * 2);
    }

    public static <T extends z0> T parsePartialFrom(T t10, byte[] bArr, int i10, int i11, h0 h0Var) throws n1 {
        T t11 = (T) t10.dynamicMethod(y0.NEW_MUTABLE_INSTANCE);
        try {
            p2 p2Var = p2.f26452c;
            p2Var.getClass();
            t2 t2VarA = p2Var.a(t11.getClass());
            t2VarA.a(t11, bArr, i10, i10 + i11, new f(h0Var));
            t2VarA.c(t11);
            if (t11.memoizedHashCode == 0) {
                return t11;
            }
            throw new RuntimeException();
        } catch (IOException e10) {
            if (e10.getCause() instanceof n1) {
                throw ((n1) e10.getCause());
            }
            throw new n1(e10.getMessage());
        } catch (IndexOutOfBoundsException unused) {
            throw new n1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }

    public static <E> k1 mutableCopy(k1 k1Var) {
        int size = k1Var.size();
        return k1Var.b(size == 0 ? 10 : size * 2);
    }

    public static <T extends z0> T parseFrom(T t10, ByteBuffer byteBuffer, h0 h0Var) throws n1 {
        t tVar;
        w vVar;
        if (byteBuffer.hasArray()) {
            byte[] bArrArray = byteBuffer.array();
            int iPosition = byteBuffer.position() + byteBuffer.arrayOffset();
            int iRemaining = byteBuffer.remaining();
            tVar = new t(bArrArray, iPosition, iRemaining, false);
            try {
                tVar.d(iRemaining);
            } catch (n1 e10) {
                throw new IllegalArgumentException(e10);
            }
        } else {
            if (byteBuffer.isDirect() && x3.f26538d) {
                vVar = new v(byteBuffer, false);
                return (T) a(parseFrom(t10, vVar, h0Var));
            }
            int iRemaining2 = byteBuffer.remaining();
            byte[] bArr = new byte[iRemaining2];
            byteBuffer.duplicate().get(bArr);
            t tVar2 = new t(bArr, 0, iRemaining2, true);
            try {
                tVar2.d(iRemaining2);
                tVar = tVar2;
            } catch (n1 e11) {
                throw new IllegalArgumentException(e11);
            }
        }
        vVar = tVar;
        return (T) a(parseFrom(t10, vVar, h0Var));
    }

    public static <T extends z0> T parsePartialFrom(T t10, w wVar) throws n1 {
        return (T) parsePartialFrom(t10, wVar, h0.a());
    }

    public static <T extends z0> T parseFrom(T t10, ByteBuffer byteBuffer) throws n1 {
        return (T) parseFrom(t10, byteBuffer, h0.a());
    }

    public static <T extends z0> T parseFrom(T t10, s sVar) throws n1 {
        return (T) a(parseFrom(t10, sVar, h0.a()));
    }

    public static <T extends z0> T parseFrom(T t10, s sVar, h0 h0Var) throws n1 {
        w wVarD = sVar.d();
        z0 partialFrom = parsePartialFrom(t10, wVarD, h0Var);
        wVarD.a(0);
        return (T) a(partialFrom);
    }

    public static <T extends z0> T parseFrom(T t10, byte[] bArr) throws n1 {
        return (T) a(parsePartialFrom(t10, bArr, 0, bArr.length, h0.a()));
    }

    public static <T extends z0> T parseFrom(T t10, byte[] bArr, h0 h0Var) throws n1 {
        return (T) a(parsePartialFrom(t10, bArr, 0, bArr.length, h0Var));
    }

    public static <T extends z0> T parseFrom(T t10, w wVar) throws n1 {
        return (T) parseFrom(t10, wVar, h0.a());
    }

    public static <T extends z0> T parseFrom(T t10, w wVar, h0 h0Var) throws n1 {
        return (T) a(parsePartialFrom(t10, wVar, h0Var));
    }
}
