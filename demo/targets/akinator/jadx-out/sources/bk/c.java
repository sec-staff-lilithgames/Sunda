package bk;

import bi.q;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class c implements j {

    /* renamed from: a, reason: collision with root package name */
    public final String f9704a;

    /* renamed from: b, reason: collision with root package name */
    public final d f9705b;

    public c(Set set, d dVar) {
        this.f9704a = a(set);
        this.f9705b = dVar;
    }

    public static String a(Set set) {
        StringBuilder sb2 = new StringBuilder();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            f fVar = (f) it.next();
            sb2.append(fVar.getLibraryName());
            sb2.append('/');
            sb2.append(fVar.getVersion());
            if (it.hasNext()) {
                sb2.append(' ');
            }
        }
        return sb2.toString();
    }

    public static bi.c component() {
        return bi.c.builder(j.class).add(q.setOf((Class<?>) f.class)).factory(new b(0)).build();
    }

    @Override // bk.j
    public String getUserAgent() {
        Set setUnmodifiableSet;
        Set setUnmodifiableSet2;
        String str = this.f9704a;
        d dVar = this.f9705b;
        synchronized (dVar.f9707a) {
            setUnmodifiableSet = Collections.unmodifiableSet(dVar.f9707a);
        }
        if (setUnmodifiableSet.isEmpty()) {
            return str;
        }
        StringBuilder sbS = a.b.s(str, ' ');
        synchronized (dVar.f9707a) {
            setUnmodifiableSet2 = Collections.unmodifiableSet(dVar.f9707a);
        }
        sbS.append(a(setUnmodifiableSet2));
        return sbS.toString();
    }
}
