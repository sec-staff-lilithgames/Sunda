package qw;

import java.util.Comparator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class t implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return xu.d.compareValues(((q) obj).getCanonicalPath(), ((q) obj2).getCanonicalPath());
    }
}
