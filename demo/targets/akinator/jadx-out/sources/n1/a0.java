package n1;

import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class a0 extends kotlin.jvm.internal.f0 implements kv.p {

    /* renamed from: e, reason: collision with root package name */
    public static final a0 f75272e = new a0(2);

    @Override // kv.p
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((b) obj, (List<? extends g>) obj2);
        return tu.x0.f87415a;
    }

    public final void invoke(b set, List<? extends g> it) {
        kotlin.jvm.internal.e0.checkNotNullParameter(set, "$this$set");
        kotlin.jvm.internal.e0.checkNotNullParameter(it, "it");
        set.setClipPathData(it);
    }
}
