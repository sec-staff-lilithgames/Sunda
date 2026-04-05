package com.ironsource.sdk.controller;

import com.ironsource.C3460t8;
import kotlin.jvm.internal.e0;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public interface m {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a implements m {

        /* renamed from: a, reason: collision with root package name */
        private final String f38594a;

        /* renamed from: b, reason: collision with root package name */
        private final String f38595b;

        /* renamed from: c, reason: collision with root package name */
        private final String f38596c;

        /* renamed from: d, reason: collision with root package name */
        private final String f38597d;

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public a(String funToCall) {
            this(funToCall, null, null, null, 14, null);
            e0.checkNotNullParameter(funToCall, "funToCall");
        }

        @Override // com.ironsource.sdk.controller.m
        public String a() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("SSA_CORE.SDKController.runFunction('" + this.f38594a);
            String str = this.f38595b;
            if (str != null && str.length() != 0) {
                sb2.append("?parameters=" + this.f38595b);
            }
            String str2 = this.f38596c;
            if (str2 != null && str2.length() != 0) {
                sb2.append("','" + this.f38596c);
            }
            String str3 = this.f38597d;
            if (str3 != null && str3.length() != 0) {
                sb2.append("','" + this.f38597d);
            }
            sb2.append("');");
            String string = sb2.toString();
            e0.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
            return string;
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public a(String funToCall, String str) {
            this(funToCall, str, null, null, 12, null);
            e0.checkNotNullParameter(funToCall, "funToCall");
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public a(String funToCall, String str, String str2) {
            this(funToCall, str, str2, null, 8, null);
            e0.checkNotNullParameter(funToCall, "funToCall");
        }

        public a(String funToCall, String str, String str2, String str3) {
            e0.checkNotNullParameter(funToCall, "funToCall");
            this.f38594a = funToCall;
            this.f38595b = str;
            this.f38596c = str2;
            this.f38597d = str3;
        }

        public /* synthetic */ a(String str, String str2, String str3, String str4, int i10, kotlin.jvm.internal.u uVar) {
            this(str, (i10 & 2) != 0 ? "" : str2, (i10 & 4) != 0 ? "" : str3, (i10 & 8) != 0 ? "" : str4);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b implements m {

        /* renamed from: a, reason: collision with root package name */
        private int f38598a;

        /* renamed from: b, reason: collision with root package name */
        private String f38599b;

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public b(m jsMethod, int i10) {
            this(jsMethod.a(), i10);
            e0.checkNotNullParameter(jsMethod, "jsMethod");
        }

        @Override // com.ironsource.sdk.controller.m
        public String a() {
            String str = "console.log(\"JS exception: \" + JSON.stringify(e));";
            if (this.f38598a != C3460t8.d.MODE_0.b() && (this.f38598a < C3460t8.d.MODE_1.b() || this.f38598a > C3460t8.d.MODE_3.b())) {
                str = "empty";
            }
            String strR = o2.r(new StringBuilder("try{"), this.f38599b, "}catch(e){", str, "}");
            e0.checkNotNullExpressionValue(strR, "StringBuilder()\n        …}\")\n          .toString()");
            return strR;
        }

        public b(String script, int i10) {
            e0.checkNotNullParameter(script, "script");
            this.f38599b = script;
            this.f38598a = i10;
        }
    }

    String a();
}
