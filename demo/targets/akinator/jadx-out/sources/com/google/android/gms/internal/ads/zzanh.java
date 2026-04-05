package com.google.android.gms.internal.ads;

import com.vungle.ads.internal.protos.Sdk;
import java.util.Arrays;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzanh {
    public byte[] zza;
    public int zzb;
    private final int zzc;
    private boolean zzd;
    private boolean zze;

    public zzanh(int i10, int i11) {
        this.zzc = i10;
        byte[] bArr = new byte[Sdk.SDKError.Reason.MRAID_JS_WRITE_FAILED_VALUE];
        this.zza = bArr;
        bArr[2] = 1;
    }

    public final void zza() {
        this.zzd = false;
        this.zze = false;
    }

    public final boolean zzb() {
        return this.zze;
    }

    public final void zzc(int i10) {
        zzgmd.zzh(!this.zzd);
        boolean z10 = i10 == this.zzc;
        this.zzd = z10;
        if (z10) {
            this.zzb = 3;
            this.zze = false;
        }
    }

    public final void zzd(byte[] bArr, int i10, int i11) {
        if (this.zzd) {
            int i12 = i11 - i10;
            byte[] bArr2 = this.zza;
            int length = bArr2.length;
            int i13 = this.zzb + i12;
            if (length < i13) {
                this.zza = Arrays.copyOf(bArr2, i13 + i13);
            }
            System.arraycopy(bArr, i10, this.zza, this.zzb, i12);
            this.zzb += i12;
        }
    }

    public final boolean zze(int i10) {
        if (!this.zzd) {
            return false;
        }
        this.zzb -= i10;
        this.zzd = false;
        this.zze = true;
        return true;
    }
}
