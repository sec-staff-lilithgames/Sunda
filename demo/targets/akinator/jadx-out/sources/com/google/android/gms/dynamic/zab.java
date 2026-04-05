package com.google.android.gms.dynamic;

import android.app.Activity;
import android.os.Bundle;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zab implements zah {
    final /* synthetic */ Activity zaa;
    final /* synthetic */ Bundle zab;
    final /* synthetic */ Bundle zac;
    final /* synthetic */ DeferredLifecycleHelper zad;

    public zab(DeferredLifecycleHelper deferredLifecycleHelper, Activity activity, Bundle bundle, Bundle bundle2) {
        this.zad = deferredLifecycleHelper;
        this.zaa = activity;
        this.zab = bundle;
        this.zac = bundle2;
    }

    @Override // com.google.android.gms.dynamic.zah
    public final int zaa() {
        return 0;
    }

    @Override // com.google.android.gms.dynamic.zah
    public final void zab(LifecycleDelegate lifecycleDelegate) {
        this.zad.zaa.onInflate(this.zaa, this.zab, this.zac);
    }
}
