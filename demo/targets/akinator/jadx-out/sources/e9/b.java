package e9;

import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f53979a = new ArrayList();

    public synchronized <T> void append(Class<T> cls, n8.d dVar) {
        this.f53979a.add(new a(cls, dVar));
    }

    public synchronized <T> n8.d getEncoder(Class<T> cls) {
        Iterator it = this.f53979a.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            if (aVar.f53977a.isAssignableFrom(cls)) {
                return aVar.f53978b;
            }
        }
        return null;
    }

    public synchronized <T> void prepend(Class<T> cls, n8.d dVar) {
        this.f53979a.add(0, new a(cls, dVar));
    }
}
