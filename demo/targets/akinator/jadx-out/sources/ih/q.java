package ih;

import java.util.HashSet;
import java.util.Set;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class q implements jh.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a f59602a;

    public q(a aVar) {
        this.f59602a = aVar;
    }

    @Override // jh.k
    public final Set zza() {
        HashSet hashSet;
        a aVar = this.f59602a;
        synchronized (aVar.f59577c) {
            hashSet = new HashSet(aVar.f59577c);
        }
        return hashSet;
    }
}
