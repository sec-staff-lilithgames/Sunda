package u1;

import java.util.concurrent.CancellationException;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class p extends CancellationException {
    public p(long j10) {
        super(o2.n(j10, "Timed out waiting for ", " ms"));
    }
}
