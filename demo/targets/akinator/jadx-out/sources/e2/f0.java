package e2;

import java.util.Collection;
import java.util.List;
import uu.y0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class f0 extends kotlin.jvm.internal.f0 implements kv.p {

    /* renamed from: e, reason: collision with root package name */
    public static final f0 f53521e = new f0(2);

    @Override // kv.p
    public final List<String> invoke(List<String> list, List<String> childValue) {
        List<String> mutableList;
        kotlin.jvm.internal.e0.checkNotNullParameter(childValue, "childValue");
        if (list == null || (mutableList = y0.toMutableList((Collection) list)) == null) {
            return childValue;
        }
        mutableList.addAll(childValue);
        return mutableList;
    }
}
