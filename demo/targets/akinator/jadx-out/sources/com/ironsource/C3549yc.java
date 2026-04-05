package com.ironsource;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.ironsource.yc, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C3549yc implements InterfaceC3567zd {

    /* renamed from: a, reason: collision with root package name */
    private final String f39279a;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.ironsource.yc$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final a f39280a = new a();

        /* renamed from: b, reason: collision with root package name */
        public static final String f39281b = "IronSource";

        private a() {
        }
    }

    public C3549yc(String networkInstanceId) {
        kotlin.jvm.internal.e0.checkNotNullParameter(networkInstanceId, "networkInstanceId");
        this.f39279a = networkInstanceId;
    }

    @Override // com.ironsource.InterfaceC3567zd
    public String value() {
        return this.f39279a.length() == 0 ? "" : (kotlin.jvm.internal.e0.areEqual(this.f39279a, "0") || kotlin.jvm.internal.e0.areEqual(this.f39279a, "IronSource")) ? "IronSource" : a.b.k("IronSource_", this.f39279a);
    }
}
