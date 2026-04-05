package pw;

import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class c1 extends d1 {
    @Override // pw.d1
    public d1 timeout(long j10, TimeUnit unit) {
        kotlin.jvm.internal.e0.checkNotNullParameter(unit, "unit");
        return this;
    }

    @Override // pw.d1
    public void throwIfReached() {
    }

    @Override // pw.d1
    public d1 deadlineNanoTime(long j10) {
        return this;
    }
}
