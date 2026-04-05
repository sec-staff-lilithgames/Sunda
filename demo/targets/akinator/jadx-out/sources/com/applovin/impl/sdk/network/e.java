package com.applovin.impl.sdk.network;

import com.applovin.impl.s4;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.network.a;
import com.applovin.impl.v4;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class e extends com.applovin.impl.sdk.network.a {

    /* renamed from: s, reason: collision with root package name */
    private String f15659s;

    /* renamed from: t, reason: collision with root package name */
    private boolean f15660t;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class a extends a.C0042a {

        /* renamed from: r, reason: collision with root package name */
        private String f15661r;

        /* renamed from: s, reason: collision with root package name */
        private boolean f15662s;

        public a(k kVar) {
            super(kVar);
            this.f15608h = ((Integer) kVar.a(v4.F2)).intValue();
            this.f15609i = ((Integer) kVar.a(v4.E2)).intValue();
            this.f15610j = ((Integer) kVar.a(v4.Q2)).intValue();
        }

        @Override // com.applovin.impl.sdk.network.a.C0042a
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public a a(String str) {
            this.f15603c = str;
            return this;
        }

        @Override // com.applovin.impl.sdk.network.a.C0042a
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public a b(int i10) {
            this.f15610j = i10;
            return this;
        }

        @Override // com.applovin.impl.sdk.network.a.C0042a
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public a b(String str) {
            this.f15602b = str;
            return this;
        }

        @Override // com.applovin.impl.sdk.network.a.C0042a
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public a c(String str) {
            this.f15601a = str;
            return this;
        }

        public a h(boolean z10) {
            this.f15662s = z10;
            return this;
        }

        @Override // com.applovin.impl.sdk.network.a.C0042a
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public a b(boolean z10) {
            this.f15616p = z10;
            return this;
        }

        @Override // com.applovin.impl.sdk.network.a.C0042a
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public a b(Map map) {
            this.f15604d = map;
            return this;
        }

        public a e(String str) {
            this.f15661r = str;
            return this;
        }

        @Override // com.applovin.impl.sdk.network.a.C0042a
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public a c(int i10) {
            this.f15609i = i10;
            return this;
        }

        @Override // com.applovin.impl.sdk.network.a.C0042a
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public a a(boolean z10) {
            this.f15614n = z10;
            return this;
        }

        @Override // com.applovin.impl.sdk.network.a.C0042a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public a a(Map map) {
            this.f15605e = map;
            return this;
        }

        @Override // com.applovin.impl.sdk.network.a.C0042a
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public a a(int i10) {
            this.f15608h = i10;
            return this;
        }

        @Override // com.applovin.impl.sdk.network.a.C0042a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public a a(JSONObject jSONObject) {
            this.f15606f = jSONObject;
            return this;
        }

        @Override // com.applovin.impl.sdk.network.a.C0042a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public a a(Object obj) {
            this.f15607g = obj;
            return this;
        }

        @Override // com.applovin.impl.sdk.network.a.C0042a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public a a(s4.a aVar) {
            this.f15617q = aVar;
            return this;
        }

        @Override // com.applovin.impl.sdk.network.a.C0042a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public e a() {
            return new e(this);
        }
    }

    public e(a aVar) {
        super(aVar);
        this.f15659s = aVar.f15661r;
        this.f15660t = aVar.f15662s;
    }

    public static a b(k kVar) {
        return new a(kVar);
    }

    public String s() {
        return this.f15659s;
    }

    public boolean t() {
        return this.f15659s != null;
    }

    public boolean u() {
        return this.f15660t;
    }
}
