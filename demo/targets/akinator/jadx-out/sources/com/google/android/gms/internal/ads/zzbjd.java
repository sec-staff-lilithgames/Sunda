package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.formats.MediaView;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzbjd {
    private final zzbjc zza;

    public zzbjd(zzbjc zzbjcVar) {
        Context context;
        this.zza = zzbjcVar;
        try {
            context = (Context) ObjectWrapper.unwrap(zzbjcVar.zzm());
        } catch (RemoteException | NullPointerException e10) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("", e10);
            context = null;
        }
        if (context != null) {
            try {
                this.zza.zzn(ObjectWrapper.wrap(new MediaView(context)));
            } catch (RemoteException e11) {
                com.google.android.gms.ads.internal.util.client.zzo.zzg("", e11);
            }
        }
    }

    public final zzbjc zza() {
        return this.zza;
    }

    public final String zzb() {
        try {
            return this.zza.zzh();
        } catch (RemoteException e10) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("", e10);
            return null;
        }
    }
}
