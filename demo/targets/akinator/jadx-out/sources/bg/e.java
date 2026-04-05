package bg;

import com.google.android.material.button.MaterialButton;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class e implements c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f f9497a;

    public e(f fVar) {
        this.f9497a = fVar;
    }

    @Override // bg.c
    public void onPressedChanged(MaterialButton materialButton, boolean z10) {
        this.f9497a.invalidate();
    }
}
