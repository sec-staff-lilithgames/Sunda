package m6;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import kotlin.jvm.internal.e0;
import sv.k0;
import sv.n0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final b f74051a = new b();

    public static boolean a(String str, String str2) {
        if (!n0.contains$default((CharSequence) str2, (CharSequence) "*", false, 2, (Object) null)) {
            return false;
        }
        if (e0.areEqual(str2, "*")) {
            return true;
        }
        if (n0.indexOf$default((CharSequence) str2, "*", 0, false, 6, (Object) null) != n0.lastIndexOf$default((CharSequence) str2, "*", 0, false, 6, (Object) null) || !k0.endsWith$default(str2, "*", false, 2, null)) {
            throw new IllegalArgumentException("Name pattern with a wildcard must only contain a single wildcard in the end");
        }
        String strSubstring = str2.substring(0, str2.length() - 1);
        e0.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return k0.startsWith$default(str, strSubstring, false, 2, null);
    }

    public final boolean areActivityOrIntentComponentsMatching$window_release(Activity activity, ComponentName ruleComponent) {
        ComponentName component;
        e0.checkNotNullParameter(activity, "activity");
        e0.checkNotNullParameter(ruleComponent, "ruleComponent");
        if (areComponentsMatching$window_release(activity.getComponentName(), ruleComponent)) {
            return true;
        }
        Intent intent = activity.getIntent();
        if (intent == null || (component = intent.getComponent()) == null) {
            return false;
        }
        return f74051a.areComponentsMatching$window_release(component, ruleComponent);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0088 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008b A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean areComponentsMatching$window_release(android.content.ComponentName r7, android.content.ComponentName r8) {
        /*
            r6 = this;
            java.lang.String r0 = "ruleComponent"
            kotlin.jvm.internal.e0.checkNotNullParameter(r8, r0)
            java.lang.String r0 = "*"
            r1 = 1
            r2 = 0
            if (r7 != 0) goto L21
            java.lang.String r7 = r8.getPackageName()
            boolean r7 = kotlin.jvm.internal.e0.areEqual(r7, r0)
            if (r7 == 0) goto L8b
            java.lang.String r7 = r8.getClassName()
            boolean r7 = kotlin.jvm.internal.e0.areEqual(r7, r0)
            if (r7 == 0) goto L8b
            goto L8a
        L21:
            java.lang.String r3 = r7.toString()
            java.lang.String r4 = "activityComponent.toString()"
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(r3, r4)
            r4 = 2
            r5 = 0
            boolean r0 = sv.n0.contains$default(r3, r0, r2, r4, r5)
            if (r0 != 0) goto L8c
            java.lang.String r0 = r7.getPackageName()
            java.lang.String r3 = r8.getPackageName()
            boolean r0 = kotlin.jvm.internal.e0.areEqual(r0, r3)
            if (r0 != 0) goto L5b
            java.lang.String r0 = r7.getPackageName()
            java.lang.String r3 = "activityComponent.packageName"
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(r0, r3)
            java.lang.String r3 = r8.getPackageName()
            java.lang.String r4 = "ruleComponent.packageName"
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(r3, r4)
            boolean r0 = a(r0, r3)
            if (r0 == 0) goto L59
            goto L5b
        L59:
            r0 = r2
            goto L5c
        L5b:
            r0 = r1
        L5c:
            java.lang.String r3 = r7.getClassName()
            java.lang.String r4 = r8.getClassName()
            boolean r3 = kotlin.jvm.internal.e0.areEqual(r3, r4)
            if (r3 != 0) goto L85
            java.lang.String r7 = r7.getClassName()
            java.lang.String r3 = "activityComponent.className"
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(r7, r3)
            java.lang.String r8 = r8.getClassName()
            java.lang.String r3 = "ruleComponent.className"
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(r8, r3)
            boolean r7 = a(r7, r8)
            if (r7 == 0) goto L83
            goto L85
        L83:
            r7 = r2
            goto L86
        L85:
            r7 = r1
        L86:
            if (r0 == 0) goto L8b
            if (r7 == 0) goto L8b
        L8a:
            return r1
        L8b:
            return r2
        L8c:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r8 = "Wildcard can only be part of the rule."
            r7.<init>(r8)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: m6.b.areComponentsMatching$window_release(android.content.ComponentName, android.content.ComponentName):boolean");
    }
}
