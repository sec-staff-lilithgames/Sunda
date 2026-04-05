package j$.time.format;

import com.sfbx.appconsent.core.BuildConfig;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes3.dex */
public final class i implements f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f68545a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f68546b;

    public /* synthetic */ i(Object obj, int i10) {
        this.f68545a = i10;
        this.f68546b = obj;
    }

    @Override // j$.time.format.f
    public final boolean r(u uVar, StringBuilder sb2) {
        switch (this.f68545a) {
            case 0:
                Long lA = uVar.a(j$.time.temporal.a.OFFSET_SECONDS);
                if (lA != null) {
                    sb2.append("GMT");
                    int intExact = Math.toIntExact(lA.longValue());
                    if (intExact != 0) {
                        int iAbs = Math.abs((intExact / BuildConfig.VERSION_CODE) % 100);
                        int iAbs2 = Math.abs((intExact / 60) % 60);
                        int iAbs3 = Math.abs(intExact % 60);
                        sb2.append(intExact < 0 ? "-" : "+");
                        if (((b0) this.f68546b) == b0.FULL) {
                            a(sb2, iAbs);
                            sb2.append(AbstractJsonLexerKt.COLON);
                            a(sb2, iAbs2);
                            if (iAbs3 != 0) {
                                sb2.append(AbstractJsonLexerKt.COLON);
                                a(sb2, iAbs3);
                                break;
                            }
                        } else {
                            if (iAbs >= 10) {
                                sb2.append((char) ((iAbs / 10) + 48));
                            }
                            sb2.append((char) ((iAbs % 10) + 48));
                            if (iAbs2 != 0 || iAbs3 != 0) {
                                sb2.append(AbstractJsonLexerKt.COLON);
                                a(sb2, iAbs2);
                                if (iAbs3 != 0) {
                                    sb2.append(AbstractJsonLexerKt.COLON);
                                    a(sb2, iAbs3);
                                    break;
                                }
                            }
                        }
                    }
                }
                break;
            default:
                sb2.append((String) this.f68546b);
                break;
        }
        return true;
    }

    public final String toString() {
        switch (this.f68545a) {
            case 0:
                return "LocalizedOffset(" + ((b0) this.f68546b) + ")";
            default:
                return "'" + ((String) this.f68546b).replace("'", "''") + "'";
        }
    }

    public static void a(StringBuilder sb2, int i10) {
        sb2.append((char) ((i10 / 10) + 48));
        sb2.append((char) ((i10 % 10) + 48));
    }
}
