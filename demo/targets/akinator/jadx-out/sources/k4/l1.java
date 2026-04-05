package k4;

import kotlinx.coroutines.flow.Flow;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public interface l1 {
    Flow<tu.x0> getUpdateNotifications();

    Object getVersion(zu.d<? super Integer> dVar);

    Object incrementAndGetVersion(zu.d<? super Integer> dVar);

    <T> Object lock(kv.l lVar, zu.d<? super T> dVar);

    <T> Object tryLock(kv.p pVar, zu.d<? super T> dVar);
}
