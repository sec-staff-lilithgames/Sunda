package r8;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class v {

    /* renamed from: a, reason: collision with root package name */
    public final j9.n f84045a = new j9.n(1000);

    /* renamed from: b, reason: collision with root package name */
    public final w3.f f84046b = k9.h.threadSafe(10, new t());

    public String getSafeKey(n8.q qVar) {
        String str;
        synchronized (this.f84045a) {
            str = (String) this.f84045a.get(qVar);
        }
        if (str == null) {
            w3.f fVar = this.f84046b;
            u uVar = (u) j9.q.checkNotNull(fVar.acquire());
            try {
                qVar.updateDiskCacheKey(uVar.f84043b);
                String strSha256BytesToHex = j9.s.sha256BytesToHex(uVar.f84043b.digest());
                fVar.release(uVar);
                str = strSha256BytesToHex;
            } catch (Throwable th2) {
                fVar.release(uVar);
                throw th2;
            }
        }
        synchronized (this.f84045a) {
            this.f84045a.put(qVar, str);
        }
        return str;
    }
}
