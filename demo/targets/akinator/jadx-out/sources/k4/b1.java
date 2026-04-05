package k4;

import java.io.File;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class b1 extends kotlin.jvm.internal.f0 implements kv.l {

    /* renamed from: e, reason: collision with root package name */
    public static final b1 f70283e = new b1(1);

    @Override // kv.l
    public final l1 invoke(File it) {
        kotlin.jvm.internal.e0.checkNotNullParameter(it, "it");
        return n1.createSingleProcessCoordinator(it);
    }
}
