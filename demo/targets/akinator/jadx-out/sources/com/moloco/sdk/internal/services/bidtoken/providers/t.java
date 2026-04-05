package com.moloco.sdk.internal.services.bidtoken.providers;

import android.app.ActivityManager;
import com.moloco.sdk.internal.MolocoLogger;
import j1.o2;
import kotlin.jvm.internal.e0;
import zb.VW.VPCjETNfjxu;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class t implements j {

    /* renamed from: b, reason: collision with root package name */
    public final ActivityManager f46926b;

    /* renamed from: c, reason: collision with root package name */
    public s f46927c;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.u uVar) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
    }

    public t(ActivityManager activityManager) {
        e0.checkNotNullParameter(activityManager, "activityManager");
        this.f46926b = activityManager;
        this.f46927c = e();
    }

    public final boolean a(s sVar, s sVar2) {
        return (e0.areEqual(sVar.d(), sVar2.d()) && e0.areEqual(sVar.e(), sVar2.e()) && e0.areEqual(sVar.f(), sVar2.f())) ? false : true;
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.j
    public String c() {
        return "MemorySignalProvider";
    }

    public final s e() {
        try {
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            this.f46926b.getMemoryInfo(memoryInfo);
            return new s(Boolean.valueOf(memoryInfo.lowMemory), Long.valueOf(memoryInfo.threshold), Long.valueOf(memoryInfo.totalMem));
        } catch (Exception e10) {
            MolocoLogger.error$default(MolocoLogger.INSTANCE, "MemorySignalProvider", "[CBT] MI Error", e10, false, 8, null);
            return new s(null, null, null, 7, null);
        }
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.j
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public s d() {
        s sVar = this.f46927c;
        MolocoLogger.debugBuildLog$default(MolocoLogger.INSTANCE, "MemorySignalProvider", "[CBT] lm: " + sVar.d() + ", t: " + sVar.e() + ", tm: " + sVar.f(), false, 4, null);
        return sVar;
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.j
    public boolean b() {
        s sVarE = e();
        MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
        MolocoLogger.debugBuildLog$default(molocoLogger, "MemorySignalProvider", "[CBT] cached lm: " + this.f46927c.d() + ", t: " + this.f46927c.e() + ", tm: " + this.f46927c.f(), false, 4, null);
        MolocoLogger.debugBuildLog$default(molocoLogger, "MemorySignalProvider", "[CBT] current lm: " + sVarE.d() + ", t: " + sVarE.e() + ", tm: " + sVarE.f(), false, 4, null);
        boolean zA = a(sVarE, this.f46927c);
        MolocoLogger.debugBuildLog$default(molocoLogger, "MemorySignalProvider", o2.n(VPCjETNfjxu.excCxD, zA), false, 4, null);
        return zA;
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.j
    public void a() {
        MolocoLogger.debugBuildLog$default(MolocoLogger.INSTANCE, "MemorySignalProvider", "[CBT] Updating m state", false, 4, null);
        this.f46927c = e();
    }
}
