package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.ads.formats.NativeAd;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzbic extends NativeAd.AdChoicesInfo {
    private final zzbib zza;
    private final List zzb = new ArrayList();
    private String zzc;

    public zzbic(zzbib zzbibVar) {
        zzbii zzbigVar;
        this.zza = zzbibVar;
        try {
            this.zzc = zzbibVar.zzb();
        } catch (RemoteException e10) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("", e10);
            this.zzc = "";
        }
        try {
            for (Object obj : zzbibVar.zzc()) {
                if (obj instanceof IBinder) {
                    IBinder iBinder = (IBinder) obj;
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
                    zzbigVar = iInterfaceQueryLocalInterface instanceof zzbii ? (zzbii) iInterfaceQueryLocalInterface : new zzbig(iBinder);
                } else {
                    zzbigVar = null;
                }
                if (zzbigVar != null) {
                    this.zzb.add(new zzbij(zzbigVar));
                }
            }
        } catch (RemoteException e11) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("", e11);
        }
    }

    @Override // com.google.android.gms.ads.formats.NativeAd.AdChoicesInfo
    public final List<NativeAd.Image> getImages() {
        return this.zzb;
    }

    @Override // com.google.android.gms.ads.formats.NativeAd.AdChoicesInfo
    public final CharSequence getText() {
        return this.zzc;
    }
}
