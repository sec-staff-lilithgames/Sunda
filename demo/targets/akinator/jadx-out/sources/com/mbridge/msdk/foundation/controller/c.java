package com.mbridge.msdk.foundation.controller;

import com.mbridge.msdk.foundation.controller.a;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class c extends a {

    /* renamed from: s, reason: collision with root package name */
    private static volatile c f40410s;

    private c() {
    }

    public static c m() {
        if (f40410s == null) {
            synchronized (c.class) {
                try {
                    if (f40410s == null) {
                        f40410s = new c();
                    }
                } finally {
                }
            }
        }
        return f40410s;
    }

    @Override // com.mbridge.msdk.foundation.controller.a
    public void a(a.e eVar) {
    }
}
