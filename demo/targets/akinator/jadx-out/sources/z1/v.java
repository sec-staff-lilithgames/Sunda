package z1;

import p0.j2;
import p0.o5;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public final b0 f97424a;

    /* renamed from: b, reason: collision with root package name */
    public j2 f97425b;

    /* renamed from: c, reason: collision with root package name */
    public x1.x0 f97426c;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public a(kotlin.jvm.internal.u uVar) {
        }
    }

    static {
        new a(null);
    }

    public v(b0 layoutNode) {
        kotlin.jvm.internal.e0.checkNotNullParameter(layoutNode, "layoutNode");
        this.f97424a = layoutNode;
    }

    public final x1.x0 a() {
        j2 j2VarMutableStateOf$default = this.f97425b;
        if (j2VarMutableStateOf$default == null) {
            x1.x0 x0Var = this.f97426c;
            if (x0Var == null) {
                throw new IllegalStateException("Intrinsic size is queried but there is no measure policy in place.");
            }
            j2VarMutableStateOf$default = o5.mutableStateOf$default(x0Var, null, 2, null);
        }
        this.f97425b = j2VarMutableStateOf$default;
        return (x1.x0) j2VarMutableStateOf$default.getValue();
    }

    public final b0 getLayoutNode() {
        return this.f97424a;
    }

    public final int maxIntrinsicHeight(int i10) {
        x1.x0 x0VarA = a();
        b0 b0Var = this.f97424a;
        return x0VarA.maxIntrinsicHeight(b0Var.getMeasureScope$ui_release(), b0Var.getChildren$ui_release(), i10);
    }

    public final int maxIntrinsicWidth(int i10) {
        x1.x0 x0VarA = a();
        b0 b0Var = this.f97424a;
        return x0VarA.maxIntrinsicWidth(b0Var.getMeasureScope$ui_release(), b0Var.getChildren$ui_release(), i10);
    }

    public final int minIntrinsicHeight(int i10) {
        x1.x0 x0VarA = a();
        b0 b0Var = this.f97424a;
        return x0VarA.minIntrinsicHeight(b0Var.getMeasureScope$ui_release(), b0Var.getChildren$ui_release(), i10);
    }

    public final int minIntrinsicWidth(int i10) {
        x1.x0 x0VarA = a();
        b0 b0Var = this.f97424a;
        return x0VarA.minIntrinsicWidth(b0Var.getMeasureScope$ui_release(), b0Var.getChildren$ui_release(), i10);
    }

    public final void updateFrom(x1.x0 measurePolicy) {
        kotlin.jvm.internal.e0.checkNotNullParameter(measurePolicy, "measurePolicy");
        j2 j2Var = this.f97425b;
        if (j2Var == null) {
            this.f97426c = measurePolicy;
        } else {
            kotlin.jvm.internal.e0.checkNotNull(j2Var);
            j2Var.setValue(measurePolicy);
        }
    }
}
