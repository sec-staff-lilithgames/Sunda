package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzhgc {
    private final Map zza;
    private final Map zzb;
    private final Map zzc;
    private final Map zzd;

    public zzhgc() {
        this.zza = new HashMap();
        this.zzb = new HashMap();
        this.zzc = new HashMap();
        this.zzd = new HashMap();
    }

    public final zzhgc zza(zzhec zzhecVar) throws GeneralSecurityException {
        zzhge zzhgeVar = new zzhge(zzhecVar.zzb(), zzhecVar.zzc(), null);
        Map map = this.zza;
        if (!map.containsKey(zzhgeVar)) {
            map.put(zzhgeVar, zzhecVar);
            return this;
        }
        zzhec zzhecVar2 = (zzhec) map.get(zzhgeVar);
        if (zzhecVar2.equals(zzhecVar) && zzhecVar.equals(zzhecVar2)) {
            return this;
        }
        throw new GeneralSecurityException("Attempt to register non-equal serializer for already existing object of type: ".concat(zzhgeVar.toString()));
    }

    public final zzhgc zzb(zzhdz zzhdzVar) throws GeneralSecurityException {
        zzhgd zzhgdVar = new zzhgd(zzhdzVar.zzc(), zzhdzVar.zzb(), null);
        Map map = this.zzb;
        if (!map.containsKey(zzhgdVar)) {
            map.put(zzhgdVar, zzhdzVar);
            return this;
        }
        zzhdz zzhdzVar2 = (zzhdz) map.get(zzhgdVar);
        if (zzhdzVar2.equals(zzhdzVar) && zzhdzVar.equals(zzhdzVar2)) {
            return this;
        }
        throw new GeneralSecurityException("Attempt to register non-equal parser for already existing object of type: ".concat(zzhgdVar.toString()));
    }

    public final zzhgc zzc(zzhfi zzhfiVar) throws GeneralSecurityException {
        zzhge zzhgeVar = new zzhge(zzhfiVar.zzb(), zzhfiVar.zzc(), null);
        Map map = this.zzc;
        if (!map.containsKey(zzhgeVar)) {
            map.put(zzhgeVar, zzhfiVar);
            return this;
        }
        zzhfi zzhfiVar2 = (zzhfi) map.get(zzhgeVar);
        if (zzhfiVar2.equals(zzhfiVar) && zzhfiVar.equals(zzhfiVar2)) {
            return this;
        }
        throw new GeneralSecurityException("Attempt to register non-equal serializer for already existing object of type: ".concat(zzhgeVar.toString()));
    }

    public final zzhgc zzd(zzhff zzhffVar) throws GeneralSecurityException {
        zzhgd zzhgdVar = new zzhgd(zzhffVar.zzc(), zzhffVar.zzb(), null);
        Map map = this.zzd;
        if (!map.containsKey(zzhgdVar)) {
            map.put(zzhgdVar, zzhffVar);
            return this;
        }
        zzhff zzhffVar2 = (zzhff) map.get(zzhgdVar);
        if (zzhffVar2.equals(zzhffVar) && zzhffVar.equals(zzhffVar2)) {
            return this;
        }
        throw new GeneralSecurityException("Attempt to register non-equal parser for already existing object of type: ".concat(zzhgdVar.toString()));
    }

    public final /* synthetic */ Map zze() {
        return this.zza;
    }

    public final /* synthetic */ Map zzf() {
        return this.zzb;
    }

    public final /* synthetic */ Map zzg() {
        return this.zzc;
    }

    public final /* synthetic */ Map zzh() {
        return this.zzd;
    }

    public zzhgc(zzhgf zzhgfVar) {
        this.zza = new HashMap(zzhgfVar.zzg());
        this.zzb = new HashMap(zzhgfVar.zzh());
        this.zzc = new HashMap(zzhgfVar.zzi());
        this.zzd = new HashMap(zzhgfVar.zzj());
    }
}
