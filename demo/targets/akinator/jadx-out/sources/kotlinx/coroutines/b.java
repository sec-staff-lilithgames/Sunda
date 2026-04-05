package kotlinx.coroutines;

import java.util.List;
import kotlin.jvm.internal.b1;
import kotlin.jvm.internal.e0;
import kv.p;
import sv.n0;
import tu.v;
import zu.k;
import zu.m;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final /* synthetic */ class b implements p {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f71872b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f71873c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f71874e;

    public /* synthetic */ b(Object obj, boolean z10, int i10) {
        this.f71872b = i10;
        this.f71874e = obj;
        this.f71873c = z10;
    }

    @Override // kv.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f71872b) {
            case 0:
                return CoroutineContextKt.foldCopies$lambda$1((b1) this.f71874e, this.f71873c, (m) obj, (k) obj2);
            case 1:
                char[] cArr = (char[]) this.f71874e;
                CharSequence DelimitedRangesSequence = (CharSequence) obj;
                int iIntValue = ((Integer) obj2).intValue();
                e0.checkNotNullParameter(DelimitedRangesSequence, "$this$DelimitedRangesSequence");
                int iIndexOfAny = n0.indexOfAny(DelimitedRangesSequence, cArr, iIntValue, this.f71873c);
                if (iIndexOfAny < 0) {
                    return null;
                }
                return tu.e0.to(Integer.valueOf(iIndexOfAny), 1);
            default:
                List list = (List) this.f71874e;
                CharSequence DelimitedRangesSequence2 = (CharSequence) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                e0.checkNotNullParameter(DelimitedRangesSequence2, "$this$DelimitedRangesSequence");
                v vVarB = n0.b(DelimitedRangesSequence2, list, iIntValue2, this.f71873c, false);
                if (vVarB != null) {
                    return tu.e0.to(vVarB.getFirst(), Integer.valueOf(((String) vVarB.getSecond()).length()));
                }
                return null;
        }
    }
}
