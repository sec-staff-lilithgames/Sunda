package oq;

import android.view.View;
import b0.e2;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final float f79741a;

    /* renamed from: b, reason: collision with root package name */
    public final float f79742b;

    /* renamed from: c, reason: collision with root package name */
    public final float f79743c;

    public e(float f10, float f11, float f12) {
        this.f79741a = f10;
        this.f79742b = f11;
        this.f79743c = f12;
    }

    public final float a() {
        return this.f79741a;
    }

    public final float b() {
        return this.f79742b;
    }

    public final float c() {
        return this.f79743c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return Float.compare(this.f79741a, eVar.f79741a) == 0 && Float.compare(this.f79742b, eVar.f79742b) == 0 && Float.compare(this.f79743c, eVar.f79743c) == 0;
    }

    public int hashCode() {
        return Float.hashCode(this.f79743c) + e2.b(this.f79742b, Float.hashCode(this.f79741a) * 31, 31);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("AdAnimationValues(alpha=");
        sb2.append(this.f79741a);
        sb2.append(", translationX=");
        sb2.append(this.f79742b);
        sb2.append(", translationY=");
        return a.b.n(sb2, this.f79743c, ')');
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public e(View view) {
        this(view.getAlpha(), view.getTranslationX(), view.getTranslationY());
        e0.checkNotNullParameter(view, "view");
    }
}
