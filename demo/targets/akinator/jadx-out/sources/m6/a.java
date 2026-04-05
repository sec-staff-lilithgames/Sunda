package m6;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import kotlin.jvm.internal.e0;
import sv.n0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final ComponentName f74049a;

    /* renamed from: b, reason: collision with root package name */
    public final String f74050b;

    public a(ComponentName componentName, String str) {
        e0.checkNotNullParameter(componentName, "componentName");
        this.f74049a = componentName;
        this.f74050b = str;
        String packageName = componentName.getPackageName();
        e0.checkNotNullExpressionValue(packageName, "componentName.packageName");
        String className = componentName.getClassName();
        e0.checkNotNullExpressionValue(className, "componentName.className");
        if (packageName.length() <= 0) {
            throw new IllegalArgumentException("Package name must not be empty");
        }
        if (className.length() <= 0) {
            throw new IllegalArgumentException("Activity class name must not be empty.");
        }
        if (n0.contains$default((CharSequence) packageName, (CharSequence) "*", false, 2, (Object) null) && n0.indexOf$default((CharSequence) packageName, "*", 0, false, 6, (Object) null) != packageName.length() - 1) {
            throw new IllegalArgumentException("Wildcard in package name is only allowed at the end.");
        }
        if (n0.contains$default((CharSequence) className, (CharSequence) "*", false, 2, (Object) null) && n0.indexOf$default((CharSequence) className, "*", 0, false, 6, (Object) null) != className.length() - 1) {
            throw new IllegalArgumentException("Wildcard in class name is only allowed at the end.");
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return e0.areEqual(this.f74049a, aVar.f74049a) && e0.areEqual(this.f74050b, aVar.f74050b);
    }

    public final ComponentName getComponentName() {
        return this.f74049a;
    }

    public final String getIntentAction() {
        return this.f74050b;
    }

    public int hashCode() {
        int iHashCode = this.f74049a.hashCode() * 31;
        String str = this.f74050b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final boolean matchesActivity(Activity activity) {
        e0.checkNotNullParameter(activity, "activity");
        if (!b.f74051a.areActivityOrIntentComponentsMatching$window_release(activity, this.f74049a)) {
            return false;
        }
        String str = this.f74050b;
        if (str == null) {
            return true;
        }
        Intent intent = activity.getIntent();
        return e0.areEqual(str, intent == null ? null : intent.getAction());
    }

    public final boolean matchesIntent(Intent intent) {
        e0.checkNotNullParameter(intent, "intent");
        if (!b.f74051a.areComponentsMatching$window_release(intent.getComponent(), this.f74049a)) {
            return false;
        }
        String str = this.f74050b;
        return str == null || e0.areEqual(str, intent.getAction());
    }

    public String toString() {
        return "ActivityFilter(componentName=" + this.f74049a + ", intentAction=" + ((Object) this.f74050b) + ')';
    }
}
