package com.applovin.impl;

import android.content.Context;
import android.text.SpannedString;
import android.text.TextUtils;
import com.applovin.sdk.R;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class o2 {

    /* renamed from: a, reason: collision with root package name */
    protected c f14904a;

    /* renamed from: b, reason: collision with root package name */
    protected boolean f14905b;

    /* renamed from: c, reason: collision with root package name */
    protected SpannedString f14906c;

    /* renamed from: d, reason: collision with root package name */
    protected SpannedString f14907d;

    /* renamed from: e, reason: collision with root package name */
    protected String f14908e;

    /* renamed from: f, reason: collision with root package name */
    protected String f14909f;

    /* renamed from: g, reason: collision with root package name */
    protected int f14910g;

    /* renamed from: h, reason: collision with root package name */
    protected int f14911h;

    /* renamed from: i, reason: collision with root package name */
    protected int f14912i;

    /* renamed from: j, reason: collision with root package name */
    protected int f14913j;

    /* renamed from: k, reason: collision with root package name */
    protected int f14914k;

    /* renamed from: l, reason: collision with root package name */
    protected int f14915l;

    /* renamed from: m, reason: collision with root package name */
    protected boolean f14916m;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        final c f14917a;

        /* renamed from: b, reason: collision with root package name */
        boolean f14918b;

        /* renamed from: c, reason: collision with root package name */
        SpannedString f14919c;

        /* renamed from: d, reason: collision with root package name */
        SpannedString f14920d;

        /* renamed from: e, reason: collision with root package name */
        String f14921e;

        /* renamed from: f, reason: collision with root package name */
        String f14922f;

        /* renamed from: g, reason: collision with root package name */
        int f14923g = 0;

        /* renamed from: h, reason: collision with root package name */
        int f14924h = 0;

        /* renamed from: i, reason: collision with root package name */
        int f14925i = -16777216;

        /* renamed from: j, reason: collision with root package name */
        int f14926j = -16777216;

        /* renamed from: k, reason: collision with root package name */
        int f14927k = 0;

        /* renamed from: l, reason: collision with root package name */
        int f14928l = 0;

        /* renamed from: m, reason: collision with root package name */
        boolean f14929m;

        public b(c cVar) {
            this.f14917a = cVar;
        }

        public b a(boolean z10) {
            this.f14918b = z10;
            return this;
        }

        public b b(SpannedString spannedString) {
            this.f14919c = spannedString;
            return this;
        }

        public b c(String str) {
            return a(!TextUtils.isEmpty(str) ? new SpannedString(str) : null);
        }

        public b d(String str) {
            return b(!TextUtils.isEmpty(str) ? new SpannedString(str) : null);
        }

        public b a(SpannedString spannedString) {
            this.f14920d = spannedString;
            return this;
        }

        public b b(String str) {
            this.f14921e = str;
            return this;
        }

        public b a(String str) {
            this.f14922f = str;
            return this;
        }

        public b b(int i10) {
            this.f14928l = i10;
            return this;
        }

        public b c(int i10) {
            this.f14926j = i10;
            return this;
        }

        public b d(int i10) {
            this.f14925i = i10;
            return this;
        }

        public b a(int i10) {
            this.f14924h = i10;
            return this;
        }

        public b b(boolean z10) {
            this.f14929m = z10;
            return this;
        }

        public b a(Context context) {
            this.f14924h = R.drawable.applovin_ic_disclosure_arrow;
            this.f14928l = m0.a(R.color.applovin_sdk_disclosureButtonColor, context);
            return this;
        }

        public o2 a() {
            return new o2(this);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* loaded from: classes2.dex */
    public enum c {
        SECTION(0),
        SECTION_CENTERED(1),
        f14932d(2),
        DETAIL(3),
        RIGHT_DETAIL(4),
        COUNT(5);


        /* renamed from: a, reason: collision with root package name */
        private final int f14937a;

        c(int i10) {
            this.f14937a = i10;
        }

        public int b() {
            return this == SECTION ? R.layout.mediation_debugger_list_section : this == SECTION_CENTERED ? R.layout.mediation_debugger_list_section_centered : this == f14932d ? android.R.layout.simple_list_item_1 : this == DETAIL ? R.layout.applovin_debugger_list_item_detail : R.layout.mediation_debugger_list_item_right_detail;
        }

        public int c() {
            return this.f14937a;
        }
    }

    public static b a() {
        return a(c.RIGHT_DETAIL);
    }

    public static int n() {
        return c.COUNT.c();
    }

    public String b() {
        return this.f14909f;
    }

    public String c() {
        return this.f14908e;
    }

    public int d() {
        return this.f14911h;
    }

    public int e() {
        return this.f14915l;
    }

    public SpannedString f() {
        return this.f14907d;
    }

    public int g() {
        return this.f14913j;
    }

    public int h() {
        return this.f14910g;
    }

    public int i() {
        return this.f14914k;
    }

    public int j() {
        return this.f14904a.b();
    }

    public SpannedString k() {
        return this.f14906c;
    }

    public int l() {
        return this.f14912i;
    }

    public int m() {
        return this.f14904a.c();
    }

    public boolean o() {
        return this.f14905b;
    }

    public boolean p() {
        return this.f14916m;
    }

    public o2(c cVar) {
        this.f14910g = 0;
        this.f14911h = 0;
        this.f14912i = -16777216;
        this.f14913j = -16777216;
        this.f14914k = 0;
        this.f14915l = 0;
        this.f14904a = cVar;
    }

    public static b a(c cVar) {
        return new b(cVar);
    }

    private o2(b bVar) {
        this.f14910g = 0;
        this.f14911h = 0;
        this.f14912i = -16777216;
        this.f14913j = -16777216;
        this.f14914k = 0;
        this.f14915l = 0;
        this.f14904a = bVar.f14917a;
        this.f14905b = bVar.f14918b;
        this.f14906c = bVar.f14919c;
        this.f14907d = bVar.f14920d;
        this.f14908e = bVar.f14921e;
        this.f14909f = bVar.f14922f;
        this.f14910g = bVar.f14923g;
        this.f14911h = bVar.f14924h;
        this.f14912i = bVar.f14925i;
        this.f14913j = bVar.f14926j;
        this.f14914k = bVar.f14927k;
        this.f14915l = bVar.f14928l;
        this.f14916m = bVar.f14929m;
    }
}
