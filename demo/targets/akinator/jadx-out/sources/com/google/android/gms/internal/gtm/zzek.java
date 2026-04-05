package com.google.android.gms.internal.gtm;

import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.applovin.shadow.okio.Segment;
import com.google.android.gms.common.internal.Preconditions;
import com.ironsource.C3191e4;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import w0.i;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzek {
    private final Map zza;
    private final List zzb;
    private final long zzc;
    private final long zzd;
    private final int zze;
    private final boolean zzf;
    private final String zzg;

    public zzek(zzbq zzbqVar, Map map, long j10, boolean z10) {
        this(zzbqVar, map, j10, z10, 0L, 0, null);
    }

    public static zzek zze(zzbq zzbqVar, zzek zzekVar, Map map) {
        return new zzek(zzbqVar, map, zzekVar.zzd, zzekVar.zzf, zzekVar.zzc, zzekVar.zze, zzekVar.zzb);
    }

    private final String zzi(String str, String str2) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkArgument(!str.startsWith(C3191e4.i.f36527c), "Short param name required");
        String str3 = (String) this.zza.get(str);
        return str3 != null ? str3 : str2;
    }

    private static String zzj(zzbq zzbqVar, Object obj) {
        if (obj == null) {
            return null;
        }
        String string = obj.toString();
        if (string.startsWith(C3191e4.i.f36527c)) {
            string = string.substring(1);
        }
        int length = string.length();
        if (length > 256) {
            string = string.substring(0, NotificationCompat.FLAG_LOCAL_ONLY);
            zzbqVar.zzS("Hit param name is too long and will be trimmed", Integer.valueOf(length), string);
        }
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        return string;
    }

    private static String zzk(zzbq zzbqVar, Object obj) {
        String string = obj == null ? "" : obj.toString();
        int length = string.length();
        if (length <= 8192) {
            return string;
        }
        String strSubstring = string.substring(0, Segment.SIZE);
        zzbqVar.zzS("Hit param value is too long and will be trimmed", Integer.valueOf(length), strSubstring);
        return strSubstring;
    }

    private static boolean zzl(Object obj) {
        if (obj == null) {
            return false;
        }
        return obj.toString().startsWith(C3191e4.i.f36527c);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ht=");
        sb2.append(this.zzd);
        if (this.zzc != 0) {
            sb2.append(", dbId=");
            sb2.append(this.zzc);
        }
        if (this.zze != 0) {
            sb2.append(", appUID=");
            sb2.append(this.zze);
        }
        ArrayList arrayList = new ArrayList(this.zza.keySet());
        Collections.sort(arrayList);
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            String str = (String) arrayList.get(i10);
            i.h(sb2, ", ", str, C3191e4.i.f36525b);
            sb2.append((String) this.zza.get(str));
        }
        return sb2.toString();
    }

    public final int zza() {
        return this.zze;
    }

    public final long zzb() {
        return this.zzc;
    }

    public final long zzc() {
        return zzff.zza(zzi("_s", "0"));
    }

    public final long zzd() {
        return this.zzd;
    }

    public final String zzf() {
        return zzi("_m", "");
    }

    public final Map zzg() {
        return this.zza;
    }

    public final boolean zzh() {
        return this.zzf;
    }

    public zzek(zzbq zzbqVar, Map map, long j10, boolean z10, long j11, int i10, List list) {
        String strZzb;
        String strZzj;
        String strZzj2;
        Preconditions.checkNotNull(zzbqVar);
        Preconditions.checkNotNull(map);
        this.zzd = j10;
        this.zzf = z10;
        this.zzc = j11;
        this.zze = i10;
        this.zzb = list != null ? list : Collections.EMPTY_LIST;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                zzco zzcoVar = (zzco) it.next();
                if ("appendVersion".equals(zzcoVar.zza())) {
                    strZzb = zzcoVar.zzb();
                    break;
                }
            }
            strZzb = null;
        } else {
            strZzb = null;
        }
        this.zzg = true != TextUtils.isEmpty(strZzb) ? strZzb : null;
        HashMap map2 = new HashMap();
        for (Map.Entry entry : map.entrySet()) {
            if (zzl(entry.getKey()) && (strZzj2 = zzj(zzbqVar, entry.getKey())) != null) {
                map2.put(strZzj2, zzk(zzbqVar, entry.getValue()));
            }
        }
        for (Map.Entry entry2 : map.entrySet()) {
            if (!zzl(entry2.getKey()) && (strZzj = zzj(zzbqVar, entry2.getKey())) != null) {
                map2.put(strZzj, zzk(zzbqVar, entry2.getValue()));
            }
        }
        if (!TextUtils.isEmpty(this.zzg)) {
            zzff.zzg(map2, "_v", this.zzg);
            if (this.zzg.equals("ma4.0.0") || this.zzg.equals("ma4.0.1")) {
                map2.remove("adid");
            }
        }
        this.zza = Collections.unmodifiableMap(map2);
    }
}
