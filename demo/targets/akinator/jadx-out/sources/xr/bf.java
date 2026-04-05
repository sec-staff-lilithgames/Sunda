package xr;

import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class bf implements cf {
    @Override // xr.cf
    public long currentTimeNanos() {
        return TimeUnit.MILLISECONDS.toNanos(System.currentTimeMillis());
    }
}
