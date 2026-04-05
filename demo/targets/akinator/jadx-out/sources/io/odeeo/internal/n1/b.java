package io.odeeo.internal.n1;

import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class b extends c {

    @lk.a
    @lk.c("error_code")
    private final int code;

    @lk.a
    @lk.c("error")
    private final String message;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(int i10, String message) {
        super(message, i10, null, null, 12, null);
        e0.checkNotNullParameter(message, "message");
        this.code = i10;
        this.message = message;
    }

    public static /* synthetic */ b copy$default(b bVar, int i10, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = bVar.getCode();
        }
        if ((i11 & 2) != 0) {
            str = bVar.getMessage();
        }
        return bVar.copy(i10, str);
    }

    public final int component1() {
        return getCode();
    }

    public final String component2() {
        return getMessage();
    }

    public final b copy(int i10, String message) {
        e0.checkNotNullParameter(message, "message");
        return new b(i10, message);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return getCode() == bVar.getCode() && e0.areEqual(getMessage(), bVar.getMessage());
    }

    @Override // io.odeeo.internal.n1.c
    public int getCode() {
        return this.code;
    }

    @Override // io.odeeo.internal.n1.c
    public String getMessage() {
        return this.message;
    }

    public int hashCode() {
        return getMessage().hashCode() + (Integer.hashCode(getCode()) * 31);
    }

    public String toString() {
        return "BadRequestError(code=" + getCode() + ", message=" + getMessage() + ')';
    }
}
