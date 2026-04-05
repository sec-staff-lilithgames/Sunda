package io.ktor.http.parsing.regex;

import j1.o2;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
final class GrammarRegex {
    private final int groupsCount;
    private final String regex;

    public GrammarRegex(String regexRaw, int i10, boolean z10) {
        e0.checkNotNullParameter(regexRaw, "regexRaw");
        this.regex = z10 ? o2.f(')', "(", regexRaw) : regexRaw;
        this.groupsCount = z10 ? i10 + 1 : i10;
    }

    public final int getGroupsCount() {
        return this.groupsCount;
    }

    public final String getRegex() {
        return this.regex;
    }

    public /* synthetic */ GrammarRegex(String str, int i10, boolean z10, int i11, u uVar) {
        this(str, (i11 & 2) != 0 ? 0 : i10, (i11 & 4) != 0 ? false : z10);
    }
}
