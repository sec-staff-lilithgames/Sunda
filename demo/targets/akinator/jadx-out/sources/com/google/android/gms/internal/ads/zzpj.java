package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.media.AudioDeviceInfo;
import android.net.Uri;
import android.os.Handler;
import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzpj {
    private final Context zza;
    private final zzpi zzb;
    private final Handler zzc;
    private final zzpf zzd;
    private final BroadcastReceiver zze;
    private final zzpg zzf;
    private zzpe zzg;
    private AudioDeviceInfo zzh;
    private zzd zzi;
    private boolean zzj;

    /* JADX WARN: Multi-variable type inference failed */
    public zzpj(Context context, zzpi zzpiVar, zzd zzdVar, AudioDeviceInfo audioDeviceInfo) {
        Context applicationContext = context.getApplicationContext();
        this.zza = applicationContext;
        this.zzb = zzpiVar;
        this.zzi = zzdVar;
        this.zzh = audioDeviceInfo;
        Handler handler = new Handler(zzep.zze(), null);
        this.zzc = handler;
        this.zzd = new zzpf(this, 0 == true ? 1 : 0);
        this.zze = new zzph(this, 0 == true ? 1 : 0);
        Uri uriZzc = zzpe.zzc();
        this.zzf = uriZzc != null ? new zzpg(this, handler, applicationContext.getContentResolver(), uriZzc) : null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzk, reason: merged with bridge method [inline-methods] */
    public final void zzf(zzpe zzpeVar) {
        if (!this.zzj || zzpeVar.equals(this.zzg)) {
            return;
        }
        this.zzg = zzpeVar;
        this.zzb.zza(zzpeVar);
    }

    public final void zza(zzpe zzpeVar) {
        zzf(zzpeVar);
    }

    public final void zzb(zzd zzdVar) {
        this.zzi = zzdVar;
        zzf(zzpe.zza(this.zza, zzdVar, this.zzh));
    }

    public final void zzc(AudioDeviceInfo audioDeviceInfo) {
        if (Objects.equals(audioDeviceInfo, this.zzh)) {
            return;
        }
        this.zzh = audioDeviceInfo;
        zzf(zzpe.zza(this.zza, this.zzi, audioDeviceInfo));
    }

    public final zzpe zzd() {
        if (this.zzj) {
            zzpe zzpeVar = this.zzg;
            zzpeVar.getClass();
            return zzpeVar;
        }
        this.zzj = true;
        zzpg zzpgVar = this.zzf;
        if (zzpgVar != null) {
            zzpgVar.zza();
        }
        Context context = this.zza;
        zzpf zzpfVar = this.zzd;
        Handler handler = this.zzc;
        zzcb.zza(context).registerAudioDeviceCallback(zzpfVar, handler);
        zzpe zzpeVarZzb = zzpe.zzb(context, context.registerReceiver(this.zze, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"), null, handler), this.zzi, this.zzh);
        this.zzg = zzpeVarZzb;
        return zzpeVarZzb;
    }

    public final void zze() {
        if (this.zzj) {
            this.zzg = null;
            Context context = this.zza;
            zzcb.zza(context).unregisterAudioDeviceCallback(this.zzd);
            context.unregisterReceiver(this.zze);
            zzpg zzpgVar = this.zzf;
            if (zzpgVar != null) {
                zzpgVar.zzb();
            }
            this.zzj = false;
        }
    }

    public final /* synthetic */ Context zzg() {
        return this.zza;
    }

    public final /* synthetic */ AudioDeviceInfo zzh() {
        return this.zzh;
    }

    public final /* synthetic */ void zzi(AudioDeviceInfo audioDeviceInfo) {
        this.zzh = null;
    }

    public final /* synthetic */ zzd zzj() {
        return this.zzi;
    }
}
