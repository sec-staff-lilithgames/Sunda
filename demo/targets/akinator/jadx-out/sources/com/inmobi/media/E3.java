package com.inmobi.media;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.ZQ.duhsDlGWdBkekB;
import com.inmobi.commons.core.configs.TelemetryConfig;
import java.net.URISyntaxException;
import java.util.LinkedHashMap;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public abstract class E3 {
    public static int a(Context context, String url, Sb redirectionValidator, String api, F5 f52) {
        kotlin.jvm.internal.e0.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.e0.checkNotNullParameter(url, "url");
        kotlin.jvm.internal.e0.checkNotNullParameter(redirectionValidator, "redirectionValidator");
        kotlin.jvm.internal.e0.checkNotNullParameter(api, "api");
        if (f52 != null) {
            ((G5) f52).c("DeeplinkHandler", "In appLinkOrDeepLinkHandled");
        }
        if (url.length() == 0) {
            if (f52 == null) {
                return 2;
            }
            ((G5) f52).c("DeeplinkHandler", "AppLink url is Empty or null");
            return 2;
        }
        try {
            List listB = B2.b(context, url);
            if (!listB.isEmpty()) {
                if (f52 != null) {
                    ((G5) f52).c("DeeplinkHandler", "Resolve Info " + ((ResolveInfo) listB.get(0)).activityInfo.name);
                }
                return a(context, url, (ResolveInfo) listB.get(0), redirectionValidator, api, f52);
            }
            if (f52 != null) {
                ((G5) f52).c("DeeplinkHandler", duhsDlGWdBkekB.NkCRtrmxlGKqBh);
            }
            try {
                return B2.a(context, url, redirectionValidator, api);
            } catch (ActivityNotFoundException unused) {
                return a(context, url, null, redirectionValidator, api, f52);
            } catch (NullPointerException unused2) {
                return a(context, url, null, redirectionValidator, api, f52);
            } catch (SecurityException unused3) {
                if (f52 != null) {
                    ((G5) f52).b("DeeplinkHandler", "SecurityException");
                }
                return 12;
            } catch (URISyntaxException unused4) {
                if (f52 != null) {
                    ((G5) f52).b("DeeplinkHandler", "uriSyntaxException");
                }
                return 5;
            } catch (Exception e10) {
                if (f52 != null) {
                    ((G5) f52).b("DeeplinkHandler", "Exception: " + e10);
                }
                return 9;
            }
        } catch (URISyntaxException unused5) {
            if (f52 != null) {
                ((G5) f52).b("DeeplinkHandler", "URISyntaxException for url: ".concat(url));
            }
            return 5;
        }
    }

    public static boolean a(String url, Context context, Sb redirectionValidator, F5 f52) {
        kotlin.jvm.internal.e0.checkNotNullParameter(url, "url");
        kotlin.jvm.internal.e0.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.e0.checkNotNullParameter(redirectionValidator, "redirectionValidator");
        if (!R3.f32183a.J() || !redirectionValidator.a()) {
            return false;
        }
        LinkedHashMap linkedHashMap = Q2.f32149a;
        if (!((TelemetryConfig) AbstractC3035v5.a("telemetry", "null cannot be cast to non-null type com.inmobi.commons.core.configs.TelemetryConfig", null)).getLpConfig().getUniversalLinkEnabled()) {
            return false;
        }
        try {
            Uri uri = Uri.parse(url);
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(uri, "Uri.parse(this)");
            Intent intent = new Intent("android.intent.action.VIEW", uri);
            kotlin.jvm.internal.e0.checkNotNullParameter(intent, "<this>");
            intent.addCategory("android.intent.category.BROWSABLE");
            kotlin.jvm.internal.e0.checkNotNullParameter(intent, "<this>");
            intent.setFlags(268436992);
            kotlin.jvm.internal.e0.checkNotNullParameter(intent, "<this>");
            kotlin.jvm.internal.e0.checkNotNullParameter(context, "context");
            context.startActivity(intent);
            if (f52 == null) {
                return true;
            }
            ((G5) f52).a("DeeplinkHandler", "openDefaultApplication: SUCCESS");
            return true;
        } catch (ActivityNotFoundException unused) {
            if (f52 != null) {
                ((G5) f52).b("DeeplinkHandler", "openDefaultApplication: ActivityNotFoundException");
            }
            return false;
        } catch (NullPointerException unused2) {
            if (f52 != null) {
                ((G5) f52).b("DeeplinkHandler", "openDefaultApplication: NullPointerException");
            }
            return false;
        }
    }

    public static int a(Context context, String str, ResolveInfo resolveInfo, Sb sb2, String str2, F5 f52) {
        try {
            return B2.a(context, str, resolveInfo, sb2, str2);
        } catch (ActivityNotFoundException unused) {
            if (f52 != null) {
                ((G5) f52).b("DeeplinkHandler", AbstractC2811i0.a("ActivityNotFoundException for url: ", str));
            }
            return 6;
        } catch (NullPointerException unused2) {
            if (f52 != null) {
                ((G5) f52).b("DeeplinkHandler", AbstractC2811i0.a("NullPointerException for url: ", str));
            }
            return 13;
        } catch (SecurityException unused3) {
            if (f52 != null) {
                ((G5) f52).b("DeeplinkHandler", AbstractC2811i0.a("SecurityException for url: ", str));
            }
            return 12;
        } catch (URISyntaxException unused4) {
            if (f52 != null) {
                ((G5) f52).b("DeeplinkHandler", AbstractC2811i0.a("URISyntaxException for url: ", str));
            }
            return 5;
        } catch (Exception e10) {
            if (f52 != null) {
                ((G5) f52).b("DeeplinkHandler", "Exception: " + e10);
            }
            return 9;
        }
    }
}
