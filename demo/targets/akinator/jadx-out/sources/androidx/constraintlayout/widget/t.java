package androidx.constraintlayout.widget;

import android.util.SparseIntArray;
import g3.t0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class t {

    /* renamed from: a, reason: collision with root package name */
    public final SparseIntArray f5568a = new SparseIntArray();

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f5569b = new HashMap();

    public void addListener(int i10, s sVar) {
        Integer numValueOf = Integer.valueOf(i10);
        HashMap map = this.f5569b;
        HashSet hashSet = (HashSet) map.get(numValueOf);
        if (hashSet == null) {
            hashSet = new HashSet();
            map.put(Integer.valueOf(i10), hashSet);
        }
        hashSet.add(new WeakReference(sVar));
    }

    public void clearListeners() {
        this.f5569b.clear();
    }

    public void fireNewValue(int i10, int i11) {
        SparseIntArray sparseIntArray = this.f5568a;
        int i12 = sparseIntArray.get(i10, -1);
        if (i12 == i11) {
            return;
        }
        sparseIntArray.put(i10, i11);
        HashSet hashSet = (HashSet) this.f5569b.get(Integer.valueOf(i10));
        if (hashSet == null) {
            return;
        }
        Iterator it = hashSet.iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            s sVar = (s) ((WeakReference) it.next()).get();
            if (sVar != null) {
                ((t0) sVar).onNewValue(i10, i11, i12);
            } else {
                z10 = true;
            }
        }
        if (z10) {
            ArrayList arrayList = new ArrayList();
            Iterator it2 = hashSet.iterator();
            while (it2.hasNext()) {
                WeakReference weakReference = (WeakReference) it2.next();
                if (((s) weakReference.get()) == null) {
                    arrayList.add(weakReference);
                }
            }
            hashSet.removeAll(arrayList);
        }
    }

    public int getValue(int i10) {
        return this.f5568a.get(i10, -1);
    }

    public void removeListener(int i10, s sVar) {
        HashSet hashSet = (HashSet) this.f5569b.get(Integer.valueOf(i10));
        if (hashSet == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            s sVar2 = (s) weakReference.get();
            if (sVar2 == null || sVar2 == sVar) {
                arrayList.add(weakReference);
            }
        }
        hashSet.removeAll(arrayList);
    }

    public void removeListener(s sVar) {
        Iterator it = this.f5569b.keySet().iterator();
        while (it.hasNext()) {
            removeListener(((Integer) it.next()).intValue(), sVar);
        }
    }
}
