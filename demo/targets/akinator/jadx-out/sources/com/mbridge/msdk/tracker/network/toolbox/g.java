package com.mbridge.msdk.tracker.network.toolbox;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    private final int f44041a;

    /* renamed from: b, reason: collision with root package name */
    private final List<com.mbridge.msdk.tracker.network.g> f44042b;

    /* renamed from: c, reason: collision with root package name */
    private final int f44043c;

    /* renamed from: d, reason: collision with root package name */
    private final InputStream f44044d;

    /* renamed from: e, reason: collision with root package name */
    private final byte[] f44045e;

    public g(int i10, List<com.mbridge.msdk.tracker.network.g> list) {
        this(i10, list, -1, null);
    }

    public final InputStream a() {
        InputStream inputStream = this.f44044d;
        if (inputStream != null) {
            return inputStream;
        }
        if (this.f44045e != null) {
            return new ByteArrayInputStream(this.f44045e);
        }
        return null;
    }

    public final int b() {
        return this.f44043c;
    }

    public final List<com.mbridge.msdk.tracker.network.g> c() {
        return Collections.unmodifiableList(this.f44042b);
    }

    public final int d() {
        return this.f44041a;
    }

    public g(int i10, List<com.mbridge.msdk.tracker.network.g> list, int i11, InputStream inputStream) {
        this.f44041a = i10;
        this.f44042b = list;
        this.f44043c = i11;
        this.f44044d = inputStream;
        this.f44045e = null;
    }
}
