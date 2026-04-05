package i3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import w3.g;
import z.t1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final g f59379a = new g(10);

    /* renamed from: b, reason: collision with root package name */
    public final t1 f59380b = new t1();

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f59381c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public final HashSet f59382d = new HashSet();

    public final void a(Object obj, ArrayList arrayList, HashSet hashSet) {
        if (arrayList.contains(obj)) {
            return;
        }
        if (hashSet.contains(obj)) {
            throw new RuntimeException("This graph contains cyclic dependencies");
        }
        hashSet.add(obj);
        ArrayList arrayList2 = (ArrayList) this.f59380b.get(obj);
        if (arrayList2 != null) {
            int size = arrayList2.size();
            for (int i10 = 0; i10 < size; i10++) {
                a(arrayList2.get(i10), arrayList, hashSet);
            }
        }
        hashSet.remove(obj);
        arrayList.add(obj);
    }

    public void addEdge(Object obj, Object obj2) {
        t1 t1Var = this.f59380b;
        if (!t1Var.containsKey(obj) || !t1Var.containsKey(obj2)) {
            throw new IllegalArgumentException("All nodes must be present in the graph before being added as an edge");
        }
        ArrayList arrayList = (ArrayList) t1Var.get(obj);
        if (arrayList == null) {
            arrayList = (ArrayList) this.f59379a.acquire();
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            t1Var.put(obj, arrayList);
        }
        arrayList.add(obj2);
    }

    public void addNode(Object obj) {
        t1 t1Var = this.f59380b;
        if (t1Var.containsKey(obj)) {
            return;
        }
        t1Var.put(obj, null);
    }

    public void clear() {
        t1 t1Var = this.f59380b;
        int size = t1Var.size();
        for (int i10 = 0; i10 < size; i10++) {
            ArrayList arrayList = (ArrayList) t1Var.valueAt(i10);
            if (arrayList != null) {
                arrayList.clear();
                this.f59379a.release(arrayList);
            }
        }
        t1Var.clear();
    }

    public boolean contains(Object obj) {
        return this.f59380b.containsKey(obj);
    }

    public List getIncomingEdges(Object obj) {
        return (List) this.f59380b.get(obj);
    }

    public List<Object> getOutgoingEdges(Object obj) {
        t1 t1Var = this.f59380b;
        int size = t1Var.size();
        ArrayList arrayList = null;
        for (int i10 = 0; i10 < size; i10++) {
            ArrayList arrayList2 = (ArrayList) t1Var.valueAt(i10);
            if (arrayList2 != null && arrayList2.contains(obj)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(t1Var.keyAt(i10));
            }
        }
        return arrayList;
    }

    public ArrayList<Object> getSortedList() {
        ArrayList<Object> arrayList = this.f59381c;
        arrayList.clear();
        HashSet hashSet = this.f59382d;
        hashSet.clear();
        t1 t1Var = this.f59380b;
        int size = t1Var.size();
        for (int i10 = 0; i10 < size; i10++) {
            a(t1Var.keyAt(i10), arrayList, hashSet);
        }
        return arrayList;
    }

    public boolean hasOutgoingEdges(Object obj) {
        t1 t1Var = this.f59380b;
        int size = t1Var.size();
        for (int i10 = 0; i10 < size; i10++) {
            ArrayList arrayList = (ArrayList) t1Var.valueAt(i10);
            if (arrayList != null && arrayList.contains(obj)) {
                return true;
            }
        }
        return false;
    }
}
