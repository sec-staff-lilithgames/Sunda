package com.vungle.ads.internal.task;

import com.vungle.ads.internal.executor.VungleThreadPoolExecutor;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public abstract class PriorityRunnable implements VungleThreadPoolExecutor.ComparableRunnable {
    @Override // java.lang.Comparable
    public int compareTo(Object other) {
        e0.checkNotNullParameter(other, "other");
        if (!(other instanceof PriorityRunnable)) {
            return -1;
        }
        return e0.compare(((PriorityRunnable) other).getPriority(), getPriority());
    }

    public abstract int getPriority();
}
