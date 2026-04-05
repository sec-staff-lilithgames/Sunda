package io.ktor.utils.io;

import java.lang.reflect.Constructor;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.f0;
import kv.l;
import tu.a0;
import tu.z;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class ExceptionUtilsJvmKt$createConstructor$$inlined$safeCtor$1 extends f0 implements l {
    final /* synthetic */ Constructor $constructor$inlined;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExceptionUtilsJvmKt$createConstructor$$inlined$safeCtor$1(Constructor constructor) {
        super(1);
        this.$constructor$inlined = constructor;
    }

    @Override // kv.l
    public final Throwable invoke(Throwable e10) {
        Object objM7131constructorimpl;
        e0.checkNotNullParameter(e10, "e");
        try {
            int i10 = z.f87419c;
            Object objNewInstance = this.$constructor$inlined.newInstance(e10.getMessage(), e10);
            e0.checkNotNull(objNewInstance, "null cannot be cast to non-null type kotlin.Throwable");
            objM7131constructorimpl = z.m7131constructorimpl((Throwable) objNewInstance);
        } catch (Throwable th2) {
            int i11 = z.f87419c;
            objM7131constructorimpl = z.m7131constructorimpl(a0.createFailure(th2));
        }
        if (z.m7136isFailureimpl(objM7131constructorimpl)) {
            objM7131constructorimpl = null;
        }
        return (Throwable) objM7131constructorimpl;
    }
}
