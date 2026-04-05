package com.google.android.gms.internal.play_billing;

import a.b;
import w0.i;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzgf extends zzgi {
    private final int zzc;

    public zzgf(byte[] bArr, int i10, int i11) {
        super(bArr);
        zzgk.zzh(0, i11, bArr.length);
        this.zzc = i11;
    }

    @Override // com.google.android.gms.internal.play_billing.zzgi, com.google.android.gms.internal.play_billing.zzgk
    public final byte zza(int i10) {
        int i11 = this.zzc;
        if (((i11 - (i10 + 1)) | i10) >= 0) {
            return ((zzgi) this).zza[i10];
        }
        if (i10 < 0) {
            throw new ArrayIndexOutOfBoundsException(b.e(i10, "Index < 0: "));
        }
        throw new ArrayIndexOutOfBoundsException(i.a(i10, i11, "Index > length: ", ", "));
    }

    @Override // com.google.android.gms.internal.play_billing.zzgi, com.google.android.gms.internal.play_billing.zzgk
    public final byte zzb(int i10) {
        return ((zzgi) this).zza[i10];
    }

    @Override // com.google.android.gms.internal.play_billing.zzgi
    public final int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.play_billing.zzgi, com.google.android.gms.internal.play_billing.zzgk
    public final int zzd() {
        return this.zzc;
    }
}
