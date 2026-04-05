package com.google.android.gms.ads.nonagon.signalgeneration;

import android.os.Bundle;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.a;
import com.google.android.gms.internal.ads.zzbeu;
import com.google.android.gms.internal.ads.zzcaw;
import com.google.android.gms.internal.ads.zzcbv;
import com.google.android.gms.internal.ads.zzcxs;
import com.google.android.gms.internal.ads.zzcxt;
import com.google.android.gms.internal.ads.zzcyf;
import com.google.android.gms.internal.ads.zzdhk;
import com.google.android.gms.internal.ads.zzduq;
import com.google.android.gms.internal.ads.zzfkm;
import com.google.android.gms.internal.ads.zzfks;
import com.google.android.gms.internal.ads.zzgui;
import com.google.android.gms.internal.ads.zzifh;
import com.google.android.gms.internal.ads.zzifp;
import com.google.android.gms.internal.ads.zzifq;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import sh.n1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzbf implements zzifh {
    private final zzifq zza;
    private final zzifq zzb;
    private final zzifq zzc;
    private final zzifq zzd;
    private final zzifq zze;
    private final zzifq zzf;
    private final zzifq zzg;
    private final zzifq zzh;
    private final zzifq zzi;

    private zzbf(zzifq zzifqVar, zzifq zzifqVar2, zzifq zzifqVar3, zzifq zzifqVar4, zzifq zzifqVar5, zzifq zzifqVar6, zzifq zzifqVar7, zzifq zzifqVar8, zzifq zzifqVar9) {
        this.zza = zzifqVar;
        this.zzb = zzifqVar2;
        this.zzc = zzifqVar3;
        this.zzd = zzifqVar4;
        this.zze = zzifqVar5;
        this.zzf = zzifqVar6;
        this.zzg = zzifqVar7;
        this.zzh = zzifqVar8;
        this.zzi = zzifqVar9;
    }

    public static zzbf zza(zzifq zzifqVar, zzifq zzifqVar2, zzifq zzifqVar3, zzifq zzifqVar4, zzifq zzifqVar5, zzifq zzifqVar6, zzifq zzifqVar7, zzifq zzifqVar8, zzifq zzifqVar9) {
        return new zzbf(zzifqVar, zzifqVar2, zzifqVar3, zzifqVar4, zzifqVar5, zzifqVar6, zzifqVar7, zzifqVar8, zzifqVar9);
    }

    @Override // com.google.android.gms.internal.ads.zzifw, com.google.android.gms.internal.ads.zzifv
    public final /* bridge */ /* synthetic */ Object zzb() throws JSONException {
        n1 n1VarZzi;
        zzau zzauVar = (zzau) this.zza.zzb();
        zzfks zzfksVar = (zzfks) this.zzb.zzb();
        zzbh zzbhVarZzb = ((zzbi) this.zzc).zzb();
        zzcxs zzcxsVarZzb = ((zzcxt) this.zzd).zzb();
        zzdhk zzdhkVar = (zzdhk) this.zze.zzb();
        zzb zzbVar = (zzb) this.zzf.zzb();
        zzcaw zzcawVar = (zzcaw) this.zzg.zzb();
        int iIntValue = ((Integer) this.zzh.zzb()).intValue();
        Bundle bundle = ((zzcyf) this.zzi).zza().zzt;
        zzbj zzbjVarZzb = null;
        if (iIntValue == 1 && zzcawVar != null) {
            a.q(bundle, zzduq.READ_FROM_DISK_START.zza());
            zzbjVarZzb = zzbVar.zzb(zzcawVar, zzauVar, bundle);
            a.q(bundle, zzduq.READ_FROM_DISK_END.zza());
        }
        if (zzbjVarZzb != null) {
            zzdhkVar.zza(zzbjVarZzb);
            n1VarZzi = zzgui.zza(zzbjVarZzb);
        } else {
            n1VarZzi = zzfksVar.zza(zzfkm.GENERATE_SIGNALS, zzcxsVarZzb.zzb()).zzc(zzbhVarZzb).zzh(((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzgi)).intValue(), TimeUnit.SECONDS).zzi();
            zzgui.zzr(n1VarZzi, new zzaw(zzdhkVar), zzcbv.zza);
        }
        zzifp.zzb(n1VarZzi);
        return n1VarZzi;
    }
}
