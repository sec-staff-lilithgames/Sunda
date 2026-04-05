package k3;

import android.content.res.Configuration;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class d1 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f70160a;

    /* renamed from: b, reason: collision with root package name */
    public final Configuration f70161b;

    public d1(boolean z10) {
        this.f70160a = z10;
    }

    public final Configuration getNewConfig() {
        Configuration configuration = this.f70161b;
        if (configuration != null) {
            return configuration;
        }
        throw new IllegalStateException("PictureInPictureModeChangedInfo must be constructed with the constructor that takes a Configuration to access the newConfig. Are you running on an API 26 or higher device that makes this information available?");
    }

    public final boolean isInPictureInPictureMode() {
        return this.f70160a;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public d1(boolean z10, Configuration newConfig) {
        this(z10);
        kotlin.jvm.internal.e0.checkNotNullParameter(newConfig, "newConfig");
        this.f70161b = newConfig;
    }
}
