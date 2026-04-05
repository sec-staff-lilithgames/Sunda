package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid;

import android.net.Uri;
import android.text.TextUtils;
import com.amazon.device.ads.MraidExpandCommand;
import com.amazon.device.ads.MraidResizeCommand;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.moloco.sdk.internal.w;
import com.vungle.ads.internal.presenter.MRAIDPresenter;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.e0;
import sv.n0;
import tu.a0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public abstract class p {

    /* renamed from: b, reason: collision with root package name */
    public static final b f48097b = new b(null);

    /* renamed from: a, reason: collision with root package name */
    public final String f48098a;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a extends p {

        /* renamed from: c, reason: collision with root package name */
        public static final a f48099c = new a();

        public a() {
            super("close", null);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b {

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class a {

            /* renamed from: a, reason: collision with root package name */
            public final boolean f48100a;

            /* renamed from: b, reason: collision with root package name */
            public final String f48101b;

            public a(boolean z10, String description) {
                e0.checkNotNullParameter(description, "description");
                this.f48100a = z10;
                this.f48101b = description;
            }

            public final String a() {
                return this.f48101b;
            }

            public final boolean b() {
                return this.f48100a;
            }
        }

        public /* synthetic */ b(kotlin.jvm.internal.u uVar) {
            this();
        }

        public final e a() {
            return null;
        }

        public final d b(Map<String, String> map) {
            Object objM7131constructorimpl;
            String str = map.get("url");
            if (str == null) {
                return null;
            }
            try {
                int i10 = tu.z.f87419c;
                Uri uri = Uri.parse(str);
                e0.checkNotNullExpressionValue(uri, "parse(...)");
                objM7131constructorimpl = tu.z.m7131constructorimpl(new d(uri));
            } catch (Throwable th2) {
                int i11 = tu.z.f87419c;
                objM7131constructorimpl = tu.z.m7131constructorimpl(a0.createFailure(th2));
            }
            return (d) (tu.z.m7136isFailureimpl(objM7131constructorimpl) ? null : objM7131constructorimpl);
        }

        public final f c(Map<String, String> map) {
            Boolean booleanStrictOrNull;
            String str = map.get("allowOrientationChange");
            if (str == null || (booleanStrictOrNull = n0.toBooleanStrictOrNull(str)) == null) {
                return null;
            }
            boolean zBooleanValue = booleanStrictOrNull.booleanValue();
            r rVarA = r.f48111b.a(map.get("forceOrientation"));
            if (rVarA == null) {
                return null;
            }
            return new f(zBooleanValue, rVarA);
        }

        public b() {
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
        java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
        	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
        	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
         */
        public final com.moloco.sdk.internal.w a(String str) {
            Object objM7131constructorimpl;
            try {
                int i10 = tu.z.f87419c;
                objM7131constructorimpl = tu.z.m7131constructorimpl(Uri.parse(str));
            } catch (Throwable th2) {
                int i11 = tu.z.f87419c;
                objM7131constructorimpl = tu.z.m7131constructorimpl(a0.createFailure(th2));
            }
            Object objA = null;
            if (tu.z.m7136isFailureimpl(objM7131constructorimpl)) {
                objM7131constructorimpl = null;
            }
            Uri uri = (Uri) objM7131constructorimpl;
            if (uri == null) {
                return new w.a(new a(false, a.b.k("Invalid url: ", str)));
            }
            if (!e0.areEqual(uri.getScheme(), CampaignEx.JSON_KEY_MRAID)) {
                return new w.a(new a(false, a.b.k("Non-mraid url scheme: ", str)));
            }
            Map<String, String> mapA = a(uri);
            String host = uri.getHost();
            if (host != null) {
                switch (host.hashCode()) {
                    case -1289167206:
                        if (host.equals(MraidExpandCommand.NAME)) {
                            objA = a(mapA);
                            break;
                        }
                        break;
                    case -934437708:
                        if (host.equals(MraidResizeCommand.NAME)) {
                            objA = a();
                            break;
                        }
                        break;
                    case 3417674:
                        if (host.equals("open")) {
                            objA = b(mapA);
                            break;
                        }
                        break;
                    case 94756344:
                        if (host.equals("close")) {
                            objA = a.f48099c;
                            break;
                        }
                        break;
                    case 133423073:
                        if (host.equals(MRAIDPresenter.SET_ORIENTATION_PROPERTIES)) {
                            objA = c(mapA);
                            break;
                        }
                        break;
                }
            }
            if (objA != null) {
                return new w.b(objA);
            }
            return new w.a(new a(true, "Unknown/unsupported mraid command " + uri.getHost()));
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final c a(Map<String, String> map) {
            Uri uriM7131constructorimpl;
            String str = map.get("url");
            if (str != null) {
                try {
                    int i10 = tu.z.f87419c;
                    uriM7131constructorimpl = tu.z.m7131constructorimpl(Uri.parse(str));
                } catch (Throwable th2) {
                    int i11 = tu.z.f87419c;
                    uriM7131constructorimpl = tu.z.m7131constructorimpl(a0.createFailure(th2));
                }
                uri = tu.z.m7136isFailureimpl(uriM7131constructorimpl) ? null : uriM7131constructorimpl;
            }
            return new c(uri);
        }

        public final Map<String, String> a(Uri uri) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (String str : uri.getQueryParameterNames()) {
                linkedHashMap.put(str, TextUtils.join(",", uri.getQueryParameters(str)));
            }
            return linkedHashMap;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class c extends p {

        /* renamed from: c, reason: collision with root package name */
        public final Uri f48102c;

        public c(Uri uri) {
            super(MraidExpandCommand.NAME, null);
            this.f48102c = uri;
        }

        public final Uri b() {
            return this.f48102c;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class d extends p {

        /* renamed from: c, reason: collision with root package name */
        public final Uri f48103c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Uri uri) {
            super("open", null);
            e0.checkNotNullParameter(uri, "uri");
            this.f48103c = uri;
        }

        public final Uri b() {
            return this.f48103c;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class e extends p {

        /* renamed from: c, reason: collision with root package name */
        public final int f48104c;

        /* renamed from: d, reason: collision with root package name */
        public final int f48105d;

        /* renamed from: e, reason: collision with root package name */
        public final int f48106e;

        /* renamed from: f, reason: collision with root package name */
        public final int f48107f;

        /* renamed from: g, reason: collision with root package name */
        public final boolean f48108g;

        public e(int i10, int i11, int i12, int i13, boolean z10) {
            super(MraidResizeCommand.NAME, null);
            this.f48104c = i10;
            this.f48105d = i11;
            this.f48106e = i12;
            this.f48107f = i13;
            this.f48108g = z10;
        }

        public final boolean b() {
            return this.f48108g;
        }

        public final int c() {
            return this.f48105d;
        }

        public final int d() {
            return this.f48106e;
        }

        public final int e() {
            return this.f48107f;
        }

        public final int f() {
            return this.f48104c;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class f extends p {

        /* renamed from: c, reason: collision with root package name */
        public final boolean f48109c;

        /* renamed from: d, reason: collision with root package name */
        public final r f48110d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(boolean z10, r forceOrientation) {
            super(MRAIDPresenter.SET_ORIENTATION_PROPERTIES, null);
            e0.checkNotNullParameter(forceOrientation, "forceOrientation");
            this.f48109c = z10;
            this.f48110d = forceOrientation;
        }

        public final boolean b() {
            return this.f48109c;
        }

        public final r c() {
            return this.f48110d;
        }
    }

    public /* synthetic */ p(String str, kotlin.jvm.internal.u uVar) {
        this(str);
    }

    public final String a() {
        return this.f48098a;
    }

    public p(String str) {
        this.f48098a = str;
    }

    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.orientation.b a(f fVar) {
        e0.checkNotNullParameter(fVar, "<this>");
        return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.orientation.b(t.a(fVar.c()), fVar.b());
    }
}
