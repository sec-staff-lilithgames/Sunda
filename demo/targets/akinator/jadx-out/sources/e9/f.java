package e9;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import n8.x;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f53986a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f53987b = new HashMap();

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final Class f53988a;

        /* renamed from: b, reason: collision with root package name */
        public final Class f53989b;

        /* renamed from: c, reason: collision with root package name */
        public final x f53990c;

        public a(Class<Object> cls, Class<Object> cls2, x xVar) {
            this.f53988a = cls;
            this.f53989b = cls2;
            this.f53990c = xVar;
        }

        public boolean handles(Class<?> cls, Class<?> cls2) {
            return this.f53988a.isAssignableFrom(cls) && cls2.isAssignableFrom(this.f53989b);
        }
    }

    public final synchronized List a(String str) {
        List arrayList;
        try {
            if (!this.f53986a.contains(str)) {
                this.f53986a.add(str);
            }
            arrayList = (List) this.f53987b.get(str);
            if (arrayList == null) {
                arrayList = new ArrayList();
                this.f53987b.put(str, arrayList);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return arrayList;
    }

    public synchronized <T, R> void append(String str, x xVar, Class<T> cls, Class<R> cls2) {
        a(str).add(new a(cls, cls2, xVar));
    }

    public synchronized <T, R> List<x> getDecoders(Class<T> cls, Class<R> cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator it = this.f53986a.iterator();
        while (it.hasNext()) {
            List<a> list = (List) this.f53987b.get((String) it.next());
            if (list != null) {
                for (a aVar : list) {
                    if (aVar.handles(cls, cls2)) {
                        arrayList.add(aVar.f53990c);
                    }
                }
            }
        }
        return arrayList;
    }

    public synchronized <T, R> List<Class<R>> getResourceClasses(Class<T> cls, Class<R> cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator it = this.f53986a.iterator();
        while (it.hasNext()) {
            List<a> list = (List) this.f53987b.get((String) it.next());
            if (list != null) {
                for (a aVar : list) {
                    if (aVar.handles(cls, cls2) && !arrayList.contains(aVar.f53989b)) {
                        arrayList.add(aVar.f53989b);
                    }
                }
            }
        }
        return arrayList;
    }

    public synchronized <T, R> void prepend(String str, x xVar, Class<T> cls, Class<R> cls2) {
        a(str).add(0, new a(cls, cls2, xVar));
    }

    public synchronized void setBucketPriorityList(List<String> list) {
        try {
            ArrayList arrayList = new ArrayList(this.f53986a);
            this.f53986a.clear();
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                this.f53986a.add(it.next());
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                String str = (String) it2.next();
                if (!list.contains(str)) {
                    this.f53986a.add(str);
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
