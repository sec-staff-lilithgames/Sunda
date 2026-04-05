package com.google.android.gms.internal.ads;

import android.content.pm.PackageInfo;
import android.os.Bundle;
import java.util.ArrayList;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzewb implements zzexy {
    private final zzfgn zza;
    private final PackageInfo zzb;
    private final com.google.android.gms.ads.internal.util.zzg zzc;

    public zzewb(zzfgn zzfgnVar, PackageInfo packageInfo, com.google.android.gms.ads.internal.util.zzg zzgVar) {
        this.zza = zzfgnVar;
        this.zzb = packageInfo;
        this.zzc = zzgVar;
    }

    private final void zzc(Bundle bundle) {
        int i10;
        zzbhx zzbhxVar = this.zza.zzj;
        if (zzbhxVar == null || (i10 = zzbhxVar.zzi) == 0) {
            return;
        }
        bundle.putBoolean("sccg_tap", zzbhxVar.zzj);
        bundle.putInt("sccg_dir", i10);
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x00e1  */
    @Override // com.google.android.gms.internal.ads.zzexy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ void zza(java.lang.Object r13) {
        /*
            Method dump skipped, instructions count: 355
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzewb.zza(java.lang.Object):void");
    }

    @Override // com.google.android.gms.internal.ads.zzexy
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        ArrayList arrayList = this.zza.zzh;
        zzcxq zzcxqVar = (zzcxq) obj;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        zzc(zzcxqVar.zzb);
    }
}
