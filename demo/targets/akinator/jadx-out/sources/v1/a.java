package v1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public float f88844a;

    /* renamed from: b, reason: collision with root package name */
    public long f88845b = Long.MAX_VALUE;

    /* renamed from: c, reason: collision with root package name */
    public float f88846c = Float.NaN;

    /* renamed from: d, reason: collision with root package name */
    public boolean f88847d = true;

    public final void addPosition(long j10, float f10) {
        if (this.f88845b == Long.MAX_VALUE || Float.isNaN(this.f88846c)) {
            this.f88845b = j10;
            this.f88846c = f10;
            return;
        }
        if (j10 == this.f88845b) {
            this.f88846c = f10;
            return;
        }
        float fAccess$kineticEnergyToVelocity = g.access$kineticEnergyToVelocity(this.f88844a);
        float f11 = (f10 - this.f88846c) / ((j10 - this.f88845b) * 0.001f);
        float fAbs = (Math.abs(f11) * (f11 - fAccess$kineticEnergyToVelocity)) + this.f88844a;
        this.f88844a = fAbs;
        if (this.f88847d) {
            this.f88844a = fAbs * 0.5f;
            this.f88847d = false;
        }
        this.f88845b = j10;
        this.f88846c = f10;
    }

    public final float getVelocity() {
        return g.access$kineticEnergyToVelocity(this.f88844a);
    }

    public final void reset() {
        this.f88844a = 0.0f;
        this.f88845b = Long.MAX_VALUE;
        this.f88846c = Float.NaN;
        this.f88847d = true;
    }
}
