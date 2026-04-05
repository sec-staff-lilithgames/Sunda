package com.google.android.gms.internal.ads;

import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.TypefaceSpan;
import com.inmobi.commons.core.configs.AdConfig;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import e3.g;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzaln implements zzaki {
    private final zzeg zza = new zzeg();
    private final boolean zzb;
    private final int zzc;
    private final int zzd;
    private final String zze;
    private final float zzf;
    private final int zzg;

    public zzaln(List list) {
        int size = list.size();
        String str = C.SANS_SERIF_NAME;
        if (size != 1 || (((byte[]) list.get(0)).length != 48 && ((byte[]) list.get(0)).length != 53)) {
            this.zzc = 0;
            this.zzd = -1;
            this.zze = C.SANS_SERIF_NAME;
            this.zzb = false;
            this.zzf = 0.85f;
            this.zzg = -1;
            return;
        }
        byte[] bArr = (byte[]) list.get(0);
        this.zzc = bArr[24];
        this.zzd = ((bArr[26] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 24) | ((bArr[27] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16) | ((bArr[28] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | (bArr[29] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED);
        this.zze = true == "Serif".equals(zzep.zzj(bArr, 43, bArr.length + (-43))) ? C.SERIF_NAME : str;
        int i10 = bArr[25] * 20;
        this.zzg = i10;
        boolean z10 = (bArr[0] & 32) != 0;
        this.zzb = z10;
        if (z10) {
            this.zzf = Math.max(0.0f, Math.min(((bArr[11] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | ((bArr[10] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8)) / i10, 0.95f));
        } else {
            this.zzf = 0.85f;
        }
    }

    private static void zzb(SpannableStringBuilder spannableStringBuilder, int i10, int i11, int i12, int i13, int i14) {
        if (i10 != i11) {
            int i15 = i14 | 33;
            int i16 = i10 & 1;
            int i17 = i10 & 2;
            boolean z10 = true;
            if (i16 != 0) {
                if (i17 != 0) {
                    g.s(3, spannableStringBuilder, i12, i13, i15);
                } else {
                    g.s(1, spannableStringBuilder, i12, i13, i15);
                    z10 = false;
                }
            } else if (i17 != 0) {
                g.s(2, spannableStringBuilder, i12, i13, i15);
            } else {
                z10 = false;
            }
            if ((i10 & 4) != 0) {
                g.u(spannableStringBuilder, i12, i13, i15);
            } else {
                if (i16 != 0 || z10) {
                    return;
                }
                g.s(0, spannableStringBuilder, i12, i13, i15);
            }
        }
    }

    private static void zzc(SpannableStringBuilder spannableStringBuilder, int i10, int i11, int i12, int i13, int i14) {
        if (i10 != i11) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan((i10 >>> 8) | ((i10 & 255) << 24)), i12, i13, i14 | 33);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzaki
    public final void zza(byte[] bArr, int i10, int i11, zzakh zzakhVar, zzdg zzdgVar) {
        String strZzK;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        SpannableStringBuilder spannableStringBuilder;
        int i17;
        int i18;
        int i19;
        int i20;
        zzeg zzegVar = this.zza;
        zzegVar.zzb(bArr, i10 + i11);
        zzegVar.zzh(i10);
        int i21 = 1;
        int i22 = 0;
        int i23 = 2;
        zzgmd.zza(zzegVar.zzd() >= 2);
        int iZzt = zzegVar.zzt();
        if (iZzt == 0) {
            strZzK = "";
        } else {
            int iZzg = zzegVar.zzg();
            Charset charsetZzR = zzegVar.zzR();
            int iZzg2 = zzegVar.zzg() - iZzg;
            if (charsetZzR == null) {
                charsetZzR = StandardCharsets.UTF_8;
            }
            strZzK = zzegVar.zzK(iZzt - iZzg2, charsetZzR);
        }
        if (strZzK.isEmpty()) {
            zzdgVar.zza(new zzaka(zzgpe.zzi(), C.TIME_UNSET, C.TIME_UNSET));
            return;
        }
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(strZzK);
        int i24 = this.zzc;
        zzb(spannableStringBuilder2, i24, 0, 0, spannableStringBuilder2.length(), 16711680);
        int i25 = i24;
        int i26 = this.zzd;
        zzc(spannableStringBuilder2, i26, -1, 0, spannableStringBuilder2.length(), 16711680);
        int i27 = i26;
        String str = this.zze;
        int length = spannableStringBuilder2.length();
        if (str != C.SANS_SERIF_NAME) {
            spannableStringBuilder2.setSpan(new TypefaceSpan(str), 0, length, 16711713);
        }
        float fMax = this.zzf;
        while (zzegVar.zzd() >= 8) {
            int iZzg3 = zzegVar.zzg();
            int iZzB = zzegVar.zzB();
            int iZzB2 = zzegVar.zzB();
            if (iZzB2 == 1937013100) {
                zzgmd.zza(zzegVar.zzd() >= i23 ? i21 : i22);
                int iZzt2 = zzegVar.zzt();
                int i28 = i22;
                while (i28 < iZzt2) {
                    zzgmd.zza(zzegVar.zzd() >= 12 ? i21 : i22);
                    int iZzt3 = zzegVar.zzt();
                    int iZzt4 = zzegVar.zzt();
                    zzegVar.zzk(i23);
                    int i29 = iZzt2;
                    int iZzs = zzegVar.zzs();
                    zzegVar.zzk(i21);
                    int iZzB3 = zzegVar.zzB();
                    if (iZzt4 > spannableStringBuilder2.length()) {
                        int length2 = spannableStringBuilder2.length();
                        i15 = i25;
                        i16 = i27;
                        spannableStringBuilder = spannableStringBuilder2;
                        StringBuilder sb2 = new StringBuilder(o2.C(String.valueOf(iZzt4).length() + 44, 2, String.valueOf(length2)));
                        sb2.append("Truncating styl end (");
                        sb2.append(iZzt4);
                        sb2.append(") to cueText.length() (");
                        sb2.append(length2);
                        sb2.append(").");
                        zzdt.zzc("Tx3gParser", sb2.toString());
                        iZzt4 = spannableStringBuilder.length();
                    } else {
                        i15 = i25;
                        i16 = i27;
                        spannableStringBuilder = spannableStringBuilder2;
                    }
                    if (iZzt3 >= iZzt4) {
                        StringBuilder sb3 = new StringBuilder(o2.C(String.valueOf(iZzt3).length() + 36, 2, String.valueOf(iZzt4)));
                        sb3.append("Ignoring styl with start (");
                        sb3.append(iZzt3);
                        sb3.append(") >= end (");
                        sb3.append(iZzt4);
                        sb3.append(").");
                        zzdt.zzc("Tx3gParser", sb3.toString());
                        i19 = i15;
                        i18 = i28;
                        i17 = i29;
                        spannableStringBuilder2 = spannableStringBuilder;
                        i20 = i16;
                    } else {
                        i17 = i29;
                        i18 = i28;
                        spannableStringBuilder2 = spannableStringBuilder;
                        int i30 = i15;
                        zzb(spannableStringBuilder2, iZzs, i30, iZzt3, iZzt4, 0);
                        i19 = i30;
                        i20 = i16;
                        zzc(spannableStringBuilder2, iZzB3, i20, iZzt3, iZzt4, 0);
                    }
                    iZzt2 = i17;
                    i25 = i19;
                    i27 = i20;
                    i21 = 1;
                    i23 = 2;
                    i28 = i18 + 1;
                    i22 = 0;
                }
                i12 = i25;
                i13 = i27;
                i14 = i23;
            } else {
                i12 = i25;
                i13 = i27;
                if (iZzB2 == 1952608120 && this.zzb) {
                    i14 = 2;
                    zzgmd.zza(zzegVar.zzd() >= 2);
                    float fZzt = zzegVar.zzt();
                    int i31 = this.zzg;
                    String str2 = zzep.zza;
                    fMax = Math.max(0.0f, Math.min(fZzt / i31, 0.95f));
                } else {
                    i14 = 2;
                }
            }
            zzegVar.zzh(iZzg3 + iZzB);
            i25 = i12;
            i23 = i14;
            i27 = i13;
            i21 = 1;
            i22 = 0;
        }
        zzcl zzclVar = new zzcl();
        zzclVar.zza(spannableStringBuilder2);
        zzclVar.zzf(fMax, 0);
        zzclVar.zzg(0);
        zzdgVar.zza(new zzaka(zzgpe.zzj(zzclVar.zzr()), C.TIME_UNSET, C.TIME_UNSET));
    }
}
