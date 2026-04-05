package of;

import android.text.TextUtils;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class d {

    /* renamed from: f, reason: collision with root package name */
    public int f79336f;

    /* renamed from: h, reason: collision with root package name */
    public int f79338h;

    /* renamed from: o, reason: collision with root package name */
    public float f79345o;

    /* renamed from: a, reason: collision with root package name */
    public String f79331a = "";

    /* renamed from: b, reason: collision with root package name */
    public String f79332b = "";

    /* renamed from: c, reason: collision with root package name */
    public Set f79333c = Collections.EMPTY_SET;

    /* renamed from: d, reason: collision with root package name */
    public String f79334d = "";

    /* renamed from: e, reason: collision with root package name */
    public String f79335e = null;

    /* renamed from: g, reason: collision with root package name */
    public boolean f79337g = false;

    /* renamed from: i, reason: collision with root package name */
    public boolean f79339i = false;

    /* renamed from: j, reason: collision with root package name */
    public int f79340j = -1;

    /* renamed from: k, reason: collision with root package name */
    public int f79341k = -1;

    /* renamed from: l, reason: collision with root package name */
    public int f79342l = -1;

    /* renamed from: m, reason: collision with root package name */
    public int f79343m = -1;

    /* renamed from: n, reason: collision with root package name */
    public int f79344n = -1;

    /* renamed from: p, reason: collision with root package name */
    public int f79346p = -1;

    /* renamed from: q, reason: collision with root package name */
    public boolean f79347q = false;

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
        if (this.f79339i) {
            return this.f79338h;
        }
        throw new IllegalStateException("Background color not defined.");
    }

    public boolean getCombineUpright() {
        return this.f79347q;
    }

    public int getFontColor() {
        if (this.f79337g) {
            return this.f79336f;
        }
        throw new IllegalStateException("Font color not defined");
    }

    public String getFontFamily() {
        return this.f79335e;
    }

    public float getFontSize() {
        return this.f79345o;
    }

    public int getFontSizeUnit() {
        return this.f79344n;
    }

    public int getRubyPosition() {
        return this.f79346p;
    }

    public int getSpecificityScore(String str, String str2, Set<String> set, String str3) {
        if (this.f79331a.isEmpty() && this.f79332b.isEmpty() && this.f79333c.isEmpty() && this.f79334d.isEmpty()) {
            return TextUtils.isEmpty(str2) ? 1 : 0;
        }
        int iA = a(a(a(0, this.f79331a, str, 1073741824), this.f79332b, str2, 2), this.f79334d, str3, 4);
        if (iA == -1 || !set.containsAll(this.f79333c)) {
            return 0;
        }
        return (this.f79333c.size() * 4) + iA;
    }

    public int getStyle() {
        int i10 = this.f79342l;
        if (i10 == -1 && this.f79343m == -1) {
            return -1;
        }
        return (i10 == 1 ? 1 : 0) | (this.f79343m == 1 ? 2 : 0);
    }

    public boolean hasBackgroundColor() {
        return this.f79339i;
    }

    public boolean hasFontColor() {
        return this.f79337g;
    }

    public boolean isLinethrough() {
        return this.f79340j == 1;
    }

    public boolean isUnderline() {
        return this.f79341k == 1;
    }

    public d setBackgroundColor(int i10) {
        this.f79338h = i10;
        this.f79339i = true;
        return this;
    }

    public d setBold(boolean z10) {
        this.f79342l = z10 ? 1 : 0;
        return this;
    }

    public d setCombineUpright(boolean z10) {
        this.f79347q = z10;
        return this;
    }

    public d setFontColor(int i10) {
        this.f79336f = i10;
        this.f79337g = true;
        return this;
    }

    public d setFontFamily(String str) {
        this.f79335e = str == null ? null : mh.c.toLowerCase(str);
        return this;
    }

    public d setFontSize(float f10) {
        this.f79345o = f10;
        return this;
    }

    public d setFontSizeUnit(int i10) {
        this.f79344n = i10;
        return this;
    }

    public d setItalic(boolean z10) {
        this.f79343m = z10 ? 1 : 0;
        return this;
    }

    public d setLinethrough(boolean z10) {
        this.f79340j = z10 ? 1 : 0;
        return this;
    }

    public d setRubyPosition(int i10) {
        this.f79346p = i10;
        return this;
    }

    public void setTargetClasses(String[] strArr) {
        this.f79333c = new HashSet(Arrays.asList(strArr));
    }

    public void setTargetId(String str) {
        this.f79331a = str;
    }

    public void setTargetTagName(String str) {
        this.f79332b = str;
    }

    public void setTargetVoice(String str) {
        this.f79334d = str;
    }

    public d setUnderline(boolean z10) {
        this.f79341k = z10 ? 1 : 0;
        return this;
    }
}
