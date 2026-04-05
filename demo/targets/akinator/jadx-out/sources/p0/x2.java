package p0;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class x2 {

    /* renamed from: a, reason: collision with root package name */
    public final List f80590a;

    /* renamed from: b, reason: collision with root package name */
    public final int f80591b;

    /* renamed from: c, reason: collision with root package name */
    public int f80592c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f80593d;

    /* renamed from: e, reason: collision with root package name */
    public final z.j0 f80594e;

    /* renamed from: f, reason: collision with root package name */
    public final tu.o f80595f;

    public x2(List<v1> list, int i10) {
        this.f80590a = list;
        this.f80591b = i10;
        if (i10 < 0) {
            a3.throwIllegalArgumentException("Invalid start index");
        }
        this.f80593d = new ArrayList();
        int i11 = 0;
        z.j0 j0Var = new z.j0(i11, 1, null);
        int size = list.size();
        int nodes = 0;
        while (i11 < size) {
            v1 v1Var = (v1) this.f80590a.get(i11);
            j0Var.set(v1Var.getLocation(), new m1(i11, nodes, v1Var.getNodes()));
            nodes += v1Var.getNodes();
            i11++;
        }
        this.f80594e = j0Var;
        this.f80595f = tu.q.lazy(new w2(this));
    }

    public final int getGroupIndex() {
        return this.f80592c;
    }

    public final List<v1> getKeyInfos() {
        return this.f80590a;
    }

    /* renamed from: getKeyMap-fVlnmYg, reason: not valid java name */
    public final z.u0 m5856getKeyMapfVlnmYg() {
        return ((r0.b) this.f80595f.getValue()).m5997unboximpl();
    }

    public final v1 getNext(int i10, Object obj) {
        return (v1) r0.b.m5992removeFirstimpl(m5856getKeyMapfVlnmYg(), obj != null ? new u1(Integer.valueOf(i10), obj) : Integer.valueOf(i10));
    }

    public final int getStartIndex() {
        return this.f80591b;
    }

    public final List<v1> getUsed() {
        return this.f80593d;
    }

    public final int nodePositionOf(v1 v1Var) {
        m1 m1Var = (m1) this.f80594e.get(v1Var.getLocation());
        if (m1Var != null) {
            return m1Var.getNodeIndex();
        }
        return -1;
    }

    public final boolean recordUsed(v1 v1Var) {
        return this.f80593d.add(v1Var);
    }

    public final void registerInsert(v1 v1Var, int i10) {
        this.f80594e.set(v1Var.getLocation(), new m1(-1, i10, 0));
    }

    public final void registerMoveNode(int i10, int i11, int i12) {
        char c10;
        long j10;
        char c11;
        long j11;
        char c12 = 7;
        z.j0 j0Var = this.f80594e;
        long j12 = -9187201950435737472L;
        if (i10 > i11) {
            Object[] objArr = j0Var.f96893c;
            long[] jArr = j0Var.f96891a;
            int length = jArr.length - 2;
            if (length < 0) {
                return;
            }
            int i13 = 0;
            while (true) {
                long j13 = jArr[i13];
                if ((((~j13) << c12) & j13 & j12) != j12) {
                    int i14 = 8 - ((~(i13 - length)) >>> 31);
                    int i15 = 0;
                    while (i15 < i14) {
                        if ((j13 & 255) < 128) {
                            c11 = c12;
                            m1 m1Var = (m1) objArr[(i13 << 3) + i15];
                            j11 = j12;
                            int nodeIndex = m1Var.getNodeIndex();
                            if (i10 <= nodeIndex && nodeIndex < i10 + i12) {
                                m1Var.setNodeIndex((nodeIndex - i10) + i11);
                            } else if (i11 <= nodeIndex && nodeIndex < i10) {
                                m1Var.setNodeIndex(nodeIndex + i12);
                            }
                        } else {
                            c11 = c12;
                            j11 = j12;
                        }
                        j13 >>= 8;
                        i15++;
                        c12 = c11;
                        j12 = j11;
                    }
                    c10 = c12;
                    j10 = j12;
                    if (i14 != 8) {
                        return;
                    }
                } else {
                    c10 = c12;
                    j10 = j12;
                }
                if (i13 == length) {
                    return;
                }
                i13++;
                c12 = c10;
                j12 = j10;
            }
        } else {
            if (i11 <= i10) {
                return;
            }
            Object[] objArr2 = j0Var.f96893c;
            long[] jArr2 = j0Var.f96891a;
            int length2 = jArr2.length - 2;
            if (length2 < 0) {
                return;
            }
            int i16 = 0;
            while (true) {
                long j14 = jArr2[i16];
                if ((((~j14) << 7) & j14 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i17 = 8 - ((~(i16 - length2)) >>> 31);
                    for (int i18 = 0; i18 < i17; i18++) {
                        if ((j14 & 255) < 128) {
                            m1 m1Var2 = (m1) objArr2[(i16 << 3) + i18];
                            int nodeIndex2 = m1Var2.getNodeIndex();
                            if (i10 <= nodeIndex2 && nodeIndex2 < i10 + i12) {
                                m1Var2.setNodeIndex((nodeIndex2 - i10) + i11);
                            } else if (i10 + 1 <= nodeIndex2 && nodeIndex2 < i11) {
                                m1Var2.setNodeIndex(nodeIndex2 - i12);
                            }
                        }
                        j14 >>= 8;
                    }
                    if (i17 != 8) {
                        return;
                    }
                }
                if (i16 == length2) {
                    return;
                } else {
                    i16++;
                }
            }
        }
    }

    public final void registerMoveSlot(int i10, int i11) {
        char c10;
        long j10;
        char c11;
        long j11;
        char c12 = 7;
        z.j0 j0Var = this.f80594e;
        long j12 = -9187201950435737472L;
        if (i10 > i11) {
            Object[] objArr = j0Var.f96893c;
            long[] jArr = j0Var.f96891a;
            int length = jArr.length - 2;
            if (length < 0) {
                return;
            }
            int i12 = 0;
            while (true) {
                long j13 = jArr[i12];
                if ((((~j13) << c12) & j13 & j12) != j12) {
                    int i13 = 8 - ((~(i12 - length)) >>> 31);
                    int i14 = 0;
                    while (i14 < i13) {
                        if ((j13 & 255) < 128) {
                            c11 = c12;
                            m1 m1Var = (m1) objArr[(i12 << 3) + i14];
                            j11 = j12;
                            int slotIndex = m1Var.getSlotIndex();
                            if (slotIndex == i10) {
                                m1Var.setSlotIndex(i11);
                            } else if (i11 <= slotIndex && slotIndex < i10) {
                                m1Var.setSlotIndex(slotIndex + 1);
                            }
                        } else {
                            c11 = c12;
                            j11 = j12;
                        }
                        j13 >>= 8;
                        i14++;
                        c12 = c11;
                        j12 = j11;
                    }
                    c10 = c12;
                    j10 = j12;
                    if (i13 != 8) {
                        return;
                    }
                } else {
                    c10 = c12;
                    j10 = j12;
                }
                if (i12 == length) {
                    return;
                }
                i12++;
                c12 = c10;
                j12 = j10;
            }
        } else {
            if (i11 <= i10) {
                return;
            }
            Object[] objArr2 = j0Var.f96893c;
            long[] jArr2 = j0Var.f96891a;
            int length2 = jArr2.length - 2;
            if (length2 < 0) {
                return;
            }
            int i15 = 0;
            while (true) {
                long j14 = jArr2[i15];
                if ((((~j14) << 7) & j14 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i16 = 8 - ((~(i15 - length2)) >>> 31);
                    for (int i17 = 0; i17 < i16; i17++) {
                        if ((j14 & 255) < 128) {
                            m1 m1Var2 = (m1) objArr2[(i15 << 3) + i17];
                            int slotIndex2 = m1Var2.getSlotIndex();
                            if (slotIndex2 == i10) {
                                m1Var2.setSlotIndex(i11);
                            } else if (i10 + 1 <= slotIndex2 && slotIndex2 < i11) {
                                m1Var2.setSlotIndex(slotIndex2 - 1);
                            }
                        }
                        j14 >>= 8;
                    }
                    if (i16 != 8) {
                        return;
                    }
                }
                if (i15 == length2) {
                    return;
                } else {
                    i15++;
                }
            }
        }
    }

    public final void setGroupIndex(int i10) {
        this.f80592c = i10;
    }

    public final int slotPositionOf(v1 v1Var) {
        m1 m1Var = (m1) this.f80594e.get(v1Var.getLocation());
        if (m1Var != null) {
            return m1Var.getSlotIndex();
        }
        return -1;
    }

    public final boolean updateNodeCount(int i10, int i11) {
        int nodeIndex;
        z.j0 j0Var = this.f80594e;
        m1 m1Var = (m1) j0Var.get(i10);
        if (m1Var == null) {
            return false;
        }
        int nodeIndex2 = m1Var.getNodeIndex();
        int nodeCount = i11 - m1Var.getNodeCount();
        m1Var.setNodeCount(i11);
        if (nodeCount == 0) {
            return true;
        }
        Object[] objArr = j0Var.f96893c;
        long[] jArr = j0Var.f96891a;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i12 = 0;
        while (true) {
            long j10 = jArr[i12];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i13 = 8 - ((~(i12 - length)) >>> 31);
                for (int i14 = 0; i14 < i13; i14++) {
                    if ((255 & j10) < 128) {
                        m1 m1Var2 = (m1) objArr[(i12 << 3) + i14];
                        if (m1Var2.getNodeIndex() >= nodeIndex2 && !kotlin.jvm.internal.e0.areEqual(m1Var2, m1Var) && (nodeIndex = m1Var2.getNodeIndex() + nodeCount) >= 0) {
                            m1Var2.setNodeIndex(nodeIndex);
                        }
                    }
                    j10 >>= 8;
                }
                if (i13 != 8) {
                    return true;
                }
            }
            if (i12 == length) {
                return true;
            }
            i12++;
        }
    }

    public final int updatedNodeCountOf(v1 v1Var) {
        m1 m1Var = (m1) this.f80594e.get(v1Var.getLocation());
        return m1Var != null ? m1Var.getNodeCount() : v1Var.getNodes();
    }
}
