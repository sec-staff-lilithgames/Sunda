package e0;

import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class i2 extends CancellationException {
    /* JADX WARN: Multi-variable type inference failed */
    public i2() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public i2(String str) {
        super(str);
    }

    public /* synthetic */ i2(String str, int i10, kotlin.jvm.internal.u uVar) {
        this((i10 & 1) != 0 ? null : str);
    }
}
