package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.Preconditions;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zam {
    private final int zaa;
    private final ConnectionResult zab;

    public zam(ConnectionResult connectionResult, int i10) {
        Preconditions.checkNotNull(connectionResult);
        this.zab = connectionResult;
        this.zaa = i10;
    }

    public final int zaa() {
        return this.zaa;
    }

    public final ConnectionResult zab() {
        return this.zab;
    }
}
