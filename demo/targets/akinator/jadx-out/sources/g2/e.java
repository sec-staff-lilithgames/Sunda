package g2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class e extends kotlin.jvm.internal.f0 implements kv.q {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ n2.e f56750e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(n2.e eVar) {
        super(3);
        this.f56750e = eVar;
    }

    @Override // kv.q
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((String) obj, ((Number) obj2).intValue(), ((Number) obj3).intValue());
    }

    public final String invoke(String str, int i10, int i11) {
        kotlin.jvm.internal.e0.checkNotNullParameter(str, "str");
        String strSubstring = str.substring(i10, i11);
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return u1.toLowerCase(strSubstring, this.f56750e);
    }
}
