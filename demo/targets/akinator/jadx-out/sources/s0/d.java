package s0;

import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public interface d extends List, b, lv.a {
    @Override // s0.d
    default d subList(int i10, int i11) {
        return new c(this, i10, i11);
    }
}
