package com.inmobi.media;

import android.content.Context;
import android.content.IntentFilter;
import android.media.AudioManager;
import java.util.concurrent.ScheduledThreadPoolExecutor;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class r extends kotlin.jvm.internal.f0 implements kv.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ F5 f33295a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f33296b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f33297c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(F5 f52, Context context, long j10) {
        super(0);
        this.f33295a = f52;
        this.f33296b = context;
        this.f33297c = j10;
    }

    @Override // kv.a
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final tu.x0 invoke() {
        boolean zCompareAndSet = C2978s.f33338d.compareAndSet(false, true);
        tu.x0 x0Var = tu.x0.f87415a;
        if (zCompareAndSet) {
            ((ScheduledThreadPoolExecutor) F4.f31771c.getValue()).execute(new com.applovin.impl.f9(this.f33295a, this.f33296b, this.f33297c, 7));
            return x0Var;
        }
        F5 f52 = this.f33295a;
        if (f52 == null) {
            return null;
        }
        ((G5) f52).c("AdAudioTracker", "Audio volume tracking is already started");
        return x0Var;
    }

    public static final void a(F5 f52, Context context, long j10) {
        if (f52 != null) {
            ((G5) f52).c("AdAudioTracker", "Starting audio volume tracking");
        }
        if (C2978s.f33336b == null) {
            Object systemService = context.getSystemService("audio");
            kotlin.jvm.internal.e0.checkNotNull(systemService, "null cannot be cast to non-null type android.media.AudioManager");
            C2978s.f33336b = (AudioManager) systemService;
        }
        C2978s c2978s = C2978s.f33335a;
        C2978s.a(j10);
        C2945q c2945q = new C2945q(j10);
        C2978s.f33342h = c2945q;
        C2925od.f().a(new int[]{102, 101}, c2945q);
        C2978s.f33337c = new C2894n();
        context.registerReceiver(C2978s.f33337c, new IntentFilter("android.media.VOLUME_CHANGED_ACTION"));
        C2978s.a(Float.valueOf(c2978s.a()));
    }
}
