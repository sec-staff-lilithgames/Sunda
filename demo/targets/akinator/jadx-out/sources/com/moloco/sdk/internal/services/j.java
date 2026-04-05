package com.moloco.sdk.internal.services;

import android.os.SystemClock;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class j implements i {
    @Override // com.moloco.sdk.internal.services.i
    public long a() {
        return System.currentTimeMillis();
    }

    @Override // com.moloco.sdk.internal.services.i
    public long elapsedRealtime() {
        return SystemClock.elapsedRealtime();
    }

    @Override // com.moloco.sdk.internal.services.i
    @tu.f
    public long invoke() {
        return System.currentTimeMillis();
    }
}
