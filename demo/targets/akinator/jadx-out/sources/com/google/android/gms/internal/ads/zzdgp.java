package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzdgp extends zzdem implements zzbau {
    private final Map zzb;
    private final Context zzc;
    private final zzffu zzd;

    public zzdgp(Context context, Set set, zzffu zzffuVar) {
        super(set);
        this.zzb = new WeakHashMap(1);
        this.zzc = context;
        this.zzd = zzffuVar;
    }

    public final synchronized void zza(View view) {
        try {
            Map map = this.zzb;
            zzbaw zzbawVar = (zzbaw) map.get(view);
            if (zzbawVar == null) {
                zzbaw zzbawVar2 = new zzbaw(this.zzc, view);
                zzbawVar2.zza(this);
                map.put(view, zzbawVar2);
                zzbawVar = zzbawVar2;
            }
            if (this.zzd.zzX) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzbG)).booleanValue()) {
                    zzbawVar.zzd(((Long) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzbF)).longValue());
                    return;
                }
            }
            zzbawVar.zze();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void zzb(View view) {
        Map map = this.zzb;
        if (map.containsKey(view)) {
            ((zzbaw) map.get(view)).zzb(this);
            map.remove(view);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbau
    public final synchronized void zzdo(final zzbat zzbatVar) {
        zzs(new zzdel() { // from class: com.google.android.gms.internal.ads.zzdgo
            @Override // com.google.android.gms.internal.ads.zzdel
            public final /* synthetic */ void zza(Object obj) {
                ((zzbau) obj).zzdo(zzbatVar);
            }
        });
    }
}
