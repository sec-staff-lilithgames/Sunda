package com.applovin.impl;

import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class n0 extends g5 {

    /* renamed from: g, reason: collision with root package name */
    private final String f14838g;

    /* renamed from: h, reason: collision with root package name */
    private final com.applovin.impl.sdk.network.a f14839h;

    public n0(String str, com.applovin.impl.sdk.network.a aVar, com.applovin.impl.sdk.k kVar) {
        super("CommunicatorRequestTask", kVar, str);
        this.f14838g = str;
        this.f14839h = aVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f14003a.r0().a(new a(this.f14839h, this.f14003a, d()));
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class a extends j6 {
        public a(com.applovin.impl.sdk.network.a aVar, com.applovin.impl.sdk.k kVar, boolean z10) {
            super(aVar, kVar, z10);
        }

        @Override // com.applovin.impl.j6, com.applovin.impl.q0.e
        public void a(String str, JSONObject jSONObject, int i10) {
            this.f14003a.u().a(n0.this.f14838g, n0.this.f14839h.f(), i10, jSONObject, null, true);
        }

        @Override // com.applovin.impl.j6, com.applovin.impl.q0.e
        public void a(String str, int i10, String str2, JSONObject jSONObject) {
            this.f14003a.u().a(n0.this.f14838g, n0.this.f14839h.f(), i10, jSONObject, str2, false);
        }
    }
}
