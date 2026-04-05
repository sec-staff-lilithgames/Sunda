package com.google.android.gms.internal.play_billing;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzcs {
    private final List zza = new ArrayList();

    public final zzcs zza(zzdh zzdhVar) {
        if (zzdhVar.zzd()) {
            throw new IllegalArgumentException(zzbf.zza("range must not be empty, but was %s", zzdhVar));
        }
        this.zza.add(zzdhVar);
        return this;
    }

    public final zzcs zzb(zzcs zzcsVar) {
        Iterator it = zzcsVar.zza.iterator();
        while (it.hasNext()) {
            zza((zzdh) it.next());
        }
        return this;
    }

    public final zzct zzc() {
        zzck zzckVar = new zzck(this.zza.size());
        Collections.sort(this.zza, zzdg.zza);
        Iterator it = this.zza.iterator();
        zzcy zzcyVar = it instanceof zzcy ? (zzcy) it : new zzcy(it);
        while (zzcyVar.hasNext()) {
            zzdh zzdhVarZzc = (zzdh) zzcyVar.next();
            while (zzcyVar.hasNext()) {
                zzdh zzdhVar = (zzdh) zzcyVar.zza();
                if (zzdhVarZzc.zza.compareTo(zzdhVar.zzb) > 0 || zzdhVar.zza.compareTo(zzdhVarZzc.zzb) > 0) {
                    break;
                }
                zzbe.zzd(zzdhVarZzc.zzb(zzdhVar).zzd(), "Overlapping ranges not permitted but found %s overlapping %s", zzdhVarZzc, zzdhVar);
                zzdhVarZzc = zzdhVarZzc.zzc((zzdh) zzcyVar.next());
            }
            zzckVar.zzd(zzdhVarZzc);
        }
        zzco zzcoVarZze = zzckVar.zze();
        if (zzcoVarZze.isEmpty()) {
            return zzct.zzb();
        }
        if (zzcoVarZze.size() == 1) {
            zzdx zzdxVarListIterator = zzcoVarZze.listIterator(0);
            Object next = zzdxVarListIterator.next();
            if (zzdxVarListIterator.hasNext()) {
                StringBuilder sb2 = new StringBuilder("expected one element but was: <");
                sb2.append(next);
                for (int i10 = 0; i10 < 4 && zzdxVarListIterator.hasNext(); i10++) {
                    sb2.append(", ");
                    sb2.append(zzdxVarListIterator.next());
                }
                if (zzdxVarListIterator.hasNext()) {
                    sb2.append(", ...");
                }
                sb2.append('>');
                throw new IllegalArgumentException(sb2.toString());
            }
            if (((zzdh) next).equals(zzdh.zza())) {
                return zzct.zza();
            }
        }
        return new zzct(zzcoVarZze);
    }
}
