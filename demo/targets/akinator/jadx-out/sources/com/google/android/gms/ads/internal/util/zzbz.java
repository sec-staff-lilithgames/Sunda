package com.google.android.gms.ads.internal.util;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.google.android.gms.internal.ads.zzbeu;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzbz {
    private final Map zza = new HashMap();
    private final List zzb = new ArrayList();
    private final Context zzc;

    public zzbz(Context context) {
        this.zzc = context;
    }

    public final void zza() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzlu)).booleanValue()) {
            com.google.android.gms.ads.internal.zzt.zzc();
            final Map mapZzz = zzs.zzz((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzlz));
            Iterator it = mapZzz.keySet().iterator();
            while (it.hasNext()) {
                zzc((String) it.next());
            }
            zzb(new zzbx() { // from class: com.google.android.gms.ads.internal.util.zzby
                @Override // com.google.android.gms.ads.internal.util.zzbx
                public final /* synthetic */ void zza(SharedPreferences sharedPreferences, String str, String str2) {
                    Map map = mapZzz;
                    if (map.containsKey(str) && ((Set) map.get(str)).contains(str2)) {
                        com.google.android.gms.ads.internal.zzt.zzh().zzo().zzy(false);
                    }
                }
            });
        }
    }

    public final synchronized void zzb(zzbx zzbxVar) {
        this.zzb.add(zzbxVar);
    }

    public final synchronized void zzc(String str) {
        try {
            Map map = this.zza;
            if (map.containsKey(str)) {
                return;
            }
            SharedPreferences defaultSharedPreferences = Objects.equals(str, "__default__") ? PreferenceManager.getDefaultSharedPreferences(this.zzc) : this.zzc.getSharedPreferences(str, 0);
            zzbw zzbwVar = new zzbw(this, str);
            map.put(str, zzbwVar);
            defaultSharedPreferences.registerOnSharedPreferenceChangeListener(zzbwVar);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final /* synthetic */ List zzd() {
        return this.zzb;
    }
}
