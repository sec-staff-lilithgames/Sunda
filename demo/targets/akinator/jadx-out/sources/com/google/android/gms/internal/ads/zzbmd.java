package com.google.android.gms.internal.ads;

import android.content.Context;
import com.ironsource.C3191e4;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzbmd implements zzblx {
    private final Context zza;
    private final Map zzb;

    public zzbmd(Context context, Map map) {
        this.zza = context;
        this.zzb = map;
    }

    @Override // com.google.android.gms.internal.ads.zzblx
    public final void zza(Object obj, Map map) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        zzcaf zzcafVarZzD = com.google.android.gms.ads.internal.zzt.zzD();
        Context context = this.zza;
        if (zzcafVarZzD.zza(context)) {
            String str = (String) map.get(C3191e4.h.f36490j0);
            String str2 = (String) map.get("eventId");
            int iHashCode = str.hashCode();
            if (iHashCode != 94399) {
                if (iHashCode != 94401) {
                    if (iHashCode == 94407 && str.equals("_ai")) {
                        com.google.android.gms.ads.internal.zzt.zzD().zzl(context, str2, (Map) this.zzb.get("_ai"));
                        return;
                    }
                } else if (str.equals("_ac")) {
                    com.google.android.gms.ads.internal.zzt.zzD().zzk(context, str2, (Map) this.zzb.get("_ac"));
                    return;
                }
            } else if (str.equals("_aa")) {
                com.google.android.gms.ads.internal.zzt.zzD().zzn(context, str2);
                return;
            }
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzf("logScionEvent gmsg contained unsupported eventName");
        }
    }
}
