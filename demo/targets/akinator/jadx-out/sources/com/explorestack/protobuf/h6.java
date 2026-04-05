package com.explorestack.protobuf;

import com.explorestack.protobuf.MessageLite;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class h6 extends b {

    /* renamed from: e, reason: collision with root package name */
    public static final ConcurrentHashMap f22196e = new ConcurrentHashMap();

    /* renamed from: b, reason: collision with root package name */
    public hc f22197b = hc.getDefaultInstance();

    /* renamed from: c, reason: collision with root package name */
    public int f22198c = -1;

    public static k6 b(f5 f5Var) {
        f5Var.getClass();
        if (f5Var instanceof e5) {
            throw new IllegalArgumentException("Expected a lite extension.");
        }
        return (k6) f5Var;
    }

    public static h6 d(Class cls) throws ClassNotFoundException {
        ConcurrentHashMap concurrentHashMap = f22196e;
        h6 h6Var = (h6) concurrentHashMap.get(cls);
        if (h6Var == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                h6Var = (h6) concurrentHashMap.get(cls);
            } catch (ClassNotFoundException e10) {
                throw new IllegalStateException("Class initialization cannot fail.", e10);
            }
        }
        if (h6Var != null) {
            return h6Var;
        }
        h6 defaultInstanceForType = ((h6) sc.c(cls)).getDefaultInstanceForType();
        if (defaultInstanceForType == null) {
            throw new IllegalStateException();
        }
        concurrentHashMap.put(cls, defaultInstanceForType);
        return defaultInstanceForType;
    }

    public static Object e(Method method, h6 h6Var, Object... objArr) {
        try {
            return method.invoke(h6Var, objArr);
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

    public static <ContainingType extends MessageLite, Type> k6 newRepeatedGeneratedExtension(ContainingType containingtype, MessageLite messageLite, p7 p7Var, int i10, bd bdVar, boolean z10, Class cls) {
        return new k6(containingtype, Collections.EMPTY_LIST, messageLite, new j6(p7Var, i10, bdVar, true, z10));
    }

    public static <ContainingType extends MessageLite, Type> k6 newSingularGeneratedExtension(ContainingType containingtype, Type type, MessageLite messageLite, p7 p7Var, int i10, bd bdVar, Class cls) {
        return new k6(containingtype, type, messageLite, new j6(p7Var, i10, bdVar, false, false));
    }

    public abstract Object c();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return ia.getInstance().schemaFor((ia) this).equals(this, (h6) obj);
        }
        return false;
    }

    @Override // com.explorestack.protobuf.b
    public final int getMemoizedSerializedSize() {
        return this.f22198c;
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public final fa getParserForType() {
        return (fa) c();
    }

    @Override // com.explorestack.protobuf.MessageLite
    public int getSerializedSize() {
        if (this.f22198c == -1) {
            this.f22198c = ia.getInstance().schemaFor((ia) this).getSerializedSize(this);
        }
        return this.f22198c;
    }

    public int hashCode() {
        int i10 = this.memoizedHashCode;
        if (i10 != 0) {
            return i10;
        }
        int iHashCode = ia.getInstance().schemaFor((ia) this).hashCode(this);
        this.memoizedHashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.explorestack.protobuf.b, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    public final boolean isInitialized() {
        byte bByteValue = ((Byte) c()).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        boolean zIsInitialized = ia.getInstance().schemaFor((ia) this).isInitialized(this);
        c();
        return zIsInitialized;
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public /* bridge */ /* synthetic */ MessageLite.Builder newBuilderForType() {
        newBuilderForType();
        return null;
    }

    @Override // com.explorestack.protobuf.b
    public final void setMemoizedSerializedSize(int i10) {
        this.f22198c = i10;
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public /* bridge */ /* synthetic */ MessageLite.Builder toBuilder() {
        toBuilder();
        return null;
    }

    public String toString() {
        String string = super.toString();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("# ");
        sb2.append(string);
        k9.c(this, sb2, 0);
        return sb2.toString();
    }

    @Override // com.explorestack.protobuf.MessageLite
    public void writeTo(h0 h0Var) throws IOException {
        ia.getInstance().schemaFor((ia) this).writeTo(this, i0.forCodedOutput(h0Var));
    }

    @Override // com.explorestack.protobuf.b, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
    public final h6 getDefaultInstanceForType() {
        return (h6) c();
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public final g6 newBuilderForType() {
        if (c() == null) {
            return null;
        }
        throw new ClassCastException();
    }

    @Override // com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
    public final g6 toBuilder() {
        c().getClass();
        throw new ClassCastException();
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static abstract class a extends h6 implements i6 {

        /* renamed from: f, reason: collision with root package name */
        public b6 f22199f = b6.emptySet();

        public final void f(k6 k6Var) {
            if (k6Var.getContainingTypeDefaultInstance() != getDefaultInstanceForType()) {
                throw new IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
            }
        }

        @Override // com.explorestack.protobuf.h6, com.explorestack.protobuf.b, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.j9, com.explorestack.protobuf.Message, com.explorestack.protobuf.MessageOrBuilder
        public /* bridge */ /* synthetic */ MessageLite getDefaultInstanceForType() {
            return getDefaultInstanceForType();
        }

        /* JADX WARN: Type inference failed for: r1v2, types: [Type, java.util.ArrayList] */
        @Override // com.explorestack.protobuf.i6
        public final <Type> Type getExtension(f5 f5Var) {
            k6 k6VarB = h6.b(f5Var);
            f(k6VarB);
            b6 b6Var = this.f22199f;
            j6 j6Var = k6VarB.f22311d;
            Type type = (Type) b6Var.getField(j6Var);
            if (type == null) {
                return (Type) k6VarB.f22309b;
            }
            if (!j6Var.isRepeated()) {
                return (Type) k6VarB.a(type);
            }
            if (j6Var.getLiteJavaType() != cd.ENUM) {
                return type;
            }
            ?? r12 = (Type) new ArrayList();
            Iterator it = ((List) type).iterator();
            while (it.hasNext()) {
                r12.add(k6VarB.a(it.next()));
            }
            return r12;
        }

        @Override // com.explorestack.protobuf.i6
        public final <Type> int getExtensionCount(f5 f5Var) {
            k6 k6VarB = h6.b(f5Var);
            f(k6VarB);
            return this.f22199f.getRepeatedFieldCount(k6VarB.f22311d);
        }

        @Override // com.explorestack.protobuf.i6
        public final <Type> boolean hasExtension(f5 f5Var) {
            k6 k6VarB = h6.b(f5Var);
            f(k6VarB);
            return this.f22199f.hasField(k6VarB.f22311d);
        }

        @Override // com.explorestack.protobuf.h6, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public /* bridge */ /* synthetic */ MessageLite.Builder newBuilderForType() {
            newBuilderForType();
            return null;
        }

        @Override // com.explorestack.protobuf.h6, com.explorestack.protobuf.MessageLite, com.explorestack.protobuf.Message
        public /* bridge */ /* synthetic */ MessageLite.Builder toBuilder() {
            toBuilder();
            return null;
        }

        @Override // com.explorestack.protobuf.i6
        public final <Type> Type getExtension(f5 f5Var, int i10) {
            k6 k6VarB = h6.b(f5Var);
            f(k6VarB);
            return (Type) k6VarB.a(this.f22199f.getRepeatedField(k6VarB.f22311d, i10));
        }
    }
}
