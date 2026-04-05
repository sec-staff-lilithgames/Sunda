package com.ironsource;

import com.ironsource.C3191e4;
import com.ironsource.C3460t8;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.ironsource.t1, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public interface InterfaceC3453t1 {

    /* renamed from: a, reason: collision with root package name */
    public static final b f38872a = b.f38888a;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.ironsource.t1$a */
    public interface a extends InterfaceC3453t1 {

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: com.ironsource.t1$a$a, reason: collision with other inner class name */
        public static final class C0246a implements a {

            /* renamed from: b, reason: collision with root package name */
            private final String f38873b;

            /* renamed from: c, reason: collision with root package name */
            private final String f38874c;

            /* renamed from: d, reason: collision with root package name */
            private final C3460t8.e f38875d;

            /* renamed from: e, reason: collision with root package name */
            private final String f38876e;

            /* renamed from: f, reason: collision with root package name */
            private final String f38877f;

            /* renamed from: g, reason: collision with root package name */
            private final C0247a f38878g;

            /* renamed from: h, reason: collision with root package name */
            private final int f38879h;

            /* renamed from: i, reason: collision with root package name */
            private final int f38880i;

            /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
            /* renamed from: com.ironsource.t1$a$a$a, reason: collision with other inner class name */
            public static final class C0247a {

                /* renamed from: a, reason: collision with root package name */
                private final int f38881a;

                /* renamed from: b, reason: collision with root package name */
                private final int f38882b;

                public C0247a(int i10, int i11) {
                    this.f38881a = i10;
                    this.f38882b = i11;
                }

                public final int a() {
                    return this.f38881a;
                }

                public final int b() {
                    return this.f38882b;
                }

                public final int c() {
                    return this.f38881a;
                }

                public final int d() {
                    return this.f38882b;
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof C0247a)) {
                        return false;
                    }
                    C0247a c0247a = (C0247a) obj;
                    return this.f38881a == c0247a.f38881a && this.f38882b == c0247a.f38882b;
                }

                public int hashCode() {
                    return Integer.hashCode(this.f38882b) + (Integer.hashCode(this.f38881a) * 31);
                }

                public String toString() {
                    return p0.o2.i(this.f38881a, this.f38882b, "Coordinates(x=", ", y=", ")");
                }

                public final C0247a a(int i10, int i11) {
                    return new C0247a(i10, i11);
                }

                public static /* synthetic */ C0247a a(C0247a c0247a, int i10, int i11, int i12, Object obj) {
                    if ((i12 & 1) != 0) {
                        i10 = c0247a.f38881a;
                    }
                    if ((i12 & 2) != 0) {
                        i11 = c0247a.f38882b;
                    }
                    return c0247a.a(i10, i11);
                }
            }

            public C0246a(String successCallback, String failCallback, C3460t8.e productType, String demandSourceName, String url, C0247a coordinates, int i10, int i11) {
                kotlin.jvm.internal.e0.checkNotNullParameter(successCallback, "successCallback");
                kotlin.jvm.internal.e0.checkNotNullParameter(failCallback, "failCallback");
                kotlin.jvm.internal.e0.checkNotNullParameter(productType, "productType");
                kotlin.jvm.internal.e0.checkNotNullParameter(demandSourceName, "demandSourceName");
                kotlin.jvm.internal.e0.checkNotNullParameter(url, "url");
                kotlin.jvm.internal.e0.checkNotNullParameter(coordinates, "coordinates");
                this.f38873b = successCallback;
                this.f38874c = failCallback;
                this.f38875d = productType;
                this.f38876e = demandSourceName;
                this.f38877f = url;
                this.f38878g = coordinates;
                this.f38879h = i10;
                this.f38880i = i11;
            }

            public final C0246a a(String successCallback, String failCallback, C3460t8.e productType, String demandSourceName, String url, C0247a coordinates, int i10, int i11) {
                kotlin.jvm.internal.e0.checkNotNullParameter(successCallback, "successCallback");
                kotlin.jvm.internal.e0.checkNotNullParameter(failCallback, "failCallback");
                kotlin.jvm.internal.e0.checkNotNullParameter(productType, "productType");
                kotlin.jvm.internal.e0.checkNotNullParameter(demandSourceName, "demandSourceName");
                kotlin.jvm.internal.e0.checkNotNullParameter(url, "url");
                kotlin.jvm.internal.e0.checkNotNullParameter(coordinates, "coordinates");
                return new C0246a(successCallback, failCallback, productType, demandSourceName, url, coordinates, i10, i11);
            }

            @Override // com.ironsource.InterfaceC3453t1.a
            public String b() {
                return this.f38877f;
            }

            @Override // com.ironsource.InterfaceC3453t1
            public String c() {
                return this.f38874c;
            }

            @Override // com.ironsource.InterfaceC3453t1
            public C3460t8.e d() {
                return this.f38875d;
            }

            @Override // com.ironsource.InterfaceC3453t1
            public String e() {
                return this.f38876e;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0246a)) {
                    return false;
                }
                C0246a c0246a = (C0246a) obj;
                return kotlin.jvm.internal.e0.areEqual(this.f38873b, c0246a.f38873b) && kotlin.jvm.internal.e0.areEqual(this.f38874c, c0246a.f38874c) && this.f38875d == c0246a.f38875d && kotlin.jvm.internal.e0.areEqual(this.f38876e, c0246a.f38876e) && kotlin.jvm.internal.e0.areEqual(this.f38877f, c0246a.f38877f) && kotlin.jvm.internal.e0.areEqual(this.f38878g, c0246a.f38878g) && this.f38879h == c0246a.f38879h && this.f38880i == c0246a.f38880i;
            }

            public final String f() {
                return this.f38873b;
            }

            public final String g() {
                return this.f38874c;
            }

            public final C3460t8.e h() {
                return this.f38875d;
            }

            public int hashCode() {
                return Integer.hashCode(this.f38880i) + e3.g.d(this.f38879h, (this.f38878g.hashCode() + p0.o2.e(p0.o2.e((this.f38875d.hashCode() + p0.o2.e(this.f38873b.hashCode() * 31, 31, this.f38874c)) * 31, 31, this.f38876e), 31, this.f38877f)) * 31, 31);
            }

            public final String i() {
                return this.f38876e;
            }

            public final String j() {
                return this.f38877f;
            }

            public final C0247a k() {
                return this.f38878g;
            }

            public final int l() {
                return this.f38879h;
            }

            public final int m() {
                return this.f38880i;
            }

            public final int n() {
                return this.f38879h;
            }

            public final C0247a o() {
                return this.f38878g;
            }

            public final int p() {
                return this.f38880i;
            }

            public String toString() {
                String str = this.f38873b;
                String str2 = this.f38874c;
                C3460t8.e eVar = this.f38875d;
                String str3 = this.f38876e;
                String str4 = this.f38877f;
                C0247a c0247a = this.f38878g;
                int i10 = this.f38879h;
                int i11 = this.f38880i;
                StringBuilder sbB = b3.h.b("Click(successCallback=", str, ", failCallback=", str2, ", productType=");
                sbB.append(eVar);
                sbB.append(", demandSourceName=");
                sbB.append(str3);
                sbB.append(", url=");
                sbB.append(str4);
                sbB.append(", coordinates=");
                sbB.append(c0247a);
                sbB.append(", action=");
                sbB.append(i10);
                sbB.append(", metaState=");
                sbB.append(i11);
                sbB.append(")");
                return sbB.toString();
            }

            public static /* synthetic */ C0246a a(C0246a c0246a, String str, String str2, C3460t8.e eVar, String str3, String str4, C0247a c0247a, int i10, int i11, int i12, Object obj) {
                if ((i12 & 1) != 0) {
                    str = c0246a.f38873b;
                }
                if ((i12 & 2) != 0) {
                    str2 = c0246a.f38874c;
                }
                if ((i12 & 4) != 0) {
                    eVar = c0246a.f38875d;
                }
                if ((i12 & 8) != 0) {
                    str3 = c0246a.f38876e;
                }
                if ((i12 & 16) != 0) {
                    str4 = c0246a.f38877f;
                }
                if ((i12 & 32) != 0) {
                    c0247a = c0246a.f38878g;
                }
                if ((i12 & 64) != 0) {
                    i10 = c0246a.f38879h;
                }
                if ((i12 & 128) != 0) {
                    i11 = c0246a.f38880i;
                }
                int i13 = i10;
                int i14 = i11;
                String str5 = str4;
                C0247a c0247a2 = c0247a;
                return c0246a.a(str, str2, eVar, str3, str5, c0247a2, i13, i14);
            }

            @Override // com.ironsource.InterfaceC3453t1
            public String a() {
                return this.f38873b;
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: com.ironsource.t1$a$b */
        public static final class b implements a {

            /* renamed from: b, reason: collision with root package name */
            private final String f38883b;

            /* renamed from: c, reason: collision with root package name */
            private final String f38884c;

            /* renamed from: d, reason: collision with root package name */
            private final C3460t8.e f38885d;

            /* renamed from: e, reason: collision with root package name */
            private final String f38886e;

            /* renamed from: f, reason: collision with root package name */
            private final String f38887f;

            public b(String successCallback, String failCallback, C3460t8.e productType, String demandSourceName, String url) {
                kotlin.jvm.internal.e0.checkNotNullParameter(successCallback, "successCallback");
                kotlin.jvm.internal.e0.checkNotNullParameter(failCallback, "failCallback");
                kotlin.jvm.internal.e0.checkNotNullParameter(productType, "productType");
                kotlin.jvm.internal.e0.checkNotNullParameter(demandSourceName, "demandSourceName");
                kotlin.jvm.internal.e0.checkNotNullParameter(url, "url");
                this.f38883b = successCallback;
                this.f38884c = failCallback;
                this.f38885d = productType;
                this.f38886e = demandSourceName;
                this.f38887f = url;
            }

            public final b a(String successCallback, String failCallback, C3460t8.e productType, String demandSourceName, String url) {
                kotlin.jvm.internal.e0.checkNotNullParameter(successCallback, "successCallback");
                kotlin.jvm.internal.e0.checkNotNullParameter(failCallback, "failCallback");
                kotlin.jvm.internal.e0.checkNotNullParameter(productType, "productType");
                kotlin.jvm.internal.e0.checkNotNullParameter(demandSourceName, "demandSourceName");
                kotlin.jvm.internal.e0.checkNotNullParameter(url, "url");
                return new b(successCallback, failCallback, productType, demandSourceName, url);
            }

            @Override // com.ironsource.InterfaceC3453t1.a
            public String b() {
                return this.f38887f;
            }

            @Override // com.ironsource.InterfaceC3453t1
            public String c() {
                return this.f38884c;
            }

            @Override // com.ironsource.InterfaceC3453t1
            public C3460t8.e d() {
                return this.f38885d;
            }

            @Override // com.ironsource.InterfaceC3453t1
            public String e() {
                return this.f38886e;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return kotlin.jvm.internal.e0.areEqual(this.f38883b, bVar.f38883b) && kotlin.jvm.internal.e0.areEqual(this.f38884c, bVar.f38884c) && this.f38885d == bVar.f38885d && kotlin.jvm.internal.e0.areEqual(this.f38886e, bVar.f38886e) && kotlin.jvm.internal.e0.areEqual(this.f38887f, bVar.f38887f);
            }

            public final String f() {
                return this.f38883b;
            }

            public final String g() {
                return this.f38884c;
            }

            public final C3460t8.e h() {
                return this.f38885d;
            }

            public int hashCode() {
                return this.f38887f.hashCode() + p0.o2.e((this.f38885d.hashCode() + p0.o2.e(this.f38883b.hashCode() * 31, 31, this.f38884c)) * 31, 31, this.f38886e);
            }

            public final String i() {
                return this.f38886e;
            }

            public final String j() {
                return this.f38887f;
            }

            public String toString() {
                String str = this.f38883b;
                String str2 = this.f38884c;
                C3460t8.e eVar = this.f38885d;
                String str3 = this.f38886e;
                String str4 = this.f38887f;
                StringBuilder sbB = b3.h.b("Impression(successCallback=", str, ", failCallback=", str2, ", productType=");
                sbB.append(eVar);
                sbB.append(", demandSourceName=");
                sbB.append(str3);
                sbB.append(", url=");
                return j1.o2.o(sbB, str4, ")");
            }

            public static /* synthetic */ b a(b bVar, String str, String str2, C3460t8.e eVar, String str3, String str4, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = bVar.f38883b;
                }
                if ((i10 & 2) != 0) {
                    str2 = bVar.f38884c;
                }
                if ((i10 & 4) != 0) {
                    eVar = bVar.f38885d;
                }
                if ((i10 & 8) != 0) {
                    str3 = bVar.f38886e;
                }
                if ((i10 & 16) != 0) {
                    str4 = bVar.f38887f;
                }
                String str5 = str4;
                C3460t8.e eVar2 = eVar;
                return bVar.a(str, str2, eVar2, str3, str5);
            }

            @Override // com.ironsource.InterfaceC3453t1
            public String a() {
                return this.f38883b;
            }
        }

        String b();
    }

    static InterfaceC3453t1 a(String str) {
        return f38872a.a(str);
    }

    String a();

    String c();

    C3460t8.e d();

    String e();

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.ironsource.t1$b */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ b f38888a = new b();

        private b() {
        }

        public final InterfaceC3453t1 a(String jsonString) {
            kotlin.jvm.internal.e0.checkNotNullParameter(jsonString, "jsonString");
            JSONObject jSONObject = new JSONObject(jsonString);
            String strOptString = jSONObject.optString("type", "none");
            if (kotlin.jvm.internal.e0.areEqual(strOptString, C3209f4.f36683c)) {
                return a(jSONObject);
            }
            throw new IllegalArgumentException(a.b.k("unsupported message type: ", strOptString));
        }

        private final a a(JSONObject jSONObject) throws JSONException {
            String successCallback = jSONObject.getString("success");
            String failCallback = jSONObject.getString(C3191e4.f.f36439e);
            String demandSourceName = jSONObject.getString("demandSourceName");
            String string = jSONObject.getString(C3191e4.h.f36495m);
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(string, "json.getString(ParametersKeys.PRODUCT_TYPE)");
            C3460t8.e eVarValueOf = C3460t8.e.valueOf(string);
            JSONObject jSONObject2 = jSONObject.getJSONObject("params");
            String url = jSONObject2.getString("url");
            String strOptString = jSONObject2.optString("type");
            if (kotlin.jvm.internal.e0.areEqual(strOptString, "click")) {
                JSONObject jSONObject3 = jSONObject2.getJSONObject(C3209f4.f36686f);
                int i10 = jSONObject3.getInt(C3209f4.f36687g);
                int i11 = jSONObject3.getInt(C3209f4.f36688h);
                int iOptInt = jSONObject2.optInt("action", 0);
                int iOptInt2 = jSONObject2.optInt(C3209f4.f36690j, 0);
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(successCallback, "successCallback");
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(failCallback, "failCallback");
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(demandSourceName, "demandSourceName");
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(url, "url");
                return new a.C0246a(successCallback, failCallback, eVarValueOf, demandSourceName, url, new a.C0246a.C0247a(i10, i11), iOptInt, iOptInt2);
            }
            if (kotlin.jvm.internal.e0.areEqual(strOptString, "impression")) {
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(successCallback, "successCallback");
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(failCallback, "failCallback");
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(demandSourceName, "demandSourceName");
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(url, "url");
                return new a.b(successCallback, failCallback, eVarValueOf, demandSourceName, url);
            }
            throw new IllegalArgumentException(a.b.k("JSON does not contain valid type: ", jSONObject2.optString("type")));
        }
    }
}
