package com.moloco.sdk.internal.services;

import android.content.Context;
import android.content.pm.PackageInfo;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class w implements v {

    /* renamed from: a, reason: collision with root package name */
    public final Context f47191a;

    /* renamed from: b, reason: collision with root package name */
    public u f47192b;

    public w(Context context) {
        kotlin.jvm.internal.e0.checkNotNullParameter(context, "context");
        this.f47191a = context;
    }

    @Override // com.moloco.sdk.internal.services.v
    public u invoke() {
        Object objM7131constructorimpl;
        Context context = this.f47191a;
        u uVar = this.f47192b;
        if (uVar != null) {
            return uVar;
        }
        try {
            int i10 = tu.z.f87419c;
            String string = context.getPackageManager().getApplicationLabel(context.getApplicationInfo()).toString();
            PackageInfo packageInfoA = x.a(context);
            String packageName = packageInfoA.packageName;
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(packageName, "packageName");
            String versionName = packageInfoA.versionName;
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(versionName, "versionName");
            u uVar2 = new u(string, packageName, versionName);
            this.f47192b = uVar2;
            objM7131constructorimpl = tu.z.m7131constructorimpl(uVar2);
        } catch (Throwable th2) {
            int i11 = tu.z.f87419c;
            objM7131constructorimpl = tu.z.m7131constructorimpl(tu.a0.createFailure(th2));
        }
        if (tu.z.m7136isFailureimpl(objM7131constructorimpl)) {
            objM7131constructorimpl = null;
        }
        u uVar3 = (u) objM7131constructorimpl;
        return uVar3 == null ? new u("", "", "") : uVar3;
    }
}
