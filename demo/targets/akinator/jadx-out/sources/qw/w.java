package qw;

import java.util.logging.Logger;
import kotlin.jvm.internal.e0;
import sv.n0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public abstract class w {

    /* renamed from: a, reason: collision with root package name */
    public static final Logger f83634a = Logger.getLogger("okio.Okio");

    public static final boolean isAndroidGetsocknameError(AssertionError assertionError) {
        e0.checkNotNullParameter(assertionError, "<this>");
        if (assertionError.getCause() != null) {
            String message = assertionError.getMessage();
            if (message != null ? n0.contains$default((CharSequence) message, (CharSequence) "getsockname failed", false, 2, (Object) null) : false) {
                return true;
            }
        }
        return false;
    }
}
