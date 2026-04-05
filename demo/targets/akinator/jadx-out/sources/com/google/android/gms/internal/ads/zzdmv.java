package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.view.View;
import com.bytedance.adsdk.jd.jpo.jd.zwdd.OcvDtWCQ;
import com.google.android.gms.common.util.Clock;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzdmv implements View.OnClickListener {
    String zza;
    Long zzb;
    WeakReference zzc;
    private final zzdqt zzd;
    private final Clock zze;
    private zzbjz zzf;
    private zzblx zzg;

    public zzdmv(zzdqt zzdqtVar, Clock clock) {
        this.zzd = zzdqtVar;
        this.zze = clock;
    }

    private final void zzd() {
        View view;
        this.zza = null;
        this.zzb = null;
        WeakReference weakReference = this.zzc;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        view.setClickable(false);
        view.setOnClickListener(null);
        this.zzc = null;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        WeakReference weakReference = this.zzc;
        if (weakReference == null || weakReference.get() != view) {
            return;
        }
        if (this.zza != null && this.zzb != null) {
            HashMap map = new HashMap();
            map.put("id", this.zza);
            map.put("time_interval", String.valueOf(this.zze.currentTimeMillis() - this.zzb.longValue()));
            map.put("messageType", "onePointFiveClick");
            this.zzd.zzf("sendMessageToNativeJs", map);
        }
        zzd();
    }

    public final void zza(final zzbjz zzbjzVar) {
        this.zzf = zzbjzVar;
        zzblx zzblxVar = this.zzg;
        if (zzblxVar != null) {
            this.zzd.zze("/unconfirmedClick", zzblxVar);
        }
        zzblx zzblxVar2 = new zzblx() { // from class: com.google.android.gms.internal.ads.zzdmu
            @Override // com.google.android.gms.internal.ads.zzblx
            public final /* synthetic */ void zza(Object obj, Map map) {
                zzdmv zzdmvVar = this.zza;
                try {
                    zzdmvVar.zzb = Long.valueOf(Long.parseLong((String) map.get("timestamp")));
                } catch (NumberFormatException unused) {
                    int i10 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzf("Failed to call parse unconfirmedClickTimestamp.");
                }
                zzbjz zzbjzVar2 = zzbjzVar;
                zzdmvVar.zza = (String) map.get("id");
                String str = (String) map.get(OcvDtWCQ.VUinPddPZeui);
                if (zzbjzVar2 == null) {
                    int i11 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzd("Received unconfirmed click but UnconfirmedClickListener is null.");
                } else {
                    try {
                        zzbjzVar2.zze(str);
                    } catch (RemoteException e10) {
                        com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e10);
                    }
                }
            }
        };
        this.zzg = zzblxVar2;
        this.zzd.zzd("/unconfirmedClick", zzblxVar2);
    }

    public final zzbjz zzb() {
        return this.zzf;
    }

    public final void zzc() {
        if (this.zzf == null || this.zzb == null) {
            return;
        }
        zzd();
        try {
            this.zzf.zzf();
        } catch (RemoteException e10) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e10);
        }
    }
}
