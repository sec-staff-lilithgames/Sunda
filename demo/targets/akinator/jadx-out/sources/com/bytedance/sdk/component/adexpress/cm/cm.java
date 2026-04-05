package com.bytedance.sdk.component.adexpress.cm;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class cm {
    public static void jd(com.bytedance.sdk.component.xyk.xyk xykVar, int i10) {
        if (xykVar == null) {
            return;
        }
        com.bytedance.sdk.component.adexpress.jpo.jpo.wqx wqxVarWqx = com.bytedance.sdk.component.adexpress.jpo.jpo.jpo.jpo().wqx();
        ExecutorService executorServiceAu = wqxVarWqx != null ? wqxVarWqx.au() : null;
        if (executorServiceAu == null) {
            com.bytedance.sdk.component.xyk.jj.jpo(xykVar);
        } else {
            xykVar.setPriority(i10);
            executorServiceAu.execute(xykVar);
        }
    }

    public static void jpo(com.bytedance.sdk.component.xyk.xyk xykVar, int i10) {
        if (xykVar == null) {
            return;
        }
        com.bytedance.sdk.component.adexpress.jpo.jpo.wqx wqxVarWqx = com.bytedance.sdk.component.adexpress.jpo.jpo.jpo.jpo().wqx();
        ExecutorService executorServiceOya = wqxVarWqx != null ? wqxVarWqx.oya() : null;
        if (executorServiceOya == null) {
            com.bytedance.sdk.component.xyk.jj.jpo(xykVar, i10);
        } else {
            xykVar.setPriority(i10);
            executorServiceOya.execute(xykVar);
        }
    }

    public static ScheduledFuture jpo(Runnable runnable, long j10, TimeUnit timeUnit) {
        return com.bytedance.sdk.component.xyk.jj.jj().schedule(runnable, j10, timeUnit);
    }
}
