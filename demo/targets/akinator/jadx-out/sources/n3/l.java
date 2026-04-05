package n3;

import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final ColorStateList f75588a;

    /* renamed from: b, reason: collision with root package name */
    public final Configuration f75589b;

    /* renamed from: c, reason: collision with root package name */
    public final int f75590c;

    public l(ColorStateList colorStateList, Configuration configuration, Resources.Theme theme) {
        this.f75588a = colorStateList;
        this.f75589b = configuration;
        this.f75590c = theme == null ? 0 : theme.hashCode();
    }
}
