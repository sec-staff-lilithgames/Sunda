package xu;

import java.util.Comparator;
import kv.l;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class c implements Comparator {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f93552b;

    public c(l lVar) {
        this.f93552b = lVar;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        l lVar = this.f93552b;
        return d.compareValues((Comparable) lVar.invoke(obj2), (Comparable) lVar.invoke(obj));
    }
}
