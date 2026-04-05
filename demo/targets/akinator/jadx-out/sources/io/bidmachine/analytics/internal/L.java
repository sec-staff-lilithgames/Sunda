package io.bidmachine.analytics.internal;

import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class L {

    /* renamed from: a, reason: collision with root package name */
    private final int f59915a;

    /* renamed from: b, reason: collision with root package name */
    private final StringBuffer f59916b;

    /* renamed from: c, reason: collision with root package name */
    private Long f59917c;

    public L(int i10, int i11) {
        this.f59915a = i11;
        this.f59916b = new StringBuffer(i10);
    }

    public final Long a() {
        return this.f59917c;
    }

    public String toString() {
        return this.f59916b.toString();
    }

    public final void a(String str) throws IOException {
        if (str.length() + this.f59916b.length() < this.f59915a) {
            this.f59916b.append((CharSequence) str).append('\n');
            this.f59917c = Long.valueOf(System.currentTimeMillis());
        }
    }
}
