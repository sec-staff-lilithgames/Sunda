package com.google.android.gms.internal.ads;

import android.os.ParcelFileDescriptor;
import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzebs extends zzbxa {
    final /* synthetic */ zzebu zza;

    public zzebs(zzebu zzebuVar) {
        Objects.requireNonNull(zzebuVar);
        this.zza = zzebuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbxb
    public final void zze(ParcelFileDescriptor parcelFileDescriptor) {
        ParcelFileDescriptor.AutoCloseInputStream autoCloseInputStream = new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor);
        zzebu zzebuVar = this.zza;
        zzebuVar.zza.zzc(new zzeck(autoCloseInputStream, zzebuVar.zze));
    }

    @Override // com.google.android.gms.internal.ads.zzbxb
    public final void zzf(com.google.android.gms.ads.internal.util.zzba zzbaVar) {
        this.zza.zza.zzd(zzbaVar.zzb());
    }

    @Override // com.google.android.gms.internal.ads.zzbxb
    public final void zzg(ParcelFileDescriptor parcelFileDescriptor, zzbxj zzbxjVar) {
        this.zza.zza.zzc(new zzeck(new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor), zzbxjVar));
    }
}
