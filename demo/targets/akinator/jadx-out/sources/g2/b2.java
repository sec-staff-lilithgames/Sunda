package g2;

import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class b2 {
    public static final long TextRange(int i10, int i11) {
        if (i10 < 0) {
            throw new IllegalArgumentException(b0.e2.h(AbstractJsonLexerKt.END_LIST, "start cannot be negative. [start: ", i10).toString());
        }
        if (i11 < 0) {
            throw new IllegalArgumentException(b0.e2.h(AbstractJsonLexerKt.END_LIST, "end cannot negative. [end: ", i11).toString());
        }
        return a2.m3949constructorimpl((i11 & 4294967295L) | (i10 << 32));
    }

    /* renamed from: constrain-8ffj60Q, reason: not valid java name */
    public static final long m3973constrain8ffj60Q(long j10, int i10, int i11) {
        int iCoerceIn = qv.v.coerceIn(a2.m3960getStartimpl(j10), i10, i11);
        int iCoerceIn2 = qv.v.coerceIn(a2.m3955getEndimpl(j10), i10, i11);
        return (iCoerceIn == a2.m3960getStartimpl(j10) && iCoerceIn2 == a2.m3955getEndimpl(j10)) ? j10 : TextRange(iCoerceIn, iCoerceIn2);
    }

    /* renamed from: substring-FDrldGo, reason: not valid java name */
    public static final String m3974substringFDrldGo(CharSequence substring, long j10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(substring, "$this$substring");
        return substring.subSequence(a2.m3958getMinimpl(j10), a2.m3957getMaximpl(j10)).toString();
    }

    public static final long TextRange(int i10) {
        return TextRange(i10, i10);
    }
}
