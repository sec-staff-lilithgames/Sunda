package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import sh.n1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzbnv implements zzapn {
    private volatile zzbni zza;
    private final Context zzb;

    public zzbnv(Context context) {
        this.zzb = context;
    }

    @Override // com.google.android.gms.internal.ads.zzapn
    public final zzapq zza(zzapu zzapuVar) throws zzaqd {
        Parcelable.Creator<zzbnj> creator = zzbnj.CREATOR;
        Map mapZzm = zzapuVar.zzm();
        int size = mapZzm.size();
        String[] strArr = new String[size];
        String[] strArr2 = new String[size];
        int i10 = 0;
        for (Map.Entry entry : mapZzm.entrySet()) {
            strArr[i10] = (String) entry.getKey();
            strArr2[i10] = (String) entry.getValue();
            i10++;
        }
        zzbnj zzbnjVar = new zzbnj(zzapuVar.zzh(), strArr, strArr2);
        long jElapsedRealtime = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime();
        try {
            zzcca zzccaVar = new zzcca();
            this.zza = new zzbni(this.zzb, com.google.android.gms.ads.internal.zzt.zzs().zza(), new zzbnt(this, zzccaVar), new zzbnu(this, zzccaVar));
            this.zza.checkAvailabilityAndConnect();
            zzbnr zzbnrVar = new zzbnr(this, zzbnjVar);
            zzgus zzgusVar = zzcbv.zza;
            n1 n1VarZzi = zzgui.zzi(zzgui.zzj(zzccaVar, zzbnrVar, zzgusVar), ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzfa)).intValue(), TimeUnit.MILLISECONDS, zzcbv.zzd);
            n1VarZzi.addListener(new zzbns(this), zzgusVar);
            ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) n1VarZzi.get();
            long jElapsedRealtime2 = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime() - jElapsedRealtime;
            StringBuilder sb2 = new StringBuilder(String.valueOf(jElapsedRealtime2).length() + 32);
            sb2.append("Http assets remote cache took ");
            sb2.append(jElapsedRealtime2);
            sb2.append("ms");
            com.google.android.gms.ads.internal.util.zze.zza(sb2.toString());
            zzbnl zzbnlVar = (zzbnl) new zzbxh(parcelFileDescriptor).zza(zzbnl.CREATOR);
            if (zzbnlVar == null) {
                return null;
            }
            if (zzbnlVar.zza) {
                throw new zzaqd(zzbnlVar.zzb);
            }
            String[] strArr3 = zzbnlVar.zze;
            String[] strArr4 = zzbnlVar.zzf;
            if (strArr3.length != strArr4.length) {
                return null;
            }
            HashMap map = new HashMap();
            for (int i11 = 0; i11 < strArr3.length; i11++) {
                map.put(strArr3[i11], strArr4[i11]);
            }
            return new zzapq(zzbnlVar.zzc, zzbnlVar.zzd, map, zzbnlVar.zzg, zzbnlVar.zzh);
        } catch (InterruptedException | ExecutionException unused) {
            long jElapsedRealtime3 = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime() - jElapsedRealtime;
            StringBuilder sb3 = new StringBuilder(String.valueOf(jElapsedRealtime3).length() + 32);
            sb3.append("Http assets remote cache took ");
            sb3.append(jElapsedRealtime3);
            sb3.append("ms");
            com.google.android.gms.ads.internal.util.zze.zza(sb3.toString());
            return null;
        } catch (Throwable th2) {
            long jElapsedRealtime4 = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime() - jElapsedRealtime;
            StringBuilder sb4 = new StringBuilder(String.valueOf(jElapsedRealtime4).length() + 32);
            sb4.append("Http assets remote cache took ");
            sb4.append(jElapsedRealtime4);
            sb4.append("ms");
            com.google.android.gms.ads.internal.util.zze.zza(sb4.toString());
            throw th2;
        }
    }

    public final /* synthetic */ void zzb() {
        if (this.zza == null) {
            return;
        }
        this.zza.disconnect();
        Binder.flushPendingCommands();
    }

    public final /* synthetic */ zzbni zzc() {
        return this.zza;
    }
}
