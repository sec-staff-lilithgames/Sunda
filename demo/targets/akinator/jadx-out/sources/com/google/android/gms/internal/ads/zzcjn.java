package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import java.util.Arrays;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public abstract class zzcjn implements zzcnr {
    private static zzcjn zza;

    private static synchronized zzcjn zzH(Context context, zzbrj zzbrjVar, int i10, boolean z10, int i11, zzckv zzckvVar) {
        try {
            zzcjn zzcjnVar = zza;
            if (zzcjnVar != null) {
                return zzcjnVar;
            }
            long jCurrentTimeMillis = com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis();
            zzbeu.zza(context);
            if (((Boolean) zzbgm.zze.zze()).booleanValue()) {
                zzbef.zza(context);
            }
            zzfhj zzfhjVarZza = zzfhj.zza(context);
            VersionInfoParcel versionInfoParcelZzb = zzfhjVarZza.zzb(ModuleDescriptor.MODULE_VERSION, false, i11);
            zzfhjVarZza.zzc(zzbrjVar);
            zzclk zzclkVar = new zzclk(null);
            zzcjo zzcjoVar = new zzcjo();
            zzcjoVar.zza(versionInfoParcelZzb);
            zzcjoVar.zzb(context);
            zzcjoVar.zzc(jCurrentTimeMillis);
            zzclkVar.zza(new zzcjp(zzcjoVar, null));
            zzclkVar.zzb(new zzcmh(zzckvVar));
            zzcjn zzcjnVarZzc = zzclkVar.zzc();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzoE)).booleanValue()) {
                com.google.android.gms.ads.internal.zzt.zze().zza(zzfjn.zzc(), zzcjnVarZzc.zzD());
                com.google.android.gms.ads.internal.zzt.zze().zzb();
            }
            ((zzdzt) ((zzckz) zzcjnVarZzc).zzo.zzb()).zza();
            ((zzcjg) ((zzckz) zzcjnVarZzc).zzn.zzb()).zza(context, versionInfoParcelZzb);
            com.google.android.gms.ads.internal.zzt.zzh().zze(context, versionInfoParcelZzb, zzcjnVarZzc.zzD());
            com.google.android.gms.ads.internal.zzt.zzj().zza(context);
            com.google.android.gms.ads.internal.zzt.zzc().zzc(context);
            com.google.android.gms.ads.internal.zzt.zzc().zzd(context);
            com.google.android.gms.ads.internal.util.zzd.zza(context);
            com.google.android.gms.ads.internal.zzt.zzg().zza(context);
            com.google.android.gms.ads.internal.zzt.zzA().zza(context);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzoX)).booleanValue()) {
                String str = (String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzoY);
                if (!str.isEmpty()) {
                    if (Arrays.asList(str.split(",")).contains(context.getPackageName())) {
                        zzcjnVarZzc.zzE().zza(com.google.android.gms.ads.internal.zzt.zzg());
                    }
                }
            } else {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzoW)).booleanValue()) {
                    zzcjnVarZzc.zzE().zza(com.google.android.gms.ads.internal.zzt.zzg());
                }
            }
            ((com.google.android.gms.ads.internal.util.zzbz) ((zzckz) zzcjnVarZzc).zzao.zzb()).zza();
            zzcag.zzb(context);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzgL)).booleanValue()) {
                if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzaP)).booleanValue()) {
                    new zzefm(context, versionInfoParcelZzb, new zzbdt(new zzbdy(context)), new zzeer(new zzeen(context), (zzgus) ((zzckz) zzcjnVarZzc).zzd.zzb())).zza(com.google.android.gms.ads.internal.zzt.zzh().zzo().zzx());
                }
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzoQ)).booleanValue()) {
                zzcjnVarZzc.zzg().zza();
            }
            zza = zzcjnVarZzc;
            return zzcjnVarZzc;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public static zzcjn zza(Context context, zzbrj zzbrjVar, int i10) {
        return zzH(context, zzbrjVar, ModuleDescriptor.MODULE_VERSION, false, i10, new zzckv());
    }

    public abstract zzdwz zzA();

    public abstract zzfhd zzB();

    public abstract zzdzl zzC();

    public abstract zzdvi zzD();

    public abstract zzdsq zzE();

    @Override // com.google.android.gms.internal.ads.zzcnr
    public final zzcaz zzF() {
        return zzG();
    }

    public abstract zzcaz zzG();

    public abstract Executor zzb();

    public abstract ScheduledExecutorService zzc();

    public abstract zzdbp zzd();

    public abstract zzcms zze();

    public abstract zzfnt zzf();

    public abstract zzecy zzg();

    public abstract zzeda zzh();

    public abstract zzcsk zzi();

    public abstract zzfck zzj();

    public abstract zzcqt zzk();

    public abstract zzfax zzl();

    public abstract zzdjc zzm();

    public abstract zzfea zzn();

    public abstract zzdjy zzo();

    public abstract zzdrm zzp();

    public abstract zzffn zzq();

    public abstract com.google.android.gms.ads.nonagon.signalgeneration.zzab zzr();

    public abstract com.google.android.gms.ads.nonagon.signalgeneration.zzau zzs();

    public abstract com.google.android.gms.ads.nonagon.signalgeneration.zzv zzt();

    public abstract zzegj zzu();

    public abstract zzfhm zzv();

    public abstract zzdyo zzw();

    public abstract zzflp zzx();

    @Override // com.google.android.gms.internal.ads.zzcnr
    public final zzezc zzy(zzbxj zzbxjVar, int i10) {
        return zzz(new zzfaf(zzbxjVar, i10));
    }

    public abstract zzezc zzz(zzfaf zzfafVar);
}
