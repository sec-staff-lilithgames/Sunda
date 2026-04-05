package com.google.android.gms.internal.ads;

import android.content.Context;
import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import com.google.android.gms.common.util.Clock;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzcqb implements zzbau, zzczj, com.google.android.gms.ads.internal.overlay.zzr, zzczi {
    private final zzcpw zza;
    private final zzcpx zzb;
    private final zzbrb zzd;
    private final Executor zze;
    private final Clock zzf;
    private final Set zzc = new HashSet();
    private final AtomicBoolean zzg = new AtomicBoolean(false);
    private final zzcqa zzh = new zzcqa();
    private boolean zzi = false;
    private WeakReference zzj = new WeakReference(this);

    public zzcqb(zzbqy zzbqyVar, zzcpx zzcpxVar, Executor executor, zzcpw zzcpwVar, Clock clock) {
        this.zza = zzcpwVar;
        zzbqj zzbqjVar = zzbqm.zza;
        this.zzd = zzbqyVar.zza("google.afma.activeView.handleUpdate", zzbqjVar, zzbqjVar);
        this.zzb = zzcpxVar;
        this.zze = executor;
        this.zzf = clock;
    }

    private final void zzp() {
        Iterator it = this.zzc.iterator();
        while (it.hasNext()) {
            this.zza.zzc((zzcgy) it.next());
        }
        this.zza.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzczj
    public final synchronized void zza(Context context) {
        this.zzh.zzb = true;
        zzl();
    }

    @Override // com.google.android.gms.internal.ads.zzczj
    public final synchronized void zzb(Context context) {
        this.zzh.zzb = false;
        zzl();
    }

    @Override // com.google.android.gms.internal.ads.zzczj
    public final synchronized void zzc(Context context) {
        this.zzh.zze = ApsMetricsDataMap.APSMETRICS_FIELD_URL;
        zzl();
        zzp();
        this.zzi = true;
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final synchronized void zzdB() {
        this.zzh.zzb = true;
        zzl();
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final synchronized void zzdC() {
        this.zzh.zzb = false;
        zzl();
    }

    @Override // com.google.android.gms.internal.ads.zzbau
    public final synchronized void zzdo(zzbat zzbatVar) {
        zzcqa zzcqaVar = this.zzh;
        zzcqaVar.zza = zzbatVar.zzj;
        zzcqaVar.zzf = zzbatVar;
        zzl();
    }

    @Override // com.google.android.gms.internal.ads.zzczi
    public final synchronized void zzdw() {
        if (this.zzg.compareAndSet(false, true)) {
            this.zza.zza(this);
            zzl();
        }
    }

    public final synchronized void zzl() {
        try {
            if (this.zzj.get() == null) {
                zzm();
                return;
            }
            if (this.zzi || !this.zzg.get()) {
                return;
            }
            try {
                zzcqa zzcqaVar = this.zzh;
                zzcqaVar.zzd = this.zzf.elapsedRealtime();
                final JSONObject jSONObjectZza = this.zzb.zzb(zzcqaVar);
                for (final zzcgy zzcgyVar : this.zzc) {
                    this.zze.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcpz
                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            JSONObject jSONObject = jSONObjectZza;
                            String string = jSONObject.toString();
                            String strO = a.b.o(new StringBuilder(string.length() + 31), "Calling AFMA_updateActiveView(", string, ")");
                            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
                            com.google.android.gms.ads.internal.util.client.zzo.zzd(strO);
                            zzcgyVar.zzb("AFMA_updateActiveView", jSONObject);
                        }
                    });
                }
                zzcby.zzb(this.zzd.zzb(jSONObjectZza), "ActiveViewListener.callActiveViewJs");
            } catch (Exception e10) {
                com.google.android.gms.ads.internal.util.zze.zzb("Failed to call ActiveViewJS", e10);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void zzm() {
        zzp();
        this.zzi = true;
    }

    public final synchronized void zzn(zzcgy zzcgyVar) {
        this.zzc.add(zzcgyVar);
        this.zza.zzb(zzcgyVar);
    }

    public final void zzo(Object obj) {
        this.zzj = new WeakReference(obj);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdA() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdD() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdE() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdX() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdt() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdu() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdv() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzh() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdY(int i10) {
    }
}
