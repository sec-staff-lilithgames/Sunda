package com.google.android.gms.internal.ads;

import java.util.regex.Pattern;
import kotlinx.coroutines.DebugKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzale {
    private static final Pattern zzd = Pattern.compile("\\s+");
    private static final zzgpo zze = zzgpo.zzj(DebugKt.DEBUG_PROPERTY_VALUE_AUTO, "none");
    private static final zzgpo zzf = zzgpo.zzk("dot", "sesame", "circle");
    private static final zzgpo zzg = zzgpo.zzj("filled", "open");
    private static final zzgpo zzh = zzgpo.zzk("after", "before", "outside");
    public final int zza;
    public final int zzb;
    public final int zzc;

    private zzale(int i10, int i11, int i12) {
        this.zza = i10;
        this.zzb = i11;
        this.zzc = i12;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.gms.internal.ads.zzale zza(java.lang.String r7) {
        /*
            if (r7 != 0) goto L4
            goto Le3
        L4:
            java.lang.String r7 = r7.trim()
            java.lang.String r7 = com.google.android.gms.internal.ads.zzglm.zza(r7)
            boolean r0 = r7.isEmpty()
            if (r0 != 0) goto Le3
            java.util.regex.Pattern r0 = com.google.android.gms.internal.ads.zzale.zzd
            java.lang.String[] r7 = android.text.TextUtils.split(r7, r0)
            com.google.android.gms.internal.ads.zzgpo r7 = com.google.android.gms.internal.ads.zzgpo.zzp(r7)
            com.google.android.gms.internal.ads.zzgpo r0 = com.google.android.gms.internal.ads.zzale.zzh
            com.google.android.gms.internal.ads.zzgrn r0 = com.google.android.gms.internal.ads.zzgro.zza(r0, r7)
            java.lang.String r1 = "outside"
            java.lang.Object r0 = com.google.android.gms.internal.ads.zzgps.zzb(r0, r1)
            java.lang.String r0 = (java.lang.String) r0
            int r2 = r0.hashCode()
            r3 = -1106037339(0xffffffffbe1335a5, float:-0.14375933)
            r4 = 1
            r5 = 2
            if (r2 == r3) goto L45
            r1 = 92734940(0x58705dc, float:1.2697491E-35)
            if (r2 == r1) goto L3b
            goto L4d
        L3b:
            java.lang.String r1 = "after"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L4d
            r0 = r5
            goto L4e
        L45:
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L4d
            r0 = -2
            goto L4e
        L4d:
            r0 = r4
        L4e:
            com.google.android.gms.internal.ads.zzgpo r1 = com.google.android.gms.internal.ads.zzale.zze
            com.google.android.gms.internal.ads.zzgrn r1 = com.google.android.gms.internal.ads.zzgro.zza(r1, r7)
            boolean r2 = r1.isEmpty()
            r3 = -1
            r6 = 0
            if (r2 != 0) goto L7d
            java.util.Iterator r7 = r1.iterator()
            java.lang.Object r7 = r7.next()
            java.lang.String r7 = (java.lang.String) r7
            int r1 = r7.hashCode()
            r2 = 3387192(0x33af38, float:4.746467E-39)
            if (r1 == r2) goto L70
            goto L7b
        L70:
            java.lang.String r1 = "none"
            boolean r7 = r7.equals(r1)
            if (r7 == 0) goto L7b
            r4 = r6
            goto Ldd
        L7b:
            r4 = r3
            goto Ldd
        L7d:
            com.google.android.gms.internal.ads.zzgpo r1 = com.google.android.gms.internal.ads.zzale.zzg
            com.google.android.gms.internal.ads.zzgrn r1 = com.google.android.gms.internal.ads.zzgro.zza(r1, r7)
            com.google.android.gms.internal.ads.zzgpo r2 = com.google.android.gms.internal.ads.zzale.zzf
            com.google.android.gms.internal.ads.zzgrn r7 = com.google.android.gms.internal.ads.zzgro.zza(r2, r7)
            boolean r2 = r1.isEmpty()
            if (r2 == 0) goto L96
            boolean r2 = r7.isEmpty()
            if (r2 == 0) goto L96
            goto L7b
        L96:
            java.lang.String r2 = "filled"
            java.lang.Object r1 = com.google.android.gms.internal.ads.zzgps.zzb(r1, r2)
            java.lang.String r1 = (java.lang.String) r1
            int r2 = r1.hashCode()
            r3 = 3417674(0x34264a, float:4.789181E-39)
            if (r2 == r3) goto La8
            goto Lb2
        La8:
            java.lang.String r2 = "open"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto Lb2
            r6 = r5
            goto Lb3
        Lb2:
            r6 = r4
        Lb3:
            java.lang.String r1 = "circle"
            java.lang.Object r7 = com.google.android.gms.internal.ads.zzgps.zzb(r7, r1)
            java.lang.String r7 = (java.lang.String) r7
            int r1 = r7.hashCode()
            r2 = -905816648(0xffffffffca0255b8, float:-2135406.0)
            if (r1 == r2) goto Ld4
            r2 = 99657(0x18549, float:1.39649E-40)
            if (r1 == r2) goto Lca
            goto Ldd
        Lca:
            java.lang.String r1 = "dot"
            boolean r7 = r7.equals(r1)
            if (r7 == 0) goto Ldd
            r4 = r5
            goto Ldd
        Ld4:
            java.lang.String r1 = "sesame"
            boolean r7 = r7.equals(r1)
            if (r7 == 0) goto Ldd
            r4 = 3
        Ldd:
            com.google.android.gms.internal.ads.zzale r7 = new com.google.android.gms.internal.ads.zzale
            r7.<init>(r4, r6, r0)
            return r7
        Le3:
            r7 = 0
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzale.zza(java.lang.String):com.google.android.gms.internal.ads.zzale");
    }
}
