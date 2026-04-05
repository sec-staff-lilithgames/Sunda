package nj;

import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.inappmessaging.internal.RateLimitProto$RateLimit;
import com.google.internal.firebase.inappmessaging.v1.CampaignProto$ThickContent;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final /* synthetic */ class n implements st.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f76975b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f76976c;

    public /* synthetic */ n(Object obj, int i10) {
        this.f76975b = i10;
        this.f76976c = obj;
    }

    @Override // st.o
    public final Object apply(Object obj) {
        switch (this.f76975b) {
            case 0:
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.f76976c;
                Throwable th2 = (Throwable) obj;
                if (th2 instanceof Exception) {
                    taskCompletionSource.setException((Exception) th2);
                } else {
                    taskCompletionSource.setException(new RuntimeException(th2));
                }
                return mt.s.empty();
            case 1:
                return (CampaignProto$ThickContent) this.f76976c;
            default:
                e1 e1Var = (e1) this.f76976c;
                RateLimitProto$RateLimit rateLimitProto$RateLimit = (RateLimitProto$RateLimit) obj;
                return e1Var.f76885a.write(rateLimitProto$RateLimit).doOnComplete(new f(4, e1Var, rateLimitProto$RateLimit));
        }
    }
}
