package pf;

import android.content.Context;
import android.os.Bundle;
import com.google.android.exoplayer2.util.n1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import mh.g1;
import nh.b5;
import nh.l6;
import nh.m5;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class s implements com.google.android.exoplayer2.i {
    public static final s C = new r().build();
    public static final String D = n1.intToStringMaxRadix(1);
    public static final String E = n1.intToStringMaxRadix(2);
    public static final String F = n1.intToStringMaxRadix(3);
    public static final String G = n1.intToStringMaxRadix(4);
    public static final String H = n1.intToStringMaxRadix(5);
    public static final String I = n1.intToStringMaxRadix(6);
    public static final String J = n1.intToStringMaxRadix(7);
    public static final String K = n1.intToStringMaxRadix(8);
    public static final String L = n1.intToStringMaxRadix(9);
    public static final String M = n1.intToStringMaxRadix(10);
    public static final String N = n1.intToStringMaxRadix(11);
    public static final String O = n1.intToStringMaxRadix(12);
    public static final String P = n1.intToStringMaxRadix(13);
    public static final String Q = n1.intToStringMaxRadix(14);
    public static final String R = n1.intToStringMaxRadix(15);
    public static final String S = n1.intToStringMaxRadix(16);
    public static final String T = n1.intToStringMaxRadix(17);
    public static final String U = n1.intToStringMaxRadix(18);
    public static final String V = n1.intToStringMaxRadix(19);
    public static final String W = n1.intToStringMaxRadix(20);
    public static final String X = n1.intToStringMaxRadix(21);
    public static final String Y = n1.intToStringMaxRadix(22);
    public static final String Z = n1.intToStringMaxRadix(23);

    /* renamed from: a0, reason: collision with root package name */
    public static final String f81165a0 = n1.intToStringMaxRadix(24);

    /* renamed from: b0, reason: collision with root package name */
    public static final String f81166b0 = n1.intToStringMaxRadix(25);

    /* renamed from: c0, reason: collision with root package name */
    public static final String f81167c0 = n1.intToStringMaxRadix(26);
    public final m5 A;
    public final l6 B;

    /* renamed from: b, reason: collision with root package name */
    public final int f81168b;

    /* renamed from: c, reason: collision with root package name */
    public final int f81169c;

    /* renamed from: e, reason: collision with root package name */
    public final int f81170e;

    /* renamed from: f, reason: collision with root package name */
    public final int f81171f;

    /* renamed from: g, reason: collision with root package name */
    public final int f81172g;

    /* renamed from: h, reason: collision with root package name */
    public final int f81173h;

    /* renamed from: i, reason: collision with root package name */
    public final int f81174i;

    /* renamed from: j, reason: collision with root package name */
    public final int f81175j;

    /* renamed from: k, reason: collision with root package name */
    public final int f81176k;

    /* renamed from: l, reason: collision with root package name */
    public final int f81177l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f81178m;

    /* renamed from: n, reason: collision with root package name */
    public final b5 f81179n;

    /* renamed from: o, reason: collision with root package name */
    public final int f81180o;

    /* renamed from: p, reason: collision with root package name */
    public final b5 f81181p;

    /* renamed from: q, reason: collision with root package name */
    public final int f81182q;

    /* renamed from: r, reason: collision with root package name */
    public final int f81183r;

    /* renamed from: s, reason: collision with root package name */
    public final int f81184s;

    /* renamed from: t, reason: collision with root package name */
    public final b5 f81185t;

    /* renamed from: u, reason: collision with root package name */
    public final b5 f81186u;

    /* renamed from: v, reason: collision with root package name */
    public final int f81187v;

    /* renamed from: w, reason: collision with root package name */
    public final int f81188w;

    /* renamed from: x, reason: collision with root package name */
    public final boolean f81189x;

    /* renamed from: y, reason: collision with root package name */
    public final boolean f81190y;

    /* renamed from: z, reason: collision with root package name */
    public final boolean f81191z;

    public s(r rVar) {
        this.f81168b = rVar.f81139a;
        this.f81169c = rVar.f81140b;
        this.f81170e = rVar.f81141c;
        this.f81171f = rVar.f81142d;
        this.f81172g = rVar.f81143e;
        this.f81173h = rVar.f81144f;
        this.f81174i = rVar.f81145g;
        this.f81175j = rVar.f81146h;
        this.f81176k = rVar.f81147i;
        this.f81177l = rVar.f81148j;
        this.f81178m = rVar.f81149k;
        this.f81179n = rVar.f81150l;
        this.f81180o = rVar.f81151m;
        this.f81181p = rVar.f81152n;
        this.f81182q = rVar.f81153o;
        this.f81183r = rVar.f81154p;
        this.f81184s = rVar.f81155q;
        this.f81185t = rVar.f81156r;
        this.f81186u = rVar.f81157s;
        this.f81187v = rVar.f81158t;
        this.f81188w = rVar.f81159u;
        this.f81189x = rVar.f81160v;
        this.f81190y = rVar.f81161w;
        this.f81191z = rVar.f81162x;
        this.A = m5.copyOf((Map) rVar.f81163y);
        this.B = l6.copyOf((Collection) rVar.f81164z);
    }

    public static s fromBundle(Bundle bundle) {
        r rVar = new r();
        s sVar = C;
        rVar.f81139a = bundle.getInt(I, sVar.f81168b);
        rVar.f81140b = bundle.getInt(J, sVar.f81169c);
        rVar.f81141c = bundle.getInt(K, sVar.f81170e);
        rVar.f81142d = bundle.getInt(L, sVar.f81171f);
        rVar.f81143e = bundle.getInt(M, sVar.f81172g);
        rVar.f81144f = bundle.getInt(N, sVar.f81173h);
        rVar.f81145g = bundle.getInt(O, sVar.f81174i);
        rVar.f81146h = bundle.getInt(P, sVar.f81175j);
        rVar.f81147i = bundle.getInt(Q, sVar.f81176k);
        rVar.f81148j = bundle.getInt(R, sVar.f81177l);
        rVar.f81149k = bundle.getBoolean(S, sVar.f81178m);
        rVar.f81150l = b5.copyOf((String[]) g1.firstNonNull(bundle.getStringArray(T), new String[0]));
        rVar.f81151m = bundle.getInt(f81166b0, sVar.f81180o);
        rVar.f81152n = r.b((String[]) g1.firstNonNull(bundle.getStringArray(D), new String[0]));
        rVar.f81153o = bundle.getInt(E, sVar.f81182q);
        rVar.f81154p = bundle.getInt(U, sVar.f81183r);
        rVar.f81155q = bundle.getInt(V, sVar.f81184s);
        rVar.f81156r = b5.copyOf((String[]) g1.firstNonNull(bundle.getStringArray(W), new String[0]));
        rVar.f81157s = r.b((String[]) g1.firstNonNull(bundle.getStringArray(F), new String[0]));
        rVar.f81158t = bundle.getInt(G, sVar.f81187v);
        rVar.f81159u = bundle.getInt(f81167c0, sVar.f81188w);
        rVar.f81160v = bundle.getBoolean(H, sVar.f81189x);
        rVar.f81161w = bundle.getBoolean(X, sVar.f81190y);
        rVar.f81162x = bundle.getBoolean(Y, sVar.f81191z);
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(Z);
        b5 b5VarOf = parcelableArrayList == null ? b5.of() : com.google.android.exoplayer2.util.c.fromBundleList(q.f81136g, parcelableArrayList);
        rVar.f81163y = new HashMap();
        for (int i10 = 0; i10 < b5VarOf.size(); i10++) {
            q qVar = (q) b5VarOf.get(i10);
            rVar.f81163y.put(qVar.f81137b, qVar);
        }
        int[] iArr = (int[]) g1.firstNonNull(bundle.getIntArray(f81165a0), new int[0]);
        rVar.f81164z = new HashSet();
        for (int i11 : iArr) {
            rVar.f81164z.add(Integer.valueOf(i11));
        }
        return rVar.build();
    }

    public static s getDefaults(Context context) {
        return new r(context).build();
    }

    public r buildUpon() {
        r rVar = new r();
        rVar.a(this);
        return rVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            s sVar = (s) obj;
            if (this.f81168b == sVar.f81168b && this.f81169c == sVar.f81169c && this.f81170e == sVar.f81170e && this.f81171f == sVar.f81171f && this.f81172g == sVar.f81172g && this.f81173h == sVar.f81173h && this.f81174i == sVar.f81174i && this.f81175j == sVar.f81175j && this.f81178m == sVar.f81178m && this.f81176k == sVar.f81176k && this.f81177l == sVar.f81177l && this.f81179n.equals(sVar.f81179n) && this.f81180o == sVar.f81180o && this.f81181p.equals(sVar.f81181p) && this.f81182q == sVar.f81182q && this.f81183r == sVar.f81183r && this.f81184s == sVar.f81184s && this.f81185t.equals(sVar.f81185t) && this.f81186u.equals(sVar.f81186u) && this.f81187v == sVar.f81187v && this.f81188w == sVar.f81188w && this.f81189x == sVar.f81189x && this.f81190y == sVar.f81190y && this.f81191z == sVar.f81191z && this.A.equals(sVar.A) && this.B.equals(sVar.B)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return this.B.hashCode() + ((this.A.hashCode() + ((((((((((((this.f81186u.hashCode() + ((this.f81185t.hashCode() + ((((((((this.f81181p.hashCode() + ((((this.f81179n.hashCode() + ((((((((((((((((((((((this.f81168b + 31) * 31) + this.f81169c) * 31) + this.f81170e) * 31) + this.f81171f) * 31) + this.f81172g) * 31) + this.f81173h) * 31) + this.f81174i) * 31) + this.f81175j) * 31) + (this.f81178m ? 1 : 0)) * 31) + this.f81176k) * 31) + this.f81177l) * 31)) * 31) + this.f81180o) * 31)) * 31) + this.f81182q) * 31) + this.f81183r) * 31) + this.f81184s) * 31)) * 31)) * 31) + this.f81187v) * 31) + this.f81188w) * 31) + (this.f81189x ? 1 : 0)) * 31) + (this.f81190y ? 1 : 0)) * 31) + (this.f81191z ? 1 : 0)) * 31)) * 31);
    }

    @Override // com.google.android.exoplayer2.i
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putInt(I, this.f81168b);
        bundle.putInt(J, this.f81169c);
        bundle.putInt(K, this.f81170e);
        bundle.putInt(L, this.f81171f);
        bundle.putInt(M, this.f81172g);
        bundle.putInt(N, this.f81173h);
        bundle.putInt(O, this.f81174i);
        bundle.putInt(P, this.f81175j);
        bundle.putInt(Q, this.f81176k);
        bundle.putInt(R, this.f81177l);
        bundle.putBoolean(S, this.f81178m);
        bundle.putStringArray(T, (String[]) this.f81179n.toArray(new String[0]));
        bundle.putInt(f81166b0, this.f81180o);
        bundle.putStringArray(D, (String[]) this.f81181p.toArray(new String[0]));
        bundle.putInt(E, this.f81182q);
        bundle.putInt(U, this.f81183r);
        bundle.putInt(V, this.f81184s);
        bundle.putStringArray(W, (String[]) this.f81185t.toArray(new String[0]));
        bundle.putStringArray(F, (String[]) this.f81186u.toArray(new String[0]));
        bundle.putInt(G, this.f81187v);
        bundle.putInt(f81167c0, this.f81188w);
        bundle.putBoolean(H, this.f81189x);
        bundle.putBoolean(X, this.f81190y);
        bundle.putBoolean(Y, this.f81191z);
        bundle.putParcelableArrayList(Z, com.google.android.exoplayer2.util.c.toBundleArrayList(this.A.values()));
        bundle.putIntArray(f81165a0, rh.w.toArray(this.B));
        return bundle;
    }
}
