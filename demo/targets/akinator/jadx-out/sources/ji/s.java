package ji;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import ki.f2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class s {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f69614a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public final int f69615b;

    public s(int i10) {
        this.f69615b = i10;
    }

    public List<f2.e.d.AbstractC0731e> getReportRolloutsState() {
        List<r> rolloutAssignmentList = getRolloutAssignmentList();
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < rolloutAssignmentList.size(); i10++) {
            arrayList.add(rolloutAssignmentList.get(i10).toReportProto());
        }
        return arrayList;
    }

    public synchronized List<r> getRolloutAssignmentList() {
        return Collections.unmodifiableList(new ArrayList(this.f69614a));
    }

    public synchronized boolean updateRolloutAssignmentList(List<r> list) {
        this.f69614a.clear();
        if (list.size() <= this.f69615b) {
            return this.f69614a.addAll(list);
        }
        ei.f.getLogger().w("Ignored 0 entries when adding rollout assignments. Maximum allowable: " + this.f69615b);
        return this.f69614a.addAll(list.subList(0, this.f69615b));
    }
}
