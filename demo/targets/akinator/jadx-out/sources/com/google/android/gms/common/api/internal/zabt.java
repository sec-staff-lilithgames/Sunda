package com.google.android.gms.common.api.internal;

import android.util.Log;
import com.google.android.gms.common.ConnectionResult;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zabt implements Runnable {
    final /* synthetic */ ConnectionResult zaa;
    final /* synthetic */ zabu zab;

    public zabt(zabu zabuVar, ConnectionResult connectionResult) {
        this.zab = zabuVar;
        this.zaa = connectionResult;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zabu zabuVar = this.zab;
        zabq zabqVar = (zabq) zabuVar.zaa.zan.get(zabuVar.zac);
        if (zabqVar == null) {
            return;
        }
        if (!this.zaa.isSuccess()) {
            zabqVar.zar(this.zaa, null);
            return;
        }
        this.zab.zaf = true;
        if (this.zab.zab.requiresSignIn()) {
            this.zab.zah();
            return;
        }
        try {
            zabu zabuVar2 = this.zab;
            zabuVar2.zab.getRemoteService(null, zabuVar2.zab.getScopesForConnectionlessNonSignIn());
        } catch (SecurityException e10) {
            Log.e("GoogleApiManager", "Failed to get service from broker. ", e10);
            this.zab.zab.disconnect("Failed to get service from broker.");
            zabqVar.zar(new ConnectionResult(10), null);
        }
    }
}
