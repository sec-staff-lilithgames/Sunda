package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.concurrent.Callable;
import sh.n1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzeru implements zzeya {
    private final zzgus zza;
    private final VersionInfoParcel zzb;

    public zzeru(VersionInfoParcel versionInfoParcel, zzgus zzgusVar) {
        this.zzb = versionInfoParcel;
        this.zza = zzgusVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeya
    public final n1 zza() {
        return this.zza.submit(new Callable() { // from class: com.google.android.gms.internal.ads.zzert
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.zza.zzc();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzeya
    public final int zzb() {
        return 54;
    }

    public final /* synthetic */ zzerv zzc() {
        return zzerv.zzc(this.zzb);
    }
}
