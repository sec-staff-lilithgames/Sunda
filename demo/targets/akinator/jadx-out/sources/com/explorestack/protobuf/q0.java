package com.explorestack.protobuf;

import com.explorestack.protobuf.Descriptors;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.HashSet;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class q0 implements i9 {

    /* renamed from: a, reason: collision with root package name */
    public static final q0 f22505a = new q0();

    /* renamed from: b, reason: collision with root package name */
    public static final HashSet f22506b = new HashSet(Arrays.asList("cached_size", "serialized_size", "class"));

    /* renamed from: c, reason: collision with root package name */
    public static final o0 f22507c = new o0();

    public static x5 a(Class cls, Descriptors.FieldDescriptor fieldDescriptor, p0 p0Var, boolean z10, j0 j0Var) {
        aa aaVar;
        Class<?> returnType;
        Descriptors.OneofDescriptor containingOneof = fieldDescriptor.getContainingOneof();
        int index = containingOneof.getIndex();
        aa[] aaVarArr = p0Var.f22464a;
        if (index >= aaVarArr.length) {
            p0Var.f22464a = (aa[]) Arrays.copyOf(aaVarArr, index * 2);
        }
        aa aaVar2 = p0Var.f22464a[index];
        if (aaVar2 == null) {
            String strI = i(containingOneof.getName());
            aa aaVar3 = new aa(containingOneof.getIndex(), d(cls, j1.o2.l(strI, "Case_")), d(cls, j1.o2.l(strI, "_")));
            p0Var.f22464a[index] = aaVar3;
            aaVar = aaVar3;
        } else {
            aaVar = aaVar2;
        }
        c6 c6VarF = f(fieldDescriptor);
        switch (c6VarF.getJavaType().ordinal()) {
            case 1:
            case 8:
                returnType = Integer.class;
                break;
            case 2:
                returnType = Long.class;
                break;
            case 3:
                returnType = Float.class;
                break;
            case 4:
                returnType = Double.class;
                break;
            case 5:
                returnType = Boolean.class;
                break;
            case 6:
                returnType = String.class;
                break;
            case 7:
                returnType = ByteString.class;
                break;
            case 9:
                try {
                    returnType = cls.getDeclaredMethod(h(fieldDescriptor.getType() == Descriptors.FieldDescriptor.Type.GROUP ? fieldDescriptor.getMessageType().getName() : fieldDescriptor.getName()), null).getReturnType();
                    break;
                } catch (Exception e10) {
                    throw new RuntimeException(e10);
                }
            default:
                throw new IllegalArgumentException("Invalid type for oneof: " + c6VarF);
        }
        return x5.forOneofMemberField(fieldDescriptor.getNumber(), c6VarF, aaVar, returnType, z10, j0Var);
    }

    public static Field b(Descriptors.FieldDescriptor fieldDescriptor, Class cls) {
        return d(cls, i(fieldDescriptor.getName()) + "MemoizedSerializedSize");
    }

    public static Field c(Descriptors.FieldDescriptor fieldDescriptor, Class cls) {
        String name = fieldDescriptor.getType() == Descriptors.FieldDescriptor.Type.GROUP ? fieldDescriptor.getMessageType().getName() : fieldDescriptor.getName();
        return d(cls, i(name) + (f22506b.contains(name) ? "__" : "_"));
    }

    public static Field d(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Exception unused) {
            StringBuilder sbO = e3.g.o("Unable to find field ", str, " in message class ");
            sbO.append(cls.getName());
            throw new IllegalArgumentException(sbO.toString());
        }
    }

    public static Message e(Class cls) {
        try {
            return (Message) cls.getDeclaredMethod("getDefaultInstance", null).invoke(null, null);
        } catch (Exception e10) {
            throw new IllegalArgumentException("Unable to get default instance for message class ".concat(cls.getName()), e10);
        }
    }

    public static c6 f(Descriptors.FieldDescriptor fieldDescriptor) {
        switch (l0.f22323c[fieldDescriptor.getType().ordinal()]) {
            case 1:
                return !fieldDescriptor.isRepeated() ? c6.f22003o : fieldDescriptor.isPacked() ? c6.X : c6.G;
            case 2:
                return fieldDescriptor.isRepeated() ? c6.J : c6.f22006r;
            case 3:
                return !fieldDescriptor.isRepeated() ? c6.f21994h : fieldDescriptor.isPacked() ? c6.Q : c6.f22014z;
            case 4:
                return !fieldDescriptor.isRepeated() ? c6.f22008t : fieldDescriptor.isPacked() ? c6.Z : c6.L;
            case 5:
                return !fieldDescriptor.isRepeated() ? c6.f22002n : fieldDescriptor.isPacked() ? c6.W : c6.F;
            case 6:
                return !fieldDescriptor.isRepeated() ? c6.f22001m : fieldDescriptor.isPacked() ? c6.V : c6.E;
            case 7:
                return !fieldDescriptor.isRepeated() ? c6.f21996i : fieldDescriptor.isPacked() ? c6.R : c6.A;
            case 8:
                return fieldDescriptor.isRepeated() ? c6.f21991e0 : c6.f22013y;
            case 9:
                return !fieldDescriptor.isRepeated() ? c6.f22000l : fieldDescriptor.isPacked() ? c6.U : c6.D;
            case 10:
                return !fieldDescriptor.isRepeated() ? c6.f21998j : fieldDescriptor.isPacked() ? c6.S : c6.B;
            case 11:
                return fieldDescriptor.isMapField() ? c6.f21992f0 : fieldDescriptor.isRepeated() ? c6.I : c6.f22005q;
            case 12:
                return !fieldDescriptor.isRepeated() ? c6.f22009u : fieldDescriptor.isPacked() ? c6.f21987a0 : c6.M;
            case 13:
                return !fieldDescriptor.isRepeated() ? c6.f22010v : fieldDescriptor.isPacked() ? c6.f21988b0 : c6.N;
            case 14:
                return !fieldDescriptor.isRepeated() ? c6.f22011w : fieldDescriptor.isPacked() ? c6.f21989c0 : c6.O;
            case 15:
                return !fieldDescriptor.isRepeated() ? c6.f22012x : fieldDescriptor.isPacked() ? c6.f21990d0 : c6.P;
            case 16:
                return fieldDescriptor.isRepeated() ? c6.H : c6.f22004p;
            case 17:
                return !fieldDescriptor.isRepeated() ? c6.f22007s : fieldDescriptor.isPacked() ? c6.Y : c6.K;
            case 18:
                return !fieldDescriptor.isRepeated() ? c6.f21999k : fieldDescriptor.isPacked() ? c6.T : c6.C;
            default:
                throw new IllegalArgumentException("Unsupported field type: " + fieldDescriptor.getType());
        }
    }

    public static Class g(Descriptors.FieldDescriptor fieldDescriptor, Class cls) {
        try {
            return cls.getDeclaredMethod(h(fieldDescriptor.getType() == Descriptors.FieldDescriptor.Type.GROUP ? fieldDescriptor.getMessageType().getName() : fieldDescriptor.getName()), Integer.TYPE).getReturnType();
        } catch (Exception e10) {
            throw new RuntimeException(e10);
        }
    }

    public static q0 getInstance() {
        return f22505a;
    }

    public static String h(String str) {
        String strI = i(str);
        return "get" + Character.toUpperCase(strI.charAt(0)) + strI.substring(1, strI.length());
    }

    public static String i(String str) {
        StringBuilder sb2 = new StringBuilder(str.length() + 1);
        boolean z10 = false;
        for (int i10 = 0; i10 < str.length(); i10++) {
            char cCharAt = str.charAt(i10);
            if (cCharAt == '_') {
                z10 = true;
            } else if (Character.isDigit(cCharAt)) {
                sb2.append(cCharAt);
                z10 = true;
            } else if (z10) {
                sb2.append(Character.toUpperCase(cCharAt));
                z10 = false;
            } else if (i10 == 0) {
                sb2.append(Character.toLowerCase(cCharAt));
            } else {
                sb2.append(cCharAt);
            }
        }
        return sb2.toString();
    }

    @Override // com.explorestack.protobuf.i9
    public boolean isSupported(Class<?> cls) {
        return k7.class.isAssignableFrom(cls);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:80:0x025f  */
    @Override // com.explorestack.protobuf.i9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.explorestack.protobuf.h9 messageInfoFor(java.lang.Class<?> r19) {
        /*
            Method dump skipped, instructions count: 673
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.explorestack.protobuf.q0.messageInfoFor(java.lang.Class):com.explorestack.protobuf.h9");
    }
}
