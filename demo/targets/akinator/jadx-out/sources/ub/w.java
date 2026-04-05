package ub;

import java.io.Serializable;
import java.util.ArrayList;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class w implements Serializable {

    /* renamed from: j, reason: collision with root package name */
    public static final w f88369j = new w();

    /* renamed from: b, reason: collision with root package name */
    public final w f88370b;

    /* renamed from: c, reason: collision with root package name */
    public volatile w f88371c;

    /* renamed from: e, reason: collision with root package name */
    public final String f88372e;

    /* renamed from: f, reason: collision with root package name */
    public final int f88373f;

    /* renamed from: g, reason: collision with root package name */
    public final String f88374g;

    /* renamed from: h, reason: collision with root package name */
    public final int f88375h;

    /* renamed from: i, reason: collision with root package name */
    public int f88376i;

    public w() {
        this.f88370b = null;
        this.f88374g = null;
        this.f88375h = -1;
        this.f88372e = "";
        this.f88373f = 0;
    }

    public static void a(String str, StringBuilder sb2) {
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            char cCharAt = str.charAt(i10);
            if (cCharAt == '/') {
                sb2.append("~1");
            } else if (cCharAt == '~') {
                sb2.append("~0");
            } else {
                sb2.append(cCharAt);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x009d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0096 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static ub.w compile(java.lang.String r14) throws java.lang.IllegalArgumentException {
        /*
            Method dump skipped, instructions count: 245
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ub.w.compile(java.lang.String):ub.w");
    }

    public static w empty() {
        return f88369j;
    }

    public static w forPath(y yVar, boolean z10) {
        v vVar;
        w wVar = f88369j;
        if (yVar != null) {
            if (!yVar.hasPathSegment() && (!z10 || !yVar.inRoot() || !yVar.hasCurrentIndex())) {
                yVar = yVar.getParent();
            }
            int iC = 0;
            v vVar2 = null;
            while (yVar != null) {
                if (yVar.inObject()) {
                    String currentName = yVar.getCurrentName();
                    if (currentName == null) {
                        currentName = "";
                    }
                    iC = o2.C(2, iC, currentName);
                    vVar = new v(vVar2, currentName, -1);
                } else if (yVar.inArray() || z10) {
                    iC += 6;
                    vVar = new v(vVar2, null, yVar.getCurrentIndex());
                } else {
                    yVar = yVar.getParent();
                }
                vVar2 = vVar;
                yVar = yVar.getParent();
            }
            if (vVar2 != null) {
                StringBuilder sb2 = new StringBuilder(iC);
                v vVar3 = null;
                v vVar4 = vVar2;
                while (vVar4 != null) {
                    vVar4.f88367d = sb2.length();
                    sb2.append('/');
                    String str = vVar4.f88365b;
                    if (str != null) {
                        a(str, sb2);
                    } else {
                        sb2.append(vVar4.f88366c);
                    }
                    v vVar5 = vVar4;
                    vVar4 = vVar4.f88364a;
                    vVar3 = vVar5;
                }
                String string = sb2.toString();
                w wVar2 = wVar;
                while (vVar3 != null) {
                    String str2 = vVar3.f88365b;
                    if (str2 != null) {
                        wVar2 = new w(string, vVar3.f88367d, str2, wVar2);
                    } else {
                        int i10 = vVar3.f88366c;
                        wVar2 = new w(string, vVar3.f88367d, String.valueOf(i10), i10, wVar2);
                    }
                    vVar3 = vVar3.f88368e;
                }
                return wVar2;
            }
        }
        return wVar;
    }

    public static w valueOf(String str) {
        return compile(str);
    }

    public w append(w wVar) {
        w wVar2 = f88369j;
        if (this == wVar2) {
            return wVar;
        }
        if (wVar == wVar2) {
            return this;
        }
        StringBuilder sbU = o2.u(toString());
        sbU.append(wVar.toString());
        return compile(sbU.toString());
    }

    public w appendIndex(int i10) {
        StringBuilder sb2;
        if (i10 < 0) {
            throw new IllegalArgumentException("Negative index cannot be appended");
        }
        String str = this.f88372e;
        int i11 = this.f88373f;
        if (i11 <= 0) {
            sb2 = new StringBuilder(str);
        } else {
            int length = str.length();
            StringBuilder sb3 = new StringBuilder((length - i11) + 8);
            sb3.append((CharSequence) str, i11, length);
            sb2 = sb3;
        }
        sb2.append('/');
        sb2.append(i10);
        return compile(sb2.toString());
    }

    public w appendProperty(String str) {
        StringBuilder sb2;
        if (str == null) {
            return this;
        }
        int length = str.length() + 2;
        String str2 = this.f88372e;
        int i10 = this.f88373f;
        if (i10 <= 0) {
            sb2 = new StringBuilder(str2);
        } else {
            int length2 = str2.length();
            StringBuilder sb3 = new StringBuilder((length2 - i10) + length);
            sb3.append((CharSequence) str2, i10, length2);
            sb2 = sb3;
        }
        sb2.append('/');
        a(str, sb2);
        return compile(sb2.toString());
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || !(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        String str = wVar.f88372e;
        int i10 = wVar.f88373f;
        String str2 = this.f88372e;
        int length = str2.length();
        int i11 = this.f88373f;
        if (length - i11 == str.length() - i10) {
            while (i11 < length) {
                int i12 = i11 + 1;
                int i13 = i10 + 1;
                if (str2.charAt(i11) == str.charAt(i10)) {
                    i11 = i12;
                    i10 = i13;
                }
            }
            return true;
        }
        return false;
    }

    public int getMatchingIndex() {
        return this.f88375h;
    }

    public String getMatchingProperty() {
        return this.f88374g;
    }

    public int hashCode() {
        int iHashCode = this.f88376i;
        if (iHashCode == 0) {
            iHashCode = toString().hashCode();
            if (iHashCode == 0) {
                iHashCode = -1;
            }
            this.f88376i = iHashCode;
        }
        return iHashCode;
    }

    public w head() {
        w wVar = this.f88371c;
        if (wVar == null) {
            w wVar2 = f88369j;
            if (this != wVar2) {
                w wVarLast = last();
                if (wVarLast != this) {
                    ArrayList arrayList = new ArrayList();
                    String string = toString();
                    String strSubstring = string.substring(0, string.length() - wVarLast.length());
                    int i10 = -this.f88373f;
                    for (w wVar3 = this; wVar3 != wVarLast; wVar3 = wVar3.f88370b) {
                        arrayList.add(new w(wVar3, strSubstring, wVar3.f88373f + i10));
                    }
                    int size = arrayList.size() - 1;
                    while (size >= 0) {
                        w wVar4 = new w((w) arrayList.get(size), wVar2);
                        size--;
                        wVar2 = wVar4;
                    }
                }
                wVar = wVar2;
            }
            this.f88371c = wVar;
        }
        return wVar;
    }

    public w last() {
        w wVar = f88369j;
        if (this == wVar) {
            return null;
        }
        w wVar2 = this;
        while (true) {
            w wVar3 = wVar2.f88370b;
            if (wVar3 == wVar) {
                return wVar2;
            }
            wVar2 = wVar3;
        }
    }

    public int length() {
        return this.f88372e.length() - this.f88373f;
    }

    public w matchElement(int i10) {
        if (i10 != this.f88375h || i10 < 0) {
            return null;
        }
        return this.f88370b;
    }

    public w matchProperty(String str) {
        w wVar = this.f88370b;
        if (wVar == null || !this.f88374g.equals(str)) {
            return null;
        }
        return wVar;
    }

    public boolean matches() {
        return this.f88370b == null;
    }

    public boolean matchesElement(int i10) {
        return i10 == this.f88375h && i10 >= 0;
    }

    public boolean matchesProperty(String str) {
        return this.f88370b != null && this.f88374g.equals(str);
    }

    public boolean mayMatchElement() {
        return this.f88375h >= 0;
    }

    public boolean mayMatchProperty() {
        return this.f88374g != null;
    }

    public w tail() {
        return this.f88370b;
    }

    public String toString() {
        String str = this.f88372e;
        int i10 = this.f88373f;
        return i10 <= 0 ? str : str.substring(i10);
    }

    public w(String str, int i10, String str2, w wVar) throws NumberFormatException {
        this.f88372e = str;
        this.f88373f = i10;
        this.f88370b = wVar;
        this.f88374g = str2;
        int length = str2.length();
        int i11 = -1;
        if (length != 0 && length <= 10) {
            char cCharAt = str2.charAt(0);
            int i12 = 1;
            if (cCharAt <= '0') {
                if (length == 1 && cCharAt == '0') {
                    i11 = 0;
                }
            } else if (cCharAt <= '9') {
                while (true) {
                    if (i12 < length) {
                        char cCharAt2 = str2.charAt(i12);
                        if (cCharAt2 > '9' || cCharAt2 < '0') {
                            break;
                        } else {
                            i12++;
                        }
                    } else if (length == 10) {
                        long j10 = Long.parseLong(str2);
                        if (j10 <= 2147483647L) {
                            i11 = (int) j10;
                        }
                    } else {
                        i11 = cc.m.parseInt(str2);
                    }
                }
            }
        }
        this.f88375h = i11;
    }

    public w(String str, int i10, String str2, int i11, w wVar) {
        this.f88372e = str;
        this.f88373f = i10;
        this.f88370b = wVar;
        this.f88374g = str2;
        this.f88375h = i11;
    }

    public w(w wVar, w wVar2) {
        this.f88372e = wVar.f88372e;
        this.f88373f = wVar.f88373f;
        this.f88370b = wVar2;
        this.f88374g = wVar.f88374g;
        this.f88375h = wVar.f88375h;
    }

    public w(w wVar, String str, int i10) {
        this.f88372e = str;
        this.f88373f = i10;
        this.f88370b = null;
        this.f88374g = wVar.f88374g;
        this.f88375h = wVar.f88375h;
    }
}
