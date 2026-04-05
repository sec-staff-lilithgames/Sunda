package b1;

import com.amazon.aps.shared.util.APSSharedUtil;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class d {
    public static final <T> boolean fastAll(List<? extends T> list, kv.l lVar) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (!((Boolean) lVar.invoke(list.get(i10))).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public static final <T> boolean fastAny(List<? extends T> list, kv.l lVar) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (((Boolean) lVar.invoke(list.get(i10))).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    public static final <T> List<T> fastFilterIndexed(List<? extends T> list, kv.p pVar) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            T t10 = list.get(i10);
            if (((Boolean) pVar.invoke(Integer.valueOf(i10), t10)).booleanValue()) {
                arrayList.add(t10);
            }
        }
        return arrayList;
    }

    public static final <T> void fastForEach(List<? extends T> list, kv.l lVar) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            lVar.invoke(list.get(i10));
        }
    }

    public static final <T> void fastForEachIndexed(List<? extends T> list, kv.p pVar) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            pVar.invoke(Integer.valueOf(i10), list.get(i10));
        }
    }

    public static final <T, K> Map<K, List<T>> fastGroupBy(List<? extends T> list, kv.l lVar) {
        HashMap map = new HashMap(list.size());
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            T t10 = list.get(i10);
            Object objInvoke = lVar.invoke(t10);
            Object arrayList = map.get(objInvoke);
            if (arrayList == null) {
                arrayList = new ArrayList();
                map.put(objInvoke, arrayList);
            }
            ((ArrayList) arrayList).add(t10);
        }
        return map;
    }

    public static final <T> String fastJoinToString(List<? extends T> list, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, kv.l lVar) throws IOException {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(charSequence2);
        int size = list.size();
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            Object obj = list.get(i12);
            i11++;
            if (i11 > 1) {
                sb2.append(charSequence);
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
                sb2.append((CharSequence) obj.toString());
            }
        }
        if (i10 >= 0 && i11 > i10) {
            sb2.append(charSequence4);
        }
        sb2.append(charSequence3);
        return sb2.toString();
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

    public static final <T, R> List<R> fastMap(List<? extends T> list, kv.l lVar) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            arrayList.add(lVar.invoke(list.get(i10)));
        }
        return arrayList;
    }

    public static final <T, R> List<R> fastMapNotNull(List<? extends T> list, kv.l lVar) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            Object objInvoke = lVar.invoke(list.get(i10));
            if (objInvoke != null) {
                arrayList.add(objInvoke);
            }
        }
        return arrayList;
    }

    public static final <T> Set<T> fastToSet(List<? extends T> list) {
        HashSet hashSet = new HashSet(list.size());
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            hashSet.add(list.get(i10));
        }
        return hashSet;
    }
}
