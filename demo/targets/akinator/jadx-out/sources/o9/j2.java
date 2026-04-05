package o9;

import android.content.Intent;
import android.os.SystemClock;
import android.view.View;
import com.digidust.elokence.akinator.activities.HomeActivity;
import com.digidust.elokence.akinator.activities.PostHomeSliderActivity;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class j2 implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public long f78256b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ HomeActivity f78257c;

    public j2(HomeActivity homeActivity) {
        this.f78257c = homeActivity;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (SystemClock.elapsedRealtime() - this.f78256b < 1000) {
            return;
        }
        this.f78256b = SystemClock.elapsedRealtime();
        boolean zIsFirstHomeCreate = ca.m.sharedInstance().isFirstHomeCreate();
        HomeActivity homeActivity = this.f78257c;
        if (zIsFirstHomeCreate) {
            ca.m.sharedInstance().notFirstHomeCreateAnymore();
            lb.s0.f72971j.sharedInstance().saveSettings();
            homeActivity.u(true);
        } else {
            ca.o.sharedInstance().setAkinatorStatus(0);
            homeActivity.disableAdOneTime();
            homeActivity.startActivity(new Intent(homeActivity, (Class<?>) PostHomeSliderActivity.class));
        }
    }
}
