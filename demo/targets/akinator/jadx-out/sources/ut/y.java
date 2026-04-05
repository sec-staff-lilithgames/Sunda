package ut;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class y implements st.o {

    /* renamed from: b, reason: collision with root package name */
    public final Comparator f88696b;

    public y(Comparator comparator) {
        this.f88696b = comparator;
    }

    @Override // st.o
    public List<Object> apply(List<Object> list) {
        Collections.sort(list, this.f88696b);
        return list;
    }
}
