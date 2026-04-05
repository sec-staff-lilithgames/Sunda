package androidx.browser.customtabs;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public Integer f5204a;

    /* renamed from: b, reason: collision with root package name */
    public Integer f5205b;

    /* renamed from: c, reason: collision with root package name */
    public Integer f5206c;

    /* renamed from: d, reason: collision with root package name */
    public Integer f5207d;

    public d build() {
        return new d(this.f5204a, this.f5205b, this.f5206c, this.f5207d);
    }

    public c setNavigationBarColor(int i10) {
        this.f5206c = Integer.valueOf(i10 | (-16777216));
        return this;
    }

    public c setNavigationBarDividerColor(int i10) {
        this.f5207d = Integer.valueOf(i10);
        return this;
    }

    public c setSecondaryToolbarColor(int i10) {
        this.f5205b = Integer.valueOf(i10);
        return this;
    }

    public c setToolbarColor(int i10) {
        this.f5204a = Integer.valueOf(i10 | (-16777216));
        return this;
    }
}
