package com.google.android.gms.internal.ads;

import b0.e2;
import com.inmobi.commons.core.configs.AdConfig;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzgvz {
    private final List zza = new ArrayList();
    private final zzhel zzb = zzhel.zza;
    private boolean zzc = false;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzd, reason: merged with bridge method [inline-methods] */
    public final void zzc() {
        Iterator it = this.zza.iterator();
        while (it.hasNext()) {
            ((zzgvx) it.next()).zzd(false);
        }
    }

    public final zzgvz zza(zzgvx zzgvxVar) {
        if (zzgvxVar.zzh() != null) {
            throw new IllegalStateException("Entry has already been added to a KeysetHandle.Builder");
        }
        if (zzgvxVar.zzc()) {
            zzc();
        }
        zzgvxVar.zzi(this);
        this.zza.add(zzgvxVar);
        return this;
    }

    public final zzgwe zzb() throws GeneralSecurityException {
        int i10;
        if (this.zzc) {
            throw new GeneralSecurityException("KeysetHandle.Builder#build must only be called once");
        }
        this.zzc = true;
        List<zzgvx> list = this.zza;
        zzhld zzhldVarZzh = zzhlg.zzh();
        ArrayList arrayList = new ArrayList(list.size());
        int i11 = 0;
        while (i11 < list.size() - 1) {
            int i12 = i11 + 1;
            if (((zzgvx) list.get(i11)).zzg() == zzgvy.zza && ((zzgvx) list.get(i12)).zzg() != zzgvy.zza) {
                throw new GeneralSecurityException("Entries with 'withRandomId()' may only be followed by other entries with 'withRandomId()'.");
            }
            i11 = i12;
        }
        HashSet hashSet = new HashSet();
        byte[] bArr = null;
        Integer num = null;
        for (zzgvx zzgvxVar : list) {
            zzgvxVar.zze();
            if (zzgvxVar.zzg() == null) {
                throw new GeneralSecurityException("No ID was set (with withFixedId or withRandomId)");
            }
            if (zzgvxVar.zzg() == zzgvy.zza) {
                int i13 = 0;
                while (true) {
                    if (i13 != 0 && !hashSet.contains(Integer.valueOf(i13))) {
                        break;
                    }
                    int i14 = zzhgi.zza;
                    i13 = 0;
                    while (i13 == 0) {
                        byte[] bArrZza = zzhfz.zza(4);
                        i13 = (bArrZza[3] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | ((bArrZza[0] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 24) | ((bArrZza[1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16) | ((bArrZza[2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8);
                    }
                }
                i10 = i13;
            } else {
                zzgvxVar.zzg();
                i10 = 0;
            }
            Integer numValueOf = Integer.valueOf(i10);
            if (hashSet.contains(numValueOf)) {
                throw new GeneralSecurityException(e2.n(new StringBuilder(String.valueOf(i10).length() + 31), "Id ", i10, " is used twice in the keyset"));
            }
            hashSet.add(numValueOf);
            zzgvt zzgvtVarZzc = zzhes.zza().zzc(zzgvxVar.zzf(), true != zzgvxVar.zzf().zza() ? null : numValueOf);
            zzgwc zzgwcVar = new zzgwc(zzgvtVarZzc, zzgwe.zzj(zzgvxVar.zze()), i10, zzgvxVar.zzc(), false, zzgwc.zza, null);
            zzhldVarZzh.zzb(zzgwe.zzq(zzgvtVarZzc, zzgwe.zzj(zzgvxVar.zze()), i10));
            if (zzgvxVar.zzc()) {
                if (num != null) {
                    throw new GeneralSecurityException("Two primaries were set");
                }
                if (zzgvxVar.zze() != zzgvv.zza) {
                    throw new GeneralSecurityException("Primary key is not enabled");
                }
                num = numValueOf;
            }
            arrayList.add(zzgwcVar);
        }
        if (num == null) {
            throw new GeneralSecurityException("No primary was set");
        }
        zzhldVarZzh.zza(num.intValue());
        zzhlg zzhlgVar = (zzhlg) zzhldVarZzh.zzbu();
        zzgwe.zzn(zzhlgVar);
        return zzgwe.zzh(new zzgwe(zzhlgVar, arrayList, this.zzb, bArr));
    }
}
