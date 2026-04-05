package sh;

import sun.misc.Unsafe;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public abstract /* synthetic */ class p {
    public static /* synthetic */ boolean a(Unsafe unsafe, t tVar, long j10, s sVar, s sVar2) {
        while (!unsafe.compareAndSwapObject(tVar, j10, sVar, sVar2)) {
            if (unsafe.getObject(tVar, j10) != sVar) {
                return false;
            }
        }
        return true;
    }
}
