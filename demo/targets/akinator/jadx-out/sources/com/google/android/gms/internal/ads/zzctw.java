package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import sh.n1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzctw implements zzekw {
    public final List zza;

    public zzctw(List list) {
        this.zza = list;
    }

    public static zzehk zza(zzejq zzejqVar) {
        return new zzehl(zzejqVar, zzctv.zza);
    }

    public static zzehk zzb(zzehk zzehkVar) {
        return new zzehl(zzehkVar, zzctu.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzekw
    public final void zzm() {
        Iterator it = this.zza.iterator();
        while (it.hasNext()) {
            zzgui.zzr((n1) it.next(), new zzctt(this), zzguz.zza());
        }
    }

    public zzctw(zzcto zzctoVar) {
        this.zza = Collections.singletonList(zzgui.zza(zzctoVar));
    }
}
