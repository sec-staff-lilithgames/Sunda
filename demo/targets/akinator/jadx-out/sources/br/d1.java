package br;

import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class d1 {

    /* renamed from: a, reason: collision with root package name */
    public final String f9795a;

    /* renamed from: b, reason: collision with root package name */
    public final Map f9796b;

    public d1(String name, Map<String, String> map) {
        kotlin.jvm.internal.e0.checkNotNullParameter(name, "name");
        this.f9795a = name;
        this.f9796b = map;
    }

    public final String getName() {
        return this.f9795a;
    }

    public final Map<String, String> getParameters() {
        return this.f9796b;
    }

    public /* synthetic */ d1(String str, Map map, int i10, kotlin.jvm.internal.u uVar) {
        this(str, (i10 & 2) != 0 ? null : map);
    }
}
