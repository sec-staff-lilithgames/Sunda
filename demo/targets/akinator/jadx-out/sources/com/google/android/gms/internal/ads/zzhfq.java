package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzhfq {
    private final Map zza;
    private final Map zzb;

    private zzhfq() {
        this.zza = new HashMap();
        this.zzb = new HashMap();
    }

    public final zzhfq zza(zzhfp zzhfpVar) throws GeneralSecurityException {
        if (zzhfpVar == null) {
            throw new NullPointerException("primitive constructor must be non-null");
        }
        zzhfr zzhfrVar = new zzhfr(zzhfpVar.zzb(), zzhfpVar.zzc(), null);
        Map map = this.zza;
        if (!map.containsKey(zzhfrVar)) {
            map.put(zzhfrVar, zzhfpVar);
            return this;
        }
        zzhfp zzhfpVar2 = (zzhfp) map.get(zzhfrVar);
        if (zzhfpVar2.equals(zzhfpVar) && zzhfpVar.equals(zzhfpVar2)) {
            return this;
        }
        throw new GeneralSecurityException("Attempt to register non-equal PrimitiveConstructor object for already existing object of type: ".concat(zzhfrVar.toString()));
    }

    public final zzhfq zzb(zzhfv zzhfvVar) throws GeneralSecurityException {
        Map map = this.zzb;
        Class clsZza = zzhfvVar.zza();
        if (!map.containsKey(clsZza)) {
            map.put(clsZza, zzhfvVar);
            return this;
        }
        zzhfv zzhfvVar2 = (zzhfv) map.get(clsZza);
        if (zzhfvVar2.equals(zzhfvVar) && zzhfvVar.equals(zzhfvVar2)) {
            return this;
        }
        throw new GeneralSecurityException("Attempt to register non-equal PrimitiveWrapper object or input class object for already existing object of type".concat(clsZza.toString()));
    }

    public final zzhft zzc() {
        return new zzhft(this, null);
    }

    public final /* synthetic */ Map zzd() {
        return this.zza;
    }

    public final /* synthetic */ Map zze() {
        return this.zzb;
    }

    public /* synthetic */ zzhfq(zzhft zzhftVar, byte[] bArr) {
        this.zza = new HashMap(zzhftVar.zzd());
        this.zzb = new HashMap(zzhftVar.zze());
    }

    public /* synthetic */ zzhfq(byte[] bArr) {
        this.zza = new HashMap();
        this.zzb = new HashMap();
    }
}
