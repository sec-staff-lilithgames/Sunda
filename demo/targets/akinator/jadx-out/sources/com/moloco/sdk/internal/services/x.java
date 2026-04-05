package com.moloco.sdk.internal.services;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public abstract class x {
    public static final PackageInfo a(Context context) throws PackageManager.NameNotFoundException {
        kotlin.jvm.internal.e0.checkNotNullParameter(context, "<this>");
        if (Build.VERSION.SDK_INT >= 33) {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), PackageManager.PackageInfoFlags.of(0L));
            kotlin.jvm.internal.e0.checkNotNull(packageInfo);
            return packageInfo;
        }
        PackageInfo packageInfo2 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
        kotlin.jvm.internal.e0.checkNotNull(packageInfo2);
        return packageInfo2;
    }
}
