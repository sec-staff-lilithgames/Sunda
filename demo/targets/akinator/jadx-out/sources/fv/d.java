package fv;

import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import kotlin.jvm.internal.e0;
import ov.g;
import qv.m;
import sv.o;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public class d extends ev.b {
    @Override // dv.b
    public g defaultPlatformRandom() {
        Integer num = a.f56117a;
        return (num == null || num.intValue() >= 34) ? new pv.a() : super.defaultPlatformRandom();
    }

    @Override // dv.b
    public o getMatchResultNamedGroup(MatchResult matchResult, String name) {
        e0.checkNotNullParameter(matchResult, "matchResult");
        e0.checkNotNullParameter(name, "name");
        Matcher matcher = matchResult instanceof Matcher ? (Matcher) matchResult : null;
        if (matcher == null) {
            throw new UnsupportedOperationException("Retrieving groups by name is not supported on this platform.");
        }
        m mVar = new m(matcher.start(name), matcher.end(name) - 1);
        if (mVar.getStart().intValue() < 0) {
            return null;
        }
        String strGroup = matcher.group(name);
        e0.checkNotNullExpressionValue(strGroup, "group(...)");
        return new o(strGroup, mVar);
    }

    @Override // dv.b
    public tv.b getSystemClock() {
        Integer num = a.f56117a;
        return (num == null || num.intValue() >= 26) ? new b() : new c();
    }
}
