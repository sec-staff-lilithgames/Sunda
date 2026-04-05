package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzhuc extends zzhtn {
    static final zzhuc zza = new zzhuc();

    private zzhuc() {
    }

    @Override // com.google.android.gms.internal.ads.zzhtn
    /* renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final void zza(zzhun zzhunVar, zzhtg zzhtgVar) throws IOException {
        if (zzhtgVar == null || (zzhtgVar instanceof zzhth)) {
            zzhunVar.zzj();
            return;
        }
        if (zzhtgVar instanceof zzhtk) {
            zzhtk zzhtkVarZzg = zzhtgVar.zzg();
            if (zzhtkVarZzg.zzc()) {
                zzhunVar.zzi(zzhtkVarZzg.zzh());
                return;
            } else if (zzhtkVarZzg.zza()) {
                zzhunVar.zzh(zzhtkVarZzg.zzb());
                return;
            } else {
                zzhunVar.zzg(zzhtkVarZzg.zzd());
                return;
            }
        }
        if (zzhtgVar instanceof zzhtf) {
            zzhunVar.zzb();
            Iterator it = zzhtgVar.zzf().iterator();
            while (it.hasNext()) {
                zza(zzhunVar, (zzhtg) it.next());
            }
            zzhunVar.zzc();
            return;
        }
        if (!(zzhtgVar instanceof zzhti)) {
            throw new IllegalArgumentException("Couldn't write ".concat(String.valueOf(zzhtgVar.getClass())));
        }
        zzhunVar.zzd();
        for (Map.Entry entry : zzhtgVar.zze().zzb()) {
            zzhunVar.zzf((String) entry.getKey());
            zza(zzhunVar, (zzhtg) entry.getValue());
        }
        zzhunVar.zze();
    }
}
