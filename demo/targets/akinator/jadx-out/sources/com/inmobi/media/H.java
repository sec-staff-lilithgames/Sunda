package com.inmobi.media;

import java.util.concurrent.ScheduledFuture;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class H extends kotlin.jvm.internal.f0 implements kv.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ J f31831a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H(J j10) {
        super(0);
        this.f31831a = j10;
    }

    @Override // kv.a
    public final Object invoke() {
        ScheduledFuture scheduledFuture = this.f31831a.f31893k;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
        cg cgVar = this.f31831a.f31894l;
        if (cgVar != null) {
            cgVar.a();
        }
        J j10 = this.f31831a;
        j10.f31894l = null;
        j10.f31893k = null;
        J.a(j10, new G4(0.0f, null, null));
        return tu.x0.f87415a;
    }
}
