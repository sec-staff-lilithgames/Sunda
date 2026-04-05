package sh;

import sun.misc.Unsafe;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public abstract /* synthetic */ class n {
    public static /* synthetic */ boolean a(Unsafe unsafe, k kVar, long j10, h hVar, h hVar2) {
        while (!unsafe.compareAndSwapObject(kVar, j10, hVar, hVar2)) {
            if (unsafe.getObject(kVar, j10) != hVar) {
                return false;
            }
        }
        return true;
    }
}
