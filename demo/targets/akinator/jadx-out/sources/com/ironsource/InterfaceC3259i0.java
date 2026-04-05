package com.ironsource;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.ironsource.i0, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public interface InterfaceC3259i0 {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.ironsource.i0$a */
    public static final class a implements InterfaceC3259i0 {

        /* renamed from: c, reason: collision with root package name */
        public static final C0227a f36881c = new C0227a(null);

        /* renamed from: a, reason: collision with root package name */
        private final String f36882a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f36883b;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: com.ironsource.i0$a$a, reason: collision with other inner class name */
        public static final class C0227a {
            public /* synthetic */ C0227a(kotlin.jvm.internal.u uVar) {
                this();
            }

            public final a a(String str) {
                return new a(str);
            }

            private C0227a() {
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public a() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public final a a(String str) {
            return new a(str);
        }

        public final String b() {
            return this.f36882a;
        }

        public final String c() {
            return this.f36882a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && kotlin.jvm.internal.e0.areEqual(this.f36882a, ((a) obj).f36882a);
        }

        public int hashCode() {
            String str = this.f36882a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return a.b.l("NotReady(reason=", this.f36882a, ")");
        }

        public a(String str) {
            this.f36882a = str;
        }

        public static /* synthetic */ a a(a aVar, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = aVar.f36882a;
            }
            return aVar.a(str);
        }

        public /* synthetic */ a(String str, int i10, kotlin.jvm.internal.u uVar) {
            this((i10 & 1) != 0 ? null : str);
        }

        @Override // com.ironsource.InterfaceC3259i0
        public boolean a() {
            return this.f36883b;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.ironsource.i0$b */
    public static final class b implements InterfaceC3259i0 {

        /* renamed from: a, reason: collision with root package name */
        public static final b f36884a = new b();

        /* renamed from: b, reason: collision with root package name */
        private static final boolean f36885b = true;

        private b() {
        }

        @Override // com.ironsource.InterfaceC3259i0
        public boolean a() {
            return f36885b;
        }
    }

    boolean a();
}
