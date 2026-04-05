package androidx.window.embedding;

import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import m6.a;
import uu.y0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class ActivityRule extends EmbeddingRule {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f7421a;

    /* renamed from: b, reason: collision with root package name */
    public final Set f7422b;

    public /* synthetic */ ActivityRule(Set set, boolean z10, int i10, u uVar) {
        this(set, (i10 & 2) != 0 ? false : z10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ActivityRule)) {
            return false;
        }
        ActivityRule activityRule = (ActivityRule) obj;
        return e0.areEqual(this.f7422b, activityRule.f7422b) && this.f7421a == activityRule.f7421a;
    }

    public final boolean getAlwaysExpand() {
        return this.f7421a;
    }

    public final Set<a> getFilters() {
        return this.f7422b;
    }

    public int hashCode() {
        return Boolean.hashCode(this.f7421a) + (this.f7422b.hashCode() * 31);
    }

    public final ActivityRule plus$window_release(a filter) {
        e0.checkNotNullParameter(filter, "filter");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.addAll(this.f7422b);
        linkedHashSet.add(filter);
        return new ActivityRule(y0.toSet(linkedHashSet), this.f7421a);
    }

    public ActivityRule(Set<a> filters, boolean z10) {
        e0.checkNotNullParameter(filters, "filters");
        this.f7421a = z10;
        this.f7422b = y0.toSet(filters);
    }
}
