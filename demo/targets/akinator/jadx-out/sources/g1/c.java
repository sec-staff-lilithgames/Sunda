package g1;

import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.f0;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class c extends f0 implements kv.l {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kv.l f56666e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(kv.l lVar) {
        super(1);
        this.f56666e = lVar;
    }

    @Override // kv.l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((l1.e) obj);
        return x0.f87415a;
    }

    public final void invoke(l1.e onDrawWithContent) {
        e0.checkNotNullParameter(onDrawWithContent, "$this$onDrawWithContent");
        this.f56666e.invoke(onDrawWithContent);
        onDrawWithContent.drawContent();
    }
}
