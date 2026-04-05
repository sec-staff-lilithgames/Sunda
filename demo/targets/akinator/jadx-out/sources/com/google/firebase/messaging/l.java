package com.google.firebase.messaging;

import android.content.Intent;
import com.google.android.gms.tasks.Task;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class l implements q0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ EnhancedIntentService f29829a;

    public l(EnhancedIntentService enhancedIntentService) {
        this.f29829a = enhancedIntentService;
    }

    @Override // com.google.firebase.messaging.q0
    public Task<Void> handle(Intent intent) {
        int i10 = EnhancedIntentService.f29716h;
        return this.f29829a.c(intent);
    }
}
