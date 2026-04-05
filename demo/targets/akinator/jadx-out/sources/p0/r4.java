package p0;

import com.mbridge.msdk.foundation.same.task.Ri.TJzY;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes2.dex */
public final class r4 {

    /* renamed from: a, reason: collision with root package name */
    public final s4 f80430a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f80431b;

    /* renamed from: c, reason: collision with root package name */
    public final int f80432c;

    /* renamed from: d, reason: collision with root package name */
    public Object[] f80433d;

    /* renamed from: e, reason: collision with root package name */
    public final int f80434e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f80435f;

    /* renamed from: g, reason: collision with root package name */
    public int f80436g;

    /* renamed from: h, reason: collision with root package name */
    public int f80437h;

    /* renamed from: i, reason: collision with root package name */
    public int f80438i;

    /* renamed from: j, reason: collision with root package name */
    public final r1 f80439j;

    /* renamed from: k, reason: collision with root package name */
    public int f80440k;

    /* renamed from: l, reason: collision with root package name */
    public int f80441l;

    /* renamed from: m, reason: collision with root package name */
    public int f80442m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f80443n;

    public r4(s4 s4Var) {
        this.f80430a = s4Var;
        this.f80431b = s4Var.getGroups();
        int groupsSize = s4Var.getGroupsSize();
        this.f80432c = groupsSize;
        this.f80433d = s4Var.getSlots();
        this.f80434e = s4Var.getSlotsSize();
        this.f80437h = groupsSize;
        this.f80438i = -1;
        this.f80439j = new r1();
    }

