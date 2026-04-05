package com.ironsource;

import android.util.Pair;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class I5 {

    /* renamed from: a, reason: collision with root package name */
    private String f34653a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f34654b;

    /* renamed from: c, reason: collision with root package name */
    private String f34655c;

    /* renamed from: d, reason: collision with root package name */
    private J7 f34656d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f34657e;

    /* renamed from: f, reason: collision with root package name */
    private ArrayList<Pair<String, String>> f34658f;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private String f34659a;

        /* renamed from: d, reason: collision with root package name */
        private J7 f34662d;

        /* renamed from: b, reason: collision with root package name */
        private boolean f34660b = false;

        /* renamed from: c, reason: collision with root package name */
        private String f34661c = C3271ic.f36944b;

        /* renamed from: e, reason: collision with root package name */
        private boolean f34663e = false;

        /* renamed from: f, reason: collision with root package name */
        private ArrayList<Pair<String, String>> f34664f = new ArrayList<>();

        public a(String str) {
            this.f34659a = "";
            if (str == null || str.isEmpty()) {
                return;
            }
            this.f34659a = str;
        }

        public a a(J7 j72) {
            this.f34662d = j72;
            return this;
        }

        public a b(boolean z10) {
            this.f34660b = z10;
            return this;
        }

        public a c() {
            this.f34661c = C3271ic.f36944b;
            return this;
        }

        public a a(Pair<String, String> pair) {
            this.f34664f.add(pair);
            return this;
        }

        public a b() {
            this.f34661c = C3271ic.f36943a;
            return this;
        }

        public a a(List<Pair<String, String>> list) {
            this.f34664f.addAll(list);
            return this;
        }

        public a a(boolean z10) {
            this.f34663e = z10;
            return this;
        }

        public I5 a() {
            return new I5(this);
        }
    }

    public I5(a aVar) {
        this.f34657e = false;
        this.f34653a = aVar.f34659a;
        this.f34654b = aVar.f34660b;
        this.f34655c = aVar.f34661c;
        this.f34656d = aVar.f34662d;
        this.f34657e = aVar.f34663e;
        if (aVar.f34664f != null) {
            this.f34658f = new ArrayList<>(aVar.f34664f);
        }
    }

    public boolean a() {
        return this.f34654b;
    }

    public String b() {
        return this.f34653a;
    }

    public J7 c() {
        return this.f34656d;
    }

    public ArrayList<Pair<String, String>> d() {
        return new ArrayList<>(this.f34658f);
    }

    public String e() {
        return this.f34655c;
    }

    public boolean f() {
        return this.f34657e;
    }
}
