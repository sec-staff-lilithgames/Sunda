package androidx.datastore.preferences.protobuf;

import com.unity3d.services.core.fid.Constants;
import java.nio.charset.Charset;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class h2 implements n3 {

    /* renamed from: b, reason: collision with root package name */
    public static final f2 f5893b = new f2();

    /* renamed from: a, reason: collision with root package name */
    public final g2 f5894a;

    public h2() {
        p2 p2Var;
        d1 d1Var = d1.getInstance();
        d3 d3Var = d3.f5851c;
        try {
            p2Var = (p2) Class.forName("androidx.datastore.preferences.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod(Constants.GET_INSTANCE, null).invoke(null, null);
        } catch (Exception unused) {
            p2Var = f5893b;
        }
        g2 g2Var = new g2();
        g2Var.f5885a = new p2[]{d1Var, p2Var};
        Charset charset = t1.f6006a;
        this.f5894a = g2Var;
    }

    @Override // androidx.datastore.preferences.protobuf.n3
    public <T> m3 createSchema(Class<T> cls) {
        o3.requireGeneratedMessage(cls);
        o2 o2VarMessageInfoFor = this.f5894a.messageInfoFor(cls);
        if (o2VarMessageInfoFor.isMessageSetWireFormat()) {
            d3 d3Var = d3.f5851c;
            if (f1.class.isAssignableFrom(cls)) {
                return new v2(o3.unknownFieldSetLiteSchema(), v0.f6046a, o2VarMessageInfoFor.getDefaultInstance());
            }
            b4 b4VarUnknownFieldSetFullSchema = o3.unknownFieldSetFullSchema();
            t0 t0Var = v0.f6047b;
            if (t0Var != null) {
                return new v2(b4VarUnknownFieldSetFullSchema, t0Var, o2VarMessageInfoFor.getDefaultInstance());
            }
            throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
        }
        d3 d3Var2 = d3.f5851c;
        if (f1.class.isAssignableFrom(cls)) {
            x2 x2Var = y2.f6137b;
            u0 u0Var = null;
            c2 c2Var = d2.f5850b;
            b4 b4VarUnknownFieldSetLiteSchema = o3.unknownFieldSetLiteSchema();
            if (o2VarMessageInfoFor.getSyntax().ordinal() != 1) {
                u0Var = v0.f6046a;
            }
            return u2.q(o2VarMessageInfoFor, x2Var, c2Var, b4VarUnknownFieldSetLiteSchema, u0Var, n2.f5965b);
        }
        t0 t0Var2 = null;
        w2 w2Var = y2.f6136a;
        b2 b2Var = d2.f5849a;
        b4 b4VarUnknownFieldSetFullSchema2 = o3.unknownFieldSetFullSchema();
        if (o2VarMessageInfoFor.getSyntax().ordinal() == 1 || (t0Var2 = v0.f6047b) != null) {
            return u2.q(o2VarMessageInfoFor, w2Var, b2Var, b4VarUnknownFieldSetFullSchema2, t0Var2, n2.f5964a);
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }
}
