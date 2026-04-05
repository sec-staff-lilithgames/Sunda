package g2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class d extends kotlin.jvm.internal.f0 implements kv.q {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ n2.e f56746e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(n2.e eVar) {
        super(3);
        this.f56746e = eVar;
    }

    @Override // kv.q
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((String) obj, ((Number) obj2).intValue(), ((Number) obj3).intValue());
    }

    public final String invoke(String str, int i10, int i11) {
        kotlin.jvm.internal.e0.checkNotNullParameter(str, "str");
        if (i10 == 0) {
            String strSubstring = str.substring(i10, i11);
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            return u1.decapitalize(strSubstring, this.f56746e);
        }
        String strSubstring2 = str.substring(i10, i11);
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(strSubstring2, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring2;
    }
}
