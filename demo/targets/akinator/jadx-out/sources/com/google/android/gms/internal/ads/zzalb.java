package com.google.android.gms.internal.ads;

import android.graphics.Color;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzalb {
    public final String zza;
    public final int zzb;
    public final Integer zzc;
    public final Integer zzd;
    public final float zze;
    public final boolean zzf;
    public final boolean zzg;
    public final boolean zzh;
    public final boolean zzi;
    public final int zzj;

    private zzalb(String str, int i10, Integer num, Integer num2, float f10, boolean z10, boolean z11, boolean z12, boolean z13, int i11) {
        this.zza = str;
        this.zzb = i10;
        this.zzc = num;
        this.zzd = num2;
        this.zze = f10;
        this.zzf = z10;
        this.zzg = z11;
        this.zzh = z12;
        this.zzi = z13;
        this.zzj = i11;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0117 A[Catch: RuntimeException -> 0x00ba, TRY_LEAVE, TryCatch #2 {RuntimeException -> 0x00ba, blocks: (B:33:0x00c0, B:35:0x00c6, B:39:0x00d6, B:41:0x00da, B:45:0x00e9, B:47:0x00ed, B:51:0x00fe, B:53:0x0102, B:57:0x0113, B:59:0x0117, B:60:0x011f, B:68:0x013d, B:66:0x0130, B:28:0x00a1, B:23:0x008d), top: B:73:0x008d, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x013b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.gms.internal.ads.zzalb zza(java.lang.String r20, com.google.android.gms.internal.ads.zzakz r21) throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 342
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzalb.zza(java.lang.String, com.google.android.gms.internal.ads.zzakz):com.google.android.gms.internal.ads.zzalb");
    }

    public static Integer zzb(String str) {
        try {
            long j10 = str.startsWith("&H") ? Long.parseLong(str.substring(2), 16) : Long.parseLong(str);
            zzgmd.zza(j10 <= 4294967295L);
            return Integer.valueOf(Color.argb(zzgst.zza(((j10 >> 24) & 255) ^ 255), zzgst.zza(j10 & 255), zzgst.zza((j10 >> 8) & 255), zzgst.zza((j10 >> 16) & 255)));
        } catch (IllegalArgumentException e10) {
            zzdt.zzd("SsaStyle", a.b.o(new StringBuilder(String.valueOf(str).length() + 36), "Failed to parse color expression: '", str, "'"), e10);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int zzd(String str) throws NumberFormatException {
        int i10;
        try {
            i10 = Integer.parseInt(str.trim());
        } catch (NumberFormatException unused) {
        }
        switch (i10) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                return i10;
            default:
                com.bytedance.sdk.component.adexpress.dynamic.dynamicview.a.r(str, "Ignoring unknown alignment: ", "SsaStyle");
                return -1;
        }
    }

    private static boolean zze(String str) throws NumberFormatException {
        try {
            int i10 = Integer.parseInt(str);
            return i10 == 1 || i10 == -1;
        } catch (NumberFormatException e10) {
            zzdt.zzd("SsaStyle", a.b.o(new StringBuilder(String.valueOf(str).length() + 33), "Failed to parse boolean value: '", str, "'"), e10);
            return false;
        }
    }
}
