package kotlin.reflect;

import kotlin.jvm.internal.a0;
import kotlin.jvm.internal.e0;
import kv.l;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final /* synthetic */ class TypesJVMKt$typeToString$unwrap$1 extends a0 implements l {
    public static final TypesJVMKt$typeToString$unwrap$1 INSTANCE = new TypesJVMKt$typeToString$unwrap$1();

    public TypesJVMKt$typeToString$unwrap$1() {
        super(1, Class.class, "getComponentType", "getComponentType()Ljava/lang/Class;", 0);
    }

    @Override // kv.l
    public final Class<?> invoke(Class<?> p02) {
        e0.checkNotNullParameter(p02, "p0");
        return p02.getComponentType();
    }
}
