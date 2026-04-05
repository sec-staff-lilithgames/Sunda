package com.google.android.gms.common.moduleinstall.internal;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.moduleinstall.ModuleAvailabilityResponse;
import com.google.android.gms.common.moduleinstall.ModuleInstallIntentResponse;
import com.google.android.gms.common.moduleinstall.ModuleInstallResponse;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public interface zae extends IInterface {
    void zab(Status status) throws RemoteException;

    void zac(Status status, ModuleInstallIntentResponse moduleInstallIntentResponse) throws RemoteException;

    void zad(Status status, ModuleInstallResponse moduleInstallResponse) throws RemoteException;

    void zae(Status status, ModuleAvailabilityResponse moduleAvailabilityResponse) throws RemoteException;
}
