package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public abstract class zzuc extends zztt {
    private final HashMap zza = new HashMap();
    private Handler zzb;
    private zzgz zzc;

    @Override // com.google.android.gms.internal.ads.zztt
    public final void zzM() {
        for (zzub zzubVar : this.zza.values()) {
            zzubVar.zza.zzq(zzubVar.zzb);
        }
    }

    @Override // com.google.android.gms.internal.ads.zztt
    public void zza(zzgz zzgzVar) {
        this.zzc = zzgzVar;
        this.zzb = zzep.zzc(null);
    }

    @Override // com.google.android.gms.internal.ads.zztt
    public final void zzc() {
        for (zzub zzubVar : this.zza.values()) {
            zzubVar.zza.zzr(zzubVar.zzb);
        }
    }

    @Override // com.google.android.gms.internal.ads.zztt
    public void zzd() {
        HashMap map = this.zza;
        for (zzub zzubVar : map.values()) {
            zzuw zzuwVar = zzubVar.zza;
            zzuwVar.zzs(zzubVar.zzb);
            zzua zzuaVar = zzubVar.zzc;
            zzuwVar.zzm(zzuaVar);
            zzuwVar.zzo(zzuaVar);
        }
        map.clear();
    }

    @Override // com.google.android.gms.internal.ads.zzuw
    public void zzt() throws IOException {
        Iterator it = this.zza.values().iterator();
        while (it.hasNext()) {
            ((zzub) it.next()).zza.zzt();
        }
    }

    public abstract void zzu(Object obj, zzuw zzuwVar, zzbf zzbfVar);

    public final void zzv(final Object obj, zzuw zzuwVar) {
        HashMap map = this.zza;
        zzgmd.zza(!map.containsKey(obj));
        zzuv zzuvVar = new zzuv() { // from class: com.google.android.gms.internal.ads.zztz
            @Override // com.google.android.gms.internal.ads.zzuv
            public final /* synthetic */ void zza(zzuw zzuwVar2, zzbf zzbfVar) {
                this.zza.zzu(obj, zzuwVar2, zzbfVar);
            }
        };
        zzua zzuaVar = new zzua(this, obj);
        map.put(obj, new zzub(zzuwVar, zzuvVar, zzuaVar));
        Handler handler = this.zzb;
        handler.getClass();
        zzuwVar.zzl(handler, zzuaVar);
        Handler handler2 = this.zzb;
        handler2.getClass();
        zzuwVar.zzn(handler2, zzuaVar);
        zzuwVar.zzp(zzuvVar, this.zzc, zzk());
        if (zzj()) {
            return;
        }
        zzuwVar.zzr(zzuvVar);
    }

    public int zzw(Object obj, int i10) {
        return 0;
    }

    public zzuu zzx(Object obj, zzuu zzuuVar) {
        throw null;
    }

    public long zzy(Object obj, long j10, zzuu zzuuVar) {
        return j10;
    }
}
