package kotlin.reflect;

import java.lang.reflect.Type;
import kotlin.jvm.internal.a0;
import kotlin.jvm.internal.e0;
import kv.l;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final /* synthetic */ class ParameterizedTypeImpl$getTypeName$1$1 extends a0 implements l {
    public static final ParameterizedTypeImpl$getTypeName$1$1 INSTANCE = new ParameterizedTypeImpl$getTypeName$1$1();

    public ParameterizedTypeImpl$getTypeName$1$1() {
        super(1, TypesJVMKt.class, "typeToString", "typeToString(Ljava/lang/reflect/Type;)Ljava/lang/String;", 1);
    }

    @Override // kv.l
    public final String invoke(Type p02) {
        e0.checkNotNullParameter(p02, "p0");
        return TypesJVMKt.typeToString(p02);
    }
}
