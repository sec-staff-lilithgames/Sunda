package ek;

import java.util.Locale;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class f1 {

    /* renamed from: a, reason: collision with root package name */
    public final z1 f54517a;

    /* renamed from: b, reason: collision with root package name */
    public final b2 f54518b;

    public f1(z1 timeProvider, b2 uuidGenerator) {
        kotlin.jvm.internal.e0.checkNotNullParameter(timeProvider, "timeProvider");
        kotlin.jvm.internal.e0.checkNotNullParameter(uuidGenerator, "uuidGenerator");
        this.f54517a = timeProvider;
        this.f54518b = uuidGenerator;
    }

    public final x0 generateNewSession(x0 x0Var) {
        String firstSessionId;
        String string = ((c2) this.f54518b).next().toString();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(string, "toString(...)");
        String lowerCase = sv.k0.replace$default(string, "-", "", false, 4, (Object) null).toLowerCase(Locale.ROOT);
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        return new x0(lowerCase, (x0Var == null || (firstSessionId = x0Var.getFirstSessionId()) == null) ? lowerCase : firstSessionId, x0Var != null ? x0Var.getSessionIndex() + 1 : 0, ((a2) this.f54517a).currentTime().getUs());
    }
}
