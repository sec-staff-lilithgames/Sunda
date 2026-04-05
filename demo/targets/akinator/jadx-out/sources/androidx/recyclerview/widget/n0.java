package androidx.recyclerview.widget;

import java.util.ArrayList;
import java.util.Collections;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class n0 {

    /* renamed from: a, reason: collision with root package name */
    public static final f0 f7200a = new f0();

    public static i0 calculateDiff(g0 g0Var) {
        return calculateDiff(g0Var, true);
    }

    public static i0 calculateDiff(g0 g0Var, boolean z10) {
        int[] iArr;
        int[] iArr2;
        int i10;
        m0 m0Var;
        int i11;
        l0 l0Var;
        int i12;
        m0 m0Var2;
        m0 m0Var3;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int oldListSize = g0Var.getOldListSize();
        int newListSize = g0Var.getNewListSize();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i21 = 0;
        arrayList2.add(new l0(0, oldListSize, 0, newListSize));
        int i22 = oldListSize + newListSize;
        int i23 = 1;
        int i24 = (((i22 + 1) / 2) * 2) + 1;
        int[] iArr3 = new int[i24];
        int i25 = i24 / 2;
        int[] iArr4 = new int[i24];
        ArrayList arrayList3 = new ArrayList();
        while (!arrayList2.isEmpty()) {
            l0 l0Var2 = (l0) arrayList2.remove(arrayList2.size() - i23);
            if (l0Var2.b() < i23 || l0Var2.a() < i23) {
                iArr = iArr4;
                iArr2 = iArr3;
                i10 = i25;
                m0Var = null;
            } else {
                int iA = ((l0Var2.a() + l0Var2.b()) + i23) / 2;
                int i26 = i23 + i25;
                iArr3[i26] = l0Var2.f7180a;
                iArr4[i26] = l0Var2.f7181b;
                int i27 = i21;
                while (i27 < iA) {
                    int i28 = Math.abs(l0Var2.b() - l0Var2.a()) % 2 == i23 ? i23 : i21;
                    int iB = l0Var2.b() - l0Var2.a();
                    int i29 = -i27;
                    int i30 = i29;
                    while (true) {
                        if (i30 > i27) {
                            iArr = iArr4;
                            iArr2 = iArr3;
                            i12 = i21;
                            i10 = i25;
                            m0Var2 = null;
                            break;
                        }
                        if (i30 == i29 || (i30 != i27 && iArr3[i30 + 1 + i25] > iArr3[(i30 - 1) + i25])) {
                            i17 = iArr3[i30 + 1 + i25];
                            i18 = i17;
                        } else {
                            i17 = iArr3[(i30 - 1) + i25];
                            i18 = i17 + 1;
                        }
                        iArr = iArr4;
                        int i31 = ((i18 - l0Var2.f7180a) + l0Var2.f7182c) - i30;
                        if (i27 == 0 || i18 != i17) {
                            i19 = i31;
                        } else {
                            i19 = i31;
                            i31--;
                        }
                        int i32 = i19;
                        iArr2 = iArr3;
                        int i33 = i18;
                        int i34 = i32;
                        i10 = i25;
                        while (i33 < l0Var2.f7181b && i34 < l0Var2.f7183d && g0Var.areItemsTheSame(i33, i34)) {
                            i33++;
                            i34++;
                        }
                        iArr2[i30 + i10] = i33;
                        if (i28 != 0) {
                            int i35 = iB - i30;
                            i20 = i30;
                            if (i35 >= i29 + 1 && i35 <= i27 - 1 && iArr[i35 + i10] <= i33) {
                                m0Var2 = new m0();
                                m0Var2.f7190a = i17;
                                m0Var2.f7191b = i31;
                                m0Var2.f7192c = i33;
                                m0Var2.f7193d = i34;
                                i12 = 0;
                                m0Var2.f7194e = false;
                                break;
                            }
                        } else {
                            i20 = i30;
                        }
                        i30 = i20 + 2;
                        i21 = 0;
                        iArr4 = iArr;
                        iArr3 = iArr2;
                        i25 = i10;
                    }
                    if (m0Var2 != null) {
                        m0Var = m0Var2;
                        break;
                    }
                    int i36 = (l0Var2.b() - l0Var2.a()) % 2 == 0 ? 1 : i12;
                    int iB2 = l0Var2.b() - l0Var2.a();
                    int i37 = i29;
                    while (true) {
                        if (i37 > i27) {
                            m0Var3 = null;
                            break;
                        }
                        if (i37 == i29 || (i37 != i27 && iArr[i37 + 1 + i10] < iArr[(i37 - 1) + i10])) {
                            i13 = iArr[i37 + 1 + i10];
                            i14 = i13;
                        } else {
                            i13 = iArr[(i37 - 1) + i10];
                            i14 = i13 - 1;
                        }
                        int i38 = l0Var2.f7183d - ((l0Var2.f7181b - i14) - i37);
                        int i39 = (i27 == 0 || i14 != i13) ? i38 : i38 + 1;
                        while (i14 > l0Var2.f7180a && i38 > l0Var2.f7182c) {
                            i15 = i36;
                            if (!g0Var.areItemsTheSame(i14 - 1, i38 - 1)) {
                                break;
                            }
                            i14--;
                            i38--;
                            i36 = i15;
                        }
                        i15 = i36;
                        iArr[i37 + i10] = i14;
                        if (i15 != 0 && (i16 = iB2 - i37) >= i29 && i16 <= i27 && iArr2[i16 + i10] >= i14) {
                            m0Var3 = new m0();
                            m0Var3.f7190a = i14;
                            m0Var3.f7191b = i38;
                            m0Var3.f7192c = i13;
                            m0Var3.f7193d = i39;
                            m0Var3.f7194e = true;
                            break;
                        }
                        i37 += 2;
                        i36 = i15;
                    }
                    if (m0Var3 != null) {
                        m0Var = m0Var3;
                        break;
                    }
                    i27++;
                    iArr4 = iArr;
                    iArr3 = iArr2;
                    i25 = i10;
                    i23 = 1;
                    i21 = 0;
                }
                iArr = iArr4;
                iArr2 = iArr3;
                i10 = i25;
                m0Var = null;
            }
            if (m0Var != null) {
                if (m0Var.a() > 0) {
                    int i40 = m0Var.f7193d;
                    int i41 = m0Var.f7191b;
                    int i42 = i40 - i41;
                    int i43 = m0Var.f7192c;
                    int i44 = m0Var.f7190a;
                    int i45 = i43 - i44;
                    arrayList.add(i42 != i45 ? m0Var.f7194e ? new h0(i44, i41, m0Var.a()) : i42 > i45 ? new h0(i44, i41 + 1, m0Var.a()) : new h0(i44 + 1, i41, m0Var.a()) : new h0(i44, i41, i45));
                }
                if (arrayList3.isEmpty()) {
                    l0Var = new l0();
                    i11 = 1;
                } else {
                    i11 = 1;
                    l0Var = (l0) arrayList3.remove(arrayList3.size() - 1);
                }
                l0Var.f7180a = l0Var2.f7180a;
                l0Var.f7182c = l0Var2.f7182c;
                l0Var.f7181b = m0Var.f7190a;
                l0Var.f7183d = m0Var.f7191b;
                arrayList2.add(l0Var);
                l0Var2.f7181b = l0Var2.f7181b;
                l0Var2.f7183d = l0Var2.f7183d;
                l0Var2.f7180a = m0Var.f7192c;
                l0Var2.f7182c = m0Var.f7193d;
                arrayList2.add(l0Var2);
            } else {
                i11 = 1;
                arrayList3.add(l0Var2);
            }
            iArr4 = iArr;
            i23 = i11;
            iArr3 = iArr2;
            i25 = i10;
            i21 = 0;
        }
        int[] iArr5 = iArr4;
        Collections.sort(arrayList, f7200a);
        return new i0(g0Var, arrayList, iArr3, iArr5, z10);
    }
}
