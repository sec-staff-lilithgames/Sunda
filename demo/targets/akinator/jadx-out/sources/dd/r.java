package dd;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class r {
    public static q buildCheckerIfNeeded(Set<String> set, Set<String> set2) {
        if (set2 == null && (set == null || set.isEmpty())) {
            return null;
        }
        return q.construct(set, set2);
    }

    public static Set<String> combineNamesToInclude(Set<String> set, Set<String> set2) {
        if (set == null) {
            return set2;
        }
        if (set2 == null) {
            return set;
        }
        HashSet hashSet = new HashSet();
        for (String str : set2) {
            if (set.contains(str)) {
                hashSet.add(str);
            }
        }
        return hashSet;
    }

    public static boolean shouldIgnore(Object obj, Collection<String> collection, Collection<String> collection2) {
        if (collection == null && collection2 == null) {
            return false;
        }
        return collection2 == null ? collection.contains(obj) : collection == null ? !collection2.contains(obj) : !collection2.contains(obj) || collection.contains(obj);
    }
}
