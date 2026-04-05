package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzhcd extends zzhcb {
    public zzhcd(byte[] bArr) throws GeneralSecurityException {
        super(bArr);
    }

    @Override // com.google.android.gms.internal.ads.zzhcb
    public final zzhbz zza(byte[] bArr, int i10) throws InvalidKeyException {
        return new zzhcc(bArr, i10);
    }
}
