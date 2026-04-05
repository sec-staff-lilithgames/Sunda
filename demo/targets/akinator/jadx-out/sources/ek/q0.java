package ek;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class q0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f54614a;

    /* renamed from: b, reason: collision with root package name */
    public final int f54615b;

    /* renamed from: c, reason: collision with root package name */
    public final int f54616c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f54617d;

    public q0(String processName, int i10, int i11, boolean z10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(processName, "processName");
        this.f54614a = processName;
        this.f54615b = i10;
        this.f54616c = i11;
        this.f54617d = z10;
    }

    public static /* synthetic */ q0 copy$default(q0 q0Var, String str, int i10, int i11, boolean z10, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = q0Var.f54614a;
        }
        if ((i12 & 2) != 0) {
            i10 = q0Var.f54615b;
        }
        if ((i12 & 4) != 0) {
            i11 = q0Var.f54616c;
        }
        if ((i12 & 8) != 0) {
            z10 = q0Var.f54617d;
        }
        return q0Var.copy(str, i10, i11, z10);
    }

    public final String component1() {
        return this.f54614a;
    }

    public final int component2() {
        return this.f54615b;
    }

    public final int component3() {
        return this.f54616c;
    }

    public final boolean component4() {
        return this.f54617d;
    }

    public final q0 copy(String processName, int i10, int i11, boolean z10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(processName, "processName");
        return new q0(processName, i10, i11, z10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q0)) {
            return false;
        }
        q0 q0Var = (q0) obj;
        return kotlin.jvm.internal.e0.areEqual(this.f54614a, q0Var.f54614a) && this.f54615b == q0Var.f54615b && this.f54616c == q0Var.f54616c && this.f54617d == q0Var.f54617d;
    }

    public final int getImportance() {
        return this.f54616c;
    }

    public final int getPid() {
        return this.f54615b;
    }

    public final String getProcessName() {
        return this.f54614a;
    }

    public int hashCode() {
        return Boolean.hashCode(this.f54617d) + e3.g.d(this.f54616c, e3.g.d(this.f54615b, this.f54614a.hashCode() * 31, 31), 31);
    }

    public final boolean isDefaultProcess() {
        return this.f54617d;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("ProcessDetails(processName=");
        sb2.append(this.f54614a);
        sb2.append(", pid=");
        sb2.append(this.f54615b);
        sb2.append(", importance=");
        sb2.append(this.f54616c);
        sb2.append(", isDefaultProcess=");
        return a.b.p(sb2, this.f54617d, ')');
    }
}
