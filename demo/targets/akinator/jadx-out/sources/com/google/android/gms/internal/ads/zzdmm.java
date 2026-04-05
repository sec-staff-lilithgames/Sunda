package com.google.android.gms.internal.ads;

import android.view.MotionEvent;
import android.view.ViewGroup;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzdmm implements zzbhv {
    final /* synthetic */ zzdnn zza;
    final /* synthetic */ ViewGroup zzb;

    public zzdmm(zzdnn zzdnnVar, ViewGroup viewGroup) {
        this.zza = zzdnnVar;
        this.zzb = viewGroup;
    }

    @Override // com.google.android.gms.internal.ads.zzbhv
    public final void zza() {
        zzgpe zzgpeVar = zzdml.zza;
        zzdnn zzdnnVar = this.zza;
        Map mapZzk = zzdnnVar.zzk();
        if (mapZzk == null) {
            return;
        }
        int size = zzgpeVar.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = mapZzk.get((String) zzgpeVar.get(i10));
            i10++;
            if (obj != null) {
                zzdnnVar.onClick(this.zzb);
                return;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbhv
    public final void zzb(MotionEvent motionEvent) {
        this.zza.onTouch(null, motionEvent);
    }

    @Override // com.google.android.gms.internal.ads.zzbhv
    public final JSONObject zzc() {
        return this.zza.zzp();
    }

    @Override // com.google.android.gms.internal.ads.zzbhv
    public final JSONObject zzd() {
        return this.zza.zzq();
    }
}
