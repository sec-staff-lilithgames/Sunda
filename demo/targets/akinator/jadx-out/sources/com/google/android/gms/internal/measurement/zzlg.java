package com.google.android.gms.internal.measurement;

import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.a;
import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
class zzlg extends zzlf {
    protected final byte[] zza;

    public zzlg(byte[] bArr) {
        super(null);
        bArr.getClass();
        this.zza = bArr;
    }

    @Override // com.google.android.gms.internal.measurement.zzlh
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzlh) || zzc() != ((zzlh) obj).zzc()) {
            return false;
        }
        if (zzc() == 0) {
            return true;
        }
        if (!(obj instanceof zzlg)) {
            return obj.equals(this);
        }
        zzlg zzlgVar = (zzlg) obj;
        int iZzi = zzi();
        int iZzi2 = zzlgVar.zzi();
        if (iZzi != 0 && iZzi2 != 0 && iZzi != iZzi2) {
            return false;
        }
        int iZzc = zzc();
        if (iZzc > zzlgVar.zzc()) {
            int iZzc2 = zzc();
            StringBuilder sb2 = new StringBuilder(String.valueOf(iZzc).length() + 18 + String.valueOf(iZzc2).length());
            sb2.append("Length too large: ");
            sb2.append(iZzc);
            sb2.append(iZzc2);
            throw new IllegalArgumentException(sb2.toString());
        }
        if (iZzc > zzlgVar.zzc()) {
            int iZzc3 = zzlgVar.zzc();
            throw new IllegalArgumentException(a.m(iZzc, iZzc3, "Ran off end of other: 0, ", ", ", new StringBuilder(String.valueOf(iZzc).length() + 27 + String.valueOf(iZzc3).length())));
        }
        byte[] bArr = this.zza;
        byte[] bArr2 = zzlgVar.zza;
        zzlgVar.zzd();
        int i10 = 0;
        int i11 = 0;
        while (i10 < iZzc) {
            if (bArr[i10] != bArr2[i11]) {
                return false;
            }
            i10++;
            i11++;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.zzlh
    public byte zza(int i10) {
        return this.zza[i10];
    }

    @Override // com.google.android.gms.internal.measurement.zzlh
    public byte zzb(int i10) {
        return this.zza[i10];
    }

    @Override // com.google.android.gms.internal.measurement.zzlh
    public int zzc() {
        return this.zza.length;
    }

    public int zzd() {
        return 0;
    }

    @Override // com.google.android.gms.internal.measurement.zzlh
    public final zzlh zze(int i10, int i11) {
        int iZzj = zzlh.zzj(0, i11, zzc());
        return iZzj == 0 ? zzlh.zzb : new zzlc(this.zza, 0, iZzj);
    }

    @Override // com.google.android.gms.internal.measurement.zzlh
    public final void zzf(zzkz zzkzVar) throws IOException {
        ((zzlk) zzkzVar).zzv(this.zza, 0, zzc());
    }

    @Override // com.google.android.gms.internal.measurement.zzlh
    public final int zzg(int i10, int i11, int i12) {
        return zzmp.zzc(i10, this.zza, 0, i12);
    }
}
