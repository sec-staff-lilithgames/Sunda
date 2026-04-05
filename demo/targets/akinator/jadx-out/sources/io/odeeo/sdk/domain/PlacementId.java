package io.odeeo.sdk.domain;

import j1.o2;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class PlacementId {

    /* renamed from: a, reason: collision with root package name */
    public final String f68077a;

    public /* synthetic */ PlacementId(String str) {
        this.f68077a = str;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ PlacementId m4630boximpl(String str) {
        return new PlacementId(str);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static String m4631constructorimpl(String id2) {
        e0.checkNotNullParameter(id2, "id");
        return id2;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m4632equalsimpl(String str, Object obj) {
        return (obj instanceof PlacementId) && e0.areEqual(str, ((PlacementId) obj).m4636unboximpl());
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m4633equalsimpl0(String str, String str2) {
        return e0.areEqual(str, str2);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m4634hashCodeimpl(String str) {
        return str.hashCode();
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m4635toStringimpl(String str) {
        return o2.f(')', "PlacementId(id=", str);
    }

    public boolean equals(Object obj) {
        return m4632equalsimpl(this.f68077a, obj);
    }

    public final String getId() {
        return this.f68077a;
    }

    public int hashCode() {
        return m4634hashCodeimpl(this.f68077a);
    }

    public String toString() {
        return m4635toStringimpl(this.f68077a);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ String m4636unboximpl() {
        return this.f68077a;
    }
}
