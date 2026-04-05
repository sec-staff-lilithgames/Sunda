package com.google.android.gms.common.api.internal;

import android.app.Dialog;
import android.app.PendingIntent;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.internal.Preconditions;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zao implements Runnable {
    final /* synthetic */ zap zaa;
    private final zam zab;

    public zao(zap zapVar, zam zamVar) {
        this.zaa = zapVar;
        this.zab = zamVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.zaa.zaa) {
            ConnectionResult connectionResultZab = this.zab.zab();
            if (connectionResultZab.hasResolution()) {
                zap zapVar = this.zaa;
                zapVar.mLifecycleFragment.startActivityForResult(GoogleApiActivity.zaa(zapVar.getActivity(), (PendingIntent) Preconditions.checkNotNull(connectionResultZab.getResolution()), this.zab.zaa(), false), 1);
                return;
            }
            zap zapVar2 = this.zaa;
            if (zapVar2.zac.getErrorResolutionIntent(zapVar2.getActivity(), connectionResultZab.getErrorCode(), null) != null) {
                zap zapVar3 = this.zaa;
                zapVar3.zac.zag(zapVar3.getActivity(), zapVar3.mLifecycleFragment, connectionResultZab.getErrorCode(), 2, this.zaa);
                return;
            }
            if (connectionResultZab.getErrorCode() != 18) {
                this.zaa.zaa(connectionResultZab, this.zab.zaa());
                return;
            }
            zap zapVar4 = this.zaa;
            Dialog dialogZab = zapVar4.zac.zab(zapVar4.getActivity(), zapVar4);
            zap zapVar5 = this.zaa;
            zapVar5.zac.zac(zapVar5.getActivity().getApplicationContext(), new zan(this, dialogZab));
        }
    }
}
