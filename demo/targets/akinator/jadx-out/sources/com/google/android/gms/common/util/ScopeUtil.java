package com.google.android.gms.common.util;

import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Set;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class ScopeUtil {
    private ScopeUtil() {
    }

    public static String[] toScopeString(Set<Scope> set) {
        Preconditions.checkNotNull(set, "scopes can't be null.");
        Scope[] scopeArr = (Scope[]) set.toArray(new Scope[set.size()]);
        Preconditions.checkNotNull(scopeArr, "scopes can't be null.");
        String[] strArr = new String[scopeArr.length];
        for (int i10 = 0; i10 < scopeArr.length; i10++) {
            strArr[i10] = scopeArr[i10].getScopeUri();
        }
        return strArr;
    }
}
