package bw;

import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f11349a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f11350b;

    /* renamed from: c, reason: collision with root package name */
    public c f11351c;

    /* renamed from: d, reason: collision with root package name */
    public long f11352d;

    public a(String name, boolean z10) {
        e0.checkNotNullParameter(name, "name");
        this.f11349a = name;
        this.f11350b = z10;
        this.f11352d = -1L;
    }

    public final boolean getCancelable() {
        return this.f11350b;
    }

    public final String getName() {
        return this.f11349a;
    }

    public final long getNextExecuteNanoTime$okhttp() {
        return this.f11352d;
    }

    public final c getQueue$okhttp() {
        return this.f11351c;
    }

    public final void initQueue$okhttp(c queue) {
        e0.checkNotNullParameter(queue, "queue");
        c cVar = this.f11351c;
        if (cVar == queue) {
            return;
        }
        if (cVar != null) {
            throw new IllegalStateException("task is in multiple queues");
        }
        this.f11351c = queue;
    }

    public abstract long runOnce();

    public final void setNextExecuteNanoTime$okhttp(long j10) {
        this.f11352d = j10;
    }

    public final void setQueue$okhttp(c cVar) {
        this.f11351c = cVar;
    }

    public String toString() {
        return this.f11349a;
    }

    public /* synthetic */ a(String str, boolean z10, int i10, u uVar) {
        this(str, (i10 & 2) != 0 ? true : z10);
    }
}