    public static /* synthetic */ b anchor$default(r4 r4Var, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = r4Var.f80436g;
        }
        return r4Var.anchor(i10);
    }

    public final Object a(int i10, int[] iArr) {
        int i11 = i10 * 5;
        return (iArr[i11 + 1] & 1073741824) != 0 ? this.f80433d[iArr[i11 + 4]] : v.f80515a.getEmpty();
    }

    public final b anchor(int i10) {
        ArrayList<b> anchors$runtime = this.f80430a.getAnchors$runtime();
        int iA = u4.a(anchors$runtime, i10, this.f80432c);
        if (iA >= 0) {
            return anchors$runtime.get(iA);
        }
        b bVar = new b(i10);
        anchors$runtime.add(-(iA + 1), bVar);
        return bVar;
    }

    public final Object b(int i10, int[] iArr) {
        if ((iArr[(i10 * 5) + 1] & 536870912) != 0) {
            return this.f80433d[u4.access$objectKeyIndex(iArr, i10)];
        }
        return null;
    }

    public final void beginEmpty() {
        this.f80440k++;
    }

    public final void close() {
        this.f80435f = true;
        this.f80430a.close$runtime(this, null);
        this.f80433d = new Object[0];
    }

    public final boolean containsMark(int i10) {
        return (this.f80431b[(i10 * 5) + 1] & 67108864) != 0;
    }

    public final void endEmpty() {
        if (!(this.f80440k > 0)) {
            a3.throwIllegalArgumentException("Unbalanced begin/end empty");
        }
        this.f80440k--;
    }

    public final void endGroup() {
        if (this.f80440k == 0) {
            if (!(this.f80436g == this.f80437h)) {
                d0.composeImmediateRuntimeError("endGroup() not called at the end of a group");
            }
            int i10 = (this.f80438i * 5) + 2;
            int[] iArr = this.f80431b;
            int i11 = iArr[i10];
            this.f80438i = i11;
            int i12 = this.f80432c;
            this.f80437h = i11 < 0 ? i12 : u4.access$groupSize(iArr, i11) + i11;
            int iPop = this.f80439j.pop();
            if (iPop < 0) {
                this.f80441l = 0;
                this.f80442m = 0;
            } else {
                this.f80441l = iPop;
                this.f80442m = i11 >= i12 - 1 ? this.f80434e : iArr[((i11 + 1) * 5) + 4];
            }
        }
    }

    public final List<v1> extractKeys() {
        ArrayList arrayList = new ArrayList();
        if (this.f80440k <= 0) {
            int iAccess$groupSize = this.f80436g;
            int i10 = 0;
            while (iAccess$groupSize < this.f80437h) {
                int i11 = iAccess$groupSize * 5;
                int[] iArr = this.f80431b;
                int i12 = iArr[i11];
                Object objB = b(iAccess$groupSize, iArr);
                int i13 = 1;
                int i14 = iArr[i11 + 1];
                if ((1073741824 & i14) == 0) {
                    i13 = 67108863 & i14;
                }
                arrayList.add(new v1(i12, objB, iAccess$groupSize, i13, i10));
                iAccess$groupSize += u4.access$groupSize(iArr, iAccess$groupSize);
                i10++;
            }
        }
        return arrayList;
    }

    public final Object get(int i10) {
        int i11 = this.f80441l + i10;
        return i11 < this.f80442m ? this.f80433d[i11] : v.f80515a.getEmpty();
    }

    public final boolean getClosed() {
        return this.f80435f;
    }

    public final int getCurrentEnd() {
        return this.f80437h;
    }

    public final int getCurrentGroup() {
        return this.f80436g;
    }

    public final Object getGroupAux() {
        int i10 = this.f80436g;
        if (i10 >= this.f80437h) {
            return 0;
        }
        int[] iArr = this.f80431b;
        return (iArr[(i10 * 5) + 1] & 268435456) != 0 ? this.f80433d[u4.access$auxIndex(iArr, i10)] : v.f80515a.getEmpty();
    }

    public final int getGroupEnd() {
        return this.f80437h;
    }

    public final int getGroupKey() {
        int i10 = this.f80436g;
        if (i10 >= this.f80437h) {
            return 0;
        }
        return this.f80431b[i10 * 5];
    }

    public final Object getGroupNode() {
        int i10 = this.f80436g;
        if (i10 < this.f80437h) {
            return a(i10, this.f80431b);
        }
        return null;
    }

    public final Object getGroupObjectKey() {
        int i10 = this.f80436g;
        if (i10 < this.f80437h) {
            return b(i10, this.f80431b);
        }
        return null;
    }

    public final int getGroupSize() {
        return u4.access$groupSize(this.f80431b, this.f80436g);
    }

    public final int getGroupSlotCount() {
        int i10 = this.f80436g;
        int[] iArr = this.f80431b;
        int iAccess$slotAnchor = u4.access$slotAnchor(iArr, i10);
        int i11 = i10 + 1;
        return (i11 < this.f80432c ? iArr[(i11 * 5) + 4] : this.f80434e) - iAccess$slotAnchor;
    }

    public final int getGroupSlotIndex() {
        return this.f80441l - u4.access$slotAnchor(this.f80431b, this.f80438i);
    }

    public final boolean getHadNext() {
        return this.f80443n;
    }

    public final boolean getHasObjectKey() {
        int i10 = this.f80436g;
        if (i10 < this.f80437h) {
            return (this.f80431b[(i10 * 5) + 1] & 536870912) != 0;
        }
        return false;
    }

    public final boolean getInEmpty() {
        return this.f80440k > 0;
    }

    public final int getNodeCount() {
        return this.f80431b[(this.f80436g * 5) + 1] & 67108863;
    }

    public final int getParent() {
        return this.f80438i;
    }

    public final int getParentNodes() {
        int i10 = this.f80438i;
        if (i10 < 0) {
            return 0;
        }
        return this.f80431b[(i10 * 5) + 1] & 67108863;
    }

    public final int getRemainingSlots() {
        return this.f80442m - this.f80441l;
    }

    public final int getSize() {
        return this.f80432c;
    }

    public final int getSlot() {
        return this.f80441l - u4.access$slotAnchor(this.f80431b, this.f80438i);
    }

    public final s4 getTable$runtime() {
        return this.f80430a;
    }

    public final Object groupAux(int i10) {
        int[] iArr = this.f80431b;
        return (iArr[(i10 * 5) + 1] & 268435456) != 0 ? this.f80433d[u4.access$auxIndex(iArr, i10)] : v.f80515a.getEmpty();
    }

    public final int groupEnd(int i10) {
        return u4.access$groupSize(this.f80431b, i10) + i10;
    }

    public final Object groupGet(int i10) {
        return groupGet(this.f80436g, i10);
    }

    public final int groupKey(b bVar) {
        if (!bVar.getValid()) {
            return 0;
        }
        return this.f80431b[this.f80430a.anchorIndex(bVar) * 5];
    }

    public final Object groupObjectKey(int i10) {
        return b(i10, this.f80431b);
    }

    public final int groupSize(int i10) {
        return u4.access$groupSize(this.f80431b, i10);
    }

    public final boolean hasMark(int i10) {
        return (this.f80431b[(i10 * 5) + 1] & 134217728) != 0;
    }

    public final boolean hasObjectKey(int i10) {
        return (this.f80431b[(i10 * 5) + 1] & 536870912) != 0;
    }

    public final boolean isGroupEnd() {
        return getInEmpty() || this.f80436g == this.f80437h;
    }

    public final boolean isNode() {
        return (this.f80431b[(this.f80436g * 5) + 1] & 1073741824) != 0;
    }

    public final Object next() {
        int i10;
        if (this.f80440k > 0 || (i10 = this.f80441l) >= this.f80442m) {
            this.f80443n = false;
            return v.f80515a.getEmpty();
        }
        this.f80443n = true;
        Object[] objArr = this.f80433d;
        this.f80441l = i10 + 1;
        return objArr[i10];
    }

    public final Object node(int i10) {
        int[] iArr = this.f80431b;
        if ((iArr[(i10 * 5) + 1] & 1073741824) != 0) {
            return a(i10, iArr);
        }
        return null;
    }

    public final int nodeCount(int i10) {
        return this.f80431b[(i10 * 5) + 1] & 67108863;
    }

    public final int parent(int i10) {
        return this.f80431b[(i10 * 5) + 2];
    }

    public final int parentOf(int i10) {
        if (!(i10 >= 0 && i10 < this.f80432c)) {
            a3.throwIllegalArgumentException("Invalid group index " + i10);
        }
        return this.f80431b[(i10 * 5) + 2];
    }

    public final void reposition(int i10) {
        if (!(this.f80440k == 0)) {
            d0.composeImmediateRuntimeError("Cannot reposition while in an empty region");
        }
        this.f80436g = i10;
        int[] iArr = this.f80431b;
        int i11 = this.f80432c;
        int i12 = i10 < i11 ? iArr[(i10 * 5) + 2] : -1;
        if (i12 != this.f80438i) {
            this.f80438i = i12;
            if (i12 < 0) {
                this.f80437h = i11;
            } else {
                this.f80437h = u4.access$groupSize(iArr, i12) + i12;
            }
            this.f80441l = 0;
            this.f80442m = 0;
        }
    }

    public final void restoreParent(int i10) {
        int iAccess$groupSize = u4.access$groupSize(this.f80431b, i10) + i10;
        int i11 = this.f80436g;
        if (!(i11 >= i10 && i11 <= iAccess$groupSize)) {
            d0.composeImmediateRuntimeError("Index " + i10 + " is not a parent of " + i11);
        }
        this.f80438i = i10;
        this.f80437h = iAccess$groupSize;
        this.f80441l = 0;
        this.f80442m = 0;
    }

    public final void setCurrentGroup(int i10) {
        this.f80436g = i10;
    }

    public final int skipGroup() {
        if (!(this.f80440k == 0)) {
            d0.composeImmediateRuntimeError("Cannot skip while in an empty region");
        }
        int i10 = this.f80436g;
        int[] iArr = this.f80431b;
        int i11 = (iArr[(i10 * 5) + 1] & 1073741824) == 0 ? iArr[(i10 * 5) + 1] & 67108863 : 1;
        this.f80436g = u4.access$groupSize(iArr, i10) + i10;
        return i11;
    }

    public final void skipToGroupEnd() {
        if (!(this.f80440k == 0)) {
            d0.composeImmediateRuntimeError("Cannot skip the enclosing group while in an empty region");
        }
        this.f80436g = this.f80437h;
        this.f80441l = 0;
        this.f80442m = 0;
    }

    public final int slotSize(int i10) {
        int[] iArr = this.f80431b;
        int iAccess$slotAnchor = u4.access$slotAnchor(iArr, i10);
        int i11 = i10 + 1;
        return (i11 < this.f80432c ? iArr[(i11 * 5) + 4] : this.f80434e) - iAccess$slotAnchor;
    }

    public final void startGroup() {
        if (this.f80440k <= 0) {
            int i10 = this.f80438i;
            int i11 = this.f80436g;
            int[] iArr = this.f80431b;
            if (!(iArr[(i11 * 5) + 2] == i10)) {
                a3.throwIllegalArgumentException("Invalid slot table detected");
            }
            int i12 = this.f80441l;
            int i13 = this.f80442m;
            r1 r1Var = this.f80439j;
            if (i12 == 0 && i13 == 0) {
                r1Var.push(-1);
            } else {
                r1Var.push(i12);
            }
            this.f80438i = i11;
            this.f80437h = u4.access$groupSize(iArr, i11) + i11;
            int i14 = i11 + 1;
            this.f80436g = i14;
            this.f80441l = u4.access$slotAnchor(iArr, i11);
            this.f80442m = i11 >= this.f80432c - 1 ? this.f80434e : iArr[(i14 * 5) + 4];
        }
    }

    public final void startNode() {
        if (this.f80440k <= 0) {
            if (!((this.f80431b[(this.f80436g * 5) + 1] & 1073741824) != 0)) {
                a3.throwIllegalArgumentException("Expected a node group");
            }
            startGroup();
        }
    }

    public final Object groupGet(int i10, int i11) {
        int[] iArr = this.f80431b;
        int iAccess$slotAnchor = u4.access$slotAnchor(iArr, i10);
        int i12 = i10 + 1;
        int i13 = iAccess$slotAnchor + i11;
        return i13 < (i12 < this.f80432c ? iArr[(i12 * 5) + 4] : this.f80434e) ? this.f80433d[i13] : v.f80515a.getEmpty();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("SlotReader(current=");
        sb2.append(this.f80436g);
        sb2.append(", key=");
        sb2.append(getGroupKey());
        sb2.append(TJzY.DuZKAZiaISzqL);
        sb2.append(this.f80438i);
        sb2.append(", end=");
        return e3.g.m(sb2, this.f80437h, ')');
    }

    public final int groupKey(int i10) {
        return this.f80431b[i10 * 5];
    }

    public final boolean isNode(int i10) {
        return (this.f80431b[(i10 * 5) + 1] & 1073741824) != 0;
    }
}
