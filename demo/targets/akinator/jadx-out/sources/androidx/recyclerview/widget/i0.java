package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class i0 {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f7145a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f7146b;

    /* renamed from: c, reason: collision with root package name */
    public final int[] f7147c;

    /* renamed from: d, reason: collision with root package name */
    public final g0 f7148d;

    /* renamed from: e, reason: collision with root package name */
    public final int f7149e;

    /* renamed from: f, reason: collision with root package name */
    public final int f7150f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f7151g;

    public i0(g0 g0Var, ArrayList arrayList, int[] iArr, int[] iArr2, boolean z10) {
        int i10;
        h0 h0Var;
        int i11;
        this.f7145a = arrayList;
        this.f7146b = iArr;
        this.f7147c = iArr2;
        Arrays.fill(iArr, 0);
        Arrays.fill(iArr2, 0);
        this.f7148d = g0Var;
        int oldListSize = g0Var.getOldListSize();
        this.f7149e = oldListSize;
        int newListSize = g0Var.getNewListSize();
        this.f7150f = newListSize;
        this.f7151g = z10;
        h0 h0Var2 = arrayList.isEmpty() ? null : (h0) arrayList.get(0);
        if (h0Var2 == null || h0Var2.f7131a != 0 || h0Var2.f7132b != 0) {
            arrayList.add(0, new h0(0, 0, 0));
        }
        arrayList.add(new h0(oldListSize, newListSize, 0));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            h0 h0Var3 = (h0) it.next();
            for (int i12 = 0; i12 < h0Var3.f7133c; i12++) {
                int i13 = h0Var3.f7131a + i12;
                int i14 = h0Var3.f7132b + i12;
                int i15 = g0Var.areContentsTheSame(i13, i14) ? 1 : 2;
                iArr[i13] = (i14 << 4) | i15;
                iArr2[i14] = (i13 << 4) | i15;
            }
        }
        if (this.f7151g) {
            Iterator it2 = arrayList.iterator();
            int i16 = 0;
            while (it2.hasNext()) {
                h0 h0Var4 = (h0) it2.next();
                while (true) {
                    i10 = h0Var4.f7131a;
                    if (i16 < i10) {
                        if (iArr[i16] == 0) {
                            int size = arrayList.size();
                            int i17 = 0;
                            int i18 = 0;
                            while (true) {
                                if (i17 < size) {
                                    h0Var = (h0) arrayList.get(i17);
                                    while (true) {
                                        i11 = h0Var.f7132b;
                                        if (i18 < i11) {
                                            if (iArr2[i18] == 0 && g0Var.areItemsTheSame(i16, i18)) {
                                                int i19 = g0Var.areContentsTheSame(i16, i18) ? 8 : 4;
                                                iArr[i16] = (i18 << 4) | i19;
                                                iArr2[i18] = i19 | (i16 << 4);
                                            } else {
                                                i18++;
                                            }
                                        }
                                    }
                                }
                                i18 = h0Var.f7133c + i11;
                                i17++;
                            }
                        }
                        i16++;
                    }
                }
                i16 = h0Var4.f7133c + i10;
            }
        }
    }

    public static k0 a(ArrayDeque arrayDeque, int i10, boolean z10) {
        k0 k0Var;
        Iterator it = arrayDeque.iterator();
        while (true) {
            if (!it.hasNext()) {
                k0Var = null;
                break;
            }
            k0Var = (k0) it.next();
            if (k0Var.f7161a == i10 && k0Var.f7163c == z10) {
                it.remove();
                break;
            }
        }
        while (it.hasNext()) {
            k0 k0Var2 = (k0) it.next();
            if (z10) {
                k0Var2.f7162b--;
            } else {
                k0Var2.f7162b++;
            }
        }
        return k0Var;
    }

    public int convertNewPositionToOld(int i10) {
        int i11 = this.f7150f;
        if (i10 < 0 || i10 >= i11) {
            throw new IndexOutOfBoundsException(w0.i.a(i10, i11, "Index out of bounds - passed position = ", ", new list size = "));
        }
        int i12 = this.f7147c[i10];
        if ((i12 & 15) == 0) {
            return -1;
        }
        return i12 >> 4;
    }

    public int convertOldPositionToNew(int i10) {
        int i11 = this.f7149e;
        if (i10 < 0 || i10 >= i11) {
            throw new IndexOutOfBoundsException(w0.i.a(i10, i11, "Index out of bounds - passed position = ", ", old list size = "));
        }
        int i12 = this.f7146b[i10];
        if ((i12 & 15) == 0) {
            return -1;
        }
        return i12 >> 4;
    }

    public void dispatchUpdatesTo(RecyclerView.a aVar) {
        dispatchUpdatesTo(new d(aVar));
    }

    public void dispatchUpdatesTo(g1 g1Var) {
        int[] iArr;
        g0 g0Var;
        int i10;
        int i11;
        ArrayList arrayList;
        i0 i0Var = this;
        m mVar = g1Var instanceof m ? (m) g1Var : new m(g1Var);
        ArrayDeque arrayDeque = new ArrayDeque();
        ArrayList arrayList2 = i0Var.f7145a;
        boolean z10 = true;
        int size = arrayList2.size() - 1;
        int i12 = i0Var.f7149e;
        int i13 = i0Var.f7150f;
        int i14 = i12;
        while (size >= 0) {
            h0 h0Var = (h0) arrayList2.get(size);
            int i15 = h0Var.f7131a;
            int i16 = h0Var.f7133c;
            int i17 = i15 + i16;
            int i18 = h0Var.f7132b;
            int i19 = i18 + i16;
            while (true) {
                iArr = i0Var.f7146b;
                g0Var = i0Var.f7148d;
                boolean z11 = z10;
                i10 = 0;
                if (i14 <= i17) {
                    break;
                }
                i14--;
                int i20 = iArr[i14];
                if ((i20 & 12) != 0) {
                    arrayList = arrayList2;
                    int i21 = i20 >> 4;
                    k0 k0VarA = a(arrayDeque, i21, false);
                    if (k0VarA != null) {
                        int i22 = (i12 - k0VarA.f7162b) - 1;
                        mVar.onMoved(i14, i22);
                        if ((i20 & 4) != 0) {
                            mVar.onChanged(i22, z11 ? 1 : 0, g0Var.getChangePayload(i14, i21));
                        }
                    } else {
                        arrayDeque.add(new k0(i14, (i12 - i14) - (z11 ? 1 : 0), z11));
                    }
                } else {
                    arrayList = arrayList2;
                    mVar.onRemoved(i14, z11 ? 1 : 0);
                    i12--;
                }
                arrayList2 = arrayList;
                z10 = true;
            }
            ArrayList arrayList3 = arrayList2;
            while (i13 > i19) {
                i13--;
                int i23 = i0Var.f7147c[i13];
                if ((i23 & 12) != 0) {
                    int i24 = i23 >> 4;
                    k0 k0VarA2 = a(arrayDeque, i24, true);
                    if (k0VarA2 == null) {
                        arrayDeque.add(new k0(i13, i12 - i14, false));
                        i11 = 0;
                    } else {
                        i11 = 0;
                        mVar.onMoved((i12 - k0VarA2.f7162b) - 1, i14);
                        if ((i23 & 4) != 0) {
                            mVar.onChanged(i14, 1, g0Var.getChangePayload(i24, i13));
                        }
                    }
                } else {
                    i11 = i10;
                    mVar.onInserted(i14, 1);
                    i12++;
                }
                i0Var = this;
                i10 = i11;
            }
            int i25 = i18;
            int i26 = i15;
            while (i10 < i16) {
                if ((iArr[i26] & 15) == 2) {
                    mVar.onChanged(i26, 1, g0Var.getChangePayload(i26, i25));
                }
                i26++;
                i25++;
                i10++;
            }
            size--;
            i0Var = this;
            z10 = true;
            i13 = i18;
            i14 = i15;
            arrayList2 = arrayList3;
        }
        mVar.dispatchLastEvent();
    }
}
