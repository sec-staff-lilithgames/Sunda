package d0;

import android.os.Build;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class x3 {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ x3 f51672a = new x3();

    public final y3 getForCurrentPlatform() {
        if (y2.isPlatformMagnifierSupported$default(0, 1, null)) {
            return Build.VERSION.SDK_INT == 28 ? a4.f51295a : c4.f51348a;
        }
        throw new UnsupportedOperationException("Magnifier is only supported on API level 28 and higher.");
    }
}
