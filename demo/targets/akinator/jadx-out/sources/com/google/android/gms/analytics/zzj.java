package com.google.android.gms.analytics;

import android.text.TextUtils;
import com.ironsource.C3191e4;
import com.ironsource.G5;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public abstract class zzj {
    public static String zza(Object obj) {
        return zzd(obj, 0);
    }

    public static String zzb(Map map) {
        return zzd(map, 1);
    }

    private static String zzd(Object obj, int i10) {
        if (i10 > 10) {
            return "ERROR: Recursive toString calls";
        }
        if (obj == null) {
            return "";
        }
        if (obj instanceof String) {
            return !TextUtils.isEmpty((String) obj) ? obj.toString() : "";
        }
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue() != 0 ? obj.toString() : "";
        }
        if (obj instanceof Long) {
            return ((Long) obj).longValue() != 0 ? obj.toString() : "";
        }
        if (obj instanceof Double) {
            return ((Double) obj).doubleValue() != 0.0d ? obj.toString() : "";
        }
        if (obj instanceof Boolean) {
            return ((Boolean) obj).booleanValue() ? obj.toString() : "";
        }
        if (obj instanceof List) {
            StringBuilder sb2 = new StringBuilder();
            if (i10 > 0) {
                sb2.append(C3191e4.i.f36529d);
            }
            int length = sb2.length();
            for (Object obj2 : (List) obj) {
                if (sb2.length() > length) {
                    sb2.append(", ");
                }
                sb2.append(zzd(obj2, i10 + 1));
            }
            if (i10 > 0) {
                sb2.append(C3191e4.i.f36531e);
            }
            return sb2.toString();
        }
        if (!(obj instanceof Map)) {
            return obj.toString();
        }
        StringBuilder sb3 = new StringBuilder();
        boolean z10 = false;
        int length2 = 0;
        for (Map.Entry entry : new TreeMap((Map) obj).entrySet()) {
            String strZzd = zzd(entry.getValue(), i10 + 1);
            if (!TextUtils.isEmpty(strZzd)) {
                if (i10 > 0 && !z10) {
                    sb3.append("{");
                    length2 = sb3.length();
                    z10 = true;
                }
                if (sb3.length() > length2) {
                    sb3.append(", ");
                }
                sb3.append((String) entry.getKey());
                sb3.append(G5.T);
                sb3.append(strZzd);
            }
        }
        if (z10) {
            sb3.append("}");
        }
        return sb3.toString();
    }

    public abstract void zzc(zzj zzjVar);
}
