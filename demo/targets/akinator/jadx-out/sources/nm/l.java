package nm;

import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public class l {

    /* renamed from: a, reason: collision with root package name */
    public long f77057a = TimeUnit.SECONDS.toMillis(1);

    /* renamed from: b, reason: collision with root package name */
    public float f77058b = 1.0f;

    /* renamed from: c, reason: collision with root package name */
    public boolean f77059c = false;

    /* renamed from: d, reason: collision with root package name */
    public boolean f77060d = false;

    public float getPixelThreshold() {
        return this.f77058b;
    }

    public long getTimeThresholdMs() {
        return this.f77057a;
    }

    public boolean isIgnoreOverlap() {
        return this.f77060d;
    }

    public boolean isIgnoreWindowFocus() {
        return this.f77059c;
    }

    public void setIgnoreOverlap(boolean z10) {
        this.f77060d = z10;
    }

    public void setIgnoreWindowFocus(boolean z10) {
        this.f77059c = z10;
    }

    public void setPixelThreshold(float f10) {
        this.f77058b = f10;
    }

    public void setTimeThresholdMs(long j10) {
        this.f77057a = j10;
    }

    public void setTimeThresholdSec(long j10) {
        setTimeThresholdMs(TimeUnit.SECONDS.toMillis(j10));
    }
}
