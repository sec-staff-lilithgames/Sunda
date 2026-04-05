package com.ironsource;

import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public interface F4 {
    static /* synthetic */ String a(F4 f42, String str, String str2, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getString");
        }
        if ((i10 & 2) != 0) {
            str2 = null;
        }
        return f42.a(str, str2);
    }

    String a(String str, String str2);

    void a(String str);

    Map<String, ?> allData();

    void b(String str, String str2);
}
