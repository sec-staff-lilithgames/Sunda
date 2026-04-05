package a2;

import android.os.Bundle;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class g3 implements v5.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a1.h f3590a;

    public g3(a1.h hVar) {
        this.f3590a = hVar;
    }

    @Override // v5.g
    public final Bundle saveState() {
        return i3.access$toBundle(this.f3590a.performSave());
    }
}
