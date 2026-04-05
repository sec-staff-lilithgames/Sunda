package iu;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class a0 implements st.o {

    /* renamed from: b, reason: collision with root package name */
    public final Comparator f68399b;

    public a0(Comparator<Object> comparator) {
        this.f68399b = comparator;
    }

    @Override // st.o
    public List<Object> apply(List<Object> list) throws Exception {
        Collections.sort(list, this.f68399b);
        return list;
    }
}
