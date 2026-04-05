package w6;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class k implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f90420b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l f90421c;

    public k(l lVar, Object obj) {
        this.f90421c = lVar;
        this.f90420b = obj;
    }

    @Override // java.lang.Runnable
    public void run() {
        synchronized (this.f90421c.f90424e) {
            try {
                Object objApply = this.f90421c.f90425f.apply(this.f90420b);
                l lVar = this.f90421c;
                Object obj = lVar.f90422b;
                if (obj == null && objApply != null) {
                    lVar.f90422b = objApply;
                    lVar.f90426g.postValue(objApply);
                } else if (obj != null && !obj.equals(objApply)) {
                    l lVar2 = this.f90421c;
                    lVar2.f90422b = objApply;
                    lVar2.f90426g.postValue(objApply);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
