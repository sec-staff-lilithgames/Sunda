package c9;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f11939a = new ArrayList();

    public synchronized <Z, R> e get(Class<Z> cls, Class<R> cls2) {
        if (cls2.isAssignableFrom(cls)) {
            return h.get();
        }
        Iterator it = this.f11939a.iterator();
        while (it.hasNext()) {
            f fVar = (f) it.next();
            if (fVar.handles(cls, cls2)) {
                return fVar.f11938c;
            }
        }
        throw new IllegalArgumentException("No transcoder registered to transcode from " + cls + " to " + cls2);
    }

    public synchronized <Z, R> List<Class<R>> getTranscodeClasses(Class<Z> cls, Class<R> cls2) {
        ArrayList arrayList = new ArrayList();
        if (cls2.isAssignableFrom(cls)) {
            arrayList.add(cls2);
            return arrayList;
        }
        Iterator it = this.f11939a.iterator();
        while (it.hasNext()) {
            f fVar = (f) it.next();
            if (fVar.handles(cls, cls2) && !arrayList.contains(fVar.f11937b)) {
                arrayList.add(fVar.f11937b);
            }
        }
        return arrayList;
    }

    public synchronized <Z, R> void register(Class<Z> cls, Class<R> cls2, e eVar) {
        this.f11939a.add(new f(cls, cls2, eVar));
    }
}
