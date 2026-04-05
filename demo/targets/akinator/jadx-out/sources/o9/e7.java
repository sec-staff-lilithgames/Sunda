package o9;

import com.digidust.elokence.akinator.activities.SelectLanguageActivity;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class e7 extends bv.n implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public int f78119i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.b1 f78120j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f78121k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ SelectLanguageActivity f78122l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e7(kotlin.jvm.internal.b1 b1Var, int i10, SelectLanguageActivity selectLanguageActivity, zu.d dVar) {
        super(2, dVar);
        this.f78120j = b1Var;
        this.f78121k = i10;
        this.f78122l = selectLanguageActivity;
    }

    @Override // bv.a
    public final zu.d<tu.x0> create(Object obj, zu.d<?> dVar) {
        return new e7(this.f78120j, this.f78121k, this.f78122l, dVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005b  */
    @Override // bv.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            java.lang.Object r0 = av.e.getCOROUTINE_SUSPENDED()
            int r1 = r5.f78119i
            r2 = 1
            if (r1 == 0) goto L17
            if (r1 != r2) goto Lf
            tu.a0.throwOnFailure(r6)
            goto L67
        Lf:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L17:
            tu.a0.throwOnFailure(r6)
            lb.b1$a r6 = lb.b1.f72741d
            lb.b1 r6 = r6.sharedInstance()
            java.util.ArrayList r6 = r6.getListOfLanguages()
            int r1 = r5.f78121k
            java.lang.Object r6 = r6.get(r1)
            kotlin.jvm.internal.e0.checkNotNull(r6)
            lb.b1$b r6 = (lb.b1.b) r6
            java.lang.String r6 = r6.getCode()
            kotlin.jvm.internal.b1 r1 = r5.f78120j
            r1.f71816b = r6
            com.digidust.elokence.akinator.factories.AkApplication$a r3 = com.digidust.elokence.akinator.factories.AkApplication.f21719f
            java.lang.String r4 = "vi"
            boolean r6 = sv.k0.equals(r4, r6, r2)
            r3.setViet(r6)
            com.digidust.elokence.akinator.activities.SelectLanguageActivity r6 = r5.f78122l
            java.lang.String r3 = com.digidust.elokence.akinator.activities.SelectLanguageActivity.access$getLang$p(r6)
            if (r3 == 0) goto L5b
            java.lang.Object r1 = r1.f71816b
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r3 = com.digidust.elokence.akinator.activities.SelectLanguageActivity.access$getLang$p(r6)
            kotlin.jvm.internal.e0.checkNotNull(r3)
            boolean r1 = sv.k0.equals(r1, r3, r2)
            if (r1 != 0) goto L67
        L5b:
            com.digidust.elokence.akinator.activities.SelectLanguageActivity.access$setChangingLanguage$p(r6, r2)
            r5.f78119i = r2
            java.lang.Object r6 = com.digidust.elokence.akinator.activities.SelectLanguageActivity.access$setupAnalyticsIfNeeded(r6, r5)
            if (r6 != r0) goto L67
            return r0
        L67:
            tu.x0 r6 = tu.x0.f87415a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: o9.e7.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kv.p
    public final Object invoke(CoroutineScope coroutineScope, zu.d<? super tu.x0> dVar) {
        return ((e7) create(coroutineScope, dVar)).invokeSuspend(tu.x0.f87415a);
    }
}
