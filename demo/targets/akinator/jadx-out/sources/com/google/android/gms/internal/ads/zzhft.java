package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzhft {
    private final Map zza;
    private final Map zzb;

    public /* synthetic */ zzhft(zzhfq zzhfqVar, byte[] bArr) {
        this.zza = new HashMap(zzhfqVar.zzd());
        this.zzb = new HashMap(zzhfqVar.zze());
    }

    public static zzhfq zza() {
        return new zzhfq(null);
    }

    public final Object zzb(zzgvt zzgvtVar, Class cls) throws GeneralSecurityException {
        zzhfr zzhfrVar = new zzhfr(zzgvtVar.getClass(), cls, null);
        Map map = this.zza;
        if (map.containsKey(zzhfrVar)) {
            return ((zzhfp) map.get(zzhfrVar)).zza(zzgvtVar);
        }
        String string = zzhfrVar.toString();
        throw new GeneralSecurityException(a.b.o(new StringBuilder(string.length() + 102), "No PrimitiveConstructor for ", string, " available, see https://developers.google.com/tink/faq/registration_errors"));
    }

    public final Object zzc(zzhed zzhedVar, zzhel zzhelVar, Class cls) throws GeneralSecurityException {
        Map map = this.zzb;
        if (!map.containsKey(cls)) {
            throw new GeneralSecurityException("No wrapper found for ".concat(cls.toString()));
        }
        final zzhfv zzhfvVar = (zzhfv) map.get(cls);
        return zzhfvVar.zze(zzhedVar, zzhelVar, new zzhfu() { // from class: com.google.android.gms.internal.ads.zzhfs
            @Override // com.google.android.gms.internal.ads.zzhfu
            public final /* synthetic */ Object zza(zzgwc zzgwcVar) {
                return this.zza.zzb(zzgwcVar.zza(), zzhfvVar.zzb());
            }
        });
    }

    public final /* synthetic */ Map zzd() {
        return this.zza;
    }

    public final /* synthetic */ Map zze() {
        return this.zzb;
    }
}
