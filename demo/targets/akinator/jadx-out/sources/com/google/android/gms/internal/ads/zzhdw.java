package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzhdw {
    private static final Logger zza = Logger.getLogger(zzhdw.class.getName());
    private static final zzhdw zzd = new zzhdw();
    private final ConcurrentMap zzb = new ConcurrentHashMap();
    private final ConcurrentMap zzc = new ConcurrentHashMap();

    public static zzhdw zza() {
        return zzd;
    }

    private final synchronized zzgvu zzg(String str) throws GeneralSecurityException {
        ConcurrentMap concurrentMap;
        concurrentMap = this.zzb;
        if (!concurrentMap.containsKey(str)) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 98);
            sb2.append("No key manager found for key type ");
            sb2.append(str);
            sb2.append(", see https://developers.google.com/tink/faq/registration_errors");
            throw new GeneralSecurityException(sb2.toString());
        }
        return (zzgvu) concurrentMap.get(str);
    }

    private final synchronized void zzh(zzgvu zzgvuVar, boolean z10, boolean z11) throws GeneralSecurityException {
        try {
            String strZzb = zzgvuVar.zzb();
            if (z11) {
                ConcurrentMap concurrentMap = this.zzc;
                if (concurrentMap.containsKey(strZzb) && !((Boolean) concurrentMap.get(strZzb)).booleanValue()) {
                    throw new GeneralSecurityException("New keys are already disallowed for key type ".concat(strZzb));
                }
            }
            ConcurrentMap concurrentMap2 = this.zzb;
            zzgvu zzgvuVar2 = (zzgvu) concurrentMap2.get(strZzb);
            if (zzgvuVar2 != null && !zzgvuVar2.getClass().equals(zzgvuVar.getClass())) {
                zza.logp(Level.WARNING, "com.google.crypto.tink.internal.KeyManagerRegistry", "insertKeyManager", "Attempted overwrite of a registered key manager for key type ".concat(strZzb));
                throw new GeneralSecurityException("typeUrl (" + strZzb + ") is already registered with " + zzgvuVar2.getClass().getName() + ", cannot be re-registered with " + zzgvuVar.getClass().getName());
            }
            concurrentMap2.putIfAbsent(strZzb, zzgvuVar);
            this.zzc.put(strZzb, Boolean.valueOf(z11));
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void zzb(zzgvu zzgvuVar, boolean z10) throws GeneralSecurityException {
        zzf(zzgvuVar, 1, z10);
    }

    public final zzgvu zzc(String str, Class cls) throws GeneralSecurityException {
        zzgvu zzgvuVarZzg = zzg(str);
        if (zzgvuVarZzg.zzc().equals(cls)) {
            return zzgvuVarZzg;
        }
        String name = cls.getName();
        String strValueOf = String.valueOf(zzgvuVarZzg.getClass());
        String string = zzgvuVarZzg.zzc().toString();
        StringBuilder sb2 = new StringBuilder(o2.C(name.length() + 53, 23, strValueOf) + string.length());
        com.google.android.gms.internal.play_billing.a.B(sb2, "Primitive type ", name, " not supported by key manager of type ", strValueOf);
        throw new GeneralSecurityException(j1.o2.o(sb2, ", which only supports: ", string));
    }

    public final zzgvu zzd(String str) throws GeneralSecurityException {
        return zzg(str);
    }

    public final boolean zze(String str) {
        return ((Boolean) this.zzc.get(str)).booleanValue();
    }

    public final synchronized void zzf(zzgvu zzgvuVar, int i10, boolean z10) throws GeneralSecurityException {
        if (!zzhcy.zza(i10)) {
            throw new GeneralSecurityException("Cannot register key manager: FIPS compatibility insufficient");
        }
        zzh(zzgvuVar, false, z10);
    }
}
