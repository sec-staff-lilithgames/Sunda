package com.google.android.gms.measurement.internal;

import a.b;
import android.os.Bundle;
import com.applovin.shadow.okhttp3.HttpUrl;
import com.google.android.gms.common.internal.Preconditions;
import com.ironsource.C3191e4;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzgn {
    protected static final AtomicReference zza = new AtomicReference();
    protected static final AtomicReference zzb = new AtomicReference();
    protected static final AtomicReference zzc = new AtomicReference();
    private final zzgm zzd;

    public zzgn(zzgm zzgmVar) {
        this.zzd = zzgmVar;
    }

    private static final String zzg(String str, String[] strArr, String[] strArr2, AtomicReference atomicReference) {
        String str2;
        Preconditions.checkNotNull(strArr);
        Preconditions.checkNotNull(strArr2);
        Preconditions.checkNotNull(atomicReference);
        Preconditions.checkArgument(strArr.length == strArr2.length);
        for (int i10 = 0; i10 < strArr.length; i10++) {
            if (Objects.equals(str, strArr[i10])) {
                synchronized (atomicReference) {
                    try {
                        String[] strArr3 = (String[]) atomicReference.get();
                        if (strArr3 == null) {
                            strArr3 = new String[strArr2.length];
                            atomicReference.set(strArr3);
                        }
                        str2 = strArr3[i10];
                        if (str2 == null) {
                            str2 = strArr2[i10] + "(" + strArr[i10] + ")";
                            strArr3[i10] = str2;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return str2;
            }
        }
        return str;
    }

    public final String zza(String str) {
        if (str == null) {
            return null;
        }
        return !this.zzd.zza() ? str : zzg(str, zzjm.zzc, zzjm.zza, zza);
    }

    public final String zzb(String str) {
        if (str == null) {
            return null;
        }
        return !this.zzd.zza() ? str : zzg(str, zzjn.zzb, zzjn.zza, zzb);
    }

    public final String zzc(String str) {
        if (str == null) {
            return null;
        }
        return !this.zzd.zza() ? str : str.startsWith("_exp_") ? b.l("experiment_id(", str, ")") : zzg(str, zzjo.zzb, zzjo.zza, zzc);
    }

    public final String zzd(zzbg zzbgVar) {
        zzgm zzgmVar = this.zzd;
        if (!zzgmVar.zza()) {
            return zzbgVar.toString();
        }
        StringBuilder sb2 = new StringBuilder("origin=");
        sb2.append(zzbgVar.zzc);
        sb2.append(",name=");
        sb2.append(zza(zzbgVar.zza));
        sb2.append(",params=");
        zzbe zzbeVar = zzbgVar.zzb;
        sb2.append(zzbeVar == null ? null : !zzgmVar.zza() ? zzbeVar.toString() : zze(zzbeVar.zzf()));
        return sb2.toString();
    }

    public final String zze(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        if (!this.zzd.zza()) {
            return bundle.toString();
        }
        StringBuilder sbU = o2.u("Bundle[{");
        for (String str : bundle.keySet()) {
            if (sbU.length() != 8) {
                sbU.append(", ");
            }
            sbU.append(zzb(str));
            sbU.append(C3191e4.i.f36525b);
            Object obj = bundle.get(str);
            sbU.append(obj instanceof Bundle ? zzf(new Object[]{obj}) : obj instanceof Object[] ? zzf((Object[]) obj) : obj instanceof ArrayList ? zzf(((ArrayList) obj).toArray()) : String.valueOf(obj));
        }
        sbU.append("}]");
        return sbU.toString();
    }

    public final String zzf(Object[] objArr) {
        if (objArr == null) {
            return HttpUrl.PATH_SEGMENT_ENCODE_SET_URI;
        }
        StringBuilder sbU = o2.u(C3191e4.i.f36529d);
        for (Object obj : objArr) {
            String strZze = obj instanceof Bundle ? zze((Bundle) obj) : String.valueOf(obj);
            if (strZze != null) {
                if (sbU.length() != 1) {
                    sbU.append(", ");
                }
                sbU.append(strZze);
            }
        }
        sbU.append(C3191e4.i.f36531e);
        return sbU.toString();
    }
}
