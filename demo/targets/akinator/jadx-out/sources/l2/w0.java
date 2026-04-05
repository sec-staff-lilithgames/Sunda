package l2;

import java.util.ArrayList;
import java.util.List;
import l2.c1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class w0 {
    public static /* synthetic */ List filterByClosestWeight$ui_text_release$default(w0 w0Var, List list, c1 fontWeight, boolean z10, c1 c1Var, c1 c1Var2, int i10, Object obj) {
        c1 c1Var3 = null;
        if ((i10 & 4) != 0) {
            c1Var = null;
        }
        if ((i10 & 8) != 0) {
            c1Var2 = null;
        }
        kotlin.jvm.internal.e0.checkNotNullParameter(list, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(fontWeight, "fontWeight");
        int size = list.size();
        int i11 = 0;
        c1 c1Var4 = null;
        while (true) {
            if (i11 >= size) {
                break;
            }
            c1 weight = ((w) list.get(i11)).getWeight();
            if ((c1Var == null || weight.compareTo(c1Var) >= 0) && (c1Var2 == null || weight.compareTo(c1Var2) <= 0)) {
                if (weight.compareTo(fontWeight) >= 0) {
                    if (weight.compareTo(fontWeight) <= 0) {
                        c1Var3 = weight;
                        c1Var4 = c1Var3;
                        break;
                    }
                    if (c1Var4 == null || weight.compareTo(c1Var4) < 0) {
                        c1Var4 = weight;
                    }
                } else if (c1Var3 == null || weight.compareTo(c1Var3) > 0) {
                    c1Var3 = weight;
                }
            }
            i11++;
        }
        if (!z10 ? c1Var4 != null : c1Var3 == null) {
            c1Var3 = c1Var4;
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size2 = list.size();
        for (int i12 = 0; i12 < size2; i12++) {
            Object obj2 = list.get(i12);
            if (kotlin.jvm.internal.e0.areEqual(((w) obj2).getWeight(), c1Var3)) {
                arrayList.add(obj2);
            }
        }
        return arrayList;
    }

    public final List<w> filterByClosestWeight$ui_text_release(List<? extends w> list, c1 fontWeight, boolean z10, c1 c1Var, c1 c1Var2) {
        kotlin.jvm.internal.e0.checkNotNullParameter(list, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(fontWeight, "fontWeight");
        int size = list.size();
        c1 c1Var3 = null;
        c1 c1Var4 = null;
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                break;
            }
            c1 weight = list.get(i10).getWeight();
            if ((c1Var == null || weight.compareTo(c1Var) >= 0) && (c1Var2 == null || weight.compareTo(c1Var2) <= 0)) {
                if (weight.compareTo(fontWeight) >= 0) {
                    if (weight.compareTo(fontWeight) <= 0) {
                        c1Var3 = weight;
                        c1Var4 = c1Var3;
                        break;
                    }
                    if (c1Var4 == null || weight.compareTo(c1Var4) < 0) {
                        c1Var4 = weight;
                    }
                } else if (c1Var3 == null || weight.compareTo(c1Var3) > 0) {
                    c1Var3 = weight;
                }
            }
            i10++;
        }
        if (!z10 ? c1Var4 != null : c1Var3 == null) {
            c1Var3 = c1Var4;
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size2 = list.size();
        for (int i11 = 0; i11 < size2; i11++) {
            w wVar = list.get(i11);
            if (kotlin.jvm.internal.e0.areEqual(wVar.getWeight(), c1Var3)) {
                arrayList.add(wVar);
            }
        }
        return arrayList;
    }

    /* renamed from: matchFont-RetOiIg, reason: not valid java name */
    public final List<w> m5478matchFontRetOiIg(x fontFamily, c1 fontWeight, int i10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(fontFamily, "fontFamily");
        kotlin.jvm.internal.e0.checkNotNullParameter(fontWeight, "fontWeight");
        if (fontFamily instanceof l0) {
            return m5477matchFontRetOiIg((l0) fontFamily, fontWeight, i10);
        }
        throw new IllegalArgumentException("Only FontFamily instances that presents a list of Fonts can be used");
    }

    /* renamed from: matchFont-RetOiIg, reason: not valid java name */
    public final List<w> m5477matchFontRetOiIg(l0 fontFamily, c1 fontWeight, int i10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(fontFamily, "fontFamily");
        kotlin.jvm.internal.e0.checkNotNullParameter(fontWeight, "fontWeight");
        return m5476matchFontRetOiIg(fontFamily.getFonts(), fontWeight, i10);
    }

    /* renamed from: matchFont-RetOiIg, reason: not valid java name */
    public final List<w> m5476matchFontRetOiIg(List<? extends w> fontList, c1 fontWeight, int i10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(fontList, "fontList");
        kotlin.jvm.internal.e0.checkNotNullParameter(fontWeight, "fontWeight");
        ArrayList arrayList = new ArrayList(fontList.size());
        int size = fontList.size();
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            w wVar = fontList.get(i12);
            w wVar2 = wVar;
            if (kotlin.jvm.internal.e0.areEqual(wVar2.getWeight(), fontWeight) && y0.m5485equalsimpl0(wVar2.mo5433getStyle_LCdwA(), i10)) {
                arrayList.add(wVar);
            }
        }
        if (!arrayList.isEmpty()) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList(fontList.size());
        int size2 = fontList.size();
        for (int i13 = 0; i13 < size2; i13++) {
            w wVar3 = fontList.get(i13);
            if (y0.m5485equalsimpl0(wVar3.mo5433getStyle_LCdwA(), i10)) {
                arrayList2.add(wVar3);
            }
        }
        if (!arrayList2.isEmpty()) {
            fontList = arrayList2;
        }
        List<? extends w> list = fontList;
        c1.a aVar = c1.f72258c;
        c1 c1Var = null;
        if (fontWeight.compareTo(aVar.getW400()) < 0) {
            int size3 = list.size();
            c1 c1Var2 = null;
            int i14 = 0;
            while (true) {
                if (i14 >= size3) {
                    break;
                }
                c1 weight = list.get(i14).getWeight();
                if (weight.compareTo(fontWeight) < 0) {
                    if (c1Var == null || weight.compareTo(c1Var) > 0) {
                        c1Var = weight;
                    }
                } else {
                    if (weight.compareTo(fontWeight) <= 0) {
                        c1Var2 = weight;
                        c1Var = c1Var2;
                        break;
                    }
                    if (c1Var2 == null || weight.compareTo(c1Var2) < 0) {
                        c1Var2 = weight;
                    }
                }
                i14++;
            }
            if (c1Var != null) {
                c1Var2 = c1Var;
            }
            ArrayList arrayList3 = new ArrayList(list.size());
            int size4 = list.size();
            while (i11 < size4) {
                w wVar4 = list.get(i11);
                if (kotlin.jvm.internal.e0.areEqual(wVar4.getWeight(), c1Var2)) {
                    arrayList3.add(wVar4);
                }
                i11++;
            }
            return arrayList3;
        }
        if (fontWeight.compareTo(aVar.getW500()) > 0) {
            int size5 = list.size();
            c1 c1Var3 = null;
            int i15 = 0;
            while (true) {
                if (i15 >= size5) {
                    break;
                }
                c1 weight2 = list.get(i15).getWeight();
                if (weight2.compareTo(fontWeight) < 0) {
                    if (c1Var == null || weight2.compareTo(c1Var) > 0) {
                        c1Var = weight2;
                    }
                } else {
                    if (weight2.compareTo(fontWeight) <= 0) {
                        c1Var3 = weight2;
                        c1Var = c1Var3;
                        break;
                    }
                    if (c1Var3 == null || weight2.compareTo(c1Var3) < 0) {
                        c1Var3 = weight2;
                    }
                }
                i15++;
            }
            if (c1Var3 == null) {
                c1Var3 = c1Var;
            }
            ArrayList arrayList4 = new ArrayList(list.size());
            int size6 = list.size();
            while (i11 < size6) {
                w wVar5 = list.get(i11);
                if (kotlin.jvm.internal.e0.areEqual(wVar5.getWeight(), c1Var3)) {
                    arrayList4.add(wVar5);
                }
                i11++;
            }
            return arrayList4;
        }
        c1 w500 = aVar.getW500();
        int size7 = list.size();
        c1 c1Var4 = null;
        c1 c1Var5 = null;
        int i16 = 0;
        while (true) {
            if (i16 >= size7) {
                break;
            }
            c1 weight3 = list.get(i16).getWeight();
            if (w500 == null || weight3.compareTo(w500) <= 0) {
                if (weight3.compareTo(fontWeight) < 0) {
                    if (c1Var4 == null || weight3.compareTo(c1Var4) > 0) {
                        c1Var4 = weight3;
                    }
                } else {
                    if (weight3.compareTo(fontWeight) <= 0) {
                        c1Var4 = weight3;
                        c1Var5 = c1Var4;
                        break;
                    }
                    if (c1Var5 == null || weight3.compareTo(c1Var5) < 0) {
                        c1Var5 = weight3;
                    }
                }
            }
            i16++;
        }
        if (c1Var5 != null) {
            c1Var4 = c1Var5;
        }
        ArrayList arrayList5 = new ArrayList(list.size());
        int size8 = list.size();
        for (int i17 = 0; i17 < size8; i17++) {
            w wVar6 = list.get(i17);
            if (kotlin.jvm.internal.e0.areEqual(wVar6.getWeight(), c1Var4)) {
                arrayList5.add(wVar6);
            }
        }
        if (!arrayList5.isEmpty()) {
            return arrayList5;
        }
        c1 w5002 = c1.f72258c.getW500();
        int size9 = list.size();
        c1 c1Var6 = null;
        int i18 = 0;
        while (true) {
            if (i18 >= size9) {
                break;
            }
            c1 weight4 = list.get(i18).getWeight();
            if (w5002 == null || weight4.compareTo(w5002) >= 0) {
                if (weight4.compareTo(fontWeight) < 0) {
                    if (c1Var == null || weight4.compareTo(c1Var) > 0) {
                        c1Var = weight4;
                    }
                } else {
                    if (weight4.compareTo(fontWeight) <= 0) {
                        c1Var = weight4;
                        c1Var6 = c1Var;
                        break;
                    }
                    if (c1Var6 == null || weight4.compareTo(c1Var6) < 0) {
                        c1Var6 = weight4;
                    }
                }
            }
            i18++;
        }
        if (c1Var6 != null) {
            c1Var = c1Var6;
        }
        ArrayList arrayList6 = new ArrayList(list.size());
        int size10 = list.size();
        while (i11 < size10) {
            w wVar7 = list.get(i11);
            if (kotlin.jvm.internal.e0.areEqual(wVar7.getWeight(), c1Var)) {
                arrayList6.add(wVar7);
            }
            i11++;
        }
        return arrayList6;
    }
}
