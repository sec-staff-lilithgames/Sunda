package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.TextureView;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public abstract class zzccx extends TextureView implements zzcdu {
    protected final zzcdl zza;
    protected final zzcdv zzb;

    public zzccx(Context context) {
        super(context);
        this.zza = new zzcdl();
        this.zzb = new zzcdv(context, this);
    }

    public abstract String zza();

    public abstract void zzb(zzccw zzccwVar);

    public abstract void zzc(String str);

    public abstract void zzd();

    public abstract void zze();

    public abstract void zzf();

    public abstract int zzg();

    public abstract int zzh();

    public abstract void zzi(int i10);

    public abstract void zzj(float f10, float f11);

    public abstract int zzk();

    public abstract int zzl();

    public abstract long zzm();

    public abstract long zzn();

    public abstract long zzo();

    public abstract int zzp();

    public abstract void zzq();

    public Integer zzw() {
        return null;
    }

    public void zzx(String str, String[] strArr, Integer num) {
        zzc(str);
    }

    public void zzA(int i10) {
    }

    public void zzB(int i10) {
    }

    public void zzC(int i10) {
    }

    public void zzy(int i10) {
    }

    public void zzz(int i10) {
    }
}
