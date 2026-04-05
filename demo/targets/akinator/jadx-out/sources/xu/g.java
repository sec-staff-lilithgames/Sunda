package xu;

import java.util.Comparator;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class g implements Comparator {

    /* renamed from: b, reason: collision with root package name */
    public static final g f93554b = new g();

    @Override // java.util.Comparator
    public final Comparator<Comparable<Object>> reversed() {
        return f.f93553b;
    }

    @Override // java.util.Comparator
    public int compare(Comparable<Object> a10, Comparable<Object> b10) {
        e0.checkNotNullParameter(a10, "a");
        e0.checkNotNullParameter(b10, "b");
        return b10.compareTo(a10);
    }
}
