package androidx.recyclerview.widget;

import java.util.ArrayList;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class c implements k1 {

    /* renamed from: d, reason: collision with root package name */
    public final x1 f7074d;

    /* renamed from: a, reason: collision with root package name */
    public final w3.g f7071a = new w3.g(30);

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f7072b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f7073c = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public int f7076f = 0;

    /* renamed from: e, reason: collision with root package name */
    public final l1 f7075e = new l1(this);

    public c(x1 x1Var) {
        this.f7074d = x1Var;
    }

    public final boolean a(int i10) {
        ArrayList arrayList = this.f7073c;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            b bVar = (b) arrayList.get(i11);
            int i12 = bVar.f7050a;
            if (i12 == 8) {
                if (f(bVar.f7053d, i11 + 1) == i10) {
                    return true;
                }
            } else if (i12 == 1) {
                int i13 = bVar.f7051b;
                int i14 = bVar.f7053d + i13;
                while (i13 < i14) {
                    if (f(i13, i11 + 1) == i10) {
                        return true;
                    }
                    i13++;
                }
            } else {
                continue;
            }
        }
        return false;
    }

    public int applyPendingUpdatesToPosition(int i10) {
        ArrayList arrayList = this.f7072b;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            b bVar = (b) arrayList.get(i11);
            int i12 = bVar.f7050a;
            if (i12 != 1) {
                if (i12 == 2) {
                    int i13 = bVar.f7051b;
                    if (i13 <= i10) {
                        int i14 = bVar.f7053d;
                        if (i13 + i14 > i10) {
                            return -1;
                        }
                        i10 -= i14;
                    } else {
                        continue;
                    }
                } else if (i12 == 8) {
                    int i15 = bVar.f7051b;
                    if (i15 == i10) {
                        i10 = bVar.f7053d;
                    } else {
                        if (i15 < i10) {
                            i10--;
                        }
                        if (bVar.f7053d <= i10) {
                            i10++;
                        }
                    }
                }
            } else if (bVar.f7051b <= i10) {
                i10 += bVar.f7053d;
            }
        }
        return i10;
    }

    public final void b() {
        ArrayList arrayList = this.f7073c;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f7074d.onDispatchSecondPass((b) arrayList.get(i10));
        }
        j(arrayList);
        this.f7076f = 0;
    }

    public final void c() {
        b();
        ArrayList arrayList = this.f7072b;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            b bVar = (b) arrayList.get(i10);
            int i11 = bVar.f7050a;
            x1 x1Var = this.f7074d;
            if (i11 == 1) {
                x1Var.onDispatchSecondPass(bVar);
                x1Var.offsetPositionsForAdd(bVar.f7051b, bVar.f7053d);
            } else if (i11 == 2) {
                x1Var.onDispatchSecondPass(bVar);
                x1Var.offsetPositionsForRemovingInvisible(bVar.f7051b, bVar.f7053d);
            } else if (i11 == 4) {
                x1Var.onDispatchSecondPass(bVar);
                x1Var.markViewHoldersUpdated(bVar.f7051b, bVar.f7053d, bVar.f7052c);
            } else if (i11 == 8) {
                x1Var.onDispatchSecondPass(bVar);
                x1Var.offsetPositionsForMove(bVar.f7051b, bVar.f7053d);
            }
        }
        j(arrayList);
        this.f7076f = 0;
    }

    public final void d(b bVar) {
        int i10;
        int i11 = bVar.f7050a;
        if (i11 == 1 || i11 == 8) {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int iK = k(bVar.f7051b, i11);
        int i12 = bVar.f7051b;
        int i13 = bVar.f7050a;
        if (i13 == 2) {
            i10 = 0;
        } else {
            if (i13 != 4) {
                throw new IllegalArgumentException("op should be remove or update." + bVar);
            }
            i10 = 1;
        }
        int i14 = 1;
        for (int i15 = 1; i15 < bVar.f7053d; i15++) {
            int iK2 = k((i10 * i15) + bVar.f7051b, bVar.f7050a);
            int i16 = bVar.f7050a;
            if (i16 == 2 ? iK2 != iK : !(i16 == 4 && iK2 == iK + 1)) {
                b bVarObtainUpdateOp = obtainUpdateOp(i16, iK, i14, bVar.f7052c);
                e(bVarObtainUpdateOp, i12);
                recycleUpdateOp(bVarObtainUpdateOp);
                if (bVar.f7050a == 4) {
                    i12 += i14;
                }
                i14 = 1;
                iK = iK2;
            } else {
                i14++;
            }
        }
        Object obj = bVar.f7052c;
        recycleUpdateOp(bVar);
        if (i14 > 0) {
            b bVarObtainUpdateOp2 = obtainUpdateOp(bVar.f7050a, iK, i14, obj);
            e(bVarObtainUpdateOp2, i12);
            recycleUpdateOp(bVarObtainUpdateOp2);
        }
    }

    public final void e(b bVar, int i10) {
        x1 x1Var = this.f7074d;
        x1Var.onDispatchFirstPass(bVar);
        int i11 = bVar.f7050a;
        if (i11 == 2) {
            x1Var.offsetPositionsForRemovingInvisible(i10, bVar.f7053d);
        } else {
            if (i11 != 4) {
                throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
            }
            x1Var.markViewHoldersUpdated(i10, bVar.f7053d, bVar.f7052c);
        }
    }

    public final int f(int i10, int i11) {
        ArrayList arrayList = this.f7073c;
        int size = arrayList.size();
        while (i11 < size) {
            b bVar = (b) arrayList.get(i11);
            int i12 = bVar.f7050a;
            if (i12 == 8) {
                int i13 = bVar.f7051b;
                if (i13 == i10) {
                    i10 = bVar.f7053d;
                } else {
                    if (i13 < i10) {
                        i10--;
                    }
                    if (bVar.f7053d <= i10) {
                        i10++;
                    }
                }
            } else {
                int i14 = bVar.f7051b;
                if (i14 > i10) {
                    continue;
                } else if (i12 == 2) {
                    int i15 = bVar.f7053d;
                    if (i10 < i14 + i15) {
                        return -1;
                    }
                    i10 -= i15;
                } else if (i12 == 1) {
                    i10 += bVar.f7053d;
                }
            }
            i11++;
        }
        return i10;
    }

    public final boolean g() {
        return this.f7072b.size() > 0;
    }

    public final void h(b bVar) {
        this.f7073c.add(bVar);
        int i10 = bVar.f7050a;
        x1 x1Var = this.f7074d;
        if (i10 == 1) {
            x1Var.offsetPositionsForAdd(bVar.f7051b, bVar.f7053d);
            return;
        }
        if (i10 == 2) {
            x1Var.offsetPositionsForRemovingLaidOutOrNewView(bVar.f7051b, bVar.f7053d);
            return;
        }
        if (i10 == 4) {
            x1Var.markViewHoldersUpdated(bVar.f7051b, bVar.f7053d, bVar.f7052c);
        } else if (i10 == 8) {
            x1Var.offsetPositionsForMove(bVar.f7051b, bVar.f7053d);
        } else {
            throw new IllegalArgumentException("Unknown update op type for " + bVar);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:181:0x009b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0007 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0096  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i() {
        /*
            Method dump skipped, instructions count: 644
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.c.i():void");
    }

    public final void j(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            recycleUpdateOp((b) arrayList.get(i10));
        }
        arrayList.clear();
    }

    public final int k(int i10, int i11) {
        int i12;
        int i13;
        ArrayList arrayList = this.f7073c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            b bVar = (b) arrayList.get(size);
            int i14 = bVar.f7050a;
            if (i14 == 8) {
                int i15 = bVar.f7051b;
                int i16 = bVar.f7053d;
                if (i15 < i16) {
                    i13 = i15;
                    i12 = i16;
                } else {
                    i12 = i15;
                    i13 = i16;
                }
                if (i10 < i13 || i10 > i12) {
                    if (i10 < i15) {
                        if (i11 == 1) {
                            bVar.f7051b = i15 + 1;
                            bVar.f7053d = i16 + 1;
                        } else if (i11 == 2) {
                            bVar.f7051b = i15 - 1;
                            bVar.f7053d = i16 - 1;
                        }
                    }
                } else if (i13 == i15) {
                    if (i11 == 1) {
                        bVar.f7053d = i16 + 1;
                    } else if (i11 == 2) {
                        bVar.f7053d = i16 - 1;
                    }
                    i10++;
                } else {
                    if (i11 == 1) {
                        bVar.f7051b = i15 + 1;
                    } else if (i11 == 2) {
                        bVar.f7051b = i15 - 1;
                    }
                    i10--;
                }
            } else {
                int i17 = bVar.f7051b;
                if (i17 <= i10) {
                    if (i14 == 1) {
                        i10 -= bVar.f7053d;
                    } else if (i14 == 2) {
                        i10 += bVar.f7053d;
                    }
                } else if (i11 == 1) {
                    bVar.f7051b = i17 + 1;
                } else if (i11 == 2) {
                    bVar.f7051b = i17 - 1;
                }
            }
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            b bVar2 = (b) arrayList.get(size2);
            if (bVar2.f7050a == 8) {
                int i18 = bVar2.f7053d;
                if (i18 == bVar2.f7051b || i18 < 0) {
                    arrayList.remove(size2);
                    recycleUpdateOp(bVar2);
                }
            } else if (bVar2.f7053d <= 0) {
                arrayList.remove(size2);
                recycleUpdateOp(bVar2);
            }
        }
        return i10;
    }

    @Override // androidx.recyclerview.widget.k1
    public b obtainUpdateOp(int i10, int i11, int i12, Object obj) {
        b bVar = (b) this.f7071a.acquire();
        if (bVar != null) {
            bVar.f7050a = i10;
            bVar.f7051b = i11;
            bVar.f7053d = i12;
            bVar.f7052c = obj;
            return bVar;
        }
        b bVar2 = new b();
        bVar2.f7050a = i10;
        bVar2.f7051b = i11;
        bVar2.f7053d = i12;
        bVar2.f7052c = obj;
        return bVar2;
    }

    @Override // androidx.recyclerview.widget.k1
    public void recycleUpdateOp(b bVar) {
        bVar.f7052c = null;
        this.f7071a.release(bVar);
    }
}
