package g2;

import com.amazon.aps.shared.util.APSSharedUtil;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class v1 {
    public static final <T, K> List<T> fastDistinctBy(List<? extends T> list, kv.l selector) {
        kotlin.jvm.internal.e0.checkNotNullParameter(list, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(selector, "selector");
        HashSet hashSet = new HashSet(list.size());
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            T t10 = list.get(i10);
            if (hashSet.add(selector.invoke(t10))) {
                arrayList.add(t10);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> List<T> fastDrop(List<? extends T> list, int i10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(list, "<this>");
        if (i10 < 0) {
            throw new IllegalArgumentException(o2.k(i10, "Requested element count ", " is less than zero.").toString());
        }
        if (i10 == 0) {
            return list;
        }
        int size = list.size() - i10;
        if (size <= 0) {
            return uu.p0.emptyList();
        }
        if (size == 1) {
            return uu.o0.listOf(uu.y0.last((List) list));
        }
        ArrayList arrayList = new ArrayList(size);
        int size2 = list.size();
        while (i10 < size2) {
            arrayList.add(list.get(i10));
            i10++;
        }
        return arrayList;
    }

    public static final <T> List<T> fastFilter(List<? extends T> list, kv.l predicate) {
        kotlin.jvm.internal.e0.checkNotNullParameter(list, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            T t10 = list.get(i10);
            if (((Boolean) predicate.invoke(t10)).booleanValue()) {
                arrayList.add(t10);
            }
        }
        return arrayList;
    }

    public static final <T> List<T> fastFilterNot(List<? extends T> list, kv.l predicate) {
        kotlin.jvm.internal.e0.checkNotNullParameter(list, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            T t10 = list.get(i10);
            if (!((Boolean) predicate.invoke(t10)).booleanValue()) {
                arrayList.add(t10);
            }
        }
        return arrayList;
    }

    public static final <T> List<T> fastFilterNotNull(List<? extends T> list) {
        kotlin.jvm.internal.e0.checkNotNullParameter(list, "<this>");
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            T t10 = list.get(i10);
            if (t10 != null) {
                arrayList.add(t10);
            }
        }
        return arrayList;
    }

    public static final <T, R> List<R> fastFlatMap(List<? extends T> list, kv.l transform) {
        kotlin.jvm.internal.e0.checkNotNullParameter(list, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            uu.v0.addAll(arrayList, (Iterable) transform.invoke(list.get(i10)));
        }
        return arrayList;
    }

    public static final <T, R> R fastFold(List<? extends T> list, R r10, kv.p operation) {
        kotlin.jvm.internal.e0.checkNotNullParameter(list, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(operation, "operation");
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            r10 = (R) operation.invoke(r10, list.get(i10));
        }
        return r10;
    }

    public static final <T> String fastJoinToString(List<? extends T> list, CharSequence separator, CharSequence prefix, CharSequence postfix, int i10, CharSequence truncated, kv.l lVar) throws IOException {
        kotlin.jvm.internal.e0.checkNotNullParameter(list, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(separator, "separator");
        kotlin.jvm.internal.e0.checkNotNullParameter(prefix, "prefix");
        kotlin.jvm.internal.e0.checkNotNullParameter(postfix, "postfix");
        kotlin.jvm.internal.e0.checkNotNullParameter(truncated, "truncated");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(prefix);
        int size = list.size();
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            Object obj = list.get(i12);
            i11++;
            if (i11 > 1) {
                sb2.append(separator);
            }
            if (i10 >= 0 && i11 > i10) {
                break;
            }
            if (lVar != null) {
                sb2.append((CharSequence) lVar.invoke(obj));
            } else if (obj != null ? obj instanceof CharSequence : true) {
                sb2.append((CharSequence) obj);
            } else if (obj instanceof Character) {
                sb2.append(((Character) obj).charValue());
            } else {
                sb2.append((CharSequence) String.valueOf(obj));
            }
        }
        if (i10 >= 0 && i11 > i10) {
            sb2.append(truncated);
        }
        sb2.append(postfix);
        String string = sb2.toString();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(string, "fastJoinTo(StringBuilder…form)\n        .toString()");
        return string;
    }

    public static /* synthetic */ String fastJoinToString$default(List list, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, kv.l lVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            charSequence = ", ";
        }
        if ((i11 & 2) != 0) {
            charSequence2 = "";
        }
        if ((i11 & 4) != 0) {
            charSequence3 = "";
        }
        if ((i11 & 8) != 0) {
            i10 = -1;
        }
        if ((i11 & 16) != 0) {
            charSequence4 = APSSharedUtil.TRUNCATE_SEPARATOR;
        }
        if ((i11 & 32) != 0) {
            lVar = null;
        }
        CharSequence charSequence5 = charSequence4;
        kv.l lVar2 = lVar;
        return fastJoinToString(list, charSequence, charSequence2, charSequence3, i10, charSequence5, lVar2);
    }

    public static final <T, R extends Comparable<? super R>> T fastMinByOrNull(List<? extends T> list, kv.l selector) {
        kotlin.jvm.internal.e0.checkNotNullParameter(list, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(selector, "selector");
        if (list.isEmpty()) {
            return null;
        }
        T t10 = list.get(0);
        Comparable comparable = (Comparable) selector.invoke(t10);
        int lastIndex = uu.p0.getLastIndex(list);
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                T t11 = list.get(i10);
                Comparable comparable2 = (Comparable) selector.invoke(t11);
                if (comparable.compareTo(comparable2) > 0) {
                    t10 = t11;
                    comparable = comparable2;
                }
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return t10;
    }

    public static final <T> List<T> fastTakeWhile(List<? extends T> list, kv.l predicate) {
        kotlin.jvm.internal.e0.checkNotNullParameter(list, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            T t10 = list.get(i10);
            if (!((Boolean) predicate.invoke(t10)).booleanValue()) {
                break;
            }
            arrayList.add(t10);
        }
        return arrayList;
    }
}
