package com.google.android.gms.internal.ads;

import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzadx {
    private static final String[] zza = {MimeTypes.AUDIO_MPEG_L1, MimeTypes.AUDIO_MPEG_L2, MimeTypes.AUDIO_MPEG};
    private static final int[] zzb = {44100, 48000, 32000};
    private static final int[] zzc = {32000, 64000, 96000, 128000, 160000, 192000, 224000, 256000, 288000, 320000, 352000, 384000, 416000, 448000};
    private static final int[] zzd = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000, 176000, 192000, 224000, 256000};
    private static final int[] zze = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000, 384000};
    private static final int[] zzf = {32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000};
    private static final int[] zzg = {8000, 16000, 24000, 32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000};

    public static int zza(int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        if (!zzl(i10) || (i11 = (i10 >>> 19) & 3) == 1 || (i12 = (i10 >>> 17) & 3) == 0 || (i13 = (i10 >>> 12) & 15) == 0 || i13 == 15 || (i14 = (i10 >>> 10) & 3) == 3) {
            return -1;
        }
        int i15 = i13 - 1;
        int i16 = zzb[i14];
        if (i11 == 2) {
            i16 /= 2;
        } else if (i11 == 0) {
            i16 /= 4;
        }
        int i17 = (i10 >>> 9) & 1;
        if (i12 == 3) {
            return ((((i11 == 3 ? zzc[i15] : zzd[i15]) * 12) / i16) + i17) * 4;
        }
        int i18 = i11 == 3 ? i12 == 2 ? zze[i15] : zzf[i15] : zzg[i15];
        if (i11 == 3) {
            return a.b.a(i18, 144, i16, i17);
        }
        return a.b.a(i12 == 1 ? 72 : 144, i18, i16, i17);
    }

    public static int zzb(int i10) {
        int i11;
        int i12;
        if (!zzl(i10) || (i11 = (i10 >>> 19) & 3) == 1 || (i12 = (i10 >>> 17) & 3) == 0) {
            return -1;
        }
        int i13 = i10 >>> 12;
        int i14 = (i10 >>> 10) & 3;
        int i15 = i13 & 15;
        if (i15 == 0 || i15 == 15 || i14 == 3) {
            return -1;
        }
        return zzm(i11, i12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean zzl(int i10) {
        return (i10 & (-2097152)) == -2097152;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int zzm(int i10, int i11) {
        return i11 != 1 ? i11 != 2 ? 384 : 1152 : i10 == 3 ? 1152 : 576;
    }
}
