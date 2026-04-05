package ja;

import android.os.AsyncTask;
import android.os.SystemClock;
import android.view.View;
import androidx.core.app.JobIntentService;
import com.digidust.elokence.akinator.graphic.vote.SwipeDeck;
import k3.t;
import k3.v;
import o9.ba;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class d extends AsyncTask {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f69206a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f69207b;

    public /* synthetic */ d(Object obj, int i10) {
        this.f69206a = i10;
        this.f69207b = obj;
    }

    @Override // android.os.AsyncTask
    public final Object doInBackground(Object[] objArr) {
        t tVarDequeueWork;
        switch (this.f69206a) {
            case 0:
                SystemClock.sleep(((SwipeDeck) this.f69207b).f21814s);
                return ((View[]) objArr)[0];
            default:
                while (true) {
                    JobIntentService jobIntentService = (JobIntentService) this.f69207b;
                    v vVar = jobIntentService.f5627b;
                    if (vVar != null) {
                        tVarDequeueWork = vVar.dequeueWork();
                    } else {
                        synchronized (jobIntentService.f5633i) {
                            try {
                                tVarDequeueWork = jobIntentService.f5633i.size() > 0 ? (t) jobIntentService.f5633i.remove(0) : null;
                            } finally {
                            }
                        }
                    }
                    if (tVarDequeueWork == null) {
                        return null;
                    }
                    JobIntentService jobIntentService2 = (JobIntentService) this.f69207b;
                    tVarDequeueWork.getIntent();
                    jobIntentService2.c();
                    tVarDequeueWork.complete();
                }
        }
    }

    @Override // android.os.AsyncTask
    public void onCancelled(Object obj) {
        switch (this.f69206a) {
            case 1:
                ((JobIntentService) this.f69207b).d();
                break;
            default:
                super.onCancelled(obj);
                break;
        }
    }

    @Override // android.os.AsyncTask
    public final void onPostExecute(Object obj) {
        e eVar;
        switch (this.f69206a) {
            case 0:
                View view = (View) obj;
                super.onPostExecute(view);
                SwipeDeck swipeDeck = (SwipeDeck) this.f69207b;
                swipeDeck.removeView(view);
                if (swipeDeck.getChildCount() <= 0 && (eVar = swipeDeck.f21806k) != null) {
                    ((ba) eVar).cardsDepleted();
                    break;
                }
                break;
            default:
                ((JobIntentService) this.f69207b).d();
                break;
        }
    }
}
