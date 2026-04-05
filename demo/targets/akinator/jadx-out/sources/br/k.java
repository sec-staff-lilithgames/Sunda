package br;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public enum k implements ir.i {
    /* JADX INFO: Fake field, exist only in values array */
    Linear("linear"),
    /* JADX INFO: Fake field, exist only in values array */
    EaseIn("ease_in"),
    /* JADX INFO: Fake field, exist only in values array */
    EaseOut("ease_out"),
    /* JADX INFO: Fake field, exist only in values array */
    EaseInOut("ease_in_out");


    /* renamed from: c, reason: collision with root package name */
    public static final j f9883c = new j(null);

    /* renamed from: b, reason: collision with root package name */
    public final String f9885b;

    k(String str) {
        this.f9885b = str;
    }

    public static final k get(String str) {
        return f9883c.get(str);
    }

    @Override // ir.i
    public String getKey() {
        return this.f9885b;
    }
}
