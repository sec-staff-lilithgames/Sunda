package bf;

import bf.x;
import com.google.android.exoplayer2.k3;
import com.google.android.exoplayer2.l3;
import com.google.android.exoplayer2.m3;
import com.google.android.exoplayer2.u1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class w extends q {

    /* renamed from: j, reason: collision with root package name */
    public static final Object f9460j = new Object();

    /* renamed from: h, reason: collision with root package name */
    public final Object f9461h;

    /* renamed from: i, reason: collision with root package name */
    public final Object f9462i;

    public w(m3 m3Var, Object obj, Object obj2) {
        super(m3Var);
        this.f9461h = obj;
        this.f9462i = obj2;
    }

    public static w createWithPlaceholderTimeline(u1 u1Var) {
        return new w(new x.a(u1Var), l3.f27640t, f9460j);
    }

    public static w createWithRealTimeline(m3 m3Var, Object obj, Object obj2) {
        return new w(m3Var, obj, obj2);
    }

    public w cloneWithUpdatedTimeline(m3 m3Var) {
        return new w(m3Var, this.f9461h, this.f9462i);
    }

    @Override // bf.q, com.google.android.exoplayer2.m3
    public int getIndexOfPeriod(Object obj) {
        Object obj2;
        if (f9460j.equals(obj) && (obj2 = this.f9462i) != null) {
            obj = obj2;
        }
        return this.f9378g.getIndexOfPeriod(obj);
    }

    @Override // bf.q, com.google.android.exoplayer2.m3
    public k3 getPeriod(int i10, k3 k3Var, boolean z10) {
        this.f9378g.getPeriod(i10, k3Var, z10);
        if (com.google.android.exoplayer2.util.n1.areEqual(k3Var.f27597c, this.f9462i) && z10) {
            k3Var.f27597c = f9460j;
        }
        return k3Var;
    }

    @Override // bf.q, com.google.android.exoplayer2.m3
    public Object getUidOfPeriod(int i10) {
        Object uidOfPeriod = this.f9378g.getUidOfPeriod(i10);
        return com.google.android.exoplayer2.util.n1.areEqual(uidOfPeriod, this.f9462i) ? f9460j : uidOfPeriod;
    }

    @Override // bf.q, com.google.android.exoplayer2.m3
    public l3 getWindow(int i10, l3 l3Var, long j10) {
        this.f9378g.getWindow(i10, l3Var, j10);
        if (com.google.android.exoplayer2.util.n1.areEqual(l3Var.f27647b, this.f9461h)) {
            l3Var.f27647b = l3.f27640t;
        }
        return l3Var;
    }
}
