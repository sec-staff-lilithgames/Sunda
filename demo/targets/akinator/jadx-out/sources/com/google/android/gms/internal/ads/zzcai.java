package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import java.util.Iterator;
import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzcai implements SharedPreferences.OnSharedPreferenceChangeListener {
    final /* synthetic */ zzcal zza;
    private final String zzb;

    public zzcai(zzcal zzcalVar, String str) {
        Objects.requireNonNull(zzcalVar);
        this.zza = zzcalVar;
        this.zzb = str;
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        zzcal zzcalVar = this.zza;
        synchronized (zzcalVar) {
            try {
                Iterator it = zzcalVar.zzd().iterator();
                while (it.hasNext()) {
                    ((zzcaj) it.next()).zza(sharedPreferences, this.zzb, str);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
