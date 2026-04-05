package com.inmobi.media;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.SparseArray;
import android.webkit.URLUtil;
import androidx.activity.result.HM.OIPXcgrVyyxoLF;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.google.android.gms.ads.nonagon.util.logging.csi.iPgB.gjnZrsdA;
import com.inmobi.ads.rendering.InMobiAdActivity;
import com.mbridge.msdk.scheme.request.VDe.SUvoXnn;
import cv.BLca.YsiBvdpw;
import java.io.UnsupportedEncodingException;
import java.lang.ref.WeakReference;
import java.net.URISyntaxException;
import java.net.URLEncoder;
import java.util.HashMap;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class S6 {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f32256i = 0;

    /* renamed from: a, reason: collision with root package name */
    public final Context f32257a;

    /* renamed from: b, reason: collision with root package name */
    public final T6 f32258b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC2779g2 f32259c;

    /* renamed from: d, reason: collision with root package name */
    public final C2924oc f32260d;

    /* renamed from: e, reason: collision with root package name */
    public final Z1 f32261e;

    /* renamed from: f, reason: collision with root package name */
    public final Y6 f32262f;

    /* renamed from: g, reason: collision with root package name */
    public final F5 f32263g;

    /* renamed from: h, reason: collision with root package name */
    public int f32264h;

    /* JADX WARN: Multi-variable type inference failed */
    public S6(Context context, T6 landingPageState, InterfaceC2779g2 interfaceC2779g2, C2924oc c2924oc, Sb redirectionValidator, Y6 y62, F5 f52) {
        kotlin.jvm.internal.e0.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.e0.checkNotNullParameter(landingPageState, "landingPageState");
        kotlin.jvm.internal.e0.checkNotNullParameter(redirectionValidator, "redirectionValidator");
        this.f32257a = context;
        this.f32258b = landingPageState;
        this.f32259c = interfaceC2779g2;
        this.f32260d = c2924oc;
        this.f32261e = (Z1) redirectionValidator;
        this.f32262f = y62;
        this.f32263g = f52;
    }

    /* JADX WARN: Removed duplicated region for block: B:115:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01fe  */
    /* JADX WARN: Type inference failed for: r14v5, types: [com.inmobi.media.Sb, com.inmobi.media.Z1] */
    /* JADX WARN: Type inference failed for: r5v5, types: [com.inmobi.media.Sb, com.inmobi.media.Z1] */
    /* JADX WARN: Type inference failed for: r6v5, types: [com.inmobi.media.Sb, com.inmobi.media.Z1] */
    /* JADX WARN: Type inference failed for: r6v9, types: [com.inmobi.media.Sb, com.inmobi.media.Z1] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.inmobi.media.Q6 a(com.inmobi.media.S6 r16, java.lang.String r17, java.lang.String r18, java.lang.String r19, com.inmobi.media.X6 r20, boolean r21, int r22) {
        /*
            Method dump skipped, instructions count: 729
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.S6.a(com.inmobi.media.S6, java.lang.String, java.lang.String, java.lang.String, com.inmobi.media.X6, boolean, int):com.inmobi.media.Q6");
    }

    /* JADX WARN: Type inference failed for: r11v1, types: [com.inmobi.media.Sb, com.inmobi.media.Z1] */
    /* JADX WARN: Type inference failed for: r15v0, types: [com.inmobi.media.Sb, com.inmobi.media.Z1] */
    public final Q6 b(String str, String str2, String str3, X6 x62) {
        F5 f52 = this.f32263g;
        if (f52 != null) {
            kotlin.jvm.internal.e0.checkNotNullExpressionValue("S6", "TAG");
            ((G5) f52).c("S6", "In processInMobiNativeBrowserScheme");
        }
        String queryParameter = Uri.parse(str3).getQueryParameter("url");
        if (queryParameter == null || queryParameter.length() == 0) {
            C2924oc c2924oc = this.f32260d;
            if (c2924oc != null) {
                kotlin.jvm.internal.e0.checkNotNullParameter("Invalid URL", PglCryptUtils.KEY_MESSAGE);
                c2924oc.f33206a.a(str2, "Invalid URL", str);
            }
            F5 f53 = this.f32263g;
            if (f53 != null) {
                kotlin.jvm.internal.e0.checkNotNullExpressionValue("S6", "TAG");
                ((G5) f53).c("S6", "InMobiNativeBrowserScheme url is Empty or null");
            }
            L6 l62 = L6.f31991e;
            P6.a(l62, x62, (Integer) 8001, (kv.p) M6.a(l62, "funnelState", this));
            return new Q6(3, 8001);
        }
        if (x62 != null) {
            x62.f32490g = "EX_NATIVE";
        }
        if (E3.a(str3, this.f32257a, this.f32261e, this.f32263g)) {
            L6 l63 = L6.f31992f;
            P6.a(l63, x62, (Integer) null, M6.a(l63, "funnelState", this));
            c(str, str2, str3);
            F5 f54 = this.f32263g;
            if (f54 != null) {
                kotlin.jvm.internal.e0.checkNotNullExpressionValue("S6", "TAG");
                ((G5) f54).c("S6", "InmobiNativeBrowser scheme url handled successfully");
            }
            return new Q6(1);
        }
        int iA = E3.a(this.f32257a, queryParameter, this.f32261e, str, this.f32263g);
        if (iA == 0 || iA == 1) {
            L6 l64 = L6.f31992f;
            P6.a(l64, x62, (Integer) null, M6.a(l64, "funnelState", this));
            c(str, str2, str3);
            F5 f55 = this.f32263g;
            if (f55 != null) {
                kotlin.jvm.internal.e0.checkNotNullExpressionValue("S6", "TAG");
                ((G5) f55).c("S6", "InmobiNativeBrowser scheme url handled successfully");
            }
            return new Q6(1);
        }
        C2924oc c2924oc2 = this.f32260d;
        if (c2924oc2 != null) {
            kotlin.jvm.internal.e0.checkNotNullParameter("Invalid URL", PglCryptUtils.KEY_MESSAGE);
            c2924oc2.f33206a.a(str2, "Invalid URL", str);
        }
        F5 f56 = this.f32263g;
        if (f56 != null) {
            kotlin.jvm.internal.e0.checkNotNullExpressionValue("S6", "TAG");
            ((G5) f56).c("S6", "InmobiNativeBrowser scheme url handling failed");
        }
        L6 l65 = L6.f31993g;
        P6.a(l65, x62, Integer.valueOf(iA), M6.a(l65, "funnelState", this));
        return new Q6(2, Integer.valueOf(iA));
    }

    public final int c(String str, String str2, String str3, X6 x62) {
        F5 f52 = this.f32263g;
        if (f52 != null) {
            kotlin.jvm.internal.e0.checkNotNullExpressionValue("S6", "TAG");
            ((G5) f52).a("S6", "In processInternalNativeRequest");
        }
        try {
            return d(str, str2, str3, x62);
        } catch (Exception e10) {
            C2924oc c2924oc = this.f32260d;
            if (c2924oc != null) {
                kotlin.jvm.internal.e0.checkNotNullParameter("Unexpected error", PglCryptUtils.KEY_MESSAGE);
                c2924oc.f33206a.a(str2, "Unexpected error", "open");
            }
            AbstractC2902n7.a((byte) 1, "InMobi", "Failed to open URL SDK encountered unexpected error");
            F5 f53 = this.f32263g;
            if (f53 == null) {
                return 9;
            }
            ((G5) f53).b("S6", Qf.a(e10, N6.a("S6", "TAG", "SDK encountered unexpected error in handling open() request from creative ")));
            return 9;
        }
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [com.inmobi.media.Sb, com.inmobi.media.Z1] */
    /* JADX WARN: Type inference failed for: r5v0, types: [com.inmobi.media.Sb, com.inmobi.media.Z1] */
    public final int d(String api, String str, String str2, X6 x62) {
        kotlin.jvm.internal.e0.checkNotNullParameter(api, "api");
        F5 f52 = this.f32263g;
        if (f52 != null) {
            ((G5) f52).c("S6", O6.a("S6", "TAG", YsiBvdpw.iQvMolH, str2));
        }
        if (x62 != null) {
            x62.f32490g = "IN_NATIVE";
        }
        if (str2 == null || (sv.k0.startsWith$default(str2, "http", false, 2, null) && !URLUtil.isValidUrl(str2))) {
            F5 f53 = this.f32263g;
            if (f53 != null) {
                kotlin.jvm.internal.e0.checkNotNullExpressionValue("S6", "TAG");
                ((G5) f53).c("S6", api + " called with invalid url (" + str2 + ')');
            }
            C2924oc c2924oc = this.f32260d;
            if (c2924oc != null) {
                kotlin.jvm.internal.e0.checkNotNullParameter("Invalid URL", PglCryptUtils.KEY_MESSAGE);
                c2924oc.f33206a.a(str, "Invalid URL", api);
            }
            L6 l62 = L6.f31991e;
            P6.a(l62, x62, (Integer) 3, (kv.p) M6.a(l62, "funnelState", this));
            return 3;
        }
        String strA = AbstractC3101z3.a(this.f32257a);
        try {
            try {
                boolean z10 = this.f32258b.f32300c;
                if (strA != null && z10) {
                    new C2880m2(str2, null, this.f32257a, this.f32259c, this.f32261e, x62, api).a();
                    F5 f54 = this.f32263g;
                    if (f54 != null) {
                        kotlin.jvm.internal.e0.checkNotNullExpressionValue("S6", "TAG");
                        ((G5) f54).c("S6", "Default and Internal Native handled successfully");
                    }
                    return 0;
                }
                F5 f55 = this.f32263g;
                if (f55 != null) {
                    kotlin.jvm.internal.e0.checkNotNullExpressionValue("S6", "TAG");
                    ((G5) f55).a("S6", "ChromeCustomTab fallback to Embedded");
                }
                if (x62 != null) {
                    x62.f32490g = "IN_CUSTOM";
                }
                return a(str2, api, x62);
            } catch (Exception e10) {
                F5 f56 = this.f32263g;
                if (f56 != null) {
                    kotlin.jvm.internal.e0.checkNotNullExpressionValue("S6", "TAG");
                    ((G5) f56).a("S6", "Exception occurred while opening External ", e10);
                }
                return 9;
            }
        } catch (Exception unused) {
            int iA = B2.a(this.f32257a, str2, (Sb) this.f32261e, api);
            if (iA != 0 && iA != 1) {
                return iA;
            }
            c(api, str, str2);
            if (x62 != null) {
                x62.f32490g = "EX_NATIVE";
            }
            L6 funnelState = L6.f31992f;
            kotlin.jvm.internal.e0.checkNotNullParameter(funnelState, "funnelState");
            P6.a(funnelState, x62, (Integer) null, new R6(this));
            return iA;
        }
    }

    /* JADX WARN: Type inference failed for: r3v7, types: [com.inmobi.media.Sb, com.inmobi.media.Z1] */
    public final void e(String str, String str2, String str3, X6 x62) {
        String str4;
        String str5;
        String str6;
        X6 x63;
        S6 s62;
        String str7;
        String str8;
        String str9;
        X6 x64;
        S6 s63;
        try {
            try {
                try {
                    B2.a(this.f32257a, str2, (Sb) this.f32261e, "openExternal");
                    L6 l62 = L6.f31992f;
                    P6.a(l62, x62, (Integer) null, M6.a(l62, "funnelState", this));
                    c("openExternal", str, str2);
                } catch (ActivityNotFoundException e10) {
                    e = e10;
                    s63 = this;
                    str7 = str;
                    str8 = str2;
                    str9 = str3;
                    x64 = x62;
                    a(s63, str7, str8, str9, x64, e);
                } catch (URISyntaxException e11) {
                    e = e11;
                    s62 = this;
                    str4 = str;
                    str5 = str2;
                    str6 = str3;
                    x63 = x62;
                    a(s62, str4, str5, str6, x63, e);
                }
            } catch (NullPointerException e12) {
                a(this, str, str2, str3, x62, e12);
            } catch (Exception e13) {
                L6 l63 = L6.f31993g;
                P6.a(l63, x62, (Integer) 9, (kv.p) M6.a(l63, "funnelState", this));
                C2924oc c2924oc = this.f32260d;
                if (c2924oc != null) {
                    kotlin.jvm.internal.e0.checkNotNullParameter("Unexpected error", PglCryptUtils.KEY_MESSAGE);
                    c2924oc.f33206a.a(str, "Unexpected error", "openExternal");
                }
                kotlin.jvm.internal.e0.checkNotNullExpressionValue("S6", "TAG");
                AbstractC2902n7.a((byte) 1, "S6", SUvoXnn.HsfN);
                F5 f52 = this.f32263g;
                if (f52 != null) {
                    ((G5) f52).b("S6", Qf.a(e13, N6.a("S6", "TAG", gjnZrsdA.TZe)));
                }
            }
        } catch (ActivityNotFoundException e14) {
            e = e14;
            str7 = str;
            str8 = str2;
            str9 = str3;
            x64 = x62;
            s63 = this;
        } catch (URISyntaxException e15) {
            e = e15;
            str4 = str;
            str5 = str2;
            str6 = str3;
            x63 = x62;
            s62 = this;
        }
    }

    public final void c(String str, String str2, String str3) {
        C2924oc c2924oc = this.f32260d;
        if (c2924oc != null) {
            c2924oc.f33206a.getListener().a();
        }
        C2924oc c2924oc2 = this.f32260d;
        if (c2924oc2 != null) {
            GestureDetectorOnGestureListenerC3093yc.a(c2924oc2.f33206a, str, str2, str3);
        }
    }

    public final void b(String str, String str2, String str3) {
        F5 f52 = this.f32263g;
        if (f52 != null) {
            kotlin.jvm.internal.e0.checkNotNullExpressionValue("S6", "TAG");
            ((G5) f52).c("S6", str + " called with invalid url (" + str3 + ')');
        }
        C2924oc c2924oc = this.f32260d;
        if (c2924oc != null) {
            kotlin.jvm.internal.e0.checkNotNullParameter("Invalid URL", PglCryptUtils.KEY_MESSAGE);
            c2924oc.f33206a.a(str2, "Invalid URL", str);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x014c A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x014e  */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v23 */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r2v4, types: [com.inmobi.media.Sb, com.inmobi.media.Z1] */
    /* JADX WARN: Type inference failed for: r2v8, types: [com.inmobi.media.Sb, com.inmobi.media.Z1] */
    /* JADX WARN: Type inference failed for: r4v1, types: [com.inmobi.media.Sb, com.inmobi.media.Z1] */
    /* JADX WARN: Type inference failed for: r7v5, types: [com.inmobi.media.Sb, com.inmobi.media.Z1] */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int a(java.lang.String r19, java.lang.String r20, java.lang.String r21, com.inmobi.media.X6 r22, com.inmobi.media.C2846k2 r23) {
        /*
            Method dump skipped, instructions count: 445
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.S6.a(java.lang.String, java.lang.String, java.lang.String, com.inmobi.media.X6, com.inmobi.media.k2):int");
    }

    public final Q6 a(String str, String str2, String str3, X6 x62) {
        F5 f52 = this.f32263g;
        if (f52 != null) {
            kotlin.jvm.internal.e0.checkNotNullExpressionValue("S6", "TAG");
            ((G5) f52).a("S6", "In processInMobiDeepLinkScheme");
        }
        Uri uri = Uri.parse(str3);
        int iA = a(str, uri.getQueryParameter("primaryUrl"), uri.getQueryParameter("primaryTrackingUrl"));
        String str4 = OIPXcgrVyyxoLF.PCHQNot;
        if (iA != 0 && iA != 1) {
            int iA2 = a(str, uri.getQueryParameter("fallbackUrl"), uri.getQueryParameter("fallbackTrackingUrl"));
            if (x62 != null) {
                x62.f32490g = str4;
            }
            if (iA2 != 0 && iA2 != 1) {
                C2924oc c2924oc = this.f32260d;
                if (c2924oc != null) {
                    kotlin.jvm.internal.e0.checkNotNullParameter("Invalid URL", PglCryptUtils.KEY_MESSAGE);
                    c2924oc.f33206a.a(str2, "Invalid URL", str);
                }
                F5 f53 = this.f32263g;
                if (f53 != null) {
                    kotlin.jvm.internal.e0.checkNotNullExpressionValue("S6", "TAG");
                    ((G5) f53).c("S6", "InMobiDeepLinkScheme Fallback Url handling failed");
                }
                L6 l62 = L6.f31993g;
                P6.a(l62, x62, Integer.valueOf(iA2), M6.a(l62, "funnelState", this));
                return new Q6(2, Integer.valueOf(iA2));
            }
            F5 f54 = this.f32263g;
            if (f54 != null) {
                kotlin.jvm.internal.e0.checkNotNullExpressionValue("S6", "TAG");
                ((G5) f54).c("S6", "InMobiDeepLinkScheme Fallback Url handled successfully");
            }
            L6 l63 = L6.f31992f;
            P6.a(l63, x62, (Integer) null, M6.a(l63, "funnelState", this));
            c(str, str2, str3);
            return new Q6(1);
        }
        F5 f55 = this.f32263g;
        if (f55 != null) {
            kotlin.jvm.internal.e0.checkNotNullExpressionValue("S6", "TAG");
            ((G5) f55).c("S6", "InMobiDeepLinkScheme Primary Url handled successfully");
        }
        if (x62 != null) {
            x62.f32490g = str4;
        }
        L6 l64 = L6.f31992f;
        P6.a(l64, x62, (Integer) null, M6.a(l64, "funnelState", this));
        c(str, str2, str3);
        return new Q6(1);
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [com.inmobi.media.Sb, com.inmobi.media.Z1] */
    /* JADX WARN: Type inference failed for: r7v0, types: [com.inmobi.media.Sb, com.inmobi.media.Z1] */
    public final int a(String str, String str2, String str3) {
        F5 f52 = this.f32263g;
        if (f52 != null) {
            kotlin.jvm.internal.e0.checkNotNullExpressionValue("S6", "TAG");
            ((G5) f52).c("S6", "inMobiDeepLinkSchemeUrlHandled - url - " + str2 + " trackingUrl " + str3);
        }
        if (str2 != null && str2.length() != 0) {
            if (E3.a(str2, this.f32257a, this.f32261e, this.f32263g)) {
                if (D2.a(str3)) {
                    C3100z2 c3100z2 = C3100z2.f33672a;
                    kotlin.jvm.internal.e0.checkNotNull(str3);
                    c3100z2.a(str3, true, this.f32263g);
                } else {
                    F5 f53 = this.f32263g;
                    if (f53 != null) {
                        kotlin.jvm.internal.e0.checkNotNullExpressionValue("S6", "TAG");
                        ((G5) f53).b("S6", "InMobiDeepLinkScheme scheme tracking url handling is invalid ");
                    }
                }
                F5 f54 = this.f32263g;
                if (f54 != null) {
                    kotlin.jvm.internal.e0.checkNotNullExpressionValue("S6", "TAG");
                    ((G5) f54).c("S6", "InMobiDeepLinkScheme scheme applink/http url handled successfully");
                }
                return 0;
            }
            int iA = E3.a(this.f32257a, str2, this.f32261e, str, this.f32263g);
            if (iA != 0 && iA != 1) {
                F5 f55 = this.f32263g;
                if (f55 != null) {
                    kotlin.jvm.internal.e0.checkNotNullExpressionValue("S6", "TAG");
                    ((G5) f55).c("S6", "InMobiDeepLinkScheme scheme applink/http url handling failed");
                }
                return iA;
            }
            if (D2.a(str3)) {
                C3100z2 c3100z22 = C3100z2.f33672a;
                kotlin.jvm.internal.e0.checkNotNull(str3);
                c3100z22.a(str3, true, this.f32263g);
            } else {
                F5 f56 = this.f32263g;
                if (f56 != null) {
                    kotlin.jvm.internal.e0.checkNotNullExpressionValue("S6", "TAG");
                    ((G5) f56).b("S6", "InMobiDeepLinkScheme scheme tracking url handling is invalid ");
                }
            }
            F5 f57 = this.f32263g;
            if (f57 != null) {
                kotlin.jvm.internal.e0.checkNotNullExpressionValue("S6", "TAG");
                ((G5) f57).c("S6", "InMobiDeepLinkScheme scheme applink/http url handled successfully");
            }
            return 0;
        }
        F5 f58 = this.f32263g;
        if (f58 == null) {
            return 2;
        }
        kotlin.jvm.internal.e0.checkNotNullExpressionValue("S6", "TAG");
        ((G5) f58).b("S6", "InMobiDeepLinkScheme url is Empty or null");
        return 2;
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [com.inmobi.media.Sb, com.inmobi.media.Z1] */
    public final int a(String url, String api, X6 x62) {
        X6 x63;
        kotlin.jvm.internal.e0.checkNotNullParameter(url, "url");
        kotlin.jvm.internal.e0.checkNotNullParameter(api, "api");
        if (x62 != null) {
            x62.f32490g = "IN_CUSTOM";
        }
        if (url.length() == 0) {
            F5 f52 = this.f32263g;
            if (f52 != null) {
                kotlin.jvm.internal.e0.checkNotNullExpressionValue("S6", "TAG");
                ((G5) f52).b("S6", "processOpenEmbeddedRequest failed due to empty URL");
            }
            L6 l62 = L6.f31991e;
            P6.a(l62, x62, (Integer) null, M6.a(l62, "funnelState", this));
            return 2;
        }
        Uri uri = Uri.parse(url);
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(uri, "Uri.parse(this)");
        if (B2.a(uri)) {
            Intent intent = new Intent(this.f32257a, (Class<?>) InMobiAdActivity.class);
            intent.putExtra("com.inmobi.ads.rendering.InMobiAdActivity.EXTRA_AD_ACTIVITY_TYPE", 100);
            intent.putExtra("com.inmobi.ads.rendering.InMobiAdActivity.IN_APP_BROWSER_URL", url);
            intent.putExtra("viewTouchTimestamp", this.f32261e.getViewTouchTimestamp());
            if (x62 != null) {
                Y6 landingPageTelemetryMetaData = x62.f32484a;
                String urlType = x62.f32485b;
                int i10 = x62.f32486c;
                long j10 = x62.f32487d;
                kotlin.jvm.internal.e0.checkNotNullParameter(landingPageTelemetryMetaData, "landingPageTelemetryMetaData");
                kotlin.jvm.internal.e0.checkNotNullParameter(urlType, "urlType");
                x63 = new X6(landingPageTelemetryMetaData, urlType, i10, j10);
                L6 l63 = L6.f31990d;
                x63.f32489f = 2;
            } else {
                x63 = null;
            }
            intent.putExtra("lpTelemetryControlInfo", x63);
            F5 obj = this.f32263g;
            if (obj != null) {
                String strC = w0.i.c("toString(...)");
                HashMap map = AbstractC2984s5.f33365a;
                String key = strC.toString();
                kotlin.jvm.internal.e0.checkNotNullParameter(key, "key");
                kotlin.jvm.internal.e0.checkNotNullParameter(obj, "obj");
                AbstractC2984s5.f33365a.put(key, new WeakReference(obj));
                intent.putExtra("loggerCacheKey", strC.toString());
            }
            C2924oc c2924oc = this.f32260d;
            if (c2924oc != null) {
                kotlin.jvm.internal.e0.checkNotNullParameter(intent, "intent");
                intent.putExtra("creativeId", c2924oc.f33206a.getCreativeId());
                intent.putExtra("impressionId", c2924oc.f33206a.getImpressionId());
                intent.putExtra("placementId", c2924oc.f33206a.getPlacementId());
                SparseArray sparseArray = InMobiAdActivity.f31591k;
                GestureDetectorOnGestureListenerC3093yc gestureDetectorOnGestureListenerC3093yc = c2924oc.f33206a;
                InMobiAdActivity.f31592l = gestureDetectorOnGestureListenerC3093yc;
                if (gestureDetectorOnGestureListenerC3093yc.getPlacementType() == 0) {
                    C2925od c2925od = C2925od.f33208a;
                    Context context = (Activity) c2924oc.f33206a.f33646r.get();
                    if (context == null) {
                        context = c2924oc.f33207b;
                    }
                    c2925od.a(context, intent);
                } else {
                    C2925od.f33208a.a(c2924oc.f33206a.getContainerContext(), intent);
                }
            }
            L6 l64 = L6.f31992f;
            P6.a(l64, x62, (Integer) null, M6.a(l64, "funnelState", this));
            C2924oc c2924oc2 = this.f32260d;
            if (c2924oc2 == null) {
                return 1;
            }
            GestureDetectorOnGestureListenerC3093yc.a(c2924oc2.f33206a, null, null, url);
            return 1;
        }
        F5 f53 = this.f32263g;
        if (f53 == null) {
            return 10;
        }
        kotlin.jvm.internal.e0.checkNotNullExpressionValue("S6", "TAG");
        ((G5) f53).b("S6", "Embedded request unable to handle ".concat(url));
        return 10;
    }

    public static final void a(S6 s62, String str, String str2, String str3, X6 x62, Exception exc) throws UnsupportedEncodingException {
        F5 f52 = s62.f32263g;
        if (f52 != null) {
            ((G5) f52).b("S6", Qf.a(exc, N6.a("S6", "TAG", "Error message in processing openExternal: ")));
        }
        C2924oc c2924oc = s62.f32260d;
        if (c2924oc != null) {
            StringBuilder sb2 = new StringBuilder("Cannot resolve URI (");
            try {
                String strEncode = URLEncoder.encode(str2, com.mbridge.msdk.playercommon.exoplayer2.C.UTF8_NAME);
                kotlin.jvm.internal.e0.checkNotNull(strEncode);
                str2 = strEncode;
            } catch (UnsupportedEncodingException unused) {
            }
            sb2.append(str2);
            sb2.append(')');
            String message = sb2.toString();
            kotlin.jvm.internal.e0.checkNotNullParameter(message, "message");
            c2924oc.f33206a.a(str, message, "openExternal");
        }
        if (str3 != null) {
            s62.e(str, str3, null, x62);
        }
    }
}
