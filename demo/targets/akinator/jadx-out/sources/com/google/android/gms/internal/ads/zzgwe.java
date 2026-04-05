package com.google.android.gms.internal.ads;

import b0.e2;
import com.vungle.ads.internal.protos.Sdk;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzgwe implements zzhed {
    private final List zza;
    private final zzhel zzb;
    private final zzgwe zzc;

    public /* synthetic */ zzgwe(zzhlg zzhlgVar, List list, zzhel zzhelVar, byte[] bArr) {
        this(zzhlgVar, list, zzhelVar);
    }

    public static final zzgwe zza(zzhlg zzhlgVar) throws GeneralSecurityException {
        zzn(zzhlgVar);
        return new zzgwe(zzhlgVar, zzl(zzhlgVar), zzhel.zza);
    }

    public static final zzgwe zzf(zzgwj zzgwjVar) throws GeneralSecurityException {
        zzgvz zzgvzVar = new zzgvz();
        zzgvx zzgvxVar = new zzgvx(zzgwjVar, null);
        zzgvxVar.zzb();
        zzgvxVar.zza();
        zzgvzVar.zza(zzgvxVar);
        return zzgvzVar.zzb();
    }

    public static /* synthetic */ zzgwe zzh(final zzgwe zzgweVar) {
        final zzhel zzhelVar = zzgweVar.zzb;
        if (zzhelVar.zza()) {
            return zzgweVar;
        }
        zzgwa zzgwaVar = new zzgwa() { // from class: com.google.android.gms.internal.ads.zzgwd
            @Override // com.google.android.gms.internal.ads.zzgwa
            public final /* synthetic */ void zza(zzgwc zzgwcVar) {
                zzhew.zza().zzb().zza(this.zza, zzhelVar, "keyset_handle", "get_key");
            }
        };
        List<zzgwc> list = zzgweVar.zza;
        ArrayList arrayList = new ArrayList(list.size());
        for (zzgwc zzgwcVar : list) {
            arrayList.add(new zzgwc(zzgwcVar.zzf(), zzgwcVar.zzj(), zzgwcVar.zzg(), zzgwcVar.zzh(), zzgwcVar.zzi(), zzgwaVar, null));
        }
        return new zzgwe(arrayList, zzhelVar, zzgweVar);
    }

    public static /* synthetic */ int zzj(zzgvv zzgvvVar) {
        if (zzgvv.zza.equals(zzgvvVar)) {
            return 3;
        }
        if (zzgvv.zzb.equals(zzgvvVar)) {
            return 4;
        }
        if (zzgvv.zzc.equals(zzgvvVar)) {
            return 5;
        }
        throw new IllegalStateException("Unknown key status");
    }

    private static List zzl(zzhlg zzhlgVar) throws GeneralSecurityException {
        zzgvt zzheiVar;
        boolean z10;
        ArrayList arrayList = new ArrayList(zzhlgVar.zzc());
        for (zzhlf zzhlfVar : zzhlgVar.zzb()) {
            int iZzc = zzhlfVar.zzc();
            try {
                zzhfw zzhfwVarZzo = zzo(zzhlfVar);
                zzhfb zzhfbVarZza = zzhfb.zza();
                zzgwn zzgwnVarZza = zzgwn.zza();
                zzheiVar = !zzhfbVarZza.zzf(zzhfwVarZzo) ? new zzhei(zzhfwVarZzo, zzgwnVarZza) : zzhfbVarZza.zzg(zzhfwVarZzo, zzgwnVarZza);
                z10 = false;
            } catch (GeneralSecurityException e10) {
                if (zzhcw.zza.zza()) {
                    throw e10;
                }
                zzheiVar = new zzhei(zzo(zzhlfVar), zzgwn.zza());
                z10 = true;
            }
            if (zzhcw.zza.zza() && !zzp(zzhlfVar.zzk())) {
                throw new GeneralSecurityException("Parsing of a single key failed (wrong status) and Tink is configured via validateKeysetsOnParsing to reject such keysets.");
            }
            boolean z11 = true;
            int iZzk = zzhlfVar.zzk();
            if (iZzc != zzhlgVar.zza()) {
                z11 = false;
            }
            arrayList.add(new zzgwc(zzheiVar, iZzk, iZzc, z11, z10, zzgwc.zza, null));
        }
        return Collections.unmodifiableList(arrayList);
    }

    private final zzgwe zzm() {
        zzgwe zzgweVar = this.zzc;
        return zzgweVar == null ? this : zzgweVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzn(zzhlg zzhlgVar) throws GeneralSecurityException {
        if (zzhlgVar == null || zzhlgVar.zzc() <= 0) {
            throw new GeneralSecurityException("empty keyset");
        }
    }

    private static zzhfw zzo(zzhlf zzhlfVar) throws GeneralSecurityException {
        return zzhfw.zza(zzhlfVar.zzb().zza(), zzhlfVar.zzb().zzb(), zzhlfVar.zzb().zzc(), zzhlfVar.zzd(), zzhlfVar.zzd() == zzhlt.RAW ? null : Integer.valueOf(zzhlfVar.zzc()));
    }

    private static boolean zzp(int i10) {
        int i11 = i10 - 2;
        return i11 == 1 || i11 == 2 || i11 == 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzhlf zzq(zzgvt zzgvtVar, int i10, int i11) throws GeneralSecurityException {
        zzhfw zzhfwVar = (zzhfw) zzhfb.zza().zzh(zzgvtVar, zzhfw.class, zzgwn.zza());
        Integer numZze = zzhfwVar.zze();
        if (numZze != null && numZze.intValue() != i11) {
            throw new GeneralSecurityException("Wrong ID set for key with ID requirement");
        }
        zzhle zzhleVarZze = zzhlf.zze();
        zzhkv zzhkvVarZzd = zzhkx.zzd();
        zzhkvVarZzd.zza(zzhfwVar.zzg());
        zzhkvVarZzd.zzb(zzhfwVar.zzb());
        zzhkvVarZzd.zzc(zzhfwVar.zzc());
        zzhleVarZze.zzb(zzhkvVarZzd);
        zzhleVarZze.zze(i10);
        zzhleVarZze.zzc(i11);
        zzhleVarZze.zzd(zzhfwVar.zzd());
        return (zzhlf) zzhleVarZze.zzbu();
    }

    public final String toString() {
        zzhlg zzhlgVarZzb = zzb();
        int i10 = zzgwq.zza;
        zzhlh zzhlhVarZza = zzhlk.zza();
        zzhlhVarZza.zza(zzhlgVarZzb.zza());
        for (zzhlf zzhlfVar : zzhlgVarZzb.zzb()) {
            zzhli zzhliVarZza = zzhlj.zza();
            zzhliVarZza.zza(zzhlfVar.zzb().zza());
            zzhliVarZza.zzd(zzhlfVar.zzk());
            zzhliVarZza.zzc(zzhlfVar.zzd());
            zzhliVarZza.zzb(zzhlfVar.zzc());
            zzhlhVarZza.zzb((zzhlj) zzhliVarZza.zzbu());
        }
        return ((zzhlk) zzhlhVarZza.zzbu()).toString();
    }

    public final zzhlg zzb() {
        try {
            zzhld zzhldVarZzh = zzhlg.zzh();
            for (zzgwc zzgwcVar : this.zza) {
                zzhldVarZzh.zzb(zzq(zzgwcVar.zza(), zzgwcVar.zzj(), zzgwcVar.zzc()));
                if (zzgwcVar.zzd()) {
                    zzhldVarZzh.zza(zzgwcVar.zzc());
                }
            }
            return (zzhlg) zzhldVarZzh.zzbu();
        } catch (GeneralSecurityException e10) {
            throw new zzhgh(e10);
        }
    }

    public final zzgwc zzc() {
        for (zzgwc zzgwcVar : this.zza) {
            if (zzgwcVar != null && zzgwcVar.zzd()) {
                if (zzgwcVar.zzb() == zzgvv.zza) {
                    return zzgwcVar;
                }
                throw new IllegalStateException("Keyset has primary which isn't enabled");
            }
        }
        throw new IllegalStateException("Keyset has no valid primary");
    }

    @Override // com.google.android.gms.internal.ads.zzhed
    public final int zzd() {
        return this.zza.size();
    }

    public final zzgwc zze(int i10) {
        if (i10 < 0 || i10 >= zzd()) {
            int iZzd = zzd();
            throw new IndexOutOfBoundsException(com.bytedance.sdk.component.adexpress.dynamic.dynamicview.a.m(i10, iZzd, "Invalid index ", " for keyset of size ", new StringBuilder(String.valueOf(i10).length() + 34 + String.valueOf(iZzd).length())));
        }
        List list = this.zza;
        zzgwc zzgwcVar = (zzgwc) list.get(i10);
        if (!zzp(zzgwcVar.zzj())) {
            throw new IllegalStateException(e2.n(new StringBuilder(String.valueOf(i10).length() + 42), "Keyset-Entry at position ", i10, " has wrong status"));
        }
        if (zzgwcVar.zzi()) {
            throw new IllegalStateException(e2.n(new StringBuilder(String.valueOf(i10).length() + 48), "Keyset-Entry at position ", i10, " didn't parse correctly"));
        }
        return (zzgwc) list.get(i10);
    }

    public final Object zzg(zzgvq zzgvqVar, Class cls) throws GeneralSecurityException {
        if (!(zzgvqVar instanceof zzhds)) {
            throw new GeneralSecurityException("Currently only subclasses of InternalConfiguration are accepted");
        }
        zzhds zzhdsVar = (zzhds) zzgvqVar;
        zzhlg zzhlgVarZzb = zzm().zzb();
        int i10 = zzgwq.zza;
        int iZza = zzhlgVarZzb.zza();
        boolean z10 = true;
        int i11 = 0;
        boolean z11 = false;
        for (zzhlf zzhlfVar : zzhlgVarZzb.zzb()) {
            if (zzhlfVar.zzk() == 3) {
                if (!zzhlfVar.zza()) {
                    throw new GeneralSecurityException(String.format("key %d has no key data", Integer.valueOf(zzhlfVar.zzc())));
                }
                if (zzhlfVar.zzd() == zzhlt.UNKNOWN_PREFIX) {
                    throw new GeneralSecurityException(String.format("key %d has unknown prefix", Integer.valueOf(zzhlfVar.zzc())));
                }
                if (zzhlfVar.zzk() == 2) {
                    throw new GeneralSecurityException(String.format("key %d has unknown status", Integer.valueOf(zzhlfVar.zzc())));
                }
                if (zzhlfVar.zzc() == iZza) {
                    if (z11) {
                        throw new GeneralSecurityException("keyset contains multiple primary keys");
                    }
                    z11 = true;
                }
                z10 &= zzhlfVar.zzb().zzc() == zzhkw.ASYMMETRIC_PUBLIC;
                i11++;
            }
        }
        if (i11 == 0) {
            throw new GeneralSecurityException("keyset must contain at least one ENABLED key");
        }
        if (!z11 && !z10) {
            throw new GeneralSecurityException("keyset doesn't contain a valid primary key");
        }
        for (int i12 = 0; i12 < zzd(); i12++) {
            List list = this.zza;
            if (((zzgwc) list.get(i12)).zzi() || !zzp(((zzgwc) list.get(i12)).zzj())) {
                String strZza = zzhlgVarZzb.zzd(i12).zzb().zza();
                StringBuilder sb2 = new StringBuilder(String.valueOf(strZza).length() + String.valueOf(i12).length() + 44 + 32);
                sb2.append("Key parsing of key with index ");
                sb2.append(i12);
                sb2.append(" and type_url ");
                sb2.append(strZza);
                sb2.append(" failed, unable to get primitive");
                throw new GeneralSecurityException(sb2.toString());
            }
        }
        return zzhdsVar.zza(zzm(), this.zzb, cls);
    }

    private zzgwe(List list, zzhel zzhelVar, zzgwe zzgweVar) {
        this.zza = list;
        this.zzb = zzhelVar;
        this.zzc = zzgweVar;
    }

    private zzgwe(zzhlg zzhlgVar, List list, zzhel zzhelVar) throws GeneralSecurityException {
        this.zza = list;
        this.zzb = zzhelVar;
        if (zzhcw.zza.zza()) {
            HashSet hashSet = new HashSet();
            for (zzhlf zzhlfVar : zzhlgVar.zzb()) {
                if (!hashSet.contains(Integer.valueOf(zzhlfVar.zzc()))) {
                    hashSet.add(Integer.valueOf(zzhlfVar.zzc()));
                } else {
                    int iZzc = zzhlfVar.zzc();
                    throw new GeneralSecurityException(e2.n(new StringBuilder(String.valueOf(iZzc).length() + Sdk.SDKError.Reason.TPAT_ERROR_VALUE), "KeyID ", iZzc, " is duplicated in the keyset, and Tink is configured to reject such keysets with the flag validateKeysetsOnParsing."));
                }
            }
            if (!hashSet.contains(Integer.valueOf(zzhlgVar.zza()))) {
                throw new GeneralSecurityException("Primary key id not found in keyset, and Tink is configured to reject such keysets with the flag validateKeysetsOnParsing.");
            }
        }
        this.zzc = null;
    }
}
