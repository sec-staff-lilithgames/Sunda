package br;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class i0 {

    /* renamed from: a, reason: collision with root package name */
    public final n0 f9875a;

    /* renamed from: b, reason: collision with root package name */
    public final List f9876b;

    /* renamed from: c, reason: collision with root package name */
    public final String f9877c;

    public i0(n0 eventType, String source, List<j0> eventTaskParamsList) {
        kotlin.jvm.internal.e0.checkNotNullParameter(eventType, "eventType");
        kotlin.jvm.internal.e0.checkNotNullParameter(source, "source");
        kotlin.jvm.internal.e0.checkNotNullParameter(eventTaskParamsList, "eventTaskParamsList");
        this.f9875a = eventType;
        this.f9876b = eventTaskParamsList;
        Locale locale = Locale.ENGLISH;
        this.f9877c = b0.e2.p(locale, "ENGLISH", source, locale, "this as java.lang.String).toLowerCase(locale)");
    }

    public final List<j0> getEventTaskParamsList() {
        return this.f9876b;
    }

    public final n0 getEventType() {
        return this.f9875a;
    }

    public final String getSource() {
        return this.f9877c;
    }

    public /* synthetic */ i0(n0 n0Var, String str, List list, int i10, kotlin.jvm.internal.u uVar) {
        this(n0Var, str, (i10 & 4) != 0 ? new ArrayList() : list);
    }
}
