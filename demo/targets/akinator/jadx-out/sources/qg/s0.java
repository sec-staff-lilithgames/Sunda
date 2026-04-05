package qg;

import android.view.View;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public class s0 {

    /* renamed from: a, reason: collision with root package name */
    public int f83232a;

    /* renamed from: b, reason: collision with root package name */
    public final int f83233b;

    /* renamed from: c, reason: collision with root package name */
    public int f83234c;

    /* renamed from: d, reason: collision with root package name */
    public int f83235d;

    public s0(int i10, int i11, int i12, int i13) {
        this.f83232a = i10;
        this.f83233b = i11;
        this.f83234c = i12;
        this.f83235d = i13;
    }

    public void applyToView(View view) {
        view.setPaddingRelative(this.f83232a, this.f83233b, this.f83234c, this.f83235d);
    }

    public s0(s0 s0Var) {
        this.f83232a = s0Var.f83232a;
        this.f83233b = s0Var.f83233b;
        this.f83234c = s0Var.f83234c;
        this.f83235d = s0Var.f83235d;
    }
}
