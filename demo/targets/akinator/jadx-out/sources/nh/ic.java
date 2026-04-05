package nh;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class ic implements mh.v2, Serializable {

    /* renamed from: b, reason: collision with root package name */
    public final int f76359b;

    public ic(int i10) {
        jh.i.o(i10, "expectedValuesPerKey");
        this.f76359b = i10;
    }

    @Override // mh.v2
    public List<Object> get() {
        return new ArrayList(this.f76359b);
    }
}
