package ic;

import java.io.Serializable;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public interface f0 extends Serializable {
    default e0 acquireAndLinkPooled() {
        return acquirePooled().withPool(this);
    }

    e0 acquirePooled();

    default boolean clear() {
        return false;
    }

    default int pooledCount() {
        return -1;
    }

    void releasePooled(e0 e0Var);
}
