package com.google.android.gms.internal.ads;

import android.content.ContentResolver;
import android.content.Context;
import android.provider.Settings;
import java.util.concurrent.Callable;
import sh.n1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzeqz implements zzeya {
    private final Context zza;
    private final zzgus zzb;

    public zzeqz(zzgus zzgusVar, Context context) {
        this.zzb = zzgusVar;
        this.zza = context;
    }

    @Override // com.google.android.gms.internal.ads.zzeya
    public final n1 zza() {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zznU)).booleanValue()) {
            return zzgui.zza(new zzera(null, false));
        }
        final ContentResolver contentResolver = this.zza.getContentResolver();
        return contentResolver == null ? zzgui.zza(new zzera(null, false)) : this.zzb.submit(new Callable() { // from class: com.google.android.gms.internal.ads.zzeqy
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                ContentResolver contentResolver2 = contentResolver;
                return new zzera(Settings.Secure.getString(contentResolver2, "advertising_id"), Settings.Secure.getInt(contentResolver2, "limit_ad_tracking", 0) == 1);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzeya
    public final int zzb() {
        return 61;
    }
}
