package o9;

import com.digidust.elokence.akinator.activities.SoundlikeActivity;
import java.util.ArrayList;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class u7 extends bv.n implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public int f78596i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ SoundlikeActivity f78597j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ String f78598k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ ArrayList f78599l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ j8 f78600m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ androidx.fragment.app.h2 f78601n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ g8 f78602o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ l8 f78603p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u7(SoundlikeActivity soundlikeActivity, String str, ArrayList arrayList, j8 j8Var, androidx.fragment.app.h2 h2Var, g8 g8Var, l8 l8Var, zu.d dVar) {
        super(2, dVar);
        this.f78597j = soundlikeActivity;
        this.f78598k = str;
        this.f78599l = arrayList;
        this.f78600m = j8Var;
        this.f78601n = h2Var;
        this.f78602o = g8Var;
        this.f78603p = l8Var;
    }

    @Override // bv.a
    public final zu.d<tu.x0> create(Object obj, zu.d<?> dVar) {
        return new u7(this.f78597j, this.f78598k, this.f78599l, this.f78600m, this.f78601n, this.f78602o, this.f78603p, dVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0052, code lost:
    
        if (kotlinx.coroutines.BuildersKt.withContext(r12, r2, r11) == r0) goto L18;
     */
    @Override // bv.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            java.lang.Object r0 = av.e.getCOROUTINE_SUSPENDED()
            int r1 = r11.f78596i
            o9.j8 r5 = r11.f78600m
            java.util.ArrayList r3 = r11.f78599l
            com.digidust.elokence.akinator.activities.SoundlikeActivity r8 = r11.f78597j
            r10 = 2
            r2 = 1
            if (r1 == 0) goto L24
            if (r1 == r2) goto L20
            if (r1 != r10) goto L18
            tu.a0.throwOnFailure(r12)     // Catch: java.lang.Exception -> L55
            goto L6c
        L18:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L20:
            tu.a0.throwOnFailure(r12)     // Catch: java.lang.Exception -> L55
            goto L3c
        L24:
            tu.a0.throwOnFailure(r12)
            kotlinx.coroutines.CoroutineDispatcher r12 = kotlinx.coroutines.Dispatchers.getIO()     // Catch: java.lang.Exception -> L55
            o9.s7 r1 = new o9.s7     // Catch: java.lang.Exception -> L55
            java.lang.String r4 = r11.f78598k     // Catch: java.lang.Exception -> L55
            r6 = 0
            r1.<init>(r4, r3, r5, r6)     // Catch: java.lang.Exception -> L55
            r11.f78596i = r2     // Catch: java.lang.Exception -> L55
            java.lang.Object r12 = kotlinx.coroutines.BuildersKt.withContext(r12, r1, r11)     // Catch: java.lang.Exception -> L55
            if (r12 != r0) goto L3c
            goto L54
        L3c:
            kotlinx.coroutines.MainCoroutineDispatcher r12 = kotlinx.coroutines.Dispatchers.getMain()     // Catch: java.lang.Exception -> L55
            o9.t7 r2 = new o9.t7     // Catch: java.lang.Exception -> L55
            androidx.fragment.app.h2 r4 = r11.f78601n     // Catch: java.lang.Exception -> L55
            o9.g8 r6 = r11.f78602o     // Catch: java.lang.Exception -> L55
            o9.l8 r7 = r11.f78603p     // Catch: java.lang.Exception -> L55
            r9 = 0
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Exception -> L55
            r11.f78596i = r10     // Catch: java.lang.Exception -> L55
            java.lang.Object r12 = kotlinx.coroutines.BuildersKt.withContext(r12, r2, r11)     // Catch: java.lang.Exception -> L55
            if (r12 != r0) goto L6c
        L54:
            return r0
        L55:
            lb.b1$a r12 = lb.b1.f72741d
            lb.b1 r12 = r12.sharedInstance()
            java.lang.String r0 = "PROBLEME_TECHNIQUE_REESSAYER_PLUS_TARD"
            java.lang.String r12 = r12.getTraductionFromToken(r0)
            r0 = 0
            android.widget.Toast r12 = android.widget.Toast.makeText(r8, r12, r0)
            r12.show()
            r8.goToHome(r0)
        L6c:
            tu.x0 r12 = tu.x0.f87415a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: o9.u7.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kv.p
    public final Object invoke(CoroutineScope coroutineScope, zu.d<? super tu.x0> dVar) {
        return ((u7) create(coroutineScope, dVar)).invokeSuspend(tu.x0.f87415a);
    }
}
