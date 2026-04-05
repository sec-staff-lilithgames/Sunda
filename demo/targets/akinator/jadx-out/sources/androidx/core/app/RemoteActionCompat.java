package androidx.core.app;

import android.app.PendingIntent;
import android.app.RemoteAction;
import android.os.Build;
import androidx.appcompat.app.j0;
import androidx.core.graphics.drawable.IconCompat;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class RemoteActionCompat implements g6.i {

    /* renamed from: a, reason: collision with root package name */
    public IconCompat f5728a;

    /* renamed from: b, reason: collision with root package name */
    public CharSequence f5729b;

    /* renamed from: c, reason: collision with root package name */
    public CharSequence f5730c;

    /* renamed from: d, reason: collision with root package name */
    public PendingIntent f5731d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f5732e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f5733f;

    public RemoteActionCompat(IconCompat iconCompat, CharSequence charSequence, CharSequence charSequence2, PendingIntent pendingIntent) {
        this.f5728a = (IconCompat) w3.i.checkNotNull(iconCompat);
        this.f5729b = (CharSequence) w3.i.checkNotNull(charSequence);
        this.f5730c = (CharSequence) w3.i.checkNotNull(charSequence2);
        this.f5731d = (PendingIntent) w3.i.checkNotNull(pendingIntent);
        this.f5732e = true;
        this.f5733f = true;
    }

    public static RemoteActionCompat createFromRemoteAction(RemoteAction remoteAction) {
        w3.i.checkNotNull(remoteAction);
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat(IconCompat.createFromIcon(j0.L(remoteAction)), j0.f0(remoteAction), j0.F(remoteAction), j0.t(remoteAction));
        remoteActionCompat.setEnabled(j0.j0(remoteAction));
        if (Build.VERSION.SDK_INT >= 28) {
            remoteActionCompat.setShouldShowIcon(e4.q.D(remoteAction));
        }
        return remoteActionCompat;
    }

    public PendingIntent getActionIntent() {
        return this.f5731d;
    }

    public CharSequence getContentDescription() {
        return this.f5730c;
    }

    public IconCompat getIcon() {
        return this.f5728a;
    }

    public CharSequence getTitle() {
        return this.f5729b;
    }

    public boolean isEnabled() {
        return this.f5732e;
    }

    public void setEnabled(boolean z10) {
        this.f5732e = z10;
    }

    public void setShouldShowIcon(boolean z10) {
        this.f5733f = z10;
    }

    public boolean shouldShowIcon() {
        return this.f5733f;
    }

    public RemoteAction toRemoteAction() {
        RemoteAction remoteActionM = j0.m(this.f5728a.toIcon(), this.f5729b, this.f5730c, this.f5731d);
        j0.w0(remoteActionM, isEnabled());
        if (Build.VERSION.SDK_INT >= 28) {
            e4.q.C(remoteActionM, shouldShowIcon());
        }
        return remoteActionM;
    }

    public RemoteActionCompat() {
    }

    public RemoteActionCompat(RemoteActionCompat remoteActionCompat) {
        w3.i.checkNotNull(remoteActionCompat);
        this.f5728a = remoteActionCompat.f5728a;
        this.f5729b = remoteActionCompat.f5729b;
        this.f5730c = remoteActionCompat.f5730c;
        this.f5731d = remoteActionCompat.f5731d;
        this.f5732e = remoteActionCompat.f5732e;
        this.f5733f = remoteActionCompat.f5733f;
    }
}
