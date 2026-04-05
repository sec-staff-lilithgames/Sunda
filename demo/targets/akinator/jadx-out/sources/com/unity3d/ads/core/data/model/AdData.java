package com.unity3d.ads.core.data.model;

import j1.o2;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class AdData {
    private final String data;

    private /* synthetic */ AdData(String str) {
        this.data = str;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ AdData m3475boximpl(String str) {
        return new AdData(str);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static String m3476constructorimpl(String data) {
        e0.checkNotNullParameter(data, "data");
        return data;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m3477equalsimpl(String str, Object obj) {
        return (obj instanceof AdData) && e0.areEqual(str, ((AdData) obj).m3481unboximpl());
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m3478equalsimpl0(String str, String str2) {
        return e0.areEqual(str, str2);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m3479hashCodeimpl(String str) {
        return str.hashCode();
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m3480toStringimpl(String str) {
        return o2.f(')', "AdData(data=", str);
    }

    public boolean equals(Object obj) {
        return m3477equalsimpl(this.data, obj);
    }

    public final String getData() {
        return this.data;
    }

    public int hashCode() {
        return m3479hashCodeimpl(this.data);
    }

    public String toString() {
        return m3480toStringimpl(this.data);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ String m3481unboximpl() {
        return this.data;
    }
}
