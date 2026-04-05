package o9;

import com.digidust.elokence.akinator.activities.QuestionActivity;
import kotlinx.coroutines.CoroutineScope;
import lb.e;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class r6 extends bv.n implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public e.i f78484i;

    /* renamed from: j, reason: collision with root package name */
    public int f78485j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ QuestionActivity f78486k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r6(QuestionActivity questionActivity, zu.d dVar) {
        super(2, dVar);
        this.f78486k = questionActivity;
    }

    @Override // bv.a
    public final zu.d<tu.x0> create(Object obj, zu.d<?> dVar) {
        return new r6(this.f78486k, dVar);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(15:0|2|(1:(1:(2:6|41)(2:7|8))(1:9))(2:10|(2:12|13)(3:14|(0)|40))|44|17|20|42|21|25|(1:27)(1:28)|29|(1:31)(2:32|(1:34)(1:35))|36|(2:38|(1:40))|41) */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00eb, code lost:
    
        r9.getBinding$akinatorGL_gplayFreemiumRelease().questionCounterText.setText(lb.b1.f72741d.sharedInstance().getTraductionFromToken("QUESTION_N") + " ?");
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0194, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0195, code lost:
    
        timber.log.Timber.Forest.tag("QuestionActivity").e(r0);
     */
    @Override // bv.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            Method dump skipped, instructions count: 534
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o9.r6.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kv.p
    public final Object invoke(CoroutineScope coroutineScope, zu.d<? super tu.x0> dVar) {
        return ((r6) create(coroutineScope, dVar)).invokeSuspend(tu.x0.f87415a);
    }
}
