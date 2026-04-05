package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.ClientApi;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.concurrent.ScheduledExecutorService;
import sh.n1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzfns extends zzfom {
    public zzfns(ClientApi clientApi, Context context, int i10, zzfhj zzfhjVar, com.google.android.gms.ads.internal.client.zzft zzftVar, com.google.android.gms.ads.internal.client.zzce zzceVar, ScheduledExecutorService scheduledExecutorService, zzfnq zzfnqVar, Clock clock) {
        super(clientApi, context, i10, zzfhjVar, zzftVar, zzceVar, scheduledExecutorService, zzfnqVar, clock);
    }

    @Override // com.google.android.gms.internal.ads.zzfom
    public final n1 zza(Context context) {
        zzbrj zzbrjVarZzd = this.zzd.zzd();
        if (zzbrjVarZzd == null) {
            return zzgui.zzc(new zzfni(1, "Failed to create an interstitial ad manager."));
        }
        com.google.android.gms.ads.internal.client.zzbx zzbxVarZzc = this.zza.zzc(ObjectWrapper.wrap(context), new com.google.android.gms.ads.internal.client.zzr(), this.zze.zza, zzbrjVarZzd, this.zzc);
        if (zzbxVarZzc == null) {
            return zzgui.zzc(new zzfni(1, "Failed to create an interstitial ad manager."));
        }
        zzgvb zzgvbVarZze = zzgvb.zze();
        try {
            zzs(this.zze.zzc);
            zzbxVarZzc.zzQ(this.zze.zzc, new zzfnr(this, zzgvbVarZze, zzbxVarZzc));
            return zzgvbVarZze;
        } catch (RemoteException e10) {
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Failed to load interstitial ad.", e10);
            return zzgui.zzc(new zzfni(1, "remote exception"));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfom
    public final /* bridge */ /* synthetic */ com.google.android.gms.ads.internal.client.zzea zzb(Object obj) {
        try {
            return ((com.google.android.gms.ads.internal.client.zzbx) obj).zzt();
        } catch (RemoteException e10) {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zze("Failed to get response info for  the interstitial ad.", e10);
            return null;
        }
    }

    public zzfns(String str, ClientApi clientApi, Context context, int i10, zzfhj zzfhjVar, com.google.android.gms.ads.internal.client.zzft zzftVar, com.google.android.gms.ads.internal.client.zzch zzchVar, ScheduledExecutorService scheduledExecutorService, zzfnq zzfnqVar, Clock clock) {
        super(str, clientApi, context, i10, zzfhjVar, zzftVar, zzchVar, scheduledExecutorService, zzfnqVar, clock);
    }
}
