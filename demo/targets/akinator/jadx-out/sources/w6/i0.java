package w6;

import n6.d1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class i0 {
    public static final void safeAccept(w3.b bVar, d1 info, String tag) {
        kotlin.jvm.internal.e0.checkNotNullParameter(bVar, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(info, "info");
        kotlin.jvm.internal.e0.checkNotNullParameter(tag, "tag");
        try {
            bVar.accept(info);
        } catch (Throwable th2) {
            n6.c0.get().error(tag, "Exception handler threw an exception", th2);
        }
    }
}
