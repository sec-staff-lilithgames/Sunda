package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.view.View;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzbmj {
    public static final Intent zza(Uri uri, Context context, zzaxa zzaxaVar, View view, zzfgr zzfgrVar) {
        if (uri == null) {
            return null;
        }
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.addFlags(268435456);
        intent.setData(uri);
        intent.setAction("android.intent.action.VIEW");
        return intent;
    }

    public static final ResolveInfo zzb(Intent intent, Context context, zzaxa zzaxaVar, View view, zzfgr zzfgrVar) {
        return zzc(intent, new ArrayList(), context, zzaxaVar, view, zzfgrVar);
    }

    public static final ResolveInfo zzc(Intent intent, ArrayList arrayList, Context context, zzaxa zzaxaVar, View view, zzfgr zzfgrVar) {
        ResolveInfo resolveInfo = null;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                return null;
            }
            List<ResolveInfo> listQueryIntentActivities = packageManager.queryIntentActivities(intent, C.DEFAULT_BUFFER_SEGMENT_SIZE);
            ResolveInfo resolveInfoResolveActivity = packageManager.resolveActivity(intent, C.DEFAULT_BUFFER_SEGMENT_SIZE);
            if (listQueryIntentActivities != null && resolveInfoResolveActivity != null) {
                int i10 = 0;
                while (true) {
                    if (i10 >= listQueryIntentActivities.size()) {
                        break;
                    }
                    if (resolveInfoResolveActivity.activityInfo.name.equals(listQueryIntentActivities.get(i10).activityInfo.name)) {
                        resolveInfo = resolveInfoResolveActivity;
                        break;
                    }
                    i10++;
                }
            }
            arrayList.addAll(listQueryIntentActivities);
            return resolveInfo;
        } catch (Throwable th2) {
            com.google.android.gms.ads.internal.zzt.zzh().zzg(th2, "OpenSystemBrowserHandler.getDefaultBrowserResolverForIntent");
            return resolveInfo;
        }
    }

    public static final Intent zzd(Intent intent, ResolveInfo resolveInfo, Context context, zzaxa zzaxaVar, View view, zzfgr zzfgrVar) {
        Intent intent2 = new Intent(intent);
        ActivityInfo activityInfo = resolveInfo.activityInfo;
        intent2.setClassName(activityInfo.packageName, activityInfo.name);
        return intent2;
    }
}
