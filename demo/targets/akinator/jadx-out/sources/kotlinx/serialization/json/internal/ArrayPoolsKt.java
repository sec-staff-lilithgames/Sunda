package kotlinx.serialization.json.internal;

import kotlin.jvm.internal.e0;
import sv.j0;
import tu.a0;
import tu.z;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class ArrayPoolsKt {
    private static final int MAX_CHARS_IN_POOL;

    static {
        Object objM7131constructorimpl;
        try {
            int i10 = z.f87419c;
            String property = System.getProperty("kotlinx.serialization.json.pool.size");
            e0.checkNotNullExpressionValue(property, "getProperty(...)");
            objM7131constructorimpl = z.m7131constructorimpl(j0.toIntOrNull(property));
        } catch (Throwable th2) {
            int i11 = z.f87419c;
            objM7131constructorimpl = z.m7131constructorimpl(a0.createFailure(th2));
        }
        if (z.m7136isFailureimpl(objM7131constructorimpl)) {
            objM7131constructorimpl = null;
        }
        Integer num = (Integer) objM7131constructorimpl;
        MAX_CHARS_IN_POOL = num != null ? num.intValue() : 2097152;
    }
}
