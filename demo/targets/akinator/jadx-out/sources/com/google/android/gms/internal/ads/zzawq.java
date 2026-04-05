package com.google.android.gms.internal.ads;

import java.io.File;
import java.security.GeneralSecurityException;
import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzawq implements zzfti {
    final /* synthetic */ zzfrn zza;

    public zzawq(zzaws zzawsVar, zzfrn zzfrnVar) {
        this.zza = zzfrnVar;
        Objects.requireNonNull(zzawsVar);
    }

    @Override // com.google.android.gms.internal.ads.zzfti
    public final boolean zza(File file) {
        try {
            return this.zza.zza(file);
        } catch (GeneralSecurityException unused) {
            return false;
        }
    }
}
