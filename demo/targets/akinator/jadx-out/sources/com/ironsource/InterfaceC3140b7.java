package com.ironsource;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.ironsource.b7, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public interface InterfaceC3140b7 {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.ironsource.b7$a */
    public static final class a implements InterfaceC3140b7 {

        /* renamed from: a, reason: collision with root package name */
        private final EnumC3176d7 f36056a;

        public a(EnumC3176d7 strategy) {
            kotlin.jvm.internal.e0.checkNotNullParameter(strategy, "strategy");
            this.f36056a = strategy;
        }

        @Override // com.ironsource.InterfaceC3140b7
        public String a() {
            return "WebView is unavailable";
        }

        @Override // com.ironsource.InterfaceC3140b7
        public EnumC3176d7 b() {
            return this.f36056a;
        }

        public final EnumC3176d7 c() {
            return this.f36056a;
        }
    }

    String a();

    EnumC3176d7 b();
}
