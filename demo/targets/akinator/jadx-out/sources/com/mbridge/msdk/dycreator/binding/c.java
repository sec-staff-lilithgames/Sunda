package com.mbridge.msdk.dycreator.binding;

import android.text.TextUtils;
import com.mbridge.msdk.dycreator.binding.base.BaseStrategy;
import com.mbridge.msdk.dycreator.binding.strategy.d;
import com.mbridge.msdk.dycreator.binding.strategy.e;
import com.mbridge.msdk.dycreator.binding.strategy.f;
import com.mbridge.msdk.dycreator.binding.strategy.g;
import com.vungle.ads.internal.presenter.NativeAdPresenter;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private static volatile c f40135a;

    private c() {
    }

    public static c a() {
        if (f40135a == null) {
            synchronized (c.class) {
                try {
                    if (f40135a == null) {
                        f40135a = new c();
                    }
                } finally {
                }
            }
        }
        return f40135a;
    }

    public <T extends BaseStrategy> T a(String str) {
        T aVar = null;
        if (!TextUtils.isEmpty(str)) {
            if (str.equals("close")) {
                aVar = new com.mbridge.msdk.dycreator.binding.strategy.c();
            } else if (str.equals(NativeAdPresenter.DOWNLOAD)) {
                aVar = new com.mbridge.msdk.dycreator.binding.strategy.b();
            } else if (!str.equals("deeplink") && str.equals("activity")) {
                aVar = new com.mbridge.msdk.dycreator.binding.strategy.a();
            }
            if (str.equals("feedback")) {
                aVar = new d();
            }
            if (str.equals("notice")) {
                aVar = new e();
            }
            if (str.equals("permissionInfo")) {
                aVar = new f();
            }
            if (str.equals("privateAddress")) {
                return new g();
            }
        }
        return aVar;
    }
}
