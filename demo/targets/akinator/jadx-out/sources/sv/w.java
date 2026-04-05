package sv;

import java.util.List;
import java.util.regex.Matcher;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class w implements t {

    /* renamed from: a, reason: collision with root package name */
    public final Matcher f86201a;

    /* renamed from: b, reason: collision with root package name */
    public final CharSequence f86202b;

    /* renamed from: c, reason: collision with root package name */
    public final v f86203c;

    /* renamed from: d, reason: collision with root package name */
    public u f86204d;

    public w(Matcher matcher, CharSequence input) {
        kotlin.jvm.internal.e0.checkNotNullParameter(matcher, "matcher");
        kotlin.jvm.internal.e0.checkNotNullParameter(input, "input");
        this.f86201a = matcher;
        this.f86202b = input;
        this.f86203c = new v(this);
    }

    @Override // sv.t
    public s getDestructured() {
        return r.getDestructured(this);
    }

    @Override // sv.t
    public List<String> getGroupValues() {
        if (this.f86204d == null) {
            this.f86204d = new u(this);
        }
        u uVar = this.f86204d;
        kotlin.jvm.internal.e0.checkNotNull(uVar);
        return uVar;
    }

    @Override // sv.t
    public p getGroups() {
        return this.f86203c;
    }

    @Override // sv.t
    public qv.m getRange() {
        Matcher matcher = this.f86201a;
        return qv.v.until(matcher.start(), matcher.end());
    }

    @Override // sv.t
    public String getValue() {
        String strGroup = this.f86201a.group();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(strGroup, "group(...)");
        return strGroup;
    }

    @Override // sv.t
    public t next() {
        Matcher matcher = this.f86201a;
        int iEnd = matcher.end() + (matcher.end() == matcher.start() ? 1 : 0);
        CharSequence charSequence = this.f86202b;
        if (iEnd > charSequence.length()) {
            return null;
        }
        Matcher matcher2 = matcher.pattern().matcher(charSequence);
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(matcher2, "matcher(...)");
        return a0.access$findNext(matcher2, iEnd, charSequence);
    }
}
