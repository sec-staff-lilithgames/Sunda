package com.ironsource;

import android.text.TextUtils;
import java.util.HashSet;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class E1 {

    /* renamed from: c, reason: collision with root package name */
    private String f34241c;

    /* renamed from: d, reason: collision with root package name */
    private String f34242d;

    /* renamed from: f, reason: collision with root package name */
    private int f34244f;

    /* renamed from: b, reason: collision with root package name */
    private HashSet<String> f34240b = new HashSet<>();

    /* renamed from: a, reason: collision with root package name */
    private boolean f34239a = false;

    /* renamed from: e, reason: collision with root package name */
    private boolean f34243e = false;

    /* renamed from: g, reason: collision with root package name */
    private boolean f34245g = true;

    public void a(boolean z10) {
        this.f34239a = z10;
    }

    public HashSet<String> b() {
        return this.f34240b;
    }

    public void c(String str) {
        this.f34241c = str;
    }

    public String d() {
        return this.f34241c;
    }

    public boolean e() {
        return this.f34243e;
    }

    public boolean f() {
        return this.f34239a;
    }

    public boolean g() {
        return this.f34245g;
    }

    public void a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f34240b.add(str);
    }

    public void b(String str) {
        this.f34242d = str;
    }

    public String c() {
        return this.f34242d;
    }

    public void b(boolean z10) {
        this.f34245g = z10;
    }

    public void c(boolean z10) {
        this.f34243e = z10;
    }

    public int a() {
        return this.f34244f;
    }

    public void a(int i10) {
        this.f34244f = i10;
    }
}
