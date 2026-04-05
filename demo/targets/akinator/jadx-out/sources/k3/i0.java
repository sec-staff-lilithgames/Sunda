package k3;

import android.app.PendingIntent;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class i0 {

    /* renamed from: a, reason: collision with root package name */
    public PendingIntent f70186a;

    /* renamed from: b, reason: collision with root package name */
    public IconCompat f70187b;

    /* renamed from: c, reason: collision with root package name */
    public int f70188c;

    /* renamed from: d, reason: collision with root package name */
    public int f70189d;

    /* renamed from: e, reason: collision with root package name */
    public int f70190e;

    /* renamed from: f, reason: collision with root package name */
    public PendingIntent f70191f;

    /* renamed from: g, reason: collision with root package name */
    public final String f70192g;

    @Deprecated
    public i0() {
    }

    public j0 build() {
        String str = this.f70192g;
        if (str == null && this.f70186a == null) {
            throw new NullPointerException("Must supply pending intent or shortcut to bubble");
        }
        if (str == null && this.f70187b == null) {
            throw new NullPointerException("Must supply an icon or shortcut for the bubble");
        }
        PendingIntent pendingIntent = this.f70186a;
        PendingIntent pendingIntent2 = this.f70191f;
        IconCompat iconCompat = this.f70187b;
        int i10 = this.f70188c;
        int i11 = this.f70189d;
        int i12 = this.f70190e;
        j0 j0Var = new j0();
        j0Var.f70196a = pendingIntent;
        j0Var.f70198c = iconCompat;
        j0Var.f70199d = i10;
        j0Var.f70200e = i11;
        j0Var.f70197b = pendingIntent2;
        j0Var.f70201f = i12;
        j0Var.f70202g = str;
        j0Var.setFlags(i12);
        return j0Var;
    }

    public i0 setAutoExpandBubble(boolean z10) {
        if (z10) {
            this.f70190e |= 1;
            return this;
        }
        this.f70190e &= -2;
        return this;
    }

    public i0 setDeleteIntent(PendingIntent pendingIntent) {
        this.f70191f = pendingIntent;
        return this;
    }

    public i0 setDesiredHeight(int i10) {
        this.f70188c = Math.max(i10, 0);
        this.f70189d = 0;
        return this;
    }

    public i0 setDesiredHeightResId(int i10) {
        this.f70189d = i10;
        this.f70188c = 0;
        return this;
    }

    public i0 setIcon(IconCompat iconCompat) {
        if (this.f70192g != null) {
            throw new IllegalStateException("Created as a shortcut bubble, cannot set an Icon. Consider using BubbleMetadata.Builder(PendingIntent,Icon) instead.");
        }
        if (iconCompat == null) {
            throw new NullPointerException("Bubbles require non-null icon");
        }
        this.f70187b = iconCompat;
        return this;
    }

    public i0 setIntent(PendingIntent pendingIntent) {
        if (this.f70192g != null) {
            throw new IllegalStateException("Created as a shortcut bubble, cannot set a PendingIntent. Consider using BubbleMetadata.Builder(PendingIntent,Icon) instead.");
        }
        if (pendingIntent == null) {
            throw new NullPointerException("Bubble requires non-null pending intent");
        }
        this.f70186a = pendingIntent;
        return this;
    }

    public i0 setSuppressNotification(boolean z10) {
        if (z10) {
            this.f70190e |= 2;
            return this;
        }
        this.f70190e &= -3;
        return this;
    }

    public i0(String str) {
        if (TextUtils.isEmpty(str)) {
            throw new NullPointerException("Bubble requires a non-null shortcut id");
        }
        this.f70192g = str;
    }

    public i0(PendingIntent pendingIntent, IconCompat iconCompat) {
        if (pendingIntent == null) {
            throw new NullPointerException("Bubble requires non-null pending intent");
        }
        if (iconCompat != null) {
            this.f70186a = pendingIntent;
            this.f70187b = iconCompat;
            return;
        }
        throw new NullPointerException("Bubbles require non-null icon");
    }
}
