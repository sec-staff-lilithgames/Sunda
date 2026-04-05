package o3;

import android.graphics.Insets;
import android.graphics.Rect;
import com.google.firebase.messaging.b0;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: e, reason: collision with root package name */
    public static final c f77431e = new c(0, 0, 0, 0);

    /* renamed from: a, reason: collision with root package name */
    public final int f77432a;

    /* renamed from: b, reason: collision with root package name */
    public final int f77433b;

    /* renamed from: c, reason: collision with root package name */
    public final int f77434c;

    /* renamed from: d, reason: collision with root package name */
    public final int f77435d;

    public c(int i10, int i11, int i12, int i13) {
        this.f77432a = i10;
        this.f77433b = i11;
        this.f77434c = i12;
        this.f77435d = i13;
    }

    public static c add(c cVar, c cVar2) {
        return of(cVar.f77432a + cVar2.f77432a, cVar.f77433b + cVar2.f77433b, cVar.f77434c + cVar2.f77434c, cVar.f77435d + cVar2.f77435d);
    }

    public static c max(c cVar, c cVar2) {
        return of(Math.max(cVar.f77432a, cVar2.f77432a), Math.max(cVar.f77433b, cVar2.f77433b), Math.max(cVar.f77434c, cVar2.f77434c), Math.max(cVar.f77435d, cVar2.f77435d));
    }

    public static c min(c cVar, c cVar2) {
        return of(Math.min(cVar.f77432a, cVar2.f77432a), Math.min(cVar.f77433b, cVar2.f77433b), Math.min(cVar.f77434c, cVar2.f77434c), Math.min(cVar.f77435d, cVar2.f77435d));
    }

    public static c of(int i10, int i11, int i12, int i13) {
        return (i10 == 0 && i11 == 0 && i12 == 0 && i13 == 0) ? f77431e : new c(i10, i11, i12, i13);
    }

    public static c subtract(c cVar, c cVar2) {
        return of(cVar.f77432a - cVar2.f77432a, cVar.f77433b - cVar2.f77433b, cVar.f77434c - cVar2.f77434c, cVar.f77435d - cVar2.f77435d);
    }

    public static c toCompatInsets(Insets insets) {
        return of(insets.left, insets.top, insets.right, insets.bottom);
    }

    @Deprecated
    public static c wrap(Insets insets) {
        return toCompatInsets(insets);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        return this.f77435d == cVar.f77435d && this.f77432a == cVar.f77432a && this.f77434c == cVar.f77434c && this.f77433b == cVar.f77433b;
    }

    public int hashCode() {
        return (((((this.f77432a * 31) + this.f77433b) * 31) + this.f77434c) * 31) + this.f77435d;
    }

    public Insets toPlatformInsets() {
        return b0.s(this.f77432a, this.f77433b, this.f77434c, this.f77435d);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("Insets{left=");
        sb2.append(this.f77432a);
        sb2.append(", top=");
        sb2.append(this.f77433b);
        sb2.append(", right=");
        sb2.append(this.f77434c);
        sb2.append(", bottom=");
        return e3.g.m(sb2, this.f77435d, AbstractJsonLexerKt.END_OBJ);
    }

    public static c of(Rect rect) {
        return of(rect.left, rect.top, rect.right, rect.bottom);
    }
}
