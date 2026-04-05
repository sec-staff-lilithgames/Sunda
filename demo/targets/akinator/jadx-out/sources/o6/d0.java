package o6;

import android.text.TextUtils;
import androidx.work.ArrayCreatingInputMerger;
import androidx.work.impl.workers.CombineContinuationsWorker;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import n6.f0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class d0 extends n6.v0 {

    /* renamed from: j, reason: collision with root package name */
    public static final String f77875j = n6.c0.tagWithPrefix("WorkContinuationImpl");

    /* renamed from: a, reason: collision with root package name */
    public final y0 f77876a;

    /* renamed from: b, reason: collision with root package name */
    public final String f77877b;

    /* renamed from: c, reason: collision with root package name */
    public final n6.n f77878c;

    /* renamed from: d, reason: collision with root package name */
    public final List f77879d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f77880e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f77881f;

    /* renamed from: g, reason: collision with root package name */
    public final List f77882g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f77883h;

    /* renamed from: i, reason: collision with root package name */
    public n6.j0 f77884i;

    public d0(y0 y0Var, List<? extends n6.b1> list) {
        this(y0Var, null, n6.n.f75768c, list, null);
    }

    public static boolean b(d0 d0Var, HashSet hashSet) {
        hashSet.addAll(d0Var.getIds());
        Set<String> setPrerequisitesFor = prerequisitesFor(d0Var);
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            if (setPrerequisitesFor.contains((String) it.next())) {
                return true;
            }
        }
        List<d0> parents = d0Var.getParents();
        if (parents != null && !parents.isEmpty()) {
            Iterator<d0> it2 = parents.iterator();
            while (it2.hasNext()) {
                if (b(it2.next(), hashSet)) {
                    return true;
                }
            }
        }
        hashSet.removeAll(d0Var.getIds());
        return false;
    }

    public static Set<String> prerequisitesFor(d0 d0Var) {
        HashSet hashSet = new HashSet();
        List<d0> parents = d0Var.getParents();
        if (parents != null && !parents.isEmpty()) {
            Iterator<d0> it = parents.iterator();
            while (it.hasNext()) {
                hashSet.addAll(it.next().getIds());
            }
        }
        return hashSet;
    }

    @Override // n6.v0
    public final d0 a(List list) {
        n6.f0 f0Var = (n6.f0) new f0.a((Class<? extends n6.b0>) CombineContinuationsWorker.class).setInputMerger(ArrayCreatingInputMerger.class).build();
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add((d0) ((n6.v0) it.next()));
        }
        return new d0(this.f77876a, null, n6.n.f75768c, Collections.singletonList(f0Var), arrayList);
    }

    @Override // n6.v0
    public n6.j0 enqueue() {
        if (this.f77883h) {
            n6.c0.get().warning(f77875j, "Already enqueued work ids (" + TextUtils.join(", ", this.f77880e) + ")");
        } else {
            y0 y0Var = this.f77876a;
            this.f77884i = n6.n0.launchOperation(y0Var.getConfiguration().getTracer(), "EnqueueRunnable_" + getExistingWorkPolicy().name(), y0Var.getWorkTaskExecutor().getSerialTaskExecutor(), new a1.e(this, 29));
        }
        return this.f77884i;
    }

    public List<String> getAllIds() {
        return this.f77881f;
    }

    public n6.n getExistingWorkPolicy() {
        return this.f77878c;
    }

    public List<String> getIds() {
        return this.f77880e;
    }

    public String getName() {
        return this.f77877b;
    }

    public List<d0> getParents() {
        return this.f77882g;
    }

    public List<? extends n6.b1> getWork() {
        return this.f77879d;
    }

    @Override // n6.v0
    public sh.n1 getWorkInfos() {
        y0 y0Var = this.f77876a;
        return w6.a0.forStringIds(y0Var.getWorkDatabase(), y0Var.getWorkTaskExecutor(), this.f77881f);
    }

    @Override // n6.v0
    public androidx.lifecycle.l1 getWorkInfosLiveData() {
        y0 y0Var = this.f77876a;
        return w6.m.dedupedMappedLiveDataFor(y0Var.f77989d.workSpecDao().getWorkStatusPojoLiveDataForIds(this.f77881f), v6.b0.B, y0Var.f77990e);
    }

    public y0 getWorkManagerImpl() {
        return this.f77876a;
    }

    public boolean hasCycles() {
        return b(this, new HashSet());
    }

    public boolean isEnqueued() {
        return this.f77883h;
    }

    public void markEnqueued() {
        this.f77883h = true;
    }

    @Override // n6.v0
    public n6.v0 then(List<n6.f0> list) {
        if (list.isEmpty()) {
            return this;
        }
        return new d0(this.f77876a, this.f77877b, n6.n.f75768c, list, Collections.singletonList(this));
    }

    public d0(y0 y0Var, String str, n6.n nVar, List<? extends n6.b1> list) {
        this(y0Var, str, nVar, list, null);
    }

    public d0(y0 y0Var, String str, n6.n nVar, List<? extends n6.b1> list, List<d0> list2) {
        this.f77876a = y0Var;
        this.f77877b = str;
        this.f77878c = nVar;
        this.f77879d = list;
        this.f77882g = list2;
        this.f77880e = new ArrayList(list.size());
        this.f77881f = new ArrayList();
        if (list2 != null) {
            Iterator<d0> it = list2.iterator();
            while (it.hasNext()) {
                this.f77881f.addAll(it.next().f77881f);
            }
        }
        for (int i10 = 0; i10 < list.size(); i10++) {
            if (nVar == n6.n.f75767b && list.get(i10).getWorkSpec().getNextScheduleTimeOverride() != Long.MAX_VALUE) {
                throw new IllegalArgumentException("Next Schedule Time Override must be used with ExistingPeriodicWorkPolicyUPDATE (preferably) or KEEP");
            }
            String stringId = list.get(i10).getStringId();
            this.f77880e.add(stringId);
            this.f77881f.add(stringId);
        }
    }
}
