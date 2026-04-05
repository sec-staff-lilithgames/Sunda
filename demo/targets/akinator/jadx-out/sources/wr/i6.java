package wr;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public abstract class i6 {
    public static ArrayList a(Class cls, Iterable iterable) {
        ArrayList arrayList = new ArrayList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            Class cls2 = (Class) it.next();
            Object objNewInstance = null;
            try {
                objNewInstance = cls2.asSubclass(cls).getConstructor(null).newInstance(null);
            } catch (ClassCastException unused) {
            } catch (Throwable th2) {
                throw new ServiceConfigurationError(String.format("Provider %s could not be instantiated %s", cls2.getName(), th2), th2);
            }
            if (objNewInstance != null) {
                arrayList.add(objNewInstance);
            }
        }
        return arrayList;
    }

    public static <T> Iterable<T> getCandidatesViaServiceLoader(Class<T> cls, ClassLoader classLoader) {
        ServiceLoader serviceLoaderLoad = ServiceLoader.load(cls, classLoader);
        return !serviceLoaderLoad.iterator().hasNext() ? ServiceLoader.load(cls) : serviceLoaderLoad;
    }

    public static <T> T load(Class<T> cls, Iterable<Class<?>> iterable, ClassLoader classLoader, h6 h6Var) throws ClassNotFoundException {
        List listLoadAll = loadAll(cls, iterable, classLoader, h6Var);
        if (listLoadAll.isEmpty()) {
            return null;
        }
        return (T) listLoadAll.get(0);
    }

    public static <T> List<T> loadAll(Class<T> cls, Iterable<Class<?>> iterable, ClassLoader classLoader, h6 h6Var) throws ClassNotFoundException {
        Iterable candidatesViaServiceLoader;
        try {
            Class.forName("android.app.Application", false, classLoader);
            candidatesViaServiceLoader = a(cls, iterable);
        } catch (Exception unused) {
            candidatesViaServiceLoader = getCandidatesViaServiceLoader(cls, classLoader);
        }
        ArrayList arrayList = new ArrayList();
        for (T t10 : candidatesViaServiceLoader) {
            if (h6Var.isAvailable(t10)) {
                arrayList.add(t10);
            }
        }
        Collections.sort(arrayList, Collections.reverseOrder(new g6(h6Var)));
        return Collections.unmodifiableList(arrayList);
    }
}
