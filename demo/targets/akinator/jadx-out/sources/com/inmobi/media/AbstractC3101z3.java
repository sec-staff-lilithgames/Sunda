package com.inmobi.media;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import androidx.browser.customtabs.CustomTabsService;
import com.bytedance.adsdk.jd.jpo.jd.zwdd.OcvDtWCQ;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.inmobi.media.z3, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC3101z3 {

    /* renamed from: a, reason: collision with root package name */
    public static String f33685a;

    public static final String a(Context context) {
        if (!R3.f32183a.P()) {
            return null;
        }
        if (context == null || f33685a != null) {
            return f33685a;
        }
        try {
            PackageManager packageManager = context.getPackageManager();
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.google.com"));
            ResolveInfo resolveInfoResolveActivity = packageManager.resolveActivity(intent, 0);
            String str = resolveInfoResolveActivity != null ? resolveInfoResolveActivity.activityInfo.packageName : null;
            List<ResolveInfo> listQueryIntentActivities = packageManager.queryIntentActivities(intent, 0);
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(listQueryIntentActivities, "queryIntentActivities(...)");
            ArrayList arrayList = new ArrayList();
            for (ResolveInfo resolveInfo : listQueryIntentActivities) {
                Intent intent2 = new Intent();
                intent2.setAction(CustomTabsService.ACTION_CUSTOM_TABS_CONNECTION);
                intent2.setPackage(resolveInfo.activityInfo.packageName);
                if (packageManager.resolveService(intent2, 0) != null) {
                    String packageName = resolveInfo.activityInfo.packageName;
                    kotlin.jvm.internal.e0.checkNotNullExpressionValue(packageName, "packageName");
                    arrayList.add(packageName);
                }
            }
            if (arrayList.isEmpty()) {
                f33685a = null;
            } else if (arrayList.size() == 1) {
                f33685a = (String) arrayList.get(0);
            } else if (!TextUtils.isEmpty(str) && !a(context, intent) && uu.y0.contains(arrayList, str)) {
                f33685a = str;
            } else if (arrayList.contains("com.android.chrome")) {
                f33685a = "com.android.chrome";
            } else if (arrayList.contains("com.chrome.beta")) {
                f33685a = "com.chrome.beta";
            } else if (arrayList.contains("com.chrome.dev")) {
                f33685a = "com.chrome.dev";
            } else if (arrayList.contains("com.google.android.apps.chrome")) {
                f33685a = "com.google.android.apps.chrome";
            }
        } catch (Exception unused) {
        }
        return f33685a;
    }

    public static boolean a(Context context, Intent intent) {
        try {
            List<ResolveInfo> listQueryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 64);
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(listQueryIntentActivities, OcvDtWCQ.mmRaIl);
            for (ResolveInfo resolveInfo : listQueryIntentActivities) {
                IntentFilter intentFilter = resolveInfo.filter;
                if (intentFilter != null) {
                    kotlin.jvm.internal.e0.checkNotNull(intentFilter);
                    if (intentFilter.countDataAuthorities() != 0 && intentFilter.countDataPaths() != 0 && resolveInfo.activityInfo != null) {
                        return true;
                    }
                }
            }
            return false;
        } catch (RuntimeException unused) {
            Log.e("z3", "Runtime exception while getting specialized handlers");
            return false;
        }
    }
}
