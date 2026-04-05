package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.TimeoutException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzbpj implements Runnable {
    final /* synthetic */ zzbqa zza;
    final /* synthetic */ zzbow zzb;
    final /* synthetic */ ArrayList zzc;
    final /* synthetic */ long zzd;
    final /* synthetic */ zzbqb zze;

    public zzbpj(zzbqb zzbqbVar, zzbqa zzbqaVar, zzbow zzbowVar, ArrayList arrayList, long j10) {
        this.zza = zzbqaVar;
        this.zzb = zzbowVar;
        this.zzc = arrayList;
        this.zzd = j10;
        Objects.requireNonNull(zzbqbVar);
        this.zze = zzbqbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String string;
        com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > ADMOB_UI_HANDLER.postDelayed: Trying to acquire lock");
        zzbqb zzbqbVar = this.zze;
        synchronized (zzbqbVar.zzf()) {
            try {
                com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > ADMOB_UI_HANDLER.postDelayed: Lock acquired");
                zzbqa zzbqaVar = this.zza;
                if (zzbqaVar.zzi() != -1 && zzbqaVar.zzi() != 1) {
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzip)).booleanValue()) {
                        zzbqaVar.zzh(new TimeoutException("Unable to fully load JS engine."), "SdkJavascriptFactory.loadJavascriptEngine.Runnable");
                    } else {
                        zzbqaVar.zzg();
                    }
                    zzgus zzgusVar = zzcbv.zzf;
                    final zzbow zzbowVar = this.zzb;
                    Objects.requireNonNull(zzbowVar);
                    zzgusVar.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbpi
                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            zzbowVar.zzj();
                        }
                    });
                    String strValueOf = String.valueOf(com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzd));
                    int iZzi = zzbqaVar.zzi();
                    int iZzj = zzbqbVar.zzj();
                    ArrayList arrayList = this.zzc;
                    if (arrayList.isEmpty()) {
                        string = ". Still waiting for the engine to be loaded";
                    } else {
                        String strValueOf2 = String.valueOf(arrayList.get(0));
                        StringBuilder sb2 = new StringBuilder(strValueOf2.length() + 88);
                        sb2.append(". While waiting for the /jsLoaded gmsg, observed the loadNewJavascriptEngine latency is ");
                        sb2.append(strValueOf2);
                        string = sb2.toString();
                    }
                    long jCurrentTimeMillis = com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis() - this.zzd;
                    StringBuilder sb3 = new StringBuilder(strValueOf.length() + 107 + String.valueOf(iZzi).length() + 36 + String.valueOf(iZzj).length() + string.length() + 39 + String.valueOf(jCurrentTimeMillis).length() + 26);
                    sb3.append("Could not finish the full JS engine loading in ");
                    sb3.append(strValueOf);
                    sb3.append(" ms. JS engine session reference status(fullLoadTimeout) is ");
                    sb3.append(iZzi);
                    sb3.append(". Update status(fullLoadTimeout) is ");
                    sb3.append(iZzj);
                    sb3.append(string);
                    sb3.append(" ms. Total latency(fullLoadTimeout) is ");
                    sb3.append(jCurrentTimeMillis);
                    sb3.append(" ms at timeout. Rejecting.");
                    com.google.android.gms.ads.internal.util.zze.zza(sb3.toString());
                    com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > ADMOB_UI_HANDLER.postDelayed: Lock released");
                    return;
                }
                com.google.android.gms.ads.internal.util.zze.zza("loadJavascriptEngine > ADMOB_UI_HANDLER.postDelayed: Lock released, the promise is already settled");
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
