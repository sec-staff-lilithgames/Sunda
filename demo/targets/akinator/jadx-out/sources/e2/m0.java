package e2;

import java.util.Collection;
import java.util.List;
import uu.y0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class m0 extends kotlin.jvm.internal.f0 implements kv.p {

    /* renamed from: e, reason: collision with root package name */
    public static final m0 f53551e = new m0(2);

    @Override // kv.p
    public final List<g2.b> invoke(List<g2.b> list, List<g2.b> childValue) {
        List<g2.b> mutableList;
        kotlin.jvm.internal.e0.checkNotNullParameter(childValue, "childValue");
        if (list == null || (mutableList = y0.toMutableList((Collection) list)) == null) {
            return childValue;
        }
        mutableList.addAll(childValue);
        return mutableList;
    }
}
