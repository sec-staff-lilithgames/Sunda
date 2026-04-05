package com.google.android.gms.internal.ads;

import java.util.LinkedList;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzfib {
    private final int zzb;
    private final int zzc;
    private final LinkedList zza = new LinkedList();
    private final zzfja zzd = new zzfja();

    public zzfib(int i10, int i11) {
        this.zzb = i10;
        this.zzc = i11;
    }

    private final void zzi() {
        while (true) {
            LinkedList linkedList = this.zza;
            if (linkedList.isEmpty()) {
                return;
            }
            if (com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis() - ((zzfil) linkedList.getFirst()).zzd < this.zzc) {
                return;
            }
            this.zzd.zzc();
            linkedList.remove();
        }
    }

    public final boolean zza(zzfil zzfilVar) {
        this.zzd.zza();
        zzi();
        LinkedList linkedList = this.zza;
        if (linkedList.size() == this.zzb) {
            return false;
        }
        linkedList.add(zzfilVar);
        return true;
    }

    public final zzfil zzb() {
        zzfja zzfjaVar = this.zzd;
        zzfjaVar.zza();
        zzi();
        LinkedList linkedList = this.zza;
        if (linkedList.isEmpty()) {
            return null;
        }
        zzfil zzfilVar = (zzfil) linkedList.remove();
        if (zzfilVar != null) {
            zzfjaVar.zzb();
        }
        return zzfilVar;
    }

    public final int zzc() {
        zzi();
        return this.zza.size();
    }

    public final long zzd() {
        return this.zzd.zzd();
    }

    public final long zze() {
        return this.zzd.zze();
    }

    public final int zzf() {
        return this.zzd.zzf();
    }

    public final String zzg() {
        return this.zzd.zzh();
    }

    public final zzfiz zzh() {
        return this.zzd.zzg();
    }
}
