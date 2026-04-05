package com.fyber.inneractive.sdk.network;

import java.io.FilterInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class l {

    /* renamed from: a, reason: collision with root package name */
    public int f24237a;

    /* renamed from: b, reason: collision with root package name */
    public final String f24238b;

    /* renamed from: c, reason: collision with root package name */
    public InputStream f24239c;

    /* renamed from: d, reason: collision with root package name */
    public Map f24240d;

    /* renamed from: e, reason: collision with root package name */
    public String f24241e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f24242f = new ArrayList();

    public l() {
    }

    public void a() {
        InputStream inputStream = this.f24239c;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (Throwable unused) {
            }
        }
    }

    public l(FilterInputStream filterInputStream, int i10, String str, Map map, String str2) {
        this.f24239c = filterInputStream;
        this.f24237a = i10;
        this.f24238b = str;
        this.f24240d = map;
        this.f24241e = str2;
    }
}
