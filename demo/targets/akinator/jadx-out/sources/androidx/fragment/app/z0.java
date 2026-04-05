package androidx.fragment.app;

import android.util.Log;
import androidx.fragment.app.FragmentManager;
import java.util.ArrayList;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class z0 implements i.b {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FragmentManager f6501b;

    public z0(FragmentManager fragmentManager) {
        this.f6501b = fragmentManager;
    }

    @Override // i.b
    public void onActivityResult(Map<String, Boolean> map) {
        String[] strArr = (String[]) map.keySet().toArray(new String[0]);
        ArrayList arrayList = new ArrayList(map.values());
        int[] iArr = new int[arrayList.size()];
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            iArr[i10] = ((Boolean) arrayList.get(i10)).booleanValue() ? 0 : -1;
        }
        FragmentManager fragmentManager = this.f6501b;
        FragmentManager.LaunchedFragmentInfo launchedFragmentInfo = (FragmentManager.LaunchedFragmentInfo) fragmentManager.F.pollFirst();
        if (launchedFragmentInfo == null) {
            Log.w("FragmentManager", "No permissions were requested for " + this);
            return;
        }
        String str = launchedFragmentInfo.f6246b;
        int i11 = launchedFragmentInfo.f6247c;
        Fragment fragmentC = fragmentManager.f6222c.c(str);
        if (fragmentC != null) {
            fragmentC.onRequestPermissionsResult(i11, strArr, iArr);
            return;
        }
        Log.w("FragmentManager", "Permission request result delivered for unknown Fragment " + str);
    }
}
