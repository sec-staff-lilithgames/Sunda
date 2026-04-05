package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zax implements zabz {
    final /* synthetic */ zaaa zaa;

    public /* synthetic */ zax(zaaa zaaaVar, zaw zawVar) {
        this.zaa = zaaaVar;
    }

    @Override // com.google.android.gms.common.api.internal.zabz
    public final void zaa(ConnectionResult connectionResult) {
        this.zaa.zam.lock();
        try {
            this.zaa.zaj = connectionResult;
            zaaa.zap(this.zaa);
        } finally {
            this.zaa.zam.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.zabz
    public final void zab(Bundle bundle) {
        this.zaa.zam.lock();
        try {
            zaaa.zao(this.zaa, bundle);
            this.zaa.zaj = ConnectionResult.RESULT_SUCCESS;
            zaaa.zap(this.zaa);
        } finally {
            this.zaa.zam.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.zabz
    public final void zac(int i10, boolean z10) {
        this.zaa.zam.lock();
        try {
            zaaa zaaaVar = this.zaa;
            if (zaaaVar.zal || zaaaVar.zak == null || !zaaaVar.zak.isSuccess()) {
                this.zaa.zal = false;
                zaaa.zan(this.zaa, i10, z10);
            } else {
                this.zaa.zal = true;
                this.zaa.zae.onConnectionSuspended(i10);
            }
            this.zaa.zam.unlock();
        } catch (Throwable th2) {
            this.zaa.zam.unlock();
            throw th2;
        }
    }
}
