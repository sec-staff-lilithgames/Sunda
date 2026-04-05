package kotlinx.coroutines.internal;

import tu.a0;
import tu.z;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class FastServiceLoaderKt {
    private static final boolean ANDROID_DETECTED = false;

    static {
        Object objM7131constructorimpl;
        try {
            int i10 = z.f87419c;
            objM7131constructorimpl = z.m7131constructorimpl(Class.forName("android.os.Build"));
        } catch (Throwable th2) {
            int i11 = z.f87419c;
            objM7131constructorimpl = z.m7131constructorimpl(a0.createFailure(th2));
        }
        z.m7137isSuccessimpl(objM7131constructorimpl);
    }

    public static final boolean getANDROID_DETECTED() {
        return true;
    }
}
