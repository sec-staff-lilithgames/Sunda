package k9;

import android.util.Log;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class e implements w3.f {

    /* renamed from: a, reason: collision with root package name */
    public final d f70666a;

    /* renamed from: b, reason: collision with root package name */
    public final g f70667b;

    /* renamed from: c, reason: collision with root package name */
    public final w3.g f70668c;

    public e(w3.g gVar, d dVar, g gVar2) {
        this.f70668c = gVar;
        this.f70666a = dVar;
        this.f70667b = gVar2;
    }

    @Override // w3.f
    public Object acquire() {
        Object objAcquire = this.f70668c.acquire();
        if (objAcquire == null) {
            objAcquire = this.f70666a.create();
            if (Log.isLoggable("FactoryPools", 2)) {
                Log.v("FactoryPools", "Created new " + objAcquire.getClass());
            }
        }
        if (objAcquire instanceof f) {
            ((f) objAcquire).getVerifier().setRecycled(false);
        }
        return objAcquire;
    }

    @Override // w3.f
    public boolean release(Object obj) {
        if (obj instanceof f) {
            ((f) obj).getVerifier().setRecycled(true);
        }
        this.f70667b.reset(obj);
        return this.f70668c.release(obj);
    }
}
