package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzqm extends zzch {
    private int[] zzd;
    private int[] zze;

    /* JADX WARN: Removed duplicated region for block: B:28:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00ed  */
    @Override // com.google.android.gms.internal.ads.zzcg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzd(java.nio.ByteBuffer r17) {
        /*
            Method dump skipped, instructions count: 296
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzqm.zzd(java.nio.ByteBuffer):void");
    }

    @Override // com.google.android.gms.internal.ads.zzch
    public final zzcd zzm(zzcd zzcdVar) throws zzcf {
        int[] iArr = this.zzd;
        if (iArr == null) {
            return zzcd.zza;
        }
        int i10 = zzcdVar.zzd;
        if (!zzep.zzA(i10)) {
            throw new zzcf("Unhandled input format:", zzcdVar);
        }
        int i11 = zzcdVar.zzc;
        boolean z10 = i11 != iArr.length;
        int i12 = 0;
        while (true) {
            int length = iArr.length;
            if (i12 >= length) {
                return z10 ? new zzcd(zzcdVar.zzb, length, i10) : zzcd.zza;
            }
            int i13 = iArr[i12];
            if (i13 >= i11) {
                String string = Arrays.toString(iArr);
                throw new zzcf(a.b.o(new StringBuilder(String.valueOf(string).length() + 59), "Channel map (", string, ") trying to access non-existent input channel."), zzcdVar);
            }
            z10 |= i13 != i12;
            i12++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzch
    public final void zzo() {
        this.zze = this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzch
    public final void zzp() {
        this.zze = null;
        this.zzd = null;
    }

    public final void zzq(int[] iArr) {
        this.zzd = iArr;
    }
}
