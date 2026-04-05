package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamic.RemoteCreator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzbvf extends RemoteCreator {
    public zzbvf() {
        super("com.google.android.gms.ads.AdOverlayCreatorImpl");
    }

    @Override // com.google.android.gms.dynamic.RemoteCreator
    public final /* synthetic */ Object getRemoteCreator(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlayCreator");
        return iInterfaceQueryLocalInterface instanceof zzbvl ? (zzbvl) iInterfaceQueryLocalInterface : new zzbvj(iBinder);
    }

    public final zzbvi zza(Activity activity) {
        try {
            IBinder iBinderZze = ((zzbvl) getRemoteCreatorInstance(activity)).zze(ObjectWrapper.wrap(activity));
            if (iBinderZze == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinderZze.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
            return iInterfaceQueryLocalInterface instanceof zzbvi ? (zzbvi) iInterfaceQueryLocalInterface : new zzbvg(iBinderZze);
        } catch (RemoteException e10) {
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Could not create remote AdOverlay.", e10);
            return null;
        } catch (RemoteCreator.RemoteCreatorException e11) {
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Could not create remote AdOverlay.", e11);
            return null;
        }
    }
}
