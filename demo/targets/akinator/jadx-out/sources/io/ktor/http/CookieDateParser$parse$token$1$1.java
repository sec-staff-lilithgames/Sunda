package io.ktor.http;

import kotlin.jvm.internal.f0;
import kv.l;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class CookieDateParser$parse$token$1$1 extends f0 implements l {
    public static final CookieDateParser$parse$token$1$1 INSTANCE = new CookieDateParser$parse$token$1$1();

    public CookieDateParser$parse$token$1$1() {
        super(1);
    }

    public final Boolean invoke(char c10) {
        return Boolean.valueOf(CookieUtilsKt.isNonDelimiter(c10));
    }

    @Override // kv.l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke(((Character) obj).charValue());
    }
}
