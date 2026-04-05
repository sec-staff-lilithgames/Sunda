package nj;

import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.internal.firebase.inappmessaging.v1.sdkserving.CampaignImpression;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class q implements bj.b1 {

    /* renamed from: a, reason: collision with root package name */
    public final z f76990a;

    /* renamed from: b, reason: collision with root package name */
    public final qj.a f76991b;

    /* renamed from: c, reason: collision with root package name */
    public final g1 f76992c;

    /* renamed from: d, reason: collision with root package name */
    public final e1 f76993d;

    /* renamed from: e, reason: collision with root package name */
    public final rj.v f76994e;

    /* renamed from: f, reason: collision with root package name */
    public final n0 f76995f;

    /* renamed from: g, reason: collision with root package name */
    public final j f76996g;

    /* renamed from: h, reason: collision with root package name */
    public final rj.o f76997h;

    /* renamed from: i, reason: collision with root package name */
    public final String f76998i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f76999j = false;

    public q(z zVar, qj.a aVar, g1 g1Var, e1 e1Var, rj.v vVar, n0 n0Var, j jVar, rj.o oVar, String str) {
        this.f76990a = zVar;
        this.f76991b = aVar;
        this.f76992c = g1Var;
        this.f76993d = e1Var;
        this.f76994e = vVar;
        this.f76995f = n0Var;
        this.f76996g = jVar;
        this.f76997h = oVar;
        this.f76998i = str;
    }

    public static Task c(mt.s sVar, mt.m0 m0Var) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        sVar.doOnSuccess(new bj.v0(taskCompletionSource, 1)).switchIfEmpty(mt.s.fromCallable(new com.vungle.ads.internal.session.a(taskCompletionSource, 5))).onErrorResumeNext(new n(taskCompletionSource, 0)).subscribeOn(m0Var).subscribe();
        return taskCompletionSource.getTask();
    }

    public final void a(String str) {
        if (this.f76997h.getCampaignMetadata().getIsTestMessage()) {
            j0.logd("Not recording: " + str + ". Reason: Message is test message");
            return;
        }
        if (this.f76996g.isAutomaticDataCollectionEnabled()) {
            j0.logd("Not recording: ".concat(str));
            return;
        }
        j0.logd("Not recording: " + str + ". Reason: Data collection is disabled");
    }

    public final mt.c b() {
        String campaignId = this.f76997h.getCampaignMetadata().getCampaignId();
        j0.logd("Attempting to record message impression in impression store for id: " + campaignId);
        mt.c cVarDoOnComplete = this.f76990a.storeImpression((CampaignImpression) CampaignImpression.newBuilder().setImpressionTimestampMillis(this.f76991b.now()).setCampaignId(campaignId).build()).doOnError(new ca.b(1)).doOnComplete(new p(0));
        return g0.isAppForegroundEvent(this.f76998i) ? this.f76993d.increment(this.f76994e).doOnError(new ca.b(2)).doOnComplete(new p(1)).onErrorComplete().andThen(cVarDoOnComplete) : cVarDoOnComplete;
    }

    @Override // bj.b1
    public Task<Void> displayErrorEncountered(bj.a1 a1Var) {
        if (!this.f76996g.isAutomaticDataCollectionEnabled()) {
            a("render error to metrics logger");
            return new TaskCompletionSource().getTask();
        }
        j0.logd("Attempting to record: render error to metrics logger");
        int i10 = 1;
        return c(b().andThen(mt.c.fromAction(new f(i10, this, a1Var))).andThen(mt.c.fromAction(new o(this, i10))).toMaybe(), this.f76992c.io());
    }

    @Override // bj.b1
    public Task<Void> impressionDetected() {
        if (!this.f76996g.isAutomaticDataCollectionEnabled() || this.f76999j) {
            a("message impression to metrics logger");
            return new TaskCompletionSource().getTask();
        }
        j0.logd("Attempting to record: message impression to metrics logger");
        return c(b().andThen(mt.c.fromAction(new o(this, 0))).andThen(mt.c.fromAction(new o(this, 1))).toMaybe(), this.f76992c.io());
    }

    @Deprecated
    public Task<Void> messageClicked() {
        return messageClicked(this.f76997h.getAction());
    }

    @Override // bj.b1
    public Task<Void> messageDismissed(bj.z0 z0Var) {
        if (!this.f76996g.isAutomaticDataCollectionEnabled()) {
            a("message dismissal to metrics logger");
            return new TaskCompletionSource().getTask();
        }
        j0.logd("Attempting to record: message dismissal to metrics logger");
        mt.c cVarFromAction = mt.c.fromAction(new f(2, this, z0Var));
        if (!this.f76999j) {
            impressionDetected();
        }
        return c(cVarFromAction.toMaybe(), this.f76992c.io());
    }

    @Override // bj.b1
    public Task<Void> messageClicked(rj.b bVar) {
        if (!this.f76996g.isAutomaticDataCollectionEnabled()) {
            a("message click to metrics logger");
            return new TaskCompletionSource().getTask();
        }
        if (bVar.getActionUrl() == null) {
            return messageDismissed(bj.z0.f9691e);
        }
        j0.logd("Attempting to record: message click to metrics logger");
        mt.c cVarFromAction = mt.c.fromAction(new f(3, this, bVar));
        if (!this.f76999j) {
            impressionDetected();
        }
        return c(cVarFromAction.toMaybe(), this.f76992c.io());
    }
}
