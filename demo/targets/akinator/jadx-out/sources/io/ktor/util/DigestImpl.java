package io.ktor.util;

import java.security.MessageDigest;
import kotlin.jvm.internal.e0;
import zu.d;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
final class DigestImpl implements Digest {
    private final MessageDigest delegate;

    private /* synthetic */ DigestImpl(MessageDigest messageDigest) {
        this.delegate = messageDigest;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ DigestImpl m4288boximpl(MessageDigest messageDigest) {
        return new DigestImpl(messageDigest);
    }

    /* renamed from: build-impl, reason: not valid java name */
    public static Object m4289buildimpl(MessageDigest messageDigest, d<? super byte[]> dVar) {
        byte[] bArrDigest = messageDigest.digest();
        e0.checkNotNullExpressionValue(bArrDigest, "delegate.digest()");
        return bArrDigest;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static MessageDigest m4290constructorimpl(MessageDigest delegate) {
        e0.checkNotNullParameter(delegate, "delegate");
        return delegate;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m4291equalsimpl(MessageDigest messageDigest, Object obj) {
        return (obj instanceof DigestImpl) && e0.areEqual(messageDigest, ((DigestImpl) obj).m4297unboximpl());
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m4292equalsimpl0(MessageDigest messageDigest, MessageDigest messageDigest2) {
        return e0.areEqual(messageDigest, messageDigest2);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m4293hashCodeimpl(MessageDigest messageDigest) {
        return messageDigest.hashCode();
    }

    /* renamed from: plusAssign-impl, reason: not valid java name */
    public static void m4294plusAssignimpl(MessageDigest messageDigest, byte[] bytes) {
        e0.checkNotNullParameter(bytes, "bytes");
        messageDigest.update(bytes);
    }

    /* renamed from: reset-impl, reason: not valid java name */
    public static void m4295resetimpl(MessageDigest messageDigest) {
        messageDigest.reset();
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m4296toStringimpl(MessageDigest messageDigest) {
        return "DigestImpl(delegate=" + messageDigest + ')';
    }

    @Override // io.ktor.util.Digest
    public Object build(d<? super byte[]> dVar) {
        return m4289buildimpl(this.delegate, dVar);
    }

    public boolean equals(Object obj) {
        return m4291equalsimpl(this.delegate, obj);
    }

    public final MessageDigest getDelegate() {
        return this.delegate;
    }

    public int hashCode() {
        return m4293hashCodeimpl(this.delegate);
    }

    @Override // io.ktor.util.Digest
    public void plusAssign(byte[] bytes) {
        e0.checkNotNullParameter(bytes, "bytes");
        m4294plusAssignimpl(this.delegate, bytes);
    }

    @Override // io.ktor.util.Digest
    public void reset() {
        m4295resetimpl(this.delegate);
    }

    public String toString() {
        return m4296toStringimpl(this.delegate);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ MessageDigest m4297unboximpl() {
        return this.delegate;
    }
}
