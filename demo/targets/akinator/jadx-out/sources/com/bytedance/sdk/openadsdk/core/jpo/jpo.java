package com.bytedance.sdk.openadsdk.core.jpo;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import androidx.browser.customtabs.CustomTabsService;
import androidx.browser.customtabs.z;
import com.bytedance.sdk.component.utils.nmd;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class jpo {

    /* renamed from: jd, reason: collision with root package name */
    private static Boolean f20463jd;
    private static String jpo;

    public static int jd(Context context) {
        return !TextUtils.isEmpty(jpo(context)) ? 1 : 0;
    }

    public static String jpo(Context context) {
        String str = jpo;
        if (str != null) {
            return str;
        }
        try {
            PackageManager packageManager = context.getPackageManager();
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.example.com"));
            ResolveInfo resolveInfoResolveActivity = packageManager.resolveActivity(intent, 0);
            String str2 = resolveInfoResolveActivity != null ? resolveInfoResolveActivity.activityInfo.packageName : null;
            List<ResolveInfo> listQueryIntentActivities = packageManager.queryIntentActivities(intent, 0);
            ArrayList arrayList = new ArrayList();
            for (ResolveInfo resolveInfo : listQueryIntentActivities) {
                Intent intent2 = new Intent();
                intent2.setAction(CustomTabsService.ACTION_CUSTOM_TABS_CONNECTION);
                intent2.setPackage(resolveInfo.activityInfo.packageName);
                if (packageManager.resolveService(intent2, 0) != null) {
                    arrayList.add(resolveInfo.activityInfo.packageName);
                }
            }
            if (arrayList.isEmpty()) {
                jpo = null;
            } else if (TextUtils.isEmpty(str2) || jpo(context, intent) || !arrayList.contains(str2)) {
                jpo = (String) arrayList.get(0);
            } else {
                jpo = str2;
            }
        } catch (Throwable th2) {
            nmd.wqx("CustomTabsHelper", th2.getMessage());
        }
        return jpo;
    }

    private static boolean jpo(Context context, Intent intent) {
        List<ResolveInfo> listQueryIntentActivities;
        try {
            listQueryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 64);
        } catch (RuntimeException unused) {
            Log.e("CustomTabsHelper", "Runtime exception while getting specialized handlers");
        }
        if (listQueryIntentActivities.size() == 0) {
            return false;
        }
        for (ResolveInfo resolveInfo : listQueryIntentActivities) {
            IntentFilter intentFilter = resolveInfo.filter;
            if (intentFilter != null && intentFilter.countDataAuthorities() != 0 && intentFilter.countDataPaths() != 0 && resolveInfo.activityInfo != null) {
                return true;
            }
        }
        return false;
    }

    public static int jpo() {
        Boolean bool = f20463jd;
        return (bool != null && bool.booleanValue()) ? 1 : 0;
    }

    public static void jpo(Context context, String str, z zVar, Uri uri) {
        zVar.f5302a.setPackage(str);
        zVar.launchUrl(context, uri);
    }
}
