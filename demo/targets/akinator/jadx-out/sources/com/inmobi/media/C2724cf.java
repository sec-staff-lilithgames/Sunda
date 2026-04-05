package com.inmobi.media;

import android.content.ComponentName;
import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import android.util.Log;
import android.webkit.WebView;
import androidx.core.app.NotificationCompat;
import androidx.window.embedding.ActivityRule;
import androidx.window.embedding.RuleController;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.google.android.gms.appset.AppSetIdInfo;
import com.google.android.gms.common.api.GoogleApiClient;
import com.iab.omid.library.inmobi.Omid;
import com.inmobi.ads.rendering.InMobiAdActivity;
import com.inmobi.commons.core.configs.AdConfig;
import com.ironsource.C3191e4;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ScheduledExecutorService;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.inmobi.media.cf, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C2724cf {

    /* renamed from: b, reason: collision with root package name */
    public static boolean f32714b;

    /* renamed from: a, reason: collision with root package name */
    public static final C2724cf f32713a = new C2724cf();

    /* renamed from: c, reason: collision with root package name */
    public static final C2707bf f32715c = new C2707bf();

    public static final /* synthetic */ void a(C2724cf c2724cf) {
        c2724cf.getClass();
        b();
    }

    public static final void b(Context context) {
        kotlin.jvm.internal.e0.checkNotNullParameter(context, "$context");
        kotlin.jvm.internal.e0.checkNotNullExpressionValue("cf", "TAG");
        try {
            kotlin.jvm.internal.e0.checkNotNullParameter(context, "context");
            WebView webView = new WebView(context);
            webView.setWebViewClient(new Vf());
            webView.clearCache(true);
        } catch (Exception e10) {
            Y5 y52 = Y5.f32563a;
            Y5.f32566d.a(C5.a(e10, NotificationCompat.CATEGORY_EVENT));
        }
    }

    public static final void d(Context context) {
        I6 i6A;
        String string;
        Context contextD;
        JSONObject jSONObject;
        kotlin.jvm.internal.e0.checkNotNullParameter(context, "$context");
        C2942pd c2942pd = C2942pd.f33272a;
        if (c2942pd.b(context) && L4.a(context).isEmpty()) {
            c2942pd.a(context, false);
        }
        C2830j3 c2830j3 = C2830j3.f32954a;
        kotlin.jvm.internal.e0.checkNotNull("j3");
        LinkedList linkedList = new LinkedList(V1.a((C2763f3) AbstractC2807hd.f32902d.getValue(), null, null, null, null, null, null, 63));
        C2830j3.f32955b = linkedList;
        Object objClone = linkedList.clone();
        kotlin.jvm.internal.e0.checkNotNull(objClone, "null cannot be cast to non-null type java.util.LinkedList<com.inmobi.signals.contextualdata.EncryptedContextualData>");
        C2830j3.f32956c = (LinkedList) objClone;
        ScheduledExecutorService scheduledExecutorService = C2777g0.f32850a;
        kotlin.jvm.internal.e0.checkNotNullParameter("AdQualityComponent", "tag");
        kotlin.jvm.internal.e0.checkNotNullParameter("starting", PglCryptUtils.KEY_MESSAGE);
        Log.i("AdQualityComponent", "starting");
        if (C2777g0.f32853d == null) {
            C2777g0.f32853d = new C2743e0(C2777g0.f32854e);
        }
        C2743e0 c2743e0 = C2777g0.f32853d;
        if (c2743e0 == null) {
            kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("executor");
            c2743e0 = null;
        }
        if (c2743e0.f32790b.get()) {
            kotlin.jvm.internal.e0.checkNotNullParameter("AdQualityComponent", "tag");
            kotlin.jvm.internal.e0.checkNotNullParameter("already started", PglCryptUtils.KEY_MESSAGE);
            Log.i("AdQualityComponent", "already started");
        } else {
            C2743e0 c2743e02 = C2777g0.f32853d;
            if (c2743e02 == null) {
                kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("executor");
                c2743e02 = null;
            }
            c2743e02.a();
        }
        W5.b();
        W5.a();
        C2696b4 c2696b4 = AbstractC2679a4.f32633a;
        LinkedHashMap linkedHashMap = Q2.f32149a;
        AdConfig adConfig = (AdConfig) AbstractC3035v5.a(com.mbridge.msdk.foundation.entity.b.JSON_KEY_ADS, "null cannot be cast to non-null type com.inmobi.commons.core.configs.AdConfig", null);
        C2979s0 adReqDeprecateChecker = adConfig.getAdReqDeprecateChecker();
        AbstractC2679a4.f32637e = adReqDeprecateChecker != null ? adReqDeprecateChecker.a(true) : true;
        AbstractC2679a4.e();
        if (adConfig.getRendering().getEnableImmersive()) {
            if (AbstractC2679a4.f32641i && (contextD = C2925od.d()) != null) {
                ConcurrentHashMap concurrentHashMap = I6.f31865b;
                I6 i6A2 = H6.a(contextD, "display_info_store");
                kotlin.jvm.internal.e0.checkNotNullParameter("safe_area", C3191e4.h.W);
                String string2 = i6A2.f31866a.getString("safe_area", null);
                if (string2 != null) {
                    try {
                        jSONObject = new JSONObject(string2);
                    } catch (JSONException unused) {
                        kotlin.jvm.internal.e0.checkNotNullExpressionValue("a4", "TAG");
                    }
                    AbstractC2679a4.f32638f = jSONObject;
                    kotlin.jvm.internal.e0.checkNotNullExpressionValue("a4", "TAG");
                    Objects.toString(AbstractC2679a4.f32638f);
                } else {
                    jSONObject = null;
                    AbstractC2679a4.f32638f = jSONObject;
                    kotlin.jvm.internal.e0.checkNotNullExpressionValue("a4", "TAG");
                    Objects.toString(AbstractC2679a4.f32638f);
                }
            }
            if (AbstractC2679a4.f32641i) {
                if (AbstractC2679a4.f() != null) {
                    kotlin.jvm.internal.e0.checkNotNullExpressionValue("a4", "TAG");
                } else {
                    Context contextD2 = C2925od.d();
                    if (contextD2 != null) {
                        ConcurrentHashMap concurrentHashMap2 = I6.f31865b;
                        I6 i6A3 = H6.a(contextD2, "display_info_store");
                        kotlin.jvm.internal.e0.checkNotNullParameter("nav_bar_type", C3191e4.h.W);
                        int i10 = i6A3.f31866a.getInt("nav_bar_type", -1);
                        Integer numValueOf = Integer.valueOf(i10);
                        AbstractC2679a4.f32639g = numValueOf;
                        if (i10 == -1) {
                            numValueOf = null;
                        }
                        AbstractC2679a4.f32639g = numValueOf;
                        kotlin.jvm.internal.e0.checkNotNullExpressionValue("a4", "TAG");
                    }
                }
            }
        }
        String str = C3075xb.f33575a;
        try {
            Context contextD3 = C2925od.d();
            if (contextD3 != null && C3075xb.f33577c.getPurchases().getInapp()) {
                Context contextD4 = C2925od.d();
                if (contextD4 != null) {
                    ConcurrentHashMap concurrentHashMap3 = I6.f31865b;
                    i6A = H6.a(contextD4, "purchase_store");
                } else {
                    i6A = null;
                }
                if (i6A != null) {
                    kotlin.jvm.internal.e0.checkNotNullParameter("purchase_pref", C3191e4.h.W);
                    string = i6A.f31866a.getString("purchase_pref", null);
                } else {
                    string = null;
                }
                if (string != null) {
                    C3075xb.f33575a = string;
                }
                if (C3075xb.a(contextD3)) {
                    C3075xb.f33578d = 1;
                    Ob ob2 = new Ob();
                    C3075xb.f33576b = ob2;
                    ob2.a(contextD3, new C3041vb());
                }
            }
        } catch (Exception e10) {
            Y5 y52 = Y5.f32563a;
            Y5.f32566d.a(C5.a(e10, NotificationCompat.CATEGORY_EVENT));
        }
        b();
        kotlin.jvm.internal.e0.checkNotNullParameter(context, "context");
        try {
            kotlin.jvm.internal.c1.getOrCreateKotlinClass(m6.a.class).getSimpleName();
            kotlin.jvm.internal.c1.getOrCreateKotlinClass(ActivityRule.class).getSimpleName();
            kotlin.jvm.internal.c1.getOrCreateKotlinClass(RuleController.class).getSimpleName();
            RuleController.Companion.getInstance(context).addRule(new ActivityRule.Builder(uu.b2.setOf(new m6.a(new ComponentName(context, (Class<?>) InMobiAdActivity.class), null))).setAlwaysExpand(true).build());
        } catch (NoClassDefFoundError unused2) {
        }
        try {
            C3031v1.f33468a.c();
            C3031v1.a();
        } catch (Exception unused3) {
            kotlin.jvm.internal.e0.checkNotNullExpressionValue("cf", "TAG");
        }
        C2942pd.f33272a.a(context, "10.8.8");
        f32714b = true;
    }

    public final boolean c() {
        try {
            kotlin.jvm.internal.c1.getOrCreateKotlinClass(androidx.browser.customtabs.v.class).getSimpleName();
            kotlin.jvm.internal.c1.getOrCreateKotlinClass(Omid.class).getSimpleName();
            kotlin.jvm.internal.c1.getOrCreateKotlinClass(xv.l0.class).getSimpleName();
            return false;
        } catch (NoClassDefFoundError unused) {
            return true;
        }
    }

    public final void e(Context context) {
        kotlin.jvm.internal.e0.checkNotNullParameter(context, "context");
        C2879m1.f33066a.a(context, f32715c);
    }

    public final void a(Context context) {
        kotlin.jvm.internal.e0.checkNotNullParameter(context, "context");
        try {
            C2942pd c2942pd = C2942pd.f33272a;
            if (c2942pd.a(context) != null && kotlin.jvm.internal.e0.areEqual(c2942pd.a(context), "10.8.8")) {
                return;
            }
            ExecutorC3020u7 executorC3020u7 = (ExecutorC3020u7) F4.f31772d.getValue();
            androidx.appcompat.app.q runnable = new androidx.appcompat.app.q(context, 4);
            executorC3020u7.getClass();
            kotlin.jvm.internal.e0.checkNotNullParameter(runnable, "runnable");
            executorC3020u7.f33447a.post(runnable);
            c2942pd.a(context, L4.b(context));
            C2925od c2925od = C2925od.f33208a;
            Context applicationContext = context.getApplicationContext();
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
            c2925od.a(applicationContext);
        } catch (Exception e10) {
            Y5 y52 = Y5.f32563a;
            Y5.f32566d.a(C5.a(e10, NotificationCompat.CATEGORY_EVENT));
        }
    }

    public final void c(Context context) {
        String string;
        String string2;
        String string3;
        String string4;
        String string5;
        String string6;
        String string7;
        String string8;
        String string9;
        int i10;
        kotlin.jvm.internal.e0.checkNotNullParameter(context, "context");
        if (f32714b) {
            return;
        }
        LinkedHashMap linkedHashMap = Q2.f32149a;
        O2.a();
        C2926oe.c();
        Se.f32278a.a();
        AppSetIdInfo appSetIdInfo = AbstractC2812i1.f32915a;
        tu.o oVar = O5.f32089a;
        R3.f32183a.F();
        int i11 = AbstractC3024ub.f33453a;
        Context contextD = C2925od.d();
        int i12 = Integer.MIN_VALUE;
        if (i11 != Integer.MIN_VALUE) {
            AbstractC3024ub.f33453a = i11;
            if (contextD != null) {
                ConcurrentHashMap concurrentHashMap = I6.f31865b;
                I6.a(H6.a(contextD, "user_info_store"), "user_age", i11, false, 4, (Object) null);
            }
        }
        String str = AbstractC3024ub.f33455c;
        Context contextD2 = C2925od.d();
        if (str != null) {
            AbstractC3024ub.f33455c = str;
            if (contextD2 != null) {
                ConcurrentHashMap concurrentHashMap2 = I6.f31865b;
                I6.a(H6.a(contextD2, "user_info_store"), "user_age_group", str, false, 4, (Object) null);
            }
        }
        String str2 = AbstractC3024ub.f33456d;
        Context contextD3 = C2925od.d();
        AbstractC3024ub.f33456d = str2;
        if (contextD3 != null && str2 != null) {
            ConcurrentHashMap concurrentHashMap3 = I6.f31865b;
            I6.a(H6.a(contextD3, "user_info_store"), "user_area_code", str2, false, 4, (Object) null);
        }
        String str3 = AbstractC3024ub.f33457e;
        Context contextD4 = C2925od.d();
        if (str3 != null) {
            AbstractC3024ub.f33457e = str3;
            if (contextD4 != null) {
                ConcurrentHashMap concurrentHashMap4 = I6.f31865b;
                I6.a(H6.a(contextD4, "user_info_store"), "user_post_code", str3, false, 4, (Object) null);
            }
        }
        String str4 = AbstractC3024ub.f33458f;
        Context contextD5 = C2925od.d();
        if (str4 != null) {
            AbstractC3024ub.f33458f = str4;
            if (contextD5 != null) {
                ConcurrentHashMap concurrentHashMap5 = I6.f31865b;
                I6.a(H6.a(contextD5, "user_info_store"), "user_city_code", str4, false, 4, (Object) null);
            }
        }
        String str5 = AbstractC3024ub.f33459g;
        Context contextD6 = C2925od.d();
        if (str5 != null) {
            AbstractC3024ub.f33459g = str5;
            if (contextD6 != null) {
                ConcurrentHashMap concurrentHashMap6 = I6.f31865b;
                I6.a(H6.a(contextD6, "user_info_store"), "user_state_code", str5, false, 4, (Object) null);
            }
        }
        String str6 = AbstractC3024ub.f33460h;
        Context contextD7 = C2925od.d();
        if (str6 != null) {
            AbstractC3024ub.f33460h = str6;
            if (contextD7 != null) {
                ConcurrentHashMap concurrentHashMap7 = I6.f31865b;
                I6.a(H6.a(contextD7, "user_info_store"), "user_country_code", str6, false, 4, (Object) null);
            }
        }
        int i13 = AbstractC3024ub.f33461i;
        Context contextD8 = C2925od.d();
        if (i13 != Integer.MIN_VALUE) {
            AbstractC3024ub.f33461i = i13;
            if (contextD8 != null) {
                ConcurrentHashMap concurrentHashMap8 = I6.f31865b;
                I6.a(H6.a(contextD8, "user_info_store"), "user_yob", i13, false, 4, (Object) null);
            }
        }
        String str7 = AbstractC3024ub.f33462j;
        Context contextD9 = C2925od.d();
        if (str7 != null) {
            AbstractC3024ub.f33462j = str7;
            if (contextD9 != null) {
                ConcurrentHashMap concurrentHashMap9 = I6.f31865b;
                I6.a(H6.a(contextD9, "user_info_store"), "user_gender", str7, false, 4, (Object) null);
            }
        }
        String str8 = AbstractC3024ub.f33463k;
        Context contextD10 = C2925od.d();
        if (str8 != null) {
            AbstractC3024ub.f33463k = str8;
            if (contextD10 != null) {
                ConcurrentHashMap concurrentHashMap10 = I6.f31865b;
                I6.a(H6.a(contextD10, "user_info_store"), "user_education", str8, false, 4, (Object) null);
            }
        }
        String str9 = AbstractC3024ub.f33464l;
        Context contextD11 = C2925od.d();
        if (str9 != null) {
            AbstractC3024ub.f33464l = str9;
            if (contextD11 != null) {
                ConcurrentHashMap concurrentHashMap11 = I6.f31865b;
                I6.a(H6.a(contextD11, "user_info_store"), "user_language", str9, false, 4, (Object) null);
            }
        }
        String str10 = AbstractC3024ub.f33465m;
        Context contextD12 = C2925od.d();
        if (str10 != null) {
            AbstractC3024ub.f33465m = str10;
            if (contextD12 != null) {
                ConcurrentHashMap concurrentHashMap12 = I6.f31865b;
                I6.a(H6.a(contextD12, "user_info_store"), "user_interest", str10, false, 4, (Object) null);
            }
        }
        Location location = AbstractC3024ub.f33466n;
        Context contextD13 = C2925od.d();
        if (location != null) {
            AbstractC3024ub.f33466n = location;
            if (contextD13 != null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(location.getLatitude());
                sb2.append(AbstractJsonLexerKt.COMMA);
                sb2.append(location.getLongitude());
                sb2.append(AbstractJsonLexerKt.COMMA);
                sb2.append((int) location.getAccuracy());
                sb2.append(AbstractJsonLexerKt.COMMA);
                sb2.append(location.getTime());
                String string10 = sb2.toString();
                ConcurrentHashMap concurrentHashMap13 = I6.f31865b;
                I6.a(H6.a(contextD13, "user_info_store"), "user_location", string10, false, 4, (Object) null);
            }
        }
        if (AbstractC3024ub.f33453a == Integer.MIN_VALUE) {
            Context contextD14 = C2925od.d();
            if (contextD14 == null) {
                i10 = Integer.MIN_VALUE;
            } else {
                ConcurrentHashMap concurrentHashMap14 = I6.f31865b;
                I6 i6A = H6.a(contextD14, "user_info_store");
                kotlin.jvm.internal.e0.checkNotNullParameter("user_age", C3191e4.h.W);
                i10 = i6A.f31866a.getInt("user_age", Integer.MIN_VALUE);
            }
            AbstractC3024ub.f33453a = i10;
        }
        String string11 = null;
        if (AbstractC3024ub.f33455c == null) {
            Context contextD15 = C2925od.d();
            if (contextD15 == null) {
                string9 = null;
            } else {
                ConcurrentHashMap concurrentHashMap15 = I6.f31865b;
                I6 i6A2 = H6.a(contextD15, "user_info_store");
                kotlin.jvm.internal.e0.checkNotNullParameter("user_age_group", C3191e4.h.W);
                string9 = i6A2.f31866a.getString("user_age_group", null);
            }
            AbstractC3024ub.f33455c = string9;
        }
        if (AbstractC3024ub.f33456d == null) {
            Context contextD16 = C2925od.d();
            if (contextD16 == null) {
                string8 = null;
            } else {
                ConcurrentHashMap concurrentHashMap16 = I6.f31865b;
                I6 i6A3 = H6.a(contextD16, "user_info_store");
                kotlin.jvm.internal.e0.checkNotNullParameter("user_area_code", C3191e4.h.W);
                string8 = i6A3.f31866a.getString("user_area_code", null);
            }
            AbstractC3024ub.f33456d = string8;
        }
        if (AbstractC3024ub.f33457e == null) {
            Context contextD17 = C2925od.d();
            if (contextD17 == null) {
                string7 = null;
            } else {
                ConcurrentHashMap concurrentHashMap17 = I6.f31865b;
                I6 i6A4 = H6.a(contextD17, "user_info_store");
                kotlin.jvm.internal.e0.checkNotNullParameter("user_post_code", C3191e4.h.W);
                string7 = i6A4.f31866a.getString("user_post_code", null);
            }
            AbstractC3024ub.f33457e = string7;
        }
        if (AbstractC3024ub.f33458f == null) {
            Context contextD18 = C2925od.d();
            if (contextD18 == null) {
                string6 = null;
            } else {
                ConcurrentHashMap concurrentHashMap18 = I6.f31865b;
                I6 i6A5 = H6.a(contextD18, "user_info_store");
                kotlin.jvm.internal.e0.checkNotNullParameter("user_city_code", C3191e4.h.W);
                string6 = i6A5.f31866a.getString("user_city_code", null);
            }
            AbstractC3024ub.f33458f = string6;
        }
        if (AbstractC3024ub.f33459g == null) {
            Context contextD19 = C2925od.d();
            if (contextD19 == null) {
                string5 = null;
            } else {
                ConcurrentHashMap concurrentHashMap19 = I6.f31865b;
                I6 i6A6 = H6.a(contextD19, "user_info_store");
                kotlin.jvm.internal.e0.checkNotNullParameter("user_state_code", C3191e4.h.W);
                string5 = i6A6.f31866a.getString("user_state_code", null);
            }
            AbstractC3024ub.f33459g = string5;
        }
        if (AbstractC3024ub.f33460h == null) {
            Context contextD20 = C2925od.d();
            if (contextD20 == null) {
                string4 = null;
            } else {
                ConcurrentHashMap concurrentHashMap20 = I6.f31865b;
                I6 i6A7 = H6.a(contextD20, "user_info_store");
                kotlin.jvm.internal.e0.checkNotNullParameter("user_country_code", C3191e4.h.W);
                string4 = i6A7.f31866a.getString("user_country_code", null);
            }
            AbstractC3024ub.f33460h = string4;
        }
        if (AbstractC3024ub.f33461i == Integer.MIN_VALUE) {
            Context contextD21 = C2925od.d();
            if (contextD21 != null) {
                ConcurrentHashMap concurrentHashMap21 = I6.f31865b;
                I6 i6A8 = H6.a(contextD21, "user_info_store");
                kotlin.jvm.internal.e0.checkNotNullParameter("user_yob", C3191e4.h.W);
                i12 = i6A8.f31866a.getInt("user_yob", Integer.MIN_VALUE);
            }
            AbstractC3024ub.f33461i = i12;
        }
        if (AbstractC3024ub.f33462j == null) {
            Context contextD22 = C2925od.d();
            if (contextD22 == null) {
                string3 = null;
            } else {
                ConcurrentHashMap concurrentHashMap22 = I6.f31865b;
                I6 i6A9 = H6.a(contextD22, "user_info_store");
                kotlin.jvm.internal.e0.checkNotNullParameter("user_gender", C3191e4.h.W);
                string3 = i6A9.f31866a.getString("user_gender", null);
            }
            AbstractC3024ub.f33462j = string3;
        }
        if (AbstractC3024ub.f33463k == null) {
            Context contextD23 = C2925od.d();
            if (contextD23 == null) {
                string2 = null;
            } else {
                ConcurrentHashMap concurrentHashMap23 = I6.f31865b;
                I6 i6A10 = H6.a(contextD23, "user_info_store");
                kotlin.jvm.internal.e0.checkNotNullParameter("user_education", C3191e4.h.W);
                string2 = i6A10.f31866a.getString("user_education", null);
            }
            AbstractC3024ub.f33463k = string2;
        }
        if (AbstractC3024ub.f33464l == null) {
            Context contextD24 = C2925od.d();
            if (contextD24 == null) {
                string = null;
            } else {
                ConcurrentHashMap concurrentHashMap24 = I6.f31865b;
                I6 i6A11 = H6.a(contextD24, "user_info_store");
                kotlin.jvm.internal.e0.checkNotNullParameter("user_language", C3191e4.h.W);
                string = i6A11.f31866a.getString("user_language", null);
            }
            AbstractC3024ub.f33464l = string;
        }
        if (AbstractC3024ub.f33465m == null) {
            Context contextD25 = C2925od.d();
            if (contextD25 != null) {
                ConcurrentHashMap concurrentHashMap25 = I6.f31865b;
                I6 i6A12 = H6.a(contextD25, "user_info_store");
                kotlin.jvm.internal.e0.checkNotNullParameter("user_interest", C3191e4.h.W);
                string11 = i6A12.f31866a.getString("user_interest", null);
            }
            AbstractC3024ub.f33465m = string11;
        }
        AbstractC3024ub.b();
        AbstractC3024ub.c();
        C2925od.a(new androidx.appcompat.app.q(context, 5));
    }

    public static void b() {
        try {
            Se.f32278a.a();
            AppSetIdInfo appSetIdInfo = AbstractC2812i1.f32915a;
            LinkedHashMap linkedHashMap = Q2.f32149a;
            O2.a();
            C3100z2.f33672a.h();
            C2926oe.c();
            C3094yd.f33664a.a();
            Rf rf2 = Rf.f32220a;
            C3031v1.f33468a.c();
            Wb.f32458c.set(true);
            Wb.b();
            C2925od.f().a(new int[]{2, 1, 100, 151, 150, 152}, Wb.f32462g);
            Ka.a();
            Y5.f32563a.a();
            C2926oe.b("SessionStarted", new HashMap(), EnumC2993se.f33373a);
            C2825ie.b();
            R7.a();
        } catch (Exception unused) {
            kotlin.jvm.internal.e0.checkNotNullExpressionValue("cf", "TAG");
            kotlin.jvm.internal.e0.checkNotNullExpressionValue("cf", "TAG");
            AbstractC2902n7.a((byte) 2, "cf", "SDK encountered unexpected error while starting internal components");
        }
    }

    public static final void a() {
        try {
            if (Q2.f32151c.getAndSet(false)) {
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(Q2.f(), "access$getTAG$cp(...)");
                ((K2) Q2.f32150b.getValue()).sendEmptyMessage(5);
            }
            C2926oe.f33220d.set(false);
            C3102z4 c3102z4 = C2926oe.f33222f;
            if (c3102z4 != null) {
                ScheduledExecutorService scheduledExecutorService = c3102z4.f33693h;
                if (scheduledExecutorService != null) {
                    scheduledExecutorService.shutdownNow();
                }
                c3102z4.f33693h = null;
                c3102z4.f33690e.set(false);
                c3102z4.f33691f.set(true);
                c3102z4.f33692g.clear();
                c3102z4.f33694i = null;
            }
            C2926oe.f33222f = null;
            C2926oe.f33225i = null;
            C2925od.f().a(C2926oe.f33224h);
            synchronized (C3094yd.f33664a) {
                try {
                    kotlin.jvm.internal.e0.checkNotNullExpressionValue("yd", "TAG");
                    C2733d7 c2733d7 = C2733d7.f32734a;
                    if (C2733d7.c()) {
                        LocationManager locationManager = C2733d7.f32735b;
                        if (locationManager != null) {
                            locationManager.removeUpdates(c2733d7);
                        }
                        GoogleApiClient googleApiClient = C2733d7.f32737d;
                        if (googleApiClient != null) {
                            googleApiClient.disconnect();
                        }
                    }
                    C2733d7.f32737d = null;
                } finally {
                }
            }
            C3031v1.f33477j.set(true);
            C3031v1.d();
            Wb.f32458c.set(false);
            C2925od.f().a(Wb.f32462g);
            Wb.f32457b = null;
            if (Ka.f31954c.compareAndSet(true, false)) {
                C2799h5 c2799h5 = Ka.f31952a;
                if (c2799h5 != null) {
                    U4 u42 = c2799h5.f32893e;
                    u42.getClass();
                    Ma ma2 = Ma.f32031a;
                    if (u42.a(ma2)) {
                        u42.f32134d = ma2;
                        u42.e();
                    }
                }
                H3 h32 = Ka.f31953b;
                if (h32 != null) {
                    kotlin.jvm.internal.e0.checkNotNullExpressionValue("H3", "TAG");
                    C2787ga c2787ga = h32.f31834e;
                    c2787ga.getClass();
                    Ma ma3 = Ma.f32031a;
                    if (c2787ga.a(ma3)) {
                        c2787ga.f32134d = ma3;
                        c2787ga.b();
                    }
                }
            }
            J3 j32 = Y5.f32565c;
            if (j32 != null) {
                Iterator it = j32.f31901c.iterator();
                while (it.hasNext()) {
                    ((I3) it.next()).b();
                }
            }
            K6 k62 = Y5.f32566d;
            C3102z4 c3102z42 = k62.f31945b;
            if (c3102z42 != null) {
                ScheduledExecutorService scheduledExecutorService2 = c3102z42.f33693h;
                if (scheduledExecutorService2 != null) {
                    scheduledExecutorService2.shutdownNow();
                }
                c3102z42.f33693h = null;
                c3102z42.f33690e.set(false);
                c3102z42.f33691f.set(true);
                c3102z42.f33692g.clear();
                c3102z42.f33694i = null;
            }
            k62.f31945b = null;
            C2925od.f().a(k62.f31947d);
            C2825ie.a();
            R7.f32206a.compareAndSet(true, false);
        } catch (Exception unused) {
            kotlin.jvm.internal.e0.checkNotNullExpressionValue("cf", "TAG");
            kotlin.jvm.internal.e0.checkNotNullExpressionValue("cf", "TAG");
            AbstractC2902n7.a((byte) 1, "cf", "SDK encountered unexpected error while stopping internal components");
        }
    }
}
