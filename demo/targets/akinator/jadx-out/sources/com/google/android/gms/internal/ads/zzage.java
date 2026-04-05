package com.google.android.gms.internal.ads;

import com.fyber.inneractive.sdk.external.NativeAdContent;
import com.ironsource.C3191e4;
import com.ironsource.mediationsdk.logger.IronSourceError;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@Deprecated
/* loaded from: classes6.dex */
public class zzage implements zzao {
    public final String zza;
    public final String zzb;

    public zzage(String str, String str2) {
        this.zza = zzglm.zzb(str);
        this.zzb = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzage zzageVar = (zzage) obj;
            if (this.zza.equals(zzageVar.zza) && this.zzb.equals(zzageVar.zzb)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.zza.hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE;
        return this.zzb.hashCode() + (iHashCode * 31);
    }

    public final String toString() {
        String str = this.zza;
        int length = String.valueOf(str).length();
        String str2 = this.zzb;
        return o2.r(new StringBuilder(length + 5 + String.valueOf(str2).length()), "VC: ", str, C3191e4.i.f36525b, str2);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.android.gms.internal.ads.zzao
    public final void zza(zzam zzamVar) {
        Integer numZzh;
        Integer numZzh2;
        Integer numZzh3;
        Integer numZzh4;
        String str = this.zza;
        switch (str.hashCode()) {
            case -1935137620:
                if (str.equals("TOTALTRACKS") && (numZzh = zzgst.zzh(this.zzb, 10)) != null) {
                    zzamVar.zzh(numZzh);
                    break;
                }
                break;
            case -215998278:
                if (str.equals("TOTALDISCS") && (numZzh2 = zzgst.zzh(this.zzb, 10)) != null) {
                    zzamVar.zzs(numZzh2);
                    break;
                }
                break;
            case -113312716:
                if (str.equals("TRACKNUMBER") && (numZzh3 = zzgst.zzh(this.zzb, 10)) != null) {
                    zzamVar.zzg(numZzh3);
                    break;
                }
                break;
            case 62359119:
                if (str.equals("ALBUM")) {
                    zzamVar.zzc(this.zzb);
                    break;
                }
                break;
            case 67703139:
                if (str.equals("GENRE")) {
                    zzamVar.zzt(this.zzb);
                    break;
                }
                break;
            case 79833656:
                if (str.equals(NativeAdContent.ViewTag.AD_TITLE)) {
                    zzamVar.zza(this.zzb);
                    break;
                }
                break;
            case 428414940:
                if (str.equals(NativeAdContent.ViewTag.AD_DESCRIPTION)) {
                    zzamVar.zze(this.zzb);
                    break;
                }
                break;
            case 993300766:
                if (str.equals("DISCNUMBER") && (numZzh4 = zzgst.zzh(this.zzb, 10)) != null) {
                    zzamVar.zzr(numZzh4);
                    break;
                }
                break;
            case 1746739798:
                if (str.equals("ALBUMARTIST")) {
                    zzamVar.zzd(this.zzb);
                    break;
                }
                break;
            case 1939198791:
                if (str.equals("ARTIST")) {
                    zzamVar.zzb(this.zzb);
                    break;
                }
                break;
        }
    }
}
