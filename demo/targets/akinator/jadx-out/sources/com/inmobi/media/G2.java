package com.inmobi.media;

import java.util.concurrent.FutureTask;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class G2 extends FutureTask implements Comparable {

    /* renamed from: a, reason: collision with root package name */
    public volatile EnumC2737db f31811a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G2(Runnable runnable, EnumC2737db priority) {
        super(runnable, null);
        kotlin.jvm.internal.e0.checkNotNullParameter(priority, "priority");
        this.f31811a = priority;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        G2 other = (G2) obj;
        kotlin.jvm.internal.e0.checkNotNullParameter(other, "other");
        return kotlin.jvm.internal.e0.compare(this.f31811a.f32785a, other.f31811a.f32785a);
    }
}
