package k3;

import androidx.core.graphics.drawable.IconCompat;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class b1 {

    /* renamed from: a, reason: collision with root package name */
    public CharSequence f70129a;

    /* renamed from: b, reason: collision with root package name */
    public IconCompat f70130b;

    /* renamed from: c, reason: collision with root package name */
    public String f70131c;

    /* renamed from: d, reason: collision with root package name */
    public String f70132d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f70133e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f70134f;

    public c1 build() {
        c1 c1Var = new c1();
        c1Var.f70136a = this.f70129a;
        c1Var.f70137b = this.f70130b;
        c1Var.f70138c = this.f70131c;
        c1Var.f70139d = this.f70132d;
        c1Var.f70140e = this.f70133e;
        c1Var.f70141f = this.f70134f;
        return c1Var;
    }

    public b1 setBot(boolean z10) {
        this.f70133e = z10;
        return this;
    }

    public b1 setIcon(IconCompat iconCompat) {
        this.f70130b = iconCompat;
        return this;
    }

    public b1 setImportant(boolean z10) {
        this.f70134f = z10;
        return this;
    }

    public b1 setKey(String str) {
        this.f70132d = str;
        return this;
    }

    public b1 setName(CharSequence charSequence) {
        this.f70129a = charSequence;
        return this;
    }

    public b1 setUri(String str) {
        this.f70131c = str;
        return this;
    }
}
