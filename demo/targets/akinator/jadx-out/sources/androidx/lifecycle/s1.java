package androidx.lifecycle;

import java.util.HashMap;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class s1 {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f6707a = new HashMap();

    public boolean approveCall(String name, int i10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(name, "name");
        HashMap map = this.f6707a;
        Integer num = (Integer) map.get(name);
        int iIntValue = num != null ? num.intValue() : 0;
        boolean z10 = (iIntValue & i10) != 0;
        map.put(name, Integer.valueOf(i10 | iIntValue));
        return !z10;
    }
}
