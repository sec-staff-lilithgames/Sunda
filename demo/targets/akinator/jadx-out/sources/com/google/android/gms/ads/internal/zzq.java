package com.google.android.gms.ads.internal;

import android.os.AsyncTask;
import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzq extends AsyncTask {
    final /* synthetic */ zzs zza;

    public /* synthetic */ zzq(zzs zzsVar, byte[] bArr) {
        Objects.requireNonNull(zzsVar);
        this.zza = zzsVar;
    }

    @Override // android.os.AsyncTask
    public final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        return this.zza.zzN();
    }

    @Override // android.os.AsyncTask
    public final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        zzs zzsVar = this.zza;
        String str = (String) obj;
        if (zzsVar.zzW() == null || str == null) {
            return;
        }
        zzsVar.zzW().loadUrl(str);
    }
}
