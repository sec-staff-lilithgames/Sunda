package oa;

import com.airbnb.lottie.LottieAnimationView;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.CancellationException;
import ka.c0;
import ka.t0;
import kotlin.jvm.internal.e0;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import timber.log.Timber;
import tu.x0;
import tu.z;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final LottieAnimationView f78768a;

    /* renamed from: b, reason: collision with root package name */
    public final CoroutineScope f78769b;

    /* renamed from: c, reason: collision with root package name */
    public ka.a f78770c;

    /* renamed from: d, reason: collision with root package name */
    public Job f78771d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f78772e;

    /* renamed from: f, reason: collision with root package name */
    public final LinkedHashMap f78773f;

    /* renamed from: g, reason: collision with root package name */
    public final long f78774g;

    /* renamed from: h, reason: collision with root package name */
    public String f78775h;

    /* renamed from: i, reason: collision with root package name */
    public r7.h f78776i;

    public l(LottieAnimationView lottieView, CoroutineScope playerScope) {
        e0.checkNotNullParameter(lottieView, "lottieView");
        e0.checkNotNullParameter(playerScope, "playerScope");
        this.f78768a = lottieView;
        this.f78769b = playerScope;
        this.f78773f = new LinkedHashMap();
        this.f78774g = 5000L;
    }

    public static final long access$getRebootDelay(l lVar, ka.f fVar) {
        lVar.getClass();
        return (e0.areEqual(fVar, t0.f70766b) || e0.areEqual(fVar, c0.f70708b)) ? 500L : 2000L;
    }

    public static final /* synthetic */ String access$getTag$p(l lVar) {
        lVar.getClass();
        return "AkinatorPlayer";
    }

    public static final Object access$loadComposition(l lVar, String str, zu.d dVar) {
        lVar.getClass();
        return BuildersKt.withContext(Dispatchers.getDefault(), new d(lVar, str, null), dVar);
    }

    public static final Object access$playTransitionLogic(l lVar, ka.a aVar, ka.a aVar2, zu.d dVar) {
        lVar.getClass();
        Timber.Forest forest = Timber.Forest;
        forest.tag("Player").d("AkinatorPlayer playTransitionLogic called from " + aVar + " to " + aVar2, new Object[0]);
        if (aVar != aVar2) {
            Long l9 = (Long) lVar.f78773f.get(tu.e0.to(aVar, aVar2));
            ka.f fVarFindTransition = n.findTransition(aVar, aVar2);
            forest.tag("Player").d("AkinatorPlayer forwardTransition: " + fVarFindTransition, new Object[0]);
            ka.f fVarFindTransition2 = fVarFindTransition == null ? n.findTransition(aVar2, aVar) : null;
            forest.tag("Player").d("AkinatorPlayer backwardTransition: " + fVarFindTransition2, new Object[0]);
            if (fVarFindTransition != null) {
                Object objPlayLottieOnce = lVar.playLottieOnce(fVarFindTransition, false, l9, dVar);
                if (objPlayLottieOnce == av.e.getCOROUTINE_SUSPENDED()) {
                    return objPlayLottieOnce;
                }
            } else if (fVarFindTransition2 != null) {
                forest.d("Using reverse animation for " + aVar + " -> " + aVar2, new Object[0]);
                Object objPlayLottieOnce2 = lVar.playLottieOnce(fVarFindTransition2, true, l9, dVar);
                if (objPlayLottieOnce2 == av.e.getCOROUTINE_SUSPENDED()) {
                    return objPlayLottieOnce2;
                }
            } else {
                Object objA = lVar.a(aVar2, l9 != null ? l9.longValue() : lVar.f78774g, dVar);
                if (objA == av.e.getCOROUTINE_SUSPENDED()) {
                    return objA;
                }
            }
        }
        return x0.f87415a;
    }

    public static final void access$resumeCo(l lVar, CancellableContinuation cancellableContinuation, Object obj) {
        lVar.getClass();
        if (cancellableContinuation.isActive()) {
            cancellableContinuation.resumeWith(z.m7131constructorimpl(obj));
        } else {
            Timber.Forest.tag("AkinatorPlayer").w("Try to continue a cancelled coroutine", new Object[0]);
        }
    }

    public static /* synthetic */ Object playLottieOnce$default(l lVar, ka.f fVar, boolean z10, Long l9, zu.d dVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return lVar.playLottieOnce(fVar, z10, l9, dVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00bd, code lost:
    
        if (kotlinx.coroutines.DelayKt.delay(r11 / 2, r0) == r1) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(ka.a r10, long r11, zu.d r13) {
        /*
            r9 = this;
            boolean r0 = r13 instanceof oa.j
            if (r0 == 0) goto L13
            r0 = r13
            oa.j r0 = (oa.j) r0
            int r1 = r0.f78761n
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f78761n = r1
            goto L18
        L13:
            oa.j r0 = new oa.j
            r0.<init>(r9, r13)
        L18:
            java.lang.Object r13 = r0.f78759l
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.f78761n
            r3 = 3
            r4 = 1
            r5 = 0
            r6 = 2
            if (r2 == 0) goto L4b
            if (r2 == r4) goto L41
            if (r2 == r6) goto L39
            if (r2 != r3) goto L31
            tu.a0.throwOnFailure(r13)
            goto Lc0
        L31:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L39:
            long r10 = r0.f78758k
            oa.l r12 = r0.f78756i
            tu.a0.throwOnFailure(r13)
            goto La0
        L41:
            long r11 = r0.f78758k
            ka.a r10 = r0.f78757j
            oa.l r2 = r0.f78756i
            tu.a0.throwOnFailure(r13)
            goto L61
        L4b:
            tu.a0.throwOnFailure(r13)
            long r7 = (long) r6
            long r7 = r11 / r7
            r0.f78756i = r9
            r0.f78757j = r10
            r0.f78758k = r11
            r0.f78761n = r4
            java.lang.Object r13 = kotlinx.coroutines.DelayKt.delay(r7, r0)
            if (r13 != r1) goto L60
            goto Lbf
        L60:
            r2 = r9
        L61:
            timber.log.Timber$Forest r13 = timber.log.Timber.Forest
            r2.getClass()
            java.lang.String r4 = "AkinatorPlayer"
            timber.log.Timber$Tree r13 = r13.tag(r4)
            java.lang.String r4 = r10.name()
            java.lang.String r7 = "playStaticFALLLLLLLLLBAAAAAAAAAAACKKKKKKKKK called for "
            java.lang.String r4 = a.b.k(r7, r4)
            r7 = 0
            java.lang.Object[] r7 = new java.lang.Object[r7]
            r13.d(r4, r7)
            ka.f r10 = oa.o.findWaitingAnimation(r10)
            if (r10 == 0) goto Lb1
            java.lang.String r10 = r10.getPath()
            r0.f78756i = r2
            r0.f78757j = r5
            r0.f78758k = r11
            r0.f78761n = r6
            kotlinx.coroutines.CoroutineDispatcher r13 = kotlinx.coroutines.Dispatchers.getDefault()
            oa.d r4 = new oa.d
            r4.<init>(r2, r10, r5)
            java.lang.Object r13 = kotlinx.coroutines.BuildersKt.withContext(r13, r4, r0)
            if (r13 != r1) goto L9e
            goto Lbf
        L9e:
            r10 = r11
            r12 = r2
        La0:
            r7.h r13 = (r7.h) r13
            if (r13 == 0) goto Lb0
            com.airbnb.lottie.LottieAnimationView r12 = r12.f78768a
            r12.setComposition(r13)
            r12.pauseAnimation()
            r13 = 0
            r12.setProgress(r13)
        Lb0:
            r11 = r10
        Lb1:
            long r6 = (long) r6
            long r11 = r11 / r6
            r0.f78756i = r5
            r0.f78757j = r5
            r0.f78761n = r3
            java.lang.Object r10 = kotlinx.coroutines.DelayKt.delay(r11, r0)
            if (r10 != r1) goto Lc0
        Lbf:
            return r1
        Lc0:
            tu.x0 r10 = tu.x0.f87415a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: oa.l.a(ka.a, long, zu.d):java.lang.Object");
    }

    public final Job getAnimationJob() {
        return this.f78771d;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00ef A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object playLottieOnce(ka.f r19, boolean r20, java.lang.Long r21, zu.d<? super tu.x0> r22) {
        /*
            Method dump skipped, instructions count: 241
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: oa.l.playLottieOnce(ka.f, boolean, java.lang.Long, zu.d):java.lang.Object");
    }

    public final Job playSequence(ka.a initialAkitude, List<ka.b> steps) {
        e0.checkNotNullParameter(initialAkitude, "initialAkitude");
        e0.checkNotNullParameter(steps, "steps");
        Timber.Forest.tag("AkinatorPlayer").d("AkinatorPlayer playSequence called \n initial=" + initialAkitude + " steps=" + steps, new Object[0]);
        this.f78770c = initialAkitude;
        Job job = this.f78771d;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        Job jobLaunch$default = BuildersKt__Builders_commonKt.launch$default(this.f78769b, null, null, new i(this, steps, null), 3, null);
        this.f78771d = jobLaunch$default;
        return jobLaunch$default;
    }

    public final void setAnimationJob(Job job) {
        this.f78771d = job;
    }

    public final void setTransitionDuration(ka.a from, ka.a to2, long j10) {
        e0.checkNotNullParameter(from, "from");
        e0.checkNotNullParameter(to2, "to");
        this.f78773f.put(tu.e0.to(from, to2), Long.valueOf(j10));
    }

    public final void startWaitingLoop(ka.a akitude, boolean z10) {
        e0.checkNotNullParameter(akitude, "akitude");
        Timber.Forest.tag("AkinatorPlayer").d("startWaitingLoop called for " + akitude + " with firstLaunch=" + z10, new Object[0]);
        Job job = this.f78771d;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.f78771d = BuildersKt__Builders_commonKt.launch$default(this.f78769b, null, null, new k(akitude, z10, this, null), 3, null);
    }
}
