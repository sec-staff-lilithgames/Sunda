package br;

import android.view.View;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class l1 {

    /* renamed from: e, reason: collision with root package name */
    public static final a f9918e = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public final float f9919a;

    /* renamed from: b, reason: collision with root package name */
    public final float f9920b;

    /* renamed from: c, reason: collision with root package name */
    public final float f9921c;

    /* renamed from: d, reason: collision with root package name */
    public final float f9922d;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public a(kotlin.jvm.internal.u uVar) {
        }

        public final l1 parse(String str) {
            List listSplit$default = str != null ? sv.n0.split$default((CharSequence) str, new String[]{","}, false, 0, 6, (Object) null) : null;
            if (listSplit$default != null && listSplit$default.size() >= 4) {
                try {
                    return new l1(Float.parseFloat(sv.n0.trim((String) listSplit$default.get(0)).toString()), Float.parseFloat(sv.n0.trim((String) listSplit$default.get(1)).toString()), Float.parseFloat(sv.n0.trim((String) listSplit$default.get(2)).toString()), Float.parseFloat(sv.n0.trim((String) listSplit$default.get(3)).toString()));
                } catch (Exception unused) {
                }
            }
            return null;
        }

        public final void setPadding(View view, l1 l1Var) {
            kotlin.jvm.internal.e0.checkNotNullParameter(view, "view");
            m1.setPadding(view, l1Var);
        }
    }

    public l1(float f10, float f11, float f12, float f13) {
        this.f9919a = f10;
        this.f9920b = f11;
        this.f9921c = f12;
        this.f9922d = f13;
    }

    public static final l1 parse(String str) {
        return f9918e.parse(str);
    }

    public static final void setPadding(View view, l1 l1Var) {
        f9918e.setPadding(view, l1Var);
    }

    public final float getBottomDp() {
        return this.f9922d;
    }

    public final float getLeftDp() {
        return this.f9919a;
    }

    public final float getRightDp() {
        return this.f9921c;
    }

    public final float getTopDp() {
        return this.f9920b;
    }

    public final boolean isZero() {
        return this.f9919a == 0.0f && this.f9920b == 0.0f && this.f9921c == 0.0f && this.f9922d == 0.0f;
    }
}
