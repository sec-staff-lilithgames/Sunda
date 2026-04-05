package com.inmobi.media;

import android.content.Context;
import ao.kwoC.zAQQWzBxnS;
import com.inmobi.commons.core.configs.CrashConfig;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class J3 {

    /* renamed from: a, reason: collision with root package name */
    public volatile CrashConfig f31899a;

    /* renamed from: b, reason: collision with root package name */
    public final N7 f31900b;

    /* renamed from: c, reason: collision with root package name */
    public final List f31901c;

    public final void a(Z5 incidentEvent) {
        int i10;
        kotlin.jvm.internal.e0.checkNotNullParameter(incidentEvent, "incidentEvent");
        if ((incidentEvent instanceof C2761f1) && this.f31899a.getANRConfig().getAppExitReason().getEnabled()) {
            i10 = 152;
        } else if ((incidentEvent instanceof C2915o3) && this.f31899a.getCrashConfig().getEnabled()) {
            i10 = 150;
        } else if (!(incidentEvent instanceof Lf) || !this.f31899a.getANRConfig().getWatchdog().getEnabled()) {
            return;
        } else {
            i10 = 151;
        }
        this.f31900b.b(new C2762f2(i10, incidentEvent.f32425a, uu.o1.mapOf(tu.e0.to("data", incidentEvent))));
    }

    public J3(Context context, CrashConfig crashConfig, N7 eventBus) {
        J3 j32;
        kotlin.jvm.internal.e0.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.e0.checkNotNullParameter(crashConfig, "crashConfig");
        kotlin.jvm.internal.e0.checkNotNullParameter(eventBus, "eventBus");
        this.f31899a = crashConfig;
        this.f31900b = eventBus;
        List listSynchronizedList = Collections.synchronizedList(new ArrayList());
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(listSynchronizedList, zAQQWzBxnS.wUldPruI);
        this.f31901c = listSynchronizedList;
        if (this.f31899a.getCrashConfig().getEnabled()) {
            listSynchronizedList.add(new C2898n3(Thread.getDefaultUncaughtExceptionHandler(), this));
        }
        if (this.f31899a.getANRConfig().getAppExitReason().getEnabled() && R3.f32183a.J()) {
            j32 = this;
            listSynchronizedList.add(new C2744e1(context, j32, this.f31899a.getANRConfig().getAppExitReason().getIncidentWaitInterval(), this.f31899a.getANRConfig().getAppExitReason().getMaxNumberOfLines()));
        } else {
            j32 = this;
        }
        if (j32.f31899a.getANRConfig().getWatchdog().getEnabled()) {
            listSynchronizedList.add(new C2691b(j32.f31899a.getANRConfig().getWatchdog().getInterval(), this));
        }
    }
}
