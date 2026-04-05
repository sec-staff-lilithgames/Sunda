package e9;

import java.util.ArrayList;
import n8.y;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class h {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f53993a = new ArrayList();

    public synchronized <Z> void append(Class<Z> cls, y yVar) {
        this.f53993a.add(new g(cls, yVar));
    }

    public synchronized <Z> y get(Class<Z> cls) {
        int size = this.f53993a.size();
        for (int i10 = 0; i10 < size; i10++) {
            g gVar = (g) this.f53993a.get(i10);
            if (gVar.f53991a.isAssignableFrom(cls)) {
                return gVar.f53992b;
            }
        }
        return null;
    }

    public synchronized <Z> void prepend(Class<Z> cls, y yVar) {
        this.f53993a.add(0, new g(cls, yVar));
    }
}
