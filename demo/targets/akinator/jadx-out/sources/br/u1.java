package br;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public enum u1 implements ir.i {
    None("none"),
    ToFill("to_fill"),
    AspectFill("aspect_fill"),
    AspectFit("aspect_fit");


    /* renamed from: c, reason: collision with root package name */
    public static final t1 f9997c = new t1(null);

    /* renamed from: b, reason: collision with root package name */
    public final String f10003b;

    u1(String str) {
        this.f10003b = str;
    }

    public static final u1 get(String str) {
        return f9997c.get(str);
    }

    @Override // ir.i
    public String getKey() {
        return this.f10003b;
    }
}
