package p0;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class v4 {

    /* renamed from: y, reason: collision with root package name */
    public static final a f80540y = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public final s4 f80541a;

    /* renamed from: b, reason: collision with root package name */
    public int[] f80542b;

    /* renamed from: c, reason: collision with root package name */
    public Object[] f80543c;

    /* renamed from: d, reason: collision with root package name */
    public ArrayList f80544d;

    /* renamed from: e, reason: collision with root package name */
    public HashMap f80545e;

    /* renamed from: f, reason: collision with root package name */
    public z.j0 f80546f;

    /* renamed from: g, reason: collision with root package name */
    public int f80547g;

    /* renamed from: h, reason: collision with root package name */
    public int f80548h;

    /* renamed from: i, reason: collision with root package name */
    public int f80549i;

    /* renamed from: j, reason: collision with root package name */
    public int f80550j;

    /* renamed from: k, reason: collision with root package name */
    public int f80551k;

    /* renamed from: l, reason: collision with root package name */
    public int f80552l;

    /* renamed from: m, reason: collision with root package name */
    public int f80553m;

    /* renamed from: n, reason: collision with root package name */
    public int f80554n;

    /* renamed from: o, reason: collision with root package name */
    public int f80555o;

    /* renamed from: s, reason: collision with root package name */
    public z.j0 f80559s;

    /* renamed from: t, reason: collision with root package name */
    public int f80560t;

    /* renamed from: u, reason: collision with root package name */
    public int f80561u;

    /* renamed from: w, reason: collision with root package name */
    public boolean f80563w;

    /* renamed from: x, reason: collision with root package name */
    public z.i0 f80564x;

    /* renamed from: p, reason: collision with root package name */
    public final r1 f80556p = new r1();

    /* renamed from: q, reason: collision with root package name */
    public final r1 f80557q = new r1();

    /* renamed from: r, reason: collision with root package name */
    public final r1 f80558r = new r1();

    /* renamed from: v, reason: collision with root package name */
    public int f80562v = -1;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public a(kotlin.jvm.internal.u uVar) {
        }

        public static List a(v4 v4Var, int i10, v4 v4Var2, boolean z10, boolean z11, boolean z12) {
            boolean zP;
            List listEmptyList;
            int iGroupSize = v4Var.groupSize(i10);
            int i11 = i10 + iGroupSize;
            int iAccess$dataIndex = v4.access$dataIndex(v4Var, i10);
            int iAccess$dataIndex2 = v4.access$dataIndex(v4Var, i11);
            int i12 = iAccess$dataIndex2 - iAccess$dataIndex;
            boolean zAccess$containsAnyGroupMarks = v4.access$containsAnyGroupMarks(v4Var, i10);
            v4Var2.i(iGroupSize);
            v4Var2.j(i12, v4Var2.getCurrentGroup());
            if (v4Var.f80547g < i11) {
                v4Var.k(i11);
            }
            if (v4Var.f80551k < iAccess$dataIndex2) {
                v4Var.l(iAccess$dataIndex2, i11);
            }
            int[] iArr = v4Var2.f80542b;
            int currentGroup = v4Var2.getCurrentGroup();
            int i13 = currentGroup * 5;
            uu.f0.copyInto(v4Var.f80542b, iArr, i13, i10 * 5, i11 * 5);
            Object[] objArr = v4Var2.f80543c;
            int i14 = v4Var2.f80549i;
            System.arraycopy(v4Var.f80543c, iAccess$dataIndex, objArr, i14, i12);
            int parent = v4Var2.getParent();
            iArr[i13 + 2] = parent;
            int i15 = currentGroup - i10;
            int i16 = currentGroup + iGroupSize;
            int iAccess$dataIndex3 = i14 - v4.access$dataIndex(v4Var2, iArr, currentGroup);
            int i17 = v4Var2.f80553m;
            int i18 = v4Var2.f80552l;
            int length = objArr.length;
            int i19 = i17;
            int i20 = currentGroup;
            while (true) {
                zP = false;
                if (i20 >= i16) {
                    break;
                }
                if (i20 != currentGroup) {
                    int i21 = (i20 * 5) + 2;
                    iArr[i21] = iArr[i21] + i15;
                }
                int[] iArr2 = iArr;
                int i22 = currentGroup;
                iArr2[(i20 * 5) + 4] = v4.access$dataIndexToDataAnchor(v4Var2, v4.access$dataIndex(v4Var2, iArr, i20) + iAccess$dataIndex3, i19 >= i20 ? v4Var2.f80551k : 0, i18, length);
                if (i20 == i19) {
                    i19++;
                }
                i20++;
                currentGroup = i22;
                iArr = iArr2;
            }
            int[] iArr3 = iArr;
            v4Var2.f80553m = i19;
            int iAccess$locationOf = u4.access$locationOf(v4Var.f80544d, i10, v4Var.getSize$runtime());
            int iAccess$locationOf2 = u4.access$locationOf(v4Var.f80544d, i11, v4Var.getSize$runtime());
            if (iAccess$locationOf < iAccess$locationOf2) {
                ArrayList arrayList = v4Var.f80544d;
                ArrayList arrayList2 = new ArrayList(iAccess$locationOf2 - iAccess$locationOf);
                for (int i23 = iAccess$locationOf; i23 < iAccess$locationOf2; i23++) {
                    b bVar = (b) arrayList.get(i23);
                    bVar.setLocation$runtime(bVar.getLocation$runtime() + i15);
                    arrayList2.add(bVar);
                }
                v4Var2.f80544d.addAll(u4.access$locationOf(v4Var2.f80544d, v4Var2.getCurrentGroup(), v4Var2.getSize$runtime()), arrayList2);
                arrayList.subList(iAccess$locationOf, iAccess$locationOf2).clear();
                listEmptyList = arrayList2;
            } else {
                listEmptyList = uu.p0.emptyList();
            }
            List list = listEmptyList;
            if (!list.isEmpty()) {
                HashMap map = v4Var.f80545e;
                HashMap map2 = v4Var2.f80545e;
                if (map != null && map2 != null) {
                    int size = list.size();
                    for (int i24 = 0; i24 < size; i24++) {
                        b bVar2 = (b) listEmptyList.get(i24);
                        q1 q1Var = (q1) map.get(bVar2);
                        if (q1Var != null) {
                            map.remove(bVar2);
                            map2.put(bVar2, q1Var);
                        }
                    }
                }
            }
            int parent2 = v4Var2.getParent();
            q1 q1VarSourceInformationOf$runtime = v4Var2.sourceInformationOf$runtime(parent);
            if (q1VarSourceInformationOf$runtime != null) {
                int iAccess$groupSize = parent2 + 1;
                int currentGroup2 = v4Var2.getCurrentGroup();
                int i25 = -1;
                while (iAccess$groupSize < currentGroup2) {
                    i25 = iAccess$groupSize;
                    iAccess$groupSize = u4.access$groupSize(v4Var2.f80542b, iAccess$groupSize) + iAccess$groupSize;
                }
                q1VarSourceInformationOf$runtime.addGroupAfter(v4Var2, i25, currentGroup2);
            }
            int iParent = v4Var.parent(i10);
            if (z12) {
                if (z10) {
                    boolean z13 = iParent >= 0;
                    if (z13) {
                        v4Var.startGroup();
                        v4Var.advanceBy(iParent - v4Var.getCurrentGroup());
                        v4Var.startGroup();
                    }
                    v4Var.advanceBy(i10 - v4Var.getCurrentGroup());
                    boolean zRemoveGroup = v4Var.removeGroup();
                    if (z13) {
                        v4Var.skipToGroupEnd();
                        v4Var.endGroup();
                        v4Var.skipToGroupEnd();
                        v4Var.endGroup();
                    }
                    zP = zRemoveGroup;
                } else {
                    zP = v4Var.p(i10, iGroupSize);
                    v4Var.q(iAccess$dataIndex, i12, i10 - 1);
                }
            }
            if (zP) {
                d0.composeImmediateRuntimeError("Unexpectedly removed anchors");
            }
            int i26 = v4Var2.f80555o;
            int i27 = iArr3[i13 + 1];
            v4Var2.f80555o = i26 + ((1073741824 & i27) == 0 ? i27 & 67108863 : 1);
            if (z11) {
                v4Var2.f80560t = i16;
                v4Var2.f80549i = i14 + i12;
            }
            if (zAccess$containsAnyGroupMarks) {
                v4Var2.t(parent);
            }
            return listEmptyList;
        }

        public static final /* synthetic */ List access$moveGroup(a aVar, v4 v4Var, int i10, v4 v4Var2, boolean z10, boolean z11, boolean z12) {
            aVar.getClass();
            return a(v4Var, i10, v4Var2, z10, z11, z12);
        }
    }

    public v4(s4 s4Var) {
        this.f80541a = s4Var;
        this.f80542b = s4Var.getGroups();
        this.f80543c = s4Var.getSlots();
        this.f80544d = s4Var.getAnchors$runtime();
        this.f80545e = s4Var.getSourceInformationMap$runtime();
        this.f80546f = s4Var.getCalledByMap$runtime();
        this.f80547g = s4Var.getGroupsSize();
        this.f80548h = (this.f80542b.length / 5) - s4Var.getGroupsSize();
        this.f80551k = s4Var.getSlotsSize();
        this.f80552l = this.f80543c.length - s4Var.getSlotsSize();
        this.f80553m = s4Var.getGroupsSize();
        this.f80561u = s4Var.getGroupsSize();
    }

    public static final boolean access$containsAnyGroupMarks(v4 v4Var, int i10) {
        if (i10 >= 0) {
            return (v4Var.f80542b[(v4Var.g(i10) * 5) + 1] & 201326592) != 0;
        }
        v4Var.getClass();
        return false;
    }

    public static final /* synthetic */ int access$dataIndex(v4 v4Var, int[] iArr, int i10) {
        return v4Var.b(i10, iArr);
    }

    public static final /* synthetic */ int access$dataIndexToDataAnchor(v4 v4Var, int i10, int i11, int i12, int i13) {
        v4Var.getClass();
        return d(i10, i11, i12, i13);
    }

    public static /* synthetic */ b anchor$default(v4 v4Var, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = v4Var.f80560t;
        }
        return v4Var.anchor(i10);
    }

    public static int d(int i10, int i11, int i12, int i13) {
        return i10 > i11 ? -(((i13 - i12) - i10) + 1) : i10;
    }

    public static /* synthetic */ void markGroup$default(v4 v4Var, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = v4Var.f80562v;
        }
        v4Var.markGroup(i10);
    }

    public static /* synthetic */ List moveFrom$default(v4 v4Var, s4 s4Var, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            z10 = true;
        }
        return v4Var.moveFrom(s4Var, i10, z10);
    }

    public final int a(int i10, int[] iArr) {
        return Integer.bitCount(iArr[(i10 * 5) + 1] >> 29) + b(i10, iArr);
    }

    public final void advanceBy(int i10) {
        boolean z10 = false;
        if (!(i10 >= 0)) {
            d0.composeImmediateRuntimeError("Cannot seek backwards");
        }
        if (!(this.f80554n <= 0)) {
            a3.throwIllegalStateException("Cannot call seek() while inserting");
        }
        if (i10 == 0) {
            return;
        }
        int i11 = this.f80560t + i10;
        if (i11 >= this.f80562v && i11 <= this.f80561u) {
            z10 = true;
        }
        if (!z10) {
            d0.composeImmediateRuntimeError("Cannot seek outside the current group (" + this.f80562v + '-' + this.f80561u + ')');
        }
        this.f80560t = i11;
        int iB = b(g(i11), this.f80542b);
        this.f80549i = iB;
        this.f80550j = iB;
    }

    public final b anchor(int i10) {
        ArrayList arrayList = this.f80544d;
        int iA = u4.a(arrayList, i10, getSize$runtime());
        if (iA >= 0) {
            return (b) arrayList.get(iA);
        }
        if (i10 > this.f80547g) {
            i10 = -(getSize$runtime() - i10);
        }
        b bVar = new b(i10);
        arrayList.add(-(iA + 1), bVar);
        return bVar;
    }

    public final int anchorIndex(b bVar) {
        int location$runtime = bVar.getLocation$runtime();
        return location$runtime < 0 ? getSize$runtime() + location$runtime : location$runtime;
    }

    public final void appendSlot(b bVar, Object obj) {
        if (!(this.f80554n == 0)) {
            d0.composeImmediateRuntimeError("Can only append a slot if not current inserting");
        }
        int i10 = this.f80549i;
        int i11 = this.f80550j;
        int iAnchorIndex = anchorIndex(bVar);
        int iB = b(g(iAnchorIndex + 1), this.f80542b);
        this.f80549i = iB;
        this.f80550j = iB;
        j(1, iAnchorIndex);
        if (i10 >= iB) {
            i10++;
            i11++;
        }
        this.f80543c[iB] = obj;
        this.f80549i = i10;
        this.f80550j = i11;
    }

    public final int b(int i10, int[] iArr) {
        if (i10 >= f()) {
            return this.f80543c.length - this.f80552l;
        }
        int i11 = iArr[(i10 * 5) + 4];
        return i11 < 0 ? (this.f80543c.length - this.f80552l) + i11 + 1 : i11;
    }

    public final void bashCurrentGroup() {
        u4.access$updateGroupKey(this.f80542b, this.f80560t, -3);
    }

    public final void beginInsert() {
        int i10 = this.f80554n;
        this.f80554n = i10 + 1;
        if (i10 == 0) {
            this.f80557q.push((f() - this.f80548h) - this.f80561u);
        }
    }

    public final int c(int i10) {
        return (this.f80552l * (i10 < this.f80551k ? 0 : 1)) + i10;
    }

    public final Object clear(int i10) {
        int iC = c(i10);
        Object[] objArr = this.f80543c;
        Object obj = objArr[iC];
        objArr[iC] = v.f80515a.getEmpty();
        return obj;
    }

    public final void close(boolean z10) {
        this.f80563w = true;
        if (z10 && this.f80556p.f80424b == 0) {
            k(getSize$runtime());
            l(this.f80543c.length - this.f80552l, this.f80547g);
            int i10 = this.f80551k;
            uu.f0.fill(this.f80543c, (Object) null, i10, this.f80552l + i10);
            o();
        }
        this.f80541a.close$runtime(this, this.f80542b, this.f80547g, this.f80543c, this.f80551k, this.f80544d, this.f80545e, this.f80546f);
    }

    public final void e(int i10, int i11, int i12) {
        if (i10 >= this.f80547g) {
            i10 = -((getSize$runtime() - i10) + 2);
        }
        while (i12 < i11) {
            this.f80542b[(g(i12) * 5) + 2] = i10;
            int iAccess$groupSize = u4.access$groupSize(this.f80542b, g(i12)) + i12;
            e(i12, iAccess$groupSize, i12 + 1);
            i12 = iAccess$groupSize;
        }
    }

    public final int endGroup() {
        z.t0 t0Var;
        boolean z10 = this.f80554n > 0;
        int i10 = this.f80560t;
        int i11 = this.f80561u;
        int i12 = this.f80562v;
        int iG = g(i12);
        int i13 = this.f80555o;
        int i14 = i10 - i12;
        int i15 = (iG * 5) + 1;
        boolean z11 = (this.f80542b[i15] & 1073741824) != 0;
        r1 r1Var = this.f80558r;
        if (z10) {
            z.j0 j0Var = this.f80559s;
            if (j0Var != null && (t0Var = (z.t0) j0Var.get(i12)) != null) {
                Object[] objArr = t0Var.f96812a;
                int i16 = t0Var.f96813b;
                for (int i17 = 0; i17 < i16; i17++) {
                    Object obj = objArr[i17];
                    skip();
                    set(obj);
                }
            }
            u4.access$updateGroupSize(this.f80542b, iG, i14);
            u4.access$updateNodeCount(this.f80542b, iG, i13);
            this.f80555o = r1Var.pop() + (z11 ? 1 : i13);
            int iM = m(i12, this.f80542b);
            this.f80562v = iM;
            int size$runtime = iM < 0 ? getSize$runtime() : g(iM + 1);
            int iB = size$runtime >= 0 ? b(size$runtime, this.f80542b) : 0;
            this.f80549i = iB;
            this.f80550j = iB;
            return i13;
        }
        if (i10 != i11) {
            d0.composeImmediateRuntimeError("Expected to be at the end of a group");
        }
        int iAccess$groupSize = u4.access$groupSize(this.f80542b, iG);
        int[] iArr = this.f80542b;
        int i18 = iArr[i15] & 67108863;
        u4.access$updateGroupSize(iArr, iG, i14);
        u4.access$updateNodeCount(this.f80542b, iG, i13);
        int iPop = this.f80556p.pop();
        this.f80561u = (f() - this.f80548h) - this.f80557q.pop();
        this.f80562v = iPop;
        int iM2 = m(i12, this.f80542b);
        int iPop2 = r1Var.pop();
        this.f80555o = iPop2;
        if (iM2 == iPop) {
            this.f80555o = iPop2 + (z11 ? 0 : i13 - i18);
            return i13;
        }
        int i19 = i14 - iAccess$groupSize;
        int i20 = z11 ? 0 : i13 - i18;
        if (i19 != 0 || i20 != 0) {
            while (iM2 != 0 && iM2 != iPop && (i20 != 0 || i19 != 0)) {
                int iG2 = g(iM2);
                if (i19 != 0) {
                    u4.access$updateGroupSize(this.f80542b, iG2, u4.access$groupSize(this.f80542b, iG2) + i19);
                }
                if (i20 != 0) {
                    int[] iArr2 = this.f80542b;
                    u4.access$updateNodeCount(iArr2, iG2, (iArr2[(iG2 * 5) + 1] & 67108863) + i20);
                }
                int[] iArr3 = this.f80542b;
                if ((iArr3[(iG2 * 5) + 1] & 1073741824) != 0) {
                    i20 = 0;
                }
                iM2 = m(iM2, iArr3);
            }
        }
        this.f80555o += i20;
        return i13;
    }

    public final void endInsert() {
        if (this.f80554n <= 0) {
            a3.throwIllegalStateException("Unbalanced begin/end insert");
        }
        int i10 = this.f80554n - 1;
        this.f80554n = i10;
        if (i10 == 0) {
            if (this.f80558r.f80424b != this.f80556p.f80424b) {
                d0.composeImmediateRuntimeError("startGroup/endGroup mismatch while inserting");
            }
            this.f80561u = (f() - this.f80548h) - this.f80557q.pop();
        }
    }

    public final void ensureStarted(int i10) {
        boolean z10 = false;
        if (!(this.f80554n <= 0)) {
            d0.composeImmediateRuntimeError("Cannot call ensureStarted() while inserting");
        }
        int i11 = this.f80562v;
        if (i11 != i10) {
            if (i10 >= i11 && i10 < this.f80561u) {
                z10 = true;
            }
            if (!z10) {
                d0.composeImmediateRuntimeError("Started group at " + i10 + " must be a subgroup of the group at " + i11);
            }
            int i12 = this.f80560t;
            int i13 = this.f80549i;
            int i14 = this.f80550j;
            this.f80560t = i10;
            startGroup();
            this.f80560t = i12;
            this.f80549i = i13;
            this.f80550j = i14;
        }
    }

    public final int f() {
        return this.f80542b.length / 5;
    }

    public final void forAllData(int i10, kv.p pVar) {
        int iAccess$dataIndex = access$dataIndex(this, this.f80542b, g(groupSize(getCurrentGroup()) + getCurrentGroup()));
        for (int iAccess$dataIndex2 = access$dataIndex(this, this.f80542b, g(i10)); iAccess$dataIndex2 < iAccess$dataIndex; iAccess$dataIndex2++) {
            pVar.invoke(Integer.valueOf(iAccess$dataIndex2), this.f80543c[c(iAccess$dataIndex2)]);
        }
    }

    public final void forAllDataInRememberOrder(int i10, kv.p pVar) {
        int i11;
        int i12;
        b after;
        kv.p pVar2 = pVar;
        int iParent = parent(i10);
        int size$runtime = getSize$runtime();
        int iGroupSize = groupSize(i10) + i10;
        kotlin.jvm.internal.u uVar = null;
        int i13 = i10;
        z.k0 k0VarMutableIntSetOf = null;
        z.i0 i0Var = null;
        while (i13 < iGroupSize) {
            int iB = b(g(i13), this.f80542b);
            int i14 = i13 + 1;
            int iB2 = b(g(i14), this.f80542b);
            while (true) {
                i11 = 0;
                if (iB >= iB2) {
                    break;
                }
                Object obj = this.f80543c[c(iB)];
                if ((obj instanceof k4) && (after = ((k4) obj).getAfter()) != null && after.getValid()) {
                    int iAnchorIndex = anchorIndex(after);
                    if (k0VarMutableIntSetOf == null) {
                        k0VarMutableIntSetOf = z.r.mutableIntSetOf();
                    }
                    if (i0Var == null) {
                        i0Var = new z.i0(i11, 1, uVar);
                    }
                    k0VarMutableIntSetOf.add(iAnchorIndex);
                    i0Var.add(iAnchorIndex);
                    i0Var.add(iB);
                } else {
                    pVar2.invoke(Integer.valueOf(iB), obj);
                }
                iB++;
            }
            int iParent2 = i14 < size$runtime ? parent(i14) : -1;
            if (iParent2 != i13) {
                while (true) {
                    if (i0Var == null || k0VarMutableIntSetOf == null || !k0VarMutableIntSetOf.remove(i13)) {
                        i12 = size$runtime;
                    } else {
                        int i15 = i0Var.f96886b;
                        int i16 = i15 / 2;
                        int i17 = i11;
                        int i18 = i17;
                        while (i18 < i16) {
                            int i19 = i18 * 2;
                            int i20 = size$runtime;
                            int i21 = i0Var.get(i19);
                            if (i21 == i13) {
                                int i22 = i0Var.get(i19 + 1);
                                pVar2.invoke(Integer.valueOf(i22), this.f80543c[c(i22)]);
                            } else if (i19 != i17) {
                                int i23 = i17 + 1;
                                i0Var.set(i17, i21);
                                i17 += 2;
                                i0Var.set(i23, i0Var.get(i19 + 1));
                            } else {
                                i17 += 2;
                            }
                            i18++;
                            pVar2 = pVar;
                            size$runtime = i20;
                        }
                        i12 = size$runtime;
                        if (i17 != i15) {
                            i0Var.removeRange(i17, i15);
                        }
                    }
                    if (i13 == i10 || iParent == iParent2) {
                        break;
                    }
                    i13 = iParent;
                    size$runtime = i12;
                    i11 = 0;
                    iParent = parent(iParent);
                    pVar2 = pVar;
                }
            } else {
                i12 = size$runtime;
            }
            pVar2 = pVar;
            iParent = iParent2;
            i13 = i14;
            size$runtime = i12;
            uVar = null;
        }
    }

    public final void forEachTailSlot(int i10, int i11, kv.p pVar) {
        int iSlotsStartIndex$runtime = slotsStartIndex$runtime(i10);
        int iSlotsEndIndex$runtime = slotsEndIndex$runtime(i10);
        for (int iMax = Math.max(iSlotsStartIndex$runtime, iSlotsEndIndex$runtime - i11); iMax < iSlotsEndIndex$runtime; iMax++) {
            pVar.invoke(Integer.valueOf(iMax), this.f80543c[c(iMax)]);
        }
    }

    public final int g(int i10) {
        return (this.f80548h * (i10 < this.f80547g ? 0 : 1)) + i10;
    }

    public final boolean getClosed() {
        return this.f80563w;
    }

    public final boolean getCollectingCalledInformation() {
        return this.f80546f != null;
    }

    public final boolean getCollectingSourceInformation() {
        return this.f80545e != null;
    }

    public final int getCurrentGroup() {
        return this.f80560t;
    }

    public final int getCurrentGroupEnd() {
        return this.f80561u;
    }

    public final int getParent() {
        return this.f80562v;
    }

    public final int getSize$runtime() {
        return f() - this.f80548h;
    }

    public final int getSlotsSize() {
        return this.f80543c.length - this.f80552l;
    }

    public final s4 getTable$runtime() {
        return this.f80541a;
    }

    public final Object groupAux(int i10) {
        int iG = g(i10);
        int[] iArr = this.f80542b;
        return (iArr[(iG * 5) + 1] & 268435456) != 0 ? this.f80543c[a(iG, iArr)] : v.f80515a.getEmpty();
    }

    public final int groupKey(int i10) {
        return this.f80542b[g(i10) * 5];
    }

    public final Object groupObjectKey(int i10) {
        int iG = g(i10);
        int[] iArr = this.f80542b;
        if ((iArr[(iG * 5) + 1] & 536870912) != 0) {
            return this.f80543c[u4.access$objectKeyIndex(iArr, iG)];
        }
        return null;
    }

    public final int groupSize(int i10) {
        return u4.access$groupSize(this.f80542b, g(i10));
    }

    public final int groupSlotIndex(int i10) {
        z.t0 t0Var;
        int iSlotsStartIndex$runtime = this.f80549i - slotsStartIndex$runtime(i10);
        z.j0 j0Var = this.f80559s;
        return iSlotsStartIndex$runtime + ((j0Var == null || (t0Var = (z.t0) j0Var.get(i10)) == null) ? 0 : t0Var.getSize());
    }

    public final Iterator<Object> groupSlots() {
        int iB = b(g(this.f80560t), this.f80542b);
        int[] iArr = this.f80542b;
        int i10 = this.f80560t;
        return new w4(this, iB, b(g(groupSize(i10) + i10), iArr));
    }

    public final q1 h(int i10, String str) {
        HashMap map = this.f80545e;
        if (map == null) {
            return null;
        }
        b bVarAnchor = anchor(i10);
        Object obj = map.get(bVarAnchor);
        Object obj2 = obj;
        if (obj == null) {
            q1 q1Var = new q1(0, str, 0);
            if (str == null) {
                int iAccess$groupSize = i10 + 1;
                int i11 = this.f80560t;
                while (iAccess$groupSize < i11) {
                    q1Var.reportGroup(this, iAccess$groupSize);
                    iAccess$groupSize += u4.access$groupSize(this.f80542b, iAccess$groupSize);
                }
            }
            map.put(bVarAnchor, q1Var);
            obj2 = q1Var;
        }
        return (q1) obj2;
    }

    public final void i(int i10) {
        if (i10 > 0) {
            int i11 = this.f80560t;
            k(i11);
            int i12 = this.f80547g;
            int i13 = this.f80548h;
            int[] iArr = this.f80542b;
            int length = iArr.length / 5;
            int i14 = length - i13;
            if (i13 < i10) {
                int iMax = Math.max(Math.max(length * 2, i14 + i10), 32);
                int[] iArr2 = new int[iMax * 5];
                int i15 = iMax - i14;
                uu.f0.copyInto(iArr, iArr2, 0, 0, i12 * 5);
                uu.f0.copyInto(iArr, iArr2, (i12 + i15) * 5, (i13 + i12) * 5, length * 5);
                this.f80542b = iArr2;
                i13 = i15;
            }
            int i16 = this.f80561u;
            if (i16 >= i12) {
                this.f80561u = i16 + i10;
            }
            int i17 = i12 + i10;
            this.f80547g = i17;
            this.f80548h = i13 - i10;
            int iD = d(i14 > 0 ? b(g(i11 + i10), this.f80542b) : 0, this.f80553m >= i12 ? this.f80551k : 0, this.f80552l, this.f80543c.length);
            for (int i18 = i12; i18 < i17; i18++) {
                this.f80542b[(i18 * 5) + 4] = iD;
            }
            int i19 = this.f80553m;
            if (i19 >= i12) {
                this.f80553m = i19 + i10;
            }
        }
    }

    public final boolean indexInCurrentGroup(int i10) {
        return indexInGroup(i10, this.f80560t);
    }

    public final boolean indexInGroup(int i10, int i11) {
        int iIndexOf;
        int iF;
        if (i11 == this.f80562v) {
            iF = this.f80561u;
        } else {
            r1 r1Var = this.f80556p;
            if (i11 <= r1Var.peekOr(0) && (iIndexOf = r1Var.indexOf(i11)) >= 0) {
                iF = (f() - this.f80548h) - this.f80557q.peek(iIndexOf);
            } else {
                int iGroupSize = groupSize(i11);
                iF = iGroupSize + i11;
            }
        }
        return i10 > i11 && i10 < iF;
    }

    public final boolean indexInParent(int i10) {
        int i11 = this.f80562v;
        if (i10 <= i11 || i10 >= this.f80561u) {
            return i11 == 0 && i10 == 0;
        }
        return true;
    }

    public final void insertAux(Object obj) {
        if (!(this.f80554n >= 0)) {
            d0.composeImmediateRuntimeError("Cannot insert auxiliary data when not inserting");
        }
        int i10 = this.f80562v;
        int iG = g(i10);
        if ((this.f80542b[(iG * 5) + 1] & 268435456) != 0) {
            d0.composeImmediateRuntimeError("Group already has auxiliary data");
        }
        j(1, i10);
        int iA = a(iG, this.f80542b);
        int iC = c(iA);
        int i11 = this.f80549i;
        if (i11 > iA) {
            int i12 = i11 - iA;
            if (!(i12 < 3)) {
                a3.throwIllegalStateException("Moving more than two slot not supported");
            }
            if (i12 > 1) {
                Object[] objArr = this.f80543c;
                objArr[iC + 2] = objArr[iC + 1];
            }
            Object[] objArr2 = this.f80543c;
            objArr2[iC + 1] = objArr2[iC];
        }
        u4.access$addAux(this.f80542b, iG);
        this.f80543c[iC] = obj;
        this.f80549i++;
    }

    public final boolean isGroupEnd() {
        return this.f80560t == this.f80561u;
    }

    public final boolean isNode() {
        int i10 = this.f80560t;
        return i10 < this.f80561u && (this.f80542b[(g(i10) * 5) + 1] & 1073741824) != 0;
    }

    public final void j(int i10, int i11) {
        if (i10 > 0) {
            l(this.f80549i, i11);
            int i12 = this.f80551k;
            int i13 = this.f80552l;
            if (i13 < i10) {
                Object[] objArr = this.f80543c;
                int length = objArr.length;
                int i14 = length - i13;
                int iMax = Math.max(Math.max(length * 2, i14 + i10), 32);
                Object[] objArr2 = new Object[iMax];
                for (int i15 = 0; i15 < iMax; i15++) {
                    objArr2[i15] = null;
                }
                int i16 = iMax - i14;
                int i17 = i13 + i12;
                System.arraycopy(objArr, 0, objArr2, 0, i12);
                System.arraycopy(objArr, i17, objArr2, i12 + i16, length - i17);
                this.f80543c = objArr2;
                i13 = i16;
            }
            int i18 = this.f80550j;
            if (i18 >= i12) {
                this.f80550j = i18 + i10;
            }
            this.f80551k = i12 + i10;
            this.f80552l = i13 - i10;
        }
    }

    public final void k(int i10) {
        b bVar;
        int location$runtime;
        b bVar2;
        int location$runtime2;
        int i11;
        int i12 = this.f80548h;
        int i13 = this.f80547g;
        if (i13 != i10) {
            if (!this.f80544d.isEmpty()) {
                int iF = f() - this.f80548h;
                if (i13 < i10) {
                    for (int iAccess$locationOf = u4.access$locationOf(this.f80544d, i13, iF); iAccess$locationOf < this.f80544d.size() && (location$runtime2 = (bVar2 = (b) this.f80544d.get(iAccess$locationOf)).getLocation$runtime()) < 0 && (i11 = location$runtime2 + iF) < i10; iAccess$locationOf++) {
                        bVar2.setLocation$runtime(i11);
                    }
                } else {
                    for (int iAccess$locationOf2 = u4.access$locationOf(this.f80544d, i10, iF); iAccess$locationOf2 < this.f80544d.size() && (location$runtime = (bVar = (b) this.f80544d.get(iAccess$locationOf2)).getLocation$runtime()) >= 0; iAccess$locationOf2++) {
                        bVar.setLocation$runtime(-(iF - location$runtime));
                    }
                }
            }
            if (i12 > 0) {
                int[] iArr = this.f80542b;
                int i14 = i10 * 5;
                int i15 = i12 * 5;
                int i16 = i13 * 5;
                if (i10 < i13) {
                    uu.f0.copyInto(iArr, iArr, i15 + i14, i14, i16);
                } else {
                    uu.f0.copyInto(iArr, iArr, i16, i16 + i15, i14 + i15);
                }
            }
            if (i10 < i13) {
                i13 = i10 + i12;
            }
            int iF2 = f();
            if (i13 >= iF2) {
                d0.composeImmediateRuntimeError("Check failed");
            }
            while (i13 < iF2) {
                int i17 = (i13 * 5) + 2;
                int i18 = this.f80542b[i17];
                int iN = n(i18);
                if (iN >= i10) {
                    iN = -((getSize$runtime() - iN) + 2);
                }
                if (iN != i18) {
                    this.f80542b[i17] = iN;
                }
                i13++;
                if (i13 == i10) {
                    i13 += i12;
                }
            }
        }
        this.f80547g = i10;
    }

    public final void l(int i10, int i11) {
        int i12 = this.f80552l;
        int i13 = this.f80551k;
        int i14 = this.f80553m;
        if (i13 != i10) {
            Object[] objArr = this.f80543c;
            if (i10 < i13) {
                System.arraycopy(objArr, i10, objArr, i10 + i12, i13 - i10);
            } else {
                int i15 = i13 + i12;
                System.arraycopy(objArr, i15, objArr, i13, (i10 + i12) - i15);
            }
        }
        int iMin = Math.min(i11 + 1, getSize$runtime());
        if (i14 != iMin) {
            int length = this.f80543c.length - i12;
            if (iMin < i14) {
                int iG = g(iMin);
                int iG2 = g(i14);
                int i16 = this.f80547g;
                while (iG < iG2) {
                    int i17 = (iG * 5) + 4;
                    int i18 = this.f80542b[i17];
                    if (!(i18 >= 0)) {
                        d0.composeImmediateRuntimeError("Unexpected anchor value, expected a positive anchor");
                    }
                    this.f80542b[i17] = -((length - i18) + 1);
                    iG++;
                    if (iG == i16) {
                        iG += this.f80548h;
                    }
                }
            } else {
                int iG3 = g(i14);
                int iG4 = g(iMin);
                while (iG3 < iG4) {
                    int i19 = (iG3 * 5) + 4;
                    int i20 = this.f80542b[i19];
                    if (!(i20 < 0)) {
                        d0.composeImmediateRuntimeError("Unexpected anchor value, expected a negative anchor");
                    }
                    this.f80542b[i19] = i20 + length + 1;
                    iG3++;
                    if (iG3 == this.f80547g) {
                        iG3 += this.f80548h;
                    }
                }
            }
            this.f80553m = iMin;
        }
        this.f80551k = i10;
    }

    public final int m(int i10, int[] iArr) {
        return n(iArr[(g(i10) * 5) + 2]);
    }

    public final void markGroup(int i10) {
        int iG = g(i10);
        int[] iArr = this.f80542b;
        int i11 = (iG * 5) + 1;
        if ((iArr[i11] & 134217728) != 0) {
            return;
        }
        u4.access$updateMark(iArr, iG, true);
        if ((this.f80542b[i11] & 67108864) != 0) {
            return;
        }
        t(parent(i10));
    }

    public final List<b> moveFrom(s4 s4Var, int i10, boolean z10) {
        if (!(this.f80554n > 0)) {
            d0.composeImmediateRuntimeError("Check failed");
        }
        if (i10 != 0 || this.f80560t != 0 || this.f80541a.getGroupsSize() != 0 || u4.access$groupSize(s4Var.getGroups(), i10) != s4Var.getGroupsSize()) {
            v4 v4VarOpenWriter = s4Var.openWriter();
            try {
                List<b> listAccess$moveGroup = a.access$moveGroup(f80540y, v4VarOpenWriter, i10, this, true, true, z10);
                v4VarOpenWriter.close(true);
                return listAccess$moveGroup;
            } catch (Throwable th2) {
                v4VarOpenWriter.close(false);
                throw th2;
            }
        }
        int[] iArr = this.f80542b;
        Object[] objArr = this.f80543c;
        ArrayList<b> arrayList = this.f80544d;
        HashMap<b, q1> map = this.f80545e;
        z.j0 j0Var = this.f80546f;
        int[] groups = s4Var.getGroups();
        int groupsSize = s4Var.getGroupsSize();
        Object[] slots = s4Var.getSlots();
        int slotsSize = s4Var.getSlotsSize();
        HashMap<b, q1> sourceInformationMap$runtime = s4Var.getSourceInformationMap$runtime();
        z.j0 calledByMap$runtime = s4Var.getCalledByMap$runtime();
        this.f80542b = groups;
        this.f80543c = slots;
        this.f80544d = s4Var.getAnchors$runtime();
        this.f80547g = groupsSize;
        this.f80548h = (groups.length / 5) - groupsSize;
        this.f80551k = slotsSize;
        this.f80552l = slots.length - slotsSize;
        this.f80553m = groupsSize;
        this.f80545e = sourceInformationMap$runtime;
        this.f80546f = calledByMap$runtime;
        s4Var.setTo$runtime(iArr, 0, objArr, 0, arrayList, map, j0Var);
        return this.f80544d;
    }

    public final void moveGroup(int i10) {
        b bVar;
        int iAnchorIndex;
        if (this.f80554n != 0) {
            d0.composeImmediateRuntimeError("Cannot move a group while inserting");
        }
        if (i10 < 0) {
            d0.composeImmediateRuntimeError("Parameter offset is out of bounds");
        }
        if (i10 == 0) {
            return;
        }
        int i11 = this.f80560t;
        int i12 = this.f80562v;
        int i13 = this.f80561u;
        int iAccess$groupSize = i11;
        for (int i14 = i10; i14 > 0; i14--) {
            iAccess$groupSize += u4.access$groupSize(this.f80542b, g(iAccess$groupSize));
            if (iAccess$groupSize > i13) {
                d0.composeImmediateRuntimeError("Parameter offset is out of bounds");
            }
        }
        int iAccess$groupSize2 = u4.access$groupSize(this.f80542b, g(iAccess$groupSize));
        int iB = b(g(this.f80560t), this.f80542b);
        int iB2 = b(g(iAccess$groupSize), this.f80542b);
        int i15 = iAccess$groupSize + iAccess$groupSize2;
        int iB3 = b(g(i15), this.f80542b);
        int i16 = iB3 - iB2;
        j(i16, Math.max(this.f80560t - 1, 0));
        i(iAccess$groupSize2);
        int[] iArr = this.f80542b;
        int iG = g(i15) * 5;
        uu.f0.copyInto(iArr, iArr, g(i11) * 5, iG, (iAccess$groupSize2 * 5) + iG);
        if (i16 > 0) {
            Object[] objArr = this.f80543c;
            int iC = c(iB2 + i16);
            System.arraycopy(objArr, iC, objArr, iB, c(iB3 + i16) - iC);
        }
        int i17 = iB2 + i16;
        int i18 = i17 - iB;
        int i19 = this.f80551k;
        int i20 = this.f80552l;
        int length = this.f80543c.length;
        int i21 = this.f80553m;
        int i22 = i11 + iAccess$groupSize2;
        int i23 = i11;
        while (i23 < i22) {
            int iG2 = g(i23);
            int i24 = i18;
            int iB4 = b(iG2, iArr) - i24;
            int i25 = i19;
            if (i21 < iG2) {
                i19 = 0;
            }
            int[] iArr2 = iArr;
            iArr2[(iG2 * 5) + 4] = d(d(iB4, i19, i20, length), this.f80551k, this.f80552l, this.f80543c.length);
            i23++;
            i19 = i25;
            i18 = i24;
            iArr = iArr2;
        }
        int i26 = i15 + iAccess$groupSize2;
        int size$runtime = getSize$runtime();
        int iAccess$locationOf = u4.access$locationOf(this.f80544d, i15, size$runtime);
        ArrayList arrayList = new ArrayList();
        if (iAccess$locationOf >= 0) {
            while (iAccess$locationOf < this.f80544d.size() && (iAnchorIndex = anchorIndex((bVar = (b) this.f80544d.get(iAccess$locationOf)))) >= i15 && iAnchorIndex < i26) {
                arrayList.add(bVar);
            }
        }
        int i27 = i11 - i15;
        int size = arrayList.size();
        for (int i28 = 0; i28 < size; i28++) {
            b bVar2 = (b) arrayList.get(i28);
            int iAnchorIndex2 = anchorIndex(bVar2) + i27;
            if (iAnchorIndex2 >= this.f80547g) {
                bVar2.setLocation$runtime(-(size$runtime - iAnchorIndex2));
            } else {
                bVar2.setLocation$runtime(iAnchorIndex2);
            }
            this.f80544d.add(u4.access$locationOf(this.f80544d, iAnchorIndex2, size$runtime), bVar2);
        }
        if (p(i15, iAccess$groupSize2)) {
            d0.composeImmediateRuntimeError("Unexpectedly removed anchors");
        }
        e(i12, this.f80561u, i11);
        if (i16 > 0) {
            q(i17, i16, i15 - 1);
        }
    }

    public final List<b> moveIntoGroupFrom(int i10, s4 s4Var, int i11) throws Throwable {
        if (this.f80554n > 0 || groupSize(this.f80560t + i10) != 1) {
            d0.composeImmediateRuntimeError("Check failed");
        }
        int i12 = this.f80560t;
        int i13 = this.f80549i;
        int i14 = this.f80550j;
        advanceBy(i10);
        startGroup();
        beginInsert();
        v4 v4VarOpenWriter = s4Var.openWriter();
        try {
            f80540y.getClass();
            try {
                List<b> listA = a.a(v4VarOpenWriter, i11, this, false, true, true);
                v4VarOpenWriter.close(true);
                endInsert();
                endGroup();
                this.f80560t = i12;
                this.f80549i = i13;
                this.f80550j = i14;
                return listA;
            } catch (Throwable th2) {
                th = th2;
                Throwable th3 = th;
                v4VarOpenWriter.close(false);
                throw th3;
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }

    public final List<b> moveTo(b bVar, int i10, v4 v4Var) {
        if (v4Var.f80554n <= 0) {
            d0.composeImmediateRuntimeError("Check failed");
        }
        if (this.f80554n != 0) {
            d0.composeImmediateRuntimeError("Check failed");
        }
        if (!bVar.getValid()) {
            d0.composeImmediateRuntimeError("Check failed");
        }
        int iAnchorIndex = anchorIndex(bVar) + i10;
        int i11 = this.f80560t;
        if (i11 > iAnchorIndex || iAnchorIndex >= this.f80561u) {
            d0.composeImmediateRuntimeError("Check failed");
        }
        int iParent = parent(iAnchorIndex);
        int iGroupSize = groupSize(iAnchorIndex);
        int iNodeCount = isNode(iAnchorIndex) ? 1 : nodeCount(iAnchorIndex);
        f80540y.getClass();
        List<b> listA = a.a(this, iAnchorIndex, v4Var, false, false, true);
        t(iParent);
        boolean z10 = iNodeCount > 0;
        while (iParent >= i11) {
            int iG = g(iParent);
            int[] iArr = this.f80542b;
            u4.access$updateGroupSize(iArr, iG, u4.access$groupSize(iArr, iG) - iGroupSize);
            if (z10) {
                int[] iArr2 = this.f80542b;
                int i12 = iArr2[(iG * 5) + 1];
                if ((1073741824 & i12) != 0) {
                    z10 = false;
                } else {
                    u4.access$updateNodeCount(iArr2, iG, (i12 & 67108863) - iNodeCount);
                }
            }
            iParent = parent(iParent);
        }
        if (z10) {
            if (this.f80555o < iNodeCount) {
                d0.composeImmediateRuntimeError("Check failed");
            }
            this.f80555o -= iNodeCount;
        }
        return listA;
    }

    public final int n(int i10) {
        return i10 > -2 ? i10 : (getSize$runtime() + i10) - (-2);
    }

    public final Object node(int i10) {
        int iG = g(i10);
        int[] iArr = this.f80542b;
        if ((iArr[(iG * 5) + 1] & 1073741824) != 0) {
            return this.f80543c[c(b(iG, iArr))];
        }
        return null;
    }

    public final int nodeCount(int i10) {
        return this.f80542b[(g(i10) * 5) + 1] & 67108863;
    }

    public final void o() {
        boolean z10;
        z.i0 i0Var = this.f80564x;
        if (i0Var != null) {
            while (b3.m5800isNotEmptyimpl(i0Var)) {
                int iM5802takeMaximpl = b3.m5802takeMaximpl(i0Var);
                int iG = g(iM5802takeMaximpl);
                int iGroupSize = iM5802takeMaximpl + 1;
                int iGroupSize2 = groupSize(iM5802takeMaximpl) + iM5802takeMaximpl;
                while (true) {
                    if (iGroupSize >= iGroupSize2) {
                        z10 = false;
                        break;
                    } else {
                        if ((this.f80542b[(g(iGroupSize) * 5) + 1] & 201326592) != 0) {
                            z10 = true;
                            break;
                        }
                        iGroupSize += groupSize(iGroupSize);
                    }
                }
                int[] iArr = this.f80542b;
                if (((iArr[(iG * 5) + 1] & 67108864) != 0) != z10) {
                    u4.access$updateContainsMark(iArr, iG, z10);
                    int iParent = parent(iM5802takeMaximpl);
                    if (iParent >= 0) {
                        b3.m5792addimpl(i0Var, iParent);
                    }
                }
            }
        }
    }

    public final boolean p(int i10, int i11) {
        if (i11 > 0) {
            ArrayList arrayList = this.f80544d;
            k(i10);
            if (!arrayList.isEmpty()) {
                HashMap map = this.f80545e;
                int i12 = i10 + i11;
                int iAccess$locationOf = u4.access$locationOf(this.f80544d, i12, f() - this.f80548h);
                if (iAccess$locationOf >= this.f80544d.size()) {
                    iAccess$locationOf--;
                }
                int i13 = iAccess$locationOf + 1;
                int i14 = 0;
                while (iAccess$locationOf >= 0) {
                    b bVar = (b) this.f80544d.get(iAccess$locationOf);
                    int iAnchorIndex = anchorIndex(bVar);
                    if (iAnchorIndex < i10) {
                        break;
                    }
                    if (iAnchorIndex < i12) {
                        bVar.setLocation$runtime(Integer.MIN_VALUE);
                        if (map != null) {
                        }
                        if (i14 == 0) {
                            i14 = iAccess$locationOf + 1;
                        }
                        i13 = iAccess$locationOf;
                    }
                    iAccess$locationOf--;
                }
                z = i13 < i14;
                if (z) {
                    this.f80544d.subList(i13, i14).clear();
                }
            }
            this.f80547g = i10;
            this.f80548h += i11;
            int i15 = this.f80553m;
            if (i15 > i10) {
                this.f80553m = Math.max(i10, i15 - i11);
            }
            int i16 = this.f80561u;
            if (i16 >= this.f80547g) {
                this.f80561u = i16 - i11;
            }
            int i17 = this.f80562v;
            if (i17 >= 0 && (this.f80542b[(g(i17) * 5) + 1] & 67108864) != 0) {
                t(i17);
            }
        }
        return z;
    }

    public final int parent(int i10) {
        return m(i10, this.f80542b);
    }

    public final void q(int i10, int i11, int i12) {
        if (i11 > 0) {
            int i13 = this.f80552l;
            int i14 = i10 + i11;
            l(i14, i12);
            this.f80551k = i10;
            this.f80552l = i13 + i11;
            uu.f0.fill(this.f80543c, (Object) null, i10, i14);
            int i15 = this.f80550j;
            if (i15 >= i10) {
                this.f80550j = i15 - i11;
            }
        }
    }

    public final int r(int i10, int[] iArr) {
        if (i10 >= f()) {
            return this.f80543c.length - this.f80552l;
        }
        int iAccess$slotAnchor = u4.access$slotAnchor(iArr, i10);
        return iAccess$slotAnchor < 0 ? (this.f80543c.length - this.f80552l) + iAccess$slotAnchor + 1 : iAccess$slotAnchor;
    }

    public final void recordGroupSourceInformation(String str) {
        if (this.f80554n > 0) {
            h(this.f80562v, str);
        }
    }

    public final void recordGrouplessCallSourceInformationEnd() {
        q1 q1VarH;
        if (this.f80554n <= 0 || (q1VarH = h(this.f80562v, null)) == null) {
            return;
        }
        q1VarH.endGrouplessCall(groupSlotIndex(this.f80562v));
    }

    public final void recordGrouplessCallSourceInformationStart(int i10, String str) {
        if (this.f80554n > 0) {
            z.j0 j0Var = this.f80546f;
            if (j0Var != null) {
                u4.access$add(j0Var, i10, groupKey(this.f80562v));
            }
            q1 q1VarH = h(this.f80562v, null);
            if (q1VarH != null) {
                q1VarH.startGrouplessCall(i10, str, groupSlotIndex(this.f80562v));
            }
        }
    }

    public final boolean removeGroup() {
        b bVarTryAnchor$runtime;
        if (!(this.f80554n == 0)) {
            d0.composeImmediateRuntimeError("Cannot remove group while inserting");
        }
        int i10 = this.f80560t;
        int i11 = this.f80549i;
        int iB = b(g(i10), this.f80542b);
        int iSkipGroup = skipGroup();
        q1 q1VarSourceInformationOf$runtime = sourceInformationOf$runtime(this.f80562v);
        if (q1VarSourceInformationOf$runtime != null && (bVarTryAnchor$runtime = tryAnchor$runtime(i10)) != null) {
            q1VarSourceInformationOf$runtime.removeAnchor(bVarTryAnchor$runtime);
        }
        z.i0 i0Var = this.f80564x;
        if (i0Var != null) {
            while (b3.m5800isNotEmptyimpl(i0Var) && b3.m5801peekimpl(i0Var) >= i10) {
                b3.m5802takeMaximpl(i0Var);
            }
        }
        boolean zP = p(i10, this.f80560t - i10);
        q(iB, this.f80549i - iB, i10 - 1);
        this.f80560t = i10;
        this.f80549i = i11;
        this.f80555o -= iSkipGroup;
        return zP;
    }

    public final void reset() {
        if (!(this.f80554n == 0)) {
            d0.composeImmediateRuntimeError("Cannot reset when inserting");
        }
        o();
        this.f80560t = 0;
        this.f80561u = f() - this.f80548h;
        this.f80549i = 0;
        this.f80550j = 0;
        this.f80555o = 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r14v2 */
    public final void s(Object obj, int i10, Object obj2, boolean z10) {
        int iAccess$groupSize;
        q1 q1VarSourceInformationOf$runtime;
        int i11 = this.f80562v;
        Object[] objArr = this.f80554n > 0;
        this.f80558r.push(this.f80555o);
        v vVar = v.f80515a;
        if (objArr == true) {
            int i12 = this.f80560t;
            int iB = b(g(i12), this.f80542b);
            i(1);
            this.f80549i = iB;
            this.f80550j = iB;
            int iG = g(i12);
            ?? r13 = obj != vVar.getEmpty() ? 1 : 0;
            ?? r14 = (z10 || obj2 == vVar.getEmpty()) ? 0 : 1;
            int iD = d(iB, this.f80551k, this.f80552l, this.f80543c.length);
            if (iD >= 0 && this.f80553m < i12) {
                iD = -(((this.f80543c.length - this.f80552l) - iD) + 1);
            }
            u4.access$initGroup(this.f80542b, iG, i10, z10, r13, r14, this.f80562v, iD);
            int i13 = (z10 ? 1 : 0) + r13 + r14;
            if (i13 > 0) {
                j(i13, i12);
                Object[] objArr2 = this.f80543c;
                int i14 = this.f80549i;
                if (z10) {
                    objArr2[i14] = obj2;
                    i14++;
                }
                if (r13 != 0) {
                    objArr2[i14] = obj;
                    i14++;
                }
                if (r14 != 0) {
                    objArr2[i14] = obj2;
                    i14++;
                }
                this.f80549i = i14;
            }
            this.f80555o = 0;
            iAccess$groupSize = i12 + 1;
            this.f80562v = i12;
            this.f80560t = iAccess$groupSize;
            if (i11 >= 0 && (q1VarSourceInformationOf$runtime = sourceInformationOf$runtime(i11)) != null) {
                q1VarSourceInformationOf$runtime.reportGroup(this, i12);
            }
        } else {
            this.f80556p.push(i11);
            this.f80557q.push((f() - this.f80548h) - this.f80561u);
            int i15 = this.f80560t;
            int iG2 = g(i15);
            if (!kotlin.jvm.internal.e0.areEqual(obj2, vVar.getEmpty())) {
                if (z10) {
                    updateNode(obj2);
                } else {
                    updateAux(obj2);
                }
            }
            this.f80549i = r(iG2, this.f80542b);
            this.f80550j = b(g(this.f80560t + 1), this.f80542b);
            int[] iArr = this.f80542b;
            this.f80555o = iArr[(iG2 * 5) + 1] & 67108863;
            this.f80562v = i15;
            this.f80560t = i15 + 1;
            iAccess$groupSize = i15 + u4.access$groupSize(iArr, iG2);
        }
        this.f80561u = iAccess$groupSize;
    }

    public final void seek(b bVar) {
        advanceBy(bVar.toIndexFor(this) - this.f80560t);
    }

    public final void set(Object obj) {
        if (!(this.f80549i <= this.f80550j)) {
            d0.composeImmediateRuntimeError("Writing to an invalid slot");
        }
        this.f80543c[c(this.f80549i - 1)] = obj;
    }

    public final Object skip() {
        if (this.f80554n > 0) {
            j(1, this.f80562v);
        }
        Object[] objArr = this.f80543c;
        int i10 = this.f80549i;
        this.f80549i = i10 + 1;
        return objArr[c(i10)];
    }

    public final int skipGroup() {
        int iG = g(this.f80560t);
        int iAccess$groupSize = u4.access$groupSize(this.f80542b, iG) + this.f80560t;
        this.f80560t = iAccess$groupSize;
        this.f80549i = b(g(iAccess$groupSize), this.f80542b);
        int i10 = this.f80542b[(iG * 5) + 1];
        if ((1073741824 & i10) != 0) {
            return 1;
        }
        return i10 & 67108863;
    }

    public final void skipToGroupEnd() {
        int i10 = this.f80561u;
        this.f80560t = i10;
        this.f80549i = b(g(i10), this.f80542b);
    }

    public final Object slot(b bVar, int i10) {
        return slot(anchorIndex(bVar), i10);
    }

    public final int slotIndexOfGroupSlotIndex(int i10, int i11) {
        int iR = r(g(i10), this.f80542b);
        int i12 = iR + i11;
        if (!(i12 >= iR && i12 < b(g(i10 + 1), this.f80542b))) {
            d0.composeImmediateRuntimeError("Write to an invalid slot index " + i11 + " for group " + i10);
        }
        return i12;
    }

    public final int slotsEndAllIndex$runtime(int i10) {
        return b(g(groupSize(i10) + i10), this.f80542b);
    }

    public final int slotsEndIndex$runtime(int i10) {
        return b(g(i10 + 1), this.f80542b);
    }

    public final int slotsStartIndex$runtime(int i10) {
        return r(g(i10), this.f80542b);
    }

    public final q1 sourceInformationOf$runtime(int i10) {
        b bVarTryAnchor$runtime;
        HashMap map = this.f80545e;
        if (map == null || (bVarTryAnchor$runtime = tryAnchor$runtime(i10)) == null) {
            return null;
        }
        return (q1) map.get(bVarTryAnchor$runtime);
    }

    public final void startData(int i10, Object obj, Object obj2) {
        s(obj, i10, obj2, false);
    }

    public final void startGroup() {
        if (!(this.f80554n == 0)) {
            d0.composeImmediateRuntimeError("Key must be supplied when inserting");
        }
        v vVar = v.f80515a;
        s(vVar.getEmpty(), 0, vVar.getEmpty(), false);
    }

    public final void startNode(int i10, Object obj) {
        s(obj, i10, v.f80515a.getEmpty(), true);
    }

    public final void t(int i10) {
        if (i10 >= 0) {
            z.i0 i0VarM5795constructorimpl$default = this.f80564x;
            if (i0VarM5795constructorimpl$default == null) {
                i0VarM5795constructorimpl$default = b3.m5795constructorimpl$default(null, 1, null);
                this.f80564x = i0VarM5795constructorimpl$default;
            }
            b3.m5792addimpl(i0VarM5795constructorimpl$default, i10);
        }
    }

    public final String toDebugString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(toString());
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(sb2, "append(...)");
        sb2.append('\n');
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(sb2, "append(...)");
        sb2.append("  parent:    " + this.f80562v);
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(sb2, "append(...)");
        sb2.append('\n');
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(sb2, "append(...)");
        sb2.append("  current:   " + this.f80560t);
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(sb2, "append(...)");
        sb2.append('\n');
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(sb2, "append(...)");
        sb2.append("  group gap: " + this.f80547g + '-' + (this.f80547g + this.f80548h) + '(' + this.f80548h + ')');
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(sb2, "append(...)");
        sb2.append('\n');
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(sb2, "append(...)");
        sb2.append("  slots gap: " + this.f80551k + '-' + (this.f80551k + this.f80552l) + '(' + this.f80552l + ')');
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(sb2, "append(...)");
        sb2.append('\n');
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(sb2, "append(...)");
        StringBuilder sb3 = new StringBuilder("  gap owner: ");
        sb3.append(this.f80553m);
        sb2.append(sb3.toString());
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(sb2, "append(...)");
        sb2.append('\n');
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(sb2, "append(...)");
        int size$runtime = getSize$runtime();
        int i10 = 0;
        while (i10 < size$runtime) {
            int iG = g(i10);
            sb2.append("Group(");
            if (i10 < 10) {
                sb2.append(' ');
            }
            if (i10 < 100) {
                sb2.append(' ');
            }
            if (i10 < 1000) {
                sb2.append(' ');
            }
            sb2.append(i10);
            if (iG != i10) {
                sb2.append("(");
                sb2.append(iG);
                sb2.append(")");
            }
            sb2.append('#');
            sb2.append(u4.access$groupSize(this.f80542b, iG));
            sb2.append('^');
            int i11 = iG * 5;
            int i12 = i11 + 2;
            sb2.append(n(this.f80542b[i12]));
            sb2.append(": key=");
            sb2.append(this.f80542b[i11]);
            sb2.append(", nodes=");
            int i13 = i11 + 1;
            sb2.append(this.f80542b[i13] & 67108863);
            sb2.append(", dataAnchor=");
            sb2.append(this.f80542b[i11 + 4]);
            sb2.append(", parentAnchor=");
            sb2.append(this.f80542b[i12]);
            if ((this.f80542b[i13] & 1073741824) != 0) {
                sb2.append(", node=" + u4.access$summarize(String.valueOf(this.f80543c[c(b(iG, this.f80542b))]), 10));
            }
            int iR = r(iG, this.f80542b);
            i10++;
            int iB = b(g(i10), this.f80542b);
            if (iB > iR) {
                sb2.append(", [");
                for (int i14 = iR; i14 < iB; i14++) {
                    if (i14 != iR) {
                        sb2.append(", ");
                    }
                    sb2.append(u4.access$summarize(String.valueOf(this.f80543c[c(i14)]), 10));
                }
                sb2.append(AbstractJsonLexerKt.END_LIST);
            }
            sb2.append(")");
            sb2.append('\n');
        }
        String string = sb2.toString();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    public String toString() {
        return "SlotWriter(current = " + this.f80560t + " end=" + this.f80561u + " size = " + getSize$runtime() + " gap=" + this.f80547g + '-' + (this.f80547g + this.f80548h) + ')';
    }

    public final void traverseGroupAndChildren(int i10, kv.l lVar, kv.l lVar2) {
        int iParent = parent(i10);
        int size$runtime = getSize$runtime();
        int iGroupSize = groupSize(i10) + i10;
        int i11 = i10;
        while (i11 < iGroupSize) {
            lVar.invoke(Integer.valueOf(i11));
            int i12 = i11 + 1;
            int iParent2 = i12 < size$runtime ? parent(i12) : -1;
            if (iParent2 != i11) {
                while (true) {
                    lVar2.invoke(Integer.valueOf(i11));
                    if (i11 == i10 || iParent == iParent2) {
                        break;
                    }
                    i11 = iParent;
                    iParent = parent(iParent);
                }
            }
            i11 = i12;
            iParent = iParent2;
        }
    }

    public final void trimTailSlots(int i10) {
        if (!(i10 > 0)) {
            d0.composeImmediateRuntimeError("Check failed");
        }
        int i11 = this.f80562v;
        int iR = r(g(i11), this.f80542b);
        int iB = b(g(i11 + 1), this.f80542b) - i10;
        if (!(iB >= iR)) {
            d0.composeImmediateRuntimeError("Check failed");
        }
        q(iB, i10, i11);
        int i12 = this.f80549i;
        if (i12 >= iR) {
            this.f80549i = i12 - i10;
        }
    }

    public final b tryAnchor$runtime(int i10) {
        if (i10 < 0 || i10 >= getSize$runtime()) {
            return null;
        }
        return u4.access$find(this.f80544d, i10, getSize$runtime());
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void u(int r5, java.lang.Object r6) {
        /*
            r4 = this;
            int r0 = r4.g(r5)
            int[] r1 = r4.f80542b
            int r2 = r1.length
            if (r0 >= r2) goto L15
            int r2 = r0 * 5
            r3 = 1
            int r2 = r2 + r3
            r1 = r1[r2]
            r2 = 1073741824(0x40000000, float:2.0)
            r1 = r1 & r2
            if (r1 == 0) goto L15
            goto L16
        L15:
            r3 = 0
        L16:
            if (r3 != 0) goto L2e
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Updating the node of a group at "
            r1.<init>(r2)
            r1.append(r5)
            java.lang.String r5 = " that was not created with as a node group"
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            p0.d0.composeImmediateRuntimeError(r5)
        L2e:
            java.lang.Object[] r5 = r4.f80543c
            int[] r1 = r4.f80542b
            int r0 = r4.b(r0, r1)
            int r0 = r4.c(r0)
            r5[r0] = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p0.v4.u(int, java.lang.Object):void");
    }

    public final Object update(Object obj) {
        if (this.f80554n <= 0 || this.f80549i == this.f80551k) {
            Object objSkip = skip();
            set(obj);
            return objSkip;
        }
        z.j0 j0Var = this.f80559s;
        kotlin.jvm.internal.u uVar = null;
        int i10 = 1;
        int i11 = 0;
        if (j0Var == null) {
            j0Var = new z.j0(i11, i10, uVar);
        }
        this.f80559s = j0Var;
        int i12 = this.f80562v;
        Object t0Var = j0Var.get(i12);
        if (t0Var == null) {
            t0Var = new z.t0(i11, i10, uVar);
            j0Var.set(i12, t0Var);
        }
        ((z.t0) t0Var).add(obj);
        return v.f80515a.getEmpty();
    }

    public final void updateAux(Object obj) {
        int iG = g(this.f80560t);
        if (!((this.f80542b[(iG * 5) + 1] & 268435456) != 0)) {
            d0.composeImmediateRuntimeError("Updating the data of a group that was not created with a data slot");
        }
        this.f80543c[c(a(iG, this.f80542b))] = obj;
    }

    public final void updateNode(Object obj) {
        u(this.f80560t, obj);
    }

    public final void updateParentNode(Object obj) {
        u(this.f80562v, obj);
    }

    public final void updateToTableMaps() {
        s4 s4Var = this.f80541a;
        this.f80545e = s4Var.getSourceInformationMap$runtime();
        this.f80546f = s4Var.getCalledByMap$runtime();
    }

    public final void verifyDataAnchors$runtime() {
        int i10 = this.f80553m;
        int length = this.f80543c.length - this.f80552l;
        int size$runtime = getSize$runtime();
        int i11 = 0;
        int i12 = 0;
        boolean z10 = false;
        while (i11 < size$runtime) {
            int iG = g(i11);
            int[] iArr = this.f80542b;
            int i13 = iArr[(iG * 5) + 4];
            int iB = b(iG, iArr);
            if (!(iB >= i12)) {
                StringBuilder sbF = w0.i.f(i11, i12, "Data index out of order at ", ", previous = ", ", current = ");
                sbF.append(iB);
                a3.throwIllegalStateException(sbF.toString());
            }
            if (!(iB <= length)) {
                a3.throwIllegalStateException("Data index, " + iB + ", out of bound at " + i11);
            }
            if (i13 < 0 && !z10) {
                if (!(i10 == i11)) {
                    a3.throwIllegalStateException("Expected the slot gap owner to be " + i10 + " found gap at " + i11);
                }
                z10 = true;
            }
            i11++;
            i12 = iB;
        }
    }

    public final void verifyParentAnchors$runtime() {
        int i10 = this.f80547g;
        int i11 = this.f80548h;
        int iF = f();
        int i12 = 0;
        while (true) {
            if (i12 >= i10) {
                break;
            }
            if (!(this.f80542b[(i12 * 5) + 2] > -2)) {
                a3.throwIllegalStateException("Expected a start relative anchor at " + i12);
            }
            i12++;
        }
        for (int i13 = i11 + i10; i13 < iF; i13++) {
            int i14 = this.f80542b[(i13 * 5) + 2];
            if (n(i14) < i10) {
                if (!(i14 > -2)) {
                    a3.throwIllegalStateException("Expected a start relative anchor at " + i13);
                }
            } else if (!(i14 <= -2)) {
                a3.throwIllegalStateException("Expected an end relative anchor at " + i13);
            }
        }
    }

    public static final int access$dataIndex(v4 v4Var, int i10) {
        return v4Var.b(v4Var.g(i10), v4Var.f80542b);
    }

    public final int parent(b bVar) {
        if (!bVar.getValid()) {
            return -1;
        }
        return m(anchorIndex(bVar), this.f80542b);
    }

    public final Object slot(int i10, int i11) {
        int iR = r(g(i10), this.f80542b);
        int iB = b(g(i10 + 1), this.f80542b);
        int i12 = i11 + iR;
        if (iR > i12 || i12 >= iB) {
            return v.f80515a.getEmpty();
        }
        return this.f80543c[c(i12)];
    }

    public final void startData(int i10, Object obj) {
        s(v.f80515a.getEmpty(), i10, obj, false);
    }

    public final void startNode(int i10, Object obj, Object obj2) {
        s(obj, i10, obj2, true);
    }

    public final void updateNode(b bVar, Object obj) {
        u(bVar.toIndexFor(this), obj);
    }

    public final boolean isNode(int i10) {
        return (this.f80542b[(g(i10) * 5) + 1] & 1073741824) != 0;
    }

    public final Object set(int i10, Object obj) {
        return set(getCurrentGroup(), i10, obj);
    }

    public final void startGroup(int i10) {
        v vVar = v.f80515a;
        s(vVar.getEmpty(), i10, vVar.getEmpty(), false);
    }

    public final Object set(int i10, int i11, Object obj) {
        int iC = c(slotIndexOfGroupSlotIndex(i10, i11));
        Object[] objArr = this.f80543c;
        Object obj2 = objArr[iC];
        objArr[iC] = obj;
        return obj2;
    }

    public final void startGroup(int i10, Object obj) {
        s(obj, i10, v.f80515a.getEmpty(), false);
    }

    public final Object node(b bVar) {
        return node(bVar.toIndexFor(this));
    }

    public final void ensureStarted(b bVar) {
        ensureStarted(bVar.toIndexFor(this));
    }
}
