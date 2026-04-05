package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import androidx.browser.customtabs.d0;
import androidx.browser.customtabs.k0;
import androidx.browser.customtabs.v;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzbfv {
    private k0 zza;
    private v zzb;
    private d0 zzc;
    private zzbfu zzd;

    public static boolean zza(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (packageManager != null) {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.example.com"));
            ResolveInfo resolveInfoResolveActivity = packageManager.resolveActivity(intent, 0);
            List<ResolveInfo> listQueryIntentActivities = packageManager.queryIntentActivities(intent, C.DEFAULT_BUFFER_SEGMENT_SIZE);
            if (listQueryIntentActivities != null && resolveInfoResolveActivity != null) {
                for (int i10 = 0; i10 < listQueryIntentActivities.size(); i10++) {
                    if (resolveInfoResolveActivity.activityInfo.name.equals(listQueryIntentActivities.get(i10).activityInfo.name)) {
                        return resolveInfoResolveActivity.activityInfo.packageName.equals(zzifx.zza(context));
                    }
                }
            }
        }
        return false;
    }

    public final void zzb(Activity activity) {
        d0 d0Var = this.zzc;
        if (d0Var == null) {
            return;
        }
        activity.unbindService(d0Var);
        this.zzb = null;
        this.zza = null;
        this.zzc = null;
    }

    public final k0 zzc() {
        v vVar = this.zzb;
        if (vVar == null) {
            this.zza = null;
        } else if (this.zza == null) {
            this.zza = vVar.newSession(null);
        }
        return this.zza;
    }

    public final void zzd(zzbfu zzbfuVar) {
        this.zzd = zzbfuVar;
    }

    public final void zze(Activity activity) {
        String strZza;
        if (this.zzb == null && (strZza = zzifx.zza(activity)) != null) {
            zzify zzifyVar = new zzify(this);
            this.zzc = zzifyVar;
            v.bindCustomTabsService(activity, strZza, zzifyVar);
        }
    }

    public final void zzf(v vVar) {
        this.zzb = vVar;
        vVar.warmup(0L);
        zzbfu zzbfuVar = this.zzd;
        if (zzbfuVar != null) {
            zzbfuVar.zza();
        }
    }

    public final void zzg() {
        this.zzb = null;
        this.zza = null;
    }
}
