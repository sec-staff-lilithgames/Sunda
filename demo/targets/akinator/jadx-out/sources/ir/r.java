package ir;

import java.util.Locale;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.f0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class r extends f0 implements kv.l {

    /* renamed from: e, reason: collision with root package name */
    public static final r f68361e = new r(1);

    @Override // kv.l
    public final CharSequence invoke(sv.t it) {
        e0.checkNotNullParameter(it, "it");
        String upperCase = it.getGroupValues().get(1).toUpperCase(Locale.ROOT);
        e0.checkNotNullExpressionValue(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
        return upperCase;
    }
}
