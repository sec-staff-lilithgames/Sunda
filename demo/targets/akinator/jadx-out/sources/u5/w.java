package u5;

import java.util.Comparator;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class w implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return xu.d.compareValues((Integer) ((Map.Entry) obj).getKey(), (Integer) ((Map.Entry) obj2).getKey());
    }
}
