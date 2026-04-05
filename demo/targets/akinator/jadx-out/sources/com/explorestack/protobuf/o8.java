package com.explorestack.protobuf;

import com.unity3d.services.core.fid.Constants;
import java.nio.charset.Charset;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class o8 implements va {

    /* renamed from: b, reason: collision with root package name */
    public static final m8 f22436b = new m8();

    /* renamed from: a, reason: collision with root package name */
    public final n8 f22437a;

    public o8() {
        i9 i9Var;
        f6 f6Var = f6.getInstance();
        try {
            q0 q0Var = q0.f22505a;
            i9Var = (i9) q0.class.getDeclaredMethod(Constants.GET_INSTANCE, null).invoke(null, null);
        } catch (Exception unused) {
            i9Var = f22436b;
        }
        n8 n8Var = new n8();
        n8Var.f22404a = new i9[]{f6Var, i9Var};
        Charset charset = x7.f22881a;
        this.f22437a = n8Var;
    }

    @Override // com.explorestack.protobuf.va
    public <T> ua createSchema(Class<T> cls) {
        wa.requireGeneratedMessage(cls);
        mb mbVar = (mb) this.f22437a.messageInfoFor(cls);
        if (mbVar.isMessageSetWireFormat()) {
            if (h6.class.isAssignableFrom(cls)) {
                return new s9(wa.unknownFieldSetLiteSchema(), q5.f22522a, mbVar.getDefaultInstance());
            }
            bc bcVarProto2UnknownFieldSetSchema = wa.proto2UnknownFieldSetSchema();
            n5 n5Var = q5.f22523b;
            if (n5Var != null) {
                return new s9(bcVarProto2UnknownFieldSetSchema, n5Var, mbVar.getDefaultInstance());
            }
            throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
        }
        boolean zIsAssignableFrom = h6.class.isAssignableFrom(cls);
        ha haVar = ha.f22204b;
        if (zIsAssignableFrom) {
            return mbVar.getSyntax() == haVar ? r9.n(mbVar, x9.f22888b, j8.f22279b, wa.unknownFieldSetLiteSchema(), q5.f22522a, g9.f22165b) : r9.n(mbVar, x9.f22888b, j8.f22279b, wa.unknownFieldSetLiteSchema(), null, g9.f22165b);
        }
        if (mbVar.getSyntax() != haVar) {
            return r9.n(mbVar, x9.f22887a, j8.f22278a, wa.proto3UnknownFieldSetSchema(), null, g9.f22164a);
        }
        u9 u9Var = x9.f22887a;
        h8 h8Var = j8.f22278a;
        bc bcVarProto2UnknownFieldSetSchema2 = wa.proto2UnknownFieldSetSchema();
        n5 n5Var2 = q5.f22523b;
        if (n5Var2 != null) {
            return r9.n(mbVar, u9Var, h8Var, bcVarProto2UnknownFieldSetSchema2, n5Var2, g9.f22164a);
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }
}
