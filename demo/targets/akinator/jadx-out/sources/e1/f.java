package e1;

import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.f0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class f extends f0 implements kv.p {

    /* renamed from: e, reason: collision with root package name */
    public static final f f53474e = new f(2);

    @Override // kv.p
    public final String invoke(String acc, u element) {
        e0.checkNotNullParameter(acc, "acc");
        e0.checkNotNullParameter(element, "element");
        if (acc.length() == 0) {
            return element.toString();
        }
        return acc + ", " + element;
    }
}
