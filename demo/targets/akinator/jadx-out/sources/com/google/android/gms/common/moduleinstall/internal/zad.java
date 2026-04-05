package com.google.android.gms.common.moduleinstall.internal;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.moduleinstall.ModuleAvailabilityResponse;
import com.google.android.gms.common.moduleinstall.ModuleInstallIntentResponse;
import com.google.android.gms.common.moduleinstall.ModuleInstallResponse;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public abstract class zad extends com.google.android.gms.internal.base.zab implements zae {
    public zad() {
        super("com.google.android.gms.common.moduleinstall.internal.IModuleInstallCallbacks");
    }

    @Override // com.google.android.gms.internal.base.zab
    public final boolean zaa(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 == 1) {
            Status status = (Status) com.google.android.gms.internal.base.zac.zaa(parcel, Status.CREATOR);
            ModuleAvailabilityResponse moduleAvailabilityResponse = (ModuleAvailabilityResponse) com.google.android.gms.internal.base.zac.zaa(parcel, ModuleAvailabilityResponse.CREATOR);
            com.google.android.gms.internal.base.zac.zab(parcel);
            zae(status, moduleAvailabilityResponse);
        } else if (i10 == 2) {
            Status status2 = (Status) com.google.android.gms.internal.base.zac.zaa(parcel, Status.CREATOR);
            ModuleInstallResponse moduleInstallResponse = (ModuleInstallResponse) com.google.android.gms.internal.base.zac.zaa(parcel, ModuleInstallResponse.CREATOR);
            com.google.android.gms.internal.base.zac.zab(parcel);
            zad(status2, moduleInstallResponse);
        } else if (i10 == 3) {
            Status status3 = (Status) com.google.android.gms.internal.base.zac.zaa(parcel, Status.CREATOR);
            ModuleInstallIntentResponse moduleInstallIntentResponse = (ModuleInstallIntentResponse) com.google.android.gms.internal.base.zac.zaa(parcel, ModuleInstallIntentResponse.CREATOR);
            com.google.android.gms.internal.base.zac.zab(parcel);
            zac(status3, moduleInstallIntentResponse);
        } else {
            if (i10 != 4) {
                return false;
            }
            Status status4 = (Status) com.google.android.gms.internal.base.zac.zaa(parcel, Status.CREATOR);
            com.google.android.gms.internal.base.zac.zab(parcel);
            zab(status4);
        }
        return true;
    }
}
