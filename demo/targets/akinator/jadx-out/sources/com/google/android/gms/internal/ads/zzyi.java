package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Point;
import android.os.Build;
import android.text.TextUtils;
import android.util.Pair;
import android.view.accessibility.CaptioningManager;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.RandomAccess;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzyi extends zzyo implements zzlo {
    public static final /* synthetic */ int zzb = 0;
    private static final zzgqy zzc = zzgqy.zzc(zzxo.zza);
    public final Context zza;
    private final Object zzd;
    private zzxt zze;
    private Thread zzf;
    private zzxx zzg;
    private zzd zzh;
    private Boolean zzi;
    private final zzxb zzj;

    public zzyi(Context context) {
        zzxb zzxbVar = new zzxb();
        zzxt zzxtVar = zzxt.zzJ;
        this.zzd = new Object();
        byte[] bArr = null;
        this.zza = context != null ? context.getApplicationContext() : null;
        this.zzj = zzxbVar;
        if (zzxtVar != null) {
            this.zze = zzxtVar;
        } else {
            zzxs zzxsVar = new zzxs(zzxtVar, bArr);
            zzxsVar.zzx((zzbl) zzxtVar);
            this.zze = new zzxt(zzxsVar, bArr);
        }
        this.zzh = zzd.zza;
        if (this.zze.zzU && context == null) {
            zzdt.zzc("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
    }

    public static String zzi(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, C.LANGUAGE_UNDETERMINED)) {
            return null;
        }
        return str;
    }

    public static int zzj(zzv zzvVar, String str, boolean z10) {
        if (!TextUtils.isEmpty(str) && str.equals(zzvVar.zzd)) {
            return 4;
        }
        String strZzi = zzi(str);
        String strZzi2 = zzi(zzvVar.zzd);
        if (strZzi2 == null || strZzi == null) {
            return (z10 && strZzi2 == null) ? 1 : 0;
        }
        if (strZzi2.startsWith(strZzi) || strZzi.startsWith(strZzi2)) {
            return 3;
        }
        String str2 = zzep.zza;
        return strZzi2.split("-", 2)[0].equals(strZzi.split("-", 2)[0]) ? 2 : 0;
    }

    public static /* synthetic */ int zzm(int i10, int i11) {
        if (i10 == 0 || i10 != i11) {
            return Integer.bitCount(i10 & i11);
        }
        return Integer.MAX_VALUE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0027, code lost:
    
        r1 = r1 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ int zzn(com.google.android.gms.internal.ads.zzv r5, com.google.android.gms.internal.ads.zzgpe r6) {
        /*
            r0 = 0
            r1 = r0
        L2:
            int r2 = r6.size()
            if (r1 >= r2) goto L2a
            r2 = r0
        L9:
            java.util.List r3 = r5.zzc
            int r4 = r3.size()
            if (r2 >= r4) goto L27
            java.lang.Object r3 = r3.get(r2)
            com.google.android.gms.internal.ads.zzx r3 = (com.google.android.gms.internal.ads.zzx) r3
            java.lang.String r3 = r3.zzb
            java.lang.Object r4 = r6.get(r1)
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L24
            return r1
        L24:
            int r2 = r2 + 1
            goto L9
        L27:
            int r1 = r1 + 1
            goto L2
        L2a:
            r5 = 2147483647(0x7fffffff, float:NaN)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzyi.zzn(com.google.android.gms.internal.ads.zzv, com.google.android.gms.internal.ads.zzgpe):int");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzu, reason: merged with bridge method [inline-methods] */
    public final void zzl() {
        boolean z10;
        zzxx zzxxVar;
        synchronized (this.zzd) {
            try {
                z10 = false;
                if (this.zze.zzU && Build.VERSION.SDK_INT >= 32 && (zzxxVar = this.zzg) != null && zzxxVar.zza()) {
                    z10 = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (z10) {
            zzs();
        }
    }

    private static void zzv(zzwv zzwvVar, zzbl zzblVar, Map map) {
        for (int i10 = 0; i10 < zzwvVar.zzb; i10++) {
            if (((zzbh) zzblVar.zzH.get(zzwvVar.zza(i10))) != null) {
                throw null;
            }
        }
    }

    private static final Pair zzw(int i10, zzyn zzynVar, int[][][] iArr, zzxz zzxzVar, Comparator comparator) {
        RandomAccess randomAccessZzj;
        zzyn zzynVar2 = zzynVar;
        ArrayList arrayList = new ArrayList();
        int i11 = 0;
        while (i11 < 2) {
            if (i10 == zzynVar2.zza(i11)) {
                zzwv zzwvVarZzb = zzynVar2.zzb(i11);
                for (int i12 = 0; i12 < zzwvVarZzb.zzb; i12++) {
                    zzbg zzbgVarZza = zzwvVarZzb.zza(i12);
                    List listZza = zzxzVar.zza(i11, zzbgVarZza, iArr[i11][i12]);
                    int i13 = zzbgVarZza.zza;
                    boolean[] zArr = new boolean[i13];
                    int i14 = 0;
                    while (i14 < i13) {
                        int i15 = i14 + 1;
                        zzya zzyaVar = (zzya) listZza.get(i14);
                        int iZza = zzyaVar.zza();
                        if (!zArr[i14] && iZza != 0) {
                            if (iZza == 1) {
                                randomAccessZzj = zzgpe.zzj(zzyaVar);
                            } else {
                                ArrayList arrayList2 = new ArrayList();
                                arrayList2.add(zzyaVar);
                                for (int i16 = i15; i16 < i13; i16++) {
                                    zzya zzyaVar2 = (zzya) listZza.get(i16);
                                    if (zzyaVar2.zza() == 2 && zzyaVar.zzc(zzyaVar2)) {
                                        arrayList2.add(zzyaVar2);
                                        zArr[i16] = true;
                                    }
                                }
                                randomAccessZzj = arrayList2;
                            }
                            arrayList.add(randomAccessZzj);
                        }
                        i14 = i15;
                    }
                }
            }
            i11++;
            zzynVar2 = zzynVar;
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        List list = (List) Collections.max(arrayList, comparator);
        int[] iArr2 = new int[list.size()];
        for (int i17 = 0; i17 < list.size(); i17++) {
            iArr2[i17] = ((zzya) list.get(i17)).zzc;
        }
        zzya zzyaVar3 = (zzya) list.get(0);
        return Pair.create(new zzyj(zzyaVar3.zzb, iArr2, 0), Integer.valueOf(zzyaVar3.zza));
    }

    @Override // com.google.android.gms.internal.ads.zzlo
    public final void zza(zzln zzlnVar) {
        synchronized (this.zzd) {
            boolean z10 = this.zze.zzY;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzyr
    public final void zzb() {
        zzxx zzxxVar;
        synchronized (this.zzd) {
            try {
                Thread thread = this.zzf;
                if (thread != null) {
                    zzgmd.zzi(thread == Thread.currentThread(), "DefaultTrackSelector is accessed on the wrong thread.");
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (Build.VERSION.SDK_INT >= 32 && (zzxxVar = this.zzg) != null) {
            zzxxVar.zze();
            this.zzg = null;
        }
        super.zzb();
    }

    public final zzxt zzc() {
        zzxt zzxtVar;
        synchronized (this.zzd) {
            zzxtVar = this.zze;
        }
        return zzxtVar;
    }

    @Override // com.google.android.gms.internal.ads.zzyr
    public final boolean zzd() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzyr
    public final void zze(zzd zzdVar) {
        if (this.zzh.equals(zzdVar)) {
            return;
        }
        this.zzh = zzdVar;
        zzl();
    }

    public final void zzf(zzxs zzxsVar) {
        boolean zEquals;
        zzxt zzxtVar = new zzxt(zzxsVar, null);
        synchronized (this.zzd) {
            zEquals = this.zze.equals(zzxtVar);
            this.zze = zzxtVar;
        }
        if (zEquals) {
            return;
        }
        if (zzxtVar.zzU && this.zza == null) {
            zzdt.zzc("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
        zzs();
    }

    @Override // com.google.android.gms.internal.ads.zzyo
    public final Pair zzh(zzyn zzynVar, int[][][] iArr, final int[] iArr2, zzuu zzuuVar, zzbf zzbfVar) throws zzib {
        final zzxt zzxtVar;
        int i10;
        final boolean z10;
        final String str;
        final String languageTag;
        int[] iArr3;
        int length;
        Context context;
        CaptioningManager captioningManager;
        Locale locale;
        Context context2;
        Context context3;
        synchronized (this.zzd) {
            this.zzf = Thread.currentThread();
            zzxtVar = this.zze;
        }
        if (this.zzi == null && (context3 = this.zza) != null) {
            this.zzi = Boolean.valueOf(zzep.zzN(context3));
        }
        if (zzxtVar.zzU && Build.VERSION.SDK_INT >= 32 && this.zzg == null) {
            this.zzg = new zzxx(this.zza, this, this.zzi);
        }
        int i11 = 2;
        zzyj[] zzyjVarArr = new zzyj[2];
        int i12 = 0;
        int i13 = 0;
        while (true) {
            i10 = 1;
            if (i13 >= 2) {
                z10 = false;
                break;
            }
            if (zzynVar.zza(i13) == 2 && zzynVar.zzb(i13).zzb > 0) {
                z10 = true;
                break;
            }
            i13++;
        }
        Pair pairZzw = zzw(1, zzynVar, iArr, new zzxz() { // from class: com.google.android.gms.internal.ads.zzxk
            @Override // com.google.android.gms.internal.ads.zzxz
            public final /* synthetic */ List zza(int i14, zzbg zzbgVar, int[] iArr4) {
                final zzyi zzyiVar = this.zza;
                final zzxt zzxtVar2 = zzxtVar;
                zzgme zzgmeVar = new zzgme() { // from class: com.google.android.gms.internal.ads.zzxn
                    @Override // com.google.android.gms.internal.ads.zzgme
                    public final /* synthetic */ boolean zza(Object obj) {
                        return zzyiVar.zzk(zzxtVar2, (zzv) obj);
                    }
                };
                int i15 = iArr2[i14];
                int i16 = zzgpe.zzd;
                zzgpb zzgpbVar = new zzgpb();
                for (int i17 = 0; i17 < zzbgVar.zza; i17++) {
                    zzgpbVar.zzf(new zzxf(i14, zzbgVar, i17, zzxtVar2, iArr4[i17], z10, zzgmeVar, i15));
                }
                return zzgpbVar.zzi();
            }
        }, zzxg.zza);
        if (pairZzw != null) {
            zzyjVarArr[((Integer) pairZzw.second).intValue()] = (zzyj) pairZzw.first;
        }
        if (pairZzw == null) {
            str = null;
        } else {
            Object obj = pairZzw.first;
            str = ((zzyj) obj).zza.zza(((zzyj) obj).zzb[0]).zzd;
        }
        int i14 = zzxtVar.zzw.zzb;
        final Point pointZzP = (!zzxtVar.zzk || (context2 = this.zza) == null) ? null : zzep.zzP(context2);
        Pair pairZzw2 = zzw(2, zzynVar, iArr, new zzxz() { // from class: com.google.android.gms.internal.ads.zzxp
            /* JADX WARN: Removed duplicated region for block: B:29:0x004d  */
            /* JADX WARN: Removed duplicated region for block: B:32:0x0057  */
            /* JADX WARN: Removed duplicated region for block: B:33:0x0063  */
            @Override // com.google.android.gms.internal.ads.zzxz
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final /* synthetic */ java.util.List zza(int r18, com.google.android.gms.internal.ads.zzbg r19, int[] r20) {
                /*
                    Method dump skipped, instructions count: 207
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzxp.zza(int, com.google.android.gms.internal.ads.zzbg, int[]):java.util.List");
            }
        }, zzxj.zza);
        int i15 = 4;
        Pair pairZzw3 = pairZzw2 == null ? zzw(4, zzynVar, iArr, new zzxz() { // from class: com.google.android.gms.internal.ads.zzxm
            @Override // com.google.android.gms.internal.ads.zzxz
            public final /* synthetic */ List zza(int i16, zzbg zzbgVar, int[] iArr4) {
                int i17 = zzyi.zzb;
                int i18 = zzgpe.zzd;
                zzgpb zzgpbVar = new zzgpb();
                for (int i19 = 0; i19 < zzbgVar.zza; i19++) {
                    zzgpbVar.zzf(new zzxq(i16, zzbgVar, i19, zzxtVar, iArr4[i19]));
                }
                return zzgpbVar.zzi();
            }
        }, zzxh.zza) : null;
        if (pairZzw3 != null) {
            zzyjVarArr[((Integer) pairZzw3.second).intValue()] = (zzyj) pairZzw3.first;
        } else if (pairZzw2 != null) {
            zzyjVarArr[((Integer) pairZzw2.second).intValue()] = (zzyj) pairZzw2.first;
        }
        if (!zzxtVar.zzB || (context = this.zza) == null || (captioningManager = (CaptioningManager) context.getSystemService("captioning")) == null || !captioningManager.isEnabled() || (locale = captioningManager.getLocale()) == null) {
            languageTag = null;
        } else {
            String str2 = zzep.zza;
            languageTag = locale.toLanguageTag();
        }
        int i16 = 3;
        Pair pairZzw4 = zzw(3, zzynVar, iArr, new zzxz() { // from class: com.google.android.gms.internal.ads.zzxl
            @Override // com.google.android.gms.internal.ads.zzxz
            public final /* synthetic */ List zza(int i17, zzbg zzbgVar, int[] iArr4) {
                int i18 = zzyi.zzb;
                int i19 = zzgpe.zzd;
                zzgpb zzgpbVar = new zzgpb();
                for (int i20 = 0; i20 < zzbgVar.zza; i20++) {
                    zzgpbVar.zzf(new zzxy(i17, zzbgVar, i20, zzxtVar, iArr4[i20], str, languageTag));
                }
                return zzgpbVar.zzi();
            }
        }, zzxi.zza);
        if (pairZzw4 != null) {
            zzyjVarArr[((Integer) pairZzw4.second).intValue()] = (zzyj) pairZzw4.first;
        }
        int i17 = 0;
        while (i17 < i11) {
            int iZza = zzynVar.zza(i17);
            if (iZza != i11 && iZza != i10 && iZza != i16 && iZza != i15) {
                zzwv zzwvVarZzb = zzynVar.zzb(i17);
                int[][] iArr4 = iArr[i17];
                int i18 = i12;
                int i19 = i18;
                zzbg zzbgVar = null;
                zzxr zzxrVar = null;
                while (i18 < zzwvVarZzb.zzb) {
                    zzbg zzbgVarZza = zzwvVarZzb.zza(i18);
                    int[] iArr5 = iArr4[i18];
                    zzxr zzxrVar2 = zzxrVar;
                    for (int i20 = i12; i20 < zzbgVarZza.zza; i20++) {
                        if (zzlp.zzaa(iArr5[i20], zzxtVar.zzV)) {
                            zzxr zzxrVar3 = new zzxr(zzbgVarZza.zza(i20), iArr5[i20]);
                            if (zzxrVar2 == null || zzxrVar3.compareTo(zzxrVar2) > 0) {
                                zzbgVar = zzbgVarZza;
                                zzxrVar2 = zzxrVar3;
                                i19 = i20;
                            }
                        }
                    }
                    i18++;
                    zzxrVar = zzxrVar2;
                    i12 = 0;
                }
                zzyjVarArr[i17] = zzbgVar == null ? null : new zzyj(zzbgVar, new int[]{i19}, 0);
            }
            i17++;
            i11 = 2;
            i12 = 0;
            i16 = 3;
            i10 = 1;
            i15 = 4;
        }
        HashMap map = new HashMap();
        int i21 = 2;
        for (int i22 = 0; i22 < 2; i22++) {
            zzv(zzynVar.zzb(i22), zzxtVar, map);
        }
        zzv(zzynVar.zze(), zzxtVar, map);
        for (int i23 = 0; i23 < 2; i23++) {
            if (((zzbh) map.get(Integer.valueOf(zzynVar.zza(i23)))) != null) {
                throw null;
            }
        }
        int i24 = 0;
        while (i24 < i21) {
            zzwv zzwvVarZzb2 = zzynVar.zzb(i24);
            if (zzxtVar.zzb(i24, zzwvVarZzb2)) {
                if (zzxtVar.zzc(i24, zzwvVarZzb2) != null) {
                    throw null;
                }
                zzyjVarArr[i24] = null;
            }
            i24++;
            i21 = 2;
        }
        int i25 = 0;
        while (i25 < i21) {
            int iZza2 = zzynVar.zza(i25);
            if (zzxtVar.zza(i25) || zzxtVar.zzI.contains(Integer.valueOf(iZza2))) {
                zzyjVarArr[i25] = null;
            }
            i25++;
            i21 = 2;
        }
        zzxb zzxbVar = this.zzj;
        zzza zzzaVarZzt = zzt();
        zzgpe zzgpeVarZzd = zzxc.zzd(zzyjVarArr);
        int i26 = 2;
        zzyk[] zzykVarArr = new zzyk[2];
        int i27 = 0;
        while (i27 < i26) {
            zzyj zzyjVar = zzyjVarArr[i27];
            if (zzyjVar != null && (length = (iArr3 = zzyjVar.zzb).length) != 0) {
                zzykVarArr[i27] = length == 1 ? new zzyl(zzyjVar.zza, iArr3[0], 0, 0, null) : zzxbVar.zza(zzyjVar.zza, iArr3, 0, zzzaVarZzt, (zzgpe) zzgpeVarZzd.get(i27));
            }
            i27++;
            i26 = 2;
        }
        zzlq[] zzlqVarArr = new zzlq[i26];
        for (int i28 = 0; i28 < i26; i28++) {
            zzlqVarArr[i28] = (zzxtVar.zza(i28) || zzxtVar.zzI.contains(Integer.valueOf(zzynVar.zza(i28))) || (zzynVar.zza(i28) != -2 && zzykVarArr[i28] == null)) ? null : zzlq.zza;
        }
        return Pair.create(zzlqVarArr, zzykVarArr);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:31:0x004b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* synthetic */ boolean zzk(com.google.android.gms.internal.ads.zzxt r4, com.google.android.gms.internal.ads.zzv r5) {
        /*
            r3 = this;
            boolean r4 = r4.zzU
            r0 = 1
            if (r4 == 0) goto L83
            java.lang.Boolean r4 = r3.zzi
            if (r4 == 0) goto L11
            boolean r4 = r4.booleanValue()
            if (r4 != 0) goto L10
            goto L11
        L10:
            return r0
        L11:
            int r4 = r5.zzG
            r1 = -1
            if (r4 == r1) goto L83
            r1 = 2
            if (r4 <= r1) goto L83
            java.lang.String r4 = r5.zzo
            r1 = 32
            if (r4 != 0) goto L20
            goto L5a
        L20:
            int r2 = r4.hashCode()
            switch(r2) {
                case -2123537834: goto L43;
                case 187078296: goto L3a;
                case 187078297: goto L31;
                case 1504578661: goto L28;
                default: goto L27;
            }
        L27:
            goto L5a
        L28:
            java.lang.String r2 = "audio/eac3"
            boolean r4 = r4.equals(r2)
            if (r4 == 0) goto L5a
            goto L4b
        L31:
            java.lang.String r2 = "audio/ac4"
            boolean r4 = r4.equals(r2)
            if (r4 == 0) goto L5a
            goto L4b
        L3a:
            java.lang.String r2 = "audio/ac3"
            boolean r4 = r4.equals(r2)
            if (r4 == 0) goto L5a
            goto L4b
        L43:
            java.lang.String r2 = "audio/eac3-joc"
            boolean r4 = r4.equals(r2)
            if (r4 == 0) goto L5a
        L4b:
            int r4 = android.os.Build.VERSION.SDK_INT
            if (r4 < r1) goto L59
            com.google.android.gms.internal.ads.zzxx r4 = r3.zzg
            if (r4 == 0) goto L59
            boolean r4 = r4.zza()
            if (r4 != 0) goto L5a
        L59:
            return r0
        L5a:
            int r4 = android.os.Build.VERSION.SDK_INT
            r2 = 0
            if (r4 < r1) goto L82
            com.google.android.gms.internal.ads.zzxx r4 = r3.zzg
            if (r4 == 0) goto L82
            boolean r1 = r4.zza()
            if (r1 == 0) goto L82
            boolean r4 = r4.zzb()
            if (r4 == 0) goto L82
            com.google.android.gms.internal.ads.zzxx r4 = r3.zzg
            boolean r4 = r4.zzc()
            if (r4 == 0) goto L82
            com.google.android.gms.internal.ads.zzxx r4 = r3.zzg
            com.google.android.gms.internal.ads.zzd r1 = r3.zzh
            boolean r4 = r4.zzd(r1, r5)
            if (r4 == 0) goto L82
            return r0
        L82:
            return r2
        L83:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzyi.zzk(com.google.android.gms.internal.ads.zzxt, com.google.android.gms.internal.ads.zzv):boolean");
    }

    @Override // com.google.android.gms.internal.ads.zzyr
    public final zzlo zzg() {
        return this;
    }
}
