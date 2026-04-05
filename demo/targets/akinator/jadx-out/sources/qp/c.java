package qp;

import android.text.TextUtils;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class c {

    /* renamed from: f, reason: collision with root package name */
    public int f83432f;

    /* renamed from: h, reason: collision with root package name */
    public int f83434h;

    /* renamed from: o, reason: collision with root package name */
    public float f83441o;

    /* renamed from: a, reason: collision with root package name */
    public String f83427a = "";

    /* renamed from: b, reason: collision with root package name */
    public String f83428b = "";

    /* renamed from: c, reason: collision with root package name */
    public Set f83429c = Collections.EMPTY_SET;

    /* renamed from: d, reason: collision with root package name */
    public String f83430d = "";

    /* renamed from: e, reason: collision with root package name */
    public String f83431e = null;

    /* renamed from: g, reason: collision with root package name */
    public boolean f83433g = false;

    /* renamed from: i, reason: collision with root package name */
    public boolean f83435i = false;

    /* renamed from: j, reason: collision with root package name */
    public int f83436j = -1;

    /* renamed from: k, reason: collision with root package name */
    public int f83437k = -1;

    /* renamed from: l, reason: collision with root package name */
    public int f83438l = -1;

    /* renamed from: m, reason: collision with root package name */
    public int f83439m = -1;

    /* renamed from: n, reason: collision with root package name */
    public int f83440n = -1;

    /* renamed from: p, reason: collision with root package name */
    public int f83442p = -1;

    /* renamed from: q, reason: collision with root package name */
    public boolean f83443q = false;

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
        if (this.f83435i) {
            return this.f83434h;
        }
        throw new IllegalStateException("Background color not defined.");
    }

    public boolean getCombineUpright() {
        return this.f83443q;
    }

    public int getFontColor() {
        if (this.f83433g) {
            return this.f83432f;
        }
        throw new IllegalStateException("Font color not defined");
    }

    public String getFontFamily() {
        return this.f83431e;
    }

    public float getFontSize() {
        return this.f83441o;
    }

    public int getFontSizeUnit() {
        return this.f83440n;
    }

    public int getRubyPosition() {
        return this.f83442p;
    }

    public int getSpecificityScore(String str, String str2, Set<String> set, String str3) {
        if (this.f83427a.isEmpty() && this.f83428b.isEmpty() && this.f83429c.isEmpty() && this.f83430d.isEmpty()) {
            return TextUtils.isEmpty(str2) ? 1 : 0;
        }
        int iA = a(a(a(0, this.f83427a, str, 1073741824), this.f83428b, str2, 2), this.f83430d, str3, 4);
        if (iA == -1 || !set.containsAll(this.f83429c)) {
            return 0;
        }
        return (this.f83429c.size() * 4) + iA;
    }

    public int getStyle() {
        int i10 = this.f83438l;
        if (i10 == -1 && this.f83439m == -1) {
            return -1;
        }
        return (i10 == 1 ? 1 : 0) | (this.f83439m == 1 ? 2 : 0);
    }

    public boolean hasBackgroundColor() {
        return this.f83435i;
    }

    public boolean hasFontColor() {
        return this.f83433g;
    }

    public boolean isLinethrough() {
        return this.f83436j == 1;
    }

    public boolean isUnderline() {
        return this.f83437k == 1;
    }

    public c setBackgroundColor(int i10) {
        this.f83434h = i10;
        this.f83435i = true;
        return this;
    }

    public c setBold(boolean z10) {
        this.f83438l = z10 ? 1 : 0;
        return this;
    }

    public c setCombineUpright(boolean z10) {
        this.f83443q = z10;
        return this;
    }

    public c setFontColor(int i10) {
        this.f83432f = i10;
        this.f83433g = true;
        return this;
    }

    public c setFontFamily(String str) {
        this.f83431e = str == null ? null : mh.c.toLowerCase(str);
        return this;
    }

    public c setFontSize(float f10) {
        this.f83441o = f10;
        return this;
    }

    public c setFontSizeUnit(int i10) {
        this.f83440n = i10;
        return this;
    }

    public c setItalic(boolean z10) {
        this.f83439m = z10 ? 1 : 0;
        return this;
    }

    public c setLinethrough(boolean z10) {
        this.f83436j = z10 ? 1 : 0;
        return this;
    }

    public c setRubyPosition(int i10) {
        this.f83442p = i10;
        return this;
    }

    public void setTargetClasses(String[] strArr) {
        this.f83429c = new HashSet(Arrays.asList(strArr));
    }

    public void setTargetId(String str) {
        this.f83427a = str;
    }

    public void setTargetTagName(String str) {
        this.f83428b = str;
    }

    public void setTargetVoice(String str) {
        this.f83430d = str;
    }

    public c setUnderline(boolean z10) {
        this.f83437k = z10 ? 1 : 0;
        return this;
    }
}
