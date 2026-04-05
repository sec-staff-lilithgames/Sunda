package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzfnt extends com.google.android.gms.ads.internal.client.zzcj {
    private final zzfnz zza;
    private final zzfnm zzb;

    public zzfnt(zzfnz zzfnzVar, zzfnm zzfnmVar) {
        this.zza = zzfnzVar;
        this.zzb = zzfnmVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzck
    public final void zze(List list, com.google.android.gms.ads.internal.client.zzce zzceVar) {
        this.zza.zza(list, zzceVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzck
    public final boolean zzf(String str) {
        return this.zza.zzb(str);
    }

    @Override // com.google.android.gms.ads.internal.client.zzck
    public final zzbyo zzg(String str) {
        return this.zza.zzc(str);
    }

    @Override // com.google.android.gms.ads.internal.client.zzck
    public final boolean zzh(String str) {
        return this.zza.zzd(str);
    }

    @Override // com.google.android.gms.ads.internal.client.zzck
    public final zzbcn zzi(String str) {
        return this.zza.zze(str);
    }

    @Override // com.google.android.gms.ads.internal.client.zzck
    public final boolean zzj(String str) {
        return this.zza.zzf(str);
    }

    @Override // com.google.android.gms.ads.internal.client.zzck
    public final com.google.android.gms.ads.internal.client.zzbx zzk(String str) {
        return this.zza.zzg(str);
    }

    @Override // com.google.android.gms.ads.internal.client.zzck
    public final boolean zzm(String str, com.google.android.gms.ads.internal.client.zzft zzftVar, com.google.android.gms.ads.internal.client.zzch zzchVar) {
        return this.zzb.zza(str, zzftVar, zzchVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzck
    public final boolean zzn(int i10, String str) {
        AdFormat adFormat = AdFormat.getAdFormat(i10);
        if (adFormat == null) {
            return false;
        }
        return this.zzb.zzb(adFormat, str);
    }

    @Override // com.google.android.gms.ads.internal.client.zzck
    public final com.google.android.gms.ads.internal.client.zzbx zzo(String str) {
        return this.zzb.zze(str);
    }

    @Override // com.google.android.gms.ads.internal.client.zzck
    public final zzbcn zzp(String str) {
        return this.zzb.zzd(str);
    }

    @Override // com.google.android.gms.ads.internal.client.zzck
    public final zzbyo zzq(String str) {
        return this.zzb.zzc(str);
    }

    @Override // com.google.android.gms.ads.internal.client.zzck
    public final com.google.android.gms.ads.internal.client.zzft zzr(int i10, String str) {
        AdFormat adFormat = AdFormat.getAdFormat(i10);
        if (adFormat == null) {
            return null;
        }
        return this.zzb.zzf(adFormat, str);
    }

    @Override // com.google.android.gms.ads.internal.client.zzck
    public final Bundle zzs(int i10) {
        Map mapZzh = this.zzb.zzh(i10);
        Bundle bundle = new Bundle();
        for (Map.Entry entry : mapZzh.entrySet()) {
            bundle.putByteArray((String) entry.getKey(), SafeParcelableSerializer.serializeToBytes((com.google.android.gms.ads.internal.client.zzft) entry.getValue()));
        }
        return bundle;
    }

    @Override // com.google.android.gms.ads.internal.client.zzck
    public final int zzt(int i10, String str) {
        AdFormat adFormat = AdFormat.getAdFormat(i10);
        if (adFormat == null) {
            return 0;
        }
        return this.zzb.zzg(adFormat, str);
    }

    @Override // com.google.android.gms.ads.internal.client.zzck
    public final boolean zzu(int i10, String str) {
        AdFormat adFormat = AdFormat.getAdFormat(i10);
        if (adFormat == null) {
            return false;
        }
        return this.zzb.zzi(adFormat, str);
    }

    @Override // com.google.android.gms.ads.internal.client.zzck
    public final void zzv(int i10) {
        this.zzb.zzj(i10);
    }

    @Override // com.google.android.gms.ads.internal.client.zzck
    public final void zzl(zzbrj zzbrjVar) {
    }
}
