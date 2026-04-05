package d3;

import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import e3.s;
import io.ktor.http.ContentDisposition;
import j1.o2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class g {
    public int A;
    public int A0;
    public float B;
    public int B0;
    public boolean C;
    public boolean D;
    public int E;
    public float F;
    public int[] G;
    public float H;
    public boolean I;
    public boolean J;
    public boolean K;
    public int L;
    public int M;
    public final e N;
    public final e O;
    public final e P;
    public final e Q;
    public final e R;
    public final e S;
    public final e T;
    public final e U;
    public final e[] V;
    public final ArrayList W;
    public final boolean[] X;
    public f[] Y;
    public g Z;

    /* renamed from: a, reason: collision with root package name */
    public boolean f51771a;

    /* renamed from: a0, reason: collision with root package name */
    public int f51772a0;

    /* renamed from: b, reason: collision with root package name */
    public e3.d f51773b;

    /* renamed from: b0, reason: collision with root package name */
    public int f51774b0;

    /* renamed from: c, reason: collision with root package name */
    public e3.d f51775c;

    /* renamed from: c0, reason: collision with root package name */
    public float f51776c0;

    /* renamed from: d, reason: collision with root package name */
    public e3.n f51777d;

    /* renamed from: d0, reason: collision with root package name */
    public int f51778d0;

    /* renamed from: e, reason: collision with root package name */
    public e3.p f51779e;

    /* renamed from: e0, reason: collision with root package name */
    public int f51780e0;

    /* renamed from: f, reason: collision with root package name */
    public final boolean[] f51781f;

    /* renamed from: f0, reason: collision with root package name */
    public int f51782f0;

    /* renamed from: g, reason: collision with root package name */
    public boolean f51783g;

    /* renamed from: g0, reason: collision with root package name */
    public int f51784g0;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f51785h;

    /* renamed from: h0, reason: collision with root package name */
    public int f51786h0;

    /* renamed from: i, reason: collision with root package name */
    public int f51787i;

    /* renamed from: i0, reason: collision with root package name */
    public int f51788i0;

    /* renamed from: j, reason: collision with root package name */
    public int f51789j;

    /* renamed from: j0, reason: collision with root package name */
    public int f51790j0;

    /* renamed from: k, reason: collision with root package name */
    public final c3.f f51791k;

    /* renamed from: k0, reason: collision with root package name */
    public int f51792k0;

    /* renamed from: l, reason: collision with root package name */
    public String f51793l;

    /* renamed from: l0, reason: collision with root package name */
    public float f51794l0;

    /* renamed from: m, reason: collision with root package name */
    public boolean f51795m;

    /* renamed from: m0, reason: collision with root package name */
    public float f51796m0;

    /* renamed from: n, reason: collision with root package name */
    public boolean f51797n;

    /* renamed from: n0, reason: collision with root package name */
    public Object f51798n0;

    /* renamed from: o, reason: collision with root package name */
    public boolean f51799o;

    /* renamed from: o0, reason: collision with root package name */
    public int f51800o0;

    /* renamed from: p, reason: collision with root package name */
    public boolean f51801p;

    /* renamed from: p0, reason: collision with root package name */
    public int f51802p0;

    /* renamed from: q, reason: collision with root package name */
    public int f51803q;

    /* renamed from: q0, reason: collision with root package name */
    public boolean f51804q0;

    /* renamed from: r, reason: collision with root package name */
    public int f51805r;

    /* renamed from: r0, reason: collision with root package name */
    public String f51806r0;

    /* renamed from: s, reason: collision with root package name */
    public int f51807s;

    /* renamed from: s0, reason: collision with root package name */
    public String f51808s0;

    /* renamed from: t, reason: collision with root package name */
    public int f51809t;

    /* renamed from: t0, reason: collision with root package name */
    public int f51810t0;

    /* renamed from: u, reason: collision with root package name */
    public int f51811u;

    /* renamed from: u0, reason: collision with root package name */
    public int f51812u0;

    /* renamed from: v, reason: collision with root package name */
    public final int[] f51813v;

    /* renamed from: v0, reason: collision with root package name */
    public final float[] f51814v0;

    /* renamed from: w, reason: collision with root package name */
    public int f51815w;

    /* renamed from: w0, reason: collision with root package name */
    public final g[] f51816w0;

    /* renamed from: x, reason: collision with root package name */
    public int f51817x;

    /* renamed from: x0, reason: collision with root package name */
    public final g[] f51818x0;

    /* renamed from: y, reason: collision with root package name */
    public float f51819y;

    /* renamed from: y0, reason: collision with root package name */
    public g f51820y0;

    /* renamed from: z, reason: collision with root package name */
    public int f51821z;

    /* renamed from: z0, reason: collision with root package name */
    public g f51822z0;

    public g() {
        this.f51771a = false;
        this.f51777d = null;
        this.f51779e = null;
        this.f51781f = new boolean[]{true, true};
        this.f51783g = true;
        this.f51785h = true;
        this.f51787i = -1;
        this.f51789j = -1;
        this.f51791k = new c3.f(this);
        this.f51795m = false;
        this.f51797n = false;
        this.f51799o = false;
        this.f51801p = false;
        this.f51803q = -1;
        this.f51805r = -1;
        this.f51807s = 0;
        this.f51809t = 0;
        this.f51811u = 0;
        this.f51813v = new int[2];
        this.f51815w = 0;
        this.f51817x = 0;
        this.f51819y = 1.0f;
        this.f51821z = 0;
        this.A = 0;
        this.B = 1.0f;
        this.E = -1;
        this.F = 1.0f;
        this.G = new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE};
        this.H = Float.NaN;
        this.I = false;
        this.K = false;
        this.L = 0;
        this.M = 0;
        e eVar = new e(this, d.f51748b);
        this.N = eVar;
        e eVar2 = new e(this, d.f51749c);
        this.O = eVar2;
        e eVar3 = new e(this, d.f51750e);
        this.P = eVar3;
        e eVar4 = new e(this, d.f51751f);
        this.Q = eVar4;
        e eVar5 = new e(this, d.f51752g);
        this.R = eVar5;
        this.S = new e(this, d.f51754i);
        this.T = new e(this, d.f51755j);
        e eVar6 = new e(this, d.f51753h);
        this.U = eVar6;
        this.V = new e[]{eVar, eVar3, eVar2, eVar4, eVar5, eVar6};
        this.W = new ArrayList();
        this.X = new boolean[2];
        f fVar = f.f51766b;
        this.Y = new f[]{fVar, fVar};
        this.Z = null;
        this.f51772a0 = 0;
        this.f51774b0 = 0;
        this.f51776c0 = 0.0f;
        this.f51778d0 = -1;
        this.f51780e0 = 0;
        this.f51782f0 = 0;
        this.f51784g0 = 0;
        this.f51786h0 = 0;
        this.f51788i0 = 0;
        this.f51794l0 = 0.5f;
        this.f51796m0 = 0.5f;
        this.f51800o0 = 0;
        this.f51802p0 = 0;
        this.f51804q0 = false;
        this.f51806r0 = null;
        this.f51808s0 = null;
        this.f51810t0 = 0;
        this.f51812u0 = 0;
        this.f51814v0 = new float[]{-1.0f, -1.0f};
        this.f51816w0 = new g[]{null, null};
        this.f51818x0 = new g[]{null, null};
        this.f51820y0 = null;
        this.f51822z0 = null;
        this.A0 = -1;
        this.B0 = -1;
        a();
    }

    public static void c(StringBuilder sb2, String str, int i10, int i11, int i12, int i13, int i14, float f10, f fVar) {
        sb2.append(str);
        sb2.append(" :  {\n");
        String string = fVar.toString();
        if (!"FIXED".equals(string)) {
            com.google.android.gms.internal.play_billing.a.B(sb2, "      behavior", " :   ", string, ",\n");
        }
        g(i10, 0, "      size", sb2);
        g(i11, 0, "      min", sb2);
        g(i12, Integer.MAX_VALUE, "      max", sb2);
        g(i13, 0, "      matchMin", sb2);
        g(i14, 0, "      matchDef", sb2);
        h(sb2, "      matchPercent", f10, 1.0f);
        sb2.append("    },\n");
    }

    public static void d(StringBuilder sb2, String str, e eVar) {
        if (eVar.f51762f == null) {
            return;
        }
        w0.i.h(sb2, "    ", str, " : [ '");
        sb2.append(eVar.f51762f);
        sb2.append("'");
        if (eVar.f51764h != Integer.MIN_VALUE || eVar.f51763g != 0) {
            sb2.append(",");
            sb2.append(eVar.f51763g);
            if (eVar.f51764h != Integer.MIN_VALUE) {
                sb2.append(",");
                sb2.append(eVar.f51764h);
                sb2.append(",");
            }
        }
        sb2.append(" ] ,\n");
    }

    public static void f(StringBuilder sb2, String str, e eVar) {
        if (eVar.f51762f == null) {
            return;
        }
        sb2.append(str);
        sb2.append(" : [ '");
        sb2.append(eVar.f51762f);
        sb2.append("',");
        sb2.append(eVar.f51763g);
        sb2.append(",");
        sb2.append(eVar.f51764h);
        sb2.append(",");
        sb2.append(" ] ,\n");
    }

    public static void g(int i10, int i11, String str, StringBuilder sb2) {
        if (i10 == i11) {
            return;
        }
        sb2.append(str);
        sb2.append(" :   ");
        sb2.append(i10);
        sb2.append(",\n");
    }

    public static void h(StringBuilder sb2, String str, float f10, float f11) {
        if (f10 == f11) {
            return;
        }
        sb2.append(str);
        sb2.append(" :   ");
        sb2.append(f10);
        sb2.append(",\n");
    }

    public static void i(StringBuilder sb2, String str, float f10, int i10) {
        if (f10 == 0.0f) {
            return;
        }
        sb2.append(str);
        sb2.append(" :  [");
        sb2.append(f10);
        sb2.append(",");
        sb2.append(i10);
        sb2.append("");
        sb2.append("],\n");
    }

    public static void j(StringBuilder sb2, String str, int i10, int i11, int i12, int i13, int i14, int i15, float f10, float f11) {
        sb2.append(str);
        sb2.append(" :  {\n");
        g(i10, Integer.MIN_VALUE, ContentDisposition.Parameters.Size, sb2);
        g(i11, 0, "min", sb2);
        g(i12, Integer.MAX_VALUE, "max", sb2);
        g(i14, 0, "matchMin", sb2);
        g(i15, 0, "matchDef", sb2);
        g(i15, 1, "matchPercent", sb2);
        h(sb2, "matchConstraintPercent", f10, 1.0f);
        h(sb2, "weight", f11, 1.0f);
        g(i13, 1, "override", sb2);
        sb2.append("},\n");
    }

    public final void a() {
        e eVar = this.N;
        ArrayList arrayList = this.W;
        arrayList.add(eVar);
        arrayList.add(this.O);
        arrayList.add(this.P);
        arrayList.add(this.Q);
        arrayList.add(this.S);
        arrayList.add(this.T);
        arrayList.add(this.U);
        arrayList.add(this.R);
    }

    public void addChildrenToSolverByDependency(h hVar, x2.f fVar, HashSet<g> hashSet, int i10, boolean z10) {
        if (z10) {
            if (!hashSet.contains(this)) {
                return;
            }
            n.a(hVar, fVar, this);
            hashSet.remove(this);
            addToSolver(fVar, hVar.optimizeFor(64));
        }
        if (i10 == 0) {
            HashSet<e> dependents = this.N.getDependents();
            if (dependents != null) {
                Iterator<e> it = dependents.iterator();
                while (it.hasNext()) {
                    it.next().f51760d.addChildrenToSolverByDependency(hVar, fVar, hashSet, i10, true);
                }
            }
            HashSet<e> dependents2 = this.P.getDependents();
            if (dependents2 != null) {
                Iterator<e> it2 = dependents2.iterator();
                while (it2.hasNext()) {
                    it2.next().f51760d.addChildrenToSolverByDependency(hVar, fVar, hashSet, i10, true);
                }
                return;
            }
            return;
        }
        HashSet<e> dependents3 = this.O.getDependents();
        if (dependents3 != null) {
            Iterator<e> it3 = dependents3.iterator();
            while (it3.hasNext()) {
                it3.next().f51760d.addChildrenToSolverByDependency(hVar, fVar, hashSet, i10, true);
            }
        }
        HashSet<e> dependents4 = this.Q.getDependents();
        if (dependents4 != null) {
            Iterator<e> it4 = dependents4.iterator();
            while (it4.hasNext()) {
                it4.next().f51760d.addChildrenToSolverByDependency(hVar, fVar, hashSet, i10, true);
            }
        }
        HashSet<e> dependents5 = this.R.getDependents();
        if (dependents5 != null) {
            Iterator<e> it5 = dependents5.iterator();
            while (it5.hasNext()) {
                it5.next().f51760d.addChildrenToSolverByDependency(hVar, fVar, hashSet, i10, true);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0352  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x036e  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0379  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x037f  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0389  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0395  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x039b  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x039e  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x03a0  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x03b9  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0400  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x04a8  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x04fb  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x050d  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x050f  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x0512  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x054b  */
    /* JADX WARN: Removed duplicated region for block: B:334:0x05dc  */
    /* JADX WARN: Removed duplicated region for block: B:336:0x05e3  */
    /* JADX WARN: Removed duplicated region for block: B:339:0x05f9  */
    /* JADX WARN: Removed duplicated region for block: B:343:0x0612  */
    /* JADX WARN: Removed duplicated region for block: B:346:0x0635  */
    /* JADX WARN: Removed duplicated region for block: B:349:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0156  */
    /* JADX WARN: Type inference failed for: r12v11 */
    /* JADX WARN: Type inference failed for: r12v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r12v16 */
    /* JADX WARN: Type inference failed for: r12v17, types: [int] */
    /* JADX WARN: Type inference failed for: r12v21 */
    /* JADX WARN: Type inference failed for: r12v9 */
    /* JADX WARN: Type inference failed for: r13v15, types: [d3.h] */
    /* JADX WARN: Type inference failed for: r14v28 */
    /* JADX WARN: Type inference failed for: r14v29 */
    /* JADX WARN: Type inference failed for: r14v31 */
    /* JADX WARN: Type inference failed for: r14v32 */
    /* JADX WARN: Type inference failed for: r14v33, types: [boolean] */
    /* JADX WARN: Type inference failed for: r20v1 */
    /* JADX WARN: Type inference failed for: r20v11 */
    /* JADX WARN: Type inference failed for: r20v14 */
    /* JADX WARN: Type inference failed for: r20v15 */
    /* JADX WARN: Type inference failed for: r20v16 */
    /* JADX WARN: Type inference failed for: r27v10 */
    /* JADX WARN: Type inference failed for: r27v11 */
    /* JADX WARN: Type inference failed for: r27v4 */
    /* JADX WARN: Type inference failed for: r27v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r27v9 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v8, types: [boolean] */
    /* JADX WARN: Type inference failed for: r40v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r40v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r47v0 */
    /* JADX WARN: Type inference failed for: r47v1 */
    /* JADX WARN: Type inference failed for: r47v6 */
    /* JADX WARN: Type inference failed for: r55v0, types: [d3.g] */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void addToSolver(x2.f r56, boolean r57) {
        /*
            Method dump skipped, instructions count: 1601
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: d3.g.addToSolver(x2.f, boolean):void");
    }

    public boolean allowedInBarrier() {
        return this.f51802p0 != 8;
    }

    /* JADX WARN: Removed duplicated region for block: B:343:0x0558  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(x2.f r31, boolean r32, boolean r33, boolean r34, boolean r35, x2.n r36, x2.n r37, d3.f r38, boolean r39, d3.e r40, d3.e r41, int r42, int r43, int r44, int r45, float r46, boolean r47, boolean r48, boolean r49, boolean r50, boolean r51, int r52, int r53, int r54, int r55, float r56, boolean r57) {
        /*
            Method dump skipped, instructions count: 1376
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: d3.g.b(x2.f, boolean, boolean, boolean, boolean, x2.n, x2.n, d3.f, boolean, d3.e, d3.e, int, int, int, int, float, boolean, boolean, boolean, boolean, boolean, int, int, int, int, float, boolean):void");
    }

    public void connect(e eVar, e eVar2, int i10) {
        if (eVar.getOwner() == this) {
            connect(eVar.getType(), eVar2.getOwner(), eVar2.getType(), i10);
        }
    }

    public void connectCircularConstraint(g gVar, float f10, int i10) {
        d dVar = d.f51753h;
        immediateConnect(dVar, gVar, dVar, i10, 0);
        this.H = f10;
    }

    public void copy(g gVar, HashMap<g, g> map) {
        this.f51803q = gVar.f51803q;
        this.f51805r = gVar.f51805r;
        this.f51809t = gVar.f51809t;
        this.f51811u = gVar.f51811u;
        int[] iArr = gVar.f51813v;
        int i10 = iArr[0];
        int[] iArr2 = this.f51813v;
        iArr2[0] = i10;
        iArr2[1] = iArr[1];
        this.f51815w = gVar.f51815w;
        this.f51817x = gVar.f51817x;
        this.f51821z = gVar.f51821z;
        this.A = gVar.A;
        this.B = gVar.B;
        this.C = gVar.C;
        this.D = gVar.D;
        this.E = gVar.E;
        this.F = gVar.F;
        int[] iArr3 = gVar.G;
        this.G = Arrays.copyOf(iArr3, iArr3.length);
        this.H = gVar.H;
        this.I = gVar.I;
        this.J = gVar.J;
        this.N.reset();
        this.O.reset();
        this.P.reset();
        this.Q.reset();
        this.R.reset();
        this.S.reset();
        this.T.reset();
        this.U.reset();
        this.Y = (f[]) Arrays.copyOf(this.Y, 2);
        this.Z = this.Z == null ? null : map.get(gVar.Z);
        this.f51772a0 = gVar.f51772a0;
        this.f51774b0 = gVar.f51774b0;
        this.f51776c0 = gVar.f51776c0;
        this.f51778d0 = gVar.f51778d0;
        this.f51780e0 = gVar.f51780e0;
        this.f51782f0 = gVar.f51782f0;
        this.f51784g0 = gVar.f51784g0;
        this.f51786h0 = gVar.f51786h0;
        this.f51788i0 = gVar.f51788i0;
        this.f51790j0 = gVar.f51790j0;
        this.f51792k0 = gVar.f51792k0;
        this.f51794l0 = gVar.f51794l0;
        this.f51796m0 = gVar.f51796m0;
        this.f51798n0 = gVar.f51798n0;
        this.f51800o0 = gVar.f51800o0;
        this.f51802p0 = gVar.f51802p0;
        this.f51804q0 = gVar.f51804q0;
        this.f51806r0 = gVar.f51806r0;
        this.f51808s0 = gVar.f51808s0;
        this.f51810t0 = gVar.f51810t0;
        this.f51812u0 = gVar.f51812u0;
        float[] fArr = gVar.f51814v0;
        float f10 = fArr[0];
        float[] fArr2 = this.f51814v0;
        fArr2[0] = f10;
        fArr2[1] = fArr[1];
        g[] gVarArr = gVar.f51816w0;
        g gVar2 = gVarArr[0];
        g[] gVarArr2 = this.f51816w0;
        gVarArr2[0] = gVar2;
        gVarArr2[1] = gVarArr[1];
        g[] gVarArr3 = gVar.f51818x0;
        g gVar3 = gVarArr3[0];
        g[] gVarArr4 = this.f51818x0;
        gVarArr4[0] = gVar3;
        gVarArr4[1] = gVarArr3[1];
        g gVar4 = gVar.f51820y0;
        this.f51820y0 = gVar4 == null ? null : map.get(gVar4);
        g gVar5 = gVar.f51822z0;
        this.f51822z0 = gVar5 != null ? map.get(gVar5) : null;
    }

    public void createObjectVariables(x2.f fVar) {
        fVar.createObjectVariable(this.N);
        fVar.createObjectVariable(this.O);
        fVar.createObjectVariable(this.P);
        fVar.createObjectVariable(this.Q);
        if (this.f51788i0 > 0) {
            fVar.createObjectVariable(this.R);
        }
    }

    public final boolean e(int i10) {
        e eVar;
        e eVar2;
        int i11 = i10 * 2;
        e[] eVarArr = this.V;
        e eVar3 = eVarArr[i11];
        e eVar4 = eVar3.f51762f;
        return (eVar4 == null || eVar4.f51762f == eVar3 || (eVar2 = (eVar = eVarArr[i11 + 1]).f51762f) == null || eVar2.f51762f != eVar) ? false : true;
    }

    public void ensureMeasureRequested() {
        this.f51783g = true;
    }

    public void ensureWidgetRuns() {
        if (this.f51777d == null) {
            this.f51777d = new e3.n(this);
        }
        if (this.f51779e == null) {
            this.f51779e = new e3.p(this);
        }
    }

    public e getAnchor(d dVar) {
        switch (dVar.ordinal()) {
            case 0:
                return null;
            case 1:
                return this.N;
            case 2:
                return this.O;
            case 3:
                return this.P;
            case 4:
                return this.Q;
            case 5:
                return this.R;
            case 6:
                return this.U;
            case 7:
                return this.S;
            case 8:
                return this.T;
            default:
                throw new AssertionError(dVar.name());
        }
    }

    public ArrayList<e> getAnchors() {
        return this.W;
    }

    public int getBaselineDistance() {
        return this.f51788i0;
    }

    public float getBiasPercent(int i10) {
        if (i10 == 0) {
            return this.f51794l0;
        }
        if (i10 == 1) {
            return this.f51796m0;
        }
        return -1.0f;
    }

    public int getBottom() {
        return getY() + this.f51774b0;
    }

    public Object getCompanionWidget() {
        return this.f51798n0;
    }

    public int getContainerItemSkip() {
        return this.f51800o0;
    }

    public String getDebugName() {
        return this.f51806r0;
    }

    public f getDimensionBehaviour(int i10) {
        if (i10 == 0) {
            return getHorizontalDimensionBehaviour();
        }
        if (i10 == 1) {
            return getVerticalDimensionBehaviour();
        }
        return null;
    }

    public float getDimensionRatio() {
        return this.f51776c0;
    }

    public int getDimensionRatioSide() {
        return this.f51778d0;
    }

    public boolean getHasBaseline() {
        return this.I;
    }

    public int getHeight() {
        if (this.f51802p0 == 8) {
            return 0;
        }
        return this.f51774b0;
    }

    public float getHorizontalBiasPercent() {
        return this.f51794l0;
    }

    public g getHorizontalChainControlWidget() {
        if (!isInHorizontalChain()) {
            return null;
        }
        g gVar = this;
        g gVar2 = null;
        while (gVar2 == null && gVar != null) {
            e anchor = gVar.getAnchor(d.f51748b);
            e target = anchor == null ? null : anchor.getTarget();
            g owner = target == null ? null : target.getOwner();
            if (owner == getParent()) {
                return gVar;
            }
            e target2 = owner == null ? null : owner.getAnchor(d.f51750e).getTarget();
            if (target2 == null || target2.getOwner() == gVar) {
                gVar = owner;
            } else {
                gVar2 = gVar;
            }
        }
        return gVar2;
    }

    public int getHorizontalChainStyle() {
        return this.f51810t0;
    }

    public f getHorizontalDimensionBehaviour() {
        return this.Y[0];
    }

    public int getHorizontalMargin() {
        e eVar = this.N;
        int i10 = eVar != null ? eVar.f51763g : 0;
        e eVar2 = this.P;
        return eVar2 != null ? i10 + eVar2.f51763g : i10;
    }

    public int getLastHorizontalMeasureSpec() {
        return this.L;
    }

    public int getLastVerticalMeasureSpec() {
        return this.M;
    }

    public int getLeft() {
        return getX();
    }

    public int getLength(int i10) {
        if (i10 == 0) {
            return getWidth();
        }
        if (i10 == 1) {
            return getHeight();
        }
        return 0;
    }

    public int getMaxHeight() {
        return this.G[1];
    }

    public int getMaxWidth() {
        return this.G[0];
    }

    public int getMinHeight() {
        return this.f51792k0;
    }

    public int getMinWidth() {
        return this.f51790j0;
    }

    public g getNextChainMember(int i10) {
        e eVar;
        e eVar2;
        if (i10 != 0) {
            if (i10 == 1 && (eVar2 = (eVar = this.Q).f51762f) != null && eVar2.f51762f == eVar) {
                return eVar2.f51760d;
            }
            return null;
        }
        e eVar3 = this.P;
        e eVar4 = eVar3.f51762f;
        if (eVar4 == null || eVar4.f51762f != eVar3) {
            return null;
        }
        return eVar4.f51760d;
    }

    public int getOptimizerWrapHeight() {
        int iMax = this.f51774b0;
        if (this.Y[1] == f.f51768e) {
            if (this.f51811u == 1) {
                iMax = Math.max(this.f51821z, iMax);
            } else {
                iMax = this.f51821z;
                if (iMax > 0) {
                    this.f51774b0 = iMax;
                } else {
                    iMax = 0;
                }
            }
            int i10 = this.A;
            if (i10 > 0 && i10 < iMax) {
                return i10;
            }
        }
        return iMax;
    }

    public int getOptimizerWrapWidth() {
        int i10 = this.f51772a0;
        int iMax = 0;
        if (this.Y[0] != f.f51768e) {
            return i10;
        }
        if (this.f51809t == 1) {
            iMax = Math.max(this.f51815w, i10);
        } else {
            int i11 = this.f51815w;
            if (i11 > 0) {
                this.f51772a0 = i11;
                iMax = i11;
            }
        }
        int i12 = this.f51817x;
        return (i12 <= 0 || i12 >= iMax) ? iMax : i12;
    }

    public g getParent() {
        return this.Z;
    }

    public g getPreviousChainMember(int i10) {
        e eVar;
        e eVar2;
        if (i10 != 0) {
            if (i10 == 1 && (eVar2 = (eVar = this.O).f51762f) != null && eVar2.f51762f == eVar) {
                return eVar2.f51760d;
            }
            return null;
        }
        e eVar3 = this.N;
        e eVar4 = eVar3.f51762f;
        if (eVar4 == null || eVar4.f51762f != eVar3) {
            return null;
        }
        return eVar4.f51760d;
    }

    public int getRight() {
        return getX() + this.f51772a0;
    }

    public s getRun(int i10) {
        if (i10 == 0) {
            return this.f51777d;
        }
        if (i10 == 1) {
            return this.f51779e;
        }
        return null;
    }

    public void getSceneString(StringBuilder sb2) {
        sb2.append("  " + this.f51793l + ":{\n");
        StringBuilder sb3 = new StringBuilder("    actualWidth:");
        sb3.append(this.f51772a0);
        sb2.append(sb3.toString());
        sb2.append("\n");
        sb2.append("    actualHeight:" + this.f51774b0);
        sb2.append("\n");
        sb2.append("    actualLeft:" + this.f51780e0);
        sb2.append("\n");
        sb2.append("    actualTop:" + this.f51782f0);
        sb2.append("\n");
        d(sb2, TtmlNode.LEFT, this.N);
        d(sb2, "top", this.O);
        d(sb2, TtmlNode.RIGHT, this.P);
        d(sb2, "bottom", this.Q);
        d(sb2, "baseline", this.R);
        d(sb2, "centerX", this.S);
        d(sb2, "centerY", this.T);
        int i10 = this.f51772a0;
        int i11 = this.f51790j0;
        int i12 = this.G[0];
        int i13 = this.f51815w;
        int i14 = this.f51809t;
        float f10 = this.f51819y;
        f fVar = this.Y[0];
        float[] fArr = this.f51814v0;
        float f11 = fArr[0];
        c(sb2, "    width", i10, i11, i12, i13, i14, f10, fVar);
        int i15 = this.f51774b0;
        int i16 = this.f51792k0;
        int i17 = this.G[1];
        int i18 = this.f51821z;
        int i19 = this.f51811u;
        float f12 = this.B;
        f fVar2 = this.Y[1];
        float f13 = fArr[1];
        c(sb2, "    height", i15, i16, i17, i18, i19, f12, fVar2);
        i(sb2, "    dimensionRatio", this.f51776c0, this.f51778d0);
        h(sb2, "    horizontalBias", this.f51794l0, 0.5f);
        h(sb2, "    verticalBias", this.f51796m0, 0.5f);
        g(this.f51810t0, 0, "    horizontalChainStyle", sb2);
        g(this.f51812u0, 0, "    verticalChainStyle", sb2);
        sb2.append("  }");
    }

    public int getTop() {
        return getY();
    }

    public String getType() {
        return this.f51808s0;
    }

    public float getVerticalBiasPercent() {
        return this.f51796m0;
    }

    public g getVerticalChainControlWidget() {
        if (!isInVerticalChain()) {
            return null;
        }
        g gVar = this;
        g gVar2 = null;
        while (gVar2 == null && gVar != null) {
            e anchor = gVar.getAnchor(d.f51749c);
            e target = anchor == null ? null : anchor.getTarget();
            g owner = target == null ? null : target.getOwner();
            if (owner == getParent()) {
                return gVar;
            }
            e target2 = owner == null ? null : owner.getAnchor(d.f51751f).getTarget();
            if (target2 == null || target2.getOwner() == gVar) {
                gVar = owner;
            } else {
                gVar2 = gVar;
            }
        }
        return gVar2;
    }

    public int getVerticalChainStyle() {
        return this.f51812u0;
    }

    public f getVerticalDimensionBehaviour() {
        return this.Y[1];
    }

    public int getVerticalMargin() {
        int i10 = this.N != null ? this.O.f51763g : 0;
        return this.P != null ? i10 + this.Q.f51763g : i10;
    }

    public int getVisibility() {
        return this.f51802p0;
    }

    public int getWidth() {
        if (this.f51802p0 == 8) {
            return 0;
        }
        return this.f51772a0;
    }

    public int getWrapBehaviorInParent() {
        return this.f51807s;
    }

    public int getX() {
        g gVar = this.Z;
        return (gVar == null || !(gVar instanceof h)) ? this.f51780e0 : ((h) gVar).K0 + this.f51780e0;
    }

    public int getY() {
        g gVar = this.Z;
        return (gVar == null || !(gVar instanceof h)) ? this.f51782f0 : ((h) gVar).L0 + this.f51782f0;
    }

    public boolean hasBaseline() {
        return this.I;
    }

    public boolean hasDanglingDimension(int i10) {
        if (i10 == 0) {
            return (this.N.f51762f != null ? 1 : 0) + (this.P.f51762f != null ? 1 : 0) < 2;
        }
        return ((this.O.f51762f != null ? 1 : 0) + (this.Q.f51762f != null ? 1 : 0)) + (this.R.f51762f != null ? 1 : 0) < 2;
    }

    public boolean hasDependencies() {
        ArrayList arrayList = this.W;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (((e) arrayList.get(i10)).hasDependents()) {
                return true;
            }
        }
        return false;
    }

    public boolean hasDimensionOverride() {
        return (this.f51787i == -1 && this.f51789j == -1) ? false : true;
    }

    public boolean hasResolvedTargets(int i10, int i11) {
        e eVar;
        e eVar2;
        e eVar3;
        e eVar4;
        if (i10 == 0) {
            e eVar5 = this.N;
            e eVar6 = eVar5.f51762f;
            if (eVar6 != null && eVar6.hasFinalValue() && (eVar4 = (eVar3 = this.P).f51762f) != null && eVar4.hasFinalValue()) {
                return (eVar3.f51762f.getFinalValue() - eVar3.getMargin()) - (eVar5.getMargin() + eVar5.f51762f.getFinalValue()) >= i11;
            }
        } else {
            e eVar7 = this.O;
            e eVar8 = eVar7.f51762f;
            if (eVar8 != null && eVar8.hasFinalValue() && (eVar2 = (eVar = this.Q).f51762f) != null && eVar2.hasFinalValue()) {
                if ((eVar.f51762f.getFinalValue() - eVar.getMargin()) - (eVar7.getMargin() + eVar7.f51762f.getFinalValue()) >= i11) {
                    return true;
                }
            }
        }
        return false;
    }

    public void immediateConnect(d dVar, g gVar, d dVar2, int i10, int i11) {
        getAnchor(dVar).connect(gVar.getAnchor(dVar2), i10, i11, true);
    }

    public boolean isAnimated() {
        return this.f51804q0;
    }

    public boolean isHeightWrapContent() {
        return this.D;
    }

    public boolean isHorizontalSolvingPassDone() {
        return this.f51799o;
    }

    public boolean isInBarrier(int i10) {
        return this.X[i10];
    }

    public boolean isInHorizontalChain() {
        e eVar = this.N;
        e eVar2 = eVar.f51762f;
        if (eVar2 != null && eVar2.f51762f == eVar) {
            return true;
        }
        e eVar3 = this.P;
        e eVar4 = eVar3.f51762f;
        return eVar4 != null && eVar4.f51762f == eVar3;
    }

    public boolean isInPlaceholder() {
        return this.J;
    }

    public boolean isInVerticalChain() {
        e eVar = this.O;
        e eVar2 = eVar.f51762f;
        if (eVar2 != null && eVar2.f51762f == eVar) {
            return true;
        }
        e eVar3 = this.Q;
        e eVar4 = eVar3.f51762f;
        return eVar4 != null && eVar4.f51762f == eVar3;
    }

    public boolean isInVirtualLayout() {
        return this.K;
    }

    public boolean isMeasureRequested() {
        return this.f51783g && this.f51802p0 != 8;
    }

    public boolean isResolvedHorizontally() {
        if (this.f51795m) {
            return true;
        }
        return this.N.hasFinalValue() && this.P.hasFinalValue();
    }

    public boolean isResolvedVertically() {
        if (this.f51797n) {
            return true;
        }
        return this.O.hasFinalValue() && this.Q.hasFinalValue();
    }

    public boolean isRoot() {
        return this.Z == null;
    }

    public boolean isSpreadHeight() {
        return this.f51811u == 0 && this.f51776c0 == 0.0f && this.f51821z == 0 && this.A == 0 && this.Y[1] == f.f51768e;
    }

    public boolean isSpreadWidth() {
        return this.f51809t == 0 && this.f51776c0 == 0.0f && this.f51815w == 0 && this.f51817x == 0 && this.Y[0] == f.f51768e;
    }

    public boolean isVerticalSolvingPassDone() {
        return this.f51801p;
    }

    public boolean isWidthWrapContent() {
        return this.C;
    }

    public void markHorizontalSolvingPassDone() {
        this.f51799o = true;
    }

    public void markVerticalSolvingPassDone() {
        this.f51801p = true;
    }

    public boolean oppositeDimensionDependsOn(int i10) {
        char c10 = i10 == 0 ? (char) 1 : (char) 0;
        f[] fVarArr = this.Y;
        f fVar = fVarArr[i10];
        f fVar2 = fVarArr[c10];
        f fVar3 = f.f51768e;
        return fVar == fVar3 && fVar2 == fVar3;
    }

    public boolean oppositeDimensionsTied() {
        f[] fVarArr = this.Y;
        f fVar = fVarArr[0];
        f fVar2 = f.f51768e;
        return fVar == fVar2 && fVarArr[1] == fVar2;
    }

    public void reset() {
        this.N.reset();
        this.O.reset();
        this.P.reset();
        this.Q.reset();
        this.R.reset();
        this.S.reset();
        this.T.reset();
        this.U.reset();
        this.Z = null;
        this.H = Float.NaN;
        this.f51772a0 = 0;
        this.f51774b0 = 0;
        this.f51776c0 = 0.0f;
        this.f51778d0 = -1;
        this.f51780e0 = 0;
        this.f51782f0 = 0;
        this.f51784g0 = 0;
        this.f51786h0 = 0;
        this.f51788i0 = 0;
        this.f51790j0 = 0;
        this.f51792k0 = 0;
        this.f51794l0 = 0.5f;
        this.f51796m0 = 0.5f;
        f[] fVarArr = this.Y;
        f fVar = f.f51766b;
        fVarArr[0] = fVar;
        fVarArr[1] = fVar;
        this.f51798n0 = null;
        this.f51800o0 = 0;
        this.f51802p0 = 0;
        this.f51808s0 = null;
        this.f51810t0 = 0;
        this.f51812u0 = 0;
        float[] fArr = this.f51814v0;
        fArr[0] = -1.0f;
        fArr[1] = -1.0f;
        this.f51803q = -1;
        this.f51805r = -1;
        int[] iArr = this.G;
        iArr[0] = Integer.MAX_VALUE;
        iArr[1] = Integer.MAX_VALUE;
        this.f51809t = 0;
        this.f51811u = 0;
        this.f51819y = 1.0f;
        this.B = 1.0f;
        this.f51817x = Integer.MAX_VALUE;
        this.A = Integer.MAX_VALUE;
        this.f51815w = 0;
        this.f51821z = 0;
        this.E = -1;
        this.F = 1.0f;
        boolean[] zArr = this.f51781f;
        zArr[0] = true;
        zArr[1] = true;
        this.K = false;
        boolean[] zArr2 = this.X;
        zArr2[0] = false;
        zArr2[1] = false;
        this.f51783g = true;
        int[] iArr2 = this.f51813v;
        iArr2[0] = 0;
        iArr2[1] = 0;
        this.f51787i = -1;
        this.f51789j = -1;
    }

    public void resetAllConstraints() {
        resetAnchors();
        setVerticalBiasPercent(0.5f);
        setHorizontalBiasPercent(0.5f);
    }

    public void resetAnchor(e eVar) {
        if (getParent() != null && (getParent() instanceof h) && ((h) getParent()).handlesInternalConstraints()) {
            return;
        }
        e anchor = getAnchor(d.f51748b);
        e anchor2 = getAnchor(d.f51750e);
        e anchor3 = getAnchor(d.f51749c);
        e anchor4 = getAnchor(d.f51751f);
        e anchor5 = getAnchor(d.f51753h);
        e anchor6 = getAnchor(d.f51754i);
        e anchor7 = getAnchor(d.f51755j);
        if (eVar == anchor5) {
            if (anchor.isConnected() && anchor2.isConnected() && anchor.getTarget() == anchor2.getTarget()) {
                anchor.reset();
                anchor2.reset();
            }
            if (anchor3.isConnected() && anchor4.isConnected() && anchor3.getTarget() == anchor4.getTarget()) {
                anchor3.reset();
                anchor4.reset();
            }
            this.f51794l0 = 0.5f;
            this.f51796m0 = 0.5f;
        } else if (eVar == anchor6) {
            if (anchor.isConnected() && anchor2.isConnected() && anchor.getTarget().getOwner() == anchor2.getTarget().getOwner()) {
                anchor.reset();
                anchor2.reset();
            }
            this.f51794l0 = 0.5f;
        } else if (eVar == anchor7) {
            if (anchor3.isConnected() && anchor4.isConnected() && anchor3.getTarget().getOwner() == anchor4.getTarget().getOwner()) {
                anchor3.reset();
                anchor4.reset();
            }
            this.f51796m0 = 0.5f;
        } else if (eVar == anchor || eVar == anchor2) {
            if (anchor.isConnected() && anchor.getTarget() == anchor2.getTarget()) {
                anchor5.reset();
            }
        } else if ((eVar == anchor3 || eVar == anchor4) && anchor3.isConnected() && anchor3.getTarget() == anchor4.getTarget()) {
            anchor5.reset();
        }
        eVar.reset();
    }

    public void resetAnchors() {
        g parent = getParent();
        if (parent != null && (parent instanceof h) && ((h) getParent()).handlesInternalConstraints()) {
            return;
        }
        ArrayList arrayList = this.W;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((e) arrayList.get(i10)).reset();
        }
    }

    public void resetFinalResolution() {
        this.f51795m = false;
        this.f51797n = false;
        this.f51799o = false;
        this.f51801p = false;
        ArrayList arrayList = this.W;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((e) arrayList.get(i10)).resetFinalResolution();
        }
    }

    public void resetSolverVariables(x2.d dVar) {
        this.N.resetSolverVariable(dVar);
        this.O.resetSolverVariable(dVar);
        this.P.resetSolverVariable(dVar);
        this.Q.resetSolverVariable(dVar);
        this.R.resetSolverVariable(dVar);
        this.U.resetSolverVariable(dVar);
        this.S.resetSolverVariable(dVar);
        this.T.resetSolverVariable(dVar);
    }

    public void resetSolvingPassFlag() {
        this.f51799o = false;
        this.f51801p = false;
    }

    public StringBuilder serialize(StringBuilder sb2) {
        sb2.append("{\n");
        f(sb2, TtmlNode.LEFT, this.N);
        f(sb2, "top", this.O);
        f(sb2, TtmlNode.RIGHT, this.P);
        f(sb2, "bottom", this.Q);
        f(sb2, "baseline", this.R);
        f(sb2, "centerX", this.S);
        f(sb2, "centerY", this.T);
        float f10 = this.H;
        e eVar = this.U;
        if (eVar.f51762f != null && !Float.isNaN(f10)) {
            sb2.append("circle : [ '");
            sb2.append(eVar.f51762f);
            sb2.append("',");
            sb2.append(eVar.f51763g);
            sb2.append(",");
            sb2.append(f10);
            sb2.append(",");
            sb2.append(" ] ,\n");
        }
        int i10 = this.f51772a0;
        int i11 = this.f51790j0;
        int i12 = this.G[0];
        int i13 = this.f51787i;
        int i14 = this.f51815w;
        int i15 = this.f51809t;
        float f11 = this.f51819y;
        float[] fArr = this.f51814v0;
        j(sb2, "width", i10, i11, i12, i13, i14, i15, f11, fArr[0]);
        j(sb2, "height", this.f51774b0, this.f51792k0, this.G[1], this.f51789j, this.f51821z, this.f51811u, this.B, fArr[1]);
        i(sb2, "dimensionRatio", this.f51776c0, this.f51778d0);
        h(sb2, "horizontalBias", this.f51794l0, 0.5f);
        h(sb2, "verticalBias", this.f51796m0, 0.5f);
        sb2.append("}\n");
        return sb2;
    }

    public void setAnimated(boolean z10) {
        this.f51804q0 = z10;
    }

    public void setBaselineDistance(int i10) {
        this.f51788i0 = i10;
        this.I = i10 > 0;
    }

    public void setCompanionWidget(Object obj) {
        this.f51798n0 = obj;
    }

    public void setContainerItemSkip(int i10) {
        if (i10 >= 0) {
            this.f51800o0 = i10;
        } else {
            this.f51800o0 = 0;
        }
    }

    public void setDebugName(String str) {
        this.f51806r0 = str;
    }

    public void setDebugSolverName(x2.f fVar, String str) {
        this.f51806r0 = str;
        x2.n nVarCreateObjectVariable = fVar.createObjectVariable(this.N);
        x2.n nVarCreateObjectVariable2 = fVar.createObjectVariable(this.O);
        x2.n nVarCreateObjectVariable3 = fVar.createObjectVariable(this.P);
        x2.n nVarCreateObjectVariable4 = fVar.createObjectVariable(this.Q);
        nVarCreateObjectVariable.setName(str + ".left");
        nVarCreateObjectVariable2.setName(str + ".top");
        nVarCreateObjectVariable3.setName(str + ".right");
        nVarCreateObjectVariable4.setName(str + ".bottom");
        fVar.createObjectVariable(this.R).setName(str + ".baseline");
    }

    public void setDimension(int i10, int i11) {
        this.f51772a0 = i10;
        int i12 = this.f51790j0;
        if (i10 < i12) {
            this.f51772a0 = i12;
        }
        this.f51774b0 = i11;
        int i13 = this.f51792k0;
        if (i11 < i13) {
            this.f51774b0 = i13;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0086 A[PHI: r0
      0x0086: PHI (r0v2 int) = (r0v1 int), (r0v0 int), (r0v0 int), (r0v0 int), (r0v0 int), (r0v0 int) binds: [B:46:0x0086, B:36:0x007f, B:24:0x0051, B:26:0x0057, B:28:0x0063, B:30:0x0067] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x0086 -> B:40:0x0087). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setDimensionRatio(java.lang.String r9) {
        /*
            r8 = this;
            r0 = 0
            if (r9 == 0) goto L90
            int r1 = r9.length()
            if (r1 != 0) goto Lb
            goto L90
        Lb:
            int r1 = r9.length()
            r2 = 44
            int r2 = r9.indexOf(r2)
            r3 = 0
            r4 = 1
            r5 = -1
            if (r2 <= 0) goto L39
            int r6 = r1 + (-1)
            if (r2 >= r6) goto L39
            java.lang.String r6 = r9.substring(r3, r2)
            java.lang.String r7 = "W"
            boolean r7 = r6.equalsIgnoreCase(r7)
            if (r7 == 0) goto L2b
            goto L36
        L2b:
            java.lang.String r3 = "H"
            boolean r3 = r6.equalsIgnoreCase(r3)
            if (r3 == 0) goto L35
            r3 = r4
            goto L36
        L35:
            r3 = r5
        L36:
            int r2 = r2 + r4
            r5 = r3
            r3 = r2
        L39:
            r2 = 58
            int r2 = r9.indexOf(r2)
            if (r2 < 0) goto L77
            int r1 = r1 - r4
            if (r2 >= r1) goto L77
            java.lang.String r1 = r9.substring(r3, r2)
            int r2 = r2 + r4
            java.lang.String r9 = r9.substring(r2)
            int r2 = r1.length()
            if (r2 <= 0) goto L86
            int r2 = r9.length()
            if (r2 <= 0) goto L86
            float r1 = java.lang.Float.parseFloat(r1)     // Catch: java.lang.NumberFormatException -> L86
            float r9 = java.lang.Float.parseFloat(r9)     // Catch: java.lang.NumberFormatException -> L86
            int r2 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r2 <= 0) goto L86
            int r2 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r2 <= 0) goto L86
            if (r5 != r4) goto L71
            float r9 = r9 / r1
            float r9 = java.lang.Math.abs(r9)     // Catch: java.lang.NumberFormatException -> L86
            goto L87
        L71:
            float r1 = r1 / r9
            float r9 = java.lang.Math.abs(r1)     // Catch: java.lang.NumberFormatException -> L86
            goto L87
        L77:
            java.lang.String r9 = r9.substring(r3)
            int r1 = r9.length()
            if (r1 <= 0) goto L86
            float r9 = java.lang.Float.parseFloat(r9)     // Catch: java.lang.NumberFormatException -> L86
            goto L87
        L86:
            r9 = r0
        L87:
            int r0 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r0 <= 0) goto L8f
            r8.f51776c0 = r9
            r8.f51778d0 = r5
        L8f:
            return
        L90:
            r8.f51776c0 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: d3.g.setDimensionRatio(java.lang.String):void");
    }

    public void setFinalBaseline(int i10) {
        if (this.I) {
            int i11 = i10 - this.f51788i0;
            int i12 = this.f51774b0 + i11;
            this.f51782f0 = i11;
            this.O.setFinalValue(i11);
            this.Q.setFinalValue(i12);
            this.R.setFinalValue(i10);
            this.f51797n = true;
        }
    }

    public void setFinalFrame(int i10, int i11, int i12, int i13, int i14, int i15) {
        setFrame(i10, i11, i12, i13);
        setBaselineDistance(i14);
        if (i15 == 0) {
            this.f51795m = true;
            this.f51797n = false;
        } else if (i15 == 1) {
            this.f51795m = false;
            this.f51797n = true;
        } else if (i15 == 2) {
            this.f51795m = true;
            this.f51797n = true;
        } else {
            this.f51795m = false;
            this.f51797n = false;
        }
    }

    public void setFinalHorizontal(int i10, int i11) {
        if (this.f51795m) {
            return;
        }
        this.N.setFinalValue(i10);
        this.P.setFinalValue(i11);
        this.f51780e0 = i10;
        this.f51772a0 = i11 - i10;
        this.f51795m = true;
    }

    public void setFinalLeft(int i10) {
        this.N.setFinalValue(i10);
        this.f51780e0 = i10;
    }

    public void setFinalTop(int i10) {
        this.O.setFinalValue(i10);
        this.f51782f0 = i10;
    }

    public void setFinalVertical(int i10, int i11) {
        if (this.f51797n) {
            return;
        }
        this.O.setFinalValue(i10);
        this.Q.setFinalValue(i11);
        this.f51782f0 = i10;
        this.f51774b0 = i11 - i10;
        if (this.I) {
            this.R.setFinalValue(i10 + this.f51788i0);
        }
        this.f51797n = true;
    }

    public void setFrame(int i10, int i11, int i12, int i13) {
        int i14;
        int i15;
        int i16 = i12 - i10;
        int i17 = i13 - i11;
        this.f51780e0 = i10;
        this.f51782f0 = i11;
        if (this.f51802p0 == 8) {
            this.f51772a0 = 0;
            this.f51774b0 = 0;
            return;
        }
        f[] fVarArr = this.Y;
        f fVar = fVarArr[0];
        f fVar2 = f.f51766b;
        if (fVar == fVar2 && i16 < (i15 = this.f51772a0)) {
            i16 = i15;
        }
        if (fVarArr[1] == fVar2 && i17 < (i14 = this.f51774b0)) {
            i17 = i14;
        }
        this.f51772a0 = i16;
        this.f51774b0 = i17;
        int i18 = this.f51792k0;
        if (i17 < i18) {
            this.f51774b0 = i18;
        }
        int i19 = this.f51790j0;
        if (i16 < i19) {
            this.f51772a0 = i19;
        }
        int i20 = this.f51817x;
        f fVar3 = f.f51768e;
        if (i20 > 0 && fVar == fVar3) {
            this.f51772a0 = Math.min(this.f51772a0, i20);
        }
        int i21 = this.A;
        if (i21 > 0 && this.Y[1] == fVar3) {
            this.f51774b0 = Math.min(this.f51774b0, i21);
        }
        int i22 = this.f51772a0;
        if (i16 != i22) {
            this.f51787i = i22;
        }
        int i23 = this.f51774b0;
        if (i17 != i23) {
            this.f51789j = i23;
        }
    }

    public void setGoneMargin(d dVar, int i10) {
        int iOrdinal = dVar.ordinal();
        if (iOrdinal == 1) {
            this.N.f51764h = i10;
            return;
        }
        if (iOrdinal == 2) {
            this.O.f51764h = i10;
            return;
        }
        if (iOrdinal == 3) {
            this.P.f51764h = i10;
        } else if (iOrdinal == 4) {
            this.Q.f51764h = i10;
        } else {
            if (iOrdinal != 5) {
                return;
            }
            this.R.f51764h = i10;
        }
    }

    public void setHasBaseline(boolean z10) {
        this.I = z10;
    }

    public void setHeight(int i10) {
        this.f51774b0 = i10;
        int i11 = this.f51792k0;
        if (i10 < i11) {
            this.f51774b0 = i11;
        }
    }

    public void setHeightWrapContent(boolean z10) {
        this.D = z10;
    }

    public void setHorizontalBiasPercent(float f10) {
        this.f51794l0 = f10;
    }

    public void setHorizontalChainStyle(int i10) {
        this.f51810t0 = i10;
    }

    public void setHorizontalDimension(int i10, int i11) {
        this.f51780e0 = i10;
        int i12 = i11 - i10;
        this.f51772a0 = i12;
        int i13 = this.f51790j0;
        if (i12 < i13) {
            this.f51772a0 = i13;
        }
    }

    public void setHorizontalDimensionBehaviour(f fVar) {
        this.Y[0] = fVar;
    }

    public void setHorizontalMatchStyle(int i10, int i11, int i12, float f10) {
        this.f51809t = i10;
        this.f51815w = i11;
        if (i12 == Integer.MAX_VALUE) {
            i12 = 0;
        }
        this.f51817x = i12;
        this.f51819y = f10;
        if (f10 <= 0.0f || f10 >= 1.0f || i10 != 0) {
            return;
        }
        this.f51809t = 2;
    }

    public void setHorizontalWeight(float f10) {
        this.f51814v0[0] = f10;
    }

    public void setInPlaceholder(boolean z10) {
        this.J = z10;
    }

    public void setInVirtualLayout(boolean z10) {
        this.K = z10;
    }

    public void setLastMeasureSpec(int i10, int i11) {
        this.L = i10;
        this.M = i11;
        setMeasureRequested(false);
    }

    public void setLength(int i10, int i11) {
        if (i11 == 0) {
            setWidth(i10);
        } else if (i11 == 1) {
            setHeight(i10);
        }
    }

    public void setMaxHeight(int i10) {
        this.G[1] = i10;
    }

    public void setMaxWidth(int i10) {
        this.G[0] = i10;
    }

    public void setMeasureRequested(boolean z10) {
        this.f51783g = z10;
    }

    public void setMinHeight(int i10) {
        if (i10 < 0) {
            this.f51792k0 = 0;
        } else {
            this.f51792k0 = i10;
        }
    }

    public void setMinWidth(int i10) {
        if (i10 < 0) {
            this.f51790j0 = 0;
        } else {
            this.f51790j0 = i10;
        }
    }

    public void setOffset(int i10, int i11) {
        this.f51784g0 = i10;
        this.f51786h0 = i11;
    }

    public void setOrigin(int i10, int i11) {
        this.f51780e0 = i10;
        this.f51782f0 = i11;
    }

    public void setParent(g gVar) {
        this.Z = gVar;
    }

    public void setType(String str) {
        this.f51808s0 = str;
    }

    public void setVerticalBiasPercent(float f10) {
        this.f51796m0 = f10;
    }

    public void setVerticalChainStyle(int i10) {
        this.f51812u0 = i10;
    }

    public void setVerticalDimension(int i10, int i11) {
        this.f51782f0 = i10;
        int i12 = i11 - i10;
        this.f51774b0 = i12;
        int i13 = this.f51792k0;
        if (i12 < i13) {
            this.f51774b0 = i13;
        }
    }

    public void setVerticalDimensionBehaviour(f fVar) {
        this.Y[1] = fVar;
    }

    public void setVerticalMatchStyle(int i10, int i11, int i12, float f10) {
        this.f51811u = i10;
        this.f51821z = i11;
        if (i12 == Integer.MAX_VALUE) {
            i12 = 0;
        }
        this.A = i12;
        this.B = f10;
        if (f10 <= 0.0f || f10 >= 1.0f || i10 != 0) {
            return;
        }
        this.f51811u = 2;
    }

    public void setVerticalWeight(float f10) {
        this.f51814v0[1] = f10;
    }

    public void setVisibility(int i10) {
        this.f51802p0 = i10;
    }

    public void setWidth(int i10) {
        this.f51772a0 = i10;
        int i11 = this.f51790j0;
        if (i10 < i11) {
            this.f51772a0 = i11;
        }
    }

    public void setWidthWrapContent(boolean z10) {
        this.C = z10;
    }

    public void setWrapBehaviorInParent(int i10) {
        if (i10 < 0 || i10 > 3) {
            return;
        }
        this.f51807s = i10;
    }

    public void setX(int i10) {
        this.f51780e0 = i10;
    }

    public void setY(int i10) {
        this.f51782f0 = i10;
    }

    public void setupDimensionRatio(boolean z10, boolean z11, boolean z12, boolean z13) {
        if (this.E == -1) {
            if (z12 && !z13) {
                this.E = 0;
            } else if (!z12 && z13) {
                this.E = 1;
                if (this.f51778d0 == -1) {
                    this.F = 1.0f / this.F;
                }
            }
        }
        int i10 = this.E;
        e eVar = this.P;
        e eVar2 = this.N;
        e eVar3 = this.Q;
        e eVar4 = this.O;
        if (i10 == 0 && (!eVar4.isConnected() || !eVar3.isConnected())) {
            this.E = 1;
        } else if (this.E == 1 && (!eVar2.isConnected() || !eVar.isConnected())) {
            this.E = 0;
        }
        if (this.E == -1 && (!eVar4.isConnected() || !eVar3.isConnected() || !eVar2.isConnected() || !eVar.isConnected())) {
            if (eVar4.isConnected() && eVar3.isConnected()) {
                this.E = 0;
            } else if (eVar2.isConnected() && eVar.isConnected()) {
                this.F = 1.0f / this.F;
                this.E = 1;
            }
        }
        if (this.E == -1) {
            int i11 = this.f51815w;
            if (i11 > 0 && this.f51821z == 0) {
                this.E = 0;
            } else {
                if (i11 != 0 || this.f51821z <= 0) {
                    return;
                }
                this.F = 1.0f / this.F;
                this.E = 1;
            }
        }
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f51808s0 != null ? o2.o(new StringBuilder("type: "), this.f51808s0, " ") : "");
        sb2.append(this.f51806r0 != null ? o2.o(new StringBuilder("id: "), this.f51806r0, " ") : "");
        sb2.append("(");
        sb2.append(this.f51780e0);
        sb2.append(", ");
        sb2.append(this.f51782f0);
        sb2.append(") - (");
        sb2.append(this.f51772a0);
        sb2.append(" x ");
        return a.b.f(this.f51774b0, ")", sb2);
    }

    public void updateFromRuns(boolean z10, boolean z11) {
        int i10;
        int i11;
        boolean zIsResolved = z10 & this.f51777d.isResolved();
        boolean zIsResolved2 = z11 & this.f51779e.isResolved();
        e3.n nVar = this.f51777d;
        int i12 = nVar.f53702h.f53668g;
        e3.p pVar = this.f51779e;
        int i13 = pVar.f53702h.f53668g;
        int i14 = nVar.f53703i.f53668g;
        int i15 = pVar.f53703i.f53668g;
        int i16 = i15 - i13;
        if (i14 - i12 < 0 || i16 < 0 || i12 == Integer.MIN_VALUE || i12 == Integer.MAX_VALUE || i13 == Integer.MIN_VALUE || i13 == Integer.MAX_VALUE || i14 == Integer.MIN_VALUE || i14 == Integer.MAX_VALUE || i15 == Integer.MIN_VALUE || i15 == Integer.MAX_VALUE) {
            i14 = 0;
            i12 = 0;
            i15 = 0;
            i13 = 0;
        }
        int i17 = i14 - i12;
        int i18 = i15 - i13;
        if (zIsResolved) {
            this.f51780e0 = i12;
        }
        if (zIsResolved2) {
            this.f51782f0 = i13;
        }
        if (this.f51802p0 == 8) {
            this.f51772a0 = 0;
            this.f51774b0 = 0;
            return;
        }
        f fVar = f.f51766b;
        if (zIsResolved) {
            if (this.Y[0] == fVar && i17 < (i11 = this.f51772a0)) {
                i17 = i11;
            }
            this.f51772a0 = i17;
            int i19 = this.f51790j0;
            if (i17 < i19) {
                this.f51772a0 = i19;
            }
        }
        if (zIsResolved2) {
            if (this.Y[1] == fVar && i18 < (i10 = this.f51774b0)) {
                i18 = i10;
            }
            this.f51774b0 = i18;
            int i20 = this.f51792k0;
            if (i18 < i20) {
                this.f51774b0 = i20;
            }
        }
    }

    public void updateFromSolver(x2.f fVar, boolean z10) {
        e3.p pVar;
        e3.n nVar;
        int objectVariableValue = fVar.getObjectVariableValue(this.N);
        int objectVariableValue2 = fVar.getObjectVariableValue(this.O);
        int objectVariableValue3 = fVar.getObjectVariableValue(this.P);
        int objectVariableValue4 = fVar.getObjectVariableValue(this.Q);
        if (z10 && (nVar = this.f51777d) != null) {
            e3.h hVar = nVar.f53702h;
            if (hVar.f53671j) {
                e3.h hVar2 = nVar.f53703i;
                if (hVar2.f53671j) {
                    objectVariableValue = hVar.f53668g;
                    objectVariableValue3 = hVar2.f53668g;
                }
            }
        }
        if (z10 && (pVar = this.f51779e) != null) {
            e3.h hVar3 = pVar.f53702h;
            if (hVar3.f53671j) {
                e3.h hVar4 = pVar.f53703i;
                if (hVar4.f53671j) {
                    objectVariableValue2 = hVar3.f53668g;
                    objectVariableValue4 = hVar4.f53668g;
                }
            }
        }
        int i10 = objectVariableValue4 - objectVariableValue2;
        if (objectVariableValue3 - objectVariableValue < 0 || i10 < 0 || objectVariableValue == Integer.MIN_VALUE || objectVariableValue == Integer.MAX_VALUE || objectVariableValue2 == Integer.MIN_VALUE || objectVariableValue2 == Integer.MAX_VALUE || objectVariableValue3 == Integer.MIN_VALUE || objectVariableValue3 == Integer.MAX_VALUE || objectVariableValue4 == Integer.MIN_VALUE || objectVariableValue4 == Integer.MAX_VALUE) {
            objectVariableValue = 0;
            objectVariableValue4 = 0;
            objectVariableValue2 = 0;
            objectVariableValue3 = 0;
        }
        setFrame(objectVariableValue, objectVariableValue2, objectVariableValue3, objectVariableValue4);
    }

    public void connect(d dVar, g gVar, d dVar2) {
        connect(dVar, gVar, dVar2, 0);
    }

    public void connect(d dVar, g gVar, d dVar2, int i10) {
        boolean z10;
        d dVar3 = d.f51755j;
        d dVar4 = d.f51754i;
        d dVar5 = d.f51748b;
        d dVar6 = d.f51749c;
        d dVar7 = d.f51750e;
        d dVar8 = d.f51751f;
        d dVar9 = d.f51753h;
        if (dVar == dVar9) {
            if (dVar2 != dVar9) {
                if (dVar2 == dVar5 || dVar2 == dVar7) {
                    connect(dVar5, gVar, dVar2, 0);
                    connect(dVar7, gVar, dVar2, 0);
                    getAnchor(dVar9).connect(gVar.getAnchor(dVar2), 0);
                    return;
                } else {
                    if (dVar2 == dVar6 || dVar2 == dVar8) {
                        connect(dVar6, gVar, dVar2, 0);
                        connect(dVar8, gVar, dVar2, 0);
                        getAnchor(dVar9).connect(gVar.getAnchor(dVar2), 0);
                        return;
                    }
                    return;
                }
            }
            e anchor = getAnchor(dVar5);
            e anchor2 = getAnchor(dVar7);
            e anchor3 = getAnchor(dVar6);
            e anchor4 = getAnchor(dVar8);
            boolean z11 = true;
            if ((anchor == null || !anchor.isConnected()) && (anchor2 == null || !anchor2.isConnected())) {
                connect(dVar5, gVar, dVar5, 0);
                connect(dVar7, gVar, dVar7, 0);
                z10 = true;
            } else {
                z10 = false;
            }
            if ((anchor3 == null || !anchor3.isConnected()) && (anchor4 == null || !anchor4.isConnected())) {
                connect(dVar6, gVar, dVar6, 0);
                connect(dVar8, gVar, dVar8, 0);
            } else {
                z11 = false;
            }
            if (z10 && z11) {
                getAnchor(dVar9).connect(gVar.getAnchor(dVar9), 0);
                return;
            } else if (z10) {
                getAnchor(dVar4).connect(gVar.getAnchor(dVar4), 0);
                return;
            } else {
                if (z11) {
                    getAnchor(dVar3).connect(gVar.getAnchor(dVar3), 0);
                    return;
                }
                return;
            }
        }
        if (dVar == dVar4 && (dVar2 == dVar5 || dVar2 == dVar7)) {
            e anchor5 = getAnchor(dVar5);
            e anchor6 = gVar.getAnchor(dVar2);
            e anchor7 = getAnchor(dVar7);
            anchor5.connect(anchor6, 0);
            anchor7.connect(anchor6, 0);
            getAnchor(dVar4).connect(anchor6, 0);
            return;
        }
        if (dVar == dVar3 && (dVar2 == dVar6 || dVar2 == dVar8)) {
            e anchor8 = gVar.getAnchor(dVar2);
            getAnchor(dVar6).connect(anchor8, 0);
            getAnchor(dVar8).connect(anchor8, 0);
            getAnchor(dVar3).connect(anchor8, 0);
            return;
        }
        if (dVar == dVar4 && dVar2 == dVar4) {
            getAnchor(dVar5).connect(gVar.getAnchor(dVar5), 0);
            getAnchor(dVar7).connect(gVar.getAnchor(dVar7), 0);
            getAnchor(dVar4).connect(gVar.getAnchor(dVar2), 0);
            return;
        }
        if (dVar == dVar3 && dVar2 == dVar3) {
            getAnchor(dVar6).connect(gVar.getAnchor(dVar6), 0);
            getAnchor(dVar8).connect(gVar.getAnchor(dVar8), 0);
            getAnchor(dVar3).connect(gVar.getAnchor(dVar2), 0);
            return;
        }
        e anchor9 = getAnchor(dVar);
        e anchor10 = gVar.getAnchor(dVar2);
        if (anchor9.isValidConnection(anchor10)) {
            d dVar10 = d.f51752g;
            if (dVar == dVar10) {
                e anchor11 = getAnchor(dVar6);
                e anchor12 = getAnchor(dVar8);
                if (anchor11 != null) {
                    anchor11.reset();
                }
                if (anchor12 != null) {
                    anchor12.reset();
                }
            } else if (dVar == dVar6 || dVar == dVar8) {
                e anchor13 = getAnchor(dVar10);
                if (anchor13 != null) {
                    anchor13.reset();
                }
                e anchor14 = getAnchor(dVar9);
                if (anchor14.getTarget() != anchor10) {
                    anchor14.reset();
                }
                e opposite = getAnchor(dVar).getOpposite();
                e anchor15 = getAnchor(dVar3);
                if (anchor15.isConnected()) {
                    opposite.reset();
                    anchor15.reset();
                }
            } else if (dVar == dVar5 || dVar == dVar7) {
                e anchor16 = getAnchor(dVar9);
                if (anchor16.getTarget() != anchor10) {
                    anchor16.reset();
                }
                e opposite2 = getAnchor(dVar).getOpposite();
                e anchor17 = getAnchor(dVar4);
                if (anchor17.isConnected()) {
                    opposite2.reset();
                    anchor17.reset();
                }
            }
            anchor9.connect(anchor10, i10);
        }
    }

    public void setDimensionRatio(float f10, int i10) {
        this.f51776c0 = f10;
        this.f51778d0 = i10;
    }

    public void setFrame(int i10, int i11, int i12) {
        if (i12 == 0) {
            setHorizontalDimension(i10, i11);
        } else if (i12 == 1) {
            setVerticalDimension(i10, i11);
        }
    }

    public g(String str) {
        this.f51771a = false;
        this.f51777d = null;
        this.f51779e = null;
        this.f51781f = new boolean[]{true, true};
        this.f51783g = true;
        this.f51785h = true;
        this.f51787i = -1;
        this.f51789j = -1;
        this.f51791k = new c3.f(this);
        this.f51795m = false;
        this.f51797n = false;
        this.f51799o = false;
        this.f51801p = false;
        this.f51803q = -1;
        this.f51805r = -1;
        this.f51807s = 0;
        this.f51809t = 0;
        this.f51811u = 0;
        this.f51813v = new int[2];
        this.f51815w = 0;
        this.f51817x = 0;
        this.f51819y = 1.0f;
        this.f51821z = 0;
        this.A = 0;
        this.B = 1.0f;
        this.E = -1;
        this.F = 1.0f;
        this.G = new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE};
        this.H = Float.NaN;
        this.I = false;
        this.K = false;
        this.L = 0;
        this.M = 0;
        e eVar = new e(this, d.f51748b);
        this.N = eVar;
        e eVar2 = new e(this, d.f51749c);
        this.O = eVar2;
        e eVar3 = new e(this, d.f51750e);
        this.P = eVar3;
        e eVar4 = new e(this, d.f51751f);
        this.Q = eVar4;
        e eVar5 = new e(this, d.f51752g);
        this.R = eVar5;
        this.S = new e(this, d.f51754i);
        this.T = new e(this, d.f51755j);
        e eVar6 = new e(this, d.f51753h);
        this.U = eVar6;
        this.V = new e[]{eVar, eVar3, eVar2, eVar4, eVar5, eVar6};
        this.W = new ArrayList();
        this.X = new boolean[2];
        f fVar = f.f51766b;
        this.Y = new f[]{fVar, fVar};
        this.Z = null;
        this.f51772a0 = 0;
        this.f51774b0 = 0;
        this.f51776c0 = 0.0f;
        this.f51778d0 = -1;
        this.f51780e0 = 0;
        this.f51782f0 = 0;
        this.f51784g0 = 0;
        this.f51786h0 = 0;
        this.f51788i0 = 0;
        this.f51794l0 = 0.5f;
        this.f51796m0 = 0.5f;
        this.f51800o0 = 0;
        this.f51802p0 = 0;
        this.f51804q0 = false;
        this.f51806r0 = null;
        this.f51808s0 = null;
        this.f51810t0 = 0;
        this.f51812u0 = 0;
        this.f51814v0 = new float[]{-1.0f, -1.0f};
        this.f51816w0 = new g[]{null, null};
        this.f51818x0 = new g[]{null, null};
        this.f51820y0 = null;
        this.f51822z0 = null;
        this.A0 = -1;
        this.B0 = -1;
        a();
        setDebugName(str);
    }

    public g(int i10, int i11, int i12, int i13) {
        this.f51771a = false;
        this.f51777d = null;
        this.f51779e = null;
        this.f51781f = new boolean[]{true, true};
        this.f51783g = true;
        this.f51785h = true;
        this.f51787i = -1;
        this.f51789j = -1;
        this.f51791k = new c3.f(this);
        this.f51795m = false;
        this.f51797n = false;
        this.f51799o = false;
        this.f51801p = false;
        this.f51803q = -1;
        this.f51805r = -1;
        this.f51807s = 0;
        this.f51809t = 0;
        this.f51811u = 0;
        this.f51813v = new int[2];
        this.f51815w = 0;
        this.f51817x = 0;
        this.f51819y = 1.0f;
        this.f51821z = 0;
        this.A = 0;
        this.B = 1.0f;
        this.E = -1;
        this.F = 1.0f;
        this.G = new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE};
        this.H = Float.NaN;
        this.I = false;
        this.K = false;
        this.L = 0;
        this.M = 0;
        e eVar = new e(this, d.f51748b);
        this.N = eVar;
        e eVar2 = new e(this, d.f51749c);
        this.O = eVar2;
        e eVar3 = new e(this, d.f51750e);
        this.P = eVar3;
        e eVar4 = new e(this, d.f51751f);
        this.Q = eVar4;
        e eVar5 = new e(this, d.f51752g);
        this.R = eVar5;
        this.S = new e(this, d.f51754i);
        this.T = new e(this, d.f51755j);
        e eVar6 = new e(this, d.f51753h);
        this.U = eVar6;
        this.V = new e[]{eVar, eVar3, eVar2, eVar4, eVar5, eVar6};
        this.W = new ArrayList();
        this.X = new boolean[2];
        f fVar = f.f51766b;
        this.Y = new f[]{fVar, fVar};
        this.Z = null;
        this.f51776c0 = 0.0f;
        this.f51778d0 = -1;
        this.f51784g0 = 0;
        this.f51786h0 = 0;
        this.f51788i0 = 0;
        this.f51794l0 = 0.5f;
        this.f51796m0 = 0.5f;
        this.f51800o0 = 0;
        this.f51802p0 = 0;
        this.f51804q0 = false;
        this.f51806r0 = null;
        this.f51808s0 = null;
        this.f51810t0 = 0;
        this.f51812u0 = 0;
        this.f51814v0 = new float[]{-1.0f, -1.0f};
        this.f51816w0 = new g[]{null, null};
        this.f51818x0 = new g[]{null, null};
        this.f51820y0 = null;
        this.f51822z0 = null;
        this.A0 = -1;
        this.B0 = -1;
        this.f51780e0 = i10;
        this.f51782f0 = i11;
        this.f51772a0 = i12;
        this.f51774b0 = i13;
        a();
    }

    public g(String str, int i10, int i11, int i12, int i13) {
        this(i10, i11, i12, i13);
        setDebugName(str);
    }

    public g(int i10, int i11) {
        this(0, 0, i10, i11);
    }

    public g(String str, int i10, int i11) {
        this(i10, i11);
        setDebugName(str);
    }
}
