package p0;

import kotlinx.coroutines.flow.Flow;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public interface b4 {
    long getChangeCount();

    boolean getHasPendingWork();

    Flow<o3> getState();

    default d1.l observe(d1.n nVar) {
        return null;
    }
}
