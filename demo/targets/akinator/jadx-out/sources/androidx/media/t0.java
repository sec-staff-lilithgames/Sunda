package androidx.media;

import android.media.VolumeProvider;
import android.os.Build;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class t0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f6865a;

    /* renamed from: b, reason: collision with root package name */
    public final int f6866b;

    /* renamed from: c, reason: collision with root package name */
    public final String f6867c;

    /* renamed from: d, reason: collision with root package name */
    public int f6868d;

    /* renamed from: e, reason: collision with root package name */
    public a f6869e;

    /* renamed from: f, reason: collision with root package name */
    public VolumeProvider f6870f;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static abstract class a {
        public abstract void onVolumeChanged(t0 t0Var);
    }

    public t0(int i10, int i11, int i12) {
        this(i10, i11, i12, null);
    }

    public final int getCurrentVolume() {
        return this.f6868d;
    }

    public final int getMaxVolume() {
        return this.f6866b;
    }

    public final int getVolumeControl() {
        return this.f6865a;
    }

    public final String getVolumeControlId() {
        return this.f6867c;
    }

    public Object getVolumeProvider() {
        t0 t0Var;
        if (this.f6870f != null) {
            t0Var = this;
        } else if (Build.VERSION.SDK_INT >= 30) {
            t0Var = this;
            t0Var.f6870f = new q0(t0Var, this.f6865a, this.f6866b, this.f6868d, this.f6867c);
        } else {
            t0Var = this;
            t0Var.f6870f = new r0(this, t0Var.f6865a, t0Var.f6866b, t0Var.f6868d);
        }
        return t0Var.f6870f;
    }

    public void setCallback(a aVar) {
        this.f6869e = aVar;
    }

    public final void setCurrentVolume(int i10) {
        this.f6868d = i10;
        s0.a((VolumeProvider) getVolumeProvider(), i10);
        a aVar = this.f6869e;
        if (aVar != null) {
            aVar.onVolumeChanged(this);
        }
    }

    public t0(int i10, int i11, int i12, String str) {
        this.f6865a = i10;
        this.f6866b = i11;
        this.f6868d = i12;
        this.f6867c = str;
    }

    public void onAdjustVolume(int i10) {
    }

    public void onSetVolumeTo(int i10) {
    }
}
