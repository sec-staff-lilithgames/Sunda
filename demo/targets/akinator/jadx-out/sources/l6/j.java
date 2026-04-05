package l6;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class j implements u {

    /* renamed from: c, reason: collision with root package name */
    public static final HashSet f72459c = new HashSet();

    /* renamed from: a, reason: collision with root package name */
    public final String f72460a;

    /* renamed from: b, reason: collision with root package name */
    public final String f72461b;

    public j(String str, String str2) {
        this.f72460a = str;
        this.f72461b = str2;
        f72459c.add(this);
    }

    public static Set<String> getWebViewApkFeaturesForTesting() {
        return a.f72435a;
    }

    public static Set<j> values() {
        return Collections.unmodifiableSet(f72459c);
    }

    @Override // l6.u
    public String getPublicFeatureName() {
        return this.f72460a;
    }

    @Override // l6.u
    public boolean isSupported() {
        return isSupportedByFramework() || isSupportedByWebView();
    }

    public abstract boolean isSupportedByFramework();

    public boolean isSupportedByWebView() {
        return rw.a.containsFeature(a.f72435a, this.f72461b);
    }
}
