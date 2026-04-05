package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Callable;
import sh.n1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzeyg implements zzeya {
    private final Context zza;
    private final zzgus zzb;

    public zzeyg(Context context, zzgus zzgusVar) {
        this.zza = context;
        this.zzb = zzgusVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeya
    public final n1 zza() {
        return ((Boolean) zzbgm.zzb.zze()).booleanValue() ? this.zzb.submit(new Callable() { // from class: com.google.android.gms.internal.ads.zzeyf
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.zza.zzc();
            }
        }) : zzgui.zza(new zzeyh(-1, -1));
    }

    @Override // com.google.android.gms.internal.ads.zzeya
    public final int zzb() {
        return 59;
    }

    public final /* synthetic */ zzeyh zzc() {
        Context context = this.zza;
        return new zzeyh(zzbef.zzc(context), zzbef.zzd(context));
    }
}
