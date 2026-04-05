package com.google.android.gms.internal.gtm;

import com.amazon.aps.shared.util.APSSharedUtil;
import com.google.android.gms.common.internal.Preconditions;
import com.ironsource.G5;
import java.util.Map;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzeo extends zzbr {
    private static zzeo zza;

    public zzeo(zzbu zzbuVar) {
        super(zzbuVar);
    }

    public static zzeo zza() {
        return zza;
    }

    public static final String zzf(Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof Integer) {
            obj = Long.valueOf(((Integer) obj).intValue());
        }
        if (!(obj instanceof Long)) {
            return obj instanceof Boolean ? obj.toString() : obj instanceof Throwable ? obj.getClass().getCanonicalName() : "-";
        }
        Long l9 = (Long) obj;
        if (Math.abs(l9.longValue()) < 100) {
            return obj.toString();
        }
        char cCharAt = obj.toString().charAt(0);
        String strValueOf = String.valueOf(Math.abs(l9.longValue()));
        StringBuilder sb2 = new StringBuilder();
        String str = cCharAt != '-' ? "" : "-";
        sb2.append(str);
        sb2.append(Math.round(Math.pow(10.0d, strValueOf.length() - 1)));
        sb2.append(APSSharedUtil.TRUNCATE_SEPARATOR);
        sb2.append(str);
        sb2.append(Math.round(Math.pow(10.0d, strValueOf.length()) - 1.0d));
        return sb2.toString();
    }

    public final void zzb(zzek zzekVar, String str) {
        zzR("Discarding hit. ".concat(str), zzekVar != null ? zzekVar.toString() : "no hit data");
    }

    public final void zzc(Map map, String str) {
        StringBuilder sb2 = new StringBuilder();
        for (Map.Entry entry : map.entrySet()) {
            if (sb2.length() > 0) {
                sb2.append(AbstractJsonLexerKt.COMMA);
            }
            sb2.append((String) entry.getKey());
            sb2.append(G5.T);
            sb2.append((String) entry.getValue());
        }
        zzR("Discarding hit. ".concat(str), sb2.toString());
    }

    @Override // com.google.android.gms.internal.gtm.zzbr
    public final void zzd() {
        synchronized (zzeo.class) {
            zza = this;
        }
    }

    public final synchronized void zze(int i10, String str, Object obj, Object obj2, Object obj3) {
        char c10;
        try {
            Preconditions.checkNotNull(str);
            if (zzw().zzb()) {
                zzw();
                c10 = 'C';
            } else {
                zzw();
                c10 = 'c';
            }
            String strSubstring = "3" + "01VDIWEA?".charAt(i10) + c10 + zzbs.zza + ":" + zzbq.zzD(str, zzf(obj), zzf(obj2), zzf(obj3));
            if (strSubstring.length() > 1024) {
                strSubstring = strSubstring.substring(0, 1024);
            }
            zzeu zzeuVarZzp = zzt().zzp();
            if (zzeuVarZzp != null) {
                zzeuVarZzp.zze().zzc(strSubstring);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
