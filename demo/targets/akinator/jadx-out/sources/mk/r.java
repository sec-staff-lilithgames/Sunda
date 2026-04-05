package mk;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Comparator;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class r extends AbstractMap implements Serializable {

    /* renamed from: k, reason: collision with root package name */
    public static final k f74790k = new k();

    /* renamed from: b, reason: collision with root package name */
    public final Comparator f74791b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f74792c;

    /* renamed from: e, reason: collision with root package name */
    public q f74793e;

    /* renamed from: f, reason: collision with root package name */
    public int f74794f;

    /* renamed from: g, reason: collision with root package name */
    public int f74795g;

    /* renamed from: h, reason: collision with root package name */
    public final q f74796h;

    /* renamed from: i, reason: collision with root package name */
    public m f74797i;

    /* renamed from: j, reason: collision with root package name */
    public o f74798j;

    public r() {
        this(f74790k, true);
    }

    public final q a(Object obj, boolean z10) {
        int iCompareTo;
        q qVar;
        q qVar2 = this.f74793e;
        k kVar = f74790k;
        Comparator comparator = this.f74791b;
        if (qVar2 != null) {
            Comparable comparable = comparator == kVar ? (Comparable) obj : null;
            while (true) {
                Object obj2 = qVar2.f74786h;
                iCompareTo = comparable != null ? comparable.compareTo(obj2) : comparator.compare(obj, obj2);
                if (iCompareTo == 0) {
                    return qVar2;
                }
                q qVar3 = iCompareTo < 0 ? qVar2.f74782c : qVar2.f74783e;
                if (qVar3 == null) {
                    break;
                }
                qVar2 = qVar3;
            }
        } else {
            iCompareTo = 0;
        }
        q qVar4 = qVar2;
        if (!z10) {
            return null;
        }
        q qVar5 = this.f74796h;
        if (qVar4 != null) {
            qVar = new q(this.f74792c, qVar4, obj, qVar5, qVar5.f74785g);
            if (iCompareTo < 0) {
                qVar4.f74782c = qVar;
            } else {
                qVar4.f74783e = qVar;
            }
            b(qVar4, true);
        } else {
            if (comparator == kVar && !(obj instanceof Comparable)) {
                throw new ClassCastException(obj.getClass().getName().concat(" is not Comparable"));
            }
            qVar = new q(this.f74792c, qVar4, obj, qVar5, qVar5.f74785g);
            this.f74793e = qVar;
        }
        this.f74794f++;
        this.f74795g++;
        return qVar;
    }

    public final void b(q qVar, boolean z10) {
        while (qVar != null) {
            q qVar2 = qVar.f74782c;
            q qVar3 = qVar.f74783e;
            int i10 = qVar2 != null ? qVar2.f74789k : 0;
            int i11 = qVar3 != null ? qVar3.f74789k : 0;
            int i12 = i10 - i11;
            if (i12 == -2) {
                q qVar4 = qVar3.f74782c;
                q qVar5 = qVar3.f74783e;
                int i13 = (qVar4 != null ? qVar4.f74789k : 0) - (qVar5 != null ? qVar5.f74789k : 0);
                if (i13 == -1 || (i13 == 0 && !z10)) {
                    e(qVar);
                } else {
                    f(qVar3);
                    e(qVar);
                }
                if (z10) {
                    return;
                }
            } else if (i12 == 2) {
                q qVar6 = qVar2.f74782c;
                q qVar7 = qVar2.f74783e;
                int i14 = (qVar6 != null ? qVar6.f74789k : 0) - (qVar7 != null ? qVar7.f74789k : 0);
                if (i14 == 1 || (i14 == 0 && !z10)) {
                    f(qVar);
                } else {
                    e(qVar2);
                    f(qVar);
                }
                if (z10) {
                    return;
                }
            } else if (i12 == 0) {
                qVar.f74789k = i10 + 1;
                if (z10) {
                    return;
                }
            } else {
                qVar.f74789k = Math.max(i10, i11) + 1;
                if (!z10) {
                    return;
                }
            }
            qVar = qVar.f74781b;
        }
    }

    public final void c(q qVar, boolean z10) {
        int i10;
        if (z10) {
            q qVar2 = qVar.f74785g;
            qVar2.f74784f = qVar.f74784f;
            qVar.f74784f.f74785g = qVar2;
        }
        q qVar3 = qVar.f74782c;
        q qVar4 = qVar.f74783e;
        q qVar5 = qVar.f74781b;
        int i11 = 0;
        if (qVar3 == null || qVar4 == null) {
            if (qVar3 != null) {
                d(qVar, qVar3);
                qVar.f74782c = null;
            } else if (qVar4 != null) {
                d(qVar, qVar4);
                qVar.f74783e = null;
            } else {
                d(qVar, null);
            }
            b(qVar5, false);
            this.f74794f--;
            this.f74795g++;
            return;
        }
        q qVarLast = qVar3.f74789k > qVar4.f74789k ? qVar3.last() : qVar4.first();
        c(qVarLast, false);
        q qVar6 = qVar.f74782c;
        if (qVar6 != null) {
            i10 = qVar6.f74789k;
            qVarLast.f74782c = qVar6;
            qVar6.f74781b = qVarLast;
            qVar.f74782c = null;
        } else {
            i10 = 0;
        }
        q qVar7 = qVar.f74783e;
        if (qVar7 != null) {
            i11 = qVar7.f74789k;
            qVarLast.f74783e = qVar7;
            qVar7.f74781b = qVarLast;
            qVar.f74783e = null;
        }
        qVarLast.f74789k = Math.max(i10, i11) + 1;
        d(qVar, qVarLast);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        this.f74793e = null;
        this.f74794f = 0;
        this.f74795g++;
        q qVar = this.f74796h;
        qVar.f74785g = qVar;
        qVar.f74784f = qVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        q qVarA = null;
        if (obj != null) {
            try {
                qVarA = a(obj, false);
            } catch (ClassCastException unused) {
            }
        }
        return qVarA != null;
    }

    public final void d(q qVar, q qVar2) {
        q qVar3 = qVar.f74781b;
        qVar.f74781b = null;
        if (qVar2 != null) {
            qVar2.f74781b = qVar3;
        }
        if (qVar3 == null) {
            this.f74793e = qVar2;
        } else if (qVar3.f74782c == qVar) {
            qVar3.f74782c = qVar2;
        } else {
            qVar3.f74783e = qVar2;
        }
    }

    public final void e(q qVar) {
        q qVar2 = qVar.f74782c;
        q qVar3 = qVar.f74783e;
        q qVar4 = qVar3.f74782c;
        q qVar5 = qVar3.f74783e;
        qVar.f74783e = qVar4;
        if (qVar4 != null) {
            qVar4.f74781b = qVar;
        }
        d(qVar, qVar3);
        qVar3.f74782c = qVar;
        qVar.f74781b = qVar3;
        int iMax = Math.max(qVar2 != null ? qVar2.f74789k : 0, qVar4 != null ? qVar4.f74789k : 0) + 1;
        qVar.f74789k = iMax;
        qVar3.f74789k = Math.max(iMax, qVar5 != null ? qVar5.f74789k : 0) + 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<Object, Object>> entrySet() {
        m mVar = this.f74797i;
        if (mVar != null) {
            return mVar;
        }
        m mVar2 = new m(this);
        this.f74797i = mVar2;
        return mVar2;
    }

    public final void f(q qVar) {
        q qVar2 = qVar.f74782c;
        q qVar3 = qVar.f74783e;
        q qVar4 = qVar2.f74782c;
        q qVar5 = qVar2.f74783e;
        qVar.f74782c = qVar5;
        if (qVar5 != null) {
            qVar5.f74781b = qVar;
        }
        d(qVar, qVar2);
        qVar2.f74783e = qVar;
        qVar.f74781b = qVar2;
        int iMax = Math.max(qVar3 != null ? qVar3.f74789k : 0, qVar5 != null ? qVar5.f74789k : 0) + 1;
        qVar.f74789k = iMax;
        qVar2.f74789k = Math.max(iMax, qVar4 != null ? qVar4.f74789k : 0) + 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object get(Object obj) {
        q qVarA;
        if (obj != null) {
            try {
                qVarA = a(obj, false);
            } catch (ClassCastException unused) {
            }
        } else {
            qVarA = null;
        }
        if (qVarA != null) {
            return qVarA.f74788j;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Object> keySet() {
        o oVar = this.f74798j;
        if (oVar != null) {
            return oVar;
        }
        o oVar2 = new o(this);
        this.f74798j = oVar2;
        return oVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object put(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException("key == null");
        }
        if (obj2 == null && !this.f74792c) {
            throw new NullPointerException("value == null");
        }
        q qVarA = a(obj, true);
        Object obj3 = qVarA.f74788j;
        qVarA.f74788j = obj2;
        return obj3;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object remove(Object obj) {
        q qVarA;
        if (obj != null) {
            try {
                qVarA = a(obj, false);
            } catch (ClassCastException unused) {
            }
        } else {
            qVarA = null;
        }
        if (qVarA != null) {
            c(qVarA, true);
        }
        if (qVarA != null) {
            return qVarA.f74788j;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.f74794f;
    }

    public r(boolean z10) {
        this(f74790k, z10);
    }

    public r(Comparator<Object> comparator, boolean z10) {
        this.f74794f = 0;
        this.f74795g = 0;
        this.f74791b = comparator == null ? f74790k : comparator;
        this.f74792c = z10;
        this.f74796h = new q(z10);
    }
}
