package com.google.android.gms.internal.ads;

import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import io.ktor.http.ContentDisposition;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzepw implements zzexy {
    public final Context zza;
    public final com.google.android.gms.ads.internal.client.zzr zzb;
    public final List zzc;

    public zzepw(Context context, com.google.android.gms.ads.internal.client.zzr zzrVar, List list) {
        this.zza = context;
        this.zzb = zzrVar;
        this.zzc = list;
    }

    @Override // com.google.android.gms.internal.ads.zzexy
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        List<ActivityManager.RunningTaskInfo> runningTasks;
        ActivityManager.RunningTaskInfo runningTaskInfo;
        ComponentName componentName;
        zzcxq zzcxqVar = (zzcxq) obj;
        if (((Boolean) zzbgx.zza.zze()).booleanValue()) {
            Bundle bundle = new Bundle();
            com.google.android.gms.ads.internal.zzt.zzc();
            String className = null;
            try {
                ActivityManager activityManager = (ActivityManager) this.zza.getSystemService("activity");
                if (activityManager != null && (runningTasks = activityManager.getRunningTasks(1)) != null && !runningTasks.isEmpty() && (runningTaskInfo = runningTasks.get(0)) != null && (componentName = runningTaskInfo.topActivity) != null) {
                    className = componentName.getClassName();
                }
            } catch (Exception unused) {
            }
            bundle.putString("activity", className);
            Bundle bundle2 = new Bundle();
            com.google.android.gms.ads.internal.client.zzr zzrVar = this.zzb;
            bundle2.putInt("width", zzrVar.zze);
            bundle2.putInt("height", zzrVar.zzb);
            bundle.putBundle(ContentDisposition.Parameters.Size, bundle2);
            List list = this.zzc;
            if (!list.isEmpty()) {
                bundle.putParcelableArray("parents", (Parcelable[]) list.toArray(new Parcelable[list.size()]));
            }
            zzcxqVar.zza.putBundle("view_hierarchy", bundle);
        }
    }
}
