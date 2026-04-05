package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import java.util.concurrent.Executor;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzcql implements zzbau {
    private zzcgy zza;
    private final Executor zzb;
    private final zzcpx zzc;
    private final Clock zzd;
    private boolean zze = false;
    private boolean zzf = false;
    private final zzcqa zzg = new zzcqa();

    public zzcql(Executor executor, zzcpx zzcpxVar, Clock clock) {
        this.zzb = executor;
        this.zzc = zzcpxVar;
        this.zzd = clock;
    }

    private final void zzg() {
        try {
            final JSONObject jSONObjectZzb = this.zzc.zzb(this.zzg);
            if (this.zza != null) {
                this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcqk
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        this.zza.zzf(jSONObjectZzb);
                    }
                });
            }
        } catch (JSONException e10) {
            com.google.android.gms.ads.internal.util.zze.zzb("Failed to call video active view js", e10);
        }
    }

    public final void zza(zzcgy zzcgyVar) {
        this.zza = zzcgyVar;
    }

    public final void zzb() {
        this.zze = false;
    }

    public final void zzd() {
        this.zze = true;
        zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzbau
    public final void zzdo(zzbat zzbatVar) {
        boolean z10 = this.zzf ? false : zzbatVar.zzj;
        zzcqa zzcqaVar = this.zzg;
        zzcqaVar.zza = z10;
        zzcqaVar.zzd = this.zzd.elapsedRealtime();
        zzcqaVar.zzf = zzbatVar;
        if (this.zze) {
            zzg();
        }
    }

    public final void zze(boolean z10) {
        this.zzf = z10;
    }

    public final /* synthetic */ void zzf(JSONObject jSONObject) {
        String string = jSONObject.toString();
        String strO = a.b.o(new StringBuilder(string.length() + 31), "Calling AFMA_updateActiveView(", string, ")");
        int i10 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzd(strO);
        this.zza.zzb("AFMA_updateActiveView", jSONObject);
    }
}
