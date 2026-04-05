package o6;

import java.util.List;
import v6.b0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class x0 implements t.a {
    @Override // t.a, jd.j
    public n6.w0 apply(List<b0.c> list) {
        if (list == null || list.size() <= 0) {
            return null;
        }
        return list.get(0).toWorkInfo();
    }
}
