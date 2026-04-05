package com.google.android.gms.internal.ads;

import j$.util.Base64;
import java.security.GeneralSecurityException;
import java.util.Optional;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzggr {
    private Optional zza;
    private Optional zzb;

    public final boolean zza(zzazy zzazyVar) throws GeneralSecurityException {
        byte[] bArrZzv = zzazyVar.zza().zzb().zza().zzv();
        byte[] bArrZzv2 = zzazyVar.zza().zzd().zzv();
        try {
            if (this.zza == null && this.zzb == null) {
                try {
                    try {
                        zzhpo.zza();
                        this.zza = Optional.of((zzgwm) zzgwo.zza(new String(Base64.getDecoder().decode("eyJwcmltYXJ5S2V5SWQiOjMzMTUxOTk4MTksImtleSI6W3sia2V5RGF0YSI6eyJ0eXBlVXJsIjoidHlwZS5nb29nbGVhcGlzLmNvbS9nb29nbGUuY3J5cHRvLnRpbmsuRWNkc2FQdWJsaWNLZXkiLCJ2YWx1ZSI6IkVnWUlBeEFDR0FFYUlRQVNoRGZwOUM5QjcrMU1nMmJQbHJ5WExPOHVScDd6YWZJMldSYURmR1ZqVmlJaEFJNFZzTmVrcCs0bVY0d2toZlhVb3pQZWs5TjgxcUdIK2plNnhjOFpoQkhQIiwia2V5TWF0ZXJpYWxUeXBlIjoiQVNZTU1FVFJJQ19QVUJMSUMifSwic3RhdHVzIjoiRU5BQkxFRCIsImtleUlkIjozMzE1MTk5ODE5LCJvdXRwdXRQcmVmaXhUeXBlIjoiVElOSyJ9XX0="))).zzg(zzhga.zzc(), zzgwm.class));
                        this.zzb = Optional.of((zzgwm) zzgwo.zza(new String(Base64.getDecoder().decode("eyJwcmltYXJ5S2V5SWQiOjMwODI3ODA4ODgsImtleSI6W3sia2V5RGF0YSI6eyJ0eXBlVXJsIjoidHlwZS5nb29nbGVhcGlzLmNvbS9nb29nbGUuY3J5cHRvLnRpbmsuRWNkc2FQdWJsaWNLZXkiLCJ2YWx1ZSI6IkVnWUlBeEFDR0FFYUlRQkEyWW5HaWFpc3pEcGtJcWpjalorUTJ2alFUUldQZjhFcTlkZVlhNFpKa3lJaEFCQWFESTd6QWJkQXVpQmlnOWdHSkJ1VTUzSGg5Z0RCa0t2amswS2tabDhjIiwia2V5TWF0ZXJpYWxUeXBlIjoiQVNZTU1FVFJJQ19QVUJMSUMifSwic3RhdHVzIjoiRU5BQkxFRCIsImtleUlkIjozMDgyNzgwODg4LCJvdXRwdXRQcmVmaXhUeXBlIjoiVElOSyJ9XX0="))).zzg(zzhga.zzc(), zzgwm.class));
                    } catch (Exception e10) {
                        throw new GeneralSecurityException("Failed to verify program", e10);
                    }
                } catch (GeneralSecurityException unused) {
                    return false;
                }
            }
            this.zza.isPresent();
            ((zzgwm) this.zza.get()).zza(bArrZzv, bArrZzv2);
            return true;
        } catch (GeneralSecurityException unused2) {
            this.zzb.isPresent();
            ((zzgwm) this.zzb.get()).zza(bArrZzv, bArrZzv2);
            return true;
        }
    }
}
