package dv;

import java.lang.reflect.Method;
import java.util.List;
import java.util.regex.MatchResult;
import kotlin.jvm.internal.e0;
import ov.g;
import sv.o;
import uu.f0;
import uu.p0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public class b {
    public void addSuppressed(Throwable cause, Throwable exception) {
        e0.checkNotNullParameter(cause, "cause");
        e0.checkNotNullParameter(exception, "exception");
        Method method = a.f52902a;
        if (method != null) {
            method.invoke(cause, exception);
        }
    }

    public g defaultPlatformRandom() {
        return new ov.c();
    }

    public o getMatchResultNamedGroup(MatchResult matchResult, String name) {
        e0.checkNotNullParameter(matchResult, "matchResult");
        e0.checkNotNullParameter(name, "name");
        throw new UnsupportedOperationException("Retrieving groups by name is not supported on this platform.");
    }

    public List<Throwable> getSuppressed(Throwable exception) {
        Object objInvoke;
        List<Throwable> listAsList;
        e0.checkNotNullParameter(exception, "exception");
        Method method = a.f52903b;
        return (method == null || (objInvoke = method.invoke(exception, null)) == null || (listAsList = f0.asList((Throwable[]) objInvoke)) == null) ? p0.emptyList() : listAsList;
    }

    public tv.b getSystemClock() {
        throw new UnsupportedOperationException("getSystemClock should not be called on the base PlatformImplementations.");
    }
}
