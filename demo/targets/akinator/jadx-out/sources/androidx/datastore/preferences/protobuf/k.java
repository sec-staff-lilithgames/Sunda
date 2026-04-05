package androidx.datastore.preferences.protobuf;

import com.inmobi.commons.core.configs.AdConfig;
import java.util.Comparator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class k implements Comparator {
    @Override // java.util.Comparator
    public int compare(x xVar, x xVar2) {
        p it = xVar.iterator();
        p it2 = xVar2.iterator();
        while (it.hasNext() && it2.hasNext()) {
            int iCompareTo = Integer.valueOf(it.nextByte() & AdConfig.NETWORK_LOAD_LIMIT_DISABLED).compareTo(Integer.valueOf(it2.nextByte() & AdConfig.NETWORK_LOAD_LIMIT_DISABLED));
            if (iCompareTo != 0) {
                return iCompareTo;
            }
        }
        return Integer.valueOf(xVar.size()).compareTo(Integer.valueOf(xVar2.size()));
    }
}
