package com.google.android.gms.internal.ads;

import com.mbridge.msdk.playercommon.exoplayer2.extractor.ogg.OggPageHeader;
import java.util.Arrays;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzajq {
    private final zzajr zza = new zzajr();
    private final zzeg zzb = new zzeg(new byte[OggPageHeader.MAX_PAGE_PAYLOAD], 0);
    private int zzc = -1;
    private int zzd;
    private boolean zze;

    private final int zzf(int i10) {
        int i11;
        int i12 = 0;
        this.zzd = 0;
        do {
            int i13 = this.zzd;
            int i14 = i10 + i13;
            zzajr zzajrVar = this.zza;
            if (i14 >= zzajrVar.zzc) {
                break;
            }
            this.zzd = i13 + 1;
            i11 = zzajrVar.zzf[i14];
            i12 += i11;
        } while (i11 == 255);
        return i12;
    }

    public final void zza() {
        this.zza.zza();
        this.zzb.zza(0);
        this.zzc = -1;
        this.zze = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0049, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean zzb(com.google.android.gms.internal.ads.zzadb r8) throws java.io.IOException {
        /*
            r7 = this;
            boolean r0 = r7.zze
            r1 = 0
            if (r0 != 0) goto L6
            goto Ld
        L6:
            r7.zze = r1
            com.google.android.gms.internal.ads.zzeg r0 = r7.zzb
            r0.zza(r1)
        Ld:
            boolean r0 = r7.zze
            r2 = 1
            if (r0 != 0) goto L91
            int r0 = r7.zzc
            if (r0 >= 0) goto L4a
            com.google.android.gms.internal.ads.zzajr r0 = r7.zza
            r3 = -1
            boolean r3 = r0.zzb(r8, r3)
            if (r3 == 0) goto L49
            boolean r3 = r0.zzc(r8, r2)
            if (r3 != 0) goto L27
            goto L49
        L27:
            int r3 = r0.zzd
            int r0 = r0.zza
            r0 = r0 & r2
            if (r0 != r2) goto L3e
            com.google.android.gms.internal.ads.zzeg r0 = r7.zzb
            int r0 = r0.zze()
            if (r0 != 0) goto L3e
            int r0 = r7.zzf(r1)
            int r3 = r3 + r0
            int r0 = r7.zzd
            goto L3f
        L3e:
            r0 = r1
        L3f:
            boolean r3 = com.google.android.gms.internal.ads.zzade.zzd(r8, r3)
            if (r3 != 0) goto L46
            return r1
        L46:
            r7.zzc = r0
            goto L4a
        L49:
            return r1
        L4a:
            int r0 = r7.zzf(r0)
            int r3 = r7.zzc
            int r4 = r7.zzd
            int r3 = r3 + r4
            if (r0 <= 0) goto L86
            com.google.android.gms.internal.ads.zzeg r4 = r7.zzb
            int r5 = r4.zze()
            int r5 = r5 + r0
            r4.zzc(r5)
            byte[] r5 = r4.zzi()
            int r6 = r4.zze()
            boolean r5 = com.google.android.gms.internal.ads.zzade.zzc(r8, r5, r6, r0)
            if (r5 != 0) goto L6e
            return r1
        L6e:
            int r5 = r4.zze()
            int r5 = r5 + r0
            r4.zzf(r5)
            com.google.android.gms.internal.ads.zzajr r0 = r7.zza
            int r4 = r3 + (-1)
            int[] r0 = r0.zzf
            r0 = r0[r4]
            r4 = 255(0xff, float:3.57E-43)
            if (r0 == r4) goto L83
            goto L84
        L83:
            r2 = r1
        L84:
            r7.zze = r2
        L86:
            com.google.android.gms.internal.ads.zzajr r0 = r7.zza
            int r0 = r0.zzc
            if (r3 != r0) goto L8d
            r3 = -1
        L8d:
            r7.zzc = r3
            goto Ld
        L91:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzajq.zzb(com.google.android.gms.internal.ads.zzadb):boolean");
    }

    public final zzajr zzc() {
        return this.zza;
    }

    public final zzeg zzd() {
        return this.zzb;
    }

    public final void zze() {
        zzeg zzegVar = this.zzb;
        if (zzegVar.zzi().length == 65025) {
            return;
        }
        zzegVar.zzb(Arrays.copyOf(zzegVar.zzi(), Math.max(OggPageHeader.MAX_PAGE_PAYLOAD, zzegVar.zze())), zzegVar.zze());
    }
}
