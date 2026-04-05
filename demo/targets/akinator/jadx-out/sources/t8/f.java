package t8;

import android.graphics.Bitmap;
import e3.g;
import j9.q;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final int f86579a;

    /* renamed from: b, reason: collision with root package name */
    public final int f86580b;

    /* renamed from: c, reason: collision with root package name */
    public final Bitmap.Config f86581c;

    /* renamed from: d, reason: collision with root package name */
    public final int f86582d;

    static {
        Bitmap.Config config = Bitmap.Config.RGB_565;
    }

    public f(int i10, int i11, Bitmap.Config config, int i12) {
        this.f86581c = (Bitmap.Config) q.checkNotNull(config, "Config must not be null");
        this.f86579a = i10;
        this.f86580b = i11;
        this.f86582d = i12;
    }

    public boolean equals(Object obj) {
        if (obj instanceof f) {
            f fVar = (f) obj;
            if (this.f86580b == fVar.f86580b && this.f86579a == fVar.f86579a && this.f86582d == fVar.f86582d && this.f86581c == fVar.f86581c) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.f86581c.hashCode() + (((this.f86579a * 31) + this.f86580b) * 31)) * 31) + this.f86582d;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("PreFillSize{width=");
        sb2.append(this.f86579a);
        sb2.append(", height=");
        sb2.append(this.f86580b);
        sb2.append(", config=");
        sb2.append(this.f86581c);
        sb2.append(", weight=");
        return g.m(sb2, this.f86582d, AbstractJsonLexerKt.END_OBJ);
    }
}
