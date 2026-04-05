package k3;

import android.app.ActivityOptions;
import android.app.PendingIntent;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class g extends h {

    /* renamed from: a, reason: collision with root package name */
    public final ActivityOptions f70176a;

    public g(ActivityOptions activityOptions) {
        this.f70176a = activityOptions;
    }

    @Override // k3.h
    public Rect getLaunchBounds() {
        return this.f70176a.getLaunchBounds();
    }

    @Override // k3.h
    public int getLaunchDisplayId() {
        if (Build.VERSION.SDK_INT >= 26) {
            return this.f70176a.getLaunchDisplayId();
        }
        return -1;
    }

    @Override // k3.h
    public void requestUsageTimeReport(PendingIntent pendingIntent) {
        this.f70176a.requestUsageTimeReport(pendingIntent);
    }

    @Override // k3.h
    public h setLaunchBounds(Rect rect) {
        return new g(this.f70176a.setLaunchBounds(rect));
    }

    @Override // k3.h
    public h setLaunchDisplayId(int i10) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f70176a.setLaunchDisplayId(i10);
        }
        return this;
    }

    @Override // k3.h
    public h setPendingIntentBackgroundActivityStartMode(int i10) {
        int i11 = Build.VERSION.SDK_INT;
        ActivityOptions activityOptions = this.f70176a;
        if (i11 >= 34) {
            activityOptions.setPendingIntentBackgroundActivityStartMode(i10);
            return this;
        }
        if (i11 >= 33) {
            activityOptions.setPendingIntentBackgroundActivityLaunchAllowed(i10 != 2);
        }
        return this;
    }

    @Override // k3.h
    public h setShareIdentityEnabled(boolean z10) {
        return Build.VERSION.SDK_INT < 34 ? this : new g(this.f70176a.setShareIdentityEnabled(z10));
    }

    @Override // k3.h
    public Bundle toBundle() {
        return this.f70176a.toBundle();
    }

    @Override // k3.h
    public void update(h hVar) {
        if (hVar instanceof g) {
            this.f70176a.update(((g) hVar).f70176a);
        }
    }
}
