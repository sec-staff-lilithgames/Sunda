package com.moloco.sdk.internal.services;

import android.content.Context;
import android.content.pm.PackageInfo;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final Context f47157a;

    public k(Context context) {
        kotlin.jvm.internal.e0.checkNotNullParameter(context, "context");
        this.f47157a = context;
    }

    public final Object a() {
        Context context = this.f47157a;
        PackageInfo currentWebViewPackage = k6.v.getCurrentWebViewPackage(context);
        if (currentWebViewPackage == null) {
            int i10 = tu.z.f87419c;
            return tu.z.m7131constructorimpl(tu.a0.createFailure(new Exception("No current WebView package exists")));
        }
        int applicationEnabledSetting = context.getPackageManager().getApplicationEnabledSetting(currentWebViewPackage.packageName);
        if (applicationEnabledSetting == 2) {
            int i11 = tu.z.f87419c;
            return tu.z.m7131constructorimpl(tu.a0.createFailure(new Exception("WebView component is disabled by system")));
        }
        if (applicationEnabledSetting == 3) {
            int i12 = tu.z.f87419c;
            return tu.z.m7131constructorimpl(tu.a0.createFailure(new Exception("WebView component is disabled by user")));
        }
        if (applicationEnabledSetting != 4) {
            int i13 = tu.z.f87419c;
            return tu.z.m7131constructorimpl(x0.f87415a);
        }
        int i14 = tu.z.f87419c;
        return tu.z.m7131constructorimpl(tu.a0.createFailure(new Exception("WebView component is disabled until used")));
    }
}
