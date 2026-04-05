package xu;

import java.util.Comparator;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class h implements Comparator {

    /* renamed from: b, reason: collision with root package name */
    public final Comparator f93555b;

    public h(Comparator<Object> comparator) {
        e0.checkNotNullParameter(comparator, "comparator");
        this.f93555b = comparator;
    }

    @Override // java.util.Comparator
    public int compare(Object obj, Object obj2) {
        return this.f93555b.compare(obj2, obj);
    }

    public final Comparator<Object> getComparator() {
        return this.f93555b;
    }

    @Override // java.util.Comparator
    public final Comparator<Object> reversed() {
        return this.f93555b;
    }
}
