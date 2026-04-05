package io.ktor.utils.io;

import java.lang.reflect.Constructor;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.f0;
import kv.l;
import tu.a0;
import tu.z;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class ExceptionUtilsJvmKt$createConstructor$$inlined$safeCtor$4 extends f0 implements l {
    final /* synthetic */ Constructor $constructor$inlined;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExceptionUtilsJvmKt$createConstructor$$inlined$safeCtor$4(Constructor constructor) {
        super(1);
        this.$constructor$inlined = constructor;
    }

    @Override // kv.l
    public final Throwable invoke(Throwable e10) {
        Object objM7131constructorimpl;
        e0.checkNotNullParameter(e10, "e");
        try {
            int i10 = z.f87419c;
            Object objNewInstance = this.$constructor$inlined.newInstance(null);
            e0.checkNotNull(objNewInstance, "null cannot be cast to non-null type kotlin.Throwable");
            Throwable th2 = (Throwable) objNewInstance;
            th2.initCause(e10);
            objM7131constructorimpl = z.m7131constructorimpl(th2);
        } catch (Throwable th3) {
            int i11 = z.f87419c;
            objM7131constructorimpl = z.m7131constructorimpl(a0.createFailure(th3));
        }
        return (Throwable) (z.m7136isFailureimpl(objM7131constructorimpl) ? null : objM7131constructorimpl);
    }
}
