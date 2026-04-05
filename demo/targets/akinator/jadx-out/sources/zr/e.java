package zr;

import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import javax.security.auth.x500.X500Principal;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final String f98469a;

    /* renamed from: b, reason: collision with root package name */
    public final int f98470b;

    /* renamed from: c, reason: collision with root package name */
    public int f98471c;

    /* renamed from: d, reason: collision with root package name */
    public int f98472d;

    /* renamed from: e, reason: collision with root package name */
    public int f98473e;

    /* renamed from: f, reason: collision with root package name */
    public int f98474f;

    /* renamed from: g, reason: collision with root package name */
    public char[] f98475g;

    public e(X500Principal x500Principal) {
        String name = x500Principal.getName("RFC2253");
        this.f98469a = name;
        this.f98470b = name.length();
    }

    public final int a(int i10) {
        int i11;
        int i12;
        int i13 = i10 + 1;
        int i14 = this.f98470b;
        String str = this.f98469a;
        if (i13 >= i14) {
            throw new IllegalStateException("Malformed DN: " + str);
        }
        char[] cArr = this.f98475g;
        char c10 = cArr[i10];
        if (c10 >= '0' && c10 <= '9') {
            i11 = c10 - '0';
        } else if (c10 >= 'a' && c10 <= 'f') {
            i11 = c10 - 'W';
        } else {
            if (c10 < 'A' || c10 > 'F') {
                throw new IllegalStateException("Malformed DN: " + str);
            }
            i11 = c10 - '7';
        }
        char c11 = cArr[i13];
        if (c11 >= '0' && c11 <= '9') {
            i12 = c11 - '0';
        } else if (c11 >= 'a' && c11 <= 'f') {
            i12 = c11 - 'W';
        } else {
            if (c11 < 'A' || c11 > 'F') {
                throw new IllegalStateException("Malformed DN: " + str);
            }
            i12 = c11 - '7';
        }
        return (i11 << 4) + i12;
    }

    public final char b() {
        int i10;
        int i11;
        int i12 = this.f98471c + 1;
        this.f98471c = i12;
        int i13 = this.f98470b;
        if (i12 == i13) {
            throw new IllegalStateException("Unexpected end of DN: " + this.f98469a);
        }
        char c10 = this.f98475g[i12];
        if (c10 != ' ' && c10 != '%' && c10 != '\\' && c10 != '_' && c10 != '\"' && c10 != '#') {
            switch (c10) {
                default:
                    switch (c10) {
                        case ';':
                        case '<':
                        case '=':
                        case '>':
                            break;
                        default:
                            int iA = a(i12);
                            this.f98471c++;
                            if (iA < 128) {
                                return (char) iA;
                            }
                            if (iA < 192 || iA > 247) {
                                return '?';
                            }
                            if (iA <= 223) {
                                i10 = iA & 31;
                                i11 = 1;
                            } else if (iA <= 239) {
                                i10 = iA & 15;
                                i11 = 2;
                            } else {
                                i10 = iA & 7;
                                i11 = 3;
                            }
                            for (int i14 = 0; i14 < i11; i14++) {
                                int i15 = this.f98471c;
                                int i16 = i15 + 1;
                                this.f98471c = i16;
                                if (i16 == i13 || this.f98475g[i16] != '\\') {
                                    return '?';
                                }
                                int i17 = i15 + 2;
                                this.f98471c = i17;
                                int iA2 = a(i17);
                                this.f98471c++;
                                if ((iA2 & PsExtractor.AUDIO_STREAM) != 128) {
                                    return '?';
                                }
                                i10 = (i10 << 6) + (iA2 & 63);
                            }
                            return (char) i10;
                    }
                case '*':
                case '+':
                case ',':
                    return c10;
            }
        }
        return c10;
    }

    public final String c() {
        int i10;
        int i11;
        int i12;
        char c10;
        int i13;
        char c11;
        char c12;
        while (true) {
            i10 = this.f98471c;
            i11 = this.f98470b;
            if (i10 >= i11 || this.f98475g[i10] != ' ') {
                break;
            }
            this.f98471c = i10 + 1;
        }
        if (i10 == i11) {
            return null;
        }
        this.f98472d = i10;
        this.f98471c = i10 + 1;
        while (true) {
            i12 = this.f98471c;
            if (i12 >= i11 || (c12 = this.f98475g[i12]) == '=' || c12 == ' ') {
                break;
            }
            this.f98471c = i12 + 1;
        }
        String str = this.f98469a;
        if (i12 >= i11) {
            throw new IllegalStateException("Unexpected end of DN: " + str);
        }
        this.f98473e = i12;
        if (this.f98475g[i12] == ' ') {
            while (true) {
                i13 = this.f98471c;
                if (i13 >= i11 || (c11 = this.f98475g[i13]) == '=' || c11 != ' ') {
                    break;
                }
                this.f98471c = i13 + 1;
            }
            if (this.f98475g[i13] != '=' || i13 == i11) {
                throw new IllegalStateException("Unexpected end of DN: " + str);
            }
        }
        this.f98471c++;
        while (true) {
            int i14 = this.f98471c;
            if (i14 >= i11 || this.f98475g[i14] != ' ') {
                break;
            }
            this.f98471c = i14 + 1;
        }
        int i15 = this.f98473e;
        int i16 = this.f98472d;
        if (i15 - i16 > 4) {
            char[] cArr = this.f98475g;
            if (cArr[i16 + 3] == '.' && (((c10 = cArr[i16]) == 'O' || c10 == 'o') && ((cArr[i16 + 1] == 'I' || cArr[i16 + 1] == 'i') && (cArr[i16 + 2] == 'D' || cArr[i16 + 2] == 'd')))) {
                this.f98472d = i16 + 4;
            }
        }
        char[] cArr2 = this.f98475g;
        int i17 = this.f98472d;
        return new String(cArr2, i17, i15 - i17);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0084, code lost:
    
        r8 = r16.f98472d;
        r5 = new java.lang.String(r7, r8, r16.f98473e - r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0115, code lost:
    
        r16.f98473e = r5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String findMostSpecific(java.lang.String r17) {
        /*
            Method dump skipped, instructions count: 491
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: zr.e.findMostSpecific(java.lang.String):java.lang.String");
    }
}
