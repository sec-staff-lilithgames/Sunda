package io.ktor.utils.io.internal.jvm;

import a.b;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class ErrorsKt {
    public static final Void limitChangeError() {
        throw new IllegalStateException("Limit change is now allowed");
    }

    public static final Void negativeShiftError(int i10) {
        throw new IllegalStateException(b.e(i10, "Wrong buffer position change: negative shift "));
    }

    public static final Void wrongBufferPositionChangeError(int i10, int i11) {
        throw new IllegalStateException("Wrong buffer position change: " + i10 + ". Position should be moved forward only by at most size bytes (size = " + i11 + ')');
    }
}
