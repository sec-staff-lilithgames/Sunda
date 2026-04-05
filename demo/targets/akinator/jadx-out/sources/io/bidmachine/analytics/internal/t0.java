package io.bidmachine.analytics.internal;

import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class t0 implements Comparable {

    /* renamed from: d, reason: collision with root package name */
    public static final a f60270d = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final int f60271a;

    /* renamed from: b, reason: collision with root package name */
    private final int f60272b;

    /* renamed from: c, reason: collision with root package name */
    private final int f60273c;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.u uVar) {
            this();
        }

        public final t0 a(String str) {
            Object objM7131constructorimpl;
            try {
                int i10 = tu.z.f87419c;
            } catch (Throwable th2) {
                int i11 = tu.z.f87419c;
                objM7131constructorimpl = tu.z.m7131constructorimpl(tu.a0.createFailure(th2));
            }
            if (sv.n0.isBlank(str)) {
                return null;
            }
            List listSplit$default = sv.n0.split$default((CharSequence) str, new String[]{"."}, false, 0, 6, (Object) null);
            if (listSplit$default.isEmpty()) {
                return null;
            }
            int size = listSplit$default.size();
            int i12 = 0;
            int i13 = 0;
            int i14 = 0;
            int i15 = 0;
            while (i12 < size && i12 <= 6) {
                if (i12 == 0) {
                    i13 = Integer.parseInt((String) listSplit$default.get(0));
                } else if (i12 != 1) {
                    i15 = i12 != 2 ? (i15 * 100) + Integer.parseInt((String) listSplit$default.get(i12)) : Integer.parseInt((String) listSplit$default.get(2));
                } else {
                    i14 = Integer.parseInt((String) listSplit$default.get(1));
                }
                i12++;
            }
            objM7131constructorimpl = tu.z.m7131constructorimpl(new t0(i13, i14, i15));
            return (t0) (tu.z.m7136isFailureimpl(objM7131constructorimpl) ? null : objM7131constructorimpl);
        }

        private a() {
        }
    }

    public t0(int i10, int i11, int i12) {
        this.f60271a = i10;
        this.f60272b = i11;
        this.f60273c = i12;
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(t0 t0Var) {
        int iCompare = kotlin.jvm.internal.e0.compare(this.f60271a, t0Var.f60271a);
        if (iCompare != 0) {
            return iCompare;
        }
        int iCompare2 = kotlin.jvm.internal.e0.compare(this.f60272b, t0Var.f60272b);
        return iCompare2 != 0 ? iCompare2 : kotlin.jvm.internal.e0.compare(this.f60273c, t0Var.f60273c);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t0)) {
            return false;
        }
        t0 t0Var = (t0) obj;
        return this.f60271a == t0Var.f60271a && this.f60272b == t0Var.f60272b && this.f60273c == t0Var.f60273c;
    }

    public int hashCode() {
        return Integer.hashCode(this.f60273c) + e3.g.d(this.f60272b, Integer.hashCode(this.f60271a) * 31, 31);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f60271a);
        sb2.append('.');
        sb2.append(this.f60272b);
        sb2.append('.');
        sb2.append(this.f60273c);
        return sb2.toString();
    }
}
