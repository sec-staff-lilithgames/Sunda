package e6;

import java.util.Arrays;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class x0 {

    /* renamed from: a, reason: collision with root package name */
    public long[] f53893a;

    /* renamed from: b, reason: collision with root package name */
    public float[] f53894b;

    /* renamed from: c, reason: collision with root package name */
    public int f53895c;

    public void addDataPoint(long j10, float f10) {
        int i10 = (this.f53895c + 1) % 20;
        this.f53895c = i10;
        this.f53893a[i10] = j10;
        this.f53894b[i10] = f10;
    }

    public void resetTracking() {
        this.f53895c = 0;
        Arrays.fill(this.f53893a, Long.MIN_VALUE);
        Arrays.fill(this.f53894b, 0.0f);
    }
}
