package io.ktor.utils.io.core.internal;

import b0.e2;
import com.applovin.shadow.okhttp3.internal.http2.Settings;
import tu.t0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class EncodeResult {
    private final int value;

    private /* synthetic */ EncodeResult(int i10) {
        this.value = i10;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ EncodeResult m4564boximpl(int i10) {
        return new EncodeResult(i10);
    }

    /* renamed from: component1-Mh2AYeg, reason: not valid java name */
    public static final short m4565component1Mh2AYeg(int i10) {
        return m4572getCharactersMh2AYeg(i10);
    }

    /* renamed from: component2-Mh2AYeg, reason: not valid java name */
    public static final short m4566component2Mh2AYeg(int i10) {
        return m4571getBytesMh2AYeg(i10);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m4567constructorimpl(int i10) {
        return i10;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m4569equalsimpl(int i10, Object obj) {
        return (obj instanceof EncodeResult) && i10 == ((EncodeResult) obj).m4575unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m4570equalsimpl0(int i10, int i11) {
        return i10 == i11;
    }

    /* renamed from: getBytes-Mh2AYeg, reason: not valid java name */
    public static final short m4571getBytesMh2AYeg(int i10) {
        return t0.m7106constructorimpl((short) (i10 & Settings.DEFAULT_INITIAL_WINDOW_SIZE));
    }

    /* renamed from: getCharacters-Mh2AYeg, reason: not valid java name */
    public static final short m4572getCharactersMh2AYeg(int i10) {
        return t0.m7106constructorimpl((short) (i10 >>> 16));
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m4573hashCodeimpl(int i10) {
        return Integer.hashCode(i10);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m4574toStringimpl(int i10) {
        return e2.h(')', "EncodeResult(value=", i10);
    }

    public boolean equals(Object obj) {
        return m4569equalsimpl(this.value, obj);
    }

    public final int getValue() {
        return this.value;
    }

    public int hashCode() {
        return m4573hashCodeimpl(this.value);
    }

    public String toString() {
        return m4574toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m4575unboximpl() {
        return this.value;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m4568constructorimpl(short s10, short s11) {
        return m4567constructorimpl(((s10 & 65535) << 16) | (s11 & 65535));
    }
}
