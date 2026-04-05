package o2;

import android.graphics.Typeface;
import kotlin.jvm.internal.e0;
import p0.v5;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final v5 f77420a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f77421b;

    public p(v5 resolveResult) {
        e0.checkNotNullParameter(resolveResult, "resolveResult");
        this.f77420a = resolveResult;
        this.f77421b = resolveResult.getValue();
    }

    public final Object getInitial() {
        return this.f77421b;
    }

    public final v5 getResolveResult() {
        return this.f77420a;
    }

    public final Typeface getTypeface() {
        return (Typeface) this.f77421b;
    }

    public final boolean isStaleResolvedFont() {
        return this.f77420a.getValue() != this.f77421b;
    }
}
