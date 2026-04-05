package r2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class v {

    /* renamed from: c, reason: collision with root package name */
    public static final a f83724c = new a(null);

    /* renamed from: d, reason: collision with root package name */
    public static final v f83725d = new v(1.0f, 0.0f);

    /* renamed from: a, reason: collision with root package name */
    public final float f83726a;

    /* renamed from: b, reason: collision with root package name */
    public final float f83727b;

    /* JADX WARN: Illegal instructions before constructor call */
    public v() {
        float f10 = 0.0f;
        this(f10, f10, 3, null);
    }

    public static /* synthetic */ v copy$default(v vVar, float f10, float f11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = vVar.f83726a;
        }
        if ((i10 & 2) != 0) {
            f11 = vVar.f83727b;
        }
        return vVar.copy(f10, f11);
    }

    public final v copy(float f10, float f11) {
        return new v(f10, f11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return this.f83726a == vVar.f83726a && this.f83727b == vVar.f83727b;
    }

    public final float getScaleX() {
        return this.f83726a;
    }

    public final float getSkewX() {
        return this.f83727b;
    }

    public int hashCode() {
        return Float.hashCode(this.f83727b) + (Float.hashCode(this.f83726a) * 31);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("TextGeometricTransform(scaleX=");
        sb2.append(this.f83726a);
        sb2.append(", skewX=");
        return a.b.n(sb2, this.f83727b, ')');
    }

    public v(float f10, float f11) {
        this.f83726a = f10;
        this.f83727b = f11;
    }

    public /* synthetic */ v(float f10, float f11, int i10, kotlin.jvm.internal.u uVar) {
        this((i10 & 1) != 0 ? 1.0f : f10, (i10 & 2) != 0 ? 0.0f : f11);
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public a(kotlin.jvm.internal.u uVar) {
        }

        public final v getNone$ui_text_release() {
            return v.f83725d;
        }

        public static /* synthetic */ void getNone$ui_text_release$annotations() {
        }
    }
}
