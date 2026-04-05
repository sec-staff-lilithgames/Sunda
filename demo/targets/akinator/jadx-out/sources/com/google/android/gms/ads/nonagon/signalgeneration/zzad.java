package com.google.android.gms.ads.nonagon.signalgeneration;

import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.zzbeu;
import com.google.android.gms.internal.ads.zzbgn;
import com.google.android.gms.internal.ads.zzcap;
import com.google.android.gms.internal.ads.zzcaw;
import com.google.android.gms.internal.ads.zzflc;
import com.google.android.gms.internal.ads.zzflm;
import com.google.android.gms.internal.ads.zzguf;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;
import sh.n1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzad implements zzguf {
    final /* synthetic */ n1 zza;
    final /* synthetic */ zzcaw zzb;
    final /* synthetic */ zzcap zzc;
    final /* synthetic */ zzflc zzd;
    final /* synthetic */ zzau zze;

    public zzad(zzau zzauVar, n1 n1Var, zzcaw zzcawVar, zzcap zzcapVar, zzflc zzflcVar) {
        this.zza = n1Var;
        this.zzb = zzcawVar;
        this.zzc = zzcapVar;
        this.zzd = zzflcVar;
        Objects.requireNonNull(zzauVar);
        this.zze = zzauVar;
    }

    @Override // com.google.android.gms.internal.ads.zzguf
    public final void zza(Throwable th2) {
        String message = th2.getMessage();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zziq)).booleanValue()) {
            com.google.android.gms.ads.internal.zzt.zzh().zzh(th2, "SignalGeneratorImpl.generateSignals");
        } else {
            com.google.android.gms.ads.internal.zzt.zzh().zzg(th2, "SignalGeneratorImpl.generateSignals");
        }
        zzflm zzflmVarZzy = zzau.zzy(this.zza, this.zzb);
        if (((Boolean) zzbgn.zze.zze()).booleanValue() && zzflmVarZzy != null) {
            zzflc zzflcVar = this.zzd;
            zzflcVar.zzj(th2);
            zzflcVar.zzd(false);
            zzflmVarZzy.zza(zzflcVar);
            zzflmVarZzy.zzh();
        }
        zzcap zzcapVar = this.zzc;
        if (zzcapVar == null) {
            return;
        }
        try {
            if (!"Unknown format is no longer supported.".equals(message)) {
                StringBuilder sb2 = new StringBuilder(String.valueOf(message).length() + 16);
                sb2.append("Internal error. ");
                sb2.append(message);
                message = sb2.toString();
            }
            zzcapVar.zzb(message);
        } catch (RemoteException e10) {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("", e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzguf
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        n1 n1Var = this.zza;
        AtomicBoolean atomicBooleanZzN = this.zze.zzN();
        zzbj zzbjVar = (zzbj) obj;
        zzflm zzflmVarZzy = zzau.zzy(n1Var, this.zzb);
        atomicBooleanZzN.set(true);
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzik)).booleanValue()) {
            try {
                zzcap zzcapVar = this.zzc;
                if (zzcapVar != null) {
                    zzcapVar.zzb("QueryInfo generation has been disabled.");
                }
            } catch (RemoteException e10) {
                String strConcat = "QueryInfo generation has been disabled.".concat(e10.toString());
                int i10 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzf(strConcat);
            }
            if (!((Boolean) zzbgn.zze.zze()).booleanValue() || zzflmVarZzy == null) {
                return;
            }
            zzflc zzflcVar = this.zzd;
            zzflcVar.zzk("QueryInfo generation has been disabled.");
            zzflcVar.zzd(false);
            zzflmVarZzy.zza(zzflcVar);
            zzflmVarZzy.zzh();
            return;
        }
        try {
            try {
                if (zzbjVar == null) {
                    zzcap zzcapVar2 = this.zzc;
                    if (zzcapVar2 != null) {
                        zzcapVar2.zzc(null, null, null);
                    }
                    zzflc zzflcVar2 = this.zzd;
                    zzflcVar2.zzd(true);
                    if (!((Boolean) zzbgn.zze.zze()).booleanValue() || zzflmVarZzy == null) {
                        return;
                    }
                    zzflmVarZzy.zza(zzflcVar2);
                    zzflmVarZzy.zzh();
                    return;
                }
                try {
                    if (TextUtils.isEmpty((!TextUtils.isEmpty(zzbjVar.zzc) ? new JSONObject(zzbjVar.zzc) : new JSONObject(zzbjVar.zzb)).optString("request_id", ""))) {
                        int i11 = com.google.android.gms.ads.internal.util.zze.zza;
                        com.google.android.gms.ads.internal.util.client.zzo.zzi("The request ID is empty in request JSON.");
                        zzcap zzcapVar3 = this.zzc;
                        if (zzcapVar3 != null) {
                            zzcapVar3.zzb("Internal error: request ID is empty in request JSON.");
                        }
                        zzflc zzflcVar3 = this.zzd;
                        zzflcVar3.zzk("Request ID empty");
                        zzflcVar3.zzd(false);
                        if (!((Boolean) zzbgn.zze.zze()).booleanValue() || zzflmVarZzy == null) {
                            return;
                        }
                        zzflmVarZzy.zza(zzflcVar3);
                        zzflmVarZzy.zzh();
                        return;
                    }
                    Bundle bundle = zzbjVar.zzf;
                    zzau zzauVar = this.zze;
                    if (zzauVar.zzF() && bundle != null && bundle.getInt(zzauVar.zzH(), -1) == -1) {
                        bundle.putInt(zzauVar.zzH(), zzauVar.zzI().get());
                    }
                    if (zzauVar.zzE() && bundle != null && TextUtils.isEmpty(bundle.getString(zzauVar.zzG()))) {
                        if (TextUtils.isEmpty(zzauVar.zzK())) {
                            zzauVar.zzL(com.google.android.gms.ads.internal.zzt.zzc().zze(zzauVar.zzz(), zzauVar.zzJ().afmaVersion));
                        }
                        bundle.putString(zzauVar.zzG(), zzauVar.zzK());
                    }
                    zzcap zzcapVar4 = this.zzc;
                    if (zzcapVar4 != null) {
                        if (TextUtils.isEmpty(zzbjVar.zzc)) {
                            zzcapVar4.zzc(zzbjVar.zza, zzbjVar.zzb, bundle);
                        } else {
                            zzcapVar4.zzc(zzbjVar.zza, zzbjVar.zzc, bundle);
                        }
                    }
                    this.zzd.zzd(true);
                    if (!((Boolean) zzbgn.zze.zze()).booleanValue() || zzflmVarZzy == null) {
                        return;
                    }
                    zzflmVarZzy.zza(this.zzd);
                    zzflmVarZzy.zzh();
                } catch (JSONException e11) {
                    int i12 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzi("Failed to create JSON object from the request string.");
                    zzcap zzcapVar5 = this.zzc;
                    if (zzcapVar5 != null) {
                        String string = e11.toString();
                        StringBuilder sb2 = new StringBuilder(string.length() + 33);
                        sb2.append("Internal error for request JSON: ");
                        sb2.append(string);
                        zzcapVar5.zzb(sb2.toString());
                    }
                    zzflc zzflcVar4 = this.zzd;
                    zzflcVar4.zzj(e11);
                    zzflcVar4.zzd(false);
                    com.google.android.gms.ads.internal.zzt.zzh().zzg(e11, "SignalGeneratorImpl.generateSignals.onSuccess");
                    if (!((Boolean) zzbgn.zze.zze()).booleanValue() || zzflmVarZzy == null) {
                        return;
                    }
                    zzflmVarZzy.zza(zzflcVar4);
                    zzflmVarZzy.zzh();
                }
            } catch (RemoteException e12) {
                zzflc zzflcVar5 = this.zzd;
                zzflcVar5.zzj(e12);
                zzflcVar5.zzd(false);
                int i13 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzg("", e12);
                com.google.android.gms.ads.internal.zzt.zzh().zzg(e12, "SignalGeneratorImpl.generateSignals.onSuccess");
                if (!((Boolean) zzbgn.zze.zze()).booleanValue() || zzflmVarZzy == null) {
                    return;
                }
                zzflmVarZzy.zza(this.zzd);
                zzflmVarZzy.zzh();
            }
        } catch (Throwable th2) {
            if (((Boolean) zzbgn.zze.zze()).booleanValue() && zzflmVarZzy != null) {
                zzflmVarZzy.zza(this.zzd);
                zzflmVarZzy.zzh();
            }
            throw th2;
        }
    }
}
