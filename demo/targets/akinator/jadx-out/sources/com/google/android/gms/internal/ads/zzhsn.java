package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.util.Objects;
import javax.crypto.Mac;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzhsn extends ThreadLocal {
    final /* synthetic */ zzhso zza;

    public zzhsn(zzhso zzhsoVar) {
        Objects.requireNonNull(zzhsoVar);
        this.zza = zzhsoVar;
    }

    @Override // java.lang.ThreadLocal
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final Mac initialValue() throws InvalidKeyException {
        try {
            zzhrz zzhrzVar = zzhrz.zzb;
            zzhso zzhsoVar = this.zza;
            Mac mac = (Mac) zzhrzVar.zzb(zzhsoVar.zzb());
            mac.init(zzhsoVar.zzc());
            return mac;
        } catch (GeneralSecurityException e10) {
            throw new IllegalStateException(e10);
        }
    }
}
