package v6;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public interface p0 {
    void deleteByWorkSpecId(String str);

    List<String> getTagsForWorkSpecId(String str);

    List<String> getWorkSpecIdsWithTag(String str);

    void insert(o0 o0Var);

    default void insertTags(String id2, Set<String> tags) {
        kotlin.jvm.internal.e0.checkNotNullParameter(id2, "id");
        kotlin.jvm.internal.e0.checkNotNullParameter(tags, "tags");
        Iterator<T> it = tags.iterator();
        while (it.hasNext()) {
            insert(new o0((String) it.next(), id2));
        }
    }
}
