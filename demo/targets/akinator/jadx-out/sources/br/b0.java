package br;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public enum b0 implements ir.i {
    FullLoad("full_load"),
    PartialLoad("partial_load"),
    StreamLoad("stream_load");


    /* renamed from: c, reason: collision with root package name */
    public static final a0 f9753c = new a0(null);

    /* renamed from: b, reason: collision with root package name */
    public final String f9758b;

    b0(String str) {
        this.f9758b = str;
    }

    public static final b0 get(String str) {
        return f9753c.get(str);
    }

    @Override // ir.i
    public String getKey() {
        return this.f9758b;
    }
}
