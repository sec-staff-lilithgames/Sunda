package o9;

import com.digidust.elokence.akinator.activities.PostHomeSliderActivity;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class p4 extends bv.n implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public kotlin.jvm.internal.w0 f78435i;

    /* renamed from: j, reason: collision with root package name */
    public int f78436j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ PostHomeSliderActivity f78437k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p4(PostHomeSliderActivity postHomeSliderActivity, zu.d dVar) {
        super(2, dVar);
        this.f78437k = postHomeSliderActivity;
    }

    @Override // bv.a
    public final zu.d<tu.x0> create(Object obj, zu.d<?> dVar) {
        return new p4(this.f78437k, dVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x006e, code lost:
    
        if (kotlinx.coroutines.BuildersKt.withContext(r5, r6, r9) != r0) goto L7;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0071  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x006e -> B:7:0x0014). Please report as a decompilation issue!!! */
    @Override // bv.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.Object r0 = av.e.getCOROUTINE_SUSPENDED()
            int r1 = r9.f78436j
            r2 = 0
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L24
            if (r1 == r4) goto L1e
            if (r1 != r3) goto L16
            kotlin.jvm.internal.w0 r1 = r9.f78435i
            tu.a0.throwOnFailure(r10)
        L14:
            r10 = r1
            goto L3c
        L16:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L1e:
            kotlin.jvm.internal.w0 r1 = r9.f78435i
            tu.a0.throwOnFailure(r10)
            goto L59
        L24:
            tu.a0.throwOnFailure(r10)
            timber.log.Timber$Forest r10 = timber.log.Timber.Forest
            java.lang.String r1 = "QuestionActivity"
            timber.log.Timber$Tree r10 = r10.tag(r1)
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r5 = "launchMyGame depuis PostHomeSliderActivity"
            r10.d(r5, r1)
            kotlin.jvm.internal.w0 r10 = new kotlin.jvm.internal.w0
            r10.<init>()
        L3c:
            boolean r1 = r10.f71863b
            if (r1 != 0) goto L71
            r10.f71863b = r4
            kotlinx.coroutines.CoroutineDispatcher r1 = kotlinx.coroutines.Dispatchers.getIO()
            o9.o4 r5 = new o9.o4
            r5.<init>(r3, r2)
            r9.f78435i = r10
            r9.f78436j = r4
            java.lang.Object r1 = kotlinx.coroutines.BuildersKt.withContext(r1, r5, r9)
            if (r1 != r0) goto L56
            goto L70
        L56:
            r8 = r1
            r1 = r10
            r10 = r8
        L59:
            lb.y0 r10 = (lb.y0) r10
            kotlinx.coroutines.MainCoroutineDispatcher r5 = kotlinx.coroutines.Dispatchers.getMain()
            o9.n4 r6 = new o9.n4
            com.digidust.elokence.akinator.activities.PostHomeSliderActivity r7 = r9.f78437k
            r6.<init>(r10, r7, r1, r2)
            r9.f78435i = r1
            r9.f78436j = r3
            java.lang.Object r10 = kotlinx.coroutines.BuildersKt.withContext(r5, r6, r9)
            if (r10 != r0) goto L14
        L70:
            return r0
        L71:
            tu.x0 r10 = tu.x0.f87415a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: o9.p4.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kv.p
    public final Object invoke(CoroutineScope coroutineScope, zu.d<? super tu.x0> dVar) {
        return ((p4) create(coroutineScope, dVar)).invokeSuspend(tu.x0.f87415a);
    }
}
