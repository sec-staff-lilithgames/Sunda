package br;

import java.util.List;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class j0 {

    /* renamed from: a, reason: collision with root package name */
    public final l0 f9879a;

    /* renamed from: b, reason: collision with root package name */
    public final String f9880b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f9881c;

    /* renamed from: d, reason: collision with root package name */
    public final List f9882d;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public a(kotlin.jvm.internal.u uVar) {
        }
    }

    static {
        new a(null);
    }

    public j0(l0 eventTaskType, String target, Object obj, List<String> stateGroups) {
        kotlin.jvm.internal.e0.checkNotNullParameter(eventTaskType, "eventTaskType");
        kotlin.jvm.internal.e0.checkNotNullParameter(target, "target");
        kotlin.jvm.internal.e0.checkNotNullParameter(stateGroups, "stateGroups");
        this.f9879a = eventTaskType;
        this.f9880b = target;
        this.f9881c = obj;
        this.f9882d = stateGroups;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ j0 copy$default(j0 j0Var, l0 l0Var, String str, Object obj, List list, int i10, Object obj2) {
        if ((i10 & 1) != 0) {
            l0Var = j0Var.f9879a;
        }
        if ((i10 & 2) != 0) {
            str = j0Var.f9880b;
        }
        if ((i10 & 4) != 0) {
            obj = j0Var.f9881c;
        }
        if ((i10 & 8) != 0) {
            list = j0Var.f9882d;
        }
        return j0Var.copy(l0Var, str, obj, list);
    }

    public final l0 component1() {
        return this.f9879a;
    }

    public final String component2() {
        return this.f9880b;
    }

    public final Object component3() {
        return this.f9881c;
    }

    public final List<String> component4() {
        return this.f9882d;
    }

    public final j0 copy(l0 eventTaskType, String target, Object obj, List<String> stateGroups) {
        kotlin.jvm.internal.e0.checkNotNullParameter(eventTaskType, "eventTaskType");
        kotlin.jvm.internal.e0.checkNotNullParameter(target, "target");
        kotlin.jvm.internal.e0.checkNotNullParameter(stateGroups, "stateGroups");
        return new j0(eventTaskType, target, obj, stateGroups);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j0)) {
            return false;
        }
        j0 j0Var = (j0) obj;
        return this.f9879a == j0Var.f9879a && kotlin.jvm.internal.e0.areEqual(this.f9880b, j0Var.f9880b) && kotlin.jvm.internal.e0.areEqual(this.f9881c, j0Var.f9881c) && kotlin.jvm.internal.e0.areEqual(this.f9882d, j0Var.f9882d);
    }

    public final l0 getEventTaskType() {
        return this.f9879a;
    }

    public final List<String> getStateGroups() {
        return this.f9882d;
    }

    public final String getTarget() {
        return this.f9880b;
    }

    public final Object getValue() {
        return this.f9881c;
    }

    public int hashCode() {
        int iE = o2.e(this.f9879a.hashCode() * 31, 31, this.f9880b);
        Object obj = this.f9881c;
        return this.f9882d.hashCode() + ((iE + (obj == null ? 0 : obj.hashCode())) * 31);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("EventTaskParams(eventTaskType=");
        sb2.append(this.f9879a);
        sb2.append(", target=");
        sb2.append(this.f9880b);
        sb2.append(", value=");
        sb2.append(this.f9881c);
        sb2.append(", stateGroups=");
        return j1.o2.p(sb2, this.f9882d, ')');
    }

    public /* synthetic */ j0(l0 l0Var, String str, Object obj, List list, int i10, kotlin.jvm.internal.u uVar) {
        this(l0Var, str, (i10 & 4) != 0 ? null : obj, (i10 & 8) != 0 ? uu.p0.emptyList() : list);
    }
}
