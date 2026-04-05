package bi;

import android.util.Log;
import com.google.firebase.components.ComponentRegistrar;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class n implements d, ti.a {

    /* renamed from: i, reason: collision with root package name */
    public static final k f9574i = new k(0);

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f9575a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f9576b;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f9577c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f9578d;

    /* renamed from: e, reason: collision with root package name */
    public final HashSet f9579e;

    /* renamed from: f, reason: collision with root package name */
    public final t f9580f;

    /* renamed from: g, reason: collision with root package name */
    public final AtomicReference f9581g;

    /* renamed from: h, reason: collision with root package name */
    public final j f9582h;

    public n(Executor executor, ArrayList arrayList, List list, j jVar) {
        this.f9575a = new HashMap();
        this.f9576b = new HashMap();
        this.f9577c = new HashMap();
        this.f9579e = new HashSet();
        this.f9581g = new AtomicReference();
        t tVar = new t(executor);
        this.f9580f = tVar;
        this.f9582h = jVar;
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(c.of(tVar, (Class<t>) t.class, (Class<? super t>[]) new Class[]{yi.d.class, yi.c.class}));
        arrayList2.add(c.of(this, (Class<n>) ti.a.class, (Class<? super n>[]) new Class[0]));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            c cVar = (c) it.next();
            if (cVar != null) {
                arrayList2.add(cVar);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList3.add(it2.next());
        }
        this.f9578d = arrayList3;
        a(arrayList2);
    }

    public static m builder(Executor executor) {
        return new m(executor);
    }

    public final void a(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        synchronized (this) {
            Iterator it = this.f9578d.iterator();
            while (it.hasNext()) {
                try {
                    ComponentRegistrar componentRegistrar = (ComponentRegistrar) ((sj.c) it.next()).get();
                    if (componentRegistrar != null) {
                        arrayList.addAll(this.f9582h.processRegistrar(componentRegistrar));
                        it.remove();
                    }
                } catch (u e10) {
                    it.remove();
                    Log.w("ComponentDiscovery", "Invalid component registrar.", e10);
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                Object[] array = ((c) it2.next()).getProvidedInterfaces().toArray();
                int length = array.length;
                int i10 = 0;
                while (true) {
                    if (i10 < length) {
                        Object obj = array[i10];
                        if (obj.toString().contains("kotlinx.coroutines.CoroutineDispatcher")) {
                            if (this.f9579e.contains(obj.toString())) {
                                it2.remove();
                                break;
                            }
                            this.f9579e.add(obj.toString());
                        }
                        i10++;
                    }
                }
            }
            if (this.f9575a.isEmpty()) {
                kc.p.j(arrayList);
            } else {
                ArrayList arrayList3 = new ArrayList(this.f9575a.keySet());
                arrayList3.addAll(arrayList);
                kc.p.j(arrayList3);
            }
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                c cVar = (c) it3.next();
                this.f9575a.put(cVar, new v(new l(0, this, cVar)));
            }
            arrayList2.addAll(d(arrayList));
            arrayList2.addAll(e());
            c();
        }
        Iterator it4 = arrayList2.iterator();
        while (it4.hasNext()) {
            ((Runnable) it4.next()).run();
        }
        Boolean bool = (Boolean) this.f9581g.get();
        if (bool != null) {
            b(this.f9575a, bool.booleanValue());
        }
    }

    public final void b(HashMap map, boolean z10) {
        ArrayDeque arrayDeque;
        for (Map.Entry entry : map.entrySet()) {
            c cVar = (c) entry.getKey();
            sj.c cVar2 = (sj.c) entry.getValue();
            if (cVar.isAlwaysEager() || (cVar.isEagerInDefaultApp() && z10)) {
                cVar2.get();
            }
        }
        t tVar = this.f9580f;
        synchronized (tVar) {
            try {
                arrayDeque = tVar.f9593b;
                if (arrayDeque != null) {
                    tVar.f9593b = null;
                } else {
                    arrayDeque = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (arrayDeque != null) {
            Iterator it = arrayDeque.iterator();
            while (it.hasNext()) {
                tVar.publish((yi.a) it.next());
            }
        }
    }

    public final void c() {
        HashMap map = this.f9576b;
        HashMap map2 = this.f9577c;
        for (c cVar : this.f9575a.keySet()) {
            for (q qVar : cVar.getDependencies()) {
                if (qVar.isSet() && !map2.containsKey(qVar.getInterface())) {
                    b0 b0Var = qVar.getInterface();
                    Set set = Collections.EMPTY_SET;
                    w wVar = new w();
                    wVar.f9599b = null;
                    wVar.f9598a = Collections.newSetFromMap(new ConcurrentHashMap());
                    wVar.f9598a.addAll(set);
                    map2.put(b0Var, wVar);
                } else if (map.containsKey(qVar.getInterface())) {
                    continue;
                } else {
                    if (qVar.isRequired()) {
                        throw new x("Unsatisfied dependency for component " + cVar + ": " + qVar.getInterface());
                    }
                    if (!qVar.isSet()) {
                        map.put(qVar.getInterface(), new y(y.f9600c, y.f9601d));
                    }
                }
            }
        }
    }

    public final ArrayList d(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            c cVar = (c) it.next();
            if (cVar.isValue()) {
                sj.c cVar2 = (sj.c) this.f9575a.get(cVar);
                for (b0 b0Var : cVar.getProvidedInterfaces()) {
                    HashMap map = this.f9576b;
                    if (map.containsKey(b0Var)) {
                        arrayList2.add(new af.n(8, (y) ((sj.c) map.get(b0Var)), cVar2));
                    } else {
                        map.put(b0Var, cVar2);
                    }
                }
            }
        }
        return arrayList2;
    }

    @Override // ti.a
    public void discoverComponents() {
        synchronized (this) {
            try {
                if (this.f9578d.isEmpty()) {
                    return;
                }
                a(new ArrayList());
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final ArrayList e() {
        HashMap map = this.f9577c;
        ArrayList arrayList = new ArrayList();
        HashMap map2 = new HashMap();
        for (Map.Entry entry : this.f9575a.entrySet()) {
            c cVar = (c) entry.getKey();
            if (!cVar.isValue()) {
                sj.c cVar2 = (sj.c) entry.getValue();
                for (b0 b0Var : cVar.getProvidedInterfaces()) {
                    if (!map2.containsKey(b0Var)) {
                        map2.put(b0Var, new HashSet());
                    }
                    ((Set) map2.get(b0Var)).add(cVar2);
                }
            }
        }
        for (Map.Entry entry2 : map2.entrySet()) {
            if (map.containsKey(entry2.getKey())) {
                w wVar = (w) map.get(entry2.getKey());
                Iterator it = ((Set) entry2.getValue()).iterator();
                while (it.hasNext()) {
                    arrayList.add(new af.n(9, wVar, (sj.c) it.next()));
                }
            } else {
                b0 b0Var2 = (b0) entry2.getKey();
                Set set = (Set) ((Collection) entry2.getValue());
                w wVar2 = new w();
                wVar2.f9599b = null;
                wVar2.f9598a = Collections.newSetFromMap(new ConcurrentHashMap());
                wVar2.f9598a.addAll(set);
                map.put(b0Var2, wVar2);
            }
        }
        return arrayList;
    }

    @Override // bi.d
    public /* bridge */ /* synthetic */ Object get(b0 b0Var) {
        return super.get(b0Var);
    }

    @Override // bi.d
    public /* bridge */ /* synthetic */ sj.b getDeferred(Class cls) {
        return super.getDeferred(cls);
    }

    @Override // bi.d
    public /* bridge */ /* synthetic */ sj.c getProvider(Class cls) {
        return super.getProvider(cls);
    }

    public void initializeAllComponentsForTests() {
        Iterator it = this.f9575a.values().iterator();
        while (it.hasNext()) {
            ((sj.c) it.next()).get();
        }
    }

    public void initializeEagerComponents(boolean z10) {
        HashMap map;
        AtomicReference atomicReference = this.f9581g;
        Boolean boolValueOf = Boolean.valueOf(z10);
        while (!atomicReference.compareAndSet(null, boolValueOf)) {
            if (atomicReference.get() != null) {
                return;
            }
        }
        synchronized (this) {
            map = new HashMap(this.f9575a);
        }
        b(map, z10);
    }

    @Override // bi.d
    public /* bridge */ /* synthetic */ Set setOf(b0 b0Var) {
        return super.setOf(b0Var);
    }

    @Override // bi.d
    public /* bridge */ /* synthetic */ sj.c setOfProvider(Class cls) {
        return super.setOfProvider(cls);
    }

    @Override // bi.d
    public /* bridge */ /* synthetic */ Object get(Class cls) {
        return super.get(cls);
    }

    @Override // bi.d
    public <T> sj.b getDeferred(b0 b0Var) {
        sj.c provider = getProvider(b0Var);
        return provider == null ? new y(y.f9600c, y.f9601d) : provider instanceof y ? (y) provider : new y(null, provider);
    }

    @Override // bi.d
    public synchronized <T> sj.c getProvider(b0 b0Var) {
        z.checkNotNull(b0Var, "Null interface requested.");
        return (sj.c) this.f9576b.get(b0Var);
    }

    @Override // bi.d
    public /* bridge */ /* synthetic */ Set setOf(Class cls) {
        return super.setOf(cls);
    }

    @Override // bi.d
    public synchronized <T> sj.c setOfProvider(b0 b0Var) {
        w wVar = (w) this.f9577c.get(b0Var);
        if (wVar != null) {
            return wVar;
        }
        return f9574i;
    }

    @Deprecated
    public n(Executor executor, Iterable<ComponentRegistrar> iterable, c... cVarArr) {
        ArrayList arrayList = new ArrayList();
        Iterator<ComponentRegistrar> it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(new e(it.next(), 1));
        }
        this(executor, arrayList, Arrays.asList(cVarArr), j.f9565z8);
    }
}
