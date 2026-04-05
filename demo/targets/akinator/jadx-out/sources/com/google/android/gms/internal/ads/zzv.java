package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import b0.e2;
import com.applovin.shadow.okio.Segment;
import com.google.android.gms.ads.AdError;
import com.ironsource.C3191e4;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.moloco.sdk.internal.configs.Gzp.wHkgq;
import com.unity3d.ads.BuildConfig;
import com.unity3d.ads.core.data.model.exception.GatewayException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.UUID;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzv {
    public static final /* synthetic */ int zzO = 0;
    public final int zzA;
    public final float zzB;
    public final byte[] zzC;
    public final int zzD;
    public final zzi zzE;
    public final int zzF;
    public final int zzG;
    public final int zzH;
    public final int zzI;
    public final int zzJ;
    public final int zzK;
    public final int zzL;
    public final int zzM;
    public final int zzN;
    private int zzP;
    public final String zza;
    public final String zzb;
    public final List zzc;
    public final String zzd;
    public final int zze;
    public final int zzf;
    public final int zzg;
    public final int zzh;
    public final int zzi;
    public final int zzj;
    public final String zzk;
    public final zzap zzl;
    public final Object zzm;
    public final String zzn;
    public final String zzo;
    public final int zzp;
    public final int zzq;
    public final List zzr;
    public final zzq zzs;
    public final long zzt;
    public final boolean zzu;
    public final int zzv;
    public final int zzw;
    public final int zzx;
    public final int zzy;
    public final float zzz;

    static {
        new zzv(new zzt());
        String str = zzep.zza;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
        Integer.toString(5, 36);
        Integer.toString(6, 36);
        Integer.toString(7, 36);
        Integer.toString(8, 36);
        Integer.toString(9, 36);
        Integer.toString(10, 36);
        Integer.toString(11, 36);
        Integer.toString(12, 36);
        Integer.toString(13, 36);
        Integer.toString(14, 36);
        Integer.toString(15, 36);
        Integer.toString(16, 36);
        Integer.toString(17, 36);
        Integer.toString(18, 36);
        Integer.toString(19, 36);
        Integer.toString(20, 36);
        Integer.toString(21, 36);
        Integer.toString(22, 36);
        Integer.toString(23, 36);
        Integer.toString(24, 36);
        Integer.toString(25, 36);
        Integer.toString(26, 36);
        Integer.toString(27, 36);
        Integer.toString(28, 36);
        Integer.toString(29, 36);
        Integer.toString(30, 36);
        Integer.toString(31, 36);
        Integer.toString(32, 36);
        Integer.toString(33, 36);
        Integer.toString(34, 36);
        Integer.toString(35, 36);
        Integer.toString(36, 36);
    }

    public /* synthetic */ zzv(zzt zztVar, byte[] bArr) {
        this(zztVar);
    }

    public final boolean equals(Object obj) {
        int i10;
        if (this == obj) {
            return true;
        }
        if (obj != null && zzv.class == obj.getClass()) {
            zzv zzvVar = (zzv) obj;
            int i11 = this.zzP;
            if ((i11 == 0 || (i10 = zzvVar.zzP) == 0 || i11 == i10) && this.zze == zzvVar.zze && this.zzf == zzvVar.zzf && this.zzg == zzvVar.zzg && this.zzh == zzvVar.zzh && this.zzi == zzvVar.zzi && this.zzp == zzvVar.zzp && this.zzt == zzvVar.zzt && this.zzv == zzvVar.zzv && this.zzw == zzvVar.zzw && this.zzx == zzvVar.zzx && this.zzy == zzvVar.zzy && this.zzA == zzvVar.zzA && this.zzD == zzvVar.zzD && this.zzF == zzvVar.zzF && this.zzG == zzvVar.zzG && this.zzH == zzvVar.zzH && this.zzI == zzvVar.zzI && this.zzJ == zzvVar.zzJ && this.zzK == zzvVar.zzK && this.zzL == zzvVar.zzL && this.zzN == zzvVar.zzN && Float.compare(this.zzz, zzvVar.zzz) == 0 && Float.compare(this.zzB, zzvVar.zzB) == 0 && Objects.equals(this.zza, zzvVar.zza) && Objects.equals(this.zzb, zzvVar.zzb) && this.zzc.equals(zzvVar.zzc) && Objects.equals(this.zzk, zzvVar.zzk) && Objects.equals(this.zzn, zzvVar.zzn) && Objects.equals(this.zzo, zzvVar.zzo) && Objects.equals(this.zzd, zzvVar.zzd) && Arrays.equals(this.zzC, zzvVar.zzC) && Objects.equals(this.zzl, zzvVar.zzl) && Objects.equals(this.zzE, zzvVar.zzE) && Objects.equals(this.zzs, zzvVar.zzs) && zzd(zzvVar)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = this.zzP;
        if (i10 != 0) {
            return i10;
        }
        String str = this.zza;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.zzb;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        int iHashCode3 = this.zzc.hashCode() + o2.B(iHashCode + IronSourceError.ERROR_NON_EXISTENT_INSTANCE, 31, iHashCode2, 31);
        String str3 = this.zzd;
        int iB = (((((((((o2.B(iHashCode3, 31, str3 == null ? 0 : str3.hashCode(), 31) + this.zze) * 31) + this.zzf) * 31) + this.zzg) * 31) + this.zzh) * 31) + this.zzi) * 31;
        String str4 = this.zzk;
        int iHashCode4 = (iB + (str4 == null ? 0 : str4.hashCode())) * 31;
        zzap zzapVar = this.zzl;
        int iHashCode5 = iHashCode4 + (zzapVar == null ? 0 : zzapVar.hashCode());
        String str5 = this.zzn;
        int iB2 = o2.B(iHashCode5, 961, str5 == null ? 0 : str5.hashCode(), 31);
        int iFloatToIntBits = ((((((((((((((((((((((Float.floatToIntBits(this.zzB) + ((((Float.floatToIntBits(this.zzz) + ((((((((((((((iB2 + (this.zzo != null ? r2.hashCode() : 0)) * 31) + this.zzp) * 31) + ((int) this.zzt)) * 31) + this.zzv) * 31) + this.zzw) * 31) + this.zzx) * 31) + this.zzy) * 31)) * 31) + this.zzA) * 31)) * 31) + this.zzD) * 31) + this.zzF) * 31) + this.zzG) * 31) + this.zzH) * 31) + this.zzI) * 31) + this.zzJ) * 31) + this.zzK) * 31) + this.zzL) * 31) - 1) * 31) - 1) * 31) + this.zzN;
        this.zzP = iFloatToIntBits;
        return iFloatToIntBits;
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.zzE);
        String str = this.zza;
        int length = String.valueOf(str).length();
        String str2 = this.zzb;
        int length2 = String.valueOf(str2).length();
        String str3 = this.zzn;
        int length3 = String.valueOf(str3).length();
        String str4 = this.zzo;
        int length4 = String.valueOf(str4).length();
        String str5 = this.zzk;
        int length5 = String.valueOf(str5).length();
        int i10 = this.zzj;
        int length6 = String.valueOf(i10).length();
        String str6 = this.zzd;
        int length7 = String.valueOf(str6).length();
        int i11 = this.zzv;
        int length8 = String.valueOf(i11).length();
        int i12 = this.zzw;
        int length9 = String.valueOf(i12).length();
        float f10 = this.zzz;
        int length10 = String.valueOf(f10).length();
        int length11 = strValueOf.length();
        int i13 = this.zzG;
        int length12 = String.valueOf(i13).length();
        int i14 = this.zzH;
        StringBuilder sb2 = new StringBuilder(length + 9 + length2 + 2 + length3 + 2 + length4 + 2 + length5 + 2 + length6 + 2 + length7 + 3 + length8 + 2 + length9 + 2 + length10 + 2 + length11 + 4 + length12 + 2 + String.valueOf(i14).length() + 2);
        com.google.android.gms.internal.play_billing.a.B(sb2, "Format(", str, ", ", str2);
        com.google.android.gms.internal.play_billing.a.B(sb2, ", ", str3, ", ", str4);
        sb2.append(", ");
        sb2.append(str5);
        sb2.append(", ");
        sb2.append(i10);
        sb2.append(", ");
        sb2.append(str6);
        sb2.append(", [");
        sb2.append(i11);
        sb2.append(", ");
        sb2.append(i12);
        sb2.append(", ");
        sb2.append(f10);
        sb2.append(", ");
        sb2.append(strValueOf);
        sb2.append("], [");
        sb2.append(i13);
        return e2.n(sb2, ", ", i14, "])");
    }

    public final zzt zza() {
        return new zzt(this, null);
    }

    public final zzv zzb(int i10) {
        zzt zztVar = new zzt(this, null);
        zztVar.zzL(i10);
        return new zzv(zztVar);
    }

    public final int zzc() {
        int i10;
        int i11 = this.zzv;
        if (i11 == -1 || (i10 = this.zzw) == -1) {
            return -1;
        }
        return i11 * i10;
    }

    public final boolean zzd(zzv zzvVar) {
        List list = this.zzr;
        int size = list.size();
        List list2 = zzvVar.zzr;
        if (size != list2.size()) {
            return false;
        }
        for (int i10 = 0; i10 < list.size(); i10++) {
            if (!Arrays.equals((byte[]) list.get(i10), (byte[]) list2.get(i10))) {
                return false;
            }
        }
        return true;
    }

    private zzv(zzt zztVar) {
        boolean z10;
        String str;
        this.zza = zztVar.zzN();
        String strZzh = zzep.zzh(zztVar.zzQ());
        this.zzd = strZzh;
        if (zztVar.zzP().isEmpty() && zztVar.zzO() != null) {
            this.zzc = zzgpe.zzj(new zzx(strZzh, zztVar.zzO()));
            this.zzb = zztVar.zzO();
        } else if (!zztVar.zzP().isEmpty() && zztVar.zzO() == null) {
            this.zzc = zztVar.zzP();
            List listZzP = zztVar.zzP();
            Iterator it = listZzP.iterator();
            while (true) {
                if (!it.hasNext()) {
                    str = ((zzx) listZzP.get(0)).zzb;
                    break;
                }
                zzx zzxVar = (zzx) it.next();
                if (TextUtils.equals(zzxVar.zza, strZzh)) {
                    str = zzxVar.zzb;
                    break;
                }
            }
            this.zzb = str;
        } else if (zztVar.zzP().isEmpty() && zztVar.zzO() == null) {
            z10 = true;
            zzgmd.zzh(z10);
            this.zzc = zztVar.zzP();
            this.zzb = zztVar.zzO();
        } else {
            for (int i10 = 0; i10 < zztVar.zzP().size(); i10++) {
                if (((zzx) zztVar.zzP().get(i10)).zzb.equals(zztVar.zzO())) {
                    z10 = true;
                    break;
                }
            }
            z10 = false;
            zzgmd.zzh(z10);
            this.zzc = zztVar.zzP();
            this.zzb = zztVar.zzO();
        }
        this.zze = zztVar.zzR();
        zzgmd.zzi(zztVar.zzT() == 0 || (zztVar.zzS() & 32768) != 0, "Auxiliary track type must only be set to a value other than AUXILIARY_TRACK_TYPE_UNDEFINED only when ROLE_FLAG_AUXILIARY is set");
        this.zzf = zztVar.zzS();
        this.zzg = zztVar.zzT();
        int iZzU = zztVar.zzU();
        this.zzh = iZzU;
        int iZzV = zztVar.zzV();
        this.zzi = iZzV;
        this.zzj = iZzV != -1 ? iZzV : iZzU;
        this.zzk = zztVar.zzW();
        this.zzl = zztVar.zzX();
        this.zzm = null;
        this.zzn = zztVar.zzY();
        this.zzo = zztVar.zzZ();
        this.zzp = zztVar.zzaa();
        this.zzq = zztVar.zzab();
        this.zzr = zztVar.zzac() == null ? Collections.EMPTY_LIST : zztVar.zzac();
        zzq zzqVarZzad = zztVar.zzad();
        this.zzs = zzqVarZzad;
        this.zzt = zztVar.zzae();
        this.zzu = zztVar.zzaf();
        this.zzv = zztVar.zzag();
        this.zzw = zztVar.zzah();
        this.zzx = zztVar.zzai();
        this.zzy = zztVar.zzaj();
        this.zzz = zztVar.zzak();
        this.zzA = zztVar.zzal() == -1 ? 0 : zztVar.zzal();
        this.zzB = zztVar.zzam() == -1.0f ? 1.0f : zztVar.zzam();
        this.zzC = zztVar.zzan();
        this.zzD = zztVar.zzao();
        this.zzE = zztVar.zzap();
        this.zzF = zztVar.zzaq();
        this.zzG = zztVar.zzar();
        this.zzH = zztVar.zzas();
        this.zzI = zztVar.zzat();
        this.zzJ = zztVar.zzau() == -1 ? 0 : zztVar.zzau();
        this.zzK = zztVar.zzav() != -1 ? zztVar.zzav() : 0;
        this.zzL = zztVar.zzaw();
        this.zzM = zztVar.zzax();
        if (zztVar.zzay() != 0 || zzqVarZzad == null) {
            this.zzN = zztVar.zzay();
        } else {
            this.zzN = 1;
        }
    }

    public static String zze(zzv zzvVar) {
        String str;
        int i10;
        int i11;
        StringBuilder sbU = o2.u("id=");
        sbU.append(zzvVar.zza);
        sbU.append(", mimeType=");
        sbU.append(zzvVar.zzo);
        String str2 = zzvVar.zzn;
        if (str2 != null) {
            sbU.append(", container=");
            sbU.append(str2);
        }
        int i12 = zzvVar.zzj;
        if (i12 != -1) {
            sbU.append(", bitrate=");
            sbU.append(i12);
        }
        String str3 = zzvVar.zzk;
        if (str3 != null) {
            sbU.append(", codecs=");
            sbU.append(str3);
        }
        zzq zzqVar = zzvVar.zzs;
        if (zzqVar != null) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            for (int i13 = 0; i13 < zzqVar.zzb; i13++) {
                UUID uuid = zzqVar.zza(i13).zza;
                if (uuid.equals(zzg.zzb)) {
                    linkedHashSet.add(C.CENC_TYPE_cenc);
                } else if (uuid.equals(zzg.zzc)) {
                    linkedHashSet.add("clearkey");
                } else if (uuid.equals(zzg.zze)) {
                    linkedHashSet.add("playready");
                } else if (uuid.equals(zzg.zzd)) {
                    linkedHashSet.add("widevine");
                } else if (uuid.equals(zzg.zza)) {
                    linkedHashSet.add(GatewayException.GATEWAY_RESPONSE_DEPTH_UNIVERSAL);
                } else {
                    String string = uuid.toString();
                    StringBuilder sb2 = new StringBuilder(string.length() + 10);
                    sb2.append("unknown (");
                    sb2.append(string);
                    sb2.append(")");
                    linkedHashSet.add(sb2.toString());
                }
            }
            sbU.append(", drm=[");
            zzglx.zzb(sbU, linkedHashSet, ",");
            sbU.append(AbstractJsonLexerKt.END_LIST);
        }
        int i14 = zzvVar.zzv;
        if (i14 != -1 && (i11 = zzvVar.zzw) != -1) {
            com.bytedance.sdk.component.adexpress.dynamic.dynamicview.a.o(i14, i11, ", res=", "x", sbU);
        }
        int i15 = zzvVar.zzx;
        if (i15 != -1 && (i10 = zzvVar.zzy) != -1) {
            com.bytedance.sdk.component.adexpress.dynamic.dynamicview.a.o(i15, i10, ", decRes=", "x", sbU);
        }
        float f10 = zzvVar.zzB;
        int i16 = zzgsj.zza;
        double d10 = f10;
        if (Math.copySign((-1.0d) + d10, 1.0d) > 0.001d && d10 != 1.0d && (!Double.isNaN(d10) || !Double.isNaN(1.0d))) {
            sbU.append(", par=");
            Object[] objArr = {Float.valueOf(f10)};
            String str4 = zzep.zza;
            sbU.append(String.format(Locale.US, "%.3f", objArr));
        }
        zzi zziVar = zzvVar.zzE;
        if (zziVar != null && (zziVar.zze() || zziVar.zzf())) {
            sbU.append(", color=");
            sbU.append(zziVar.zzg());
        }
        float f11 = zzvVar.zzz;
        if (f11 != -1.0f) {
            sbU.append(", fps=");
            sbU.append(f11);
        }
        int i17 = zzvVar.zzF;
        if (i17 != -1) {
            sbU.append(", maxSubLayers=");
            sbU.append(i17);
        }
        int i18 = zzvVar.zzG;
        if (i18 != -1) {
            sbU.append(", channels=");
            sbU.append(i18);
        }
        int i19 = zzvVar.zzH;
        if (i19 != -1) {
            sbU.append(", sample_rate=");
            sbU.append(i19);
        }
        String str5 = zzvVar.zzd;
        if (str5 != null) {
            sbU.append(", language=");
            sbU.append(str5);
        }
        List list = zzvVar.zzc;
        if (!list.isEmpty()) {
            sbU.append(", labels=[");
            zzglx.zzb(sbU, zzgqe.zzc(list, zzu.zza), ",");
            sbU.append(C3191e4.i.f36531e);
        }
        int i20 = zzvVar.zze;
        if (i20 != 0) {
            sbU.append(", selectionFlags=[");
            String str6 = zzep.zza;
            ArrayList arrayList = new ArrayList();
            if ((i20 & 1) != 0) {
                arrayList.add(BuildConfig.FLAVOR);
            }
            if ((i20 & 2) != 0) {
                arrayList.add("forced");
            }
            zzglx.zzb(sbU, arrayList, ",");
            sbU.append(C3191e4.i.f36531e);
        }
        int i21 = zzvVar.zzf;
        if (i21 != 0) {
            sbU.append(", roleFlags=[");
            int i22 = i21 & 32768;
            String str7 = zzep.zza;
            ArrayList arrayList2 = new ArrayList();
            if ((i21 & 1) != 0) {
                arrayList2.add(C3191e4.h.Z);
            }
            if ((i21 & 2) != 0) {
                arrayList2.add("alt");
            }
            if ((i21 & 4) != 0) {
                arrayList2.add("supplementary");
            }
            if ((i21 & 8) != 0) {
                arrayList2.add("commentary");
            }
            if ((i21 & 16) != 0) {
                arrayList2.add("dub");
            }
            if ((i21 & 32) != 0) {
                arrayList2.add("emergency");
            }
            if ((i21 & 64) != 0) {
                arrayList2.add(wHkgq.MNFE);
            }
            if ((i21 & 128) != 0) {
                arrayList2.add("subtitle");
            }
            if ((i21 & NotificationCompat.FLAG_LOCAL_ONLY) != 0) {
                arrayList2.add("sign");
            }
            if ((i21 & 512) != 0) {
                arrayList2.add("describes-video");
            }
            if ((i21 & 1024) != 0) {
                arrayList2.add("describes-music");
            }
            if ((i21 & 2048) != 0) {
                arrayList2.add("enhanced-intelligibility");
            }
            if ((i21 & 4096) != 0) {
                arrayList2.add("transcribes-dialog");
            }
            if ((i21 & Segment.SIZE) != 0) {
                arrayList2.add("easy-read");
            }
            if ((i21 & 16384) != 0) {
                arrayList2.add("trick-play");
            }
            if (i22 != 0) {
                arrayList2.add("auxiliary");
            }
            zzglx.zzb(sbU, arrayList2, ",");
            sbU.append(C3191e4.i.f36531e);
        }
        if ((i21 & 32768) != 0) {
            sbU.append(", auxiliaryTrackType=");
            int i23 = zzvVar.zzg;
            String str8 = zzep.zza;
            if (i23 == 0) {
                str = AdError.UNDEFINED_DOMAIN;
            } else if (i23 == 1) {
                str = "original";
            } else if (i23 == 2) {
                str = "depth-linear";
            } else if (i23 == 3) {
                str = "depth-inverse";
            } else {
                if (i23 != 4) {
                    throw new IllegalStateException("Unsupported auxiliary track type");
                }
                str = "depth metadata";
            }
            sbU.append(str);
        }
        return sbU.toString();
    }
}
