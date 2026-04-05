package g2;

import g2.b;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class k {
    public static final void a(List list, TreeSet treeSet) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            b.C0570b c0570b = (b.C0570b) list.get(i10);
            treeSet.add(Integer.valueOf(c0570b.getStart()));
            treeSet.add(Integer.valueOf(c0570b.getEnd()));
        }
    }

    public static final b transform(b bVar, kv.q transform) {
        kotlin.jvm.internal.e0.checkNotNullParameter(bVar, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(transform, "transform");
        TreeSet treeSetSortedSetOf = uu.b2.sortedSetOf(0, Integer.valueOf(bVar.getText().length()));
        a(bVar.getSpanStyles(), treeSetSortedSetOf);
        a(bVar.getParagraphStyles(), treeSetSortedSetOf);
        kotlin.jvm.internal.b1 b1Var = new kotlin.jvm.internal.b1();
        b1Var.f71816b = "";
        Map mapMutableMapOf = uu.p1.mutableMapOf(tu.e0.to(0, 0));
        uu.y0.windowed$default(treeSetSortedSetOf, 2, 0, false, new j(b1Var, transform, bVar, mapMutableMapOf), 6, null);
        List<b.C0570b> spanStyles = bVar.getSpanStyles();
        ArrayList arrayList = new ArrayList(spanStyles.size());
        int size = spanStyles.size();
        for (int i10 = 0; i10 < size; i10++) {
            b.C0570b c0570b = spanStyles.get(i10);
            Object item = c0570b.getItem();
            Object obj = mapMutableMapOf.get(Integer.valueOf(c0570b.getStart()));
            kotlin.jvm.internal.e0.checkNotNull(obj);
            int iIntValue = ((Number) obj).intValue();
            Object obj2 = mapMutableMapOf.get(Integer.valueOf(c0570b.getEnd()));
            kotlin.jvm.internal.e0.checkNotNull(obj2);
            arrayList.add(new b.C0570b(item, iIntValue, ((Number) obj2).intValue()));
        }
        List<b.C0570b> paragraphStyles = bVar.getParagraphStyles();
        ArrayList arrayList2 = new ArrayList(paragraphStyles.size());
        int size2 = paragraphStyles.size();
        for (int i11 = 0; i11 < size2; i11++) {
            b.C0570b c0570b2 = paragraphStyles.get(i11);
            Object item2 = c0570b2.getItem();
            Object obj3 = mapMutableMapOf.get(Integer.valueOf(c0570b2.getStart()));
            kotlin.jvm.internal.e0.checkNotNull(obj3);
            int iIntValue2 = ((Number) obj3).intValue();
            Object obj4 = mapMutableMapOf.get(Integer.valueOf(c0570b2.getEnd()));
            kotlin.jvm.internal.e0.checkNotNull(obj4);
            arrayList2.add(new b.C0570b(item2, iIntValue2, ((Number) obj4).intValue()));
        }
        List<b.C0570b> annotations$ui_text_release = bVar.getAnnotations$ui_text_release();
        ArrayList arrayList3 = new ArrayList(annotations$ui_text_release.size());
        int size3 = annotations$ui_text_release.size();
        for (int i12 = 0; i12 < size3; i12++) {
            b.C0570b c0570b3 = annotations$ui_text_release.get(i12);
            Object item3 = c0570b3.getItem();
            Object obj5 = mapMutableMapOf.get(Integer.valueOf(c0570b3.getStart()));
            kotlin.jvm.internal.e0.checkNotNull(obj5);
            int iIntValue3 = ((Number) obj5).intValue();
            Object obj6 = mapMutableMapOf.get(Integer.valueOf(c0570b3.getEnd()));
            kotlin.jvm.internal.e0.checkNotNull(obj6);
            arrayList3.add(new b.C0570b(item3, iIntValue3, ((Number) obj6).intValue()));
        }
        return new b((String) b1Var.f71816b, arrayList, arrayList2, arrayList3);
    }
}
