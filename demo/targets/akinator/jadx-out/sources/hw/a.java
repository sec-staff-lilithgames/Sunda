package hw;

import java.io.IOException;
import kotlin.jvm.internal.e0;
import pw.j;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f59266a;

    /* renamed from: b, reason: collision with root package name */
    public final String f59267b;

    /* renamed from: c, reason: collision with root package name */
    public final String f59268c;

    public a(String sections, String ranges, String mappings) {
        e0.checkNotNullParameter(sections, "sections");
        e0.checkNotNullParameter(ranges, "ranges");
        e0.checkNotNullParameter(mappings, "mappings");
        this.f59266a = sections;
        this.f59267b = ranges;
        this.f59268c = mappings;
    }

    public final String getMappings() {
        return this.f59268c;
    }

    public final String getRanges() {
        return this.f59267b;
    }

    public final String getSections() {
        return this.f59266a;
    }

    public final boolean map(int i10, j sink) throws IOException {
        int i11;
        int i12;
        e0.checkNotNullParameter(sink, "sink");
        int i13 = (2097024 & i10) >> 7;
        String str = this.f59266a;
        int length = (str.length() / 4) - 1;
        int i14 = 0;
        while (true) {
            if (i14 > length) {
                i11 = (-i14) - 1;
                break;
            }
            i11 = (i14 + length) / 2;
            int iCompare = e0.compare(i13, c.read14BitInt(str, i11 * 4));
            if (iCompare >= 0) {
                if (iCompare <= 0) {
                    break;
                }
                i14 = i11 + 1;
            } else {
                length = i11 - 1;
            }
        }
        int i15 = i11 >= 0 ? i11 * 4 : ((-i11) - 2) * 4;
        int i16 = c.read14BitInt(str, i15 + 2);
        int i17 = i15 + 4;
        int length2 = str.length();
        String str2 = this.f59267b;
        int length3 = i17 < length2 ? c.read14BitInt(str, i15 + 6) : str2.length() / 4;
        int i18 = i10 & 127;
        int i19 = length3 - 1;
        while (true) {
            if (i16 > i19) {
                i12 = (-i16) - 1;
                break;
            }
            i12 = (i16 + i19) / 2;
            int iCompare2 = e0.compare(i18, (int) str2.charAt(i12 * 4));
            if (iCompare2 >= 0) {
                if (iCompare2 <= 0) {
                    break;
                }
                i16 = i12 + 1;
            } else {
                i19 = i12 - 1;
            }
        }
        int i20 = i12 >= 0 ? i12 * 4 : ((-i12) - 2) * 4;
        char cCharAt = str2.charAt(i20 + 1);
        if (cCharAt >= 0 && cCharAt < '@') {
            int i21 = c.read14BitInt(str2, i20 + 2);
            sink.writeUtf8(this.f59268c, i21, cCharAt + i21);
        } else if ('@' <= cCharAt && cCharAt < 'P') {
            sink.writeUtf8CodePoint(i10 - ((((cCharAt & 15) << 14) | (str2.charAt(i20 + 2) << 7)) | str2.charAt(i20 + 3)));
        } else if ('P' <= cCharAt && cCharAt < '`') {
            sink.writeUtf8CodePoint(i10 + (((cCharAt & 15) << 14) | (str2.charAt(i20 + 2) << 7) | str2.charAt(i20 + 3)));
        } else if (cCharAt != 'w') {
            if (cCharAt == 'x') {
                sink.writeUtf8CodePoint(i10);
            } else {
                if (cCharAt == 'y') {
                    sink.writeUtf8CodePoint(i10);
                    return false;
                }
                if (cCharAt == 'z') {
                    sink.writeByte(str2.charAt(i20 + 2));
                } else if (cCharAt == '{') {
                    sink.writeByte(str2.charAt(i20 + 2) | 128);
                } else if (cCharAt == '|') {
                    sink.writeByte(str2.charAt(i20 + 2));
                    sink.writeByte(str2.charAt(i20 + 3));
                } else if (cCharAt == '}') {
                    sink.writeByte(str2.charAt(i20 + 2) | 128);
                    sink.writeByte(str2.charAt(i20 + 3));
                } else if (cCharAt == '~') {
                    sink.writeByte(str2.charAt(i20 + 2));
                    sink.writeByte(str2.charAt(i20 + 3) | 128);
                } else {
                    if (cCharAt != 127) {
                        throw new IllegalStateException(("unexpected rangesIndex for " + i10).toString());
                    }
                    sink.writeByte(str2.charAt(i20 + 2) | 128);
                    sink.writeByte(str2.charAt(i20 + 3) | 128);
                }
            }
        }
        return true;
    }
}
