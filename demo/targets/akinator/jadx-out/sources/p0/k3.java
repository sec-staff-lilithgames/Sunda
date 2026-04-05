package p0;

import androidx.core.app.NotificationCompat;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class k3 implements o4, i3 {

    /* renamed from: h, reason: collision with root package name */
    public static final a f80299h = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public m3 f80300a;

    /* renamed from: b, reason: collision with root package name */
    public int f80301b;

    /* renamed from: c, reason: collision with root package name */
    public b f80302c;

    /* renamed from: d, reason: collision with root package name */
    public kv.p f80303d;

    /* renamed from: e, reason: collision with root package name */
    public int f80304e;

    /* renamed from: f, reason: collision with root package name */
    public z.s0 f80305f;

    /* renamed from: g, reason: collision with root package name */
    public z.u0 f80306g;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public a(kotlin.jvm.internal.u uVar) {
        }

        public final void adoptAnchoredScopes$runtime(v4 v4Var, List<b> list, m3 m3Var) {
            List<b> list2 = list;
            if (list2.isEmpty()) {
                return;
            }
            int size = list2.size();
            for (int i10 = 0; i10 < size; i10++) {
                Object objSlot = v4Var.slot(list.get(i10), 0);
                k3 k3Var = objSlot instanceof k3 ? (k3) objSlot : null;
                if (k3Var != null) {
                    k3Var.adoptedBy(m3Var);
                }
            }
        }

        public final boolean hasAnchoredRecomposeScopes$runtime(s4 s4Var, List<b> list) {
            List<b> list2 = list;
            if (!list2.isEmpty()) {
                int size = list2.size();
                for (int i10 = 0; i10 < size; i10++) {
                    b bVar = list.get(i10);
                    if (s4Var.ownsAnchor(bVar) && (s4Var.slot$runtime(s4Var.anchorIndex(bVar), 0) instanceof k3)) {
                        return true;
                    }
                }
            }
            return false;
        }
    }

    public k3(m3 m3Var) {
        this.f80300a = m3Var;
    }

    public static boolean a(d1 d1Var, z.u0 u0Var) {
        kotlin.jvm.internal.e0.checkNotNull(d1Var, "null cannot be cast to non-null type androidx.compose.runtime.DerivedState<kotlin.Any?>");
        y4 policy = d1Var.getPolicy();
        if (policy == null) {
            policy = z4.structuralEqualityPolicy();
        }
        return !policy.equivalent(d1Var.getCurrentRecord().getCurrentValue(), u0Var.get(d1Var));
    }

    public final void adoptedBy(m3 m3Var) {
        this.f80300a = m3Var;
    }

    public final void b(boolean z10) {
        int i10 = this.f80301b;
        this.f80301b = z10 ? i10 | 32 : i10 & (-33);
    }

    public final void compose(w wVar) {
        kv.p pVar = this.f80303d;
        if (pVar == null) {
            throw new IllegalStateException("Invalid restart scope");
        }
        pVar.invoke(wVar, 1);
    }

    public final kv.l end(int i10) {
        z.s0 s0Var = this.f80305f;
        if (s0Var == null || getSkipped$runtime()) {
            return null;
        }
        Object[] objArr = s0Var.f96779b;
        int[] iArr = s0Var.f96780c;
        long[] jArr = s0Var.f96778a;
        int length = jArr.length - 2;
        if (length < 0) {
            return null;
        }
        int i11 = 0;
        while (true) {
            long j10 = jArr[i11];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i12 = 8 - ((~(i11 - length)) >>> 31);
                for (int i13 = 0; i13 < i12; i13++) {
                    if ((255 & j10) < 128) {
                        int i14 = (i11 << 3) + i13;
                        Object obj = objArr[i14];
                        if (iArr[i14] != i10) {
                            return new j3(this, i10, s0Var, 0);
                        }
                    }
                    j10 >>= 8;
                }
                if (i12 != 8) {
                    return null;
                }
            }
            if (i11 == length) {
                return null;
            }
            i11++;
        }
    }

    public final b getAnchor() {
        return this.f80302c;
    }

    public final boolean getCanRecompose() {
        return this.f80303d != null;
    }

    public final boolean getDefaultsInScope() {
        return (this.f80301b & 2) != 0;
    }

    public final boolean getDefaultsInvalid() {
        return (this.f80301b & 4) != 0;
    }

    public final boolean getForcedRecompose() {
        return (this.f80301b & 64) != 0;
    }

    public final m3 getOwner$runtime() {
        return this.f80300a;
    }

    public final boolean getPaused() {
        return (this.f80301b & NotificationCompat.FLAG_LOCAL_ONLY) != 0;
    }

    public final boolean getRequiresRecompose() {
        return (this.f80301b & 8) != 0;
    }

    public final boolean getResetReusing() {
        return (this.f80301b & 1024) != 0;
    }

    public final boolean getResuming() {
        return (this.f80301b & 512) != 0;
    }

    public final boolean getReusing() {
        return (this.f80301b & 128) != 0;
    }

    public final boolean getSkipped$runtime() {
        return (this.f80301b & 16) != 0;
    }

    public final boolean getUsed() {
        return (this.f80301b & 1) != 0;
    }

    public final boolean getValid() {
        if (this.f80300a != null) {
            b bVar = this.f80302c;
            if (bVar != null ? bVar.getValid() : false) {
                return true;
            }
        }
        return false;
    }

    @Override // p0.i3
    public void invalidate() {
        m3 m3Var = this.f80300a;
        if (m3Var != null) {
            m3Var.invalidate(this, null);
        }
    }

    public final t1 invalidateForResult(Object obj) {
        t1 t1VarInvalidate;
        m3 m3Var = this.f80300a;
        return (m3Var == null || (t1VarInvalidate = m3Var.invalidate(this, obj)) == null) ? t1.f80476b : t1VarInvalidate;
    }

    public final boolean isConditional() {
        return this.f80306g != null;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0068  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean isInvalidFor(java.lang.Object r15) {
        /*
            r14 = this;
            if (r15 != 0) goto L4
            goto L6e
        L4:
            z.u0 r0 = r14.f80306g
            if (r0 != 0) goto L9
            goto L6e
        L9:
            boolean r1 = r15 instanceof p0.d1
            if (r1 == 0) goto L14
            p0.d1 r15 = (p0.d1) r15
            boolean r15 = a(r15, r0)
            return r15
        L14:
            boolean r1 = r15 instanceof z.o1
            if (r1 == 0) goto L6e
            z.o1 r15 = (z.o1) r15
            boolean r1 = r15.isNotEmpty()
            r2 = 0
            if (r1 == 0) goto L6d
            java.lang.Object[] r1 = r15.f96888b
            long[] r15 = r15.f96887a
            int r3 = r15.length
            int r3 = r3 + (-2)
            if (r3 < 0) goto L6d
            r4 = r2
        L2b:
            r5 = r15[r4]
            long r7 = ~r5
            r9 = 7
            long r7 = r7 << r9
            long r7 = r7 & r5
            r9 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r7 = r7 & r9
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 == 0) goto L68
            int r7 = r4 - r3
            int r7 = ~r7
            int r7 = r7 >>> 31
            r8 = 8
            int r7 = 8 - r7
            r9 = r2
        L45:
            if (r9 >= r7) goto L66
            r10 = 255(0xff, double:1.26E-321)
            long r10 = r10 & r5
            r12 = 128(0x80, double:6.3E-322)
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 >= 0) goto L62
            int r10 = r4 << 3
            int r10 = r10 + r9
            r10 = r1[r10]
            boolean r11 = r10 instanceof p0.d1
            if (r11 == 0) goto L6e
            p0.d1 r10 = (p0.d1) r10
            boolean r10 = a(r10, r0)
            if (r10 == 0) goto L62
            goto L6e
        L62:
            long r5 = r5 >> r8
            int r9 = r9 + 1
            goto L45
        L66:
            if (r7 != r8) goto L6d
        L68:
            if (r4 == r3) goto L6d
            int r4 = r4 + 1
            goto L2b
        L6d:
            return r2
        L6e:
            r15 = 1
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: p0.k3.isInvalidFor(java.lang.Object):boolean");
    }

    public final void recordDerivedStateValue(d1 d1Var, Object obj) {
        z.u0 u0Var = this.f80306g;
        if (u0Var == null) {
            u0Var = new z.u0(0, 1, null);
            this.f80306g = u0Var;
        }
        u0Var.set(d1Var, obj);
    }

    public final boolean recordRead(Object obj) {
        int i10 = 0;
        if ((this.f80301b & 32) != 0) {
            return false;
        }
        z.s0 s0Var = this.f80305f;
        int i11 = 1;
        if (s0Var == null) {
            s0Var = new z.s0(i10, i11, null);
            this.f80305f = s0Var;
        }
        return s0Var.put(obj, this.f80304e, -1) == this.f80304e;
    }

    public final void release() {
        m3 m3Var = this.f80300a;
        if (m3Var != null) {
            m3Var.recomposeScopeReleased(this);
        }
        this.f80300a = null;
        this.f80305f = null;
        this.f80306g = null;
        this.f80303d = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void rereadTrackedInstances() {
        /*
            r17 = this;
            r1 = r17
            p0.m3 r0 = r1.f80300a
            if (r0 == 0) goto L60
            z.s0 r2 = r1.f80305f
            if (r2 == 0) goto L60
            r3 = 1
            r1.b(r3)
            r3 = 0
            java.lang.Object[] r4 = r2.f96779b     // Catch: java.lang.Throwable -> L4b
            int[] r5 = r2.f96780c     // Catch: java.lang.Throwable -> L4b
            long[] r2 = r2.f96778a     // Catch: java.lang.Throwable -> L4b
            int r6 = r2.length     // Catch: java.lang.Throwable -> L4b
            int r6 = r6 + (-2)
            if (r6 < 0) goto L58
            r7 = r3
        L1b:
            r8 = r2[r7]     // Catch: java.lang.Throwable -> L4b
            long r10 = ~r8     // Catch: java.lang.Throwable -> L4b
            r12 = 7
            long r10 = r10 << r12
            long r10 = r10 & r8
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r12
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 == 0) goto L53
            int r10 = r7 - r6
            int r10 = ~r10     // Catch: java.lang.Throwable -> L4b
            int r10 = r10 >>> 31
            r11 = 8
            int r10 = 8 - r10
            r12 = r3
        L35:
            if (r12 >= r10) goto L51
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r8
            r15 = 128(0x80, double:6.3E-322)
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 >= 0) goto L4d
            int r13 = r7 << 3
            int r13 = r13 + r12
            r14 = r4[r13]     // Catch: java.lang.Throwable -> L4b
            r13 = r5[r13]     // Catch: java.lang.Throwable -> L4b
            r0.recordReadOf(r14)     // Catch: java.lang.Throwable -> L4b
            goto L4d
        L4b:
            r0 = move-exception
            goto L5c
        L4d:
            long r8 = r8 >> r11
            int r12 = r12 + 1
            goto L35
        L51:
            if (r10 != r11) goto L58
        L53:
            if (r7 == r6) goto L58
            int r7 = r7 + 1
            goto L1b
        L58:
            r1.b(r3)
            return
        L5c:
            r1.b(r3)
            throw r0
        L60:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p0.k3.rereadTrackedInstances():void");
    }

    public final void scopeSkipped() {
        if (getReusing()) {
            return;
        }
        this.f80301b |= 16;
    }

    public final void setAnchor(b bVar) {
        this.f80302c = bVar;
    }

    public final void setDefaultsInScope(boolean z10) {
        int i10 = this.f80301b;
        this.f80301b = z10 ? i10 | 2 : i10 & (-3);
    }

    public final void setDefaultsInvalid(boolean z10) {
        int i10 = this.f80301b;
        this.f80301b = z10 ? i10 | 4 : i10 & (-5);
    }

    public final void setForcedRecompose(boolean z10) {
        int i10 = this.f80301b;
        this.f80301b = z10 ? i10 | 64 : i10 & (-65);
    }

    public final void setOwner$runtime(m3 m3Var) {
        this.f80300a = m3Var;
    }

    public final void setPaused(boolean z10) {
        int i10 = this.f80301b;
        this.f80301b = z10 ? i10 | NotificationCompat.FLAG_LOCAL_ONLY : i10 & (-257);
    }

    public final void setRequiresRecompose(boolean z10) {
        int i10 = this.f80301b;
        this.f80301b = z10 ? i10 | 8 : i10 & (-9);
    }

    public final void setResetReusing(boolean z10) {
        int i10 = this.f80301b;
        this.f80301b = z10 ? i10 | 1024 : i10 & (-1025);
    }

    public final void setResuming(boolean z10) {
        int i10 = this.f80301b;
        this.f80301b = z10 ? i10 | 512 : i10 & (-513);
    }

    public final void setReusing(boolean z10) {
        int i10 = this.f80301b;
        this.f80301b = z10 ? i10 | 128 : i10 & (-129);
    }

    public final void setUsed(boolean z10) {
        int i10 = this.f80301b;
        this.f80301b = z10 ? i10 | 1 : i10 & (-2);
    }

    public final void start(int i10) {
        this.f80304e = i10;
        this.f80301b &= -17;
    }

    @Override // p0.o4
    public void updateScope(kv.p pVar) {
        this.f80303d = pVar;
    }
}
