package ow;

import com.ironsource.G5;
import java.io.IOException;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import sv.j0;
import sv.k0;
import sv.n0;
import xv.f0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class f {

    /* renamed from: g, reason: collision with root package name */
    public static final a f79914g = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public final boolean f79915a;

    /* renamed from: b, reason: collision with root package name */
    public final Integer f79916b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f79917c;

    /* renamed from: d, reason: collision with root package name */
    public final Integer f79918d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f79919e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f79920f;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public a(u uVar) {
        }

        public final f parse(f0 responseHeaders) throws IOException {
            e0.checkNotNullParameter(responseHeaders, "responseHeaders");
            int size = responseHeaders.size();
            boolean z10 = false;
            Integer intOrNull = null;
            boolean z11 = false;
            Integer intOrNull2 = null;
            boolean z12 = false;
            boolean z13 = false;
            for (int i10 = 0; i10 < size; i10++) {
                if (k0.equals(responseHeaders.name(i10), "Sec-WebSocket-Extensions", true)) {
                    String strValue = responseHeaders.value(i10);
                    int i11 = 0;
                    while (i11 < strValue.length()) {
                        int i12 = i11;
                        int iDelimiterOffset$default = yv.h.delimiterOffset$default(strValue, AbstractJsonLexerKt.COMMA, i12, 0, 4, (Object) null);
                        int iDelimiterOffset = yv.h.delimiterOffset(strValue, ';', i12, iDelimiterOffset$default);
                        String strTrimSubstring = yv.h.trimSubstring(strValue, i12, iDelimiterOffset);
                        int i13 = iDelimiterOffset + 1;
                        if (k0.equals(strTrimSubstring, "permessage-deflate", true)) {
                            if (!z10) {
                                z13 = true;
                                while (i13 < iDelimiterOffset$default) {
                                    int iDelimiterOffset2 = yv.h.delimiterOffset(strValue, ';', i13, iDelimiterOffset$default);
                                    int iDelimiterOffset3 = yv.h.delimiterOffset(strValue, G5.T, i13, iDelimiterOffset2);
                                    String strTrimSubstring2 = yv.h.trimSubstring(strValue, i13, iDelimiterOffset3);
                                    String strRemoveSurrounding = iDelimiterOffset3 < iDelimiterOffset2 ? n0.removeSurrounding(yv.h.trimSubstring(strValue, iDelimiterOffset3 + 1, iDelimiterOffset2), (CharSequence) "\"") : null;
                                    int i14 = iDelimiterOffset2 + 1;
                                    if (k0.equals(strTrimSubstring2, "client_max_window_bits", true)) {
                                        if (intOrNull != null) {
                                            z13 = true;
                                        }
                                        intOrNull = strRemoveSurrounding != null ? j0.toIntOrNull(strRemoveSurrounding) : null;
                                        i13 = intOrNull == null ? i14 : i14;
                                    } else if (k0.equals(strTrimSubstring2, "client_no_context_takeover", true)) {
                                        if (z11) {
                                            z13 = true;
                                        }
                                        if (strRemoveSurrounding != null) {
                                            z13 = true;
                                        }
                                        i13 = i14;
                                        z11 = true;
                                    } else if (k0.equals(strTrimSubstring2, "server_max_window_bits", true)) {
                                        if (intOrNull2 != null) {
                                            z13 = true;
                                        }
                                        intOrNull2 = strRemoveSurrounding != null ? j0.toIntOrNull(strRemoveSurrounding) : null;
                                        if (intOrNull2 == null) {
                                        }
                                    } else if (k0.equals(strTrimSubstring2, "server_no_context_takeover", true)) {
                                        if (z12) {
                                            z13 = true;
                                        }
                                        if (strRemoveSurrounding != null) {
                                            z13 = true;
                                        }
                                        i13 = i14;
                                        z12 = true;
                                    }
                                }
                                i11 = i13;
                                z10 = true;
                            }
                            z13 = true;
                        } else {
                            i11 = i13;
                            z13 = true;
                        }
                    }
                }
            }
            return new f(z10, intOrNull, z11, intOrNull2, z12, z13);
        }
    }

    public f() {
        this(false, null, false, null, false, false, 63, null);
    }

    public static /* synthetic */ f copy$default(f fVar, boolean z10, Integer num, boolean z11, Integer num2, boolean z12, boolean z13, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = fVar.f79915a;
        }
        if ((i10 & 2) != 0) {
            num = fVar.f79916b;
        }
        if ((i10 & 4) != 0) {
            z11 = fVar.f79917c;
        }
        if ((i10 & 8) != 0) {
            num2 = fVar.f79918d;
        }
        if ((i10 & 16) != 0) {
            z12 = fVar.f79919e;
        }
        if ((i10 & 32) != 0) {
            z13 = fVar.f79920f;
        }
        boolean z14 = z12;
        boolean z15 = z13;
        return fVar.copy(z10, num, z11, num2, z14, z15);
    }

    public final boolean component1() {
        return this.f79915a;
    }

    public final Integer component2() {
        return this.f79916b;
    }

    public final boolean component3() {
        return this.f79917c;
    }

    public final Integer component4() {
        return this.f79918d;
    }

    public final boolean component5() {
        return this.f79919e;
    }

    public final boolean component6() {
        return this.f79920f;
    }

    public final f copy(boolean z10, Integer num, boolean z11, Integer num2, boolean z12, boolean z13) {
        return new f(z10, num, z11, num2, z12, z13);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f79915a == fVar.f79915a && e0.areEqual(this.f79916b, fVar.f79916b) && this.f79917c == fVar.f79917c && e0.areEqual(this.f79918d, fVar.f79918d) && this.f79919e == fVar.f79919e && this.f79920f == fVar.f79920f;
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.f79915a) * 31;
        Integer num = this.f79916b;
        int iC = com.google.android.gms.internal.play_billing.a.c((iHashCode + (num == null ? 0 : num.hashCode())) * 31, 31, this.f79917c);
        Integer num2 = this.f79918d;
        return Boolean.hashCode(this.f79920f) + com.google.android.gms.internal.play_billing.a.c((iC + (num2 != null ? num2.hashCode() : 0)) * 31, 31, this.f79919e);
    }

    public final boolean noContextTakeover(boolean z10) {
        return z10 ? this.f79917c : this.f79919e;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("WebSocketExtensions(perMessageDeflate=");
        sb2.append(this.f79915a);
        sb2.append(", clientMaxWindowBits=");
        sb2.append(this.f79916b);
        sb2.append(", clientNoContextTakeover=");
        sb2.append(this.f79917c);
        sb2.append(", serverMaxWindowBits=");
        sb2.append(this.f79918d);
        sb2.append(", serverNoContextTakeover=");
        sb2.append(this.f79919e);
        sb2.append(", unknownValues=");
        return a.b.p(sb2, this.f79920f, ')');
    }

    public f(boolean z10, Integer num, boolean z11, Integer num2, boolean z12, boolean z13) {
        this.f79915a = z10;
        this.f79916b = num;
        this.f79917c = z11;
        this.f79918d = num2;
        this.f79919e = z12;
        this.f79920f = z13;
    }

    public /* synthetic */ f(boolean z10, Integer num, boolean z11, Integer num2, boolean z12, boolean z13, int i10, u uVar) {
        this((i10 & 1) != 0 ? false : z10, (i10 & 2) != 0 ? null : num, (i10 & 4) != 0 ? false : z11, (i10 & 8) != 0 ? null : num2, (i10 & 16) != 0 ? false : z12, (i10 & 32) != 0 ? false : z13);
    }
}
