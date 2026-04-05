package com.inmobi.media;

import android.content.Context;
import java.util.concurrent.ScheduledFuture;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.inmobi.media.p, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C2928p extends kotlin.jvm.internal.f0 implements kv.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f33232a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2928p(Context context) {
        super(0);
        this.f33232a = context;
    }

    @Override // kv.a
    public final Object invoke() {
        C2894n c2894n = C2978s.f33337c;
        if (c2894n != null) {
            E2.a(new C2911o(this.f33232a, c2894n));
            C2978s.f33337c = null;
        }
        ScheduledFuture scheduledFuture = C2978s.f33340f;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
        C2945q c2945q = C2978s.f33342h;
        if (c2945q != null) {
            C2925od.f().a(c2945q);
        }
        C2978s.f33342h = null;
        C2978s.f33340f = null;
        return tu.x0.f87415a;
    }
}
