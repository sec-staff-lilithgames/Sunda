package e1;

import com.amazon.aps.shared.util.APSSharedUtil;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.e0;
import uu.p0;
import uu.y0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class z {
    /* JADX WARN: Multi-variable type inference failed */
    public static final <T, K, V> Map<K, V> fastAssociate(List<? extends T> list, kv.l transform) {
        e0.checkNotNullParameter(list, "<this>");
        e0.checkNotNullParameter(transform, "transform");
        LinkedHashMap linkedHashMap = new LinkedHashMap(list.size());
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            tu.v vVar = (tu.v) transform.invoke(list.get(i10));
            linkedHashMap.put(vVar.getFirst(), vVar.getSecond());
        }
        return linkedHashMap;
    }

    public static final <T> String fastJoinToString(List<? extends T> list, CharSequence separator, CharSequence prefix, CharSequence postfix, int i10, CharSequence truncated, kv.l lVar) throws IOException {
        e0.checkNotNullParameter(list, "<this>");
        e0.checkNotNullParameter(separator, "separator");
        e0.checkNotNullParameter(prefix, "prefix");
        e0.checkNotNullParameter(postfix, "postfix");
        e0.checkNotNullParameter(truncated, "truncated");
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
        e0.checkNotNullExpressionValue(string, "fastJoinTo(StringBuilder…form)\n        .toString()");
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

    public static final <T, R> List<R> fastMapNotNull(List<? extends T> list, kv.l transform) {
        e0.checkNotNullParameter(list, "<this>");
        e0.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            Object objInvoke = transform.invoke(list.get(i10));
            if (objInvoke != null) {
                arrayList.add(objInvoke);
            }
        }
        return arrayList;
    }

    public static final <S, T extends S> S fastReduce(List<? extends T> list, kv.p operation) {
        e0.checkNotNullParameter(list, "<this>");
        e0.checkNotNullParameter(operation, "operation");
        if (list.isEmpty()) {
            throw new UnsupportedOperationException("Empty collection can't be reduced.");
        }
        S s10 = (S) y0.first((List) list);
        int lastIndex = p0.getLastIndex(list);
        int i10 = 1;
        if (1 <= lastIndex) {
            while (true) {
                s10 = (S) operation.invoke(s10, list.get(i10));
                if (i10 == lastIndex) {
                    break;
                }
                i10++;
            }
        }
        return s10;
    }

    public static final <T, R, V> List<V> fastZip(List<? extends T> list, List<? extends R> other, kv.p transform) {
        e0.checkNotNullParameter(list, "<this>");
        e0.checkNotNullParameter(other, "other");
        e0.checkNotNullParameter(transform, "transform");
        int iMin = Math.min(list.size(), other.size());
        ArrayList arrayList = new ArrayList(iMin);
        for (int i10 = 0; i10 < iMin; i10++) {
            arrayList.add(transform.invoke(list.get(i10), other.get(i10)));
        }
        return arrayList;
    }

    public static final <T, R> List<R> fastZipWithNext(List<? extends T> list, kv.p transform) {
        e0.checkNotNullParameter(list, "<this>");
        e0.checkNotNullParameter(transform, "transform");
        if (list.size() == 0 || list.size() == 1) {
            return p0.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        T t10 = list.get(0);
        int lastIndex = p0.getLastIndex(list);
        while (i10 < lastIndex) {
            i10++;
            T t11 = list.get(i10);
            arrayList.add(transform.invoke(t10, t11));
            t10 = t11;
        }
        return arrayList;
    }
}
