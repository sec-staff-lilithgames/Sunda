package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.concurrent.ExecutionException;
import sh.n1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzeit implements zzehq {
    private final Context zza;
    private final zzcsl zzb;
    private View zzc;
    private zzbrs zzd;

    public zzeit(Context context, zzcsl zzcslVar) {
        this.zza = context;
        this.zzb = zzcslVar;
    }

    @Override // com.google.android.gms.internal.ads.zzehq
    public final void zza(zzfgf zzfgfVar, zzffu zzffuVar, zzehn zzehnVar) throws zzfgu {
        try {
            zzbti zzbtiVar = (zzbti) zzehnVar.zzb;
            zzbtiVar.zzo(zzffuVar.zzZ);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zziI)).booleanValue() && zzffuVar.zzag) {
                String str = zzffuVar.zzU;
                String string = zzffuVar.zzv.toString();
                zzfgn zzfgnVar = zzfgfVar.zza.zza;
                zzbtiVar.zzq(str, string, zzfgnVar.zzd, ObjectWrapper.wrap(this.zza), new zzeis(this, zzehnVar, null), (zzbrp) zzehnVar.zzc, zzfgnVar.zzf);
                return;
            }
            String str2 = zzffuVar.zzU;
            String string2 = zzffuVar.zzv.toString();
            zzfgn zzfgnVar2 = zzfgfVar.zza.zza;
            zzbtiVar.zzi(str2, string2, zzfgnVar2.zzd, ObjectWrapper.wrap(this.zza), new zzeis(this, zzehnVar, null), (zzbrp) zzehnVar.zzc, zzfgnVar2.zzf);
        } catch (RemoteException e10) {
            throw new zzfgu(e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzehq
    public final /* bridge */ /* synthetic */ Object zzb(zzfgf zzfgfVar, final zzffu zzffuVar, final zzehn zzehnVar) throws zzfgu, zzekz {
        final View view;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zziI)).booleanValue() && zzffuVar.zzag) {
            try {
                view = (View) ObjectWrapper.unwrap(this.zzd.zze());
                boolean zZzf = this.zzd.zzf();
                if (view == null) {
                    throw new zzfgu(new Exception("BannerRtbAdapterWrapper interscrollerView should not be null"));
                }
                if (zZzf) {
                    try {
                        view = (View) zzgui.zzj(zzgui.zza(null), new zzgtq() { // from class: com.google.android.gms.internal.ads.zzeiq
                            @Override // com.google.android.gms.internal.ads.zzgtq
                            public final /* synthetic */ n1 zza(Object obj) {
                                return this.zza.zzc(view, zzffuVar, obj);
                            }
                        }, zzcbv.zzf).get();
                    } catch (InterruptedException | ExecutionException e10) {
                        throw new zzfgu(e10);
                    }
                }
            } catch (RemoteException e11) {
                throw new zzfgu(e11);
            }
        } else {
            view = this.zzc;
        }
        zzcrh zzcrhVarZzf = this.zzb.zzf(new zzcue(zzfgfVar, zzffuVar, zzehnVar.zza), new zzcrn(view, null, new zzctm() { // from class: com.google.android.gms.internal.ads.zzeir
            @Override // com.google.android.gms.internal.ads.zzctm
            public final /* synthetic */ com.google.android.gms.ads.internal.client.zzed zza() throws zzfgu {
                try {
                    return ((zzbti) zzehnVar.zzb).zzh();
                } catch (RemoteException e12) {
                    throw new zzfgu(e12);
                }
            }
        }, (zzffv) zzffuVar.zzu.get(0)));
        zzcrhVarZzf.zzk().zza(view);
        ((zzeiz) zzehnVar.zzc).zzc(zzcrhVarZzf.zzg());
        return zzcrhVarZzf.zzi();
    }

    public final /* synthetic */ n1 zzc(View view, zzffu zzffuVar, Object obj) {
        return zzgui.zza(zzcta.zza(this.zza, view, zzffuVar));
    }

    public final /* synthetic */ void zzd(View view) {
        this.zzc = view;
    }

    public final /* synthetic */ void zze(zzbrs zzbrsVar) {
        this.zzd = zzbrsVar;
    }
}
