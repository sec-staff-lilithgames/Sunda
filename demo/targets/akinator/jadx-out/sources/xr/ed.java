package xr;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class ed extends cd {
    @Override // xr.cd
    public boolean runStateCompareAndSet(fd fdVar, int i10, int i11) {
        synchronized (fdVar) {
            try {
                if (fdVar.f92522e != i10) {
                    return false;
                }
                fdVar.f92522e = i11;
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // xr.cd
    public void runStateSet(fd fdVar, int i10) {
        synchronized (fdVar) {
            fdVar.f92522e = i10;
        }
    }
}
