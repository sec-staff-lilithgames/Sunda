package com.inmobi.media;

import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.inmobi.media.ha, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C2804ha {

    /* renamed from: a, reason: collision with root package name */
    public final Map f32896a;

    public C2804ha(Map requestParams) {
        kotlin.jvm.internal.e0.checkNotNullParameter(requestParams, "requestParams");
        this.f32896a = requestParams;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C2804ha) && kotlin.jvm.internal.e0.areEqual(this.f32896a, ((C2804ha) obj).f32896a);
    }

    public final int hashCode() {
        return this.f32896a.hashCode();
    }

    public final String toString() {
        return j1.o2.q(new StringBuilder("NovatiqAdData(requestParams="), this.f32896a, ')');
    }
}
