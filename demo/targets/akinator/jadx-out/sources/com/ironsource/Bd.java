package com.ironsource;

import android.text.TextUtils;
import java.util.ArrayList;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class Bd {

    /* renamed from: a, reason: collision with root package name */
    private final ArrayList<String> f33899a = new ArrayList<>();

    /* renamed from: b, reason: collision with root package name */
    private final ArrayList<String> f33900b = new ArrayList<>();

    /* renamed from: c, reason: collision with root package name */
    private final ArrayList<String> f33901c = new ArrayList<>();

    /* renamed from: d, reason: collision with root package name */
    private final ArrayList<String> f33902d = new ArrayList<>();

    public ArrayList<String> a() {
        return this.f33901c;
    }

    public ArrayList<String> b() {
        return this.f33900b;
    }

    public ArrayList<String> c() {
        return this.f33902d;
    }

    public ArrayList<String> d() {
        return this.f33899a;
    }

    public void a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f33901c.add(str);
    }

    public void b(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f33900b.add(str);
    }

    public void c(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f33902d.add(str);
    }

    public void d(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f33899a.add(str);
    }
}
