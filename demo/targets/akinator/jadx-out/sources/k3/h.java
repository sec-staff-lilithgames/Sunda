package k3;

import android.app.Activity;
import android.app.ActivityOptions;
import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.Bundle;
import android.util.Pair;
import android.view.View;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class h {
    public static h makeBasic() {
        return new g(ActivityOptions.makeBasic());
    }

    public static h makeClipRevealAnimation(View view, int i10, int i11, int i12, int i13) {
        return new g(ActivityOptions.makeClipRevealAnimation(view, i10, i11, i12, i13));
    }

    public static h makeCustomAnimation(Context context, int i10, int i11) {
        return new g(ActivityOptions.makeCustomAnimation(context, i10, i11));
    }

    public static h makeScaleUpAnimation(View view, int i10, int i11, int i12, int i13) {
        return new g(ActivityOptions.makeScaleUpAnimation(view, i10, i11, i12, i13));
    }

    public static h makeSceneTransitionAnimation(Activity activity, View view, String str) {
        return new g(ActivityOptions.makeSceneTransitionAnimation(activity, view, str));
    }

    public static h makeTaskLaunchBehind() {
        return new g(ActivityOptions.makeTaskLaunchBehind());
    }

    public static h makeThumbnailScaleUpAnimation(View view, Bitmap bitmap, int i10, int i11) {
        return new g(ActivityOptions.makeThumbnailScaleUpAnimation(view, bitmap, i10, i11));
    }

    public Rect getLaunchBounds() {
        return null;
    }

    public int getLaunchDisplayId() {
        return -1;
    }

    public Bundle toBundle() {
        return null;
    }

    public static h makeSceneTransitionAnimation(Activity activity, w3.e... eVarArr) {
        Pair[] pairArr;
        if (eVarArr != null) {
            pairArr = new Pair[eVarArr.length];
            for (int i10 = 0; i10 < eVarArr.length; i10++) {
                w3.e eVar = eVarArr[i10];
                pairArr[i10] = Pair.create((View) eVar.f90368a, (String) eVar.f90369b);
            }
        } else {
            pairArr = null;
        }
        return new g(ActivityOptions.makeSceneTransitionAnimation(activity, pairArr));
    }

    public void requestUsageTimeReport(PendingIntent pendingIntent) {
    }

    public h setLaunchBounds(Rect rect) {
        return this;
    }

    public h setLaunchDisplayId(int i10) {
        return this;
    }

    public h setPendingIntentBackgroundActivityStartMode(int i10) {
        return this;
    }

    public h setShareIdentityEnabled(boolean z10) {
        return this;
    }

    public void update(h hVar) {
    }
}
