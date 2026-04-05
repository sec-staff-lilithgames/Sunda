package com.ironsource;

import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.ironsource.c7, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C3158c7 implements Y6 {

    /* renamed from: a, reason: collision with root package name */
    private final JSONObject f36128a;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.ironsource.c7$a */
    public static final class a {

        /* renamed from: b, reason: collision with root package name */
        public static final boolean f36130b = false;

        /* renamed from: d, reason: collision with root package name */
        public static final int f36132d = 24;

        /* renamed from: a, reason: collision with root package name */
        public static final a f36129a = new a();

        /* renamed from: c, reason: collision with root package name */
        private static final int f36131c = EnumC3176d7.SendEvent.b();

        private a() {
        }

        public final int a() {
            return f36131c;
        }
    }

    public C3158c7(JSONObject jSONObject) {
        this.f36128a = jSONObject == null ? new JSONObject() : jSONObject;
    }

    @Override // com.ironsource.Y6
    public long a() {
        return this.f36128a.optInt("timeout", 24) * 1000;
    }

    @Override // com.ironsource.X5
    public boolean b() {
        return this.f36128a.optBoolean(com.ironsource.mediationsdk.metadata.a.f37604j, false);
    }

    @Override // com.ironsource.Y6
    public EnumC3176d7 c() {
        return EnumC3176d7.f36258b.a(this.f36128a.optInt("strategy", a.f36129a.a()));
    }
}
