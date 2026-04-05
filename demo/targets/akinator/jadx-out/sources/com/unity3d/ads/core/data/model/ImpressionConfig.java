package com.unity3d.ads.core.data.model;

import j1.o2;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class ImpressionConfig {
    private final String data;

    private /* synthetic */ ImpressionConfig(String str) {
        this.data = str;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ ImpressionConfig m3489boximpl(String str) {
        return new ImpressionConfig(str);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static String m3490constructorimpl(String data) {
        e0.checkNotNullParameter(data, "data");
        return data;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m3491equalsimpl(String str, Object obj) {
        return (obj instanceof ImpressionConfig) && e0.areEqual(str, ((ImpressionConfig) obj).m3495unboximpl());
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m3492equalsimpl0(String str, String str2) {
        return e0.areEqual(str, str2);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m3493hashCodeimpl(String str) {
        return str.hashCode();
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m3494toStringimpl(String str) {
        return o2.f(')', "ImpressionConfig(data=", str);
    }

    public boolean equals(Object obj) {
        return m3491equalsimpl(this.data, obj);
    }

    public final String getData() {
        return this.data;
    }

    public int hashCode() {
        return m3493hashCodeimpl(this.data);
    }

    public String toString() {
        return m3494toStringimpl(this.data);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ String m3495unboximpl() {
        return this.data;
    }
}
