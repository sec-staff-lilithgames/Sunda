package bk;

import android.content.Context;
import bi.q;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public abstract class i {
    public static bi.c create(String str, String str2) {
        return bi.c.intoSet(new a(str, str2), (Class<a>) f.class);
    }

    public static bi.c fromContext(String str, h hVar) {
        return bi.c.intoSetBuilder(f.class).add(q.required((Class<?>) Context.class)).factory(new g(str, hVar, 0)).build();
    }
}
