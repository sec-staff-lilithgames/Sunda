package o9;

import com.digidust.elokence.akinator.activities.QuestionActivity;
import kotlinx.coroutines.CoroutineScope;
import lb.e;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class c6 extends bv.n implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public int f78070i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ QuestionActivity f78071j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ e.i f78072k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c6(QuestionActivity questionActivity, e.i iVar, zu.d dVar) {
        super(2, dVar);
        this.f78071j = questionActivity;
        this.f78072k = iVar;
    }

    @Override // bv.a
    public final zu.d<tu.x0> create(Object obj, zu.d<?> dVar) {
        return new c6(this.f78071j, this.f78072k, dVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:63:0x0151, code lost:
    
        if (r9.K(r11) != r0) goto L65;
     */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0147  */
    @Override // bv.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            Method dump skipped, instructions count: 343
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o9.c6.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kv.p
    public final Object invoke(CoroutineScope coroutineScope, zu.d<? super tu.x0> dVar) {
        return ((c6) create(coroutineScope, dVar)).invokeSuspend(tu.x0.f87415a);
    }
}
