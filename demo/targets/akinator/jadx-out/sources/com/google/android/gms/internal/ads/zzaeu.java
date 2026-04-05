package com.google.android.gms.internal.ads;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzaeu implements zzada {
    private static final int[] zza = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};
    private static final int[] zzb = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};
    private static final byte[] zzc;
    private static final byte[] zzd;
    private final byte[] zze;
    private final zzaem zzf;
    private boolean zzg;
    private long zzh;
    private int zzi;
    private int zzj;
    private int zzk;
    private int zzl;
    private long zzm;
    private zzadd zzn;
    private zzaem zzo;
    private zzaem zzp;
    private zzaed zzq;
    private long zzr;
    private boolean zzs;

    static {
        String str = zzep.zza;
        Charset charset = StandardCharsets.UTF_8;
        zzc = "#!AMR\n".getBytes(charset);
        zzd = "#!AMR-WB\n".getBytes(charset);
    }

    public zzaeu() {
        throw null;
    }

    private final boolean zzg(zzadb zzadbVar) throws IOException {
        byte[] bArr = zzc;
        if (zzh(zzadbVar, bArr)) {
            this.zzg = false;
            zzadbVar.zzf(bArr.length);
            return true;
        }
        byte[] bArr2 = zzd;
        if (!zzh(zzadbVar, bArr2)) {
            return false;
        }
        this.zzg = true;
        zzadbVar.zzf(bArr2.length);
        return true;
    }

    private static boolean zzh(zzadb zzadbVar, byte[] bArr) throws IOException {
        zzadbVar.zzl();
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        zzadbVar.zzi(bArr2, 0, length);
        return Arrays.equals(bArr2, bArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003a A[Catch: EOFException -> 0x00a4, TryCatch #0 {EOFException -> 0x00a4, blocks: (B:4:0x0007, B:6:0x0018, B:20:0x003a, B:22:0x0043, B:21:0x003f, B:31:0x005d, B:32:0x0085, B:33:0x0086, B:34:0x00a3), top: B:44:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003f A[Catch: EOFException -> 0x00a4, TryCatch #0 {EOFException -> 0x00a4, blocks: (B:4:0x0007, B:6:0x0018, B:20:0x003a, B:22:0x0043, B:21:0x003f, B:31:0x005d, B:32:0x0085, B:33:0x0086, B:34:0x00a3), top: B:44:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0050  */
    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"realTrackOutput"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final int zzi(com.google.android.gms.internal.ads.zzadb r12) throws java.io.IOException {
        /*
            r11 = this;
            int r0 = r11.zzj
            r1 = -1
            r2 = 1
            r3 = 0
            if (r0 != 0) goto La5
            java.lang.String r0 = "Invalid padding bits for frame header "
            r12.zzl()     // Catch: java.io.EOFException -> La4
            byte[] r4 = r11.zze     // Catch: java.io.EOFException -> La4
            r12.zzi(r4, r3, r2)     // Catch: java.io.EOFException -> La4
            r4 = r4[r3]     // Catch: java.io.EOFException -> La4
            r5 = r4 & 131(0x83, float:1.84E-43)
            r6 = 0
            if (r5 > 0) goto L86
            int r0 = r4 >> 3
            java.lang.String r4 = "Illegal AMR "
            java.lang.String r5 = " frame type "
            boolean r7 = r11.zzg     // Catch: java.io.EOFException -> La4
            r0 = r0 & 15
            if (r7 == 0) goto L2d
            r8 = 10
            if (r0 < r8) goto L38
            r8 = 13
            if (r0 <= r8) goto L2d
            goto L38
        L2d:
            if (r7 != 0) goto L56
            r8 = 12
            if (r0 < r8) goto L38
            r8 = 14
            if (r0 > r8) goto L38
            goto L56
        L38:
            if (r7 == 0) goto L3f
            int[] r4 = com.google.android.gms.internal.ads.zzaeu.zzb     // Catch: java.io.EOFException -> La4
            r0 = r4[r0]     // Catch: java.io.EOFException -> La4
            goto L43
        L3f:
            int[] r4 = com.google.android.gms.internal.ads.zzaeu.zza     // Catch: java.io.EOFException -> La4
            r0 = r4[r0]     // Catch: java.io.EOFException -> La4
        L43:
            r11.zzi = r0     // Catch: java.io.EOFException -> La4
            r11.zzj = r0
            int r4 = r11.zzk
            if (r4 != r1) goto L4e
            r11.zzk = r0
            r4 = r0
        L4e:
            if (r4 != r0) goto La5
            int r4 = r11.zzl
            int r4 = r4 + r2
            r11.zzl = r4
            goto La5
        L56:
            java.lang.String r12 = "WB"
            java.lang.String r3 = "NB"
            if (r2 == r7) goto L5d
            r12 = r3
        L5d:
            int r2 = r12.length()     // Catch: java.io.EOFException -> La4
            int r2 = r2 + 24
            java.lang.String r3 = java.lang.String.valueOf(r0)     // Catch: java.io.EOFException -> La4
            int r3 = r3.length()     // Catch: java.io.EOFException -> La4
            int r2 = r2 + r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.io.EOFException -> La4
            r3.<init>(r2)     // Catch: java.io.EOFException -> La4
            r3.append(r4)     // Catch: java.io.EOFException -> La4
            r3.append(r12)     // Catch: java.io.EOFException -> La4
            r3.append(r5)     // Catch: java.io.EOFException -> La4
            r3.append(r0)     // Catch: java.io.EOFException -> La4
            java.lang.String r12 = r3.toString()     // Catch: java.io.EOFException -> La4
            com.google.android.gms.internal.ads.zzat r12 = com.google.android.gms.internal.ads.zzat.zzb(r12, r6)     // Catch: java.io.EOFException -> La4
            throw r12     // Catch: java.io.EOFException -> La4
        L86:
            java.lang.String r12 = java.lang.String.valueOf(r4)     // Catch: java.io.EOFException -> La4
            int r12 = r12.length()     // Catch: java.io.EOFException -> La4
            int r12 = r12 + 38
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.io.EOFException -> La4
            r2.<init>(r12)     // Catch: java.io.EOFException -> La4
            r2.append(r0)     // Catch: java.io.EOFException -> La4
            r2.append(r4)     // Catch: java.io.EOFException -> La4
            java.lang.String r12 = r2.toString()     // Catch: java.io.EOFException -> La4
            com.google.android.gms.internal.ads.zzat r12 = com.google.android.gms.internal.ads.zzat.zzb(r12, r6)     // Catch: java.io.EOFException -> La4
            throw r12     // Catch: java.io.EOFException -> La4
        La4:
            return r1
        La5:
            com.google.android.gms.internal.ads.zzaem r4 = r11.zzp
            int r12 = r4.zzy(r12, r0, r2)
            if (r12 != r1) goto Lae
            return r1
        Lae:
            int r0 = r11.zzj
            int r0 = r0 - r12
            r11.zzj = r0
            if (r0 <= 0) goto Lb6
            return r3
        Lb6:
            com.google.android.gms.internal.ads.zzaem r4 = r11.zzp
            long r5 = r11.zzh
            int r8 = r11.zzi
            r9 = 0
            r10 = 0
            r7 = 1
            r4.zzx(r5, r7, r8, r9, r10)
            long r0 = r11.zzh
            r4 = 20000(0x4e20, double:9.8813E-320)
            long r0 = r0 + r4
            r11.zzh = r0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaeu.zzi(com.google.android.gms.internal.ads.zzadb):int");
    }

    @Override // com.google.android.gms.internal.ads.zzada
    public final boolean zza(zzadb zzadbVar) throws IOException {
        return zzg(zzadbVar);
    }

    @Override // com.google.android.gms.internal.ads.zzada
    public final void zzc(zzadd zzaddVar) {
        this.zzn = zzaddVar;
        zzaem zzaemVarZzu = zzaddVar.zzu(0, 1);
        this.zzo = zzaemVarZzu;
        this.zzp = zzaemVarZzu;
        zzaddVar.zzv();
    }

    @Override // com.google.android.gms.internal.ads.zzada
    public final int zzd(zzadb zzadbVar, zzaea zzaeaVar) throws IOException {
        this.zzo.getClass();
        String str = zzep.zza;
        if (zzadbVar.zzn() == 0 && !zzg(zzadbVar)) {
            throw zzat.zzb("Could not find AMR header.", null);
        }
        if (!this.zzs) {
            this.zzs = true;
            boolean z10 = this.zzg;
            String str2 = MimeTypes.AUDIO_AMR_WB;
            String str3 = true != z10 ? "audio/amr" : MimeTypes.AUDIO_AMR_WB;
            if (true != z10) {
                str2 = MimeTypes.AUDIO_AMR_NB;
            }
            int i10 = true != z10 ? 8000 : 16000;
            int i11 = z10 ? zzb[8] : zza[7];
            zzaem zzaemVar = this.zzo;
            zzt zztVar = new zzt();
            zztVar.zzl(str3);
            zztVar.zzm(str2);
            zztVar.zzn(i11);
            zztVar.zzE(1);
            zztVar.zzF(i10);
            zzaemVar.zzu(zztVar.zzM());
        }
        int iZzi = zzi(zzadbVar);
        if (this.zzq == null) {
            zzaec zzaecVar = new zzaec(C.TIME_UNSET, 0L);
            this.zzq = zzaecVar;
            this.zzn.zzw(zzaecVar);
        }
        return iZzi == -1 ? -1 : 0;
    }

    @Override // com.google.android.gms.internal.ads.zzada
    public final void zze(long j10, long j11) {
        this.zzh = 0L;
        this.zzi = 0;
        this.zzj = 0;
        this.zzr = j11;
        this.zzm = 0L;
    }

    public zzaeu(int i10) {
        this.zze = new byte[1];
        this.zzk = -1;
        zzacx zzacxVar = new zzacx();
        this.zzf = zzacxVar;
        this.zzp = zzacxVar;
    }
}
