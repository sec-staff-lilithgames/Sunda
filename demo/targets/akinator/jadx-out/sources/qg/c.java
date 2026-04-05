package qg;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f83111a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final HashSet f83112b = new HashSet();

    /* renamed from: c, reason: collision with root package name */
    public b f83113c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f83114d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f83115e;

    public final boolean a(v vVar) {
        int id2 = vVar.getId();
        Integer numValueOf = Integer.valueOf(id2);
        HashSet hashSet = this.f83112b;
        if (hashSet.contains(numValueOf)) {
            return false;
        }
        v vVar2 = (v) this.f83111a.get(Integer.valueOf(getSingleCheckedId()));
        if (vVar2 != null) {
            c(vVar2, false);
        }
        boolean zAdd = hashSet.add(Integer.valueOf(id2));
        if (!vVar.isChecked()) {
            vVar.setChecked(true);
        }
        return zAdd;
    }

    public void addCheckable(v vVar) {
        this.f83111a.put(Integer.valueOf(vVar.getId()), vVar);
        if (vVar.isChecked()) {
            a(vVar);
        }
        vVar.setInternalOnCheckedChangeListener(new a(this));
    }

    public final void b() {
        b bVar = this.f83113c;
        if (bVar != null) {
            ((gg.g) bVar).onCheckedStateChanged(getCheckedIds());
        }
    }

    public final boolean c(v vVar, boolean z10) {
        int id2 = vVar.getId();
        Integer numValueOf = Integer.valueOf(id2);
        HashSet hashSet = this.f83112b;
        if (!hashSet.contains(numValueOf)) {
            return false;
        }
        if (z10 && hashSet.size() == 1 && hashSet.contains(Integer.valueOf(id2))) {
            vVar.setChecked(true);
            return false;
        }
        boolean zRemove = hashSet.remove(Integer.valueOf(id2));
        if (vVar.isChecked()) {
            vVar.setChecked(false);
        }
        return zRemove;
    }

    public void check(int i10) {
        v vVar = (v) this.f83111a.get(Integer.valueOf(i10));
        if (vVar != null && a(vVar)) {
            b();
        }
    }

    public void clearCheck() {
        boolean zIsEmpty = this.f83112b.isEmpty();
        Iterator it = this.f83111a.values().iterator();
        while (it.hasNext()) {
            c((v) it.next(), false);
        }
        if (zIsEmpty) {
            return;
        }
        b();
    }

    public Set<Integer> getCheckedIds() {
        return new HashSet(this.f83112b);
    }

    public List<Integer> getCheckedIdsSortedByChildOrder(ViewGroup viewGroup) {
        Set<Integer> checkedIds = getCheckedIds();
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
            View childAt = viewGroup.getChildAt(i10);
            if ((childAt instanceof v) && checkedIds.contains(Integer.valueOf(childAt.getId()))) {
                arrayList.add(Integer.valueOf(childAt.getId()));
            }
        }
        return arrayList;
    }

    public int getSingleCheckedId() {
        if (!this.f83114d) {
            return -1;
        }
        HashSet hashSet = this.f83112b;
        if (hashSet.isEmpty()) {
            return -1;
        }
        return ((Integer) hashSet.iterator().next()).intValue();
    }

    public boolean isSelectionRequired() {
        return this.f83115e;
    }

    public boolean isSingleSelection() {
        return this.f83114d;
    }

    public void removeCheckable(v vVar) {
        vVar.setInternalOnCheckedChangeListener(null);
        this.f83111a.remove(Integer.valueOf(vVar.getId()));
        this.f83112b.remove(Integer.valueOf(vVar.getId()));
    }

    public void setOnCheckedStateChangeListener(b bVar) {
        this.f83113c = bVar;
    }

    public void setSelectionRequired(boolean z10) {
        this.f83115e = z10;
    }

    public void setSingleSelection(boolean z10) {
        if (this.f83114d != z10) {
            this.f83114d = z10;
            clearCheck();
        }
    }

    public void uncheck(int i10) {
        v vVar = (v) this.f83111a.get(Integer.valueOf(i10));
        if (vVar != null && c(vVar, this.f83115e)) {
            b();
        }
    }
}
