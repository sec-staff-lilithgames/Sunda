package com.google.android.gms.ads.internal.util;

import android.content.SharedPreferences;
import java.util.Iterator;
import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzbw implements SharedPreferences.OnSharedPreferenceChangeListener {
    final /* synthetic */ zzbz zza;
    private final String zzb;

    public zzbw(zzbz zzbzVar, String str) {
        Objects.requireNonNull(zzbzVar);
        this.zza = zzbzVar;
        this.zzb = str;
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        zzbz zzbzVar = this.zza;
        synchronized (zzbzVar) {
            try {
                Iterator it = zzbzVar.zzd().iterator();
                while (it.hasNext()) {
                    ((zzbx) it.next()).zza(sharedPreferences, this.zzb, str);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
