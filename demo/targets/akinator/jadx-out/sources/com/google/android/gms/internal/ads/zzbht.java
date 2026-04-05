package com.google.android.gms.internal.ads;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzbht extends zzbih {
    private final Drawable zza;
    private final Uri zzb;
    private final double zzc;
    private final int zzd;
    private final int zze;
    private final Map zzf;

    public zzbht(Drawable drawable, Uri uri, double d10, int i10, int i11, Map map) {
        this.zza = drawable;
        this.zzb = uri;
        this.zzc = d10;
        this.zzd = i10;
        this.zze = i11;
        this.zzf = map;
    }

    @Override // com.google.android.gms.internal.ads.zzbii
    public final IObjectWrapper zzb() throws RemoteException {
        return ObjectWrapper.wrap(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbii
    public final Uri zzc() throws RemoteException {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbii
    public final double zzd() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzbii
    public final int zze() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzbii
    public final int zzf() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzbii
    public final Map zzg() {
        return this.zzf;
    }
}
