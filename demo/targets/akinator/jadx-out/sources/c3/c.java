package c3;

import a3.g;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.firebase.inappmessaging.CommonTypesProto$TriggeringCondition;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.k0;
import com.google.firebase.messaging.n0;
import com.google.gson.r;
import com.google.internal.firebase.inappmessaging.v1.CampaignProto$ThickContent;
import java.util.Iterator;
import kotlin.jvm.internal.e0;
import mh.k2;
import mh.q2;
import mh.r2;
import mk.u;
import nj.g0;
import nj.j0;
import st.q;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final /* synthetic */ class c implements b, SuccessContinuation, rr.b, q2, u, q {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f11748b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f11749c;

    public /* synthetic */ c(String str, int i10) {
        this.f11748b = i10;
        this.f11749c = str;
    }

    @Override // mk.u
    public Object construct() {
        switch (this.f11748b) {
            case 11:
                throw new r(this.f11749c);
            case 12:
                throw new r(this.f11749c);
            case 13:
                throw new r(this.f11749c);
            case 14:
                throw new r(this.f11749c);
            case 15:
                throw new r(this.f11749c);
            default:
                throw new r(this.f11749c);
        }
    }

    @Override // rr.b
    public Object get() {
        switch (this.f11748b) {
            case 3:
                return a.b.k("Show wasn't tracked: view visibility verification failed - ", this.f11749c);
            case 4:
                return a.b.k("Show wasn't tracked: view transparent verification failed - ", this.f11749c);
            case 5:
                return a.b.k("Show wasn't tracked: window focus verification failed - ", this.f11749c);
            case 6:
                return a.b.k("Show wasn't tracked: view size verification failed - ", this.f11749c);
            case 7:
                return a.b.k("Show wasn't tracked: global visibility verification failed - ", this.f11749c);
            case 8:
                return a.b.k("Show wasn't tracked: content or root layout not found - ", this.f11749c);
            case 9:
                return a.b.k("Show wasn't tracked: ad view is out of current window - ", this.f11749c);
            case 18:
                String type = this.f11749c;
                e0.checkNotNullParameter(type, "$type");
                return "Incorrect gradient type parameter - " + type;
            default:
                String direction = this.f11749c;
                e0.checkNotNullParameter(direction, "$direction");
                return "Incorrect gradient direction parameter - " + direction;
        }
    }

    @Override // c3.b
    public float getInterpolation(float f10) {
        return (float) g.getInterpolator(this.f11749c).get(f10);
    }

    @Override // mh.q2
    public Iterator iterator(r2 r2Var, CharSequence charSequence) {
        return new k2(r2Var, charSequence, this.f11749c);
    }

    @Override // st.q
    public boolean test(Object obj) {
        CampaignProto$ThickContent campaignProto$ThickContent = (CampaignProto$ThickContent) obj;
        String str = this.f11749c;
        if (g0.isAppForegroundEvent(str) && campaignProto$ThickContent.getIsTestCampaign()) {
            return true;
        }
        for (CommonTypesProto$TriggeringCondition commonTypesProto$TriggeringCondition : campaignProto$ThickContent.getTriggeringConditionsList()) {
            if (commonTypesProto$TriggeringCondition.getFiamTrigger().toString().equals(str) || commonTypesProto$TriggeringCondition.getEvent().getName().equals(str)) {
                j0.logd("The event " + str + " is contained in the list of triggers");
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public Task then(Object obj) {
        int i10 = this.f11748b;
        String str = this.f11749c;
        n0 n0Var = (n0) obj;
        switch (i10) {
            case 1:
                com.google.firebase.messaging.j0 j0Var = FirebaseMessaging.f29723l;
                n0Var.getClass();
                Task taskD = n0Var.d(k0.subscribe(str));
                n0Var.f();
                return taskD;
            default:
                com.google.firebase.messaging.j0 j0Var2 = FirebaseMessaging.f29723l;
                n0Var.getClass();
                Task taskD2 = n0Var.d(k0.unsubscribe(str));
                n0Var.f();
                return taskD2;
        }
    }
}
