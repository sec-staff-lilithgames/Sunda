package com.google.android.gms.common.api.internal;

import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zaaf {
    private final ApiKey zaa;
    private final TaskCompletionSource zab = new TaskCompletionSource();

    public zaaf(ApiKey apiKey) {
        this.zaa = apiKey;
    }

    public final ApiKey zaa() {
        return this.zaa;
    }

    public final TaskCompletionSource zab() {
        return this.zab;
    }
}
