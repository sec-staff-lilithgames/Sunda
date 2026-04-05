package com.google.android.gms.internal.ads;

import android.os.AsyncTask;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public abstract class zzfre extends AsyncTask {
    private zzfrf zza;
    protected final zzfqw zzd;

    public zzfre(zzfqw zzfqwVar) {
        this.zzd = zzfqwVar;
    }

    @Override // android.os.AsyncTask
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public void onPostExecute(String str) {
        zzfrf zzfrfVar = this.zza;
        if (zzfrfVar != null) {
            zzfrfVar.zzb(this);
        }
    }

    public final void zzb(zzfrf zzfrfVar) {
        this.zza = zzfrfVar;
    }
}
