package kotlin.jvm.internal;

import java.util.List;
import kotlin.reflect.KType;
import kotlin.reflect.KTypeParameter;
import kotlin.reflect.KVariance;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class j1 implements KTypeParameter {

    /* renamed from: h, reason: collision with root package name */
    public static final a f71837h = new a(null);

    /* renamed from: b, reason: collision with root package name */
    public final Object f71838b;

    /* renamed from: c, reason: collision with root package name */
    public final String f71839c;

    /* renamed from: e, reason: collision with root package name */
    public final KVariance f71840e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f71841f;

    /* renamed from: g, reason: collision with root package name */
    public volatile List f71842g;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public a(u uVar) {
        }

        public final String toString(KTypeParameter typeParameter) {
            e0.checkNotNullParameter(typeParameter, "typeParameter");
            StringBuilder sb2 = new StringBuilder();
            int i10 = i1.$EnumSwitchMapping$0[typeParameter.getVariance().ordinal()];
            if (i10 != 1) {
                if (i10 == 2) {
                    sb2.append("in ");
                } else {
                    if (i10 != 3) {
                        throw new tu.t();
                    }
                    sb2.append("out ");
                }
            }
            sb2.append(typeParameter.getName());
            return sb2.toString();
        }
    }

    public j1(Object obj, String name, KVariance variance, boolean z10) {
        e0.checkNotNullParameter(name, "name");
        e0.checkNotNullParameter(variance, "variance");
        this.f71838b = obj;
        this.f71839c = name;
        this.f71840e = variance;
        this.f71841f = z10;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof j1)) {
            return false;
        }
        j1 j1Var = (j1) obj;
        return e0.areEqual(this.f71838b, j1Var.f71838b) && e0.areEqual(getName(), j1Var.getName());
    }

    @Override // kotlin.reflect.KTypeParameter
    public String getName() {
        return this.f71839c;
    }

    @Override // kotlin.reflect.KTypeParameter
    public List<KType> getUpperBounds() {
        List<KType> list = this.f71842g;
        if (list != null) {
            return list;
        }
        List<KType> listListOf = uu.o0.listOf(c1.nullableTypeOf(Object.class));
        this.f71842g = listListOf;
        return listListOf;
    }

    @Override // kotlin.reflect.KTypeParameter
    public KVariance getVariance() {
        return this.f71840e;
    }

    public int hashCode() {
        Object obj = this.f71838b;
        return getName().hashCode() + ((obj != null ? obj.hashCode() : 0) * 31);
    }

    @Override // kotlin.reflect.KTypeParameter
    public boolean isReified() {
        return this.f71841f;
    }

    public final void setUpperBounds(List<? extends KType> upperBounds) {
        e0.checkNotNullParameter(upperBounds, "upperBounds");
        if (this.f71842g == null) {
            this.f71842g = upperBounds;
            return;
        }
        throw new IllegalStateException(("Upper bounds of type parameter '" + this + "' have already been initialized.").toString());
    }

    public String toString() {
        return f71837h.toString(this);
    }

    public static /* synthetic */ void getUpperBounds$annotations() {
    }
}
