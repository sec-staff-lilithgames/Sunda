package x1;

import java.util.ArrayList;
import x1.q1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class w1 extends kotlin.jvm.internal.f0 implements kv.l {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ArrayList f91448e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w1(ArrayList arrayList) {
        super(1);
        this.f91448e = arrayList;
    }

    @Override // kv.l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((q1.a) obj);
        return tu.x0.f87415a;
    }

    public final void invoke(q1.a layout) {
        kotlin.jvm.internal.e0.checkNotNullParameter(layout, "$this$layout");
        ArrayList arrayList = this.f91448e;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            q1.a.placeRelativeWithLayer$default(layout, (q1) arrayList.get(i10), 0, 0, 0.0f, null, 12, null);
        }
    }
}
