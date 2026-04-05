package a2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class t5 implements s5 {

    /* renamed from: a, reason: collision with root package name */
    public final p0.j2 f3851a = p0.o5.mutableStateOf$default(Boolean.FALSE, null, 2, null);

    @Override // a2.s5
    public boolean isWindowFocused() {
        return ((Boolean) this.f3851a.getValue()).booleanValue();
    }

    public void setWindowFocused(boolean z10) {
        this.f3851a.setValue(Boolean.valueOf(z10));
    }
}
