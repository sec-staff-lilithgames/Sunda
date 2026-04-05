package g0;

import java.util.List;
import x1.q1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class o2 extends kotlin.jvm.internal.f0 implements kv.l {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ List f56535e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ x1.q1[] f56536f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ kv.s f56537g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f56538h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ x1.a1 f56539i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int[] f56540j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ b2 f56541k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ r2[] f56542l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ l0 f56543m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f56544n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.z0 f56545o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o2(List list, x1.q1[] q1VarArr, kv.s sVar, int i10, x1.a1 a1Var, int[] iArr, b2 b2Var, r2[] r2VarArr, l0 l0Var, int i11, kotlin.jvm.internal.z0 z0Var) {
        super(1);
        this.f56535e = list;
        this.f56536f = q1VarArr;
        this.f56537g = sVar;
        this.f56538h = i10;
        this.f56539i = a1Var;
        this.f56540j = iArr;
        this.f56541k = b2Var;
        this.f56542l = r2VarArr;
        this.f56543m = l0Var;
        this.f56544n = i11;
        this.f56545o = z0Var;
    }

    @Override // kv.l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((q1.a) obj);
        return tu.x0.f87415a;
    }

    public final void invoke(q1.a layout) {
        b2 b2Var;
        x1.q1[] q1VarArr;
        q1.a aVar = layout;
        kotlin.jvm.internal.e0.checkNotNullParameter(layout, "$this$layout");
        int size = this.f56535e.size();
        int[] iArr = new int[size];
        int i10 = 0;
        int i11 = 0;
        while (true) {
            b2Var = this.f56541k;
            q1VarArr = this.f56536f;
            if (i11 >= size) {
                break;
            }
            x1.q1 q1Var = q1VarArr[i11];
            kotlin.jvm.internal.e0.checkNotNull(q1Var);
            iArr[i11] = q2.access$rowColumnMeasurePolicy_TDGSqEk$mainAxisSize(q1Var, b2Var);
            i11++;
        }
        Integer numValueOf = Integer.valueOf(this.f56538h);
        x1.a1 a1Var = this.f56539i;
        this.f56537g.invoke(numValueOf, iArr, a1Var.getLayoutDirection(), this.f56539i, this.f56540j);
        int length = q1VarArr.length;
        int i12 = 0;
        while (i10 < length) {
            int i13 = i12;
            x1.q1 q1Var2 = q1VarArr[i10];
            int i14 = i13 + 1;
            kotlin.jvm.internal.e0.checkNotNull(q1Var2);
            l0 l0VarAccess$getCrossAxisAlignment = q2.access$getCrossAxisAlignment(this.f56542l[i13]);
            if (l0VarAccess$getCrossAxisAlignment == null) {
                l0VarAccess$getCrossAxisAlignment = this.f56543m;
            }
            int iAccess$rowColumnMeasurePolicy_TDGSqEk$crossAxisSize = this.f56544n - q2.access$rowColumnMeasurePolicy_TDGSqEk$crossAxisSize(q1Var2, b2Var);
            b2 b2Var2 = b2.f56364b;
            int iAlign$foundation_layout_release = l0VarAccess$getCrossAxisAlignment.align$foundation_layout_release(iAccess$rowColumnMeasurePolicy_TDGSqEk$crossAxisSize, b2Var == b2Var2 ? s2.x.f85363b : a1Var.getLayoutDirection(), q1Var2, this.f56545o.f71866b);
            int[] iArr2 = this.f56540j;
            if (b2Var == b2Var2) {
                q1.a.place$default(aVar, q1Var2, iArr2[i13], iAlign$foundation_layout_release, 0.0f, 4, null);
            } else {
                q1.a.place$default(layout, q1Var2, iAlign$foundation_layout_release, iArr2[i13], 0.0f, 4, null);
            }
            i10++;
            aVar = layout;
            i12 = i14;
        }
    }
}
