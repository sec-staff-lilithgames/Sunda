package j$.time.format;

import com.sfbx.appconsent.core.BuildConfig;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class k implements f {

    /* renamed from: d, reason: collision with root package name */
    public static final String[] f68553d = {"+HH", "+HHmm", "+HH:mm", "+HHMM", "+HH:MM", "+HHMMss", "+HH:MM:ss", "+HHMMSS", "+HH:MM:SS", "+HHmmss", "+HH:mm:ss", "+H", "+Hmm", "+H:mm", "+HMM", "+H:MM", "+HMMss", "+H:MM:ss", "+HMMSS", "+H:MM:SS", "+Hmmss", "+H:mm:ss"};

    /* renamed from: e, reason: collision with root package name */
    public static final k f68554e = new k("+HH:MM:ss", "Z");

    /* renamed from: a, reason: collision with root package name */
    public final String f68555a;

    /* renamed from: b, reason: collision with root package name */
    public final int f68556b;

    /* renamed from: c, reason: collision with root package name */
    public final int f68557c;

    static {
        new k("+HH:MM:ss", "0");
    }

    public k(String str, String str2) {
        Objects.requireNonNull(str, "pattern");
        for (int i10 = 0; i10 < 22; i10++) {
            if (f68553d[i10].equals(str)) {
                this.f68556b = i10;
                this.f68557c = i10 % 11;
                this.f68555a = str2;
                return;
            }
        }
        throw new IllegalArgumentException("Invalid zone offset pattern: ".concat(str));
    }

    @Override // j$.time.format.f
    public final boolean r(u uVar, StringBuilder sb2) {
        Long lA = uVar.a(j$.time.temporal.a.OFFSET_SECONDS);
        boolean z10 = false;
        if (lA == null) {
            return false;
        }
        int intExact = Math.toIntExact(lA.longValue());
        String str = this.f68555a;
        if (intExact == 0) {
            sb2.append(str);
            return true;
        }
        int iAbs = Math.abs((intExact / BuildConfig.VERSION_CODE) % 100);
        int iAbs2 = Math.abs((intExact / 60) % 60);
        int iAbs3 = Math.abs(intExact % 60);
        int length = sb2.length();
        sb2.append(intExact < 0 ? "-" : "+");
        if (this.f68556b < 11 || iAbs >= 10) {
            a(false, iAbs, sb2);
        } else {
            sb2.append((char) (iAbs + 48));
        }
        int i10 = this.f68557c;
        if ((i10 >= 3 && i10 <= 8) || ((i10 >= 9 && iAbs3 > 0) || (i10 >= 1 && iAbs2 > 0))) {
            a(i10 > 0 && i10 % 2 == 0, iAbs2, sb2);
            iAbs += iAbs2;
            if (i10 == 7 || i10 == 8 || (i10 >= 5 && iAbs3 > 0)) {
                if (i10 > 0 && i10 % 2 == 0) {
                    z10 = true;
                }
                a(z10, iAbs3, sb2);
                iAbs += iAbs3;
            }
        }
        if (iAbs == 0) {
            sb2.setLength(length);
            sb2.append(str);
        }
        return true;
    }

    public static void a(boolean z10, int i10, StringBuilder sb2) {
        sb2.append(z10 ? ":" : "");
        sb2.append((char) ((i10 / 10) + 48));
        sb2.append((char) ((i10 % 10) + 48));
    }

    public final String toString() {
        String strReplace = this.f68555a.replace("'", "''");
        return "Offset(" + f68553d[this.f68556b] + ",'" + strReplace + "')";
    }
}
