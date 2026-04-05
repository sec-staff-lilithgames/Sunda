package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.io.IOException;
import java.util.concurrent.Executor;
import org.json.JSONException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzejk implements zzehq {
    private final Context zza;
    private final zzdjd zzb;
    private final VersionInfoParcel zzc;
    private final Executor zzd;

    public zzejk(Context context, VersionInfoParcel versionInfoParcel, zzdjd zzdjdVar, Executor executor) {
        this.zza = context;
        this.zzc = versionInfoParcel;
        this.zzb = zzdjdVar;
        this.zzd = executor;
    }

    @Override // com.google.android.gms.internal.ads.zzehq
    public final void zza(zzfgf zzfgfVar, zzffu zzffuVar, zzehn zzehnVar) throws JSONException, zzfgu, IOException {
        zzfhl zzfhlVar = (zzfhl) zzehnVar.zzb;
        zzfgn zzfgnVar = zzfgfVar.zza.zza;
        String string = zzffuVar.zzv.toString();
        String strZzm = com.google.android.gms.ads.internal.util.zzbp.zzm(zzffuVar.zzs);
        zzfhlVar.zzh(this.zza, zzfgnVar.zzd, string, strZzm, (zzbrp) zzehnVar.zzc);
    }

    @Override // com.google.android.gms.internal.ads.zzehq
    public final /* bridge */ /* synthetic */ Object zzb(zzfgf zzfgfVar, zzffu zzffuVar, zzehn zzehnVar) throws zzfgu, zzekz {
        zzdhx zzdhxVarZzd = this.zzb.zzd(new zzcue(zzfgfVar, zzffuVar, zzehnVar.zza), new zzdia(new zzejj(this, zzehnVar, zzffuVar), null));
        zzdhxVarZzd.zza().zzq(new zzcou((zzfhl) zzehnVar.zzb), this.zzd);
        ((zzeiz) zzehnVar.zzc).zzc(zzdhxVarZzd.zzf());
        return zzdhxVarZzd.zzh();
    }

    public final /* synthetic */ VersionInfoParcel zzc() {
        return this.zzc;
    }
}
