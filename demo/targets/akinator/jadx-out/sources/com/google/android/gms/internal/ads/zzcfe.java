package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.common.api.Releasable;
import java.lang.ref.WeakReference;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public abstract class zzcfe implements Releasable {
    protected final Context zza;
    protected final String zzb;
    protected final WeakReference zzc;

    public zzcfe(zzcdr zzcdrVar) {
        Context context = zzcdrVar.getContext();
        this.zza = context;
        this.zzb = com.google.android.gms.ads.internal.zzt.zzc().zze(context, zzcdrVar.zzs().afmaVersion);
        this.zzc = new WeakReference(zzcdrVar);
    }

    public abstract boolean zze(String str);

    public boolean zzf(String str, String[] strArr) {
        return zze(str);
    }

    public boolean zzg(String str, String[] strArr, zzcew zzcewVar) {
        return zze(str);
    }

    public abstract void zzl();

    public final void zzm(String str, String str2, long j10, long j11, boolean z10, long j12, long j13, long j14, int i10, int i11) {
        com.google.android.gms.ads.internal.util.client.zzf.zza.post(new zzcez(this, str, str2, j10, j11, j12, j13, j14, z10, i10, i11));
    }

    public final void zzn(String str, String str2, int i10, int i11, long j10, long j11, boolean z10, int i12, int i13) {
        com.google.android.gms.ads.internal.util.client.zzf.zza.post(new zzcfa(this, str, str2, i10, i11, j10, j11, z10, i12, i13));
    }

    public final void zzo(String str, String str2, int i10) {
        com.google.android.gms.ads.internal.util.client.zzf.zza.post(new zzcfb(this, str, str2, i10));
    }

    public final void zzp(String str, String str2, long j10) {
        com.google.android.gms.ads.internal.util.client.zzf.zza.post(new zzcfc(this, str, str2, j10));
    }

    public final void zzq(String str, String str2, String str3, String str4) {
        com.google.android.gms.ads.internal.util.client.zzf.zza.post(new zzcfd(this, str, str2, str3, str4));
    }

    public final /* synthetic */ void zzw(String str, Map map) {
        zzcdr zzcdrVar = (zzcdr) this.zzc.get();
        if (zzcdrVar != null) {
            zzcdrVar.zze("onPrecacheEvent", map);
        }
    }

    @Override // com.google.android.gms.common.api.Releasable
    public void release() {
    }

    public void zzh(int i10) {
    }

    public void zzi(int i10) {
    }

    public void zzj(int i10) {
    }

    public void zzk(int i10) {
    }
}
