package sh;

import java.util.Set;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class b0 extends jh.i {
    @Override // jh.i
    public final int B(z zVar) {
        int i10;
        synchronized (zVar) {
            i10 = zVar.f85787k - 1;
            zVar.f85787k = i10;
        }
        return i10;
    }

    @Override // jh.i
    public final void x(z zVar, Set set) {
        synchronized (zVar) {
            try {
                if (zVar.f85786j == null) {
                    zVar.f85786j = set;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
