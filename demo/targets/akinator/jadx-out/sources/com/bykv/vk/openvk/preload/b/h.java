package com.bykv.vk.openvk.preload.b;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    Class<? extends d> f17013a;

    /* renamed from: b, reason: collision with root package name */
    private com.bykv.vk.openvk.preload.b.b.a f17014b;

    /* renamed from: c, reason: collision with root package name */
    private Object[] f17015c;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private Class<? extends d> f17016a;

        /* renamed from: b, reason: collision with root package name */
        private com.bykv.vk.openvk.preload.b.b.a f17017b;

        /* renamed from: c, reason: collision with root package name */
        private Object[] f17018c;

        private a() {
        }

        public static a a() {
            return new a();
        }

        public final h b() {
            return new h(this, (byte) 0);
        }

        public final a a(Class<? extends d> cls) {
            if (cls != null) {
                this.f17016a = cls;
                return this;
            }
            throw new IllegalArgumentException("interceptor class == null");
        }

        public final a a(com.bykv.vk.openvk.preload.b.b.a aVar) {
            this.f17017b = aVar;
            return this;
        }

        public final a a(Object... objArr) {
            this.f17018c = objArr;
            return this;
        }
    }

    public /* synthetic */ h(a aVar, byte b10) {
        this(aVar);
    }

    public final com.bykv.vk.openvk.preload.b.b.a a() {
        return this.f17014b;
    }

    public final Object[] b() {
        return this.f17015c;
    }

    private h(a aVar) {
        this.f17013a = aVar.f17016a;
        this.f17014b = aVar.f17017b;
        this.f17015c = aVar.f17018c;
        if (this.f17013a == null) {
            throw new IllegalArgumentException("Interceptor class == null");
        }
    }
}
