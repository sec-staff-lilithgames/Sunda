package com.ironsource.sdk.controller;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.ironsource.C3422r4;
import com.ironsource.InterfaceC3222g;
import com.ironsource.InterfaceC3240h;
import com.ironsource.Tc;
import com.ironsource.Uc;
import com.ironsource.sdk.controller.OpenUrlActivity;
import com.ironsource.sdk.controller.k;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public interface p {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface b {

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class a implements b {

            /* renamed from: a, reason: collision with root package name */
            private final Uc f38650a;

            /* renamed from: b, reason: collision with root package name */
            private final InterfaceC3222g f38651b;

            public a(Uc configurations, InterfaceC3222g intentFactory) {
                e0.checkNotNullParameter(configurations, "configurations");
                e0.checkNotNullParameter(intentFactory, "intentFactory");
                this.f38650a = configurations;
                this.f38651b = intentFactory;
            }

            @Override // com.ironsource.sdk.controller.p.b
            public c a(Context context, Tc openUrl) {
                e0.checkNotNullParameter(context, "context");
                e0.checkNotNullParameter(openUrl, "openUrl");
                if (TextUtils.isEmpty(openUrl.d())) {
                    return new c.a("url is empty");
                }
                Intent intentA = this.f38651b.a();
                intentA.setData(Uri.parse(openUrl.d()));
                String strC = openUrl.c();
                if (strC != null && strC.length() != 0) {
                    intentA = intentA.setPackage(openUrl.c());
                    e0.checkNotNullExpressionValue(intentA, "this.setPackage(openUrl.packageName)");
                }
                if (!(context instanceof Activity)) {
                    intentA = intentA.addFlags(this.f38650a.c());
                }
                e0.checkNotNullExpressionValue(intentA, "intentFactory\n          …ations.flags) else this }");
                context.startActivity(intentA);
                return c.b.f38658a;
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: com.ironsource.sdk.controller.p$b$b, reason: collision with other inner class name */
        public static final class C0242b implements b {

            /* renamed from: a, reason: collision with root package name */
            private final String f38652a;

            public C0242b(String method) {
                e0.checkNotNullParameter(method, "method");
                this.f38652a = method;
            }

            @Override // com.ironsource.sdk.controller.p.b
            public c a(Context context, Tc openUrl) {
                e0.checkNotNullParameter(context, "context");
                e0.checkNotNullParameter(openUrl, "openUrl");
                return new c.a(a.b.l("method ", this.f38652a, " is unsupported"));
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class c implements b {

            /* renamed from: a, reason: collision with root package name */
            private final Uc f38653a;

            /* renamed from: b, reason: collision with root package name */
            private final InterfaceC3240h f38654b;

            public c(Uc configurations, InterfaceC3240h intentFactory) {
                e0.checkNotNullParameter(configurations, "configurations");
                e0.checkNotNullParameter(intentFactory, "intentFactory");
                this.f38653a = configurations;
                this.f38654b = intentFactory;
            }

            @Override // com.ironsource.sdk.controller.p.b
            public c a(Context context, Tc openUrl) {
                e0.checkNotNullParameter(context, "context");
                e0.checkNotNullParameter(openUrl, "openUrl");
                context.startActivity(new OpenUrlActivity.e(this.f38654b).a(this.f38653a.c()).a(openUrl.d()).b(true).c(true).a(context));
                return c.b.f38658a;
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class d implements b {

            /* renamed from: a, reason: collision with root package name */
            private final Uc f38655a;

            /* renamed from: b, reason: collision with root package name */
            private final InterfaceC3240h f38656b;

            public d(Uc configurations, InterfaceC3240h intentFactory) {
                e0.checkNotNullParameter(configurations, "configurations");
                e0.checkNotNullParameter(intentFactory, "intentFactory");
                this.f38655a = configurations;
                this.f38656b = intentFactory;
            }

            @Override // com.ironsource.sdk.controller.p.b
            public c a(Context context, Tc openUrl) {
                e0.checkNotNullParameter(context, "context");
                e0.checkNotNullParameter(openUrl, "openUrl");
                context.startActivity(new OpenUrlActivity.e(this.f38656b).a(this.f38655a.c()).a(openUrl.d()).a(this.f38655a.d()).b(true).a(context));
                return c.b.f38658a;
            }
        }

        c a(Context context, Tc tc2);
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static abstract class c {

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class a extends c {

            /* renamed from: a, reason: collision with root package name */
            private final String f38657a;

            /* JADX WARN: Multi-variable type inference failed */
            public a() {
                this(null, 1, 0 == true ? 1 : 0);
            }

            public final String a() {
                return this.f38657a;
            }

            public final String b() {
                return this.f38657a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && e0.areEqual(this.f38657a, ((a) obj).f38657a);
            }

            public int hashCode() {
                return this.f38657a.hashCode();
            }

            public String toString() {
                return a.b.l("Error(errorMessage=", this.f38657a, ")");
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(String errorMessage) {
                super(null);
                e0.checkNotNullParameter(errorMessage, "errorMessage");
                this.f38657a = errorMessage;
            }

            public final a a(String errorMessage) {
                e0.checkNotNullParameter(errorMessage, "errorMessage");
                return new a(errorMessage);
            }

            public /* synthetic */ a(String str, int i10, kotlin.jvm.internal.u uVar) {
                this((i10 & 1) != 0 ? "" : str);
            }

            public static /* synthetic */ a a(a aVar, String str, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = aVar.f38657a;
                }
                return aVar.a(str);
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class b extends c {

            /* renamed from: a, reason: collision with root package name */
            public static final b f38658a = new b();

            private b() {
                super(null);
            }
        }

        public /* synthetic */ c(kotlin.jvm.internal.u uVar) {
            this();
        }

        private c() {
        }
    }

    c a(Context context, Tc tc2);

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a implements p {

        /* renamed from: a, reason: collision with root package name */
        private b f38649a;

        /* JADX WARN: Removed duplicated region for block: B:20:0x0057  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public a(java.lang.String r3, com.ironsource.Uc r4, com.ironsource.InterfaceC3240h r5, com.ironsource.InterfaceC3222g r6) {
            /*
                r2 = this;
                java.lang.String r0 = "method"
                kotlin.jvm.internal.e0.checkNotNullParameter(r3, r0)
                java.lang.String r0 = "openUrlConfigurations"
                kotlin.jvm.internal.e0.checkNotNullParameter(r4, r0)
                java.lang.String r0 = "activityIntentFactory"
                kotlin.jvm.internal.e0.checkNotNullParameter(r5, r0)
                java.lang.String r0 = "actionIntentFactory"
                kotlin.jvm.internal.e0.checkNotNullParameter(r6, r0)
                r2.<init>()
                int r0 = r3.hashCode()
                r1 = -1455867212(0xffffffffa9393ab4, float:-4.112917E-14)
                if (r0 == r1) goto L49
                r6 = 109770977(0x68af8e1, float:5.2275525E-35)
                if (r0 == r6) goto L3a
                r6 = 1224424441(0x48fb3bf9, float:514527.78)
                if (r0 == r6) goto L2b
                goto L57
            L2b:
                java.lang.String r6 = "webview"
                boolean r6 = r3.equals(r6)
                if (r6 != 0) goto L34
                goto L57
            L34:
                com.ironsource.sdk.controller.p$b$d r3 = new com.ironsource.sdk.controller.p$b$d
                r3.<init>(r4, r5)
                goto L5d
            L3a:
                java.lang.String r6 = "store"
                boolean r6 = r3.equals(r6)
                if (r6 != 0) goto L43
                goto L57
            L43:
                com.ironsource.sdk.controller.p$b$c r3 = new com.ironsource.sdk.controller.p$b$c
                r3.<init>(r4, r5)
                goto L5d
            L49:
                java.lang.String r5 = "external_browser"
                boolean r5 = r3.equals(r5)
                if (r5 == 0) goto L57
                com.ironsource.sdk.controller.p$b$a r3 = new com.ironsource.sdk.controller.p$b$a
                r3.<init>(r4, r6)
                goto L5d
            L57:
                com.ironsource.sdk.controller.p$b$b r4 = new com.ironsource.sdk.controller.p$b$b
                r4.<init>(r3)
                r3 = r4
            L5d:
                r2.f38649a = r3
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ironsource.sdk.controller.p.a.<init>(java.lang.String, com.ironsource.Uc, com.ironsource.h, com.ironsource.g):void");
        }

        @Override // com.ironsource.sdk.controller.p
        public c a(Context context, Tc openUrl) {
            e0.checkNotNullParameter(context, "context");
            e0.checkNotNullParameter(openUrl, "openUrl");
            try {
                return this.f38649a.a(context, openUrl);
            } catch (Exception e10) {
                C3422r4.d().a(e10);
                String message = e10.getMessage();
                String message2 = (message == null || message.length() == 0) ? "" : e10.getMessage();
                e0.checkNotNull(message2);
                return new c.a(message2);
            }
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public a(String method, Uc openUrlConfigurations) {
            this(method, openUrlConfigurations, new k.b(), new k.a());
            e0.checkNotNullParameter(method, "method");
            e0.checkNotNullParameter(openUrlConfigurations, "openUrlConfigurations");
        }
    }
}
