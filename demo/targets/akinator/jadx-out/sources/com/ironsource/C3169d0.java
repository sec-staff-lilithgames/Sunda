package com.ironsource;

import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.ironsource.d0, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C3169d0 implements InterfaceC3187e0 {

    /* renamed from: b, reason: collision with root package name */
    public static final a f36208b = new a(null);

    /* renamed from: c, reason: collision with root package name */
    private static final String f36209c = "ext_";

    /* renamed from: a, reason: collision with root package name */
    private final Map<String, String> f36210a = new HashMap();

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.ironsource.d0$a */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.u uVar) {
            this();
        }

        private a() {
        }
    }

    @Override // com.ironsource.InterfaceC3187e0
    public Map<String, String> a() {
        return this.f36210a;
    }

    @Override // com.ironsource.InterfaceC3187e0
    public void b(String key, String value) {
        kotlin.jvm.internal.e0.checkNotNullParameter(key, "key");
        kotlin.jvm.internal.e0.checkNotNullParameter(value, "value");
        this.f36210a.put("ext_" + key, value);
    }

    @Override // com.ironsource.InterfaceC3187e0
    public void a(HashMap<String, String> params) {
        kotlin.jvm.internal.e0.checkNotNullParameter(params, "params");
        this.f36210a.putAll(params);
    }

    @Override // com.ironsource.InterfaceC3187e0
    public void a(String key, String value) {
        kotlin.jvm.internal.e0.checkNotNullParameter(key, "key");
        kotlin.jvm.internal.e0.checkNotNullParameter(value, "value");
        this.f36210a.put(key, value);
    }
}
