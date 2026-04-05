package androidx.viewpager2.adapter;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.j0;
import androidx.viewpager2.adapter.m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public CopyOnWriteArrayList f7369a;

    public List<l> dispatchMaxLifecyclePreUpdated(Fragment fragment, j0 j0Var) {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f7369a.iterator();
        while (it.hasNext()) {
            arrayList.add(((m.a) it.next()).onFragmentMaxLifecyclePreUpdated(fragment, j0Var));
        }
        return arrayList;
    }

    public void dispatchPostEvents(List<l> list) {
        Iterator<l> it = list.iterator();
        while (it.hasNext()) {
            ((k) it.next()).onPost();
        }
    }

    public List<l> dispatchPreAdded(Fragment fragment) {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f7369a.iterator();
        while (it.hasNext()) {
            arrayList.add(((m.a) it.next()).onFragmentPreAdded(fragment));
        }
        return arrayList;
    }

    public List<l> dispatchPreRemoved(Fragment fragment) {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f7369a.iterator();
        while (it.hasNext()) {
            arrayList.add(((m.a) it.next()).onFragmentPreRemoved(fragment));
        }
        return arrayList;
    }

    public List<l> dispatchPreSavedInstanceState(Fragment fragment) {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f7369a.iterator();
        while (it.hasNext()) {
            arrayList.add(((m.a) it.next()).onFragmentPreSavedInstanceState(fragment));
        }
        return arrayList;
    }

    public void registerCallback(m.a aVar) {
        this.f7369a.add(aVar);
    }

    public void unregisterCallback(m.a aVar) {
        this.f7369a.remove(aVar);
    }
}
