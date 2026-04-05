package com.google.android.gms.internal.measurement;

import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.a;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzlc extends zzlg {
    private final int zzc;

    public zzlc(byte[] bArr, int i10, int i11) {
        super(bArr);
        zzlh.zzj(0, i11, bArr.length);
        this.zzc = i11;
    }

    @Override // com.google.android.gms.internal.measurement.zzlg, com.google.android.gms.internal.measurement.zzlh
    public final byte zza(int i10) {
        int i11 = this.zzc;
        if (((i11 - (i10 + 1)) | i10) >= 0) {
            return ((zzlg) this).zza[i10];
        }
        if (i10 < 0) {
            throw new ArrayIndexOutOfBoundsException(o2.l(i10, "Index < 0: ", new StringBuilder(String.valueOf(i10).length() + 11)));
        }
        throw new ArrayIndexOutOfBoundsException(a.m(i10, i11, "Index > length: ", ", ", new StringBuilder(String.valueOf(i10).length() + 18 + String.valueOf(i11).length())));
    }

    @Override // com.google.android.gms.internal.measurement.zzlg, com.google.android.gms.internal.measurement.zzlh
    public final byte zzb(int i10) {
        return ((zzlg) this).zza[i10];
    }

    @Override // com.google.android.gms.internal.measurement.zzlg, com.google.android.gms.internal.measurement.zzlh
    public final int zzc() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.measurement.zzlg
    public final int zzd() {
        return 0;
    }
}
