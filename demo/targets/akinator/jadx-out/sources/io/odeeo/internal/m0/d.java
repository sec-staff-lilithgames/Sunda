package io.odeeo.internal.m0;

import android.text.TextUtils;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class d {

    /* renamed from: f, reason: collision with root package name */
    public int f64644f;

    /* renamed from: h, reason: collision with root package name */
    public int f64646h;

    /* renamed from: o, reason: collision with root package name */
    public float f64653o;

    /* renamed from: a, reason: collision with root package name */
    public String f64639a = "";

    /* renamed from: b, reason: collision with root package name */
    public String f64640b = "";

    /* renamed from: c, reason: collision with root package name */
    public Set<String> f64641c = Collections.EMPTY_SET;

    /* renamed from: d, reason: collision with root package name */
    public String f64642d = "";

    /* renamed from: e, reason: collision with root package name */
    public String f64643e = null;

    /* renamed from: g, reason: collision with root package name */
    public boolean f64645g = false;

    /* renamed from: i, reason: collision with root package name */
    public boolean f64647i = false;

    /* renamed from: j, reason: collision with root package name */
    public int f64648j = -1;

    /* renamed from: k, reason: collision with root package name */
    public int f64649k = -1;

    /* renamed from: l, reason: collision with root package name */
    public int f64650l = -1;

    /* renamed from: m, reason: collision with root package name */
    public int f64651m = -1;

    /* renamed from: n, reason: collision with root package name */
    public int f64652n = -1;

    /* renamed from: p, reason: collision with root package name */
    public int f64654p = -1;

    /* renamed from: q, reason: collision with root package name */
    public boolean f64655q = false;

    public static int a(int i10, String str, String str2, int i11) {
        if (str.isEmpty() || i10 == -1) {
            return i10;
        }
        if (str.equals(str2)) {
            return i10 + i11;
        }
        return -1;
    }

    public int getBackgroundColor() {
        if (this.f64647i) {
            return this.f64646h;
        }
        throw new IllegalStateException("Background color not defined.");
    }

    public boolean getCombineUpright() {
        return this.f64655q;
    }

    public int getFontColor() {
        if (this.f64645g) {
            return this.f64644f;
        }
        throw new IllegalStateException("Font color not defined");
    }

    public String getFontFamily() {
        return this.f64643e;
    }

    public float getFontSize() {
        return this.f64653o;
    }

    public int getFontSizeUnit() {
        return this.f64652n;
    }

    public int getRubyPosition() {
        return this.f64654p;
    }

    public int getSpecificityScore(String str, String str2, Set<String> set, String str3) {
        if (this.f64639a.isEmpty() && this.f64640b.isEmpty() && this.f64641c.isEmpty() && this.f64642d.isEmpty()) {
            return TextUtils.isEmpty(str2) ? 1 : 0;
        }
        int iA = a(a(a(0, this.f64639a, str, 1073741824), this.f64640b, str2, 2), this.f64642d, str3, 4);
        if (iA == -1 || !set.containsAll(this.f64641c)) {
            return 0;
        }
        return (this.f64641c.size() * 4) + iA;
    }

    public int getStyle() {
        int i10 = this.f64650l;
        if (i10 == -1 && this.f64651m == -1) {
            return -1;
        }
        return (i10 == 1 ? 1 : 0) | (this.f64651m == 1 ? 2 : 0);
    }

    public boolean hasBackgroundColor() {
        return this.f64647i;
    }

    public boolean hasFontColor() {
        return this.f64645g;
    }

    public boolean isLinethrough() {
        return this.f64648j == 1;
    }

    public boolean isUnderline() {
        return this.f64649k == 1;
    }

    public d setBackgroundColor(int i10) {
        this.f64646h = i10;
        this.f64647i = true;
        return this;
    }

    public d setBold(boolean z10) {
        this.f64650l = z10 ? 1 : 0;
        return this;
    }

    public d setCombineUpright(boolean z10) {
        this.f64655q = z10;
        return this;
    }

    public d setFontColor(int i10) {
        this.f64644f = i10;
        this.f64645g = true;
        return this;
    }

    public d setFontFamily(String str) {
        this.f64643e = str == null ? null : io.odeeo.internal.t0.c.toLowerCase(str);
        return this;
    }

    public d setFontSize(float f10) {
        this.f64653o = f10;
        return this;
    }

    public d setFontSizeUnit(int i10) {
        this.f64652n = i10;
        return this;
    }

    public d setItalic(boolean z10) {
        this.f64651m = z10 ? 1 : 0;
        return this;
    }

    public d setLinethrough(boolean z10) {
        this.f64648j = z10 ? 1 : 0;
        return this;
    }

    public d setRubyPosition(int i10) {
        this.f64654p = i10;
        return this;
    }

    public void setTargetClasses(String[] strArr) {
        this.f64641c = new HashSet(Arrays.asList(strArr));
    }

    public void setTargetId(String str) {
        this.f64639a = str;
    }

    public void setTargetTagName(String str) {
        this.f64640b = str;
    }

    public void setTargetVoice(String str) {
        this.f64642d = str;
    }

    public d setUnderline(boolean z10) {
        this.f64649k = z10 ? 1 : 0;
        return this;
    }
}
