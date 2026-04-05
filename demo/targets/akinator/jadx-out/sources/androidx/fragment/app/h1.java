package androidx.fragment.app;

import android.util.Log;
import androidx.activity.result.ActivityResult;
import androidx.fragment.app.FragmentManager;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class h1 implements i.b {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FragmentManager f6359b;

    public h1(FragmentManager fragmentManager) {
        this.f6359b = fragmentManager;
    }

    @Override // i.b
    public void onActivityResult(ActivityResult activityResult) {
        FragmentManager fragmentManager = this.f6359b;
        FragmentManager.LaunchedFragmentInfo launchedFragmentInfo = (FragmentManager.LaunchedFragmentInfo) fragmentManager.F.pollFirst();
        if (launchedFragmentInfo == null) {
            Log.w("FragmentManager", "No Activities were started for result for " + this);
            return;
        }
        String str = launchedFragmentInfo.f6246b;
        int i10 = launchedFragmentInfo.f6247c;
        Fragment fragmentC = fragmentManager.f6222c.c(str);
        if (fragmentC != null) {
            fragmentC.onActivityResult(i10, activityResult.getResultCode(), activityResult.getData());
            return;
        }
        Log.w("FragmentManager", "Activity result delivered for unknown Fragment " + str);
    }
}
