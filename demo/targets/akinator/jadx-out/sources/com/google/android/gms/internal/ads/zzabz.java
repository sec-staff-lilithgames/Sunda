package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzabz {
    public static final /* synthetic */ int zza = 0;
    private static final int[] zzb = {96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 7350};
    private static final int[] zzc = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};

    public static zzaby zza(byte[] bArr) throws zzat {
        return zzb(new zzef(bArr, bArr.length), false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x00c3, code lost:
    
        if (r11 != 3) goto L58;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00bd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.gms.internal.ads.zzaby zzb(com.google.android.gms.internal.ads.zzef r11, boolean r12) throws com.google.android.gms.internal.ads.zzat {
        /*
            Method dump skipped, instructions count: 282
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzabz.zzb(com.google.android.gms.internal.ads.zzef, boolean):com.google.android.gms.internal.ads.zzaby");
    }

    private static int zzc(zzef zzefVar) {
        int iZzj = zzefVar.zzj(5);
        return iZzj == 31 ? zzefVar.zzj(6) + 32 : iZzj;
    }

    private static int zzd(zzef zzefVar) throws zzat {
        int iZzj = zzefVar.zzj(4);
        if (iZzj == 15) {
            if (zzefVar.zzc() >= 24) {
                return zzefVar.zzj(24);
            }
            throw zzat.zzb("AAC header insufficient data", null);
        }
        if (iZzj < 13) {
            return zzb[iZzj];
        }
        throw zzat.zzb("AAC header wrong Sampling Frequency Index", null);
    }
}
