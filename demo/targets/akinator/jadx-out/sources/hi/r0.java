package hi;

import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class r0 {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicInteger f58866a = new AtomicInteger();

    /* renamed from: b, reason: collision with root package name */
    public final AtomicInteger f58867b = new AtomicInteger();

    public int getDroppedOnDemandExceptions() {
        return this.f58867b.get();
    }

    public int getRecordedOnDemandExceptions() {
        return this.f58866a.get();
    }

    public void incrementDroppedOnDemandExceptions() {
        this.f58867b.getAndIncrement();
    }

    public void incrementRecordedOnDemandExceptions() {
        this.f58866a.getAndIncrement();
    }

    public void resetDroppedOnDemandExceptions() {
        this.f58867b.set(0);
    }
}
