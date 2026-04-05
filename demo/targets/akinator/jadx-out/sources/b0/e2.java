package b0;

import android.content.res.TypedArray;
import android.media.MediaDrm;
import android.media.MediaMetadataRetriever;
import android.os.Bundle;
import android.widget.RelativeLayout;
import com.android.billingclient.api.BillingResult;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.v4;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdListener;
import com.applovin.mediation.adapters.ByteDanceMediationAdapter;
import com.applovin.shadow.okio.Path;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract /* synthetic */ class e2 {
    public static void A(StringBuilder sb2, String str, long j10, String str2) {
        sb2.append(str);
        sb2.append(j10);
        sb2.append(str2);
    }

    public static void B(StringBuilder sb2, String str, com.applovin.impl.sdk.o oVar, String str2) {
        sb2.append(str);
        oVar.a(str2, sb2.toString());
    }

    public static void C(StringBuilder sb2, String str, ByteDanceMediationAdapter byteDanceMediationAdapter) {
        sb2.append(str);
        byteDanceMediationAdapter.log(sb2.toString());
    }

    public static float a(float f10, float f11, float f12, float f13) {
        return ((f10 * f11) + f12) * f13;
    }

    public static int b(float f10, int i10, int i11) {
        return (Float.hashCode(f10) + i10) * i11;
    }

    public static long c() {
        return new Date().getTime();
    }

    public static Bundle d(int i10, String str, String str2) {
        Bundle bundle = new Bundle(i10);
        bundle.putString(str, str2);
        return bundle;
    }

    public static RelativeLayout.LayoutParams e(int i10, int i11, int i12) {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(i10, i11);
        layoutParams.addRule(i12);
        return layoutParams;
    }

    public static BillingResult f(int i10, String str) {
        BillingResult.Builder builderNewBuilder = BillingResult.newBuilder();
        builderNewBuilder.setResponseCode(i10);
        builderNewBuilder.setDebugMessage(str);
        return builderNewBuilder.build();
    }

    public static v4 g(String str, long j10, TimeUnit timeUnit) {
        return v4.a(str, Long.valueOf(timeUnit.toMillis(j10)));
    }

    public static String h(char c10, String str, int i10) {
        return str + i10 + c10;
    }

    public static String i(long j10, String str, StringBuilder sb2) {
        sb2.append(str);
        sb2.append(j10);
        return sb2.toString();
    }

    public static String j(Path path, String str) {
        return str + path;
    }

    public static String k(Class cls, StringBuilder sb2, String str) {
        sb2.append(cls.getName());
        sb2.append(str);
        return sb2.toString();
    }

    public static String l(Exception exc, StringBuilder sb2) {
        sb2.append(exc.getMessage());
        return sb2.toString();
    }

    public static String m(String str, String str2, int i10, Object[] objArr) {
        String str3 = String.format(str, Arrays.copyOf(objArr, i10));
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(str3, str2);
        return str3;
    }

    public static String n(StringBuilder sb2, String str, int i10, String str2) {
        sb2.append(str);
        sb2.append(i10);
        sb2.append(str2);
        return sb2.toString();
    }

    public static String o(Throwable th2, StringBuilder sb2) {
        sb2.append(th2.getMessage());
        return sb2.toString();
    }

    public static String p(Locale locale, String str, String str2, Locale locale2, String str3) {
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(locale, str);
        String lowerCase = str2.toLowerCase(locale2);
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(lowerCase, str3);
        return lowerCase;
    }

    public static /* synthetic */ String q(CharSequence[] charSequenceArr) {
        StringBuilder sb2 = new StringBuilder();
        if (charSequenceArr.length > 0) {
            sb2.append(charSequenceArr[0]);
            for (int i10 = 1; i10 < charSequenceArr.length; i10++) {
                sb2.append((CharSequence) ",");
                sb2.append(charSequenceArr[i10]);
            }
        }
        return sb2.toString();
    }

    public static StringBuilder r(long j10, String str, String str2) {
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append(j10);
        sb2.append(str2);
        return sb2;
    }

    public static HashMap s(String str, String str2) {
        HashMap map = new HashMap();
        map.put(str, str2);
        return map;
    }

    public static JSONArray t(JSONObject jSONObject, String str) {
        return JsonUtils.getJSONArray(jSONObject, str, new JSONArray());
    }

    public static tu.k u() {
        b1.j0.unsupported();
        return new tu.k();
    }

    public static void v(int i10, HashMap map, String str, int i11, String str2) {
        map.put(str, Integer.valueOf(i10));
        map.put(str2, Integer.valueOf(i11));
    }

    public static void w(MaxAdFormat maxAdFormat, StringBuilder sb2, String str) {
        sb2.append(maxAdFormat.getLabel());
        sb2.append(str);
    }

    public static /* synthetic */ void x(AutoCloseable autoCloseable) throws Exception {
        boolean zIsTerminated;
        if (autoCloseable instanceof AutoCloseable) {
            autoCloseable.close();
            return;
        }
        if (!(autoCloseable instanceof ExecutorService)) {
            if (autoCloseable instanceof TypedArray) {
                ((TypedArray) autoCloseable).recycle();
                return;
            } else if (autoCloseable instanceof MediaMetadataRetriever) {
                ((MediaMetadataRetriever) autoCloseable).release();
                return;
            } else {
                if (!(autoCloseable instanceof MediaDrm)) {
                    throw new IllegalArgumentException();
                }
                ((MediaDrm) autoCloseable).release();
                return;
            }
        }
        ExecutorService executorService = (ExecutorService) autoCloseable;
        if (executorService == ForkJoinPool.commonPool() || (zIsTerminated = executorService.isTerminated())) {
            return;
        }
        executorService.shutdown();
        boolean z10 = false;
        while (!zIsTerminated) {
            try {
                zIsTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
            } catch (InterruptedException unused) {
                if (!z10) {
                    executorService.shutdownNow();
                    z10 = true;
                }
            }
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
    }

    public static void y(String str, String str2, com.applovin.impl.sdk.o oVar, String str3) {
        oVar.a(str3, str + str2);
    }

    public static void z(StringBuilder sb2, MaxAdListener maxAdListener, com.applovin.impl.sdk.o oVar, String str) {
        sb2.append(maxAdListener);
        oVar.a(str, sb2.toString());
    }
}
