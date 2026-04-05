package b2;

import e2.c0;
import e2.n0;
import e2.p;
import e2.r;
import i1.h;
import i1.i;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.e0;
import uu.p0;
import uu.y0;
import y3.j;
import y3.k;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class c {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.util.ArrayList] */
    public static final boolean a(ArrayList arrayList) {
        Collection collectionEmptyList;
        long jM4195unboximpl;
        if (arrayList.size() >= 2) {
            if (arrayList.size() == 0 || arrayList.size() == 1) {
                collectionEmptyList = p0.emptyList();
            } else {
                collectionEmptyList = new ArrayList();
                Object obj = arrayList.get(0);
                int lastIndex = p0.getLastIndex(arrayList);
                int i10 = 0;
                while (i10 < lastIndex) {
                    i10++;
                    Object obj2 = arrayList.get(i10);
                    c0 c0Var = (c0) obj2;
                    c0 c0Var2 = (c0) obj;
                    collectionEmptyList.add(h.m4174boximpl(i.Offset(Math.abs(h.m4185getXimpl(c0Var2.getBoundsInRoot().m4209getCenterF1C5BW0()) - h.m4185getXimpl(c0Var.getBoundsInRoot().m4209getCenterF1C5BW0())), Math.abs(h.m4186getYimpl(c0Var2.getBoundsInRoot().m4209getCenterF1C5BW0()) - h.m4186getYimpl(c0Var.getBoundsInRoot().m4209getCenterF1C5BW0())))));
                    obj = obj2;
                }
            }
            if (collectionEmptyList.size() == 1) {
                jM4195unboximpl = ((h) y0.first((List) collectionEmptyList)).m4195unboximpl();
            } else {
                if (collectionEmptyList.isEmpty()) {
                    throw new UnsupportedOperationException("Empty collection can't be reduced.");
                }
                Object objFirst = y0.first((List<? extends Object>) collectionEmptyList);
                int lastIndex2 = p0.getLastIndex(collectionEmptyList);
                if (1 <= lastIndex2) {
                    int i11 = 1;
                    while (true) {
                        objFirst = h.m4174boximpl(h.m4190plusMKHz9U(((h) objFirst).m4195unboximpl(), ((h) collectionEmptyList.get(i11)).m4195unboximpl()));
                        if (i11 == lastIndex2) {
                            break;
                        }
                        i11++;
                    }
                }
                jM4195unboximpl = ((h) objFirst).m4195unboximpl();
            }
            if (h.m4176component2impl(jM4195unboximpl) >= h.m4175component1impl(jM4195unboximpl)) {
                return false;
            }
        }
        return true;
    }

    public static final boolean hasCollectionInfo(c0 c0Var) {
        e0.checkNotNullParameter(c0Var, "<this>");
        p config = c0Var.getConfig();
        n0 n0Var = n0.f53555a;
        return (r.getOrNull(config, n0Var.getCollectionInfo()) == null && r.getOrNull(c0Var.getConfig(), n0Var.getSelectableGroup()) == null) ? false : true;
    }

    public static final void setCollectionInfo(c0 node, y3.c info) {
        e0.checkNotNullParameter(node, "node");
        e0.checkNotNullParameter(info, "info");
        p config = node.getConfig();
        n0 n0Var = n0.f53555a;
        e2.b bVar = (e2.b) r.getOrNull(config, n0Var.getCollectionInfo());
        if (bVar != null) {
            info.setCollectionInfo(j.obtain(bVar.getRowCount(), bVar.getColumnCount(), false, 0));
            return;
        }
        ArrayList arrayList = new ArrayList();
        if (r.getOrNull(node.getConfig(), n0Var.getSelectableGroup()) != null) {
            List<c0> replacedChildren$ui_release = node.getReplacedChildren$ui_release();
            int size = replacedChildren$ui_release.size();
            for (int i10 = 0; i10 < size; i10++) {
                c0 c0Var = replacedChildren$ui_release.get(i10);
                if (c0Var.getConfig().contains(n0.f53555a.getSelected())) {
                    arrayList.add(c0Var);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        boolean zA = a(arrayList);
        info.setCollectionInfo(j.obtain(zA ? 1 : arrayList.size(), zA ? arrayList.size() : 1, false, 0));
    }

    public static final void setCollectionItemInfo(c0 node, y3.c info) {
        e0.checkNotNullParameter(node, "node");
        e0.checkNotNullParameter(info, "info");
        p config = node.getConfig();
        n0 n0Var = n0.f53555a;
        e2.c cVar = (e2.c) r.getOrNull(config, n0Var.getCollectionItemInfo());
        if (cVar != null) {
            info.setCollectionItemInfo(k.obtain(cVar.getRowIndex(), cVar.getRowSpan(), cVar.getColumnIndex(), cVar.getColumnSpan(), false, ((Boolean) node.getConfig().getOrElse(n0Var.getSelected(), b.f8722e)).booleanValue()));
        }
        c0 parent = node.getParent();
        if (parent == null || r.getOrNull(parent.getConfig(), n0Var.getSelectableGroup()) == null) {
            return;
        }
        e2.b bVar = (e2.b) r.getOrNull(parent.getConfig(), n0Var.getCollectionInfo());
        if ((bVar == null || (bVar.getRowCount() >= 0 && bVar.getColumnCount() >= 0)) && node.getConfig().contains(n0Var.getSelected())) {
            ArrayList arrayList = new ArrayList();
            List<c0> replacedChildren$ui_release = parent.getReplacedChildren$ui_release();
            int size = replacedChildren$ui_release.size();
            for (int i10 = 0; i10 < size; i10++) {
                c0 c0Var = replacedChildren$ui_release.get(i10);
                if (c0Var.getConfig().contains(n0.f53555a.getSelected())) {
                    arrayList.add(c0Var);
                }
            }
            if (arrayList.isEmpty()) {
                return;
            }
            boolean zA = a(arrayList);
            int size2 = arrayList.size();
            for (int i11 = 0; i11 < size2; i11++) {
                c0 c0Var2 = (c0) arrayList.get(i11);
                if (c0Var2.getId() == node.getId()) {
                    k kVarObtain = k.obtain(zA ? 0 : i11, 1, zA ? i11 : 0, 1, false, ((Boolean) c0Var2.getConfig().getOrElse(n0.f53555a.getSelected(), a.f8721e)).booleanValue());
                    if (kVarObtain != null) {
                        info.setCollectionItemInfo(kVarObtain);
                    }
                }
            }
        }
    }
}
