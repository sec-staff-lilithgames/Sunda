package sh;

import sun.misc.Unsafe;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public abstract /* synthetic */ class o {
    public static /* synthetic */ boolean a(Unsafe unsafe, t tVar, long j10, Object obj, Object obj2) {
        while (!unsafe.compareAndSwapObject(tVar, j10, obj, obj2)) {
            if (unsafe.getObject(tVar, j10) != obj) {
                return false;
            }
        }
        return true;
    }
}
