package io.ktor.utils.io.core;

import a.b;
import b0.e2;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class InsufficientSpaceException extends Exception {
    /* JADX WARN: Multi-variable type inference failed */
    public InsufficientSpaceException() {
        this((String) null, 1, (u) (0 == true ? 1 : 0));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InsufficientSpaceException(String message) {
        super(message);
        e0.checkNotNullParameter(message, "message");
    }

    public /* synthetic */ InsufficientSpaceException(String str, int i10, u uVar) {
        this((i10 & 1) != 0 ? "Not enough free space" : str);
    }

    public InsufficientSpaceException(int i10, int i11) {
        this(o2.i(i10, i11, "Not enough free space to write ", " bytes, available ", " bytes."));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public InsufficientSpaceException(String name, int i10, int i11) {
        this("Not enough free space to write " + name + " of " + i10 + " bytes, available " + i11 + " bytes.");
        e0.checkNotNullParameter(name, "name");
    }

    public InsufficientSpaceException(long j10, long j11) {
        this(b.g(j11, " bytes.", e2.r(j10, "Not enough free space to write ", " bytes, available ")));
    }
}
