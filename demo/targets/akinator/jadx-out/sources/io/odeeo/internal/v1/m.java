package io.odeeo.internal.v1;

import java.util.Arrays;
import java.util.IllegalFormatException;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public static final m f67284a = new m();

    public final boolean a(Object obj, boolean z10, String str, Object... objArr) {
        if (obj != null) {
            return true;
        }
        String strA = a(str, Arrays.copyOf(objArr, objArr.length));
        if (z10) {
            throw new NullPointerException(strA);
        }
        io.odeeo.internal.b2.a.w(strA, new Object[0]);
        return false;
    }

    public final void checkNotNull(Object obj) {
        a(obj, true, "Object can not be null.", "");
    }

    public final void checkNotNull(Object obj, String errorMessage) {
        e0.checkNotNullParameter(errorMessage, "errorMessage");
        a(obj, true, errorMessage, "");
    }

    public final void checkNotNull(Object obj, String errorMessageTemplate, Object... errorMessageArgs) {
        e0.checkNotNullParameter(errorMessageTemplate, "errorMessageTemplate");
        e0.checkNotNullParameter(errorMessageArgs, "errorMessageArgs");
        a(obj, true, errorMessageTemplate, errorMessageArgs);
    }

    public final String a(String str, Object... objArr) {
        try {
            Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
            String str2 = String.format(str, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
            e0.checkNotNullExpressionValue(str2, "format(format, *args)");
            return str2;
        } catch (IllegalFormatException e10) {
            io.odeeo.internal.b2.a.w(e10);
            return str;
        }
    }
}
