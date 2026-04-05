package com.mbridge.msdk.dycreator.utils;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import java.io.File;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public class f {

    /* renamed from: b, reason: collision with root package name */
    private static volatile f f40271b;

    /* renamed from: a, reason: collision with root package name */
    private com.mbridge.msdk.dycreator.engine.b f40272a;

    private f(Context context) {
        this.f40272a = null;
        com.mbridge.msdk.dycreator.engine.b bVarA = com.mbridge.msdk.dycreator.engine.b.a();
        this.f40272a = bVarA;
        bVarA.a(context, "");
    }

    public static f a(Context context) {
        if (f40271b == null) {
            synchronized (f.class) {
                try {
                    if (f40271b == null) {
                        f40271b = new f(context.getApplicationContext());
                    }
                } finally {
                }
            }
        }
        return f40271b;
    }

    public View a(String str) {
        if (new File(str).exists()) {
            return this.f40272a.e(str);
        }
        return null;
    }

    public View a(ViewGroup viewGroup, String str) {
        if (viewGroup != null && !TextUtils.isEmpty(str)) {
            if (viewGroup.getId() == str.hashCode()) {
                return viewGroup;
            }
            int childCount = viewGroup.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = viewGroup.getChildAt(i10);
                if (childAt.getId() == str.hashCode()) {
                    return childAt;
                }
                if (childAt instanceof ViewGroup) {
                    a((ViewGroup) childAt, str);
                }
            }
        }
        return null;
    }
}
