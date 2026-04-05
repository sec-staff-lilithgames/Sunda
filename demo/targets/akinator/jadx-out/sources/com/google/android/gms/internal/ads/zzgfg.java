package com.google.android.gms.internal.ads;

import java.io.File;
import java.io.IOException;
import java.security.GeneralSecurityException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzgfg {
    private final File zza;
    private final zzfrn zzb;
    private final zzgjd zzc;

    public zzgfg(File file, zzfrn zzfrnVar, zzgjd zzgjdVar) {
        this.zza = file;
        this.zzb = zzfrnVar;
        this.zzc = zzgjdVar;
    }

    public final boolean zza(byte[] bArr) {
        boolean zZza;
        try {
            File file = this.zza;
            zzgsg.zzb(file);
            zzgsg.zza(bArr, file);
            zZza = this.zzb.zza(file);
        } catch (IOException | GeneralSecurityException e10) {
            this.zzc.zzd(2027, e10);
            zZza = false;
        }
        try {
            this.zza.delete();
        } catch (SecurityException unused) {
        }
        return zZza;
    }
}
