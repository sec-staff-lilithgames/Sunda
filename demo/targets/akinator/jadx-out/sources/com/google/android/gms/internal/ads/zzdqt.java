package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.Executor;
import org.json.JSONObject;
import sh.n1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzdqt {
    private final com.google.android.gms.ads.internal.zza zzb;
    private final Context zzc;
    private final zzdvi zzd;
    private final Executor zze;
    private final zzaxa zzf;
    private final VersionInfoParcel zzg;
    private final zzefy zzi;
    private final zzfng zzj;
    private final zzegj zzk;
    private final zzfgr zzl;
    private n1 zzm;
    private final zzdqh zza = new zzdqh();
    private final zzbmo zzh = new zzbmo();

    public zzdqt(zzdqr zzdqrVar) {
        this.zzc = zzdqrVar.zzb();
        this.zze = zzdqrVar.zze();
        this.zzf = zzdqrVar.zzf();
        this.zzg = zzdqrVar.zzg();
        this.zzb = zzdqrVar.zza();
        this.zzi = zzdqrVar.zzd();
        this.zzj = zzdqrVar.zzh();
        this.zzd = zzdqrVar.zzc();
        this.zzk = zzdqrVar.zzi();
        this.zzl = zzdqrVar.zzj();
    }

    public final synchronized void zza() {
        String str = (String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzen);
        zzaxa zzaxaVar = this.zzf;
        com.google.android.gms.ads.internal.zza zzaVar = this.zzb;
        zzegj zzegjVar = this.zzk;
        n1 n1VarZzk = zzgui.zzk(zzcho.zzb(this.zzc, this.zzg, str, zzaxaVar, zzaVar, zzegjVar, this.zzl, this.zzd), new zzglu() { // from class: com.google.android.gms.internal.ads.zzdqq
            @Override // com.google.android.gms.internal.ads.zzglu
            public final /* synthetic */ Object apply(Object obj) {
                zzcgy zzcgyVar = (zzcgy) obj;
                this.zza.zzi(zzcgyVar);
                return zzcgyVar;
            }
        }, this.zze);
        this.zzm = n1VarZzk;
        zzcby.zza(n1VarZzk, "NativeJavascriptExecutor.initializeEngine");
    }

    public final synchronized void zzb() {
        n1 n1Var = this.zzm;
        if (n1Var == null) {
            return;
        }
        zzgui.zzr(n1Var, new zzdqi(this), this.zze);
        this.zzm = null;
    }

    public final synchronized n1 zzc(final String str, final JSONObject jSONObject) {
        n1 n1Var = this.zzm;
        if (n1Var == null) {
            return zzgui.zza(null);
        }
        return zzgui.zzj(n1Var, new zzgtq() { // from class: com.google.android.gms.internal.ads.zzdqp
            @Override // com.google.android.gms.internal.ads.zzgtq
            public final /* synthetic */ n1 zza(Object obj) {
                return this.zza.zzj(str, jSONObject, (zzcgy) obj);
            }
        }, this.zze);
    }

    public final synchronized void zzd(String str, zzblx zzblxVar) {
        n1 n1Var = this.zzm;
        if (n1Var == null) {
            return;
        }
        zzgui.zzr(n1Var, new zzdqj(this, str, zzblxVar), this.zze);
    }

    public final synchronized void zze(String str, zzblx zzblxVar) {
        n1 n1Var = this.zzm;
        if (n1Var == null) {
            return;
        }
        zzgui.zzr(n1Var, new zzdqk(this, str, zzblxVar), this.zze);
    }

    public final synchronized void zzf(String str, Map map) {
        n1 n1Var = this.zzm;
        if (n1Var == null) {
            return;
        }
        zzgui.zzr(n1Var, new zzdql(this, "sendMessageToNativeJs", map), this.zze);
    }

    public final synchronized void zzg(zzffu zzffuVar, zzffx zzffxVar, zzcpe zzcpeVar) {
        n1 n1Var = this.zzm;
        if (n1Var == null) {
            return;
        }
        zzgui.zzr(n1Var, new zzdqm(this, zzffuVar, zzffxVar, zzcpeVar), this.zze);
    }

    public final void zzh(WeakReference weakReference, String str, zzblx zzblxVar) {
        zzd(str, new zzdqs(this, weakReference, str, zzblxVar, null));
    }

    public final /* synthetic */ zzcgy zzi(zzcgy zzcgyVar) {
        zzcgyVar.zzab("/result", this.zzh);
        zzciw zzciwVarZzP = zzcgyVar.zzP();
        com.google.android.gms.ads.internal.zzb zzbVar = new com.google.android.gms.ads.internal.zzb(this.zzc, null, null);
        zzefy zzefyVar = this.zzi;
        zzfng zzfngVar = this.zzj;
        zzdvi zzdviVar = this.zzd;
        zzdqh zzdqhVar = this.zza;
        zzciwVarZzP.zzZ(null, zzdqhVar, zzdqhVar, zzdqhVar, zzdqhVar, false, null, zzbVar, null, null, zzefyVar, zzfngVar, zzdviVar, null, null, null, null, null, null, null, null);
        return zzcgyVar;
    }

    public final /* synthetic */ n1 zzj(String str, JSONObject jSONObject, zzcgy zzcgyVar) {
        return this.zzh.zzc(zzcgyVar, str, jSONObject);
    }

    public final /* synthetic */ zzdqh zzk() {
        return this.zza;
    }

    public final /* synthetic */ zzdvi zzl() {
        return this.zzd;
    }

    public final /* synthetic */ zzefy zzm() {
        return this.zzi;
    }

    public final /* synthetic */ zzfng zzn() {
        return this.zzj;
    }
}
