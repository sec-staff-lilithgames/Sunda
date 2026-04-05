package com.fyber.inneractive.sdk.player.exoplayer2.mediacodec;

import android.text.TextUtils;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final String f25650a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f25651b;

    public e(boolean z10, String str) {
        this.f25650a = str;
        this.f25651b = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && obj.getClass() == e.class) {
            e eVar = (e) obj;
            if (TextUtils.equals(this.f25650a, eVar.f25650a) && this.f25651b == eVar.f25651b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f25650a;
        return (((str == null ? 0 : str.hashCode()) + 31) * 31) + (this.f25651b ? 1231 : 1237);
    }
}
