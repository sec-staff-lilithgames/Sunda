package com.inmobi.media;

import java.util.concurrent.ScheduledFuture;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.inmobi.media.q, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C2945q extends kotlin.jvm.internal.f0 implements kv.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f33276a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2945q(long j10) {
        super(1);
        this.f33276a = j10;
    }

    @Override // kv.l
    public final Object invoke(Object obj) {
        C2762f2 it = (C2762f2) obj;
        kotlin.jvm.internal.e0.checkNotNullParameter(it, "it");
        int i10 = it.f32830a;
        if (i10 != 101) {
            if (i10 == 102) {
                ScheduledFuture scheduledFuture = C2978s.f33340f;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(true);
                }
                C2978s.f33340f = null;
            }
        } else if (C2978s.f33340f == null && C2978s.f33338d.get()) {
            C2978s.a(this.f33276a);
        }
        return tu.x0.f87415a;
    }
}
