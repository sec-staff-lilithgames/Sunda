package com.google.android.gms.internal.ads;

import android.os.Environment;
import android.util.Base64;
import com.google.android.gms.internal.ads.zzbdz;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzbdt {
    private final zzbdy zza;
    private final zzbdz.zzt.zza zzb;
    private final boolean zzc;

    private zzbdt() {
        this.zzb = zzbdz.zzt.zzx();
        this.zzc = false;
        this.zza = new zzbdy();
    }

    public static zzbdt zza() {
        return new zzbdt();
    }

    private final synchronized void zzd(int i10) {
        zzbdz.zzt.zza zzaVar = this.zzb;
        zzaVar.zzE();
        zzaVar.zzD(com.google.android.gms.ads.internal.util.zzs.zzk());
        zzbdx zzbdxVar = new zzbdx(this.zza, zzaVar.zzbu().zzaN(), null);
        int i11 = i10 - 1;
        zzbdxVar.zzb(i11);
        zzbdxVar.zza();
        com.google.android.gms.ads.internal.util.zze.zza("Logging Event with event code : ".concat(String.valueOf(Integer.toString(i11, 10))));
    }

    private final synchronized void zze(int i10) {
        File externalStorageDirectory = Environment.getExternalStorageDirectory();
        if (externalStorageDirectory == null) {
            return;
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(new File(zzftx.zza().zza(externalStorageDirectory, "clearcut_events.txt")), true);
            try {
                try {
                    fileOutputStream.write(zzf(i10).getBytes());
                } catch (IOException unused) {
                    com.google.android.gms.ads.internal.util.zze.zza("Could not write Clearcut to file.");
                    try {
                        fileOutputStream.close();
                    } catch (IOException unused2) {
                        com.google.android.gms.ads.internal.util.zze.zza("Could not close Clearcut output stream.");
                    }
                }
            } finally {
                try {
                    fileOutputStream.close();
                } catch (IOException unused3) {
                    com.google.android.gms.ads.internal.util.zze.zza("Could not close Clearcut output stream.");
                }
            }
        } catch (FileNotFoundException unused4) {
            com.google.android.gms.ads.internal.util.zze.zza("Could not find file for Clearcut");
        }
    }

    private final synchronized String zzf(int i10) {
        StringBuilder sb2;
        zzbdz.zzt.zza zzaVar = this.zzb;
        String strZzf = zzaVar.zzf();
        long jElapsedRealtime = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime();
        String strEncodeToString = Base64.encodeToString(zzaVar.zzbu().zzaN(), 3);
        sb2 = new StringBuilder("id=");
        sb2.append(strZzf);
        sb2.append(",timestamp=");
        sb2.append(jElapsedRealtime);
        sb2.append(",event=");
        sb2.append(i10 - 1);
        sb2.append(",data=");
        sb2.append(strEncodeToString);
        sb2.append("\n");
        return sb2.toString();
    }

    public final synchronized void zzb(zzbds zzbdsVar) {
        if (this.zzc) {
            try {
                zzbdsVar.zza(this.zzb);
            } catch (NullPointerException e10) {
                com.google.android.gms.ads.internal.zzt.zzh().zzg(e10, "AdMobClearcutLogger.modify");
            }
        }
    }

    public final synchronized void zzc(int i10) {
        if (this.zzc) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzfK)).booleanValue()) {
                zze(i10);
            } else {
                zzd(i10);
            }
        }
    }

    public zzbdt(zzbdy zzbdyVar) {
        this.zzb = zzbdz.zzt.zzx();
        this.zza = zzbdyVar;
        this.zzc = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzfJ)).booleanValue();
    }
}
