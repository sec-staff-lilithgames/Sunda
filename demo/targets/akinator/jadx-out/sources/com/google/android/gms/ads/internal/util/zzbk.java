package com.google.android.gms.ads.internal.util;

import com.google.android.gms.internal.ads.zzapq;
import com.google.android.gms.internal.ads.zzapu;
import com.google.android.gms.internal.ads.zzaqa;
import com.google.android.gms.internal.ads.zzaqr;
import com.google.android.gms.internal.ads.zzcca;
import com.ironsource.C3271ic;
import java.io.IOException;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzbk extends zzapu {
    private final zzcca zza;
    private final com.google.android.gms.ads.internal.util.client.zzl zzb;

    public zzbk(String str, Map map, zzcca zzccaVar) throws IOException {
        super(0, str, new zzbj(zzccaVar));
        this.zza = zzccaVar;
        com.google.android.gms.ads.internal.util.client.zzl zzlVar = new com.google.android.gms.ads.internal.util.client.zzl(null);
        this.zzb = zzlVar;
        zzlVar.zzb(str, C3271ic.f36943a, null, null);
    }

    @Override // com.google.android.gms.internal.ads.zzapu
    public final zzaqa zzr(zzapq zzapqVar) {
        return zzaqa.zza(zzapqVar, zzaqr.zza(zzapqVar));
    }

    @Override // com.google.android.gms.internal.ads.zzapu
    public final /* bridge */ /* synthetic */ void zzs(Object obj) throws IOException {
        zzapq zzapqVar = (zzapq) obj;
        Map map = zzapqVar.zzc;
        int i10 = zzapqVar.zza;
        com.google.android.gms.ads.internal.util.client.zzl zzlVar = this.zzb;
        zzlVar.zzd(map, i10);
        byte[] bArr = zzapqVar.zzb;
        if (com.google.android.gms.ads.internal.util.client.zzl.zzj() && bArr != null) {
            zzlVar.zzf(bArr);
        }
        this.zza.zzc(zzapqVar);
    }
}
