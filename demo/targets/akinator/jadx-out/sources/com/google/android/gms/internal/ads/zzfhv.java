package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import java.util.HashSet;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzfhv implements zzcyr {
    private final HashSet zza = new HashSet();
    private final Context zzb;
    private final zzcbn zzc;

    public zzfhv(Context context, zzcbn zzcbnVar) {
        this.zzb = context;
        this.zzc = zzcbnVar;
    }

    public final synchronized void zzb(HashSet hashSet) {
        HashSet hashSet2 = this.zza;
        hashSet2.clear();
        hashSet2.addAll(hashSet);
    }

    public final Bundle zzc() {
        return this.zzc.zzn(this.zzb, this);
    }

    @Override // com.google.android.gms.internal.ads.zzcyr
    public final synchronized void zzdN(com.google.android.gms.ads.internal.client.zze zzeVar) {
        if (zzeVar.zza != 3) {
            this.zzc.zzc(this.zza);
        }
    }
}
