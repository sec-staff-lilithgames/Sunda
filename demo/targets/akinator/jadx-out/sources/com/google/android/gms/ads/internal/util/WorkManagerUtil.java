package com.google.android.gms.ads.internal.util;

import android.content.Context;
import androidx.work.a;
import androidx.work.b;
import com.google.android.gms.ads.internal.offline.buffering.OfflineNotificationPoster;
import com.google.android.gms.ads.internal.offline.buffering.OfflinePingSender;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import i2.hQ.aTNDubNmpwAqdU;
import n6.b0;
import n6.d0;
import n6.f;
import n6.f0;
import n6.y0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public class WorkManagerUtil extends zzbn {
    private static void zzb(Context context) {
        try {
            y0.initialize(context.getApplicationContext(), new a.C0006a().build());
        } catch (IllegalStateException unused) {
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzbo
    public final void zzf(IObjectWrapper iObjectWrapper) {
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        zzb(context);
        try {
            y0 y0Var = y0.getInstance(context);
            y0Var.cancelAllWorkByTag("offline_ping_sender_work");
            y0Var.enqueue((f0) ((f0.a) ((f0.a) new f0.a((Class<? extends b0>) OfflinePingSender.class).setConstraints(new f.a().setRequiredNetworkType(d0.f75706c).build())).addTag("offline_ping_sender_work")).build());
        } catch (IllegalStateException e10) {
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Failed to instantiate WorkManager.", e10);
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzbo
    public final boolean zzg(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.offline.buffering.zza zzaVar) {
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        zzb(context);
        f fVarBuild = new f.a().setRequiredNetworkType(d0.f75706c).build();
        try {
            y0.getInstance(context).enqueue((f0) ((f0.a) ((f0.a) ((f0.a) new f0.a((Class<? extends b0>) OfflineNotificationPoster.class).setConstraints(fVarBuild)).setInputData(new b.a().putString("uri", zzaVar.zza).putString("gws_query_id", zzaVar.zzb).putString(CampaignEx.JSON_KEY_IMAGE_URL, zzaVar.zzc).build())).addTag("offline_notification_work")).build());
            return true;
        } catch (IllegalStateException e10) {
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Failed to instantiate WorkManager.", e10);
            return false;
        }
    }

    @Override // com.google.android.gms.ads.internal.util.zzbo
    public final boolean zze(IObjectWrapper iObjectWrapper, String str, String str2) {
        return zzg(iObjectWrapper, new com.google.android.gms.ads.internal.offline.buffering.zza(str, str2, aTNDubNmpwAqdU.DhtMmtK));
    }
}
