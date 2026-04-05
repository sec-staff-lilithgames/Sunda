package zu;

import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public abstract class i {
    public static m plus(m mVar, m context) {
        e0.checkNotNullParameter(context, "context");
        return context == n.f98854b ? mVar : (m) context.fold(mVar, new a1.n(14));
    }
}
