package okhttp3.internal.platform;

import android.content.Context;
import android.os.Build;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final d f79518a = new d();

    public final c findPlatform() {
        jw.c.f69955a.enable();
        c cVarBuildIfSupported = a.f79504f.buildIfSupported();
        if (cVarBuildIfSupported == null) {
            cVarBuildIfSupported = b.f79508f.buildIfSupported();
        }
        if (cVarBuildIfSupported != null) {
            return cVarBuildIfSupported;
        }
        throw new IllegalStateException(a.b.e(Build.VERSION.SDK_INT, "Expected Android API level 21+ but was "));
    }

    public final Context getApplicationContext() {
        Object obj = c.f79515a.get();
        iw.a aVar = obj instanceof iw.a ? (iw.a) obj : null;
        if (aVar != null) {
            return aVar.getApplicationContext();
        }
        return null;
    }

    public final boolean isAndroid() {
        return true;
    }

    public final void setApplicationContext(Context context) {
        Object obj = c.f79515a.get();
        iw.a aVar = obj instanceof iw.a ? (iw.a) obj : null;
        if (aVar != null) {
            aVar.setApplicationContext(context);
        }
    }
}
