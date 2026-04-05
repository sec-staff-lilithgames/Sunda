package g0;

import java.util.List;
import x1.q1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class b0 extends kotlin.jvm.internal.f0 implements kv.l {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ x1.q1[] f56354e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ List f56355f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ x1.a1 f56356g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.z0 f56357h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.z0 f56358i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ e1.d f56359j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(x1.q1[] q1VarArr, List list, x1.a1 a1Var, kotlin.jvm.internal.z0 z0Var, kotlin.jvm.internal.z0 z0Var2, e1.d dVar) {
        super(1);
        this.f56354e = q1VarArr;
        this.f56355f = list;
        this.f56356g = a1Var;
        this.f56357h = z0Var;
        this.f56358i = z0Var2;
        this.f56359j = dVar;
    }

    @Override // kv.l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((q1.a) obj);
        return tu.x0.f87415a;
    }

    public final void invoke(q1.a layout) {
        kotlin.jvm.internal.e0.checkNotNullParameter(layout, "$this$layout");
        x1.q1[] q1VarArr = this.f56354e;
        int length = q1VarArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            x1.q1 q1Var = q1VarArr[i10];
            int i12 = i11 + 1;
            if (q1Var == null) {
                throw new NullPointerException("null cannot be cast to non-null type androidx.compose.ui.layout.Placeable");
            }
            d0.access$placeInBox(layout, q1Var, (x1.w0) this.f56355f.get(i11), this.f56356g.getLayoutDirection(), this.f56357h.f71866b, this.f56358i.f71866b, this.f56359j);
            i10++;
            i11 = i12;
        }
    }
}
