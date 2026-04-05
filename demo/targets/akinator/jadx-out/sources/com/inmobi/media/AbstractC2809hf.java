package com.inmobi.media;

import android.util.Log;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.inmobi.ads.InMobiBanner;
import com.inmobi.ads.InMobiInterstitial;
import com.inmobi.ads.InMobiNative;
import com.inmobi.ads.controllers.PublisherCallbacks;
import com.inmobi.sdk.InMobiSdk;
import com.inmobi.sdk.SdkInitializationListener;
import java.lang.reflect.Method;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.inmobi.media.hf, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC2809hf {

    /* renamed from: a, reason: collision with root package name */
    public static final ScheduledExecutorService f32906a = Executors.newSingleThreadScheduledExecutor();

    public static final String a(Thread thread, Throwable error) throws JSONException {
        kotlin.jvm.internal.e0.checkNotNullParameter(error, "error");
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("name", error.getClass().getSimpleName());
            jSONObject.put(PglCryptUtils.KEY_MESSAGE, error.getMessage());
            jSONObject.put("stack", Log.getStackTraceString(error));
            if (thread != null) {
                jSONObject.put("thread", thread.getName());
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            StackTraceElement[] stackTrace = error.getStackTrace();
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(stackTrace, "getStackTrace(...)");
            boolean zB = b(stackTrace);
            Y5.a(jSONObject, zB, jCurrentTimeMillis);
            AbstractC2922oa.a(jSONObject, error instanceof OutOfMemoryError, zB, jCurrentTimeMillis);
            String string = jSONObject.toString();
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(string, "toString(...)");
            return string;
        } catch (JSONException e10) {
            e10.toString();
            return "";
        }
    }

    public static final boolean b(StackTraceElement[] stackTraceElementArr) {
        kotlin.jvm.internal.e0.checkNotNullParameter(stackTraceElementArr, "<this>");
        sv.x xVar = new sv.x("com\\.inmobi\\.(media|ads|commons|unification|sdk|unifiedId|adquality|compliance)");
        int length = stackTraceElementArr.length;
        for (int i10 = 0; i10 < length && !a(stackTraceElementArr[i10], InMobiInterstitial.a.class.getSuperclass()) && !a(stackTraceElementArr[i10], InMobiInterstitial.a.class) && !a(stackTraceElementArr[i10], InMobiNative.NativeCallbacks.class) && !a(stackTraceElementArr[i10], InMobiBanner.a.class) && !a(stackTraceElementArr[i10], InMobiBanner.a.class.getSuperclass()) && (!kotlin.jvm.internal.e0.areEqual(stackTraceElementArr[i10].getClassName(), InMobiSdk.class.getName()) || !kotlin.jvm.internal.e0.areEqual(stackTraceElementArr[i10].getMethodName(), InMobiSdk.class.getDeclaredMethod("a", SdkInitializationListener.class, String.class).getName())); i10++) {
            String className = stackTraceElementArr[i10].getClassName();
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(className, "getClassName(...)");
            String name = C2898n3.class.getName();
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(name, "getName(...)");
            if (sv.n0.contains$default((CharSequence) className, (CharSequence) name, false, 2, (Object) null)) {
                break;
            }
            String className2 = stackTraceElementArr[i10].getClassName();
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(className2, "getClassName(...)");
            if (xVar.containsMatchIn(className2)) {
                return true;
            }
        }
        return false;
    }

    public static final String a(StackTraceElement[] stackTraceElementArr) {
        kotlin.jvm.internal.e0.checkNotNullParameter(stackTraceElementArr, "<this>");
        StringBuilder sb2 = new StringBuilder();
        for (StackTraceElement stackTraceElement : stackTraceElementArr) {
            sb2.append(stackTraceElement.toString());
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(sb2, "append(value)");
            sb2.append('\n');
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(sb2, "append('\\n')");
        }
        String string = sb2.toString();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    public static final boolean a(Z5 z52) {
        kotlin.jvm.internal.e0.checkNotNullParameter(z52, "<this>");
        if (z52 instanceof C2915o3) {
            StackTraceElement[] stackTraceElementArr = ((C2915o3) z52).f33176g;
            if (stackTraceElementArr == null) {
                kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("stackTrace");
                stackTraceElementArr = null;
            }
            return b(stackTraceElementArr);
        }
        if (z52 instanceof C2761f1) {
            C2761f1 c2761f1 = (C2761f1) z52;
            if (c2761f1.f32828g != 6) {
                return false;
            }
            return new sv.x("com\\.inmobi\\.(media|ads|commons|unification|sdk|unifiedId|adquality|compliance)").containsMatchIn(c2761f1.f32829h);
        }
        if (z52 instanceof Lf) {
            return b(((Lf) z52).f32013g);
        }
        return false;
    }

    public static final boolean a(StackTraceElement stackTraceElement, Class cls) throws SecurityException {
        kotlin.jvm.internal.e0.checkNotNullParameter(stackTraceElement, "<this>");
        if (cls != null && kotlin.jvm.internal.e0.areEqual(stackTraceElement.getClassName(), cls.getName())) {
            Method[] declaredMethods = PublisherCallbacks.class.getDeclaredMethods();
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(declaredMethods, "getDeclaredMethods(...)");
            for (Method method : declaredMethods) {
                if (kotlin.jvm.internal.e0.areEqual(stackTraceElement.getMethodName(), method.getName())) {
                    return true;
                }
            }
        }
        return false;
    }
}
